package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface Polygon extends com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable, com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable, com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable, com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable<java.lang.Object>, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible, com.tencent.tencentmap.mapsdk.maps.model.IOverlay {
    boolean contains(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getPoints();

    void setHolePoints(java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list);

    void setOptions(com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions);

    void setPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list);
}
