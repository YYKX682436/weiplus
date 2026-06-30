package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public final class a extends java.lang.Thread {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310582n = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.a.class, "workerCtl");

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.p f310583d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.scheduling.b f310584e;

    /* renamed from: f, reason: collision with root package name */
    public long f310585f;

    /* renamed from: g, reason: collision with root package name */
    public long f310586g;

    /* renamed from: h, reason: collision with root package name */
    public int f310587h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f310588i;
    private volatile int indexInArray;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.scheduling.c f310589m;
    private volatile java.lang.Object nextParkedWorker;
    volatile /* synthetic */ int workerCtl;

    public a(kotlinx.coroutines.scheduling.c cVar, int i17) {
        this.f310589m = cVar;
        setDaemon(true);
        this.f310583d = new kotlinx.coroutines.scheduling.p();
        this.f310584e = kotlinx.coroutines.scheduling.b.DORMANT;
        this.workerCtl = 0;
        this.nextParkedWorker = kotlinx.coroutines.scheduling.c.f310599q;
        this.f310587h = c06.e.f37716d.c();
        g(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.scheduling.j b(boolean r11) {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.b r0 = r10.f310584e
            kotlinx.coroutines.scheduling.b r1 = kotlinx.coroutines.scheduling.b.CPU_ACQUIRED
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L9
            goto L30
        L9:
            kotlinx.coroutines.scheduling.c r0 = r10.f310589m
        Lb:
            long r6 = r0.controlState
            r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r4 = r4 & r6
            r8 = 42
            long r4 = r4 >> r8
            int r4 = (int) r4
            if (r4 != 0) goto L1b
            r0 = r2
            goto L2c
        L1b:
            r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r8 = r6 - r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.c.f310597o
            r5 = r0
            boolean r4 = r4.compareAndSet(r5, r6, r8)
            if (r4 == 0) goto Lb
            r0 = r3
        L2c:
            if (r0 == 0) goto L32
            r10.f310584e = r1
        L30:
            r0 = r3
            goto L33
        L32:
            r0 = r2
        L33:
            r1 = 0
            if (r0 == 0) goto L7c
            if (r11 == 0) goto L70
            kotlinx.coroutines.scheduling.c r11 = r10.f310589m
            int r11 = r11.f310600d
            int r11 = r11 * 2
            int r11 = r10.e(r11)
            if (r11 != 0) goto L45
            goto L46
        L45:
            r3 = r2
        L46:
            if (r3 == 0) goto L4f
            kotlinx.coroutines.scheduling.j r11 = r10.f()
            if (r11 == 0) goto L4f
            goto L7b
        L4f:
            kotlinx.coroutines.scheduling.p r11 = r10.f310583d
            r11.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.p.f310622b
            java.lang.Object r0 = r0.getAndSet(r11, r1)
            kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
            if (r0 != 0) goto L63
            kotlinx.coroutines.scheduling.j r11 = r11.d()
            goto L64
        L63:
            r11 = r0
        L64:
            if (r11 == 0) goto L67
            goto L7b
        L67:
            if (r3 != 0) goto L77
            kotlinx.coroutines.scheduling.j r11 = r10.f()
            if (r11 == 0) goto L77
            goto L7b
        L70:
            kotlinx.coroutines.scheduling.j r11 = r10.f()
            if (r11 == 0) goto L77
            goto L7b
        L77:
            kotlinx.coroutines.scheduling.j r11 = r10.j(r2)
        L7b:
            return r11
        L7c:
            if (r11 == 0) goto L9f
            kotlinx.coroutines.scheduling.p r11 = r10.f310583d
            r11.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.p.f310622b
            java.lang.Object r0 = r0.getAndSet(r11, r1)
            kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
            if (r0 != 0) goto L91
            kotlinx.coroutines.scheduling.j r0 = r11.d()
        L91:
            if (r0 != 0) goto Laa
            kotlinx.coroutines.scheduling.c r11 = r10.f310589m
            kotlinx.coroutines.scheduling.f r11 = r11.f310605i
            java.lang.Object r11 = r11.d()
            r0 = r11
            kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
            goto Laa
        L9f:
            kotlinx.coroutines.scheduling.c r11 = r10.f310589m
            kotlinx.coroutines.scheduling.f r11 = r11.f310605i
            java.lang.Object r11 = r11.d()
            r0 = r11
            kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
        Laa:
            if (r0 != 0) goto Lb0
            kotlinx.coroutines.scheduling.j r0 = r10.j(r3)
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.b(boolean):kotlinx.coroutines.scheduling.j");
    }

    public final int c() {
        return this.indexInArray;
    }

    public final java.lang.Object d() {
        return this.nextParkedWorker;
    }

    public final int e(int i17) {
        int i18 = this.f310587h;
        int i19 = i18 ^ (i18 << 13);
        int i27 = i19 ^ (i19 >> 17);
        int i28 = i27 ^ (i27 << 5);
        this.f310587h = i28;
        int i29 = i17 - 1;
        return (i29 & i17) == 0 ? i28 & i29 : (i28 & Integer.MAX_VALUE) % i17;
    }

    public final kotlinx.coroutines.scheduling.j f() {
        int e17 = e(2);
        kotlinx.coroutines.scheduling.c cVar = this.f310589m;
        if (e17 == 0) {
            kotlinx.coroutines.scheduling.j jVar = (kotlinx.coroutines.scheduling.j) cVar.f310604h.d();
            return jVar != null ? jVar : (kotlinx.coroutines.scheduling.j) cVar.f310605i.d();
        }
        kotlinx.coroutines.scheduling.j jVar2 = (kotlinx.coroutines.scheduling.j) cVar.f310605i.d();
        return jVar2 != null ? jVar2 : (kotlinx.coroutines.scheduling.j) cVar.f310604h.d();
    }

    public final void g(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f310589m.f310603g);
        sb6.append("-worker-");
        sb6.append(i17 == 0 ? "TERMINATED" : java.lang.String.valueOf(i17));
        setName(sb6.toString());
        this.indexInArray = i17;
    }

    public final void h(java.lang.Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(kotlinx.coroutines.scheduling.b bVar) {
        kotlinx.coroutines.scheduling.b bVar2 = this.f310584e;
        boolean z17 = bVar2 == kotlinx.coroutines.scheduling.b.CPU_ACQUIRED;
        if (z17) {
            kotlinx.coroutines.scheduling.c.f310597o.addAndGet(this.f310589m, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f310584e = bVar;
        }
        return z17;
    }

    public final kotlinx.coroutines.scheduling.j j(boolean z17) {
        long f17;
        int i17 = (int) (this.f310589m.controlState & 2097151);
        if (i17 < 2) {
            return null;
        }
        int e17 = e(i17);
        kotlinx.coroutines.scheduling.c cVar = this.f310589m;
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        for (int i18 = 0; i18 < i17; i18++) {
            e17++;
            if (e17 > i17) {
                e17 = 1;
            }
            kotlinx.coroutines.scheduling.a aVar = (kotlinx.coroutines.scheduling.a) cVar.f310606m.b(e17);
            if (aVar != null && aVar != this) {
                if (z17) {
                    f17 = this.f310583d.e(aVar.f310583d);
                } else {
                    kotlinx.coroutines.scheduling.p pVar = this.f310583d;
                    kotlinx.coroutines.scheduling.p pVar2 = aVar.f310583d;
                    pVar.getClass();
                    kotlinx.coroutines.scheduling.j d17 = pVar2.d();
                    if (d17 != null) {
                        pVar.a(d17, false);
                        f17 = -1;
                    } else {
                        f17 = pVar.f(pVar2, false);
                    }
                }
                if (f17 == -1) {
                    kotlinx.coroutines.scheduling.p pVar3 = this.f310583d;
                    pVar3.getClass();
                    kotlinx.coroutines.scheduling.j jVar = (kotlinx.coroutines.scheduling.j) kotlinx.coroutines.scheduling.p.f310622b.getAndSet(pVar3, null);
                    return jVar == null ? pVar3.d() : jVar;
                }
                if (f17 > 0) {
                    j17 = java.lang.Math.min(j17, f17);
                }
            }
        }
        if (j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            j17 = 0;
        }
        this.f310586g = j17;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0002, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.run():void");
    }
}
