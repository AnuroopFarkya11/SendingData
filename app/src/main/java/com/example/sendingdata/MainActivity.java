package com.example.sendingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<String> names = new ArrayList<String>();
        names.add("Hanumanji hai");
        names.add("ramji");
        names.add("Sitaji!");
        names.add("SHiv bhgwan");
        names.add("Namah Shivaaye");





        // Write a message to the database
       try{
           FirebaseDatabase database = FirebaseDatabase.getInstance();
           DatabaseReference myRef = database.getReference("message");
           myRef.setValue("Hello, World!");
           myRef.child("data").setValue("hmm!");
           myRef.removeValue();


//           myRef.setValue("Haann okay!");

           database.getReference("testing");
           // Creating a root

           DatabaseReference ref = database.getReference("Ram_darbar");
           ref.setValue("Hanuman ji!");

           ref.child("ramji");



           DatabaseReference listing = database.getReference("NAMES");
           listing.setValue(names);

       }catch(Exception e)
       {
           Log.d("UPDATES",e.toString());
       }


    }
}