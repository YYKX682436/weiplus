package com.tencent.mm.plugin.transvoice.model;

/* loaded from: classes5.dex */
public final class e {
    public static final com.tencent.mm.plugin.transvoice.model.e I = com.tencent.mm.plugin.transvoice.model.d.f175376a;
    public long A;
    public int D;
    public int E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f175377a;

    /* renamed from: b, reason: collision with root package name */
    public long f175378b;

    /* renamed from: c, reason: collision with root package name */
    public int f175379c;

    /* renamed from: d, reason: collision with root package name */
    public int f175380d;

    /* renamed from: e, reason: collision with root package name */
    public long f175381e;

    /* renamed from: f, reason: collision with root package name */
    public int f175382f;

    /* renamed from: g, reason: collision with root package name */
    public int f175383g;

    /* renamed from: j, reason: collision with root package name */
    public int f175386j;

    /* renamed from: k, reason: collision with root package name */
    public int f175387k;

    /* renamed from: l, reason: collision with root package name */
    public int f175388l;

    /* renamed from: m, reason: collision with root package name */
    public long f175389m;

    /* renamed from: n, reason: collision with root package name */
    public long f175390n;

    /* renamed from: o, reason: collision with root package name */
    public int f175391o;

    /* renamed from: p, reason: collision with root package name */
    public int f175392p;

    /* renamed from: q, reason: collision with root package name */
    public int f175393q;

    /* renamed from: r, reason: collision with root package name */
    public long f175394r;

    /* renamed from: s, reason: collision with root package name */
    public int f175395s;

    /* renamed from: t, reason: collision with root package name */
    public int f175396t;

    /* renamed from: u, reason: collision with root package name */
    public int f175397u;

    /* renamed from: v, reason: collision with root package name */
    public int f175398v;

    /* renamed from: w, reason: collision with root package name */
    public int f175399w;

    /* renamed from: x, reason: collision with root package name */
    public int f175400x;

    /* renamed from: y, reason: collision with root package name */
    public long f175401y;

    /* renamed from: z, reason: collision with root package name */
    public long f175402z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f175384h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f175385i = new java.util.ArrayList();
    public int B = 1;
    public java.lang.String C = "";
    public java.lang.String G = "";
    public final int H = 20260306;

    public e(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        this.f175378b = 0L;
        this.f175379c = 0;
        this.f175380d = 0;
        this.f175381e = 0L;
        this.f175382f = 0;
        this.f175383g = 0;
        this.f175388l = 0;
        this.f175389m = 0L;
        this.f175390n = 0L;
        this.f175391o = 0;
        this.f175392p = 0;
        this.f175393q = 0;
        this.f175394r = 0L;
        this.f175395s = 0;
        this.f175396t = 0;
        this.f175397u = 0;
        this.f175398v = 0;
        this.f175399w = 0;
        this.f175400x = 0;
        this.f175401y = 0L;
        this.f175402z = 0L;
        this.A = 0L;
        this.B = 1;
        this.C = "";
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = "";
        this.f175384h.clear();
        this.f175385i.clear();
        this.f175386j = 0;
    }

    public final void b(int i17) {
        int i18;
        if (!this.f175377a) {
            a();
            return;
        }
        this.f175377a = false;
        this.f175387k = i17;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393261h) {
            i18 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
        } else if (r75.d.f393258e == -100) {
            i18 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
            r75.d.f393258e = i18;
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.tencent.mars.xlog.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f393258e);
            i18 = r75.d.f393258e;
        }
        this.f175388l = i18;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17164, java.lang.Long.valueOf(this.f175378b), java.lang.Integer.valueOf(this.f175379c), java.lang.Integer.valueOf(this.f175380d), java.lang.Long.valueOf(this.f175381e), java.lang.Integer.valueOf(this.f175382f), java.lang.Integer.valueOf(this.f175383g), java.lang.Integer.valueOf(this.f175387k), java.lang.Integer.valueOf(this.f175388l), java.lang.Long.valueOf(this.f175389m), java.lang.Long.valueOf(this.f175390n), java.lang.Integer.valueOf(this.f175391o), java.lang.Integer.valueOf(this.f175392p), java.lang.Integer.valueOf(this.f175393q), java.lang.Long.valueOf(this.f175394r), java.lang.Integer.valueOf(this.f175395s), java.lang.Integer.valueOf(this.f175396t), java.lang.Integer.valueOf(this.f175397u), java.lang.Integer.valueOf(this.f175398v), java.lang.Integer.valueOf(this.f175399w), java.lang.Integer.valueOf(this.f175400x), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().widthPixels), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels), 0, 0, 0, 0, 0L, java.lang.Long.valueOf(this.f175401y), java.lang.Long.valueOf(this.f175402z), java.lang.Long.valueOf(this.A), 0, java.lang.Integer.valueOf(this.B), 0, 0, this.C, 0, java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(this.H), kz5.n0.g0(this.f175384h, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(this.f175385i, "#", null, null, 0, null, null, 62, null), java.lang.Integer.valueOf(this.f175386j), this.G);
        a();
    }
}
