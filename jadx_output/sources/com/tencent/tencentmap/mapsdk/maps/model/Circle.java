package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface Circle extends com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable, com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable, com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable, com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible, com.tencent.tencentmap.mapsdk.maps.model.IOverlay {
    boolean contains(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    com.tencent.tencentmap.mapsdk.maps.model.LatLng getCenter();

    double getRadius();

    void setCenter(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    void setOptions(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions);

    void setRadius(double d17);
}
