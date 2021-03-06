package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import entities.Player;

public class InventoryScreen extends BasicGameState {
	
	private Player player;
	private Image background;

	public InventoryScreen(int invscreen) {
		player = WorldMap.getPlayer();
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		background = new Image("res/invscreen.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		background.draw(0, 0);
		if (player.isScepter())
			g.drawString("Scepter", 20, 20);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int d) throws SlickException {
		Input input = gc.getInput();
		
		if (input.isKeyPressed(input.KEY_I)) {
			switch(player.getLastScreen()) {
				case "east":
					sbg.enterState(4);
					break;
				case "south":
					sbg.enterState(5);
					break;
				case "north":
					sbg.enterState(3);
					break;
				case "west":
					sbg.enterState(2);
					break;
				case "hub":
					sbg.enterState(1);
					break;
				case "dungeon1":
					sbg.enterState(6);
					break;
				case "dungeon2":
					sbg.enterState(9);
					break;
			}
		}
	}

	@Override
	public int getID() {
		return 8;
	}
	
}
