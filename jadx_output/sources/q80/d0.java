package q80;

/* loaded from: classes8.dex */
public class d0 {
    public int A;
    public boolean B;
    public int C;
    public org.json.JSONObject D;
    public java.lang.String E;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f360649a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f360650b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f360651c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f360652d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f360653e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f360654f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Bundle f360655g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f360656h;

    /* renamed from: i, reason: collision with root package name */
    public int f360657i;

    /* renamed from: j, reason: collision with root package name */
    public double f360658j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f360659k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f360660l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig f360661m;

    /* renamed from: n, reason: collision with root package name */
    public int f360662n;

    /* renamed from: o, reason: collision with root package name */
    public long f360663o;

    /* renamed from: p, reason: collision with root package name */
    public int f360664p;

    /* renamed from: q, reason: collision with root package name */
    public int f360665q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f360666r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f360667s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f360668t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String[] f360669u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String[] f360670v;

    /* renamed from: w, reason: collision with root package name */
    public long f360671w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.s f360672x;

    /* renamed from: y, reason: collision with root package name */
    public org.json.JSONObject f360673y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.liteapp.storage.LiteAppReferrerInfo f360674z;

    public d0() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f360652d = bool;
        this.f360653e = false;
        this.f360655g = null;
        this.f360656h = bool;
        this.f360657i = 0;
        this.f360658j = 0.0d;
        this.f360659k = false;
        this.f360660l = false;
        this.f360661m = null;
        this.f360662n = 0;
        this.f360663o = 0L;
        this.f360664p = 0;
        this.f360665q = 0;
        this.f360666r = true;
        this.f360667s = false;
        this.f360671w = 0L;
        this.f360672x = null;
        this.f360673y = null;
        this.f360674z = null;
        this.A = 0;
        this.B = false;
        this.C = 0;
        this.D = null;
        this.E = "";
        this.f360649a = "";
        this.f360650b = "";
    }

    public d0(java.lang.String str) {
        java.lang.String str2;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f360652d = bool;
        this.f360653e = false;
        this.f360655g = null;
        this.f360656h = bool;
        this.f360657i = 0;
        this.f360658j = 0.0d;
        this.f360659k = false;
        this.f360660l = false;
        this.f360661m = null;
        this.f360662n = 0;
        this.f360663o = 0L;
        this.f360664p = 0;
        this.f360665q = 0;
        this.f360666r = true;
        this.f360667s = false;
        this.f360671w = 0L;
        this.f360672x = null;
        this.f360673y = null;
        this.f360674z = null;
        this.A = 0;
        this.B = false;
        this.C = 0;
        this.D = null;
        java.lang.String str3 = "";
        this.E = "";
        int i17 = str.startsWith("liteapp://") ? 10 : 0;
        int i18 = i17;
        while (true) {
            if (i18 >= str.length()) {
                i18 = -1;
                break;
            } else if ("/?".indexOf(str.charAt(i18)) != -1) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 == -1) {
            str2 = str.substring(i17);
        } else {
            java.lang.String substring = str.substring(i17, i18);
            str3 = str.substring(i18 + 1);
            str2 = substring;
        }
        this.f360649a = str2;
        this.f360650b = str3;
    }
}
