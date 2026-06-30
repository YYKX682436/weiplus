package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class Authen implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Authen> CREATOR = new at4.b();
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f179541J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public int N;
    public java.lang.String P;
    public java.lang.String Q;
    public int R;
    public java.lang.String S;
    public java.lang.String T;

    /* renamed from: d, reason: collision with root package name */
    public int f179542d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179544f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179545g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179546h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179547i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179548m;

    /* renamed from: n, reason: collision with root package name */
    public int f179549n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f179550o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179551p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f179552q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f179553r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f179554s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f179555t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f179556u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f179558w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f179559x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f179560y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f179561z;

    /* renamed from: e, reason: collision with root package name */
    public int f179543e = 0;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f179557v = new com.tencent.mm.pluginsdk.wallet.PayInfo();

    public Authen() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f179542d);
        java.lang.String str = this.f179544f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f179545g;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f179546h;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        java.lang.String str4 = this.f179547i;
        if (str4 == null) {
            str4 = "";
        }
        parcel.writeString(str4);
        java.lang.String str5 = this.f179548m;
        if (str5 == null) {
            str5 = "";
        }
        parcel.writeString(str5);
        parcel.writeInt(this.f179549n);
        java.lang.String str6 = this.f179550o;
        if (str6 == null) {
            str6 = "";
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f179551p;
        if (str7 == null) {
            str7 = "";
        }
        parcel.writeString(str7);
        java.lang.String str8 = this.f179552q;
        if (str8 == null) {
            str8 = "";
        }
        parcel.writeString(str8);
        java.lang.String str9 = this.f179553r;
        if (str9 == null) {
            str9 = "";
        }
        parcel.writeString(str9);
        java.lang.String str10 = this.f179554s;
        if (str10 == null) {
            str10 = "";
        }
        parcel.writeString(str10);
        java.lang.String str11 = this.f179558w;
        if (str11 == null) {
            str11 = "";
        }
        parcel.writeString(str11);
        java.lang.String str12 = this.f179559x;
        if (str12 == null) {
            str12 = "";
        }
        parcel.writeString(str12);
        java.lang.String str13 = this.f179560y;
        if (str13 == null) {
            str13 = "";
        }
        parcel.writeString(str13);
        java.lang.String str14 = this.f179561z;
        if (str14 == null) {
            str14 = "";
        }
        parcel.writeString(str14);
        java.lang.String str15 = this.A;
        if (str15 == null) {
            str15 = "";
        }
        parcel.writeString(str15);
        java.lang.String str16 = this.B;
        if (str16 == null) {
            str16 = "";
        }
        parcel.writeString(str16);
        java.lang.String str17 = this.C;
        if (str17 == null) {
            str17 = "";
        }
        parcel.writeString(str17);
        java.lang.String str18 = this.D;
        if (str18 == null) {
            str18 = "";
        }
        parcel.writeString(str18);
        java.lang.String str19 = this.E;
        if (str19 == null) {
            str19 = "";
        }
        parcel.writeString(str19);
        java.lang.String str20 = this.F;
        if (str20 == null) {
            str20 = "";
        }
        parcel.writeString(str20);
        java.lang.String str21 = this.G;
        if (str21 == null) {
            str21 = "";
        }
        parcel.writeString(str21);
        java.lang.String str22 = this.H;
        if (str22 == null) {
            str22 = "";
        }
        parcel.writeString(str22);
        java.lang.String str23 = this.f179556u;
        if (str23 == null) {
            str23 = "";
        }
        parcel.writeString(str23);
        java.lang.String str24 = this.I;
        if (str24 == null) {
            str24 = "";
        }
        parcel.writeString(str24);
        java.lang.String str25 = this.f179541J;
        if (str25 == null) {
            str25 = "";
        }
        parcel.writeString(str25);
        java.lang.String str26 = this.K;
        if (str26 == null) {
            str26 = "";
        }
        parcel.writeString(str26);
        java.lang.String str27 = this.L;
        if (str27 == null) {
            str27 = "";
        }
        parcel.writeString(str27);
        java.lang.String str28 = this.M;
        if (str28 == null) {
            str28 = "";
        }
        parcel.writeString(str28);
        parcel.writeInt(com.tencent.mm.sdk.platformtools.t8.j1(java.lang.Integer.valueOf(this.N), 0));
        java.lang.String str29 = this.P;
        if (str29 == null) {
            str29 = "";
        }
        parcel.writeString(str29);
        java.lang.String str30 = this.Q;
        if (str30 == null) {
            str30 = "";
        }
        parcel.writeString(str30);
        parcel.writeInt(com.tencent.mm.sdk.platformtools.t8.j1(java.lang.Integer.valueOf(this.R), 0));
        java.lang.String str31 = this.S;
        if (str31 == null) {
            str31 = "";
        }
        parcel.writeString(str31);
        java.lang.String str32 = this.T;
        parcel.writeString(str32 != null ? str32 : "");
    }

    public Authen(android.os.Parcel parcel) {
        this.f179542d = parcel.readInt();
        this.f179544f = parcel.readString();
        this.f179545g = parcel.readString();
        this.f179546h = parcel.readString();
        this.f179547i = parcel.readString();
        this.f179548m = parcel.readString();
        this.f179549n = parcel.readInt();
        this.f179550o = parcel.readString();
        this.f179551p = parcel.readString();
        this.f179552q = parcel.readString();
        this.f179553r = parcel.readString();
        this.f179554s = parcel.readString();
        this.f179558w = parcel.readString();
        this.f179559x = parcel.readString();
        this.f179560y = parcel.readString();
        this.f179561z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readString();
        this.f179556u = parcel.readString();
        this.I = parcel.readString();
        this.f179541J = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readInt();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readInt();
        this.S = parcel.readString();
        this.T = parcel.readString();
    }
}
