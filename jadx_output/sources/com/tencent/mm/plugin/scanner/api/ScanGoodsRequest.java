package com.tencent.mm.plugin.scanner.api;

/* loaded from: classes.dex */
public class ScanGoodsRequest extends com.tencent.mm.plugin.scanner.api.BaseScanRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.scanner.api.ScanGoodsRequest> CREATOR = new ry3.n();

    /* renamed from: m, reason: collision with root package name */
    public int f158668m;

    /* renamed from: n, reason: collision with root package name */
    public int f158669n;

    /* renamed from: o, reason: collision with root package name */
    public int f158670o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f158671p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f158672q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f158673r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f158674s;

    /* renamed from: t, reason: collision with root package name */
    public int f158675t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f158676u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f158677v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f158678w;

    public ScanGoodsRequest() {
        this.f158675t = 0;
        this.f158662d = true;
        this.f158663e = true;
        this.f158664f = true;
        this.f158665g = true;
        this.f158666h = true;
        this.f158676u = true;
        this.f158677v = false;
        this.f158670o = 0;
    }

    @Override // com.tencent.mm.plugin.scanner.api.BaseScanRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.scanner.api.BaseScanRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f158668m);
        parcel.writeInt(this.f158669n);
        parcel.writeInt(this.f158670o);
        parcel.writeString(this.f158671p);
        parcel.writeString(this.f158672q);
        parcel.writeString(this.f158673r);
        parcel.writeString(this.f158674s);
        parcel.writeInt(this.f158675t);
        parcel.writeByte(this.f158676u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158677v ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f158678w);
    }

    public ScanGoodsRequest(android.os.Parcel parcel) {
        super(parcel);
        this.f158675t = 0;
        this.f158676u = true;
        this.f158677v = false;
        this.f158668m = parcel.readInt();
        this.f158669n = parcel.readInt();
        this.f158670o = parcel.readInt();
        this.f158671p = parcel.readString();
        this.f158672q = parcel.readString();
        this.f158673r = parcel.readString();
        this.f158674s = parcel.readString();
        this.f158675t = parcel.readInt();
        this.f158676u = parcel.readByte() != 0;
        this.f158677v = parcel.readByte() != 0;
        this.f158678w = parcel.readString();
    }
}
