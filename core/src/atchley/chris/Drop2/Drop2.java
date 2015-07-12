package atchley.chris.Drop2;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Drop2 extends Game{

    public SpriteBatch batch;
    public BitmapFont font;
    public AdsController adsController;



    public Drop2(AdsController adsController){
        this.adsController = adsController;
    }




    public void create() {
        AssetLoader.load();
        batch = new SpriteBatch();
        //Use LibGDX's default Arial font.
//        font = new BitmapFont(Gdx.files.internal("data/text.fnt"));
//        font.setScale(1f,1f);
        this.setScreen(new SplashScreen(this, adsController));
    }

    public void render() {
        super.render(); //important!
    }

    public void dispose() {
        batch.dispose();

        AssetLoader.dispose();
    }



}