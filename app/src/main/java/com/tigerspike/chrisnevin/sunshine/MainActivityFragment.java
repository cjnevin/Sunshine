package com.tigerspike.chrisnevin.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/45",
                "Weds - Cloudy - 72/63",
                "Thurs - Rainy - 64/51",
                "Fri - Foggy - 70/46",
                "Sat - Sunny - 76/68"
        };

        ArrayList<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
