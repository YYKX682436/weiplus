package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class MyLocationStyle {
    public static final int LOCATION_TYPE_FOLLOW_NO_CENTER = 2;
    public static final int LOCATION_TYPE_LOCATION_ROTATE = 0;
    public static final int LOCATION_TYPE_LOCATION_ROTATE_NO_CENTER = 1;
    public static final int LOCATION_TYPE_MAP_ROTATE_NO_CENTER = 3;
    private int circleZIndex;
    private com.tencent.tencentmap.mapsdk.maps.model.LocationCompass locationCompass;
    private com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline locationNavigationGravityline;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor mIcon;
    private float anchorU = 0.5f;
    private float anchorV = 0.5f;
    private int fillColor = android.graphics.Color.argb(102, 0, 163, 255);
    private int strokeColor = android.graphics.Color.argb(127, 0, 163, 255);
    private float strokeWidth = 1.0f;
    private int circleLevel = -1;
    private int myLocationZIndex = 10000000;
    private int myLocationLevel = -1;
    private int myLocationType = 0;

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle anchor(float f17, float f18) {
        this.anchorU = f17;
        this.anchorV = f18;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle fillColor(int i17) {
        this.fillColor = i17;
        return this;
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    public int getCircleLevel() {
        return this.circleLevel;
    }

    public int getCircleZIndex() {
        return this.circleZIndex;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LocationCompass getLocationCompass() {
        return this.locationCompass;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline getLocationNavigationGravityline() {
        return this.locationNavigationGravityline;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor getMyLocationIcon() {
        return this.mIcon;
    }

    public int getMyLocationLevel() {
        return this.myLocationLevel;
    }

    public int getMyLocationType() {
        return this.myLocationType;
    }

    public int getMyLocationZIndex() {
        return this.myLocationZIndex;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle icon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.mIcon = bitmapDescriptor;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationType(int i17) {
        this.myLocationType = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle setCircleLevel(int i17) {
        this.circleLevel = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle setCircleZIndex(int i17) {
        this.circleZIndex = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle setLocationCompass(com.tencent.tencentmap.mapsdk.maps.model.LocationCompass locationCompass) {
        this.locationCompass = locationCompass;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle setLocationNavigationGravityline(com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline locationNavigationGravityline) {
        this.locationNavigationGravityline = locationNavigationGravityline;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle setMyLocationLevel(int i17) {
        this.myLocationLevel = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle setMyLocationZIndex(int i17) {
        this.myLocationZIndex = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle strokeColor(int i17) {
        this.strokeColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle strokeWidth(int i17) {
        this.strokeWidth = i17;
        return this;
    }

    public java.lang.String toString() {
        return "{anchorU=" + this.anchorU + ", anchorV=" + this.anchorV + ", fillColor=" + this.fillColor + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ", myLocationType=" + this.myLocationType + ", mIcon=" + this.mIcon + ", circleZIndex=" + this.circleZIndex + ", circleLevel=" + this.circleLevel + ", myLocationZIndex=" + this.myLocationZIndex + ", myLocationLevel=" + this.myLocationLevel + '}';
    }
}
