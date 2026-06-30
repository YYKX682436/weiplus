package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static double f215399a = 6378137.0d;

    /* renamed from: b, reason: collision with root package name */
    public final double f215400b;

    public i() {
        this.f215400b = f215399a * 6.283185307179586d;
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a(com.tencent.mapsdk.raster.model.LatLng latLng) {
        double longitude = (latLng.getLongitude() / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(latLng.getLatitude()));
        double log = ((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d17 = this.f215400b;
        return new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h(longitude * d17, log * d17);
    }

    public i(double d17) {
        this.f215400b = d17;
    }

    public com.tencent.mapsdk.raster.model.LatLng a(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar) {
        double d17 = hVar.f215397a;
        double d18 = this.f215400b;
        return new com.tencent.mapsdk.raster.model.LatLng(90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (hVar.f215398b / d18))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d17 / d18) - 0.5d) * 360.0d);
    }

    public double a(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
        double longitude = latLng.getLongitude();
        double d17 = longitude * 0.01745329251994329d;
        double latitude = latLng.getLatitude() * 0.01745329251994329d;
        double longitude2 = latLng2.getLongitude() * 0.01745329251994329d;
        double latitude2 = latLng2.getLatitude() * 0.01745329251994329d;
        double sin = java.lang.Math.sin(d17);
        double sin2 = java.lang.Math.sin(latitude);
        double cos = java.lang.Math.cos(d17);
        double cos2 = java.lang.Math.cos(latitude);
        double sin3 = java.lang.Math.sin(longitude2);
        double sin4 = java.lang.Math.sin(latitude2);
        double cos3 = java.lang.Math.cos(longitude2);
        double cos4 = java.lang.Math.cos(latitude2);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double d18 = cos3 * cos4;
        double d19 = cos4 * sin3;
        double d27 = dArr[0];
        double d28 = (d27 - d18) * (d27 - d18);
        double d29 = dArr[1];
        double d37 = dArr[2];
        return java.lang.Math.asin(java.lang.Math.sqrt((d28 + ((d29 - d19) * (d29 - d19))) + ((d37 - sin4) * (d37 - sin4))) / 2.0d) * this.f215400b * 3.141592653589793d;
    }
}
