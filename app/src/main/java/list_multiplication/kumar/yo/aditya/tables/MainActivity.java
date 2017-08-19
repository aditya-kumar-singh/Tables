package list_multiplication.kumar.yo.aditya.tables;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        img=(ImageView)findViewById(R.id.img);
        Animation an=  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animationnew1);
        img.setAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i1=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(i1);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
