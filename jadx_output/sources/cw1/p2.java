package cw1;

/* loaded from: classes12.dex */
public final class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f223213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f223214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f223215f;

    public p2(cw1.o0 o0Var, kotlin.jvm.internal.h0 h0Var, int i17) {
        this.f223213d = o0Var;
        this.f223214e = h0Var;
        this.f223215f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent = new com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent();
        int i17 = this.f223215f;
        am.p0 p0Var = beforeAggressiveCleanCacheEvent.f53999g;
        p0Var.f7589a = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCacheUI", "triggering BeforeAggressiveCleanCacheEvent with groupFlags " + p0Var.f7589a);
        beforeAggressiveCleanCacheEvent.e();
        if (this.f223213d.f223188f[5]) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            cu2.x.f222449a.a();
        }
        java.lang.Runnable runnable = (java.lang.Runnable) this.f223214e.f310123d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
