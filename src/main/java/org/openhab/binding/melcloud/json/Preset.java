package org.openhab.binding.melcloud.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Preset {

    @SerializedName("SetTemperature")
    @Expose
    private Double setTemperature;
    @SerializedName("Power")
    @Expose
    private Boolean power;
    @SerializedName("OperationMode")
    @Expose
    private Integer operationMode;
    @SerializedName("VaneHorizontal")
    @Expose
    private Integer vaneHorizontal;
    @SerializedName("VaneVertical")
    @Expose
    private Integer vaneVertical;
    @SerializedName("FanSpeed")
    @Expose
    private Integer fanSpeed;
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("Client")
    @Expose
    private Integer client;
    @SerializedName("DeviceLocation")
    @Expose
    private Integer deviceLocation;
    @SerializedName("Number")
    @Expose
    private Integer number;
    @SerializedName("Configuration")
    @Expose
    private String configuration;
    @SerializedName("NumberDescription")
    @Expose
    private String numberDescription;

    public Double getSetTemperature() {
        return setTemperature;
    }

    public void setSetTemperature(Double setTemperature) {
        this.setTemperature = setTemperature;
    }

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }

    public Integer getOperationMode() {
        return operationMode;
    }

    public void setOperationMode(Integer operationMode) {
        this.operationMode = operationMode;
    }

    public Integer getVaneHorizontal() {
        return vaneHorizontal;
    }

    public void setVaneHorizontal(Integer vaneHorizontal) {
        this.vaneHorizontal = vaneHorizontal;
    }

    public Integer getVaneVertical() {
        return vaneVertical;
    }

    public void setVaneVertical(Integer vaneVertical) {
        this.vaneVertical = vaneVertical;
    }

    public Integer getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(Integer fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Integer getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(Integer deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getNumberDescription() {
        return numberDescription;
    }

    public void setNumberDescription(String numberDescription) {
        this.numberDescription = numberDescription;
    }

}