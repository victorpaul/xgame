package com.sukinsan.test.game.framework.implementation;

import java.util.List;

import android.view.View.OnTouchListener;

import com.sukinsan.test.game.framework.Input;

/**
 * Created by Victor on 9/21/2014.
 */
public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
