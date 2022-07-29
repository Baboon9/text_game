import java.util.Scanner;

class TextGame {
	
    private Scanner in = new Scanner(System.in);  
    GameStateBuilder builder = new GameStateBuilder();
    
	enum GameState{
		main_menu,
		running_game
	}
	
	private GameState state = GameState.main_menu;
	
	public static void main(String[] args) {
		TextGame game = new TextGame();
		game.run();
	}
	
	private void output() {
		switch(state) {
		case main_menu: System.out.println("Welcome to my Text Game.");
						System.out.println("Your are now in Main Menu, select action:");
						System.out.println("a: Start new game.");
						System.out.println("b: quit.");
						break;
		case running_game: System.out.println("Game started..");
		}
	}
	
	private void input() {
			String input = in.next();
			switch(input) {
			case "a": state = GameState.running_game; break;
			case "b": System.exit(0); break;
			default: break;
			
			}
		
	}
	
	public void run() {
		while(true) {
			output();
			input();
		}
		
	}
}