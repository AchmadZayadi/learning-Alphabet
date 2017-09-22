package kranji.abcd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class huruf_indonesia extends AppCompatActivity {

    private TabLayout tabLayout;
    Button btn_Aa;
    Button btn_Ab;
    Button btn_Ac;
    Button btn_Ad;
    Button btn_Ae;
    Button btn_Af;
    Button btn_Ag;
    Button btn_Ah;
    Button btn_Ai;
    Button btn_Aj;
    Button btn_Ak;
    Button btn_Al;
    Button btn_Am;
    Button btn_An;
    Button btn_Ao;
    Button btn_Ap;
    Button btn_Aq;
    Button btn_Ar;
    Button btn_As;
    Button btn_At;
    Button btn_Au;
    Button btn_Av;
    Button btn_Aw;
    Button btn_Ax;
    Button btn_Ay;
    Button btn_Az;
    ImageView img_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_indo);

        AdView mAdView   = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn_Aa =(Button)findViewById(R.id.btn_A);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.a);
        btn_Aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        btn_Ab =(Button)findViewById(R.id.btn_b);
        final MediaPlayer mpB = MediaPlayer.create(this,R.raw.b);
        btn_Ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpB.start();
            }
        });
        btn_Ac =(Button)findViewById(R.id.btn_c);
        final MediaPlayer mpc = MediaPlayer.create(this,R.raw.c);
        btn_Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpc.start();
            }
        });
        btn_Ad =(Button)findViewById(R.id.btn_d);
        final MediaPlayer mpd = MediaPlayer.create(this,R.raw.d);
        btn_Ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpd.start();
            }
        });

        btn_Ae =(Button)findViewById(R.id.btn_e);
        final MediaPlayer mpe = MediaPlayer.create(this,R.raw.e);
        btn_Ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpe.start();
            }
        });

        btn_Af =(Button)findViewById(R.id.btn_f);
        final MediaPlayer mpf = MediaPlayer.create(this,R.raw.f);
        btn_Af.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpf.start();
            }
        });

        btn_Ag =(Button)findViewById(R.id.btn_g);
        final MediaPlayer mpg = MediaPlayer.create(this,R.raw.g);
        btn_Ag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpg.start();
            }
        });

        btn_Ah =(Button)findViewById(R.id.btn_h);
        final MediaPlayer mph = MediaPlayer.create(this,R.raw.h);
        btn_Ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mph.start();
            }
        });

        btn_Ai =(Button)findViewById(R.id.btn_i);
        final MediaPlayer mpi = MediaPlayer.create(this,R.raw.i);
        btn_Ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpi.start();
            }
        });

        btn_Aj =(Button)findViewById(R.id.btn_j);
        final MediaPlayer mpj = MediaPlayer.create(this,R.raw.j);
        btn_Aj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpj.start();
            }
        });

        btn_Ak =(Button)findViewById(R.id.btn_k);
        final MediaPlayer mpk = MediaPlayer.create(this,R.raw.k);
        btn_Ak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpk.start();
            }
        });

        btn_Al =(Button)findViewById(R.id.btn_l);
        final MediaPlayer mpl = MediaPlayer.create(this,R.raw.l);
        btn_Al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpl.start();
            }
        });

        btn_Am =(Button)findViewById(R.id.btn_m);
        final MediaPlayer mpm = MediaPlayer.create(this,R.raw.m);
        btn_Am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpm.start();
            }
        });

        btn_An =(Button)findViewById(R.id.btn_n);
        final MediaPlayer mpn = MediaPlayer.create(this,R.raw.n);
        btn_An.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpn.start();
            }
        });

        btn_Ao =(Button)findViewById(R.id.btn_o);
        final MediaPlayer mpo = MediaPlayer.create(this,R.raw.o);
        btn_Ao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpo.start();
            }
        });

        btn_Ap =(Button)findViewById(R.id.btn_p);
        final MediaPlayer mpp = MediaPlayer.create(this,R.raw.p);
        btn_Ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpp.start();
            }
        });


        btn_Aq =(Button)findViewById(R.id.btn_q);
        final MediaPlayer mpq = MediaPlayer.create(this,R.raw.q);
        btn_Aq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpq.start();
            }
        });

        btn_Ar =(Button)findViewById(R.id.btn_r);
        final MediaPlayer mpr = MediaPlayer.create(this,R.raw.r);
        btn_Ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpr.start();
            }
        });

        btn_As =(Button)findViewById(R.id.btn_s);
        final MediaPlayer mps = MediaPlayer.create(this,R.raw.s);
        btn_As.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mps.start();
            }
        });

        btn_At =(Button)findViewById(R.id.btn_t);
        final MediaPlayer mpt = MediaPlayer.create(this,R.raw.t);
        btn_At.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpt.start();
            }
        });

        btn_Au =(Button)findViewById(R.id.btn_u);
        final MediaPlayer mpu = MediaPlayer.create(this,R.raw.u);
        btn_Au.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpu.start();
            }
        });

        btn_Av =(Button)findViewById(R.id.btn_v);
        final MediaPlayer mpv = MediaPlayer.create(this,R.raw.v);
        btn_Av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpv.start();
            }
        });

        btn_Aw =(Button)findViewById(R.id.btn_w);
        final MediaPlayer mpw = MediaPlayer.create(this,R.raw.w);
        btn_Aw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpw.start();
            }
        });

        btn_Ax =(Button)findViewById(R.id.btn_x);
        final MediaPlayer mpx = MediaPlayer.create(this,R.raw.x);
        btn_Ax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpx.start();
            }
        });

        btn_Ay =(Button)findViewById(R.id.btn_y);
        final MediaPlayer mpy = MediaPlayer.create(this,R.raw.y);
        btn_Ay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpy.start();
            }
        });

        btn_Az =(Button)findViewById(R.id.btn_z);
        final MediaPlayer mpz = MediaPlayer.create(this,R.raw.z);
        btn_Az.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpz.start();
            }
        });


    }



    public void back()
    {
        Intent intent = new Intent(this,menu_mulai_indonesia.class);
        startActivity(intent);
    }
}

