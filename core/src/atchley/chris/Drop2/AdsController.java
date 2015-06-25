package atchley.chris.Drop2;

/**
 * Created by Chris on 6/24/2015.
 */
public interface AdsController {
    public void showBannerAd();
    public void hideBannerAd();
    public void showInterstitialAd (Runnable then);
}
