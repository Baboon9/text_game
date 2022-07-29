

public class StateNode {
	public String text;
	public GameState nextState;
	
	StateNode(String text, GameState nextState){
		this.text = text;
		this.nextState = nextState;
	}
}
