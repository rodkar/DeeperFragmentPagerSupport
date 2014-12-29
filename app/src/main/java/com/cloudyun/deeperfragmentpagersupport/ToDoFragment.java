package com.cloudyun.deeperfragmentpagersupport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cloudyun.deeperfragmentpagersupport.parse.ToDo;
import com.parse.ParseQueryAdapter;

/**
 * Created by 2013_13_mbp on 12/29/14.
 */
public class ToDoFragment extends Fragment {

    private ParseQueryAdapter<ToDo> toDoAdapter;
    private ListView listView;

    public static ToDoFragment newInstance() {
        ToDoFragment f = new ToDoFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_todo, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        toDoAdapter = new ParseQueryAdapter<ToDo>(getActivity(), "ToDo");
        toDoAdapter.setTextKey("title");

        listView = (ListView) getActivity().findViewById(R.id.list);
        listView.setAdapter(toDoAdapter);
        toDoAdapter.loadObjects();
    }
}
