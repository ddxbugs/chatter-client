package com.rd.chatter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.rd.chatter.databinding.ActivityDisplayMessageBinding;

public class DisplayMessageActivity extends AppCompatActivity {
    ActivityDisplayMessageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);
        binding = ActivityDisplayMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // Get the intent that started this activity and parse the string
        Intent intent = getIntent();
        String mesg = intent.getStringExtra(MainActivity.EXTRA_MESG);

        // Capture the layout's TextView and set the string as its ttext
        TextView textView = binding.textDisplayView; // view binding example
        textView.setText(mesg);

    }
}