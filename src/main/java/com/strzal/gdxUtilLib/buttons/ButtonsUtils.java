package com.strzal.gdxUtilLib.buttons;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class ButtonsUtils {
    AssetManager assetManager;
    String transparentButtonPath;

    public ButtonsUtils(AssetManager assetManager, String transparentButtonPath) {
        this.assetManager = assetManager;
        this.transparentButtonPath = transparentButtonPath;
    }

    public ImageButton getImageButton(String imageUp, String imageDown, String imageChecked) {

        Texture textureImageUp = assetManager.get(imageUp);
        Texture textureImageDown = assetManager.get(imageDown);
        Texture textureImageChecked = assetManager.get(imageChecked);

        return new ImageButton(
                new TextureRegionDrawable(textureImageUp),
                new TextureRegionDrawable(textureImageDown),
                new TextureRegionDrawable(textureImageChecked));
    }

    public ImageButton getTransparentImageButton(int sizeX, int sizeY, int width, int height) {

        ImageButton transparentImageButton = new ImageButton(new TextureRegionDrawable((Texture) assetManager.get(transparentButtonPath)));
        transparentImageButton.setPosition(sizeX, sizeY);
        transparentImageButton.setSize(width, height);
        return transparentImageButton;
    }
}
