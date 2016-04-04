package example.soufiane.challenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Soufiane on 04/04/2016.
 */
public class VideoChallenges extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_challenges);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.move_left_in, R.anim.move_left_out);
    }
}
