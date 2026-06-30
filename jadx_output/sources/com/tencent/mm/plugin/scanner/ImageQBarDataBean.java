package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class ImageQBarDataBean implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.scanner.ImageQBarDataBean> CREATOR = new com.tencent.mm.plugin.scanner.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158619d;

    /* renamed from: e, reason: collision with root package name */
    public int f158620e;

    /* renamed from: f, reason: collision with root package name */
    public int f158621f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158622g;

    /* renamed from: h, reason: collision with root package name */
    public float f158623h;

    /* renamed from: i, reason: collision with root package name */
    public float f158624i;

    /* renamed from: m, reason: collision with root package name */
    public int f158625m;

    /* renamed from: n, reason: collision with root package name */
    public int f158626n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f158627o;

    /* renamed from: p, reason: collision with root package name */
    public int f158628p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f158629q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.CodePointRect f158630r;

    public ImageQBarDataBean(android.os.Parcel parcel) {
        this.f158619d = parcel.readString();
        this.f158620e = parcel.readInt();
        this.f158621f = parcel.readInt();
        this.f158622g = parcel.readString();
        this.f158623h = parcel.readFloat();
        this.f158624i = parcel.readFloat();
        this.f158625m = parcel.readInt();
        this.f158626n = parcel.readInt();
        this.f158627o = parcel.readString();
        this.f158628p = parcel.readInt();
        this.f158629q = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158619d);
        parcel.writeInt(this.f158620e);
        parcel.writeInt(this.f158621f);
        parcel.writeString(this.f158622g);
        parcel.writeFloat(this.f158623h);
        parcel.writeFloat(this.f158624i);
        parcel.writeInt(this.f158625m);
        parcel.writeInt(this.f158626n);
        parcel.writeString(this.f158627o);
        parcel.writeInt(this.f158628p);
        parcel.writeByte(this.f158629q ? (byte) 1 : (byte) 0);
    }
}
