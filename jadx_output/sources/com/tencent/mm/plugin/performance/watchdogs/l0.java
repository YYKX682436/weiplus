package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public abstract class l0 extends com.tencent.mm.plugin.performance.watchdogs.o0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f153078b;

    public final void h(ob0.s3 info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (!j(info) || this.f153078b) {
            return;
        }
        if (this.f153108a >= 20) {
            return;
        }
        this.f153078b = true;
        l(info);
        lr0.c.b(vp3.e.f438983d, true, 300, null, 4, null);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.performance.watchdogs.k0 k0Var = new com.tencent.mm.plugin.performance.watchdogs.k0(this);
        long millis = this.f153108a < 10 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(10L) : java.util.concurrent.TimeUnit.SECONDS.toMillis(30L);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(k0Var, millis, null);
    }

    public abstract boolean i(com.tencent.matrix.util.MemInfo memInfo);

    public abstract boolean j(ob0.s3 s3Var);

    public abstract void k(com.tencent.matrix.util.MemInfo memInfo);

    public abstract void l(ob0.s3 s3Var);
}
