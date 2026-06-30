package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public final class k extends kotlinx.coroutines.p0 implements java.lang.Runnable, kotlinx.coroutines.i1 {

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f310502e;

    /* renamed from: f, reason: collision with root package name */
    public final int f310503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.i1 f310504g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.internal.v f310505h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f310506i;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public k(kotlinx.coroutines.p0 p0Var, int i17) {
        this.f310502e = p0Var;
        this.f310503f = i17;
        kotlinx.coroutines.i1 i1Var = p0Var instanceof kotlinx.coroutines.i1 ? (kotlinx.coroutines.i1) p0Var : null;
        this.f310504g = i1Var == null ? kotlinx.coroutines.e1.f310173a : i1Var;
        this.f310505h = new kotlinx.coroutines.internal.v(false);
        this.f310506i = new java.lang.Object();
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        this.f310505h.a(runnable);
        boolean z17 = true;
        if (this.runningWorkers >= this.f310503f) {
            return;
        }
        synchronized (this.f310506i) {
            if (this.runningWorkers >= this.f310503f) {
                z17 = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (z17) {
            this.f310502e.D(this, this);
        }
    }

    @Override // kotlinx.coroutines.p0
    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        this.f310505h.a(runnable);
        boolean z17 = true;
        if (this.runningWorkers >= this.f310503f) {
            return;
        }
        synchronized (this.f310506i) {
            if (this.runningWorkers >= this.f310503f) {
                z17 = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (z17) {
            this.f310502e.F(this, this);
        }
    }

    @Override // kotlinx.coroutines.p0
    public kotlinx.coroutines.p0 J(int i17) {
        kotlinx.coroutines.internal.l.a(i17);
        return i17 >= this.f310503f ? this : super.J(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        r1 = r4.f310506i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r4.f310505h.c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r4.runningWorkers++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.v r2 = r4.f310505h
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            oz5.m r3 = oz5.m.f350329d
            kotlinx.coroutines.u0.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.p0 r2 = r4.f310502e
            boolean r2 = r2.I(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.p0 r0 = r4.f310502e
            r0.D(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f310506i
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L45
            kotlinx.coroutines.internal.v r2 = r4.f310505h     // Catch: java.lang.Throwable -> L45
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)
            goto L1
        L45:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.k.run():void");
    }

    @Override // kotlinx.coroutines.i1
    public kotlinx.coroutines.s1 v(long j17, java.lang.Runnable runnable, oz5.l lVar) {
        return this.f310504g.v(j17, runnable, lVar);
    }

    @Override // kotlinx.coroutines.i1
    public void w(long j17, kotlinx.coroutines.q qVar) {
        this.f310504g.w(j17, qVar);
    }
}
