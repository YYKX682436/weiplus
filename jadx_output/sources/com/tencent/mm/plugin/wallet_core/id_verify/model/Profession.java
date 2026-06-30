package com.tencent.mm.plugin.wallet_core.id_verify.model;

/* loaded from: classes9.dex */
public class Profession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.id_verify.model.Profession> CREATOR = new ys4.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f179421d;

    /* renamed from: e, reason: collision with root package name */
    public final int f179422e;

    public Profession(java.lang.String str, int i17) {
        this.f179421d = str;
        this.f179422e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f179421d);
        parcel.writeInt(this.f179422e);
    }

    public Profession(android.os.Parcel parcel) {
        this.f179421d = parcel.readString();
        this.f179422e = parcel.readInt();
    }
}
