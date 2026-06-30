package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310622b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.p.class, java.lang.Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310623c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.p.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310624d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.p.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310625e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.p.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f310626a = new java.util.concurrent.atomic.AtomicReferenceArray(128);
    private volatile /* synthetic */ java.lang.Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final kotlinx.coroutines.scheduling.j a(kotlinx.coroutines.scheduling.j jVar, boolean z17) {
        if (z17) {
            return b(jVar);
        }
        kotlinx.coroutines.scheduling.j jVar2 = (kotlinx.coroutines.scheduling.j) f310622b.getAndSet(this, jVar);
        if (jVar2 == null) {
            return null;
        }
        return b(jVar2);
    }

    public final kotlinx.coroutines.scheduling.j b(kotlinx.coroutines.scheduling.j jVar) {
        if (((kotlinx.coroutines.scheduling.l) jVar.taskContext).f310612a == 1) {
            f310625e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return jVar;
        }
        int i17 = this.producerIndex & 127;
        while (this.f310626a.get(i17) != null) {
            java.lang.Thread.yield();
        }
        this.f310626a.lazySet(i17, jVar);
        f310623c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final kotlinx.coroutines.scheduling.j d() {
        kotlinx.coroutines.scheduling.j jVar;
        while (true) {
            int i17 = this.consumerIndex;
            if (i17 - this.producerIndex == 0) {
                return null;
            }
            int i18 = i17 & 127;
            if (f310624d.compareAndSet(this, i17, i17 + 1) && (jVar = (kotlinx.coroutines.scheduling.j) this.f310626a.getAndSet(i18, null)) != null) {
                if (((kotlinx.coroutines.scheduling.l) jVar.taskContext).f310612a == 1) {
                    f310625e.decrementAndGet(this);
                }
                return jVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        return f(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(kotlinx.coroutines.scheduling.p r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.f310626a
        L6:
            r3 = 1
            if (r0 == r1) goto L44
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 == 0) goto L44
            java.lang.Object r5 = r2.get(r4)
            kotlinx.coroutines.scheduling.j r5 = (kotlinx.coroutines.scheduling.j) r5
            if (r5 == 0) goto L41
            kotlinx.coroutines.scheduling.k r6 = r5.taskContext
            kotlinx.coroutines.scheduling.l r6 = (kotlinx.coroutines.scheduling.l) r6
            int r6 = r6.f310612a
            r7 = 0
            if (r6 != r3) goto L22
            r6 = r3
            goto L23
        L22:
            r6 = r7
        L23:
            if (r6 == 0) goto L41
        L25:
            r6 = 0
            boolean r6 = r2.compareAndSet(r4, r5, r6)
            if (r6 == 0) goto L2d
            goto L34
        L2d:
            java.lang.Object r6 = r2.get(r4)
            if (r6 == r5) goto L25
            r3 = r7
        L34:
            if (r3 == 0) goto L41
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.p.f310625e
            r0.decrementAndGet(r9)
            r8.a(r5, r7)
            r0 = -1
            return r0
        L41:
            int r0 = r0 + 1
            goto L6
        L44:
            long r0 = r8.f(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.p.e(kotlinx.coroutines.scheduling.p):long");
    }

    public final long f(kotlinx.coroutines.scheduling.p pVar, boolean z17) {
        kotlinx.coroutines.scheduling.j jVar;
        boolean z18;
        do {
            jVar = (kotlinx.coroutines.scheduling.j) pVar.lastScheduledTask;
            if (jVar != null) {
                z18 = true;
                if (z17) {
                    if (!(((kotlinx.coroutines.scheduling.l) jVar.taskContext).f310612a == 1)) {
                        return -2L;
                    }
                }
                ((kotlinx.coroutines.scheduling.g) kotlinx.coroutines.scheduling.n.f310618e).getClass();
                long nanoTime = java.lang.System.nanoTime() - jVar.submissionTime;
                long j17 = kotlinx.coroutines.scheduling.n.f310614a;
                if (nanoTime >= j17) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310622b;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(pVar, jVar, null)) {
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(pVar) != jVar) {
                            z18 = false;
                            break;
                        }
                    }
                } else {
                    return j17 - nanoTime;
                }
            } else {
                return -2L;
            }
        } while (!z18);
        a(jVar, false);
        return -1L;
    }
}
