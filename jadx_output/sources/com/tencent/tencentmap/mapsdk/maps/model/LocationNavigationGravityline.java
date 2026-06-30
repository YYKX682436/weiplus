package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class LocationNavigationGravityline {
    private int color;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng destination;
    private float width;

    public LocationNavigationGravityline(float f17, int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.width = f17;
        this.color = i17;
        this.destination = latLng;
    }

    public int getColor() {
        return this.color;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getDestination() {
        return this.destination;
    }

    public float getWidth() {
        return this.width;
    }

    public void setColor(int i17) {
        this.color = i17;
    }

    public void setDestination(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.destination = latLng;
    }

    public void setWidth(float f17) {
        this.width = f17;
    }
}
