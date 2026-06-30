package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class LatLngBounds implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds> CREATOR = new android.os.Parcelable.Creator<com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds>() { // from class: com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.1
        private static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds a(android.os.Parcel parcel) {
            return com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.readFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds createFromParcel(android.os.Parcel parcel) {
            return com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.readFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds[] newArray(int i17) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds[i17];
        }

        private static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds[] a(int i17) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds[i17];
        }
    };
    private final double latitudeNorth;
    private final double latitudeSouth;
    private final double longitudeEast;
    private final double longitudeWest;
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng northeast;
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng southwest;

    /* loaded from: classes13.dex */
    public static final class Builder {
        private final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> latLngList = new java.util.ArrayList();

        public final com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds build() {
            if (this.latLngList.size() >= 2) {
                return com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.fromLatLngs(this.latLngList);
            }
            throw new com.tencent.tencentmap.mapsdk.maps.exception.InvalidLatLngBoundsException(this.latLngList.size());
        }

        public final com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder include(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
            this.latLngList.addAll(list);
            return this;
        }

        public final com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder include(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
            this.latLngList.add(latLng);
            return this;
        }
    }

    public LatLngBounds(double d17, double d18, double d19, double d27) {
        this.latitudeNorth = d17;
        this.longitudeEast = d18;
        this.latitudeSouth = d19;
        this.longitudeWest = d27;
        this.northeast = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d17, d18);
        this.southwest = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d19, d27);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder builder() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder();
    }

    private static void checkParams(double d17, double d18, double d19, double d27) {
        if (java.lang.Double.isNaN(d17) || java.lang.Double.isNaN(d19)) {
            throw new java.lang.IllegalArgumentException("latitude must not be NaN");
        }
        if (java.lang.Double.isNaN(d18) || java.lang.Double.isNaN(d27)) {
            throw new java.lang.IllegalArgumentException("longitude must not be NaN");
        }
        if (java.lang.Double.isInfinite(d18) || java.lang.Double.isInfinite(d27)) {
            throw new java.lang.IllegalArgumentException("longitude must not be infinite");
        }
        if (d17 > 90.0d || d17 < -90.0d || d19 > 90.0d || d19 < -90.0d) {
            throw new java.lang.IllegalArgumentException("latitude must be between -90 and 90");
        }
        if (d17 < d19) {
            throw new java.lang.IllegalArgumentException("latNorth cannot be less than latSouth");
        }
        if (d18 < d27) {
            throw new java.lang.IllegalArgumentException("lonEast cannot be less than lonWest");
        }
    }

    private boolean containsLatitude(double d17) {
        return d17 <= this.latitudeNorth && d17 >= this.latitudeSouth;
    }

    private boolean containsLongitude(double d17) {
        return d17 <= this.longitudeEast && d17 >= this.longitudeWest;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds from(double d17, double d18, double d19, double d27) {
        checkParams(d17, d18, d19, d27);
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(d17, d18, d19, d27);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds fromLatLngs(java.util.List<? extends com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        double d17 = Double.MAX_VALUE;
        double d18 = 90.0d;
        double d19 = -90.0d;
        double d27 = -1.7976931348623157E308d;
        for (com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng : list) {
            if (latLng != null) {
                double latitude = latLng.getLatitude();
                double longitude = latLng.getLongitude();
                d18 = java.lang.Math.min(d18, latitude);
                d17 = java.lang.Math.min(d17, longitude);
                d19 = java.lang.Math.max(d19, latitude);
                d27 = java.lang.Math.max(d27, longitude);
            }
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(d19, d27, d18, d17);
    }

    private com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds intersectNoParamCheck(double d17, double d18, double d19, double d27) {
        double max = java.lang.Math.max(this.longitudeWest, d27);
        double min = java.lang.Math.min(this.longitudeEast, d18);
        if (min < max) {
            return null;
        }
        double max2 = java.lang.Math.max(this.latitudeSouth, d19);
        double min2 = java.lang.Math.min(this.latitudeNorth, d17);
        if (min2 >= max2) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(min2, min, max2, max);
        }
        return null;
    }

    private static double lat_(int i17, int i18) {
        double pow = 3.141592653589793d - ((i18 * 6.283185307179586d) / java.lang.Math.pow(2.0d, i17));
        return java.lang.Math.toDegrees(java.lang.Math.atan((java.lang.Math.exp(pow) - java.lang.Math.exp(-pow)) * 0.5d));
    }

    private static double lon_(int i17, int i18) {
        return ((i18 / java.lang.Math.pow(2.0d, i17)) * 360.0d) - 180.0d;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds readFromParcel(android.os.Parcel parcel) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    private com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds unionNoParamCheck(double d17, double d18, double d19, double d27) {
        double d28 = this.latitudeNorth;
        double d29 = d28 < d17 ? d17 : d28;
        double d37 = this.longitudeEast;
        if (d37 < d18) {
            d37 = d18;
        }
        double d38 = this.latitudeSouth;
        if (d38 > d19) {
            d38 = d19;
        }
        double d39 = this.longitudeWest;
        if (d39 > d27) {
            d39 = d27;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(d29, d37, d38, d39);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds world() {
        return from(90.0d, 180.0d, -90.0d, -180.0d);
    }

    public boolean contains(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return containsLatitude(latLng.getLatitude()) && containsLongitude(latLng.getLongitude());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds = (com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds) obj;
            if (this.latitudeNorth == latLngBounds.getLatNorth() && this.latitudeSouth == latLngBounds.getLatSouth() && this.longitudeEast == latLngBounds.getLonEast() && this.longitudeWest == latLngBounds.getLonWest()) {
                return true;
            }
        }
        return false;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getCenter() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng((this.latitudeNorth + this.latitudeSouth) / 2.0d, (this.longitudeEast + this.longitudeWest) / 2.0d);
    }

    public double getLatNorth() {
        return this.latitudeNorth;
    }

    public double getLatSouth() {
        return this.latitudeSouth;
    }

    public double getLatitudeSpan() {
        return java.lang.Math.abs(this.latitudeNorth - this.latitudeSouth);
    }

    public double getLonEast() {
        return this.longitudeEast;
    }

    public double getLonWest() {
        return this.longitudeWest;
    }

    public double getLongitudeSpan() {
        return java.lang.Math.abs(this.longitudeEast - this.longitudeWest);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getNorthEast() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.latitudeNorth, this.longitudeEast);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getNorthWest() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.latitudeNorth, this.longitudeWest);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getSouthEast() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.latitudeSouth, this.longitudeEast);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getSouthWest() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.latitudeSouth, this.longitudeWest);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan getSpan() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan(getLatitudeSpan(), getLongitudeSpan());
    }

    public int hashCode() {
        return (int) (this.latitudeNorth + 90.0d + ((this.latitudeSouth + 90.0d) * 1000.0d) + ((this.longitudeEast + 180.0d) * 1000000.0d) + ((this.longitudeWest + 180.0d) * 1.0E9d));
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds include(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder().include(getNorthEast()).include(getSouthWest()).include(latLng).build();
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds including(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return include(latLng);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds intersect(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds) {
        return intersectNoParamCheck(latLngBounds.getLatNorth(), latLngBounds.getLonEast(), latLngBounds.getLatSouth(), latLngBounds.getLonWest());
    }

    public boolean isEmptySpan() {
        return getLongitudeSpan() == 0.0d || getLatitudeSpan() == 0.0d;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng[] toLatLngs() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng[]{getNorthEast(), getSouthWest()};
    }

    public java.lang.String toString() {
        return "N:" + this.latitudeNorth + "; E:" + this.longitudeEast + "; S:" + this.latitudeSouth + "; W:" + this.longitudeWest;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds union(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds) {
        return unionNoParamCheck(latLngBounds.getLatNorth(), latLngBounds.getLonEast(), latLngBounds.getLatSouth(), latLngBounds.getLonWest());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.latitudeNorth);
        parcel.writeDouble(this.longitudeEast);
        parcel.writeDouble(this.latitudeSouth);
        parcel.writeDouble(this.longitudeWest);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds intersect(double d17, double d18, double d19, double d27) {
        checkParams(d17, d18, d19, d27);
        return intersectNoParamCheck(d17, d18, d19, d27);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds from(int i17, int i18, int i19) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(lat_(i17, i19), lon_(i17, i18 + 1), lat_(i17, i19 + 1), lon_(i17, i18));
    }

    public boolean contains(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds) {
        return contains(latLngBounds.getNorthEast()) && contains(latLngBounds.getSouthWest());
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds union(double d17, double d18, double d19, double d27) {
        checkParams(d17, d18, d19, d27);
        return unionNoParamCheck(d17, d18, d19, d27);
    }

    public LatLngBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds build = builder().include(latLng).include(latLng2).build();
        this.latitudeNorth = build.latitudeNorth;
        this.latitudeSouth = build.latitudeSouth;
        this.longitudeEast = build.longitudeEast;
        this.longitudeWest = build.longitudeWest;
        this.northeast = build.northeast;
        this.southwest = build.southwest;
    }
}
