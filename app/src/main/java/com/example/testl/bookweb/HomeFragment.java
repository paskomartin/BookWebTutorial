package com.example.testl.bookweb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// yt
// https://youtu.be/OrMP2RWSPeg?t=39m19s
public class HomeFragment extends Fragment  {

    private RecyclerView recyclerView;
    private CommentAdapter commentAdapter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //
        getActivity().setTitle("BookWeb test");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        commentAdapter = new CommentAdapter();
        recyclerView.setAdapter(commentAdapter);

        return rootView;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }


}

// DEPRECATED
/*
public class HomeFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public HomeFragment newInstance(int sectionNumber) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public HomeFragment(){
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public void onAttach(Activity activity) {
        supe
        super.onAttach(activity);
        ((HomeActivity)activity).onSectionAttached(getArguments().getInt(ARG_SECTION_NUMBER));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_home, container, false);
        return rootView;
    }
}
*/