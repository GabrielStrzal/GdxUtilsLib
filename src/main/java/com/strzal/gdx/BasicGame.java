package com.strzal.gdx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.strzal.gdx.loading.LoadingPaths;
import lombok.Getter;

public abstract class BasicGame extends Game {

    public static final float PPM = 100;
    @Getter
    protected float screenWidth;
    @Getter
    protected float screenHeight;


    public SpriteBatch batch;
    @Getter
    protected final AssetManager assetManager = new AssetManager();
    protected LoadingPaths loadingPaths;

    public int currentLevel;
}
