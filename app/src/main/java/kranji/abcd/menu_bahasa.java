package kranji.abcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menu_bahasa extends AppCompatActivity {

    ImageView img_ind;
    ImageView img_ingg;
    ImageView img_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bahasa);

        img_ind = (ImageView) findViewById(R.id.iv_test);
        img_ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_ind();
            }
        });

        img_ingg = (ImageView) findViewById(R.id.iv_tes2);
        img_ingg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                start_ing();
            }
        });
        img_out = (ImageView) findViewById(R.id.iv_tes3);
        img_out.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                start_back();
            }
        });
    }

    public void start_ind()
    {
        Intent intent = new Intent(this,menu_mulai_indonesia.class);
        startActivity(intent);
    }
    public void start_ing()
    {
        Intent intent = new Intent(this,menu_mulai_inggris.class);
        startActivity(intent);
    }
    public void start_back()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
