package com.tencent.mm.plugin.recordvideo.jumper;

/* loaded from: classes10.dex */
public class VideoCaptureReportInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo> CREATOR = new ut3.n();

    /* renamed from: d, reason: collision with root package name */
    public int f155690d;

    /* renamed from: e, reason: collision with root package name */
    public final int f155691e;

    /* renamed from: f, reason: collision with root package name */
    public final long f155692f;

    /* renamed from: g, reason: collision with root package name */
    public int f155693g;

    /* renamed from: h, reason: collision with root package name */
    public long f155694h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f155695i;

    /* renamed from: m, reason: collision with root package name */
    public int f155696m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f155697n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f155698o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155699p;

    /* renamed from: q, reason: collision with root package name */
    public int f155700q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f155701r;

    /* renamed from: s, reason: collision with root package name */
    public int f155702s;

    public VideoCaptureReportInfo() {
        this.f155690d = -1;
        this.f155691e = -1;
        this.f155692f = -1L;
        this.f155693g = 0;
        this.f155694h = 0L;
        this.f155695i = null;
        this.f155696m = 0;
        this.f155697n = "";
        this.f155698o = "";
        this.f155699p = "";
        this.f155700q = 0;
        this.f155701r = "";
        this.f155702s = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f155690d);
        parcel.writeInt(this.f155691e);
        parcel.writeLong(this.f155692f);
        parcel.writeInt(this.f155693g);
        parcel.writeLong(this.f155694h);
        parcel.writeString(this.f155695i);
        parcel.writeInt(this.f155696m);
        parcel.writeString(this.f155697n);
        parcel.writeString(this.f155698o);
        parcel.writeString(this.f155699p);
        parcel.writeInt(this.f155700q);
        parcel.writeString(this.f155701r);
        parcel.writeInt(this.f155702s);
    }

    public VideoCaptureReportInfo(android.os.Parcel parcel) {
        this.f155690d = -1;
        this.f155691e = -1;
        this.f155692f = -1L;
        this.f155693g = 0;
        this.f155694h = 0L;
        this.f155695i = null;
        this.f155696m = 0;
        this.f155697n = "";
        this.f155698o = "";
        this.f155699p = "";
        this.f155700q = 0;
        this.f155701r = "";
        this.f155702s = 0;
        this.f155690d = parcel.readInt();
        this.f155691e = parcel.readInt();
        this.f155692f = parcel.readLong();
        this.f155693g = parcel.readInt();
        this.f155694h = parcel.readLong();
        this.f155695i = parcel.readString();
        this.f155696m = parcel.readInt();
        this.f155697n = parcel.readString();
        this.f155698o = parcel.readString();
        this.f155699p = parcel.readString();
        this.f155700q = parcel.readInt();
        this.f155701r = parcel.readString();
        this.f155702s = parcel.readInt();
    }
}
