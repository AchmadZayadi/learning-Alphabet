package kranji.abcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menu_mulai_inggris extends AppCompatActivity {

    ImageView imghuruf;
    ImageView imgangka;
    ImageView imgkeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mulai_inggris);

        imghuruf = (ImageView)findViewById(R.id.img_huruf_inggris);
        imghuruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huruf_inggris();
            }
        });

        imgangka = (ImageView)findViewById(R.id.img_angka_inggris);
        imgangka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_ingris();
            }
        });
    }

    public void huruf_inggris()
    {
        Intent inter = new Intent(this,huruf_inggris.class);
        startActivity(inter);

    }

    public void angka_ingris(){
        Intent inte = new Intent(this,angka_inggris.class);
        startActivity(inte);


    }
}
