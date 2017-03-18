package com.example.brionsilva.raven;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class OurTeam extends AppCompatActivity {

    private TextView TitleTeam = null;
    private TextView BrionName = null;

    //Home button action method
    public void goHome1(View view)
    {
        Intent intent = new Intent(OurTeam.this, firstPage.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team);

        TitleTeam = (TextView) findViewById(R.id.teamtv);
        Typeface font = Typeface.createFromAsset(getAssets(), "HelveticaNeueMed.ttf");
        TitleTeam.setTypeface(font);

        //brion buttons
        ImageButton BrionFB = (ImageButton) findViewById(R.id.brionfb);
        ImageButton BrionTwitter = (ImageButton) findViewById(R.id.briontwitter);
        ImageButton BrionLink = (ImageButton) findViewById(R.id.brionlink);
        ImageButton BrionInsta = (ImageButton) findViewById(R.id.brioninsta);

        BrionFB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/brion.mario"));
                startActivity(intent);
            }
        });
        BrionTwitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/brion_mario"));
                startActivity(intent);
            }
        });
        BrionLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://lk.linkedin.com/in/brion-mario-80b650121"));
                startActivity(intent);
            }
        });
        BrionInsta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/brionmario/?hl=en"));
                startActivity(intent);
            }
        });

        //thilan buttons
        ImageButton ThilanFB = (ImageButton) findViewById(R.id.thilanfb);
        ImageButton ThilanTwitter = (ImageButton) findViewById(R.id.thilantwitter);
        ImageButton ThilanLink = (ImageButton) findViewById(R.id.thilanlink);
        ImageButton ThilanInsta = (ImageButton) findViewById(R.id.thilaninsta);

        ThilanFB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/thilan.oconner?__mref=message"));
                startActivity(intent);
            }
        });
        ThilanTwitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/ThilanLasitha95"));
                startActivity(intent);
            }
        });
        ThilanLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://lk.linkedin.com/in/thilan-kumara-510650121"));
                startActivity(intent);
            }
        });
        ThilanInsta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/thilan_zeuz/?hl=en"));
                startActivity(intent);
            }
        });

        //piumal buttons
        ImageButton PiumalFB = (ImageButton) findViewById(R.id.piumalfb);
        ImageButton PiumalTwitter = (ImageButton) findViewById(R.id.piumaltwitter);
        ImageButton PiumalLink = (ImageButton) findViewById(R.id.piumallink);
        ImageButton PiumalInsta = (ImageButton) findViewById(R.id.piumalinsta);

        PiumalFB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/piumalk"));
                startActivity(intent);
            }
        });
        PiumalTwitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/piukulasekara"));
                startActivity(intent);
            }
        });
        PiumalLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://lk.linkedin.com/in/piumal-kulasekara-a6b53424"));
                startActivity(intent);
            }
        });
        PiumalInsta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/_215k_/?hl=en"));
                startActivity(intent);
            }
        });
        //thushan buttons
        ImageButton ThushanFB = (ImageButton) findViewById(R.id.thushanfb);
        ImageButton ThushanTwitter = (ImageButton) findViewById(R.id.thushantwitter);
        ImageButton ThushanLink = (ImageButton) findViewById(R.id.thushanlink);
        ImageButton ThushanInsta = (ImageButton) findViewById(R.id.thushaninsta);

        ThushanFB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/thushan.kavishka.5"));
                startActivity(intent);
            }
        });
        ThushanTwitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/thushankavishka"));
                startActivity(intent);
            }
        });
        ThushanLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://lk.linkedin.com/in/thushan-kavishka-a020ba115"));
                startActivity(intent);
            }
        });
        ThushanInsta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/thushankavishka/?hl=en"));
                startActivity(intent);
            }
        });
        //anuradha buttons
        ImageButton AnuFB = (ImageButton) findViewById(R.id.anufb);
        ImageButton AnuTwitter = (ImageButton) findViewById(R.id.anutwitter);
        ImageButton AnuLink = (ImageButton) findViewById(R.id.anulink);
        ImageButton AnuInsta = (ImageButton) findViewById(R.id.anuinsta);

        AnuFB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/anuradhadenuwan"));
                startActivity(intent);
            }
        });
        AnuTwitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/AnuradhaDenuwan"));
                startActivity(intent);
            }
        });
        AnuLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://lk.linkedin.com/in/anuradha-gunasinghe-917969b5"));
                startActivity(intent);
            }
        });
        AnuInsta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/anuradhagunasinghe/?hl=en"));
                startActivity(intent);
            }
        });


    }
}
