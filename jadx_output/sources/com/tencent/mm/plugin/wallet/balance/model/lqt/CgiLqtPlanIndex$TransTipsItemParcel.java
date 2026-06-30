package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
class CgiLqtPlanIndex$TransTipsItemParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel> CREATOR = new com.tencent.mm.plugin.wallet.balance.model.lqt.q();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177598d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177599e;

    public CgiLqtPlanIndex$TransTipsItemParcel(android.os.Parcel parcel) {
        this.f177598d = parcel.readString();
        this.f177599e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f177598d);
        parcel.writeString(this.f177599e);
    }
}
