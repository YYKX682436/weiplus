package com.tencent.mm.plugin.recharge.model;

/* loaded from: classes9.dex */
public class MallRechargeProduct implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recharge.model.MallRechargeProduct> CREATOR = new vs3.c();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f155070d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155071e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155072f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f155073g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155074h;

    /* renamed from: i, reason: collision with root package name */
    public float f155075i;

    /* renamed from: m, reason: collision with root package name */
    public float f155076m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f155077n;

    /* renamed from: o, reason: collision with root package name */
    public int f155078o;

    /* renamed from: p, reason: collision with root package name */
    public int f155079p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f155080q;

    /* renamed from: r, reason: collision with root package name */
    public int f155081r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f155082s;

    public MallRechargeProduct(boolean z17) {
        this.f155075i = 0.0f;
        this.f155076m = 0.0f;
        this.f155082s = z17;
    }

    public boolean a() {
        return !this.f155077n || this.f155078o > 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f155070d);
        parcel.writeString(this.f155071e);
        parcel.writeString(this.f155072f);
        parcel.writeString(this.f155073g);
        parcel.writeString(this.f155074h);
        parcel.writeFloat(this.f155075i);
        parcel.writeFloat(this.f155076m);
        parcel.writeInt(this.f155077n ? 1 : 0);
        parcel.writeInt(this.f155078o);
        parcel.writeInt(this.f155079p);
        parcel.writeInt(this.f155080q ? 1 : 0);
        parcel.writeInt(this.f155082s ? 1 : 0);
        parcel.writeInt(this.f155081r);
    }

    public MallRechargeProduct(android.os.Parcel parcel) {
        this.f155075i = 0.0f;
        this.f155076m = 0.0f;
        this.f155070d = parcel.readString();
        this.f155071e = parcel.readString();
        this.f155072f = parcel.readString();
        this.f155073g = parcel.readString();
        this.f155074h = parcel.readString();
        this.f155075i = parcel.readFloat();
        this.f155076m = parcel.readFloat();
        this.f155077n = parcel.readInt() == 1;
        this.f155078o = parcel.readInt();
        this.f155079p = parcel.readInt();
        this.f155080q = parcel.readInt() == 1;
        this.f155082s = parcel.readInt() == 1;
        this.f155081r = parcel.readInt();
    }
}
