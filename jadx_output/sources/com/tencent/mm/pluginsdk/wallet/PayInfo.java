package com.tencent.mm.pluginsdk.wallet;

/* loaded from: classes9.dex */
public class PayInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.wallet.PayInfo> CREATOR = new h45.t();
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public int D;
    public int E;
    public long F;
    public java.lang.String G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f192107J;
    public int K;
    public int L;
    public final double M;
    public java.lang.String N;
    public boolean P;
    public java.lang.String Q;

    /* renamed from: d, reason: collision with root package name */
    public int f192108d;

    /* renamed from: e, reason: collision with root package name */
    public int f192109e;

    /* renamed from: f, reason: collision with root package name */
    public int f192110f;

    /* renamed from: g, reason: collision with root package name */
    public int f192111g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f192112h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f192113i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f192114m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f192115n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f192116o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f192117p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f192118q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f192119r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f192120s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f192121t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Bundle f192122u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f192123v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f192124w;

    /* renamed from: x, reason: collision with root package name */
    public int f192125x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f192126y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f192127z;

    public PayInfo() {
        this.f192108d = -1;
        this.f192109e = 0;
        this.f192110f = 0;
        this.f192112h = false;
        this.f192113i = true;
        this.f192125x = 0;
        this.D = 0;
        this.F = 0L;
        this.G = "";
        this.H = -1;
        this.K = 1;
        this.L = 0;
        this.M = 0.0d;
        this.N = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format("sense : %d, reqKey : %s, uuid : %s, appId : %s, appSource : %s, partnerId : %s, paySign : %s, productId : %s, soterAuth: %s", java.lang.Integer.valueOf(this.f192109e), this.f192114m, this.f192115n, this.f192116o, this.f192117p, this.f192118q, this.f192119r, this.f192120s, this.G);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f192109e);
        parcel.writeInt(this.f192110f);
        parcel.writeString(this.f192114m);
        parcel.writeString(this.f192115n);
        parcel.writeString(this.f192116o);
        parcel.writeString(this.f192117p);
        parcel.writeString(this.f192118q);
        parcel.writeString(this.f192119r);
        parcel.writeString(this.f192120s);
        parcel.writeString(this.f192121t);
        parcel.writeInt(this.f192111g);
        parcel.writeInt(this.f192108d);
        parcel.writeInt(this.f192112h ? 1 : 0);
        parcel.writeInt(this.f192113i ? 1 : 0);
        parcel.writeBundle(this.f192122u);
        parcel.writeInt(this.f192125x);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeLong(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.I);
        parcel.writeString(this.f192107J);
        parcel.writeInt(this.K);
        parcel.writeString(this.f192123v);
        parcel.writeString(this.f192124w);
        parcel.writeInt(this.L);
        parcel.writeDouble(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeString(this.Q);
        parcel.writeString(this.f192126y);
        parcel.writeInt(this.f192127z ? 1 : 0);
    }

    public PayInfo(android.os.Parcel parcel) {
        this.f192108d = -1;
        this.f192109e = 0;
        this.f192110f = 0;
        this.f192112h = false;
        this.f192113i = true;
        this.f192125x = 0;
        this.D = 0;
        this.F = 0L;
        this.G = "";
        this.H = -1;
        this.K = 1;
        this.L = 0;
        this.M = 0.0d;
        this.N = "";
        this.f192109e = parcel.readInt();
        this.f192110f = parcel.readInt();
        this.f192114m = parcel.readString();
        this.f192115n = parcel.readString();
        this.f192116o = parcel.readString();
        this.f192117p = parcel.readString();
        this.f192118q = parcel.readString();
        this.f192119r = parcel.readString();
        this.f192120s = parcel.readString();
        this.f192121t = parcel.readString();
        this.f192111g = parcel.readInt();
        this.f192108d = parcel.readInt();
        this.f192112h = parcel.readInt() == 1;
        this.f192113i = parcel.readInt() == 1;
        this.f192122u = parcel.readBundle();
        this.f192125x = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.F = parcel.readLong();
        this.G = parcel.readString();
        this.I = parcel.readString();
        this.f192107J = parcel.readString();
        this.K = parcel.readInt();
        this.f192123v = parcel.readString();
        this.f192124w = parcel.readString();
        this.L = parcel.readInt();
        this.M = parcel.readDouble();
        java.lang.String readString = parcel.readString();
        this.N = readString;
        if (readString == null) {
            this.N = "";
        }
        this.P = parcel.readInt() == 1;
        this.Q = parcel.readString();
        this.f192126y = parcel.readString();
        this.f192127z = parcel.readInt() == 1;
    }
}
