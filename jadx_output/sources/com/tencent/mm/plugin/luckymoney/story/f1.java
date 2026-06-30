package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f145851a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f145852b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f145853c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f145854d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f145855e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static long f145856f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f145857g;

    public static void a(int i17) {
        if (f145856f > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20255, java.lang.Integer.valueOf(f145851a), f145852b, java.lang.Integer.valueOf(f145853c), 0, f145854d, java.lang.Integer.valueOf(f145855e), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() - f145856f) / 1000), f145857g);
        }
        f145851a = 0;
        f145856f = -1L;
        f145852b = null;
        f145853c = 0;
        f145854d = null;
        f145855e = 1;
        f145857g = "";
    }
}
