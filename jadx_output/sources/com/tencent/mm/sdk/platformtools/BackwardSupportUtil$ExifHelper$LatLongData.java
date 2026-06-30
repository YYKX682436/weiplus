package com.tencent.mm.sdk.platformtools;

/* loaded from: classes10.dex */
public class BackwardSupportUtil$ExifHelper$LatLongData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData> CREATOR = new com.tencent.mm.sdk.platformtools.k();

    /* renamed from: d, reason: collision with root package name */
    public float f192409d;

    /* renamed from: e, reason: collision with root package name */
    public float f192410e;

    public BackwardSupportUtil$ExifHelper$LatLongData() {
        this.f192409d = 0.0f;
        this.f192410e = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData = (com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData) obj;
        return java.lang.Math.abs(this.f192409d - backwardSupportUtil$ExifHelper$LatLongData.f192409d) < 1.0E-6f && java.lang.Math.abs(this.f192410e - backwardSupportUtil$ExifHelper$LatLongData.f192410e) < 1.0E-6f;
    }

    public int hashCode() {
        return ((int) (this.f192409d * 10000.0f)) + ((int) (this.f192410e * 10000.0f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f192409d);
        parcel.writeFloat(this.f192410e);
    }

    public BackwardSupportUtil$ExifHelper$LatLongData(float f17, float f18) {
        this.f192409d = f17;
        this.f192410e = f18;
    }
}
