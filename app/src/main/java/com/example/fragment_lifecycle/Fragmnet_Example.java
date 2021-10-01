package com.example.fragment_lifecycle;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmnet_Example extends Fragment {

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        Log.i("fragment", "onCreateView: ");
        return inflater.inflate(R.layout.fragment_new,container,false);


    }

    @Override
    public void onAttach(  Context context) {
        super.onAttach(context);
        Log.i("fragment", "onAttach: ");
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        Log.i("fragment", "onActivityCreated: ");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment", "onCreate: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fragment", "onStop: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fragment", "onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragmnet", "onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fragment", "onPause: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fragment", "onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fargment", "onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fragment", "onDetach: ");
    }
}
