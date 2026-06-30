package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public interface Projection {
    double distanceBetween(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2);

    com.tencent.mapsdk.raster.model.LatLng fromScreenLocation(android.graphics.Point point);

    double getLatitudeSpan();

    double getLongitudeSpan();

    float getScalePerPixel();

    com.tencent.mapsdk.raster.model.VisibleRegion getVisibleRegion();

    float metersToEquatorPixels(float f17);

    float metersToPixels(double d17, double d18);

    @java.lang.Deprecated
    android.graphics.Point toPixels(com.tencent.mapsdk.raster.model.GeoPoint geoPoint, android.graphics.Point point);

    android.graphics.Point toScreenLocation(com.tencent.mapsdk.raster.model.LatLng latLng);
}
