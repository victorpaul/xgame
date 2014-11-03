package com.sukinsan.test.game.game;

import android.util.Log;

import com.sukinsan.test.game.framework.Game;
import com.sukinsan.test.game.framework.Graphics;
import com.sukinsan.test.game.framework.Input.TouchEvent;
import com.sukinsan.test.game.framework.Screen;

import java.util.List;

/**
 * Created by Victor on 9/21/2014.
 */
public class MainMenuScreen extends Screen {
    private String TAG = MainMenuScreen.class.getSimpleName();
    public MainMenuScreen(Game game) {
        super(game);
    }


    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();


        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            if (event.type == TouchEvent.TOUCH_UP) {

                if (inBounds(event, 0, 0, 250, 250)) {
                    //START GAME
                    //game.setScreen(new GameScreen(game));
                }
                //Assets.click.
                Assets.click.play(event.y / 10);
                Log.i(TAG, "x=" + event.x + " y=" + event.y);

            }
        }
    }


    private boolean inBounds(TouchEvent event, int x, int y, int width,
                             int height) {
        if (event.x > x && event.x < x + width - 1 && event.y > y
                && event.y < y + height - 1)
            return true;
        else
            return false;
    }


    @Override
    public void paint(float deltaTime) {
        Graphics g = game.getGraphics();
        g.drawImage(Assets.menu, 0, 0);


    }


    @Override
    public void pause() {
    }


    @Override
    public void resume() {
        Assets.click.play(10);

    }


    @Override
    public void dispose() {


    }


    @Override
    public void backButton() {
        //Display "Exit Game?" Box


    }
}
