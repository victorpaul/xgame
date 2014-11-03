package com.sukinsan.test.game.framework.implementation;

import android.graphics.Bitmap;

import com.sukinsan.test.game.framework.Graphics;
import com.sukinsan.test.game.framework.Graphics.ImageFormat;
import com.sukinsan.test.game.framework.Image;

/**
 * Created by Victor on 9/21/2014.
 */
public class AndroidImage implements Image {
    Bitmap bitmap;
    Graphics.ImageFormat format;

    public AndroidImage(Bitmap bitmap, ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}
