package com.sukinsan.test.game.activity;

import com.sukinsan.test.game.framework.Screen;
import com.sukinsan.test.game.framework.implementation.AndroidGameActivity;
import com.sukinsan.test.game.game.LoadingScreen;

public class XGameOne extends AndroidGameActivity{

    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this);
    }
}
