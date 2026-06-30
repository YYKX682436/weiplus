package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class LatLngSpan implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan> CREATOR = new android.os.Parcelable.Creator<com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan>() { // from class: com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan.1
        private static com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan a(android.os.Parcel parcel) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan[] newArray(int i17) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan[i17];
        }

        private static com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan[] a(int i17) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan[i17];
        }
    };
    private double mLatitudeSpan;
    private double mLongitudeSpan;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan latLngSpan = (com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan) obj;
            if (this.mLongitudeSpan == latLngSpan.getLongitudeSpan() && this.mLatitudeSpan == latLngSpan.getLatitudeSpan()) {
                return true;
            }
        }
        return false;
    }

    public double getLatitudeSpan() {
        return this.mLatitudeSpan;
    }

    public double getLongitudeSpan() {
        return this.mLongitudeSpan;
    }

    public int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.mLatitudeSpan);
        int i17 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.mLongitudeSpan);
        return (i17 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public void setLatitudeSpan(double d17) {
        this.mLatitudeSpan = d17;
    }

    public void setLongitudeSpan(double d17) {
        this.mLongitudeSpan = d17;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.mLatitudeSpan);
        parcel.writeDouble(this.mLongitudeSpan);
    }

    private LatLngSpan(android.os.Parcel parcel) {
        this.mLatitudeSpan = parcel.readDouble();
        this.mLongitudeSpan = parcel.readDouble();
    }

    public LatLngSpan(double d17, double d18) {
        this.mLatitudeSpan = d17;
        this.mLongitudeSpan = d18;
    }
}
