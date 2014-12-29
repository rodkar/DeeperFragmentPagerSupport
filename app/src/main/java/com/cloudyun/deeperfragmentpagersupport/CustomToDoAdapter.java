package com.cloudyun.deeperfragmentpagersupport;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cloudyun.deeperfragmentpagersupport.parse.CustomToDo;
import com.cloudyun.deeperfragmentpagersupport.parse.ToDo;
import com.parse.ParseFile;
import com.parse.ParseImageView;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

/**
 * Created by 2013_13_mbp on 12/29/14.
 */
public class CustomToDoAdapter extends ParseQueryAdapter<CustomToDo> {

    public CustomToDoAdapter(Context context) {
        super(context, new ParseQueryAdapter.QueryFactory<CustomToDo>(){

            @Override
            public ParseQuery<CustomToDo> create() {
                ParseQuery<CustomToDo> query = CustomToDo.getQuery();
                query.whereEqualTo("highPri", true);
                return query;
            }
        });
    }

    @Override
    public View getItemView(CustomToDo object, View v, ViewGroup parent) {
        if (v==null){
            v = View.inflate(getContext(), R.layout.list_item_urgent, null);
        }

        super.getItemView(object, v, parent);

        ParseImageView toDoImage = (ParseImageView) v.findViewById(R.id.icon);
        ParseFile imageFile = object.getImageFile();
        if (imageFile != null) {
            toDoImage.setParseFile(imageFile);
            toDoImage.loadInBackground();
        }

        TextView titleTextView = (TextView) v.findViewById(R.id.text1);
        titleTextView.setText(object.getTitle());

        TextView timestampView = (TextView) v.findViewById(R.id.timestamp);
        timestampView.setText(object.getCreatedAt().toString());

        return v;
    }
}
