package com.cloudyun.deeperfragmentpagersupport.parse;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by 2013_13_mbp on 12/29/14.
 */
@ParseClassName("ToDo")

public class ToDo extends ParseObject {

    public ToDo() {
    }

    public String getTitle(){
        return getString("title");
    }

    public static ParseQuery<ToDo> getQuery(){
        return ParseQuery.getQuery(ToDo.class);
    }

}
