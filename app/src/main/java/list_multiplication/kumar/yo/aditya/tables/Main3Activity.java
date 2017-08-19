package list_multiplication.kumar.yo.aditya.tables;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button b1,b2;MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();
        b1=(Button)findViewById(R.id.tbles);
        b2=(Button)findViewById(R.id.chart);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp=MediaPlayer.create(getApplicationContext(),R.raw.welcmvoice);
                mp.start();
                Intent i1=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp=MediaPlayer.create(getApplicationContext(),R.raw.welcmvoice);
                mp.start();
                Intent i2=new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(i2);
            }
        });


    }
}
