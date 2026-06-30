package w6;

/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f443088a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f443089b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f443090c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.ReferenceQueue f443091d;

    /* renamed from: e, reason: collision with root package name */
    public w6.q0 f443092e;

    public e(boolean z17) {
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new w6.b());
        this.f443090c = new java.util.HashMap();
        this.f443091d = new java.lang.ref.ReferenceQueue();
        this.f443088a = z17;
        this.f443089b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new w6.c(this));
    }

    public synchronized void a(t6.h hVar, w6.r0 r0Var) {
        w6.d dVar = (w6.d) ((java.util.HashMap) this.f443090c).put(hVar, new w6.d(hVar, r0Var, this.f443091d, this.f443088a));
        if (dVar != null) {
            dVar.f443078c = null;
            dVar.clear();
        }
    }

    public void b(w6.d dVar) {
        w6.z0 z0Var;
        synchronized (this) {
            ((java.util.HashMap) this.f443090c).remove(dVar.f443076a);
            if (dVar.f443077b && (z0Var = dVar.f443078c) != null) {
                ((w6.g0) this.f443092e).c(dVar.f443076a, new w6.r0(z0Var, true, false, dVar.f443076a, this.f443092e));
            }
        }
    }
}
