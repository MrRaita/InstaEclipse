package ps.reso.instaeclipse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LauncherActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(new Intent(this, MainActivity.class));

        Intent instagramIntent =
                getPackageManager().getLaunchIntentForPackage("com.instagram.android");
        if (instagramIntent != null) {
            startActivity(instagramIntent);
        }

        finish();
    }
}
