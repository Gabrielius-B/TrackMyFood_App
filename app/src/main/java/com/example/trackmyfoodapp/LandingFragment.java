package com.example.trackmyfoodapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LandingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LandingFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LandingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LandingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LandingFragment newInstance(String param1, String param2) {
        LandingFragment fragment = new LandingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_landing, container, false);
        // Add action listener for the each button
        Button buttonSearch = v.findViewById(R.id.buttonSearch);
        buttonSearch.setOnClickListener(this);
        Button buttonSelectDay = v.findViewById(R.id.buttonSelectDay);
        buttonSelectDay.setOnClickListener(this);
        Button buttonViewMeals = v.findViewById(R.id.buttonViewMeals);
        buttonViewMeals.setOnClickListener(this);
        Button buttonAddMeal = v.findViewById(R.id.buttonAddMeal);
        buttonAddMeal.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonSearch){
            Navigation.findNavController(v).navigate(R.id.action_landingFragment_to_queryResults);
        }
        else if (v.getId() == R.id.buttonSelectDay){
            Navigation.findNavController(v).navigate(R.id.action_landingFragment_to_selectDayDiary);
        }
        else if (v.getId() == R.id.buttonViewMeals){
            Navigation.findNavController(v).navigate(R.id.action_landingFragment_to_viewMealsDiary);
        }
        else if (v.getId() == R.id.buttonAddMeal){
            Navigation.findNavController(v).navigate(R.id.action_landingFragment_to_addMealDiary);
        }
    }
}