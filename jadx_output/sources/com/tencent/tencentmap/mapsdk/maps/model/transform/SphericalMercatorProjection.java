package com.tencent.tencentmap.mapsdk.maps.model.transform;

/* loaded from: classes13.dex */
public class SphericalMercatorProjection {
    public static double EARTH_RADIUS = 6378137.0d;
    final double mWorldWidth;

    public SphericalMercatorProjection() {
        this.mWorldWidth = EARTH_RADIUS * 6.283185307179586d;
    }

    public double distanceBetween(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        double d17 = latLng.longitude;
        double d18 = d17 * 0.01745329251994329d;
        double d19 = latLng.latitude * 0.01745329251994329d;
        double d27 = latLng2.longitude * 0.01745329251994329d;
        double d28 = latLng2.latitude * 0.01745329251994329d;
        double sin = java.lang.Math.sin(d18);
        double sin2 = java.lang.Math.sin(d19);
        double cos = java.lang.Math.cos(d18);
        double cos2 = java.lang.Math.cos(d19);
        double sin3 = java.lang.Math.sin(d27);
        double sin4 = java.lang.Math.sin(d28);
        double cos3 = java.lang.Math.cos(d27);
        double cos4 = java.lang.Math.cos(d28);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double d29 = cos3 * cos4;
        double d37 = cos4 * sin3;
        double d38 = dArr[0];
        double d39 = (d38 - d29) * (d38 - d29);
        double d47 = dArr[1];
        double d48 = d39 + ((d47 - d37) * (d47 - d37));
        double d49 = dArr[2];
        return java.lang.Math.asin(java.lang.Math.sqrt(d48 + ((d49 - sin4) * (d49 - sin4))) / 2.0d) * this.mWorldWidth * 3.141592653589793d;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng toLatLng(com.tencent.tencentmap.mapsdk.maps.model.transform.Point point) {
        double d17 = point.f215371x;
        double d18 = this.mWorldWidth;
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (point.f215372y / d18))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d17 / d18) - 0.5d) * 360.0d);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.transform.Point toPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        double d17 = (latLng.longitude / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(latLng.latitude));
        double log = ((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d18 = this.mWorldWidth;
        return new com.tencent.tencentmap.mapsdk.maps.model.transform.Point(d17 * d18, log * d18);
    }

    public SphericalMercatorProjection(double d17) {
        this.mWorldWidth = d17;
    }
}
