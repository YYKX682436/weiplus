package com.tencent.mm.plugin.remittance.mobile.cgi;

/* loaded from: classes9.dex */
public class NetSceneMobileRemitGetRecvInfo$DelayOptionParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo$DelayOptionParcel> CREATOR = new sw3.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156554d;

    /* renamed from: e, reason: collision with root package name */
    public final int f156555e;

    public NetSceneMobileRemitGetRecvInfo$DelayOptionParcel(r45.bd0 bd0Var) {
        this.f156554d = bd0Var.f370673d;
        this.f156555e = bd0Var.f370674e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f156554d);
        parcel.writeInt(this.f156555e);
    }

    public NetSceneMobileRemitGetRecvInfo$DelayOptionParcel(android.os.Parcel parcel) {
        this.f156554d = parcel.readString();
        this.f156555e = parcel.readInt();
    }
}
