package com.tencent.mm.sdk.platformtools;

/* loaded from: classes10.dex */
public class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData();
        backwardSupportUtil$ExifHelper$LatLongData.f192409d = parcel.readFloat();
        backwardSupportUtil$ExifHelper$LatLongData.f192410e = parcel.readFloat();
        return backwardSupportUtil$ExifHelper$LatLongData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData[i17];
    }
}
