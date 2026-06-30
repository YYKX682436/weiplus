package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
class CgiLqtPlanIndex$BannerParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel> CREATOR = new com.tencent.mm.plugin.wallet.balance.model.lqt.l();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177569d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177570e;

    public CgiLqtPlanIndex$BannerParcel(android.os.Parcel parcel) {
        this.f177569d = parcel.readString();
        this.f177570e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f177569d);
        parcel.writeString(this.f177570e);
    }
}
