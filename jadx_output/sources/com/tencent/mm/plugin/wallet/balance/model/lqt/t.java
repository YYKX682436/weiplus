package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class t implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel[i17];
    }
}
