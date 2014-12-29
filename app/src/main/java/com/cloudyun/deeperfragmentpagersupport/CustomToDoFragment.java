package com.cloudyun.deeperfragmentpagersupport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cloudyun.deeperfragmentpagersupport.parse.CustomToDo;

/**
 * Created by 2013_13_mbp on 12/29/14.
 */
public class CustomToDoFragment extends Fragment {

    private CustomToDoAdapter mCustomToDoAdapter;
    private ListView listView;

    public static CustomToDoFragment newInstance() {
        CustomToDoFragment f = new CustomToDoFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_todo_custom, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mCustomToDoAdapter = new CustomToDoAdapter(getActivity());

        listView = (ListView) getActivity().findViewById(R.id.customlist);
        listView.setAdapter(mCustomToDoAdapter);
        mCustomToDoAdapter.loadObjects();
    }
}
