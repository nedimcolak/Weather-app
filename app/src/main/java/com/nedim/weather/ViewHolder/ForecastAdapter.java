package com.nedim.weather.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nedim.weather.Model.Weather;
import com.nedim.weather.R;

import java.util.ArrayList;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastViewHolder>{

    ArrayList<Weather> weatherList;

    public ForecastAdapter(ArrayList<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    @NonNull
    @Override
    public ForecastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather, parent, false);
        return new ForecastViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastViewHolder holder, int position) {
        Weather weather = weatherList.get(position);
        holder.updateUI(weather);
    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }
}
