package com.example.logonrm.fiapandroidretrofitrest;

/**
 * Created by logonrm on 19/06/2017.
 */

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://10.3.1.23:3000";

    public static ICarroAPI getAPIService() {
        return RetroFitClient.getClient(BASE_URL).create(ICarroAPI.class);
    }
}
