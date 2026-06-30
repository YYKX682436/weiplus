package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.l0 f153077d;

    public k0(com.tencent.mm.plugin.performance.watchdogs.l0 l0Var) {
        this.f153077d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.matrix.util.MemInfo memInfo = new com.tencent.matrix.util.MemInfo(null, null, null, null, null, null, com.tencent.matrix.util.PssInfo.f53113s.b(), null, 191, null);
        memInfo.f53096d = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mars.xlog.Log.e("MicroMsg.NativeOOMMonitor", "OOM mem info " + memInfo);
        if (this.f153077d.i(memInfo)) {
            com.tencent.mm.plugin.performance.watchdogs.l0 l0Var = this.f153077d;
            if (!(l0Var.f153108a >= 20)) {
                l0Var.k(memInfo);
                lr0.c.b(vp3.e.f438983d, true, 300, null, 4, null);
                ku5.u0 u0Var = ku5.t0.f312615d;
                long millis = this.f153077d.f153108a < 10 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(10L) : java.util.concurrent.TimeUnit.SECONDS.toMillis(30L);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(this, millis, null);
                return;
            }
        }
        if (!this.f153077d.i(memInfo)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeOOMMonitor", "memory reduced to a reasonable level, reset");
            com.tencent.mm.plugin.performance.watchdogs.l0 l0Var2 = this.f153077d;
            l0Var2.f153078b = false;
            l0Var2.f();
            return;
        }
        this.f153077d.e();
        ku5.u0 u0Var2 = ku5.t0.f312615d;
        com.tencent.mm.plugin.performance.watchdogs.j0 j0Var = new com.tencent.mm.plugin.performance.watchdogs.j0(this.f153077d);
        long millis2 = java.util.concurrent.TimeUnit.MINUTES.toMillis(30L);
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.w(j0Var, millis2, null);
    }
}
