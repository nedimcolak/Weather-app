package com.nedim.weather.ViewHolder;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nedim.weather.Model.Weather;
import com.nedim.weather.R;

import java.util.ArrayList;

public class ForecastViewHolder extends RecyclerView.ViewHolder {

    private ImageView weatherIconMini;
    TextView weatherDay;
    TextView weatherDescription;
    TextView maxTemp;
    TextView minTemp;

    public ForecastViewHolder(View itemView) {
        super(itemView);

        weatherIconMini = (ImageView) itemView.findViewById(R.id.weather_icon_mini);
        weatherDay = itemView.findViewById(R.id.weather_day);
        weatherDescription = itemView.findViewById(R.id.weather_description);
        maxTemp = itemView.findViewById(R.id.weather_temp_high);
        minTemp = itemView.findViewById(R.id.weather_temp_low);
    }

    public void updateUI(Weather weather){

        switch (weather.getWeather()){

            case Weather.WEATHER_TYPE_CLOUDS:
                weatherIconMini.setImageDrawable(itemView.getResources().getDrawable(R.drawable.cloudy_mini));
                break;

            case Weather.WEATHER_TYPE_RAIN:
                weatherIconMini.setImageDrawable(itemView.getResources().getDrawable(R.drawable.rainy_mini));
                break;

            case Weather.WEATHER_TYPE_SNOW:
                weatherIconMini.setImageDrawable(itemView.getResources().getDrawable(R.drawable.snow_mini));
                break;

            case Weather.WEATHER_TYPE_WIND:
                weatherIconMini.setImageDrawable(itemView.getResources().getDrawable(R.drawable.cloudy_mini));
            default:
                weatherIconMini.setImageDrawable(itemView.getResources().getDrawable(R.drawable.sunny_mini));
                break;

        }

        weatherDay.setText(weather.getFormattedDate());
        weatherDescription.setText(weather.getWeather());
        maxTemp.setText(weather.getMaxTemp());
        minTemp.setText(weather.getMinTemp());

    }
}

