package com.unionpay.tsmservice.mi.mini.result;

/* loaded from: classes13.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.unionpay.tsmservice.mi.mini.result.QueryVendorPayStatusResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i17) {
        return new com.unionpay.tsmservice.mi.mini.result.QueryVendorPayStatusResult[i17];
    }
}
