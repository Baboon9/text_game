


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
		    sb.append(in.next());
		}
		in.close();
		String outString;
		outString = sb.toString();
		
	}

}
