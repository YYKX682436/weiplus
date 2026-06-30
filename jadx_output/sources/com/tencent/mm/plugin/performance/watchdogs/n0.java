package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.n0 f153104a = new com.tencent.mm.plugin.performance.watchdogs.n0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f153105b = com.tencent.mm.plugin.performance.watchdogs.t0.a() + "_native_heap_top";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f153106c = com.tencent.mm.plugin.performance.watchdogs.t0.a() + "_timestamp";

    public final void a() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.performance.watchdogs.s0.f153127b;
        java.lang.String str = f153105b;
        long q17 = o4Var.q(str, -1L);
        long q18 = o4Var.q(f153106c, 0L);
        if (q17 > 2147483648L) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeOOMMonitor", "report top native heap last process " + q17);
            ri.i0 i0Var = ri.k0.f395920a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("time", q18);
            i0Var.a(new ri.j0(302, null, 0, 0, 0L, q17, 0L, 0, null, 0, null, 0, null, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, 0L, null, null, ri.l0.b(jSONObject), 0, 0, null, null, 0, 0, -67108898, 1, null));
            o4Var.A(str, -1);
        }
    }
}
