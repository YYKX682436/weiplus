package com.tencent.mm.plugin.wallet_core.id_verify.model;

/* loaded from: classes9.dex */
public class RealNameBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle> CREATOR = new ys4.n();
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public int G;
    public java.lang.String H;
    public int I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179423d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179424e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179425f;

    /* renamed from: g, reason: collision with root package name */
    public int f179426g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179427h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.model.Profession f179428i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179429m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179430n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f179431o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179432p;

    /* renamed from: q, reason: collision with root package name */
    public int f179433q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f179434r;

    /* renamed from: s, reason: collision with root package name */
    public int f179435s;

    /* renamed from: t, reason: collision with root package name */
    public int f179436t;

    /* renamed from: u, reason: collision with root package name */
    public int f179437u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f179438v;

    /* renamed from: w, reason: collision with root package name */
    public int f179439w;

    /* renamed from: x, reason: collision with root package name */
    public int f179440x;

    /* renamed from: y, reason: collision with root package name */
    public int f179441y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f179442z;

    public RealNameBundle(android.os.Parcel parcel) {
        this.f179423d = parcel.readString();
        this.f179424e = parcel.readString();
        this.f179425f = parcel.readString();
        this.f179426g = parcel.readInt();
        this.f179427h = parcel.readString();
        this.f179428i = (com.tencent.mm.plugin.wallet_core.id_verify.model.Profession) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.id_verify.model.Profession.class.getClassLoader());
        this.f179429m = parcel.readString();
        this.f179430n = parcel.readString();
        this.f179431o = parcel.readString();
        this.f179432p = parcel.readString();
        this.f179433q = parcel.readInt();
        this.f179434r = parcel.readString();
        this.f179435s = parcel.readInt();
        this.f179436t = parcel.readInt();
        this.f179437u = parcel.readInt();
        this.f179438v = parcel.readString();
        this.f179439w = parcel.readInt();
        this.f179440x = parcel.readInt();
        this.f179441y = parcel.readInt();
        this.f179442z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readString();
        this.I = parcel.readInt();
    }

    public void a(java.util.Map map) {
        map.put("detail_address", this.C);
        map.put("phone_no", this.H);
        map.put("sex", java.lang.String.valueOf(this.I));
        map.put("nationality", this.f179442z);
        map.put("birth_date", this.f179438v);
        com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession = this.f179428i;
        map.put("profession_name", profession != null ? profession.f179421d : "");
        map.put("user_country", this.f179429m);
        map.put("user_province", this.f179430n);
        map.put("user_city", this.f179431o);
        map.put("cre_expire_date", this.f179434r);
        map.put("creid_renewal", java.lang.String.valueOf(this.f179433q));
        map.put("cre_effect_date", this.D);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f179423d);
        parcel.writeString(this.f179424e);
        parcel.writeString(this.f179425f);
        parcel.writeInt(this.f179426g);
        parcel.writeString(this.f179427h);
        parcel.writeParcelable(this.f179428i, 1);
        parcel.writeString(this.f179429m);
        parcel.writeString(this.f179430n);
        parcel.writeString(this.f179431o);
        parcel.writeString(this.f179432p);
        parcel.writeInt(this.f179433q);
        parcel.writeString(this.f179434r);
        parcel.writeInt(this.f179435s);
        parcel.writeInt(this.f179436t);
        parcel.writeInt(this.f179437u);
        parcel.writeString(this.f179438v);
        parcel.writeInt(this.f179439w);
        parcel.writeInt(this.f179440x);
        parcel.writeInt(this.f179441y);
        parcel.writeString(this.f179442z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeString(this.H);
        parcel.writeInt(this.I);
    }
}
