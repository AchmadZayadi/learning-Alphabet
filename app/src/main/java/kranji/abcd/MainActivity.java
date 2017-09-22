package kranji.abcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView btn_Start;
    private ImageView btn_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Start = (ImageView) findViewById(R.id.masuk);
        btn_Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_apk();
            }
        });

        btn_out = (ImageView) findViewById(R.id.keluar);
        btn_out.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            out_apk();
            }
        });
    }
    public void start_apk()
    {
        Intent intent = new Intent(this,huruf_indonesia.class);
        startActivity(intent);
    }
    public void out_apk()
    {
        finish();
        System.exit(0);
    }


}

