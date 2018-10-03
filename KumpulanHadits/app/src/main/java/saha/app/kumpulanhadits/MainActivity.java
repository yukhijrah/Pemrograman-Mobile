package saha.app.kumpulanhadits;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//kita ambil ID yang Button
        bottom = (LinearLayout) findViewById(R.id.bottom);

//kita set onClick si button start
// setelah kita set onClick si Button start, kita pergi ke
// Activity selanjutnya dengan bantuan INTENT

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, DetailActivity.class);
                startActivity(i);
            }
        });
    }
}
