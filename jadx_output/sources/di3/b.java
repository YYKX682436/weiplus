package di3;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: J, reason: collision with root package name */
    public static di3.b f232651J;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public long F;
    public long G;
    public int H;

    /* renamed from: c, reason: collision with root package name */
    public int f232654c;

    /* renamed from: d, reason: collision with root package name */
    public int f232655d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f232656e;

    /* renamed from: f, reason: collision with root package name */
    public int f232657f;

    /* renamed from: g, reason: collision with root package name */
    public int f232658g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f232659h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f232660i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f232661j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f232662k;

    /* renamed from: l, reason: collision with root package name */
    public int f232663l;

    /* renamed from: m, reason: collision with root package name */
    public int f232664m;

    /* renamed from: n, reason: collision with root package name */
    public int f232665n;

    /* renamed from: o, reason: collision with root package name */
    public int f232666o;

    /* renamed from: p, reason: collision with root package name */
    public int f232667p;

    /* renamed from: q, reason: collision with root package name */
    public int f232668q;

    /* renamed from: s, reason: collision with root package name */
    public int f232670s;

    /* renamed from: t, reason: collision with root package name */
    public int f232671t;

    /* renamed from: u, reason: collision with root package name */
    public int f232672u;

    /* renamed from: v, reason: collision with root package name */
    public int f232673v;

    /* renamed from: w, reason: collision with root package name */
    public int f232674w;

    /* renamed from: x, reason: collision with root package name */
    public int f232675x;

    /* renamed from: y, reason: collision with root package name */
    public int f232676y;

    /* renamed from: z, reason: collision with root package name */
    public int f232677z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f232652a = wo.w0.m();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f232653b = android.os.Build.VERSION.SDK_INT + "";

    /* renamed from: r, reason: collision with root package name */
    public int f232669r = 0;
    public org.json.JSONObject I = null;

    public static di3.b b() {
        if (f232651J == null) {
            c();
        }
        return f232651J;
    }

    public static void c() {
        di3.b bVar = new di3.b();
        f232651J = bVar;
        bVar.f232654c = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        f232651J.f232655d = ai3.d.o(com.tencent.mm.sdk.platformtools.x2.f193071a);
        f232651J.f232656e = wo.r.e();
        android.graphics.Point f17 = ai3.d.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        di3.b bVar2 = f232651J;
        bVar2.f232657f = f17.x;
        bVar2.f232658g = f17.y;
    }

    public void a(java.lang.String str, int i17) {
        di3.f0 f0Var = di3.w.f232770d;
        this.f232672u = f0Var.f232700a;
        this.f232673v = f0Var.f232703d;
        this.f232674w = f0Var.f232704e ? 1 : 0;
        this.f232675x = f0Var.f232705f ? 1 : 0;
        this.f232676y = f0Var.f232706g;
        this.f232677z = i17;
        this.F = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 != null) {
            this.C = d17.f162384c;
            this.D = d17.f162385d;
            this.E = d17.f162383b;
            this.A = d17.f162382a;
        }
    }

    public void d(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3) {
        this.f232668q = -1;
        this.f232667p = -1;
        this.f232664m = -1;
        this.f232663l = -1;
        this.f232666o = -1;
        this.f232665n = -1;
        if (point != null) {
            this.f232665n = point.x;
            this.f232666o = point.y;
        }
        if (point2 != null) {
            this.f232663l = point2.x;
            this.f232664m = point2.y;
        }
        if (point3 != null) {
            this.f232667p = point3.x;
            this.f232668q = point3.y;
        }
    }

    public void e(java.util.List list, java.util.List list2, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f232659h)) {
            this.f232659h = ai3.d.v(list);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f232660i)) {
            this.f232660i = ai3.d.v(list2);
        }
        this.f232669r = i17;
        this.H = 1;
    }

    public void f(java.util.List list, java.util.List list2, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f232661j)) {
            this.f232661j = ai3.d.v(list);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f232662k)) {
            this.f232662k = ai3.d.v(list2);
        }
        this.f232669r = i17;
        this.H = 2;
    }
}
