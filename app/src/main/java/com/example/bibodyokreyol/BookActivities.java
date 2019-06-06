package com.example.bibodyokreyol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BookActivities extends AppCompatActivity {

    ArrayAdapter adapter;
    ArrayList<String>currentBook = new ArrayList<>();
    String[] livres = new String[]{"Jenez", "Ekzod","Levitik","Nom","Detewonom","Jozye","Jij","Rit",
            "1 Samyel","2 Samyel", "1 Wa", "2 Wa","1 Kronik","2 Kronik","Esdras","Neyemi","Este","Job",
            "Som", "Pwoveb", "Eklezyas", "Kantik Salomon", "Ezayi", "Jeremi", "Lamantasyon",
            "Ezekyel", "Danyel","Oze","Joel","Amos","Abdyas","Jonas","Miche","Nayum","Abaku","Sofoni","Aje","Zakari","Malachi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_activities);
        ListView listView = findViewById(R.id.currentBook);

        Bundle bundle = getIntent().getExtras();
        String livre = bundle.getString("Ansyen");


            if(livre.equals("Jenez")) {
                for (int i = 0; i < 50; i++) {
                    currentBook.add("Jenez " + (i + 1));
                }
                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
                listView.setAdapter(adapter);
            }
            if(livre.equals("Ekzod")) {
                for (int i = 0; i < 40; i++) {
                    currentBook.add(livres[1] + " " + (i + 1));
                }
                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
                listView.setAdapter(adapter);
            }
//            case "Levitik":
//                for (int i = 0; i < 27; i++) {
//                    currentBook.add(livres[2]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Nom":
//                for (int i = 0; i < 36; i++) {
//                    currentBook.add(livres[3]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Detewonom":
//                for (int i = 0; i < 34; i++) {
//                    currentBook.add(livres[4]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Jozye":
//                for (int i = 0; i < 24; i++) {
//                    currentBook.add(livres[5]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Jij":
//                for (int i = 0; i < 21; i++) {
//                    currentBook.add(livres[6]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Rit":
//                for (int i = 0; i < 4; i++) {
//                    currentBook.add(livres[7]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "1 Samyel":
//                for (int i = 0; i < 31; i++) {
//                    currentBook.add(livres[8]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "2 Samyel":
//                for (int i = 0; i < 24; i++) {
//                    currentBook.add(livres[9]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "1 Wa":
//                for (int i = 0; i < 22; i++) {
//                    currentBook.add(livres[10]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "2 Wa":
//                for (int i = 0; i < 25; i++) {
//                    currentBook.add(livres[11]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "1 Kronik":
//                for (int i = 0; i < 29; i++) {
//                    currentBook.add(livres[12]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "2 Kronik":
//                for (int i = 0; i < 36; i++) {
//                    currentBook.add(livres[13]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Esdras":
//                for (int i = 0; i < 10; i++) {
//                    currentBook.add(livres[15]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Neyemi":
//                for(int i = 0; i < 13;i++){
//                    currentBook.add(livres[16]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Este":
//                for(int i = 0; i < 10;i++){
//                    currentBook.add(livres[17]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Job":
//                for(int i = 0; i < 42;i++){
//                    currentBook.add(livres[18]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Som":
//                for(int i = 0; i < 150;i++){
//                    currentBook.add(livres[19]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Pwoveb":
//                for(int i = 0; i < 31;i++){
//                    currentBook.add(livres[20]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Eklezyas":
//                for(int i = 0; i < 12;i++){
//                    currentBook.add(livres[21]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Kantik Salomon":
//                for(int i = 0; i < 8;i++){
//                    currentBook.add(livres[22]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Ezayi":
//                for(int i = 0; i < 66;i++){
//                    currentBook.add(livres[23]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Jeremi":
//                for(int i = 0; i < 52;i++){
//                    currentBook.add(livres[24]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Lamantasyon":
//                for(int i = 0; i < 5;i++){
//                    currentBook.add(livres[25]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Ezekyel":
//                for(int i = 0; i < 48;i++){
//                    currentBook.add(livres[26]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Danyel":
//                for(int i = 0; i < 12;i++){
//                    currentBook.add(livres[27]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Oze":
//                for(int i = 0; i < 14;i++){
//                    currentBook.add(livres[28]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Joel":
//                for(int i = 0; i < 3;i++){
//                    currentBook.add(livres[29]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Amos":
//                for(int i = 0; i < 9;i++){
//                    currentBook.add(livres[30]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Abdyas":
//                for(int i = 0; i < 1;i++){
//                    currentBook.add(livres[31]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Jonas":
//                for(int i = 0; i < 4;i++){
//                    currentBook.add(livres[32]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Miche":
//                for(int i = 0; i < 7;i++){
//                    currentBook.add(livres[33]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Nayum":
//                for(int i = 0; i < 3;i++){
//                    currentBook.add(livres[34]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Abaku":
//                for(int i = 0; i < 3;i++){
//                    currentBook.add(livres[35]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Sofoni":
//                for(int i = 0; i < 3;i++){
//                    currentBook.add(livres[36]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Aje":
//                for(int i = 0; i < 2;i++){
//                    currentBook.add(livres[37]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Zakari":
//                for(int i = 0; i < 14;i++){
//                    currentBook.add(livres[38]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            case "Malachi":
//                for(int i = 0; i < 4;i++){
//                    currentBook.add(livres[39]+ " " + (i + 1));
//                }
//                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currentBook);
//                listView.setAdapter(adapter);
//            default:
//                Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
//        }
    }
}
