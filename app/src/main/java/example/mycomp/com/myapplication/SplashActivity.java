package example.mycomp.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {



    private static final int SPLASH_DISPLAY_TIME = 3000; /* 3 seconds */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {

            public void run() {

                Intent mainIntent = new Intent(SplashActivity.this,
                        MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);

                SplashActivity.this.finish();
                overridePendingTransition(R.anim.mainfadein,
                        R.anim.splashfadeout);
            }
        }, SPLASH_DISPLAY_TIME);
    }
}
