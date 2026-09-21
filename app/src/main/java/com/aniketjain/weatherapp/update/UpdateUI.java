package com.aniketjain.weatherapp.update;

import android.content.Context;

import com.aniketjain.weatherapp.R;

public class UpdateUI {
    private UpdateUI() {}

    public static String getIconID(int condition, long update_time, long sunrise, long sunset) {
        if (condition >= 200 && condition <= 232) return "thunderstorm";
        if (condition >= 300 && condition <= 321) return "drizzle";
        if (condition >= 500 && condition <= 531) return "rain";
        if (condition >= 600 && condition <= 622) return "snow";
        if (condition >= 701 && condition <= 781) return "wind";
        
        if (condition == 800) {
            return (update_time >= sunrise && update_time <= sunset) ? "clear_day" : "clear_night";
        }
        if (condition == 801) {
            return (update_time >= sunrise && update_time <= sunset) ? "few_clouds_day" : "few_clouds_night";
        }
        if (condition == 802) return "scattered_clouds";
        if (condition == 803 || condition == 804) return "broken_clouds";
        
        return null;
    }

    public static String TranslateDay(String dayToBeTranslated, Context context) {
        switch (dayToBeTranslated.trim()) {
            case "Monday":
                return context.getResources().getString(R.string.monday);
            case "Tuesday":
                return context.getResources().getString(R.string.tuesday);
            case "Wednesday":
                return context.getResources().getString(R.string.wednesday);
            case "Thursday":
                return context.getResources().getString(R.string.thursday);
            case "Friday":
                return context.getResources().getString(R.string.friday);
            case "Saturday":
                return context.getResources().getString(R.string.saturday);
            case "Sunday":
                return context.getResources().getString(R.string.sunday);
            default:
                return dayToBeTranslated;
        }
    }
}
