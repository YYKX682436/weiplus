package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310525d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.t.class, java.lang.Object.class, "_next");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310526e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.t.class, java.lang.Object.class, "_prev");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310527f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.t.class, java.lang.Object.class, "_removedRef");
    volatile /* synthetic */ java.lang.Object _next = this;
    volatile /* synthetic */ java.lang.Object _prev = this;
    private volatile /* synthetic */ java.lang.Object _removedRef = null;

    public void dispose() {
        q();
    }

    public final boolean i(kotlinx.coroutines.internal.t tVar, kotlinx.coroutines.internal.t tVar2) {
        boolean z17;
        f310526e.lazySet(tVar, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310525d;
        atomicReferenceFieldUpdater.lazySet(tVar, tVar2);
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar2, tVar)) {
                z17 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar2) {
                z17 = false;
                break;
            }
        }
        if (!z17) {
            return false;
        }
        tVar.k(tVar2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r7 = kotlinx.coroutines.internal.t.f310525d;
        r4 = ((kotlinx.coroutines.internal.f0) r4).f310493a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r7.compareAndSet(r3, r2, r4) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r7.get(r3) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.t j(kotlinx.coroutines.internal.e0 r11) {
        /*
            r10 = this;
        L0:
            java.lang.Object r0 = r10._prev
            kotlinx.coroutines.internal.t r0 = (kotlinx.coroutines.internal.t) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L24
            if (r0 != r2) goto L10
            return r2
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.t.f310526e
        L12:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L1a
            r5 = r6
            goto L20
        L1a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r2
        L24:
            boolean r7 = r10.p()
            if (r7 == 0) goto L2b
            return r1
        L2b:
            if (r4 != r11) goto L2e
            return r2
        L2e:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.e0
            if (r7 == 0) goto L44
            if (r11 == 0) goto L3e
            r0 = r4
            kotlinx.coroutines.internal.e0 r0 = (kotlinx.coroutines.internal.e0) r0
            boolean r0 = r11.b(r0)
            if (r0 == 0) goto L3e
            return r1
        L3e:
            kotlinx.coroutines.internal.e0 r4 = (kotlinx.coroutines.internal.e0) r4
            r4.c(r2)
            goto L0
        L44:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.f0
            if (r7 == 0) goto L68
            if (r3 == 0) goto L63
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.t.f310525d
            kotlinx.coroutines.internal.f0 r4 = (kotlinx.coroutines.internal.f0) r4
            kotlinx.coroutines.internal.t r4 = r4.f310493a
        L50:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L58
            r5 = r6
            goto L5e
        L58:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L50
        L5e:
            if (r5 != 0) goto L61
            goto L0
        L61:
            r2 = r3
            goto L6
        L63:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.t r2 = (kotlinx.coroutines.internal.t) r2
            goto L7
        L68:
            r3 = r4
            kotlinx.coroutines.internal.t r3 = (kotlinx.coroutines.internal.t) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.t.j(kotlinx.coroutines.internal.e0):kotlinx.coroutines.internal.t");
    }

    public final void k(kotlinx.coroutines.internal.t tVar) {
        boolean z17;
        do {
            kotlinx.coroutines.internal.t tVar2 = (kotlinx.coroutines.internal.t) tVar._prev;
            if (l() != tVar) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310526e;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(tVar, tVar2, this)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(tVar) != tVar2) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        if (p()) {
            tVar.j(null);
        }
    }

    public final java.lang.Object l() {
        while (true) {
            java.lang.Object obj = this._next;
            if (!(obj instanceof kotlinx.coroutines.internal.e0)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.e0) obj).c(this);
        }
    }

    public final kotlinx.coroutines.internal.t m() {
        kotlinx.coroutines.internal.t tVar;
        java.lang.Object l17 = l();
        kotlinx.coroutines.internal.f0 f0Var = l17 instanceof kotlinx.coroutines.internal.f0 ? (kotlinx.coroutines.internal.f0) l17 : null;
        return (f0Var == null || (tVar = f0Var.f310493a) == null) ? (kotlinx.coroutines.internal.t) l17 : tVar;
    }

    public final kotlinx.coroutines.internal.t n() {
        kotlinx.coroutines.internal.t j17 = j(null);
        if (j17 == null) {
            java.lang.Object obj = this._prev;
            while (true) {
                j17 = (kotlinx.coroutines.internal.t) obj;
                if (!j17.p()) {
                    break;
                }
                obj = j17._prev;
            }
        }
        return j17;
    }

    public final void o() {
        kotlinx.coroutines.internal.t tVar = this;
        while (true) {
            java.lang.Object l17 = tVar.l();
            if (!(l17 instanceof kotlinx.coroutines.internal.f0)) {
                tVar.j(null);
                return;
            }
            tVar = ((kotlinx.coroutines.internal.f0) l17).f310493a;
        }
    }

    public boolean p() {
        return l() instanceof kotlinx.coroutines.internal.f0;
    }

    public boolean q() {
        return r() == null;
    }

    public final kotlinx.coroutines.internal.t r() {
        kotlinx.coroutines.internal.t tVar;
        boolean z17;
        do {
            java.lang.Object l17 = l();
            if (l17 instanceof kotlinx.coroutines.internal.f0) {
                return ((kotlinx.coroutines.internal.f0) l17).f310493a;
            }
            if (l17 == this) {
                return (kotlinx.coroutines.internal.t) l17;
            }
            tVar = (kotlinx.coroutines.internal.t) l17;
            kotlinx.coroutines.internal.f0 s17 = tVar.s();
            while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310525d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l17, s17)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != l17) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        tVar.j(null);
        return null;
    }

    public final kotlinx.coroutines.internal.f0 s() {
        kotlinx.coroutines.internal.f0 f0Var = (kotlinx.coroutines.internal.f0) this._removedRef;
        if (f0Var != null) {
            return f0Var;
        }
        kotlinx.coroutines.internal.f0 f0Var2 = new kotlinx.coroutines.internal.f0(this);
        f310527f.lazySet(this, f0Var2);
        return f0Var2;
    }

    public final int t(kotlinx.coroutines.internal.t tVar, kotlinx.coroutines.internal.t tVar2, kotlinx.coroutines.internal.p pVar) {
        boolean z17;
        f310526e.lazySet(tVar, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310525d;
        atomicReferenceFieldUpdater.lazySet(tVar, tVar2);
        pVar.f310514c = tVar2;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar2, pVar)) {
                z17 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar2) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            return pVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public java.lang.String toString() {
        return new kotlin.jvm.internal.y(this) { // from class: kotlinx.coroutines.internal.s
            @Override // kotlin.jvm.internal.y, f06.s
            public java.lang.Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + kotlinx.coroutines.c1.a(this);
    }
}
