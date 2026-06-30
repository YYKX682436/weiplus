package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class CameraPosition {
    public final float bearing;
    public com.tencent.tencentmap.mapsdk.maps.model.LatLng target;
    public final float tilt;
    public final float zoom;

    public CameraPosition(int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19) {
        this.target = latLng;
        this.zoom = f17;
        this.tilt = f18;
        this.bearing = f19;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.Builder builder() {
        return new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.Builder();
    }

    public static final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition fromLatLngZoom(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17) {
        return new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(latLng, f17, 0.0f, 0.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.tencentmap.mapsdk.maps.model.CameraPosition)) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = (com.tencent.tencentmap.mapsdk.maps.model.CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && java.lang.Float.floatToIntBits(this.zoom) == java.lang.Float.floatToIntBits(cameraPosition.zoom) && java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(cameraPosition.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(cameraPosition.bearing);
    }

    public final java.lang.String toString() {
        return "latlng:" + this.target.latitude + "," + this.target.longitude + ",zoom:" + this.zoom + ",tilt=" + this.tilt + ",bearing:" + this.bearing;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.Builder builder(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        return new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.Builder(cameraPosition);
    }

    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: p, reason: collision with root package name */
        private com.tencent.tencentmap.mapsdk.maps.model.LatLng f215350p;

        /* renamed from: q, reason: collision with root package name */
        private float f215351q;

        /* renamed from: r, reason: collision with root package name */
        private float f215352r;

        /* renamed from: s, reason: collision with root package name */
        private float f215353s;

        public Builder() {
            this.f215352r = Float.MIN_VALUE;
            this.f215353s = Float.MIN_VALUE;
        }

        public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.Builder bearing(float f17) {
            this.f215353s = f17;
            return this;
        }

        public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition build() {
            return new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(this.f215350p, this.f215351q, this.f215352r, this.f215353s);
        }

        public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.Builder target(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
            this.f215350p = latLng;
            return this;
        }

        public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.Builder tilt(float f17) {
            this.f215352r = f17;
            return this;
        }

        public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.Builder zoom(float f17) {
            this.f215351q = f17;
            return this;
        }

        public Builder(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
            this.f215352r = Float.MIN_VALUE;
            this.f215353s = Float.MIN_VALUE;
            this.f215350p = cameraPosition.target;
            this.f215351q = cameraPosition.zoom;
            this.f215352r = cameraPosition.tilt;
            this.f215353s = cameraPosition.bearing;
        }
    }

    public CameraPosition(double d17, double d18, float f17, float f18, float f19) {
        this(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d17, d18), f17, f19, f18);
    }

    public CameraPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19) {
        this(1, latLng, f17, f18, f19);
    }
}
