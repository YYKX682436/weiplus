package com.tencent.tencentmap.mapsdk.map;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public interface MapController {
    @java.lang.Deprecated
    void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng);

    @java.lang.Deprecated
    void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng, long j17, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback);

    @java.lang.Deprecated
    void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng, java.lang.Runnable runnable);

    @java.lang.Deprecated
    void setCenter(com.tencent.mapsdk.raster.model.LatLng latLng);

    @java.lang.Deprecated
    void setZoom(int i17);

    void zoomToSpan(double d17, double d18);

    void zoomToSpan(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2);
}
