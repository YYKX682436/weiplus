package com.tencent.mm.plugin.game.luggage.api;

/* loaded from: classes.dex */
public class GameInputConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.api.GameInputConfig> CREATOR = new s43.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f139519d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139520e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f139521f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f139522g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f139523h;

    /* renamed from: i, reason: collision with root package name */
    public final int f139524i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f139525m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f139526n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f139527o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f139528p;

    /* renamed from: q, reason: collision with root package name */
    public final int f139529q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f139530r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f139531s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f139532t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f139533u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f139534v;

    /* renamed from: w, reason: collision with root package name */
    public final int f139535w;

    /* renamed from: x, reason: collision with root package name */
    public final int f139536x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f139537y;

    public GameInputConfig(android.os.Parcel parcel) {
        this.f139522g = false;
        this.f139523h = false;
        this.f139524i = 1000;
        this.f139525m = false;
        this.f139527o = true;
        this.f139532t = false;
        this.f139536x = 1000;
        this.f139537y = "send";
        this.f139519d = parcel.readString();
        this.f139520e = parcel.readString();
        this.f139521f = parcel.readString();
        this.f139522g = parcel.readInt() == 1;
        this.f139523h = parcel.readInt() == 1;
        this.f139524i = parcel.readInt();
        this.f139525m = parcel.readInt() == 1;
        this.f139526n = parcel.readString();
        this.f139527o = parcel.readInt() == 1;
        this.f139528p = parcel.readInt() == 1;
        this.f139529q = parcel.readInt();
        this.f139530r = parcel.readInt() == 1;
        this.f139531s = parcel.readString();
        this.f139536x = parcel.readInt();
        this.f139537y = parcel.readString();
        this.f139532t = parcel.readInt() == 1;
        this.f139533u = parcel.readString();
        this.f139534v = parcel.readString();
        this.f139535w = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f139519d);
        parcel.writeString(this.f139520e);
        parcel.writeString(this.f139521f);
        parcel.writeInt(this.f139522g ? 1 : 0);
        parcel.writeInt(this.f139523h ? 1 : 0);
        parcel.writeInt(this.f139524i);
        parcel.writeInt(this.f139525m ? 1 : 0);
        parcel.writeString(this.f139526n);
        parcel.writeInt(this.f139527o ? 1 : 0);
        parcel.writeInt(this.f139528p ? 1 : 0);
        parcel.writeInt(this.f139529q);
        parcel.writeInt(this.f139530r ? 1 : 0);
        parcel.writeString(this.f139531s);
        parcel.writeInt(this.f139536x);
        parcel.writeString(this.f139537y);
        parcel.writeInt(this.f139532t ? 1 : 0);
        parcel.writeString(this.f139533u);
        parcel.writeString(this.f139534v);
        parcel.writeInt(this.f139535w);
    }
}
