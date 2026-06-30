package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public interface Projection {
    com.tencent.tencentmap.mapsdk.maps.model.LatLng fromScreenLocation(android.graphics.Point point);

    com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion getVisibleRegion();

    float[] glModelMatrix(android.graphics.PointF pointF, float f17);

    float glPixelRatio();

    float[] glProjectionMatrix();

    android.graphics.PointF glVertexForCoordinate(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    float[] glViewMatrix();

    double metersPerPixel(double d17);

    double metersPerPixel(double d17, double d18);

    android.graphics.Point toScreenLocation(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);
}
