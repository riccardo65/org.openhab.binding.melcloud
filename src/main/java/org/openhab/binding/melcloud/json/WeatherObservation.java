/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.melcloud.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The {@link Structure} is responsible of JSON data For MelCloud API
 * WeatherObservation Data
 * Generated with jsonschema2pojo
 *
 * @author LucaCalcaterra - Initial contribution
 */
public class WeatherObservation {

    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("Sunrise")
    @Expose
    private String sunrise;
    @SerializedName("Sunset")
    @Expose
    private String sunset;
    @SerializedName("Condition")
    @Expose
    private Integer condition;
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("Humidity")
    @Expose
    private Integer humidity;
    @SerializedName("Temperature")
    @Expose
    private Integer temperature;
    @SerializedName("Icon")
    @Expose
    private String icon;
    @SerializedName("ConditionName")
    @Expose
    private String conditionName;
    @SerializedName("Day")
    @Expose
    private Integer day;
    @SerializedName("WeatherType")
    @Expose
    private Integer weatherType;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(Integer weatherType) {
        this.weatherType = weatherType;
    }

}
