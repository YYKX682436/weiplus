package com.tencent.tencentmap.mapsdk.vector.compat.utils.projection;

/* loaded from: classes13.dex */
public class CameraPositionUtil {
    public static com.tencent.mapsdk.raster.model.CameraPosition a(com.tencent.mapsdk.raster.model.LatLng[] latLngArr, double d17, double d18) {
        int i17;
        double d19 = Double.MAX_VALUE;
        double d27 = Double.MIN_VALUE;
        double d28 = Double.MIN_VALUE;
        double d29 = Double.MAX_VALUE;
        for (com.tencent.mapsdk.raster.model.LatLng latLng : latLngArr) {
            if (latLng.getLatitude() < d19) {
                d19 = latLng.getLatitude();
            }
            if (latLng.getLongitude() < d29) {
                d29 = latLng.getLongitude();
            }
            if (latLng.getLatitude() > d27) {
                d27 = latLng.getLatitude();
            }
            if (latLng.getLongitude() > d28) {
                d28 = latLng.getLongitude();
            }
        }
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i iVar = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i();
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a17 = iVar.a(new com.tencent.mapsdk.raster.model.LatLng(d19, d29));
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a18 = iVar.a(new com.tencent.mapsdk.raster.model.LatLng(d27, d28));
        double d37 = 2.0d;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h((a17.f215397a + a18.f215397a) / 2.0d, (a17.f215398b + a18.f215398b) / 2.0d);
        int i18 = 20;
        while (true) {
            if (i18 < 0) {
                i17 = 0;
                break;
            }
            double pow = 156543.0339d / java.lang.Math.pow(d37, i18);
            double d38 = (a18.f215397a - a17.f215397a) / pow;
            double d39 = ((-a18.f215398b) + a17.f215398b) / pow;
            if (d38 <= d17 && d39 <= d18) {
                i17 = i18;
                break;
            }
            i18--;
            d37 = 2.0d;
        }
        com.tencent.mapsdk.raster.model.LatLng a19 = iVar.a(hVar);
        com.tencent.mapsdk.raster.model.CameraPosition.Builder builder = new com.tencent.mapsdk.raster.model.CameraPosition.Builder();
        builder.target(a19).zoom(i17);
        return builder.build();
    }

    public static com.tencent.mapsdk.raster.model.CameraPosition getCameraPosition(com.tencent.mapsdk.raster.model.LatLng[] latLngArr, double d17, double d18) {
        return a(latLngArr, d17, d18);
    }
}
