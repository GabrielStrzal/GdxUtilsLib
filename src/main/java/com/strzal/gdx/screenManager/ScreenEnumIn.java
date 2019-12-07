package com.strzal.gdx.screenManager;

import com.badlogic.gdx.Screen;

/**
 * Based on http://www.pixnbgames.com/blog/libgdx/how-to-manage-screens-in-libgdx/
 */

public interface ScreenEnumIn {
    public abstract Screen getScreen(Object... params);
}

