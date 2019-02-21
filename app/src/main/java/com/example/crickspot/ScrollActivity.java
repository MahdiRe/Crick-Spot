package com.example.crickspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScrollActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        TextView scroll = (TextView)findViewById(R.id.scroll);


        String paragraph = "Class Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph " +
                "is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of " +
                "ideas among sentences is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence " +
                "that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether a section in a paper is a paragraph. " +
                "For instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, " +
                "a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the “controlling " +
                "idea,” because it controls what happens in the rest of the paragraph.+\n+" +
                "Class Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of"
                +"\tFor instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately"
                +"a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the “controlling"
                +"idea,” because it controls what happens in the rest of the paragraph.\n"+
                "\nParagraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of " +
                "at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences " +
                "is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and " +
                " 116). Length and appearance do not determine whether a section in a paper is a paragraph. For instance, in some styles of writing," +
                " particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sent" +
                "ences that support one main idea. In this handout, we will refer to this as the “controlling idea,” because it controls what happens " +
                "in the rest of the paragraph.";

        scroll.setText(paragraph);
        scroll.setMovementMethod(new ScrollingMovementMethod());

        Button back_button = (Button)findViewById(R.id.BackToMain);
        back_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BackToMain:
                GoToMainPage();
                break;
        }
    }

    private void GoToMainPage() {
        Intent intent = new Intent(this,welcom_creen.class);
        startActivity(intent);
    }
}
