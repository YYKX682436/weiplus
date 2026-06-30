package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f145860a;

    /* renamed from: b, reason: collision with root package name */
    public static int f145861b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f145862c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static int f145863d;

    /* renamed from: e, reason: collision with root package name */
    public static int f145864e;

    /* renamed from: f, reason: collision with root package name */
    public static int f145865f;

    /* renamed from: g, reason: collision with root package name */
    public static int f145866g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f145867h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f145868i;

    /* renamed from: j, reason: collision with root package name */
    public static long f145869j;

    /* renamed from: k, reason: collision with root package name */
    public static int f145870k;

    /* renamed from: l, reason: collision with root package name */
    public static int f145871l;

    /* renamed from: m, reason: collision with root package name */
    public static int f145872m;

    /* renamed from: n, reason: collision with root package name */
    public static int f145873n;

    public static void a(int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f145868i) || com.tencent.mm.sdk.platformtools.t8.K0(f145867h)) {
            return;
        }
        long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() / 1000) - f145869j;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = f145860a;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f145861b);
        java.util.Set set = f145862c;
        g0Var.d(18994, valueOf, str, 0, valueOf2, java.lang.Integer.valueOf(((java.util.HashSet) set).size()), java.lang.Integer.valueOf(f145863d), java.lang.Integer.valueOf(f145864e), java.lang.Integer.valueOf(f145865f), java.lang.Integer.valueOf(f145866g), f145867h, f145868i, java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(f145870k), java.lang.Integer.valueOf(f145871l), java.lang.Integer.valueOf(f145872m), java.lang.Integer.valueOf(f145873n));
        f145860a = null;
        f145861b = 0;
        ((java.util.HashSet) set).clear();
        f145863d = 0;
        f145864e = 0;
        f145865f = 0;
        f145866g = 0;
        f145868i = null;
        f145869j = 0L;
        f145870k = 0;
        f145871l = 0;
        f145872m = 0;
        f145873n = 0;
        f145867h = null;
    }
}
