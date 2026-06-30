package gh;

/* loaded from: classes7.dex */
public final class n0 extends gh.c implements java.lang.Runnable {

    /* renamed from: i, reason: collision with root package name */
    public final long f271841i;

    /* renamed from: m, reason: collision with root package name */
    public final gh.m0 f271842m;

    /* renamed from: n, reason: collision with root package name */
    public long f271843n;

    /* renamed from: o, reason: collision with root package name */
    public final gh.b f271844o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.magicbrush.MBRuntime runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(jsThreadHandler, "jsThreadHandler");
        this.f271841i = 1000000000 / 60;
        this.f271842m = new gh.m0();
        this.f271844o = gh.b.SchedulerLocker;
    }

    @Override // gh.c
    public gh.b b() {
        return this.f271844o;
    }

    @Override // gh.c
    public void d() {
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        this.f271843n = 0L;
    }

    @Override // gh.c
    public void g() {
        this.f271843n = 0L;
        this.f271802e.k(this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0 < r4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (java.lang.System.nanoTime() < r8.f271843n) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r8.f271802e.k(r8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            boolean r0 = r8.f271804g
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = r8.f271843n
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L13
            long r0 = java.lang.System.nanoTime()
            r8.f271843n = r0
        L13:
            long r0 = java.lang.System.nanoTime()
            long r2 = r8.f271843n
            long r2 = r0 - r2
            long r4 = r8.f271841i
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L27
            long r6 = r2 / r4
            long r2 = r2 % r4
            long r0 = r0 - r2
            r8.f271843n = r0
        L27:
            gh.m0 r0 = r8.f271842m
            r0.getClass()
            long r0 = r8.f271843n
            double r0 = (double) r0
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r2
            r8.c(r0)
            long r0 = java.lang.System.nanoTime()
            long r2 = r8.f271843n
            long r0 = r0 - r2
            long r2 = r2 + r4
            r8.f271843n = r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L50
        L46:
            long r0 = java.lang.System.nanoTime()
            long r2 = r8.f271843n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L46
        L50:
            r0 = 0
            ch.g r1 = r8.f271802e
            r1.k(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.n0.run():void");
    }
}
