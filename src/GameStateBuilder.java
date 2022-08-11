


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class GameStateBuilder {
	LinkedList<GameState> states = new LinkedList<GameState>();
	LinkedList<StateNode> nodes = new LinkedList<StateNode>();



	GameStateBuilder(){
		File f = new File("assets/GameStates.txt");
		Scanner in = null;
		try {
			in = new Scanner(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		while(in.hasNext()) {
		   processLine(in.nextLine());
		}
		in.close();
		System.out.println(allStates);
	}
	enum BuilderState{
		Name,
		Text,
		Options,
		End,
		Start
	}
	
	private BuilderState state;
	GameState stateObj;
	LinkedList<GameState> allStates = new LinkedList<GameState>();
	
	void processLine(String line) {
		switch(line) {
		case "Name:":
			state = BuilderState.Name;
			break;
		case "Text:":
			state = BuilderState.Text;
			break;
		case "Options:":
			state = BuilderState.Options;
			break;
		case "End":
			state = BuilderState.End;
			allStates.add(stateObj);
			break;
		case "Start":
			state = BuilderState.Start;
			stateObj = new GameState();
			break;
		default:
			switch (state) {
			case Name:
				stateObj.name = line;
				break;
			case Text:
				stateObj.text += line + "\n";
				break;
			case Options:
				stateObj.options.add(new StateNode(line.split("->")[0], line.split("->")[1]));
				break;
			}
			break;
		}
	}
}
