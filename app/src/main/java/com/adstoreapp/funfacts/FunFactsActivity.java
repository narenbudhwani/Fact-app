package com.adstoreapp.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class FunFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                factLabel.setText(fact);

                mRelativeLayout.setBackgroundColor(mColorWheel.getColor());


            }
        };
        showFactButton.setOnClickListener(listener);


        //Log.d("FunFactsActivity", "We're logging on the On/create() Method");

    }




}
