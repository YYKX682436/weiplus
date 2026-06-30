package com.tencent.mm.wallet_core.tenpay.model;

/* loaded from: classes9.dex */
public class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo[i17];
    }
}
