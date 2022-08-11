import java.util.LinkedList;

public class GameState {
	public String text = "";
	public LinkedList<StateNode> options = new LinkedList<StateNode>();
	public String name;
	
	GameState(String name, String text, LinkedList<StateNode> options){
		this.name = name;
		this.options = options;
		this.text = text;
	}
	
	GameState(){
		
	}
	
}
