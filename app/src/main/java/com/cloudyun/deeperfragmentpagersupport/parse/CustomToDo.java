package com.cloudyun.deeperfragmentpagersupport.parse;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by 2013_13_mbp on 12/29/14.
 */
@ParseClassName("ParseQueryAdapterTutorial")

public class CustomToDo extends ParseObject {

    public CustomToDo() {
    }

    public String getTitle(){
        return getString("title");
    }

    public ParseFile getImageFile() {
        return getParseFile("image");
    }
    public static ParseQuery<CustomToDo> getQuery(){
        return ParseQuery.getQuery(CustomToDo.class);
    }
}
