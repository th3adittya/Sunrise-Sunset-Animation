package com.hexapalsllc.sunrisesunsetanimation.Formatter;

import com.hexapalsllc.sunrisesunsetanimation.Models.Time;

public interface SunriseSunsetLabelFormatter {

    String formatSunriseLabel(Time sunrise);

    String formatSunsetLabel(Time sunset);
}