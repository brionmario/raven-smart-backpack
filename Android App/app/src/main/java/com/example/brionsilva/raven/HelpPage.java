package com.example.brionsilva.raven;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelpPage extends AppCompatActivity {

    private TextView HelpTV = null;
    private EditText Name = null;
    private EditText Mobile = null;
    private EditText Message = null;
    private Button Send;

    //Home button action method
    public void goHome(View view)
    {
        Intent intent = new Intent(HelpPage.this, firstPage.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);

        HelpTV = (TextView) findViewById(R.id.helpTV);
        Typeface font = Typeface.createFromAsset(getAssets(), "HelveticaNeueBd.ttf");
        HelpTV.setTypeface(font);

        Name = (EditText) findViewById(R.id.nameEditText);
        Mobile = (EditText) findViewById(R.id.mobileEditText);
        Message = (EditText) findViewById(R.id.messageEditText);
        Send=(Button) findViewById(R.id.sendBtn) ;

        Send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String message = Message.getText().toString();
                String name = Name.getText().toString();
                String mobile = Mobile.getText().toString();
                sendEmail(message,name,mobile);
            }
        });

    }


    private void sendEmail(String message, String name, String mobile) {
        String[] to = new String[]{"teamaparecium@gmail.com"};
        String subject = ("A message from Raven app " + "( Name - " + name + " / Mobile - " +mobile+ " )");
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT,message);
        emailIntent.setType("message/rfc822");

        startActivity(Intent.createChooser(emailIntent,"Email"));
    }
}
