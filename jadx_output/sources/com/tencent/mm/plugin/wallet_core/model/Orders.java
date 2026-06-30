package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class Orders implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders> CREATOR = new at4.v0();
    public int A;
    public int A1;
    public boolean B;
    public com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo B1;
    public java.lang.String C;
    public java.lang.String D;
    public long E;
    public java.lang.String F;
    public java.lang.String G;
    public java.util.Set H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f179673J;
    public boolean K;
    public java.lang.String L;
    public java.util.List M;
    public vr4.j0 N;
    public int P;
    public java.lang.String Q;
    public java.lang.String R;
    public com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo S;
    public int T;
    public int U;
    public int V;
    public java.lang.String W;
    public int X;
    public int Y;
    public java.util.ArrayList Z;

    /* renamed from: d, reason: collision with root package name */
    public long f179674d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179675e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f179676f;
    public java.util.ArrayList<r45.xj6> field_infos;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179677g;

    /* renamed from: h, reason: collision with root package name */
    public double f179678h;

    /* renamed from: i, reason: collision with root package name */
    public int f179679i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f179680l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179681m;

    /* renamed from: n, reason: collision with root package name */
    public double f179682n;

    /* renamed from: o, reason: collision with root package name */
    public double f179683o;

    /* renamed from: p, reason: collision with root package name */
    public int f179684p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f179685p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f179686p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f179687q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f179688r;

    /* renamed from: s, reason: collision with root package name */
    public int f179689s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f179690t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f179691u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f179692v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f179693w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f179694x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f179695x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f179696x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f179697y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f179698y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f179699y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f179700z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f179701z1;

    /* loaded from: classes9.dex */
    public static class DeductShowInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.d();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f179734d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179735e;

        /* renamed from: f, reason: collision with root package name */
        public int f179736f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f179737g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f179738h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f179739i;

        public DeductShowInfo(android.os.Parcel parcel) {
            this.f179734d = parcel.readString();
            this.f179735e = parcel.readString();
            this.f179736f = parcel.readInt();
            this.f179737g = parcel.readString();
            this.f179738h = parcel.readString();
            this.f179739i = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f179734d);
            parcel.writeString(this.f179735e);
            parcel.writeInt(this.f179736f);
            parcel.writeString(this.f179737g);
            parcel.writeString(this.f179738h);
            parcel.writeString(this.f179739i);
        }
    }

    /* loaded from: classes9.dex */
    public static class DiscountInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.e();

        /* renamed from: d, reason: collision with root package name */
        public double f179740d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179741e;

        public DiscountInfo(android.os.Parcel parcel) {
            this.f179740d = parcel.readDouble();
            this.f179741e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeDouble(this.f179740d);
            parcel.writeString(this.f179741e);
        }
    }

    /* loaded from: classes9.dex */
    public static class FinderInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.FinderInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.f();

        /* renamed from: d, reason: collision with root package name */
        public int f179742d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179743e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f179744f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f179745g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f179746h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f179747i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f179748m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f179749n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f179750o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f179751p;

        /* renamed from: q, reason: collision with root package name */
        public java.lang.String f179752q;

        /* renamed from: r, reason: collision with root package name */
        public int f179753r;

        /* renamed from: s, reason: collision with root package name */
        public java.lang.String f179754s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f179755t;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f179756u;

        public FinderInfo(android.os.Parcel parcel) {
            this.f179742d = parcel.readInt();
            this.f179743e = parcel.readString();
            this.f179744f = parcel.readString();
            this.f179745g = parcel.readString();
            this.f179746h = parcel.readString();
            this.f179747i = parcel.readString();
            this.f179748m = parcel.readString();
            this.f179749n = parcel.readString();
            this.f179750o = parcel.readString();
            this.f179751p = parcel.readString();
            this.f179752q = parcel.readString();
            this.f179754s = parcel.readString();
            this.f179755t = parcel.readString();
            this.f179756u = parcel.readString();
            this.f179753r = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f179742d);
            parcel.writeString(this.f179743e);
            parcel.writeString(this.f179744f);
            parcel.writeString(this.f179745g);
            parcel.writeString(this.f179746h);
            parcel.writeString(this.f179747i);
            parcel.writeString(this.f179748m);
            parcel.writeString(this.f179749n);
            parcel.writeString(this.f179750o);
            parcel.writeString(this.f179751p);
            parcel.writeString(this.f179752q);
            parcel.writeString(this.f179754s);
            parcel.writeString(this.f179755t);
            parcel.writeString(this.f179756u);
            parcel.writeInt(this.f179753r);
        }
    }

    /* loaded from: classes9.dex */
    public static class LeadTailViewInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.LeadTailViewInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.g();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f179757d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179758e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f179759f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f179760g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f179761h;

        /* renamed from: i, reason: collision with root package name */
        public int f179762i;

        /* renamed from: m, reason: collision with root package name */
        public int f179763m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f179764n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f179765o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f179766p;

        /* renamed from: q, reason: collision with root package name */
        public java.lang.String f179767q;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f179768r;

        /* renamed from: s, reason: collision with root package name */
        public java.lang.String f179769s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f179770t;

        public LeadTailViewInfo(android.os.Parcel parcel) {
            this.f179757d = parcel.readString();
            this.f179758e = parcel.readString();
            this.f179759f = parcel.readString();
            this.f179760g = parcel.readString();
            this.f179761h = parcel.readString();
            this.f179762i = parcel.readInt();
            this.f179763m = parcel.readInt();
            this.f179764n = parcel.readString();
            this.f179765o = parcel.readString();
            this.f179766p = parcel.readString();
            this.f179767q = parcel.readString();
            this.f179768r = parcel.readString();
            this.f179769s = parcel.readString();
            this.f179770t = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f179757d);
            parcel.writeString(this.f179758e);
            parcel.writeString(this.f179759f);
            parcel.writeString(this.f179760g);
            parcel.writeString(this.f179761h);
            parcel.writeInt(this.f179762i);
            parcel.writeInt(this.f179763m);
            parcel.writeString(this.f179764n);
            parcel.writeString(this.f179765o);
            parcel.writeString(this.f179766p);
            parcel.writeString(this.f179767q);
            parcel.writeString(this.f179768r);
            parcel.writeString(this.f179769s);
            parcel.writeString(this.f179770t);
        }
    }

    /* loaded from: classes9.dex */
    public static class Promotions implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.Promotions> CREATOR = new com.tencent.mm.plugin.wallet_core.model.h();
        public a36.c A;

        /* renamed from: d, reason: collision with root package name */
        public int f179771d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179772e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f179773f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f179774g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f179775h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f179776i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f179777m;

        /* renamed from: n, reason: collision with root package name */
        public int f179778n;

        /* renamed from: o, reason: collision with root package name */
        public long f179779o;

        /* renamed from: p, reason: collision with root package name */
        public int f179780p;

        /* renamed from: q, reason: collision with root package name */
        public int f179781q;

        /* renamed from: r, reason: collision with root package name */
        public int f179782r;

        /* renamed from: s, reason: collision with root package name */
        public int f179783s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f179784t;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f179785u;

        /* renamed from: v, reason: collision with root package name */
        public java.lang.String f179786v;

        /* renamed from: w, reason: collision with root package name */
        public long f179787w;

        /* renamed from: x, reason: collision with root package name */
        public int f179788x;

        /* renamed from: y, reason: collision with root package name */
        public java.lang.String f179789y;

        /* renamed from: z, reason: collision with root package name */
        public java.lang.String f179790z;

        public Promotions(android.os.Parcel parcel) {
            this.f179771d = parcel.readInt();
            this.f179772e = parcel.readString();
            this.f179773f = parcel.readString();
            this.f179774g = parcel.readString();
            this.f179775h = parcel.readString();
            this.f179776i = parcel.readString();
            this.f179777m = parcel.readString();
            this.f179778n = parcel.readInt();
            this.f179779o = parcel.readLong();
            this.f179780p = parcel.readInt();
            this.f179781q = parcel.readInt();
            this.f179782r = parcel.readInt();
            this.f179783s = parcel.readInt();
            this.f179784t = parcel.readString();
            this.f179785u = parcel.readString();
            this.f179786v = parcel.readString();
            this.f179787w = parcel.readLong();
            this.f179788x = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f179771d);
            parcel.writeString(this.f179772e);
            parcel.writeString(this.f179773f);
            parcel.writeString(this.f179774g);
            parcel.writeString(this.f179775h);
            parcel.writeString(this.f179776i);
            parcel.writeString(this.f179777m);
            parcel.writeInt(this.f179778n);
            parcel.writeLong(this.f179779o);
            parcel.writeInt(this.f179780p);
            parcel.writeInt(this.f179781q);
            parcel.writeInt(this.f179782r);
            parcel.writeInt(this.f179783s);
            parcel.writeString(this.f179784t);
            parcel.writeString(this.f179785u);
            parcel.writeString(this.f179786v);
            parcel.writeLong(this.f179787w);
            parcel.writeInt(this.f179788x);
        }
    }

    /* loaded from: classes9.dex */
    public static class RecommendTinyAppInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.i();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f179791d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179792e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f179793f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f179794g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f179795h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f179796i;

        /* renamed from: m, reason: collision with root package name */
        public long f179797m;

        /* renamed from: n, reason: collision with root package name */
        public long f179798n;

        /* renamed from: o, reason: collision with root package name */
        public int f179799o;

        /* renamed from: p, reason: collision with root package name */
        public int f179800p;

        /* renamed from: q, reason: collision with root package name */
        public long f179801q;

        /* renamed from: r, reason: collision with root package name */
        public int f179802r;

        public RecommendTinyAppInfo(android.os.Parcel parcel) {
            this.f179791d = parcel.readString();
            this.f179792e = parcel.readString();
            this.f179793f = parcel.readString();
            this.f179794g = parcel.readString();
            this.f179795h = parcel.readString();
            this.f179802r = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f179791d);
            parcel.writeString(this.f179792e);
            parcel.writeString(this.f179793f);
            parcel.writeString(this.f179794g);
            parcel.writeString(this.f179795h);
            parcel.writeInt(this.f179802r);
        }
    }

    /* loaded from: classes9.dex */
    public static class RemarksInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.RemarksInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.j();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f179803d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179804e;

        public RemarksInfo(android.os.Parcel parcel) {
            this.f179803d = parcel.readString();
            this.f179804e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f179803d);
            parcel.writeString(this.f179804e);
        }
    }

    /* loaded from: classes9.dex */
    public static class ShowInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.k();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f179805d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179806e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f179807f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f179808g;

        /* renamed from: h, reason: collision with root package name */
        public int f179809h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f179810i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f179811m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f179812n;

        /* renamed from: o, reason: collision with root package name */
        public int f179813o;

        public ShowInfo(android.os.Parcel parcel) {
            this.f179805d = parcel.readString();
            this.f179806e = parcel.readString();
            this.f179807f = parcel.readString();
            this.f179808g = parcel.readString();
            this.f179809h = parcel.readInt();
            this.f179810i = parcel.readString();
            this.f179811m = parcel.readString();
            this.f179812n = parcel.readString();
            this.f179813o = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return java.lang.String.format("ShowInfo name:%s, value:%s, nameColor:%s, valueColor:%s, linkType:%s, linkWeApp:%s, linkAddr:%s, linkUrl:%s, textAttr:%s", this.f179805d, this.f179806e, this.f179807f, this.f179808g, java.lang.Integer.valueOf(this.f179809h), this.f179810i, this.f179811m, this.f179812n, java.lang.Integer.valueOf(this.f179813o));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f179805d);
            parcel.writeString(this.f179806e);
            parcel.writeString(this.f179807f);
            parcel.writeString(this.f179808g);
            parcel.writeInt(this.f179809h);
            parcel.writeString(this.f179810i);
            parcel.writeString(this.f179811m);
            parcel.writeString(this.f179812n);
            parcel.writeInt(this.f179813o);
        }
    }

    /* loaded from: classes9.dex */
    public static class SimpleCashierInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.l();

        /* renamed from: d, reason: collision with root package name */
        public int f179814d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179815e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f179816f;

        public SimpleCashierInfo(android.os.Parcel parcel) {
            this.f179814d = parcel.readInt();
            this.f179815e = parcel.readString();
            this.f179816f = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f179814d);
            parcel.writeString(this.f179815e);
            parcel.writeString(this.f179816f);
        }
    }

    public Orders() {
        this.f179675e = "";
        this.f179676f = "";
        this.f179677g = "0";
        this.f179678h = 0.0d;
        this.f179683o = 0.0d;
        this.B = false;
        this.C = "";
        this.D = "";
        this.E = 0L;
        this.F = "";
        this.H = new java.util.HashSet();
        this.I = 0;
        this.L = "";
        this.M = new java.util.ArrayList();
        this.N = new vr4.j0();
        this.P = 0;
        this.Q = "";
        this.R = "";
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = "";
        this.X = 0;
        this.Y = 0;
        this.Z = new java.util.ArrayList();
        this.f179685p0 = "";
        this.f179695x0 = "";
        this.field_infos = new java.util.ArrayList<>();
        this.f179698y0 = "";
        this.f179696x1 = "";
    }

    public static com.tencent.mm.plugin.wallet_core.model.Orders a(org.json.JSONObject jSONObject) {
        int i17;
        if (jSONObject == null) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders = new com.tencent.mm.plugin.wallet_core.model.Orders();
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            orders.f179674d = java.lang.System.currentTimeMillis();
            int i18 = 2;
            orders.f179678h = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("total_fee"), "100", 2, java.math.RoundingMode.HALF_UP);
            orders.f179677g = jSONObject.getString("num");
            boolean z18 = true;
            orders.f179679i = jSONObject.optInt("bank_card_tag", 1);
            orders.f179681m = jSONObject.optString("fee_type", "");
            orders.f179682n = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("charge_fee"), "100", 2, java.math.RoundingMode.HALF_UP);
            orders.f179683o = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("fetch_fee"), "100", 2, java.math.RoundingMode.HALF_UP);
            orders.f179684p = jSONObject.optInt("is_assign_userinfo_pay");
            orders.f179687q = jSONObject.optString("true_name");
            orders.f179688r = jSONObject.optString("cre_id");
            orders.f179689s = jSONObject.optInt("ce_type");
            orders.f179690t = jSONObject.optString("assign_pay_info");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Array");
            jSONObject.optLong("free_fee");
            jSONObject.optLong("remain_fee");
            orders.T = jSONObject.optInt("not_support_bind_card", 0);
            orders.U = jSONObject.optInt("not_support_retry", 0);
            boolean z19 = jSONObject.optInt("support_all_bank", 0) == 1;
            if (z19) {
                try {
                    orders.H = new java.util.HashSet();
                } catch (org.json.JSONException e17) {
                    e = e17;
                    i17 = 0;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Orders", e, "", new java.lang.Object[i17]);
                    return orders;
                }
            }
            int length = jSONArray.length();
            int i19 = 0;
            while (i19 < length) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = new com.tencent.mm.plugin.wallet_core.model.Orders.Commodity();
                commodity.f179707h = jSONObject2.getString("desc");
                org.json.JSONArray jSONArray2 = jSONArray;
                commodity.f179709m = com.tencent.mm.wallet_core.ui.r1.j(jSONObject2.optString("fee"), "100", i18, java.math.RoundingMode.HALF_UP);
                commodity.f179708i = "" + jSONObject2.optInt("count", 1);
                commodity.f179711o = jSONObject2.getString("pay_status");
                commodity.f179715s = jSONObject2.optString("buy_bank_name");
                commodity.f179712p = jSONObject2.getString("pay_status_name");
                commodity.f179705f = jSONObject2.optString("spid");
                commodity.f179706g = jSONObject2.optString("sp_name");
                commodity.f179713q = jSONObject2.optInt("modify_timestamp");
                commodity.f179714r = jSONObject2.getString(ya.b.TRANSACTION_ID);
                commodity.f179716t = jSONObject2.optString("fee_type");
                if (com.tencent.mm.sdk.platformtools.t8.K0(orders.f179681m)) {
                    orders.f179681m = commodity.f179716t;
                }
                commodity.f179717u = jSONObject2.optString("appusername");
                commodity.f179719w = jSONObject2.optString("app_telephone");
                ((java.util.ArrayList) orders.M).add(commodity);
                if (!z19) {
                    java.lang.String optString = jSONObject2.optString("support_bank");
                    orders.G = optString;
                    orders.H = m(optString);
                }
                i19++;
                z18 = true;
                jSONArray = jSONArray2;
                i18 = 2;
            }
            boolean z27 = z18;
            if (jSONObject.has("is_open_fee_protocal")) {
                orders.B = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "is_open_fee_protocal");
            } else {
                int i27 = orders.f179679i;
                l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
                orders.B = (i27 & 2) > 0 ? z27 : false;
            }
            orders.N = e(jSONObject);
            n(jSONObject, orders);
            orders.P = jSONObject.optInt("needbindcardtoshowfavinfo");
            orders.Q = jSONObject.optString("discount_wording");
            orders.R = jSONObject.optString("favor_rule_wording");
            c(orders, jSONObject.optJSONObject("entrustpayinfo"));
            java.lang.String optString2 = jSONObject.optString("field_area_info");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                try {
                    orders.field_infos.addAll(((r45.fs0) new r45.fs0().parseFrom(android.util.Base64.decode(optString2, 0))).field_info);
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Orders", e18, "", new java.lang.Object[0]);
                }
            }
            orders.f179698y0 = jSONObject.optString("price_total_fee", "0");
            orders.f179680l1 = jSONObject.optString("price_fee_type", "");
            orders.f179686p1 = jSONObject.optString("price_fee_symbol", "");
            orders.f179696x1 = jSONObject.optString("settlement_fee", "0");
            orders.f179699y1 = jSONObject.optString("settlement_type", "");
            orders.f179701z1 = jSONObject.optString("settlement_symbol", "");
            orders.A1 = jSONObject.optInt("is_open_field_area", 0);
            i(jSONObject, orders);
            return orders;
        } catch (org.json.JSONException e19) {
            e = e19;
            i17 = 0;
        }
    }

    public static void b(com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity, org.json.JSONObject jSONObject, int i17) {
        commodity.f179721y = jSONObject.optString("discount");
        commodity.f179711o = jSONObject.getString("pay_status");
        commodity.f179712p = jSONObject.getString("pay_status_name");
        commodity.f179715s = jSONObject.optString("buy_bank_name");
        commodity.f179713q = jSONObject.optInt("pay_timestamp");
        commodity.f179720x = jSONObject.optString("card_tail");
        commodity.f179722z = i17;
        commodity.B = jSONObject.optString("rateinfo");
        jSONObject.optString("discount_rateinfo");
        commodity.C = jSONObject.optString("original_feeinfo");
        if (jSONObject.has("total_fee")) {
            commodity.f179709m = jSONObject.optDouble("total_fee", 0.0d) / 100.0d;
        }
        commodity.f179710n = jSONObject.optDouble("original_total_fee", -1.0d) / 100.0d;
        commodity.f179716t = jSONObject.optString("fee_type", "");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("subscribe_biz_info");
        int i18 = 1;
        if (optJSONObject != null) {
            com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = new com.tencent.mm.plugin.wallet_core.model.Orders.Promotions();
            promotions.f179771d = 0;
            promotions.f179773f = optJSONObject.optString("nickname");
            java.lang.String optString = optJSONObject.optString(dm.i4.COL_USERNAME);
            promotions.f179776i = optString;
            commodity.f179718v = optString;
            promotions.f179772e = optJSONObject.optString("logo_round_url");
            promotions.f179775h = optJSONObject.optString("subscribe_biz_url");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179773f) && !com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179775h)) {
                commodity.H.add(promotions);
                commodity.I = true;
            }
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("activity_info");
        int length = jSONArray.length();
        int i19 = 0;
        while (i19 < length) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
            com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions2 = new com.tencent.mm.plugin.wallet_core.model.Orders.Promotions();
            promotions2.f179771d = i18;
            promotions2.f179772e = jSONObject2.optString("icon");
            promotions2.f179773f = jSONObject2.optString("wording");
            promotions2.f179775h = jSONObject2.optString("url");
            promotions2.f179774g = jSONObject2.optString("btn_text");
            promotions2.f179778n = jSONObject2.optInt("type");
            promotions2.f179777m = jSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            promotions2.f179779o = jSONObject2.optLong(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
            promotions2.f179780p = jSONObject2.optInt("activity_type", 0);
            promotions2.f179784t = jSONObject2.optString("small_title");
            promotions2.f179781q = jSONObject2.optInt("award_id");
            promotions2.f179782r = jSONObject2.optInt("send_record_id");
            promotions2.f179783s = jSONObject2.optInt("user_record_id");
            promotions2.f179785u = jSONObject2.optString("activity_tinyapp_username");
            promotions2.f179786v = jSONObject2.optString("activity_tinyapp_path");
            promotions2.f179787w = jSONObject2.optLong("activity_mch_id");
            promotions2.f179788x = jSONObject2.optInt("activity_tinyapp_version");
            promotions2.f179789y = jSONObject2.optString("get_award_params");
            promotions2.f179790z = jSONObject2.optString("query_award_status_params");
            d(promotions2, jSONObject2.optJSONObject("exposure_info"));
            commodity.H.add(promotions2);
            i19++;
            i18 = 1;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("link_ativity_info");
        if (optJSONObject2 != null) {
            java.lang.String optString2 = optJSONObject2.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
            at4.w0 w0Var = commodity.f179702J;
            w0Var.f13983a = optString2;
            w0Var.f13984b = optJSONObject2.optString("url");
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("discount_array");
        if (optJSONArray != null) {
            int length2 = optJSONArray.length();
            for (int i27 = 0; i27 < length2; i27++) {
                org.json.JSONObject optJSONObject3 = optJSONArray.optJSONObject(i27);
                com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo discountInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo();
                if (optJSONObject3 != null) {
                    discountInfo.f179740d = optJSONObject3.optDouble("payment_amount");
                    discountInfo.f179741e = optJSONObject3.optString("favor_desc");
                    commodity.A.add(discountInfo);
                }
            }
        }
        org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("tinyapp_info");
        if (optJSONObject4 != null) {
            if (commodity.D == null) {
                commodity.D = new com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo();
            }
            commodity.D.f179791d = optJSONObject4.optString("tinyapp_name");
            commodity.D.f179792e = optJSONObject4.optString("tinyapp_logo");
            commodity.D.f179793f = optJSONObject4.optString("tinyapp_desc");
            commodity.D.f179794g = optJSONObject4.optString("tinyapp_username");
            commodity.D.f179795h = optJSONObject4.optString("tinyapp_path");
            commodity.D.f179796i = optJSONObject4.optString("activity_tinyapp_btn_text");
            commodity.D.f179797m = optJSONObject4.optLong(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
            com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo recommendTinyAppInfo = commodity.D;
            optJSONObject4.optLong("activity_type");
            recommendTinyAppInfo.getClass();
            commodity.D.f179798n = optJSONObject4.optLong("award_id");
            commodity.D.f179799o = optJSONObject4.optInt("send_record_id");
            commodity.D.f179800p = optJSONObject4.optInt("user_record_id");
            commodity.D.f179801q = optJSONObject4.optLong("activity_mch_id");
            commodity.D.f179802r = optJSONObject4.optInt("tinyapp_version");
        }
        org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("remarks_info");
        if (optJSONObject5 != null) {
            if (commodity.G == null) {
                commodity.G = new com.tencent.mm.plugin.wallet_core.model.Orders.RemarksInfo();
            }
            commodity.G.f179803d = optJSONObject5.optString("remark_title");
            commodity.G.f179804e = optJSONObject5.optString("remark_desc");
        }
    }

    public static void c(com.tencent.mm.plugin.wallet_core.model.Orders orders, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Orders", "parseDeductInfo json is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Orders", "parseDeductInfo json is not null");
        com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo deductInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo();
        orders.S = deductInfo;
        deductInfo.f179723d = jSONObject.optString("contract_title");
        orders.S.f179724e = jSONObject.optString("contract_desc");
        orders.S.f179725f = jSONObject.optInt("auto_deduct_flag", 0);
        orders.S.f179726g = jSONObject.optString("contract_url");
        orders.S.f179728i = jSONObject.optInt("is_select_pay_way", 0);
        orders.S.f179729m = jSONObject.optInt("deduct_show_type", 0);
        orders.S.f179730n = jSONObject.optString("button_wording", "");
        orders.S.f179731o = jSONObject.optString("deduct_rule_wording", "");
        orders.S.f179732p = jSONObject.optString("open_deduct_wording", "");
        orders.S.f179733q = jSONObject.optString("open_deduct_wording_color", "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("show_info");
        int length = optJSONArray.length();
        if (length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Orders", "parseDeductInfo's showInfo len is " + length);
            return;
        }
        orders.S.f179727h = new java.util.ArrayList();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo deductShowInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo();
                deductShowInfo.f179734d = optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                deductShowInfo.f179735e = optJSONObject.optString("value");
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("value_attr");
                if (optJSONObject2 != null) {
                    deductShowInfo.f179736f = optJSONObject2.optInt("link_type", 0);
                    deductShowInfo.f179737g = optJSONObject2.optString("link_weapp");
                    deductShowInfo.f179738h = optJSONObject2.optString("link_addr");
                    deductShowInfo.f179739i = optJSONObject2.optString("link_url");
                }
                orders.S.f179727h.add(deductShowInfo);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Orders", "parseDeductInfo's showInfo get a null value from json,index=" + i17);
            }
        }
    }

    public static void d(com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Orders", "parseExposureInfo: %s", jSONObject);
        if (jSONObject == null) {
            promotions.A = null;
            return;
        }
        try {
            a36.c cVar = new a36.c();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("single_exposure_info_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                cVar.f1104d = new java.util.LinkedList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                    a36.i iVar = new a36.i();
                    iVar.f1149d = jSONObject2.optString("logo");
                    iVar.f1150e = jSONObject2.optString("award_name");
                    iVar.f1151f = jSONObject2.optString("award_description");
                    iVar.f1152g = jSONObject2.optString("background_img");
                    iVar.f1154i = jSONObject2.optString("award_description_color");
                    iVar.f1153h = jSONObject2.optString("award_name_color");
                    cVar.f1104d.add(iVar);
                }
            }
            cVar.f1105e = jSONObject.optInt("is_query_others", 0);
            cVar.f1106f = jSONObject.optString("draw_lottery_params");
            cVar.f1107g = jSONObject.optInt("is_show_btn");
            cVar.f1113p = jSONObject.optString("background_img_whole");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("btn_info");
            str = "MicroMsg.Orders";
            if (optJSONObject != null) {
                try {
                    a36.a aVar = new a36.a();
                    cVar.f1108h = aVar;
                    str2 = "";
                    aVar.f1091d = optJSONObject.optString("btn_words");
                    cVar.f1108h.f1092e = optJSONObject.optString("btn_color");
                    cVar.f1108h.f1093f = optJSONObject.optInt("btn_op_type");
                    cVar.f1108h.f1094g = optJSONObject.optString("url");
                    cVar.f1108h.f1096i = optJSONObject.optString("get_lottery_params");
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("mini_app_info");
                    if (optJSONObject2 != null) {
                        cVar.f1108h.f1095h = new a36.g();
                        cVar.f1108h.f1095h.f1142d = optJSONObject2.optString("activity_tinyapp_username");
                        cVar.f1108h.f1095h.f1143e = optJSONObject2.optString("activity_tinyapp_path");
                        cVar.f1108h.f1095h.f1144f = optJSONObject2.optInt("activity_tinyapp_version");
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "parseExposureInfo error: %s", e.getMessage());
                    return;
                }
            } else {
                str2 = "";
            }
            cVar.f1109i = jSONObject.optString("exposure_info_modify_params");
            cVar.f1110m = jSONObject.optInt("user_opertaion_type");
            cVar.f1111n = jSONObject.optInt("is_show_layer");
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("layer_info");
            if (optJSONObject3 != null) {
                a36.f fVar = new a36.f();
                cVar.f1112o = fVar;
                fVar.f1133d = optJSONObject3.optString("layer_title");
                cVar.f1112o.f1134e = optJSONObject3.optString("layer_logo");
                cVar.f1112o.f1135f = optJSONObject3.optString("layer_type");
                cVar.f1112o.f1136g = optJSONObject3.optString("layer_name");
                cVar.f1112o.f1137h = optJSONObject3.optString("layer_description");
                cVar.f1112o.f1138i = optJSONObject3.optInt("is_show_layer_btn");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject3.optString("voice_url"))) {
                    cVar.f1112o.f1140n = new com.tencent.mm.protobuf.g(optJSONObject3.optString("voice_url").getBytes());
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject3.optString("voice_data"))) {
                    cVar.f1112o.f1141o = new com.tencent.mm.protobuf.g(optJSONObject3.optString("voice_data").getBytes());
                }
                org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject("layer_btn_info");
                if (optJSONObject4 != null) {
                    cVar.f1112o.f1139m = new a36.e();
                    cVar.f1112o.f1139m.f1127d = optJSONObject4.optString("btn_words");
                    cVar.f1112o.f1139m.f1128e = optJSONObject4.optString("btn_color");
                    cVar.f1112o.f1139m.f1129f = optJSONObject4.optInt("btn_op_type");
                    cVar.f1112o.f1139m.f1130g = optJSONObject4.optString("get_lottery_params");
                    cVar.f1112o.f1139m.f1131h = optJSONObject4.optString("url");
                    org.json.JSONObject optJSONObject5 = optJSONObject4.optJSONObject("mini_app_info");
                    if (optJSONObject5 != null) {
                        cVar.f1112o.f1139m.f1132i = new a36.g();
                        cVar.f1112o.f1139m.f1132i.f1142d = optJSONObject5.optString("activity_tinyapp_username");
                        cVar.f1112o.f1139m.f1132i.f1143e = optJSONObject5.optString("activity_tinyapp_path");
                        cVar.f1112o.f1139m.f1132i.f1144f = optJSONObject5.optInt("activity_tinyapp_version");
                    }
                }
            }
            org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("draw_lottery_info");
            if (optJSONObject6 != null) {
                a36.b bVar = new a36.b();
                cVar.f1114q = bVar;
                bVar.f1098e = optJSONObject6.optString("url");
                cVar.f1114q.f1099f = optJSONObject6.optString("animation_wording");
                cVar.f1114q.f1100g = optJSONObject6.optString("animation_wording_color");
                cVar.f1114q.f1102i = optJSONObject6.optString("after_animation_wording");
                cVar.f1114q.f1103m = optJSONObject6.optString("after_animation_wording_color");
                cVar.f1114q.f1101h = optJSONObject6.optInt("op_type");
                org.json.JSONObject optJSONObject7 = optJSONObject6.optJSONObject("mini_app_info");
                if (optJSONObject7 != null) {
                    cVar.f1114q.f1097d = new a36.g();
                    cVar.f1114q.f1097d.f1142d = optJSONObject7.optString("activity_tinyapp_username");
                    cVar.f1114q.f1097d.f1143e = optJSONObject7.optString("activity_tinyapp_path");
                    cVar.f1114q.f1097d.f1144f = optJSONObject7.optInt("activity_tinyapp_version");
                }
            }
            org.json.JSONObject optJSONObject8 = jSONObject.optJSONObject("follow_cardbd_mch_info");
            if (optJSONObject8 != null) {
                a36.d dVar = new a36.d();
                cVar.f1115r = dVar;
                dVar.f1116d = optJSONObject8.optInt("is_followed_cardbd_mch", 0);
                java.lang.String str3 = str2;
                cVar.f1115r.f1118f = optJSONObject8.optString("follow_logo", str3);
                cVar.f1115r.f1117e = optJSONObject8.optString("follow_tips", str3);
                cVar.f1115r.f1119g = optJSONObject8.optString("follow_tips_color", str3);
                cVar.f1115r.f1120h = optJSONObject8.optLong("follow_tips_size", 0L);
                cVar.f1115r.f1124o = optJSONObject8.optString("follow_logo_after", str3);
                cVar.f1115r.f1126q = optJSONObject8.optString("follow_tips_after", str3);
                cVar.f1115r.f1125p = optJSONObject8.optString("follow_tips_color_after", str3);
                cVar.f1115r.f1121i = optJSONObject8.optString("follow_param", str3);
                cVar.f1115r.f1122m = optJSONObject8.optInt("is_show_pop_up", 0);
                org.json.JSONObject optJSONObject9 = optJSONObject8.optJSONObject("pop_up_window_info");
                if (optJSONObject9 != null) {
                    cVar.f1115r.f1123n = new a36.h();
                    cVar.f1115r.f1123n.f1145d = optJSONObject9.optString("pop_up_title");
                    cVar.f1115r.f1123n.f1146e = optJSONObject9.optString("pop_up_text");
                    cVar.f1115r.f1123n.f1148g = optJSONObject9.optString("pop_up_button_text");
                    cVar.f1115r.f1123n.f1147f = optJSONObject9.optString("pop_up_image_url");
                }
            }
            promotions.A = cVar;
        } catch (java.lang.Exception e18) {
            e = e18;
            str = "MicroMsg.Orders";
        }
    }

    public static vr4.j0 e(org.json.JSONObject jSONObject) {
        int i17;
        vr4.j0 j0Var = new vr4.j0();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("favinfo");
        if (optJSONObject == null) {
            return j0Var;
        }
        j0Var.f439753d = optJSONObject.optLong("tradeAmount") / 100.0d;
        j0Var.f439754e = optJSONObject.optLong("totalFavAmount") / 100.0d;
        java.lang.String str = "afterFavorTradeAmount";
        j0Var.f439755f = optJSONObject.optLong("afterFavorTradeAmount") / 100.0d;
        j0Var.f439756g = optJSONObject.optString("favorComposeId");
        j0Var.f439759m = optJSONObject.optInt("useNaturalDefense");
        j0Var.f439760n = optJSONObject.optString("discountWording");
        j0Var.f439761o = optJSONObject.optString("favorRuleWording");
        java.lang.String str2 = "showFavorAmount";
        j0Var.f439762p = optJSONObject.optDouble("showFavorAmount", 0.0d) / 100.0d;
        j0Var.f439763q = optJSONObject.optDouble("invariableFavorAmount", 0.0d) / 100.0d;
        j0Var.f439764r = optJSONObject.optInt("isVariableFavor");
        j0Var.f439765s = optJSONObject.optString("invariableFavorDesc");
        java.lang.String str3 = "variableFavorDesc";
        j0Var.f439766t = optJSONObject.optString("variableFavorDesc");
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("tradeFavList");
        int i18 = 0;
        while (i18 < optJSONArray.length()) {
            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
            vr4.i1 i1Var = new vr4.i1();
            i1Var.f439734d = jSONObject2.optInt("favType");
            i1Var.f439735e = jSONObject2.optInt("favSubType");
            java.lang.String str4 = str3;
            org.json.JSONArray jSONArray = optJSONArray;
            i1Var.f439736f = jSONObject2.optLong("favProperty");
            i1Var.f439737g = jSONObject2.optString("favorTypeDesc");
            i1Var.f439738h = jSONObject2.optString("favId");
            i1Var.f439739i = jSONObject2.optString("favName");
            i1Var.f439740m = jSONObject2.optString("favDesc");
            i1Var.f439741n = jSONObject2.optString("favorUseManual");
            i1Var.f439742o = jSONObject2.optString("favorRemarks");
            i1Var.f439743p = jSONObject2.optLong("favPrice") / 100.0d;
            i1Var.f439744q = jSONObject2.optLong("realFavFee") / 100.0d;
            i1Var.f439745r = jSONObject2.optInt("needBankPay");
            i1Var.f439746s = jSONObject2.optString("bankNo");
            i1Var.f439747t = jSONObject2.optString("bankName");
            i1Var.f439748u = jSONObject2.optString("bankLogoUrl");
            org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("bind_serial_list");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                    i1Var.f439749v.add(com.tencent.mm.protobuf.g.b(optJSONArray2.optString(i19).getBytes()));
                }
            }
            j0Var.f439757h.add(i1Var);
            i18++;
            str3 = str4;
            optJSONArray = jSONArray;
        }
        java.lang.String str5 = str3;
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("favorComposeList");
        if (optJSONObject2 != null) {
            j0Var.f439758i = new vr4.k0();
            org.json.JSONArray optJSONArray3 = optJSONObject2.optJSONArray("favorComposeInfo");
            int i27 = 0;
            while (i27 < optJSONArray3.length()) {
                org.json.JSONObject jSONObject3 = optJSONArray3.getJSONObject(i27);
                vr4.l0 l0Var = new vr4.l0();
                l0Var.f439773d = jSONObject3.optString("faovrComposeId");
                l0Var.f439774e = jSONObject3.optLong("totalFavorAmount") / 100.0d;
                l0Var.f439775f = jSONObject3.optLong(str) / 100.0d;
                java.lang.String str6 = str;
                java.lang.String str7 = str2;
                l0Var.f439778i = jSONObject3.optDouble(str2, 0.0d) / 100.0d;
                l0Var.f439779m = jSONObject3.optDouble("invariableFavorAmount", 0.0d) / 100.0d;
                l0Var.f439780n = jSONObject3.optInt("isVariableFavor");
                l0Var.f439781o = jSONObject3.optString("invariableFavorDesc");
                java.lang.String str8 = str5;
                l0Var.f439782p = jSONObject3.optString(str8);
                org.json.JSONArray optJSONArray4 = jSONObject3.optJSONArray("composeArray");
                int i28 = 0;
                while (i28 < optJSONArray4.length()) {
                    org.json.JSONObject jSONObject4 = optJSONArray4.getJSONObject(i28);
                    vr4.j jVar = new vr4.j();
                    jVar.f439750d = jSONObject4.optString("favId");
                    jVar.f439751e = jSONObject4.optString("favorUseManual");
                    jVar.f439752f = jSONObject4.optString("favorRemarks");
                    l0Var.f439776g.add(jVar);
                    i28++;
                    str8 = str8;
                }
                str5 = str8;
                j0Var.f439758i.f439770d.add(l0Var);
                i27++;
                str = str6;
                str2 = str7;
            }
        }
        vr4.a aVar = new vr4.a();
        org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("bank_card_info");
        if (optJSONObject3 != null) {
            org.json.JSONArray optJSONArray5 = optJSONObject3.optJSONArray("bind_serial_favor_info_list");
            if (optJSONArray5 != null) {
                for (int i29 = 0; i29 < optJSONArray5.length(); i29++) {
                    vr4.c cVar = new vr4.c();
                    org.json.JSONObject jSONObject5 = optJSONArray5.getJSONObject(i29);
                    cVar.f439705d = jSONObject5.optString("bind_serial");
                    org.json.JSONArray optJSONArray6 = jSONObject5.optJSONArray("bind_serial_favor_list");
                    if (optJSONArray6 != null && optJSONArray6.length() > 0) {
                        for (int i37 = 0; i37 < optJSONArray6.length(); i37++) {
                            vr4.d dVar = new vr4.d();
                            org.json.JSONObject optJSONObject4 = optJSONArray6.optJSONObject(i37);
                            dVar.f439707d = optJSONObject4.optString("favor_desc");
                            dVar.f439708e = optJSONObject4.optInt("is_default_show", 0);
                            cVar.f439706e.add(dVar);
                        }
                    }
                    aVar.f439673d.add(cVar);
                }
            }
            i17 = 0;
            org.json.JSONArray optJSONArray7 = optJSONObject3.optJSONObject("new_bind_card_info").optJSONArray("new_bind_card_favor_list");
            if (optJSONArray7 != null && optJSONArray7.length() > 0) {
                aVar.f439674e = new vr4.v0();
                for (int i38 = 0; i38 < optJSONArray7.length(); i38++) {
                    vr4.w0 w0Var = new vr4.w0();
                    w0Var.f439809d = optJSONArray7.optJSONObject(i38).optString("favor_desc");
                    aVar.f439674e.f439808d.add(w0Var);
                }
            }
        } else {
            i17 = 0;
        }
        j0Var.f439767u = aVar;
        org.json.JSONArray optJSONArray8 = optJSONObject.optJSONArray("favcombid_forbindcard_list");
        if (optJSONArray8 != null) {
            int length = optJSONArray8.length();
            for (int i39 = i17; i39 < length; i39++) {
                org.json.JSONObject optJSONObject5 = optJSONArray8.optJSONObject(i39);
                if (optJSONObject5 != null) {
                    vr4.i0 i0Var = new vr4.i0();
                    i0Var.f439733e = optJSONObject5.optString("default_fav_comb_id");
                    org.json.JSONObject optJSONObject6 = optJSONObject5.optJSONObject("payment_channel");
                    if (optJSONObject6 != null) {
                        vr4.u0 u0Var = new vr4.u0();
                        u0Var.f439805f = optJSONObject6.optString("bind_serial");
                        u0Var.f439804e = optJSONObject6.optInt("selected");
                        u0Var.f439803d = optJSONObject6.optString("bankCode");
                        i0Var.f439732d = u0Var;
                    }
                    j0Var.f439768v.add(i0Var);
                }
            }
        }
        vr4.b bVar = new vr4.b();
        org.json.JSONObject optJSONObject7 = optJSONObject.optJSONObject("bank_fav_guide");
        if (optJSONObject7 != null) {
            vr4.u0 u0Var2 = new vr4.u0();
            org.json.JSONObject optJSONObject8 = optJSONObject7.optJSONObject("payment_channel");
            if (optJSONObject8 != null) {
                u0Var2.f439803d = optJSONObject8.optString("bankCode");
                u0Var2.f439804e = optJSONObject8.optInt("selected");
                u0Var2.f439805f = optJSONObject8.optString("bind_serial");
                bVar.f439680d = u0Var2;
            }
            bVar.f439681e = optJSONObject7.optInt("is_show_guide");
            bVar.f439682f = optJSONObject7.optString("default_fav_comb_id");
            bVar.f439683g = optJSONObject7.optString("guide_content");
            bVar.f439684h = optJSONObject7.optString("guide_content_color");
            bVar.f439685i = optJSONObject7.optString("guide_btn_text");
            bVar.f439686m = optJSONObject7.optString("guide_btn_text_color");
            bVar.f439687n = optJSONObject7.optString("guide_btn_bg_color");
            bVar.f439688o = optJSONObject7.optString("guide_logo");
            j0Var.f439769w = bVar;
        }
        return j0Var;
    }

    public static void f(org.json.JSONObject jSONObject, com.tencent.mm.plugin.wallet_core.model.Orders orders, int i17) {
        java.util.List list = orders.M;
        orders.C = jSONObject.optString("pay_result_tips");
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("payresult");
        int length = jSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
            if (list != null && list.size() == 1) {
                com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) list.get(0);
                commodity.H = new java.util.ArrayList();
                commodity.A = new java.util.ArrayList();
                commodity.f179714r = jSONObject2.getString(ya.b.TRANSACTION_ID);
                b(commodity, jSONObject2, i17);
            } else if (list != null) {
                java.lang.String string = jSONObject2.getString(ya.b.TRANSACTION_ID);
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity2 = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) it.next();
                        if (string != null && string.equals(commodity2.f179714r)) {
                            b(commodity2, jSONObject2, i17);
                            break;
                        }
                    }
                }
            }
        }
    }

    public static com.tencent.mm.plugin.wallet_core.model.Orders g(org.json.JSONObject jSONObject, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        if (jSONObject == null || orders == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Orders", "oldOrders is null");
        } else {
            try {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("appservice");
                if (optJSONObject != null) {
                    orders.f179697y = optJSONObject.optString("app_recommend_desc");
                    orders.f179700z = optJSONObject.optString("app_telephone");
                    orders.A = optJSONObject.optInt("recommend_level", 2);
                    orders.D = optJSONObject.optString("share_to_friends_url");
                }
                f(jSONObject, orders, orders.A);
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("extinfo");
                if (optJSONObject2 != null) {
                    orders.E = optJSONObject2.optLong("fetch_pre_arrive_time") * 1000;
                    orders.F = optJSONObject2.optString("fetch_pre_arrive_time_wording");
                }
                orders.V = jSONObject.optInt("is_use_new_paid_succ_page", 0);
                orders.W = jSONObject.optString("pay_succ_btn_wording");
                orders.Y = jSONObject.optInt("is_jsapi_close_page");
                orders.f179685p0 = jSONObject.optString("jsapi_tinyapp_username");
                orders.f179695x0 = jSONObject.optString("jsapi_tinyapp_path");
                h(orders, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Orders", e17, "", new java.lang.Object[0]);
            }
        }
        return orders;
    }

    public static void h(com.tencent.mm.plugin.wallet_core.model.Orders orders, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int optInt = jSONObject.optInt("is_use_show_info", 0);
                orders.X = optInt;
                com.tencent.mars.xlog.Log.i("MicroMsg.Orders", "is_use_show_info: %s", java.lang.Integer.valueOf(optInt));
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("show_info");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Orders", "showInfo size: %s", java.lang.Integer.valueOf(optJSONArray.length()));
                orders.Z = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo();
                        showInfo.f179805d = optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                        showInfo.f179806e = optJSONObject.optString("value");
                        showInfo.f179807f = optJSONObject.optString("name_color");
                        showInfo.f179808g = optJSONObject.optString("value_color");
                        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("value_attr");
                        if (optJSONObject2 != null) {
                            showInfo.f179809h = optJSONObject2.optInt("link_type");
                            showInfo.f179810i = optJSONObject2.optString("link_weapp");
                            showInfo.f179811m = optJSONObject2.optString("link_addr");
                            showInfo.f179812n = optJSONObject2.optString("link_url");
                            showInfo.f179813o = optJSONObject2.optInt("text_attr");
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(showInfo.f179805d) || !com.tencent.mm.sdk.platformtools.t8.K0(showInfo.f179806e)) {
                            orders.Z.add(showInfo);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Orders", e17, "parseShowInfo error", new java.lang.Object[0]);
            }
        }
    }

    public static void i(org.json.JSONObject jSONObject, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("simple_cashier_info")) == null) {
            return;
        }
        com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo simpleCashierInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo();
        orders.B1 = simpleCashierInfo;
        simpleCashierInfo.f179814d = optJSONObject.optInt("use_simple_cashier");
        orders.B1.f179815e = optJSONObject.optString("bank_type");
        orders.B1.f179816f = optJSONObject.optString("bind_serial");
    }

    public static java.util.HashSet m(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            for (java.lang.String str2 : str.split("\\|")) {
                hashSet.add(str2);
            }
            if (hashSet.size() > 0) {
                hashSet.retainAll(hashSet);
            } else {
                hashSet.clear();
            }
        }
        return hashSet;
    }

    public static void n(org.json.JSONObject jSONObject, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Orders", "bindqueryresp is null ");
            return;
        }
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("user_info");
        if (optJSONObject2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Orders", "user_info is null ");
            return;
        }
        org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("touch_info");
        if (optJSONObject3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Orders", "touch_info is null ");
            return;
        }
        orders.I = ((nz2.o) gm0.j1.s(nz2.o.class)).ja() || ((nz2.o) gm0.j1.s(nz2.o.class)).h1() ? optJSONObject3.optInt("use_touch_pay", 0) : 0;
        orders.L = optJSONObject3.optString("touch_forbidword");
        java.lang.String optString = optJSONObject3.optString("touch_challenge");
        boolean z17 = 1 == optJSONObject3.optInt("need_change_auth_key");
        orders.f179673J = optString;
        orders.K = z17;
        mz2.d2 d2Var = mz2.d2.IML;
        d2Var.f333111d = optString;
        d2Var.f333113f = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Orders", "hy: use_touch_pay is %s, challenge is: %s, is need change: %b", java.lang.Integer.valueOf(orders.I), optString, java.lang.Boolean.valueOf(z17));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "reqKey:" + this.f179675e + "\ntoken" + this.f179676f + "\nnum" + this.f179677g + "\ntotalFee" + this.f179678h + "\n";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f179674d);
        parcel.writeString(this.f179675e);
        parcel.writeString(this.f179676f);
        parcel.writeString(this.f179677g);
        parcel.writeDouble(this.f179678h);
        parcel.writeInt(this.f179679i);
        parcel.writeString(this.f179681m);
        parcel.writeDouble(this.f179682n);
        parcel.writeDouble(this.f179683o);
        parcel.writeInt(this.f179684p);
        parcel.writeString(this.f179687q);
        parcel.writeString(this.f179688r);
        parcel.writeInt(this.f179689s);
        parcel.writeString(this.f179690t);
        parcel.writeString(this.f179691u);
        parcel.writeString(this.f179692v);
        parcel.writeString(this.f179693w);
        parcel.writeString(this.f179694x);
        parcel.writeString(this.f179697y);
        parcel.writeString(this.f179700z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeLong(this.E);
        parcel.writeString(this.F);
        parcel.writeTypedList(this.M);
        parcel.writeString(this.G);
        parcel.writeInt(this.I);
        parcel.writeString(this.L);
        parcel.writeParcelable(this.S, 1);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeInt(this.Y);
        parcel.writeString(this.f179695x0);
        parcel.writeString(this.f179685p0);
        parcel.writeInt(this.X);
        parcel.writeTypedList(this.Z);
        parcel.writeParcelable(this.B1, 1);
        parcel.writeString(this.f179673J);
        parcel.writeInt(this.K ? 1 : 0);
    }

    /* loaded from: classes9.dex */
    public static class DeductInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo> CREATOR = new com.tencent.mm.plugin.wallet_core.model.c();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f179723d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179724e;

        /* renamed from: f, reason: collision with root package name */
        public int f179725f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f179726g;

        /* renamed from: h, reason: collision with root package name */
        public java.util.List f179727h = new java.util.ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public int f179728i;

        /* renamed from: m, reason: collision with root package name */
        public int f179729m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f179730n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f179731o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f179732p;

        /* renamed from: q, reason: collision with root package name */
        public java.lang.String f179733q;

        public DeductInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f179723d);
            parcel.writeString(this.f179724e);
            parcel.writeInt(this.f179725f);
            parcel.writeString(this.f179726g);
            parcel.writeInt(this.f179728i);
            parcel.writeTypedList(this.f179727h);
            parcel.writeInt(this.f179729m);
            parcel.writeString(this.f179730n);
            parcel.writeString(this.f179731o);
            parcel.writeString(this.f179732p);
            parcel.writeString(this.f179733q);
        }

        public DeductInfo(android.os.Parcel parcel) {
            this.f179723d = parcel.readString();
            this.f179724e = parcel.readString();
            this.f179725f = parcel.readInt();
            this.f179726g = parcel.readString();
            this.f179728i = parcel.readInt();
            parcel.readTypedList(this.f179727h, com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo.CREATOR);
            this.f179729m = parcel.readInt();
            this.f179730n = parcel.readString();
            this.f179731o = parcel.readString();
            this.f179732p = parcel.readString();
            this.f179733q = parcel.readString();
        }
    }

    /* loaded from: classes9.dex */
    public static class Commodity implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Orders.Commodity> CREATOR = new com.tencent.mm.plugin.wallet_core.model.b();
        public java.util.List A;
        public java.lang.String B;
        public java.lang.String C;
        public com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo D;
        public com.tencent.mm.plugin.wallet_core.model.Orders.FinderInfo E;
        public com.tencent.mm.plugin.wallet_core.model.Orders.LeadTailViewInfo F;
        public com.tencent.mm.plugin.wallet_core.model.Orders.RemarksInfo G;
        public java.util.List H;
        public boolean I;

        /* renamed from: J, reason: collision with root package name */
        public final at4.w0 f179702J;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f179703d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f179704e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f179705f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f179706g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f179707h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f179708i;

        /* renamed from: m, reason: collision with root package name */
        public double f179709m;

        /* renamed from: n, reason: collision with root package name */
        public double f179710n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f179711o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f179712p;

        /* renamed from: q, reason: collision with root package name */
        public int f179713q;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f179714r;

        /* renamed from: s, reason: collision with root package name */
        public java.lang.String f179715s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f179716t;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f179717u;

        /* renamed from: v, reason: collision with root package name */
        public java.lang.String f179718v;

        /* renamed from: w, reason: collision with root package name */
        public java.lang.String f179719w;

        /* renamed from: x, reason: collision with root package name */
        public java.lang.String f179720x;

        /* renamed from: y, reason: collision with root package name */
        public java.lang.String f179721y;

        /* renamed from: z, reason: collision with root package name */
        public int f179722z;

        public Commodity() {
            this.f179709m = 0.0d;
            this.f179710n = 0.0d;
            this.A = new java.util.ArrayList();
            this.D = null;
            this.E = null;
            this.F = null;
            this.H = new java.util.ArrayList();
            this.I = false;
            this.f179702J = new at4.w0();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f179703d);
            parcel.writeString(this.f179704e);
            parcel.writeString(this.f179705f);
            parcel.writeString(this.f179706g);
            parcel.writeString(this.f179707h);
            parcel.writeString(this.f179708i);
            parcel.writeDouble(this.f179709m);
            parcel.writeString(this.f179711o);
            parcel.writeString(this.f179712p);
            parcel.writeInt(this.f179713q);
            parcel.writeString(this.f179714r);
            parcel.writeString(this.f179715s);
            parcel.writeString(this.f179716t);
            parcel.writeString(this.f179717u);
            parcel.writeString(this.f179719w);
            parcel.writeString(this.f179720x);
            parcel.writeString(this.f179721y);
            parcel.writeTypedList(this.A);
            parcel.writeString(this.B);
            parcel.writeString(this.C);
            parcel.writeParcelable(this.D, 0);
            parcel.writeParcelable(this.E, 0);
            parcel.writeParcelable(this.F, 0);
            parcel.writeTypedList(this.H);
            parcel.writeParcelable(this.G, 0);
            parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
        }

        public Commodity(android.os.Parcel parcel) {
            this.f179709m = 0.0d;
            this.f179710n = 0.0d;
            this.A = new java.util.ArrayList();
            this.D = null;
            this.E = null;
            this.F = null;
            this.H = new java.util.ArrayList();
            this.I = false;
            this.f179702J = new at4.w0();
            this.f179703d = parcel.readString();
            this.f179704e = parcel.readString();
            this.f179705f = parcel.readString();
            this.f179706g = parcel.readString();
            this.f179707h = parcel.readString();
            this.f179708i = parcel.readString();
            this.f179709m = parcel.readDouble();
            this.f179711o = parcel.readString();
            this.f179712p = parcel.readString();
            this.f179713q = parcel.readInt();
            this.f179714r = parcel.readString();
            this.f179715s = parcel.readString();
            this.f179716t = parcel.readString();
            this.f179717u = parcel.readString();
            this.f179719w = parcel.readString();
            this.f179720x = parcel.readString();
            this.f179721y = parcel.readString();
            parcel.readTypedList(this.A, com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo.CREATOR);
            this.B = parcel.readString();
            this.C = parcel.readString();
            this.D = (com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo.class.getClassLoader());
            this.E = (com.tencent.mm.plugin.wallet_core.model.Orders.FinderInfo) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.model.Orders.FinderInfo.class.getClassLoader());
            this.F = (com.tencent.mm.plugin.wallet_core.model.Orders.LeadTailViewInfo) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.model.Orders.LeadTailViewInfo.class.getClassLoader());
            parcel.readTypedList(this.H, com.tencent.mm.plugin.wallet_core.model.Orders.Promotions.CREATOR);
            this.G = (com.tencent.mm.plugin.wallet_core.model.Orders.RemarksInfo) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.model.Orders.RemarksInfo.class.getClassLoader());
            this.I = parcel.readByte() != 0;
        }
    }

    public Orders(android.os.Parcel parcel) {
        this.f179675e = "";
        this.f179676f = "";
        this.f179677g = "0";
        this.f179678h = 0.0d;
        this.f179683o = 0.0d;
        this.B = false;
        this.C = "";
        this.D = "";
        this.E = 0L;
        this.F = "";
        this.H = new java.util.HashSet();
        this.I = 0;
        this.L = "";
        this.M = new java.util.ArrayList();
        this.N = new vr4.j0();
        this.P = 0;
        this.Q = "";
        this.R = "";
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = "";
        this.X = 0;
        this.Y = 0;
        this.Z = new java.util.ArrayList();
        this.f179685p0 = "";
        this.f179695x0 = "";
        this.field_infos = new java.util.ArrayList<>();
        this.f179698y0 = "";
        this.f179696x1 = "";
        this.f179674d = parcel.readLong();
        this.f179675e = parcel.readString();
        this.f179676f = parcel.readString();
        this.f179677g = parcel.readString();
        this.f179678h = parcel.readDouble();
        this.f179679i = parcel.readInt();
        this.f179681m = parcel.readString();
        this.f179682n = parcel.readDouble();
        this.f179683o = parcel.readDouble();
        this.f179684p = parcel.readInt();
        this.f179687q = parcel.readString();
        this.f179688r = parcel.readString();
        this.f179689s = parcel.readInt();
        this.f179690t = parcel.readString();
        this.f179691u = parcel.readString();
        this.f179692v = parcel.readString();
        this.f179693w = parcel.readString();
        this.f179694x = parcel.readString();
        this.f179697y = parcel.readString();
        this.f179700z = parcel.readString();
        this.A = parcel.readInt();
        this.B = parcel.readInt() == 1;
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readLong();
        this.F = parcel.readString();
        parcel.readTypedList(this.M, com.tencent.mm.plugin.wallet_core.model.Orders.Commodity.CREATOR);
        java.lang.String readString = parcel.readString();
        this.G = readString;
        this.H = m(readString);
        this.I = parcel.readInt();
        this.L = parcel.readString();
        this.S = (com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo.class.getClassLoader());
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.Y = parcel.readInt();
        this.f179695x0 = parcel.readString();
        this.f179685p0 = parcel.readString();
        this.X = parcel.readInt();
        parcel.readTypedList(this.Z, com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo.CREATOR);
        this.B1 = (com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo.class.getClassLoader());
        this.f179673J = parcel.readString();
        this.K = parcel.readInt() == 1;
    }
}
