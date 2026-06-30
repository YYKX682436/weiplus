package com.tencent.tencentmap.mapsdk.maps.utils;

/* loaded from: classes13.dex */
public class TencentMapUtils {
    public static double calculateArea(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        return com.tencent.mapsdk.internal.lf.a(list);
    }

    public static boolean hitTestPolyline(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, double d17) {
        return com.tencent.mapsdk.internal.lf.a(latLng, list, d17);
    }

    public static double meterToMercator(double d17, double d18) {
        return com.tencent.mapsdk.internal.lf.a(d17, d18);
    }

    public static double pixelToMercator(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap, double d17) {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng center = tencentMap.getProjection().getVisibleRegion().latLngBounds.getCenter();
        return tencentMap.getProjection().fromScreenLocation(new android.graphics.Point((int) (r1.x + d17), tencentMap.getProjection().toScreenLocation(center).y)).longitude - center.longitude;
    }
}
