package com.jsystems.qa.qaapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Device {

    @JsonProperty(required = true)
    public String type;

    @JsonProperty(value = "device.model", required = true)
    public List<DeviceModel> deviceModel;
}
