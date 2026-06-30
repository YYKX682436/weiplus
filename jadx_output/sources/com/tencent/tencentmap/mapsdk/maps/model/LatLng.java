package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class LatLng implements android.os.Parcelable, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate {
    public static final android.os.Parcelable.Creator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> CREATOR = new android.os.Parcelable.Creator<com.tencent.tencentmap.mapsdk.maps.model.LatLng>() { // from class: com.tencent.tencentmap.mapsdk.maps.model.LatLng.1
        private static com.tencent.tencentmap.mapsdk.maps.model.LatLng a(android.os.Parcel parcel) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LatLng createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LatLng[] newArray(int i17) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng[i17];
        }

        private static com.tencent.tencentmap.mapsdk.maps.model.LatLng[] a(int i17) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng[i17];
        }
    };
    public double altitude;
    public double latitude;
    public double longitude;
    private boolean throwException;

    /* loaded from: classes13.dex */
    public static class Builder {
        private double mAltitude;
        private double mLatitude;
        private double mLongitude;
        private final boolean mThrowException;

        public Builder(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, boolean z17) {
            if (latLng != null) {
                this.mLongitude = latLng.getLongitude();
                this.mLatitude = latLng.getLatitude();
                this.mAltitude = latLng.getAltitude();
            }
            this.mThrowException = z17;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LatLng build() {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.mLatitude, this.mLongitude, this.mAltitude, this.mThrowException);
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder setAltitude(double d17) {
            this.mAltitude = d17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder setLatitude(double d17) {
            this.mLatitude = d17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder setLongitude(double d17) {
            this.mLongitude = d17;
            return this;
        }
    }

    public LatLng() {
        this.altitude = 0.0d;
        this.throwException = false;
        this.latitude = 0.0d;
        this.longitude = 0.0d;
    }

    private void doThrowException(double d17, double d18, double d19, boolean z17) {
        this.throwException = z17;
        if (z17) {
            setLatitudeThrowException(d17);
            setLongitudeThrowException(d18);
        } else {
            setLatitude(d17);
            setLongitude(d18);
        }
        setAltitude(d19);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder newBuilder() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder(null, false);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder newBuilderThrowException() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder(null, true);
    }

    public static double wrap(double d17, double d18, double d19) {
        double d27 = d19 - d18;
        double d28 = (((d17 - d18) % d27) + d27) % d27;
        return (d17 < d19 || d28 != 0.0d) ? d28 + d18 : d19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = (com.tencent.tencentmap.mapsdk.maps.model.LatLng) obj;
            if (java.lang.Double.compare(latLng.altitude, this.altitude) == 0 && java.lang.Double.compare(latLng.latitude, this.latitude) == 0 && java.lang.Double.compare(latLng.longitude, this.longitude) == 0) {
                return true;
            }
        }
        return false;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.longitude);
        int i17 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.altitude);
        return (i17 * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public boolean isThrowException() {
        return this.throwException;
    }

    public void setAltitude(double d17) {
        this.altitude = d17;
    }

    public void setLatitude(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d("latitude must not be NaN");
        } else if (java.lang.Math.abs(d17) > 90.0d) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d("latitude must be between -90 and 90");
        } else {
            this.latitude = d17;
        }
    }

    public void setLatitudeThrowException(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            throw new java.lang.IllegalArgumentException("latitude must not be NaN");
        }
        if (java.lang.Math.abs(d17) > 90.0d) {
            throw new java.lang.IllegalArgumentException("latitude must be between -90 and 90");
        }
        this.latitude = d17;
    }

    public void setLongitude(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d("longitude must not be NaN");
        } else if (java.lang.Double.isInfinite(d17)) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d("longitude must not be infinite");
        } else {
            this.longitude = d17;
        }
    }

    public void setLongitudeThrowException(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            throw new java.lang.IllegalArgumentException("longitude must not be NaN");
        }
        if (java.lang.Double.isInfinite(d17)) {
            throw new java.lang.IllegalArgumentException("longitude must not be infinite");
        }
        this.longitude = d17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public void setX(double d17) {
        this.latitude = d17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public void setY(double d17) {
        this.longitude = d17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public void setZ(double d17) {
        this.altitude = d17;
    }

    public java.lang.String toString() {
        return "LatLng [latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.altitude);
        parcel.writeByte(this.throwException ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public double x() {
        return this.latitude;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public double y() {
        return this.longitude;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public double z() {
        return this.altitude;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder newBuilder(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder(latLng, false);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder newBuilderThrowException(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng.Builder(latLng, true);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng wrap() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.latitude, wrap(this.longitude, -180.0d, 180.0d));
    }

    public LatLng(double d17, double d18) {
        this.altitude = 0.0d;
        this.throwException = false;
        setLatitude(d17);
        setLongitude(d18);
    }

    public LatLng(double d17, double d18, double d19) {
        this.altitude = 0.0d;
        this.throwException = false;
        setLatitude(d17);
        setLongitude(d18);
        setAltitude(d19);
    }

    public LatLng(double d17, double d18, double d19, boolean z17) {
        this.altitude = 0.0d;
        this.throwException = false;
        doThrowException(d17, d18, d19, z17);
    }

    public LatLng(android.location.Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    public LatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.altitude = 0.0d;
        this.throwException = false;
        this.latitude = latLng.latitude;
        this.longitude = latLng.longitude;
        this.altitude = latLng.altitude;
        this.throwException = latLng.throwException;
    }

    public LatLng(android.os.Parcel parcel) {
        this.altitude = 0.0d;
        this.throwException = false;
        doThrowException(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readByte() != 0);
    }
}
