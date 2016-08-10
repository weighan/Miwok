package com.example.android.miwok;

import android.app.Activity;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ustak on 2016/07/18.
 */
public class WordAdapter extends ArrayAdapter<Word>{

    private int color;
    public WordAdapter(Activity context, ArrayList<Word> words, int color){
        super(context, 0, words);
        this.color = color;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwokWord);
        miwokWord.setText(currentWord.getMiwok());

        TextView englishWord = (TextView) listItemView.findViewById(R.id.englishWord);
        englishWord.setText(currentWord.getEnglish());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        LinearLayout layoutBackground = (LinearLayout) listItemView.findViewById(R.id.layoutBackground);
        int actualColor = ContextCompat.getColor(getContext(), color);
        layoutBackground.setBackgroundColor(actualColor);

        if(currentWord.isHasImage()) {
            image.setImageResource(currentWord.getImage());
            image.setVisibility(View.VISIBLE);
        }
        else{
            image.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
