package ey5;

/* loaded from: classes13.dex */
public class h implements com.tencent.tencentmap.mapsdk.map.Projection {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.Projection f257651a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap f257652b;

    public h(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap) {
        this.f257651a = tencentMap.getProjection();
        this.f257652b = tencentMap;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public double distanceBetween(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
        double longitude = latLng.getLongitude();
        double latitude = latLng.getLatitude();
        double d17 = longitude * 0.01745329251994329d;
        double d18 = latitude * 0.01745329251994329d;
        double longitude2 = latLng2.getLongitude() * 0.01745329251994329d;
        double latitude2 = latLng2.getLatitude() * 0.01745329251994329d;
        double sin = java.lang.Math.sin(d17);
        double sin2 = java.lang.Math.sin(d18);
        double cos = java.lang.Math.cos(d17);
        double cos2 = java.lang.Math.cos(d18);
        double sin3 = java.lang.Math.sin(longitude2);
        double sin4 = java.lang.Math.sin(latitude2);
        double cos3 = java.lang.Math.cos(longitude2);
        double cos4 = java.lang.Math.cos(latitude2);
        double d19 = (cos * cos2) - (cos3 * cos4);
        double d27 = (cos2 * sin) - (cos4 * sin3);
        double d28 = sin2 - sin4;
        return java.lang.Math.asin(java.lang.Math.sqrt(((d19 * d19) + (d27 * d27)) + (d28 * d28)) / 2.0d) * 1.27420015798544E7d;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public com.tencent.mapsdk.raster.model.LatLng fromScreenLocation(android.graphics.Point point) {
        return ey5.x.a(this.f257651a.fromScreenLocation(point));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public double getLatitudeSpan() {
        com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion visibleRegion = this.f257651a.getVisibleRegion();
        if (visibleRegion == null) {
            return -1.0d;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds = visibleRegion.latLngBounds;
        return latLngBounds.southwest.latitude - latLngBounds.northeast.latitude;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public double getLongitudeSpan() {
        com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion visibleRegion = this.f257651a.getVisibleRegion();
        if (visibleRegion == null) {
            return -1.0d;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds = visibleRegion.latLngBounds;
        return latLngBounds.southwest.longitude - latLngBounds.northeast.longitude;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public float getScalePerPixel() {
        return (float) this.f257651a.metersPerPixel(this.f257652b.getCameraPosition().target.latitude);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public com.tencent.mapsdk.raster.model.VisibleRegion getVisibleRegion() {
        com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion visibleRegion = this.f257651a.getVisibleRegion();
        com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds = null;
        if (visibleRegion == null) {
            return null;
        }
        com.tencent.mapsdk.raster.model.LatLng a17 = ey5.x.a(visibleRegion.nearLeft);
        com.tencent.mapsdk.raster.model.LatLng a18 = ey5.x.a(visibleRegion.nearRight);
        com.tencent.mapsdk.raster.model.LatLng a19 = ey5.x.a(visibleRegion.farLeft);
        com.tencent.mapsdk.raster.model.LatLng a27 = ey5.x.a(visibleRegion.farRight);
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds2 = visibleRegion.latLngBounds;
        if (latLngBounds2 != null && latLngBounds2.northeast != null && latLngBounds2.southwest != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = latLngBounds2.southwest;
            com.tencent.mapsdk.raster.model.LatLng latLng2 = new com.tencent.mapsdk.raster.model.LatLng(latLng.latitude, latLng.longitude);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = latLngBounds2.northeast;
            latLngBounds = new com.tencent.mapsdk.raster.model.LatLngBounds(latLng2, new com.tencent.mapsdk.raster.model.LatLng(latLng3.latitude, latLng3.longitude));
        }
        return new com.tencent.mapsdk.raster.model.VisibleRegion(a17, a18, a19, a27, latLngBounds);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public float metersToEquatorPixels(float f17) {
        return metersToPixels(0.0d, f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public float metersToPixels(double d17, double d18) {
        return (float) (d18 / this.f257651a.metersPerPixel(d17));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public android.graphics.Point toPixels(com.tencent.mapsdk.raster.model.GeoPoint geoPoint, android.graphics.Point point) {
        com.tencent.mapsdk.raster.model.LatLng g2l = com.tencent.mapsdk.raster.model.GeoPoint.g2l(geoPoint);
        if (g2l == null) {
            return null;
        }
        return toScreenLocation(g2l);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.Projection
    public android.graphics.Point toScreenLocation(com.tencent.mapsdk.raster.model.LatLng latLng) {
        return this.f257651a.toScreenLocation(ey5.x.f(latLng));
    }
}
