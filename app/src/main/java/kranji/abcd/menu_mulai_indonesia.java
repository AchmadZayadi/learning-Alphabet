package kranji.abcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menu_mulai_indonesia extends AppCompatActivity {

    ImageView img_huruf;
    ImageView img_angka;
    ImageView img_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mulai_indo);

        img_huruf = (ImageView)findViewById(R.id.img_huruf_indonesia);
        img_huruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panggil_huruf();
            }
        });

        img_angka = (ImageView)findViewById(R.id.img_angka_indonesia);
        img_angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                panggil_angka();
            }
        });

        img_out = (ImageView)findViewById(R.id.img_keluar_indonesia);
        img_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                back();
            }
        });
    }

    public void panggil_huruf()
    {
        Intent intent = new Intent(this,huruf_indonesia.class);
        startActivity(intent);
    }

    public void panggil_angka()
    {
        Intent inter = new Intent(this,angka_indo.class);
        startActivity(inter);

    }
    public void back()
    {
        Intent intw = new Intent(this,menu_bahasa.class);
        startActivity(intw);

    }
}
