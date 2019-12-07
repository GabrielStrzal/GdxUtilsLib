package com.strzal.gdx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class BasicGame extends Game {

    public static final float PPM = 100;
    public SpriteBatch batch;
    protected final AssetManager assetManager = new AssetManager();
    public int currentLevel;
}
