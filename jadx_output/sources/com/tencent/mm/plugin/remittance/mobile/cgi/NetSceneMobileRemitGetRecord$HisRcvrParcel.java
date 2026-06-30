package com.tencent.mm.plugin.remittance.mobile.cgi;

/* loaded from: classes9.dex */
public class NetSceneMobileRemitGetRecord$HisRcvrParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord$HisRcvrParcel> CREATOR = new sw3.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156548d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f156549e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f156550f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f156551g;

    /* renamed from: h, reason: collision with root package name */
    public final long f156552h;

    /* renamed from: i, reason: collision with root package name */
    public final int f156553i;

    public NetSceneMobileRemitGetRecord$HisRcvrParcel(r45.ow3 ow3Var) {
        this.f156548d = ow3Var.f382575d;
        this.f156549e = ow3Var.f382576e;
        this.f156550f = ow3Var.f382577f;
        this.f156551g = ow3Var.f382578g;
        this.f156552h = ow3Var.f382579h;
        this.f156553i = ow3Var.f382580i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f156548d);
        parcel.writeString(this.f156549e);
        parcel.writeString(this.f156550f);
        parcel.writeString(this.f156551g);
        parcel.writeLong(this.f156552h);
        parcel.writeInt(this.f156553i);
    }

    public NetSceneMobileRemitGetRecord$HisRcvrParcel(android.os.Parcel parcel) {
        this.f156548d = parcel.readString();
        this.f156549e = parcel.readString();
        this.f156550f = parcel.readString();
        this.f156551g = parcel.readString();
        this.f156552h = parcel.readLong();
        this.f156553i = parcel.readInt();
    }
}
