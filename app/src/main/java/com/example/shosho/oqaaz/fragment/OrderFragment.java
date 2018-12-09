package com.example.shosho.oqaaz.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.example.shosho.oqaaz.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {

Toolbar toolbar;
    public OrderFragment() {
        // Required empty public constructor
    }

View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate( R.layout.fragment_order, container, false );
        toolbar=view.findViewById( R.id.home_toolbar );
        toolbar.setSubtitle( "Order" );
        return view;
    }

}
