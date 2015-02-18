package com.example.cep.exemplecheckbox;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkBox = (CheckBox) findViewById(R.id.CheckBox1);
        final TextView text = (TextView) findViewById(R.id.Valor);
        Button btoAct = (Button) findViewById(R.id.BtoActivar);
        Button btoDes = (Button) findViewById(R.id.BtoDesactivar);

        checkBox.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked())
                {
                    text.setText("Activat");
                }
                else
                {
                    text.setText("Desactivat");
                }
            }
        });

        btoAct.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                checkBox.setChecked(true);
                text.setText("Activat");
            }
        });

        btoDes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                checkBox.setChecked(false);
                text.setText("Desactivat");
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
