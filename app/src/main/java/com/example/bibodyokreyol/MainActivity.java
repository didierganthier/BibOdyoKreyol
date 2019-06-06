package com.example.bibodyokreyol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int num = 1;
    String[]jenez = new String[]{"Jenez"+num};
    ArrayAdapter<String> jenezAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ancien_test);
       final String[] livres = new String[]{"Jenez", "Ekzod","Levitik","Nom","Detewonom","Jozye","Jij","Rit",
                "1 Samyel","2 Samyel", "1 Wa", "2 Wa","1 Kronik","2 Kronik","Esdras","Neyemi","Este","Job",
                "Som", "Pwoveb", "Eklezyas", "Kantik Salomon", "Ezayi", "Jeremi", "Lamantasyon",
                "Ezekyel", "Danyel","Oze","Joel","Amos","Abdyas","Jonas","Miche","Nayum","Abaku","Sofoni","Aje","Zakari","Malachi"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,android.R.id.text1,livres);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent changeIntent = new Intent(MainActivity.this,BookActivities.class);
                String book = livres[position];
                switch (position){
                    case 0:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 1:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 2:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 3:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 4:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 5:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 6:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 7:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 8:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 9:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 10:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 11:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 12:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 13:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 14:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 15:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 16:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 17:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 18:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 19:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 20:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 21:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 22:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 23:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 24:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 25:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 26:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 27:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 28:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 29:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 30:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 31:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 32:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 33:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 34:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 35:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 36:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 37:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                    case 38:
                        changeIntent.putExtra("Ansyen",book);
                        startActivity(changeIntent);
                }
            }
        });

    }
}
