package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class CreExtInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.CreExtInfo> CREATOR = new at4.q();

    /* renamed from: d, reason: collision with root package name */
    public int f179623d;

    /* renamed from: e, reason: collision with root package name */
    public int f179624e;

    /* renamed from: f, reason: collision with root package name */
    public int f179625f;

    /* renamed from: g, reason: collision with root package name */
    public int f179626g;

    public CreExtInfo(android.os.Parcel parcel) {
        this.f179623d = parcel.readInt();
        this.f179624e = parcel.readInt();
        this.f179625f = parcel.readInt();
        this.f179626g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f179623d);
        parcel.writeInt(this.f179624e);
        parcel.writeInt(this.f179625f);
        parcel.writeInt(this.f179626g);
    }
}
