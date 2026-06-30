package com.tencent.mm.plugin.location.model;

/* loaded from: classes15.dex */
public class LocationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.location.model.LocationInfo> CREATOR = new va3.q();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144585d;

    /* renamed from: e, reason: collision with root package name */
    public double f144586e;

    /* renamed from: f, reason: collision with root package name */
    public double f144587f;

    /* renamed from: g, reason: collision with root package name */
    public int f144588g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144589h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f144590i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f144591m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f144592n;

    /* renamed from: o, reason: collision with root package name */
    public int f144593o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f144594p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f144595q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f144596r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f144597s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f144598t;

    /* renamed from: u, reason: collision with root package name */
    public float f144599u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f144600v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f144601w;

    public LocationInfo() {
        this.f144585d = "";
        this.f144586e = -85.0d;
        this.f144587f = -1000.0d;
        this.f144589h = "";
        this.f144590i = "zh-cn";
        this.f144592n = "";
        this.f144593o = 0;
        this.f144595q = false;
        this.f144596r = "";
        this.f144597s = "";
        this.f144598t = "";
        this.f144599u = 0.0f;
    }

    public boolean a() {
        return (this.f144586e == -85.0d || this.f144587f == -1000.0d) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return this.f144586e + " " + this.f144587f + " " + this.f144589h + " " + this.f144591m + "  " + this.f144585d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f144585d);
        parcel.writeDouble(this.f144586e);
        parcel.writeDouble(this.f144587f);
        parcel.writeInt(this.f144588g);
        parcel.writeString(this.f144589h);
        parcel.writeString(this.f144590i);
        parcel.writeString(this.f144591m);
        parcel.writeString(this.f144592n);
        parcel.writeInt(this.f144593o);
        parcel.writeString(this.f144594p);
        parcel.writeInt(this.f144595q ? 1 : 0);
        parcel.writeString(this.f144596r);
        parcel.writeString(this.f144597s);
        parcel.writeString(this.f144598t);
        parcel.writeFloat(this.f144599u);
        parcel.writeString(this.f144600v);
        parcel.writeString(this.f144601w);
    }

    public LocationInfo(boolean z17) {
        this.f144585d = "";
        this.f144586e = -85.0d;
        this.f144587f = -1000.0d;
        this.f144589h = "";
        this.f144590i = "zh-cn";
        this.f144592n = "";
        this.f144593o = 0;
        this.f144595q = false;
        this.f144596r = "";
        this.f144597s = "";
        this.f144598t = "";
        this.f144599u = 0.0f;
        this.f144585d = toString() + " " + java.lang.System.nanoTime();
        this.f144588g = z17 ? 20 : 15;
    }
}
