package com.sukinsan.test.game.framework;

/**
 * Created by Victor on 9/21/2014.
 */
public interface Image {
    public int getWidth();
    public int getHeight();
    public Graphics.ImageFormat getFormat();
    public void dispose();
}
