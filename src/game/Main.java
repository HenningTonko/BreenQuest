package game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import screens.WorldMap;
import screens.EastScreen;
import screens.NorthScreen;
import screens.SouthScreen;
import screens.StartScreen;
import screens.WestScreen;

public class Main extends StateBasedGame {
	
	private final int playScreen = 1;
	private final int startMenu = 0;
	private final int westScreen = 2;
	private final int northScreen = 3;
	private final int eastScreen = 4;
	private final int southScreen = 5;
	private final static int WIDTH = 800;
	private final static int HEIGHT = 600;

	public Main(String name) {
		super(name);
		this.addState(new WorldMap(playScreen));
		this.addState(new StartScreen(startMenu));
		this.addState(new WestScreen(westScreen));
		this.addState(new NorthScreen(northScreen));
		this.addState(new EastScreen(eastScreen));
		this.addState(new SouthScreen(southScreen));
	}
	
	public static void main(String[] args) {
		AppGameContainer app;
		
		try {
			app = new AppGameContainer(new Main("BreenQuest!"));
			app.setDisplayMode(WIDTH, HEIGHT, false);
			app.setTargetFrameRate(60);
            app.setVSync(true);
            app.setShowFPS(false);
            app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(playScreen).init(gc, this);
		this.getState(startMenu).init(gc, this);
		this.getState(northScreen).init(gc, this);
		this.getState(eastScreen).init(gc, this);
		this.getState(southScreen).init(gc, this);
		this.enterState(startMenu);
	}

}
