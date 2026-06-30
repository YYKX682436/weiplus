package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public final class o implements kotlinx.coroutines.sync.m {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310663c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.o.class, java.lang.Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f310664d = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.sync.o.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310665e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.o.class, java.lang.Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f310666f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.sync.o.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310667g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.sync.o.class, "_availablePermits");
    volatile /* synthetic */ int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f310668a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f310669b;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ java.lang.Object head;
    private volatile /* synthetic */ java.lang.Object tail;

    public o(int i17, int i18) {
        this.f310668a = i17;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i17).toString());
        }
        if (!(i18 >= 0 && i18 <= i17)) {
            throw new java.lang.IllegalArgumentException(("The number of acquired permits should be in 0.." + i17).toString());
        }
        kotlinx.coroutines.sync.q qVar = new kotlinx.coroutines.sync.q(0L, null, 2);
        this.head = qVar;
        this.tail = qVar;
        this._availablePermits = i17 - i18;
        this.f310669b = new kotlinx.coroutines.sync.n(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db A[EDGE_INSN: B:66:0x00db->B:59:0x00db BREAK  A[LOOP:0: B:6:0x0015->B:65:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlinx.coroutines.internal.l0] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.internal.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.o.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public int b() {
        return java.lang.Math.max(this._availablePermits, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlinx.coroutines.internal.l0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlinx.coroutines.internal.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.o.c():void");
    }

    public boolean d() {
        int i17;
        do {
            i17 = this._availablePermits;
            if (i17 <= 0) {
                return false;
            }
        } while (!f310667g.compareAndSet(this, i17, i17 - 1));
        return true;
    }
}
