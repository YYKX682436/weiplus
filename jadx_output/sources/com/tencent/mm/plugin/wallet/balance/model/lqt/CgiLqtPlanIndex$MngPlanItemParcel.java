package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
class CgiLqtPlanIndex$MngPlanItemParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel> CREATOR = new com.tencent.mm.plugin.wallet.balance.model.lqt.m();

    /* renamed from: d, reason: collision with root package name */
    public boolean f177571d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177572e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f177573f;

    public CgiLqtPlanIndex$MngPlanItemParcel() {
        this.f177573f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f177571d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f177572e);
        parcel.writeList(this.f177573f);
    }

    public CgiLqtPlanIndex$MngPlanItemParcel(android.os.Parcel parcel) {
        this.f177573f = new java.util.ArrayList();
        this.f177571d = parcel.readByte() != 0;
        this.f177572e = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f177573f = arrayList;
        parcel.readList(arrayList, java.lang.Integer.class.getClassLoader());
    }
}
