package com.example.logogame;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.logogame.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InsideLevel.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class InsideLevel extends Fragment {
    ImageView image ;
    //    INITIAL RECYCLER VIEW  ///
    RecyclerView imagesWindowsRecyclerView;
    private AdapterForImagesWindow mAdapter;
    private OnFragmentInteractionListener mListener;

    public InsideLevel() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_inside_level, container, false);
        imagesWindowsRecyclerView = view.findViewById(R.id.inside_level_recycler_view) ;
        imagesWindowsRecyclerView.setLayoutManager(new GridLayoutManager(getContext() ,5));
        mAdapter = new AdapterForImagesWindow(getLogos(),mListener) ;
        imagesWindowsRecyclerView.setAdapter(mAdapter);
        return view ;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(int position) {
        if (mListener != null) {
            mListener.onFragmentInteraction(position);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(int position);
    }
    public ArrayList<LogoItem> getLogos () {
        ArrayList<LogoItem> logos = new ArrayList<>() ;


        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;
        logos.add(new LogoItem(R.drawable.pppppppppp, "Shlomo Artsi")) ;

        return logos ;
    }
}
