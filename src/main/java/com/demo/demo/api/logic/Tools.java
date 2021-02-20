package com.demo.demo.api.logic;

import com.google.gson.JsonObject;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Tools {

    private static final String  HOST_NAME = "hostName";
    private static final String  IP = "ip";
    private static final String  UNKNOWN = "UNKNOWN";
    private static final String  ERROR = "error";

    public static JsonObject getHostNameAndIp() {
        JsonObject jsonResponse = new JsonObject();
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getLocalHost();
            jsonResponse.addProperty(HOST_NAME, inetAddress.getHostName());
            jsonResponse.addProperty(IP, InetAddress.getLocalHost().toString());
        } catch (UnknownHostException e) {
            jsonResponse.addProperty(HOST_NAME, UNKNOWN);
            jsonResponse.addProperty(IP, UNKNOWN);
            jsonResponse.addProperty(ERROR, e.getMessage());
        }
        return jsonResponse;
    }
}
