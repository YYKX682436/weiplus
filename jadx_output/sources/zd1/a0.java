package zd1;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f471521a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f471522b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f471523c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f471524d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f471525e;

    public a0(com.tencent.mm.plugin.appbrand.o6 rt6) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f471521a = rt6;
        this.f471522b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f471523c = kotlinx.coroutines.z0.b();
        this.f471524d = new java.util.concurrent.atomic.AtomicReference(null);
        this.f471525e = new java.util.concurrent.atomic.AtomicReference(null);
        rt6.N.a(new zd1.w(this));
    }

    public final void a(long j17, int i17) {
        b(true);
        this.f471522b.set(true);
        this.f471525e.set(new zd1.x(j17, i17));
        kotlinx.coroutines.l.d(this.f471523c, null, null, new zd1.z(this, j17, i17, null), 3, null);
    }

    public final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SecuritySnapshotContext", "stop(terminate:" + z17 + ") for " + this.f471521a.f74803n);
        try {
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f471524d.get();
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f471524d.set(null);
            this.f471522b.set(false);
            if (z17) {
                this.f471525e.set(null);
            }
        } catch (java.lang.Throwable th6) {
            this.f471524d.set(null);
            throw th6;
        }
    }
}
