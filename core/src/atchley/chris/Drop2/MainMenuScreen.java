package atchley.chris.Drop2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

import java.util.Calendar;

/**
 * Created by Chris on 6/24/2015.
 */
public class MainMenuScreen implements Screen {

    final Drop2 game;
    private AdsController mAdsController;

    OrthographicCamera camera;




    public MainMenuScreen(final Drop2 gam, AdsController adsController) {
        this.mAdsController=adsController;
        game = gam;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);


    }

    @Override
    public void show() {

    }



    @Override
    public void render(float delta) {
        String date = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_YEAR));
        Gdx.gl.glClearColor(0, 255, 255, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();

        AssetLoader.font.draw(game.batch, date,Gdx.graphics.getWidth()/2 ,Gdx.graphics.getHeight()/3);
        AssetLoader.font.drawWrapped(game.batch, "Tap anywhere to reveal answer!  This is a test of the textwrap." +
                "I am writing a long ass piece of text to see how it conforms to the screen.", 100   , 200,Gdx.graphics.getWidth()-100);

        game.batch.end();
        //mAdsController.showBannerAd();

        if (Gdx.input.isTouched()) {
            mAdsController.showInterstitialAd(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Interstitial app closed");

                }
            });


            game.setScreen(new GameScreen(game));
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }


}
