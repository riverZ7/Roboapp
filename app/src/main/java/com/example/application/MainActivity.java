package com.example.application;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button btnInsert;
    EditText edtRoboname;
    private DBHelper dbHelper;

    // Button btnRed ,btnGreen,btnYellow;
    Toolbar roboToolbar;
    TextView tvUsername;


 //   EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

      /*  btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnYellow = findViewById(R.id.btnYellow);
*/

    /*    tvUsername = findViewById(R.id.tvUsernme);
        SharedPreferences storePreference = getSharedPreferences("RoboPrefs", MODE_PRIVATE);
            SharedPreferences.Editor sharedPrefEditor = storePreference.edit();  //edit is storing the data
        sharedPrefEditor.putString("username",tvUsername.getText().toString());
           sharedPrefEditor.apply();

        tvUsername = findViewById(R.id.tvUsernme);


        btnRed.setOnClickListener(view -> {
            //navigate to red activity
            Intent redIntent = new Intent(this, RedActivity.class);
            startActivity(redIntent);
        });
        btnGreen.setOnClickListener(view -> {
            //navigate to green activity
            Intent greenIntent = new Intent(this, GreenActivity.class);
            startActivity(greenIntent);
        });
        btnYellow.setOnClickListener(view -> {
            //navigate to Yellow  activity
            Intent yellowIntent = new Intent(this, YellowActivity.class);
            startActivity(yellowIntent);
        });
        */
        //Toolbar topic 1,2,3
        roboToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(roboToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //db insert da
        edtRoboname = findViewById(R.id.edtRoboname);
        btnInsert = findViewById(R.id.btnInsert);

        dbHelper = new DBHelper(this);
        btnInsert.setOnClickListener(v ->{
            String name = edtRoboname.getText().toString();
            if(dbHelper.insertRecord(name)){
                Toast.makeText(this,"Successfulle inserted",Toast.LENGTH_LONG);
            }else {
                Toast.makeText(this,"Failed to inserted",Toast.LENGTH_LONG);
            }
        });
    }
        //Sahred Preferenced
        @Override
                protected void onResume(){
            super.onResume();
            SharedPreferences preferences = getSharedPreferences("RoboPrefs", MODE_PRIVATE);
            String username = preferences.getString("username", "");

         //   edtName.setText(username);
        }
   //     @Override
       //         protected void onPause(){
      //      super.onPause();
       //     SharedPreferences storePreference = getSharedPreferences("RoboPrefs", MODE_PRIVATE);
        ///    SharedPreferences.Editor sharedPrefEditor = storePreference.edit();  //edit is storing the data
            //sharedPrefEditor.putString("username",edtName.getText().toString());
        //    sharedPrefEditor.apply();

     //   }
        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pop_up_menu, menu);
        return true;
    }
        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {

            int itemId = item.getItemId();

            if (itemId == R.id.popUp_Content) {
                //display content
            } else if (itemId == R.id.popUp_Themes){
                //load themes
            }else if (itemId == R.id.popUp_Logout){
                //logout
            } else if(itemId == R.id.popUp_Settings){
                //load settings
            }

            return super.onOptionsItemSelected(item);
}
    //end of topic 1,2,3
}

/*
Activities - individual screens (represents the UI elements)
Services - background component that performs operations without a UI
Content provider - share and manage daya betweeen different apps
Broadcast receivers - components that allow your application to send and receive system-wide
broadcast messages or custom event

Shared Preference
Help us to store a small collection of key-values pairs that we want to save.
We can store and retrieved SharedPreference objects.
Function like a database not
 */










