package ajates.pro.astudios.com.youclip;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class StartupScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_screen);
      // getSupportActionBar().hide();
        ImageView SplashView = (ImageView) findViewById(R.id.imageView);
        Animation scaleAnimation = new ScaleAnimation(0f,1f,0f,1f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setDuration(1000);
        Animation SlideUpanimation = new TranslateAnimation(0,0,500,0);
        SlideUpanimation.setDuration(1000);
        AnimationSet animSet = new AnimationSet(true);
        animSet.setFillEnabled(true);
        animSet.addAnimation(scaleAnimation);
        animSet.addAnimation(SlideUpanimation);
        SplashView.startAnimation(animSet);

    }

}
