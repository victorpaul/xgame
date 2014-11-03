package com.sukinsan.test.game.game;

import android.graphics.Color;
import android.graphics.Paint;

import com.sukinsan.test.game.framework.Game;
import com.sukinsan.test.game.framework.Graphics;
import com.sukinsan.test.game.framework.Screen;

/**
 * Created by Victor on 9/21/2014.
 */
public class LoadingScreen extends Screen {

    private Paint textStyle;
    private Graphics g;

    public LoadingScreen(Game game) {
        super(game);

        g = game.getGraphics();
        textStyle = new Paint();
        textStyle.setTextSize(25);
        textStyle.setTextAlign(Paint.Align.CENTER);
        //textStyle.setAntiAlias(true);
        textStyle.setColor(Color.WHITE);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Graphics g = LoadingScreen.this.game.getGraphics();
                Assets.menu = g.newImage("menu.jpg", Graphics.ImageFormat.RGB565);
                Assets.click = LoadingScreen.this.game.getAudio().createSound("explode.ogg");
                LoadingScreen.this.game.setScreen(new MainMenuScreen(LoadingScreen.this.game));
            }
        }).start();
    }

    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void paint(float deltaTime) {
        int xStep = 160;
        int yStep = 160;
        for(int x=0;x<g.getWidth();x+=xStep){
            for(int y=0;y<g.getHeight();y+=yStep){
                //g.drawLine(x,y,x+xStep,y+yStep-10,Color.WHITE);
                g.drawString("Loading",x+(xStep/2),y, textStyle);
            }
        }
    }

    @Override
    public void pause() {


    }


    @Override
    public void resume() {


    }


    @Override
    public void dispose() {


    }


    @Override
    public void backButton() {


    }
}
