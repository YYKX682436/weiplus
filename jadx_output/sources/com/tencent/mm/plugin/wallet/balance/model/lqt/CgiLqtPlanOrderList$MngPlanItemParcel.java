package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
class CgiLqtPlanOrderList$MngPlanItemParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel> CREATOR = new com.tencent.mm.plugin.wallet.balance.model.lqt.s();

    /* renamed from: d, reason: collision with root package name */
    public boolean f177600d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177601e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f177602f;

    public CgiLqtPlanOrderList$MngPlanItemParcel() {
        this.f177602f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f177600d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f177601e);
        parcel.writeList(this.f177602f);
    }

    public CgiLqtPlanOrderList$MngPlanItemParcel(android.os.Parcel parcel) {
        this.f177602f = new java.util.ArrayList();
        this.f177600d = parcel.readByte() != 0;
        this.f177601e = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f177602f = arrayList;
        parcel.readList(arrayList, java.lang.Integer.class.getClassLoader());
    }
}
