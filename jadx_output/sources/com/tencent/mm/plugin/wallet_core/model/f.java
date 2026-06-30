package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.wallet_core.model.Orders.FinderInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.wallet_core.model.Orders.FinderInfo[i17];
    }
}
