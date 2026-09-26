import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {

    public static final String gamename = "Game";
    public static final int menu = 0;
    public static final int play = 1;

    public Game(String gamename) {
        super(gamename);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }

    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(menu).init(gc, this);
        this.getState(play).init(gc, this);
        this.enterState(menu);
    }

    public static void main(String[] args) {
        AppGameContainer appgc;
        try {
            appgc = new AppGameContainer(new Game(gamename));
            appgc.setDisplayMode(640, 360, false);
            appgc.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

class Menu extends BasicGameState {

    public Menu(int state) {

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("Press space to play", 100, 100);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        if(gc.getInput().isKeyDown(Input.KEY_SPACE)) {
            sbg.enterState(1);
        }
    }

    public int getID() {
        return 0;
    }

}

class Play extends BasicGameState {

    public Play(int state) {

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("Playing now", 100, 100);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

    }

    public int getID() {
        return 1;
    }

}
