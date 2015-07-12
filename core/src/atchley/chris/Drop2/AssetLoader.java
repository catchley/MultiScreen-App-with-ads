package atchley.chris.Drop2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Chris on 7/11/2015.
 */
public class AssetLoader {
    public static Texture logoTexture;
    public static TextureRegion logo;
    public static BitmapFont font;


    public static void load(){
        font = new BitmapFont(Gdx.files.internal("data/font.fnt"));
        font.setScale(.4f, .4f);


        logoTexture = new Texture(Gdx.files.internal("data/logo.png"));
        logoTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        logo = new TextureRegion(logoTexture,0,0,512,114);

    }

    public static void dispose(){
        logoTexture.dispose();
        font.dispose();


    }
}

