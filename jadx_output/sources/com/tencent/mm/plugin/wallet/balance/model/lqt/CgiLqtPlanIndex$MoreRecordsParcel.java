package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
class CgiLqtPlanIndex$MoreRecordsParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel> CREATOR = new com.tencent.mm.plugin.wallet.balance.model.lqt.n();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177574d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177575e;

    public CgiLqtPlanIndex$MoreRecordsParcel(android.os.Parcel parcel) {
        this.f177574d = parcel.readString();
        this.f177575e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f177574d);
        parcel.writeString(this.f177575e);
    }
}
