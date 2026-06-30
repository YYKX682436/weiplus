package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f159020a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f159021b;

    /* renamed from: c, reason: collision with root package name */
    public static int f159022c;

    /* renamed from: d, reason: collision with root package name */
    public static long f159023d;

    /* renamed from: e, reason: collision with root package name */
    public static int f159024e;

    /* renamed from: f, reason: collision with root package name */
    public static int f159025f;

    /* renamed from: g, reason: collision with root package name */
    public static int f159026g;

    /* renamed from: h, reason: collision with root package name */
    public static int f159027h;

    /* renamed from: i, reason: collision with root package name */
    public static int f159028i;

    /* renamed from: j, reason: collision with root package name */
    public static int f159029j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f159030k;

    /* renamed from: l, reason: collision with root package name */
    public static int f159031l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f159032m;

    /* renamed from: n, reason: collision with root package name */
    public static int f159033n;

    /* renamed from: o, reason: collision with root package name */
    public static int f159034o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f159035p;

    /* renamed from: q, reason: collision with root package name */
    public static int f159036q;

    /* renamed from: r, reason: collision with root package name */
    public static int f159037r;

    /* renamed from: s, reason: collision with root package name */
    public static int f159038s;

    /* renamed from: t, reason: collision with root package name */
    public static int f159039t;

    /* renamed from: u, reason: collision with root package name */
    public static int f159040u;

    /* renamed from: v, reason: collision with root package name */
    public static int f159041v;

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f159042w;

    static {
        bz3.h hVar = bz3.h.f36774a;
        f159020a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_scan_enable_operate_reporter, false);
        f159030k = "";
        f159032m = "";
        f159035p = "";
        f159042w = "";
    }

    public static final void a(int i17) {
        if (f159020a && !f159021b) {
            f159021b = true;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f159023d;
            com.tencent.wechat.aff.iam_scan.h0 h0Var = com.tencent.wechat.aff.iam_scan.h0.f217048b;
            com.tencent.wechat.aff.iam_scan.x0 b17 = h0Var.b();
            h0Var.f();
            f159026g = b17.f217164d ? 1 : 0;
            f159027h = b17.f217165e ? 1 : 0;
            f159033n = b17.f217167g;
            f159034o = b17.f217166f;
            boolean[] zArr = b17.f217178u;
            java.lang.String str = zArr[6] ? b17.f217169i : "";
            kotlin.jvm.internal.o.f(str, "getCodeDetectLocation(...)");
            f159035p = str;
            f159036q = b17.f217168h;
            f159037r = b17.f217170m;
            f159038s = b17.f217171n;
            f159040u = b17.f217173p;
            f159041v = b17.f217172o;
            java.lang.String str2 = zArr[11] ? b17.f217174q : "";
            kotlin.jvm.internal.o.f(str2, "getCodeExtraInfo(...)");
            f159042w = str2;
            int i18 = b17.f217175r;
            if (i18 <= 0) {
                i18 = 0;
            }
            f159022c = i18;
            f159029j = b17.f217177t ? 1 : 0;
            f159025f = b17.f217176s ? 1 : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanOperateReporter", "log36180: " + f159023d + ", " + currentTimeMillis + ", " + f159024e + ", " + i17 + ", 1, " + f159025f + ", " + f159026g + ", " + f159027h + ", " + f159028i + ", " + f159029j + ", " + f159030k + ", " + f159022c + ", 0, " + f159031l + ", " + f159032m + ", " + f159033n + ", " + f159034o + ", " + f159035p + ", " + f159036q + ", " + f159037r + ", " + f159038s + ", " + f159039t + ", " + f159040u + ", " + f159041v + ", " + f159042w + ',');
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36180, java.lang.Long.valueOf(f159023d), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(f159024e), java.lang.Integer.valueOf(i17), 1, java.lang.Integer.valueOf(f159025f), java.lang.Integer.valueOf(f159026g), java.lang.Integer.valueOf(f159027h), java.lang.Integer.valueOf(f159028i), java.lang.Integer.valueOf(f159029j), f159030k, java.lang.Integer.valueOf(f159022c), 0, java.lang.Integer.valueOf(f159031l), f159032m, java.lang.Integer.valueOf(f159033n), java.lang.Integer.valueOf(f159034o), f159035p, java.lang.Integer.valueOf(f159036q), java.lang.Integer.valueOf(f159037r), java.lang.Integer.valueOf(f159038s), java.lang.Integer.valueOf(f159039t), java.lang.Integer.valueOf(f159040u), java.lang.Integer.valueOf(f159041v), f159042w);
            f159024e = i17;
        }
    }

    public static final void b() {
        if (f159020a) {
            f159021b = false;
            f159022c = 0;
            f159023d = java.lang.System.currentTimeMillis();
            f159025f = 0;
            f159026g = 0;
            f159027h = 0;
            f159028i = 0;
            f159029j = 0;
            f159030k = "";
            f159031l = 0;
            f159032m = "";
            f159033n = 0;
            f159034o = 0;
            f159035p = "";
            f159036q = 0;
            f159037r = 0;
            f159038s = 0;
            f159039t = 0;
            f159040u = 0;
            f159041v = 0;
            f159042w = "";
        }
    }
}
