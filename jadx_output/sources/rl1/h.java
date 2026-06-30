package rl1;

/* loaded from: classes13.dex */
public class h {
    public rl1.g a(com.tencent.mapsdk.raster.model.LatLng latLng) {
        double longitude = (latLng.getLongitude() / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(latLng.getLatitude()));
        return new rl1.g(longitude * 4.007501668557849E7d, (((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 4.007501668557849E7d);
    }
}
