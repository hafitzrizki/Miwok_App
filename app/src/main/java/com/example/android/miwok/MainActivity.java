/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(),MainActivity.this));

        // Create an adapter that knows which fragment should be shown on each page
        FragmentPagerAdapter fmadapter = new FragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(fmadapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Set the content of the activity to use the activity_main.xml layout file
//        setContentView(R.layout.activity_main);
//
//        TextView numbers = (TextView)findViewById(R.id.numbers);//mendapat id numbers
//        numbers.setOnClickListener(new View.OnClickListener() {//set up intent
//            @Override
//            public void onClick(View v) {
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(numbersIntent);//mulai intent
//            }
//        });
//
//        TextView family = (TextView)findViewById(R.id.family);
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//                startActivity(familyIntent);
//            }
//        });
//
//        TextView colors = (TextView)findViewById(R.id.colors);
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
//                startActivity(colorsIntent);
//            }
//        });
//
//        TextView phrases = (TextView)findViewById(R.id.phrases);
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(phrasesIntent);
//            }
//        });
//    }


}