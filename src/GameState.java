public class GameState {
	public String text;
	public StateNode[] options;
	public String name;
	
	GameState(String name, String text, StateNode[] options){
		this.name = name;
		this.options = options;
		this.text = text;
	}
	
}
