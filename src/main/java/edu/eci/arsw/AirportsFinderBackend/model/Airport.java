package edu.eci.arsw.AirportsFinderBackend.model;

import java.util.List;

public class Airport {

    private String airportId;

    private String code;

    private String name;

    private Location location;

    private String cityId;

    private String city;

    private String countryCode;
    private List<String> themes;

    private List<String> pointsOfSale;

    

    public String getAirportId() {
        return airportId;
    }

    public List<String> getPointsOfSale() {
        return pointsOfSale;
    }

    public void setPointsOfSale(List<String> pointsOfSale) {
        this.pointsOfSale = pointsOfSale;
    }

    public List<String> getThemes() {
        return themes;
    }

    public void setThemes(List<String> themes) {
        this.themes = themes;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }


}