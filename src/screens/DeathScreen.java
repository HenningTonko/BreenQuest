package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class DeathScreen extends BasicGameState {

	public DeathScreen(int deathScreen) {
	}

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		Input input = arg0.getInput();
		
		if (input.isKeyPressed(input.ANY_CONTROLLER))
			System.exit(0);
	}

	@Override
	public int getID() {
		return 10;
	}
}
