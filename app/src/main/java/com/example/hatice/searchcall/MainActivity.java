package com.example.hatice.searchcall;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.SearchManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCall, buttonSearch,buttonMaps;
        buttonCall=(Button)findViewById(R.id.buttonCall);
        buttonSearch=(Button)findViewById(R.id.buttonSearch);
        buttonMaps=(Button)findViewById(R.id.buttonMap);
        final EditText etext=(EditText)findViewById(R.id.etext);


        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO 1: Explicit intent hata verdi

                //Intent i=new Intent(this,CallActivity.class);
                  // startActivity(i);

                String phonenumber=etext.getText().toString();
                Intent i=new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+phonenumber));
                startActivity(i);

            }
        }
        );
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                    String search=etext.getText().toString();
                    intent.putExtra(SearchManager.QUERY, search);
                    startActivity(intent);
                } catch (Exception e) {
                }

            }}
        );

        buttonMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }}
        );
    }
}
