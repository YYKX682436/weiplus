package com.tencent.mm.plugin.mmsight;

/* loaded from: classes10.dex */
public class SightParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.mmsight.SightParams> CREATOR = new ai3.f();

    /* renamed from: d, reason: collision with root package name */
    public int f148817d;

    /* renamed from: e, reason: collision with root package name */
    public int f148818e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f148819f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f148820g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f148821h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f148822i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f148823m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f148824n;

    /* renamed from: o, reason: collision with root package name */
    public final int f148825o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f148826p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f148827q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f148828r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f148829s;

    /* renamed from: t, reason: collision with root package name */
    public final int f148830t;

    public SightParams(int i17, int i18) {
        this.f148817d = 0;
        this.f148818e = 2;
        this.f148820g = "";
        this.f148821h = "";
        this.f148822i = "";
        this.f148823m = "";
        this.f148824n = true;
        this.f148825o = -1;
        this.f148826p = true;
        this.f148827q = "";
        this.f148828r = true;
        this.f148829s = false;
        this.f148830t = 0;
        if (i17 == 1) {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            this.f148819f = d11.s.fj().cj();
        } else if (i17 == 2 || i17 == 3 || i17 == 4) {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            this.f148819f = d11.s.fj().pj();
        } else if (i17 == 7) {
            this.f148819f = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Di();
        } else {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            this.f148819f = d11.s.fj().pj();
        }
        this.f148825o = i17;
        this.f148817d = i18;
    }

    public com.tencent.mm.plugin.mmsight.SightParams a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f148822i = str;
        this.f148820g = str2;
        this.f148821h = str3;
        this.f148823m = str4;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f148817d);
        parcel.writeParcelable(this.f148819f, i17);
        parcel.writeString(this.f148820g);
        parcel.writeString(this.f148821h);
        parcel.writeString(this.f148822i);
        parcel.writeString(this.f148823m);
        parcel.writeInt(this.f148830t);
        parcel.writeInt(this.f148818e);
        parcel.writeInt(this.f148824n ? 1 : 0);
        parcel.writeInt(this.f148825o);
        parcel.writeByte(this.f148826p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f148827q);
        parcel.writeByte(this.f148828r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f148829s ? (byte) 1 : (byte) 0);
    }

    public SightParams(android.os.Parcel parcel) {
        this.f148817d = 0;
        this.f148818e = 2;
        this.f148820g = "";
        this.f148821h = "";
        this.f148822i = "";
        this.f148823m = "";
        this.f148824n = true;
        this.f148825o = -1;
        this.f148826p = true;
        this.f148827q = "";
        this.f148828r = true;
        this.f148829s = false;
        this.f148830t = 0;
        this.f148817d = parcel.readInt();
        this.f148819f = (com.tencent.mm.modelcontrol.VideoTransPara) parcel.readParcelable(com.tencent.mm.modelcontrol.VideoTransPara.class.getClassLoader());
        this.f148820g = parcel.readString();
        this.f148821h = parcel.readString();
        this.f148822i = parcel.readString();
        this.f148823m = parcel.readString();
        this.f148830t = parcel.readInt();
        this.f148818e = parcel.readInt();
        this.f148824n = parcel.readInt() > 0;
        this.f148825o = parcel.readInt();
        this.f148826p = parcel.readByte() != 0;
        this.f148827q = parcel.readString();
        this.f148828r = parcel.readByte() != 0;
        this.f148829s = parcel.readByte() != 0;
    }
}
