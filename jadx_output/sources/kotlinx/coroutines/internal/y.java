package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310535e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f310536f;

    /* renamed from: g, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310537g;
    private volatile /* synthetic */ java.lang.Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f310538a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f310539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f310540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f310541d;

    static {
        new kotlinx.coroutines.internal.w(null);
        f310537g = new kotlinx.coroutines.internal.l0("REMOVE_FROZEN");
        f310535e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.y.class, java.lang.Object.class, "_next");
        f310536f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.internal.y.class, "_state");
    }

    public y(int i17, boolean z17) {
        this.f310538a = i17;
        this.f310539b = z17;
        int i18 = i17 - 1;
        this.f310540c = i18;
        this.f310541d = new java.util.concurrent.atomic.AtomicReferenceArray(i17);
        if (!(i18 <= 1073741823)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((i17 & i18) == 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r15) {
        /*
            r14 = this;
        L0:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L15
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L14
            r1 = 2
        L14:
            return r1
        L15:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.f310540c
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L30
            return r1
        L30:
            boolean r4 = r14.f310539b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.f310541d
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r2 = r14.f310538a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L0
        L4e:
            return r1
        L4f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.y.f310536f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f310541d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L94
            kotlinx.coroutines.internal.y r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f310541d
            int r2 = r0.f310540c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof kotlinx.coroutines.internal.x
            if (r4 == 0) goto L91
            kotlinx.coroutines.internal.x r3 = (kotlinx.coroutines.internal.x) r3
            int r3 = r3.f310534a
            if (r3 != r10) goto L91
            r1.set(r2, r15)
            goto L92
        L91:
            r0 = 0
        L92:
            if (r0 != 0) goto L6d
        L94:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.y.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j17;
        do {
            j17 = this._state;
            if ((j17 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j17) != 0) {
                return false;
            }
        } while (!f310536f.compareAndSet(this, j17, j17 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j17 = this._state;
        return (((int) ((j17 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j17) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j17 = this._state;
        return ((int) ((1073741823 & j17) >> 0)) == ((int) ((j17 & 1152921503533105152L) >> 30));
    }

    public final kotlinx.coroutines.internal.y e() {
        long j17;
        while (true) {
            j17 = this._state;
            if ((j17 & 1152921504606846976L) != 0) {
                break;
            }
            long j18 = j17 | 1152921504606846976L;
            if (f310536f.compareAndSet(this, j17, j18)) {
                j17 = j18;
                break;
            }
        }
        while (true) {
            kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) this._next;
            if (yVar != null) {
                return yVar;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310535e;
            kotlinx.coroutines.internal.y yVar2 = new kotlinx.coroutines.internal.y(this.f310538a * 2, this.f310539b);
            int i17 = (int) ((1073741823 & j17) >> 0);
            int i18 = (int) ((1152921503533105152L & j17) >> 30);
            while (true) {
                int i19 = this.f310540c;
                int i27 = i17 & i19;
                if (i27 == (i19 & i18)) {
                    break;
                }
                java.lang.Object obj = this.f310541d.get(i27);
                if (obj == null) {
                    obj = new kotlinx.coroutines.internal.x(i17);
                }
                yVar2.f310541d.set(yVar2.f310540c & i17, obj);
                i17++;
            }
            yVar2._state = (-1152921504606846977L) & j17;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, yVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final java.lang.Object f() {
        while (true) {
            long j17 = this._state;
            if ((j17 & 1152921504606846976L) != 0) {
                return f310537g;
            }
            int i17 = (int) ((j17 & 1073741823) >> 0);
            int i18 = this.f310540c;
            int i19 = ((int) ((1152921503533105152L & j17) >> 30)) & i18;
            int i27 = i18 & i17;
            if (i19 == i27) {
                return null;
            }
            java.lang.Object obj = this.f310541d.get(i27);
            if (obj == null) {
                if (this.f310539b) {
                    return null;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.x) {
                    return null;
                }
                long j18 = ((i17 + 1) & 1073741823) << 0;
                if (f310536f.compareAndSet(this, j17, (j17 & (-1073741824)) | j18)) {
                    this.f310541d.set(this.f310540c & i17, null);
                    return obj;
                }
                if (this.f310539b) {
                    kotlinx.coroutines.internal.y yVar = this;
                    while (true) {
                        long j19 = yVar._state;
                        int i28 = (int) ((j19 & 1073741823) >> 0);
                        if ((j19 & 1152921504606846976L) != 0) {
                            yVar = yVar.e();
                        } else {
                            if (f310536f.compareAndSet(yVar, j19, (j19 & (-1073741824)) | j18)) {
                                yVar.f310541d.set(yVar.f310540c & i28, null);
                                yVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (yVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
