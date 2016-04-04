package example.soufiane.challenge;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Soufiane on 04/04/2016.
 */
public class ChellengesMenu extends AppCompatActivity {
    private Button VideoBut , PhotoBut , TextBut , AudioBut ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenges_menu);

        VideoBut = (Button) findViewById(R.id.Video);
        AudioBut = (Button) findViewById(R.id.Audio);
        PhotoBut = (Button) findViewById(R.id.Photo);
        TextBut = (Button) findViewById(R.id.Text);




        VideoBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(), VideoChallenges.class);
                Bundle bundle = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.move_right_in, R.anim.move_right_out).toBundle();
                startActivity(i2, bundle);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.move_left_in, R.anim.move_left_out);
    }
}
