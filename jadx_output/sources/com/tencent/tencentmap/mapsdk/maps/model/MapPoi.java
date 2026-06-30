package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class MapPoi {
    private double latitude;
    private double longitude;
    public java.lang.String name;
    public java.lang.String poiId;
    public com.tencent.tencentmap.mapsdk.maps.model.LatLng position;

    public MapPoi() {
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getPoiId() {
        return this.poiId;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
        return this.position;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.position = latLng;
        this.latitude = latLng.getLatitude();
        this.longitude = latLng.getLongitude();
    }

    public MapPoi(double d17, double d18) {
        this.latitude = d17;
        this.longitude = d18;
        this.position = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d17, d18);
    }

    public MapPoi(double d17, double d18, java.lang.String str) {
        this(d17, d18);
        this.name = str;
    }
}
