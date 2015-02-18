package com.example.cep.exempleradiobuttons;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton r = (RadioButton) findViewById(R.id.Vermell);
        final RadioButton g = (RadioButton) findViewById(R.id.Verd);
        final RadioButton b = (RadioButton) findViewById(R.id.Blau);
        final TextView text = (TextView) findViewById(R.id.Text);
        Button btoR = (Button) findViewById(R.id.BtoR);
        Button btoG = (Button) findViewById(R.id.BtoG);
        Button btoB = (Button) findViewById(R.id.BtoB);
        RadioGroup grup = (RadioGroup) findViewById(R.id.Grup);
/*
        r.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text.setText("Vermell");
                text.setTextColor(Color.RED);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Verd");
                text.setTextColor(Color.GREEN);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Blau");
                text.setTextColor(Color.BLUE);
            }
        });
*/
        btoR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text.setText("Vermell");
                text.setTextColor(Color.RED);
                r.setChecked(true);
            }
        });

        btoG.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text.setText("Verd");
                text.setTextColor(Color.GREEN);
                g.setChecked(true);
            }
        });

        btoB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text.setText("Blau");
                text.setTextColor(Color.BLUE);
                b.setChecked(true);
            }
        });

        grup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.Vermell:
                        text.setText("Vermell");
                        text.setTextColor(Color.RED);
                        break;
                    case R.id.Verd:
                        text.setText("Verd");
                        text.setTextColor(Color.GREEN);
                        break;
                    case R.id.Blau:
                        text.setText("Blau");
                        text.setTextColor(Color.BLUE);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
