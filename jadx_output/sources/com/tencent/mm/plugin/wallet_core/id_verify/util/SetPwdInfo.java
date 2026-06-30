package com.tencent.mm.plugin.wallet_core.id_verify.util;

/* loaded from: classes9.dex */
public class SetPwdInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo> CREATOR = new zs4.r();

    /* renamed from: d, reason: collision with root package name */
    public int f179512d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179513e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179514f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179515g;

    public SetPwdInfo() {
        this.f179514f = "";
        this.f179515g = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f179512d);
        parcel.writeString(this.f179513e);
        parcel.writeString(this.f179514f);
        parcel.writeString(this.f179515g);
    }

    public SetPwdInfo(android.os.Parcel parcel) {
        this.f179514f = "";
        this.f179515g = "";
        this.f179512d = parcel.readInt();
        this.f179513e = parcel.readString();
        this.f179514f = parcel.readString();
        this.f179515g = parcel.readString();
    }
}
