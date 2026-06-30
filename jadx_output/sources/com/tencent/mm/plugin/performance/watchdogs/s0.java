package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.s0 f153126a = new com.tencent.mm.plugin.performance.watchdogs.s0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f153127b = com.tencent.mm.sdk.platformtools.o4.M("oom_monitor");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f153128c = com.tencent.mm.plugin.performance.watchdogs.t0.a() + "_pid";

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f153129d = jz5.h.b(com.tencent.mm.plugin.performance.watchdogs.r0.f153120d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f153130e = jz5.h.b(com.tencent.mm.plugin.performance.watchdogs.q0.f153117d);

    public final void a(ob0.s3 info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (!((java.lang.Boolean) f153129d.getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NativeOOMMonitor", "disabled");
            return;
        }
        com.tencent.mm.plugin.performance.watchdogs.m0.f153102c.h(info);
        com.tencent.mm.plugin.performance.watchdogs.p0.f153111c.h(info);
        com.tencent.mm.plugin.performance.watchdogs.n0 n0Var = com.tencent.mm.plugin.performance.watchdogs.n0.f153104a;
        long j17 = info.f343957n;
        if (2147483649L <= j17 && j17 < 500000000001L) {
            java.lang.String str = com.tencent.mm.plugin.performance.watchdogs.n0.f153105b;
            com.tencent.mm.sdk.platformtools.o4 o4Var = f153127b;
            long q17 = o4Var.q(str, -1L);
            long j18 = info.f343957n;
            if (j18 > q17) {
                o4Var.B(str, j18);
                o4Var.B(com.tencent.mm.plugin.performance.watchdogs.n0.f153106c, java.lang.System.currentTimeMillis());
            }
        }
    }

    public final void b() {
        try {
            com.tencent.mm.plugin.performance.watchdogs.m0.f153102c.e();
            com.tencent.mm.plugin.performance.watchdogs.p0.f153111c.e();
            com.tencent.mm.plugin.performance.watchdogs.n0.f153104a.a();
            f153127b.A(f153128c, android.os.Process.myPid());
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.NativeOOMMonitor", th6, "", new java.lang.Object[0]);
        }
    }
}
