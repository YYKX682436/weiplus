package kotlinx.coroutines;

/* loaded from: classes14.dex */
public class r extends kotlinx.coroutines.n1 implements kotlinx.coroutines.q, qz5.e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310574g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.r.class, "_decision");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310575h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.r.class, java.lang.Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ java.lang.Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f310576d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f310577e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.s1 f310578f;

    public r(kotlin.coroutines.Continuation continuation, int i17) {
        super(i17);
        this.f310576d = continuation;
        this.f310577e = continuation.getContext();
        this._decision = 0;
        this._state = kotlinx.coroutines.b.f310137d;
    }

    public final void a(kotlinx.coroutines.n nVar, java.lang.Throwable th6) {
        try {
            nVar.a(th6);
        } catch (java.lang.Throwable th7) {
            kotlinx.coroutines.u0.a(this.f310577e, new kotlinx.coroutines.h0("Exception in invokeOnCancellation handler for " + this, th7));
        }
    }

    public final void b(yz5.l lVar, java.lang.Throwable th6) {
        try {
            lVar.invoke(th6);
        } catch (java.lang.Throwable th7) {
            kotlinx.coroutines.u0.a(this.f310577e, new kotlinx.coroutines.h0("Exception in invokeOnCancellation handler for " + this, th7));
        }
    }

    public final void c(yz5.l lVar, java.lang.Throwable th6) {
        try {
            lVar.invoke(th6);
        } catch (java.lang.Throwable th7) {
            kotlinx.coroutines.u0.a(this.f310577e, new kotlinx.coroutines.h0("Exception in resume onCancellation handler for " + this, th7));
        }
    }

    @Override // kotlinx.coroutines.n1
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object obj, java.lang.Throwable th6) {
        while (true) {
            java.lang.Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.k3) {
                throw new java.lang.IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof kotlinx.coroutines.e0) {
                return;
            }
            boolean z17 = true;
            if (obj2 instanceof kotlinx.coroutines.d0) {
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) obj2;
                if (!(!(d0Var.f310156e != null))) {
                    throw new java.lang.IllegalStateException("Must be called at most once".toString());
                }
                kotlinx.coroutines.d0 a17 = kotlinx.coroutines.d0.a(d0Var, null, null, null, null, th6, 15, null);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310575h;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a17)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    kotlinx.coroutines.n nVar = d0Var.f310153b;
                    if (nVar != null) {
                        a(nVar, th6);
                    }
                    yz5.l lVar = d0Var.f310154c;
                    if (lVar != null) {
                        c(lVar, th6);
                        return;
                    }
                    return;
                }
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310575h;
                kotlinx.coroutines.d0 d0Var2 = new kotlinx.coroutines.d0(obj2, null, null, null, th6, 14, null);
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, d0Var2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            }
        }
    }

    public boolean d(java.lang.Throwable th6) {
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        do {
            obj = this._state;
            z17 = false;
            if (!(obj instanceof kotlinx.coroutines.k3)) {
                return false;
            }
            z18 = obj instanceof kotlinx.coroutines.n;
            kotlinx.coroutines.u uVar = new kotlinx.coroutines.u(this, th6, z18);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310575h;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z17);
        kotlinx.coroutines.n nVar = z18 ? (kotlinx.coroutines.n) obj : null;
        if (nVar != null) {
            a(nVar, th6);
        }
        g();
        h(this.resumeMode);
        return true;
    }

    public void e(java.lang.Object obj) {
        h(this.resumeMode);
    }

    public final void f() {
        kotlinx.coroutines.s1 s1Var = this.f310578f;
        if (s1Var == null) {
            return;
        }
        s1Var.dispose();
        this.f310578f = kotlinx.coroutines.j3.f310548d;
    }

    public final void g() {
        if (isReusable()) {
            return;
        }
        f();
    }

    @Override // qz5.e
    public qz5.e getCallerFrame() {
        kotlin.coroutines.Continuation continuation = this.f310576d;
        if (continuation instanceof qz5.e) {
            return (qz5.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return this.f310577e;
    }

    @Override // kotlinx.coroutines.n1
    public final kotlin.coroutines.Continuation getDelegate$kotlinx_coroutines_core() {
        return this.f310576d;
    }

    @Override // kotlinx.coroutines.n1
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object obj) {
        java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    @Override // kotlinx.coroutines.n1
    public java.lang.Object getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object obj) {
        return obj instanceof kotlinx.coroutines.d0 ? ((kotlinx.coroutines.d0) obj).f310152a : obj;
    }

    /* JADX WARN: Finally extract failed */
    public final void h(int i17) {
        boolean z17;
        while (true) {
            int i18 = this._decision;
            if (i18 != 0) {
                if (i18 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed".toString());
                }
                z17 = false;
            } else if (f310574g.compareAndSet(this, 0, 2)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        kotlin.coroutines.Continuation continuation = this.f310576d;
        boolean z18 = i17 == 4;
        if (!z18 && (continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation)) {
            boolean z19 = i17 == 1 || i17 == 2;
            int i19 = this.resumeMode;
            if (z19 == (i19 == 1 || i19 == 2)) {
                kotlinx.coroutines.p0 p0Var = ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).dispatcher;
                oz5.l context = continuation.getContext();
                if (p0Var.I(context)) {
                    p0Var.D(context, this);
                    return;
                }
                kotlinx.coroutines.w1 a17 = kotlinx.coroutines.v3.f310684a.a();
                if (a17.O()) {
                    a17.M(this);
                    return;
                }
                a17.N(true);
                try {
                    kotlinx.coroutines.o1.a(this, this.f310576d, true);
                    do {
                    } while (a17.Q());
                } catch (java.lang.Throwable th6) {
                    try {
                        handleFatalException(th6, null);
                    } finally {
                        a17.K(true);
                    }
                }
                return;
            }
        }
        kotlinx.coroutines.o1.a(this, continuation, z18);
    }

    public java.lang.Throwable i(kotlinx.coroutines.r2 r2Var) {
        return r2Var.x();
    }

    public final boolean isReusable() {
        return (this.resumeMode == 2) && ((kotlinx.coroutines.internal.DispatchedContinuation) this.f310576d).isReusable();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r6.f310578f != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r0 = r6.f310576d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r5 = (kotlinx.coroutines.internal.DispatchedContinuation) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r0 = r5.tryReleaseClaimedContinuation(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        f();
        d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return pz5.a.f359186d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        r0 = r6.f310576d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r5 = (kotlinx.coroutines.internal.DispatchedContinuation) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r0 = r5.tryReleaseClaimedContinuation(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        f();
        d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r0 = r6._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.e0) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1 = r6.resumeMode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r1 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r1 != 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r3 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        r1 = (kotlinx.coroutines.r2) r6.f310577e.get(kotlinx.coroutines.q2.f310571d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        if (r1.a() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r1 = r1.x();
        cancelCompletedResult$kotlinx_coroutines_core(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        return getSuccessfulResult$kotlinx_coroutines_core(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        throw ((kotlinx.coroutines.e0) r0).f310172a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j() {
        /*
            r6 = this;
            boolean r0 = r6.isReusable()
        L4:
            int r1 = r6._decision
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            if (r1 != r2) goto Lf
            r1 = r4
            goto L24
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.r.f310574g
            boolean r1 = r1.compareAndSet(r6, r4, r3)
            if (r1 == 0) goto L4
            r1 = r3
        L24:
            r5 = 0
            if (r1 == 0) goto L4b
            kotlinx.coroutines.s1 r1 = r6.f310578f
            if (r1 != 0) goto L2e
            r6.l()
        L2e:
            if (r0 == 0) goto L48
            kotlin.coroutines.Continuation r0 = r6.f310576d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L39
            r5 = r0
            kotlinx.coroutines.internal.DispatchedContinuation r5 = (kotlinx.coroutines.internal.DispatchedContinuation) r5
        L39:
            if (r5 == 0) goto L48
            java.lang.Throwable r0 = r5.tryReleaseClaimedContinuation(r6)
            if (r0 != 0) goto L42
            goto L48
        L42:
            r6.f()
            r6.d(r0)
        L48:
            pz5.a r0 = pz5.a.f359186d
            return r0
        L4b:
            if (r0 == 0) goto L65
            kotlin.coroutines.Continuation r0 = r6.f310576d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L56
            r5 = r0
            kotlinx.coroutines.internal.DispatchedContinuation r5 = (kotlinx.coroutines.internal.DispatchedContinuation) r5
        L56:
            if (r5 == 0) goto L65
            java.lang.Throwable r0 = r5.tryReleaseClaimedContinuation(r6)
            if (r0 != 0) goto L5f
            goto L65
        L5f:
            r6.f()
            r6.d(r0)
        L65:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof kotlinx.coroutines.e0
            if (r1 != 0) goto L95
            int r1 = r6.resumeMode
            if (r1 == r3) goto L73
            if (r1 != r2) goto L72
            goto L73
        L72:
            r3 = r4
        L73:
            if (r3 == 0) goto L90
            oz5.l r1 = r6.f310577e
            kotlinx.coroutines.q2 r2 = kotlinx.coroutines.q2.f310571d
            oz5.i r1 = r1.get(r2)
            kotlinx.coroutines.r2 r1 = (kotlinx.coroutines.r2) r1
            if (r1 == 0) goto L90
            boolean r2 = r1.a()
            if (r2 == 0) goto L88
            goto L90
        L88:
            java.util.concurrent.CancellationException r1 = r1.x()
            r6.cancelCompletedResult$kotlinx_coroutines_core(r0, r1)
            throw r1
        L90:
            java.lang.Object r0 = r6.getSuccessfulResult$kotlinx_coroutines_core(r0)
            return r0
        L95:
            kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.e0) r0
            java.lang.Throwable r0 = r0.f310172a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.r.j():java.lang.Object");
    }

    public void k() {
        kotlinx.coroutines.s1 l17 = l();
        if (l17 != null && o()) {
            l17.dispose();
            this.f310578f = kotlinx.coroutines.j3.f310548d;
        }
    }

    public final kotlinx.coroutines.s1 l() {
        int i17 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f310577e.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var == null) {
            return null;
        }
        kotlinx.coroutines.s1 b17 = kotlinx.coroutines.p2.b(r2Var, true, false, new kotlinx.coroutines.v(this), 2, null);
        this.f310578f = b17;
        return b17;
    }

    public void m(yz5.l lVar) {
        kotlinx.coroutines.n m2Var = lVar instanceof kotlinx.coroutines.n ? (kotlinx.coroutines.n) lVar : new kotlinx.coroutines.m2(lVar);
        while (true) {
            java.lang.Object obj = this._state;
            boolean z17 = true;
            if (obj instanceof kotlinx.coroutines.b) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310575h;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, m2Var)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.n) {
                    p(lVar, obj);
                    throw null;
                }
                boolean z18 = obj instanceof kotlinx.coroutines.e0;
                if (z18) {
                    kotlinx.coroutines.e0 e0Var = (kotlinx.coroutines.e0) obj;
                    e0Var.getClass();
                    if (!kotlinx.coroutines.e0.f310171b.compareAndSet(e0Var, 0, 1)) {
                        p(lVar, obj);
                        throw null;
                    }
                    if (obj instanceof kotlinx.coroutines.u) {
                        if (!z18) {
                            e0Var = null;
                        }
                        b(lVar, e0Var != null ? e0Var.f310172a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof kotlinx.coroutines.d0) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) obj;
                    if (d0Var.f310153b != null) {
                        p(lVar, obj);
                        throw null;
                    }
                    if (m2Var instanceof kotlinx.coroutines.i) {
                        return;
                    }
                    java.lang.Throwable th6 = d0Var.f310156e;
                    if (th6 != null) {
                        b(lVar, th6);
                        return;
                    }
                    kotlinx.coroutines.d0 a17 = kotlinx.coroutines.d0.a(d0Var, null, m2Var, null, null, null, 29, null);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310575h;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a17)) {
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17) {
                        return;
                    }
                } else {
                    if (m2Var instanceof kotlinx.coroutines.i) {
                        return;
                    }
                    kotlinx.coroutines.d0 d0Var2 = new kotlinx.coroutines.d0(obj, m2Var, null, null, null, 28, null);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f310575h;
                    while (true) {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, d0Var2)) {
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17) {
                        return;
                    }
                }
            }
        }
    }

    public boolean n() {
        return this._state instanceof kotlinx.coroutines.k3;
    }

    public boolean o() {
        return !(this._state instanceof kotlinx.coroutines.k3);
    }

    public final void p(yz5.l lVar, java.lang.Object obj) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public java.lang.String q() {
        return "CancellableContinuation";
    }

    public final boolean r() {
        java.lang.Object obj = this._state;
        if ((obj instanceof kotlinx.coroutines.d0) && ((kotlinx.coroutines.d0) obj).f310155d != null) {
            f();
            return false;
        }
        this._decision = 0;
        this._state = kotlinx.coroutines.b.f310137d;
        return true;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
        if (m524exceptionOrNullimpl != null) {
            obj = new kotlinx.coroutines.e0(m524exceptionOrNullimpl, false, 2, null);
        }
        t(obj, this.resumeMode, null);
    }

    public void s(java.lang.Object obj, yz5.l lVar) {
        t(obj, this.resumeMode, lVar);
    }

    public final void t(java.lang.Object obj, int i17, yz5.l lVar) {
        boolean z17;
        do {
            java.lang.Object obj2 = this._state;
            z17 = false;
            if (!(obj2 instanceof kotlinx.coroutines.k3)) {
                if (obj2 instanceof kotlinx.coroutines.u) {
                    kotlinx.coroutines.u uVar = (kotlinx.coroutines.u) obj2;
                    uVar.getClass();
                    if (kotlinx.coroutines.u.f310679c.compareAndSet(uVar, 0, 1)) {
                        if (lVar != null) {
                            c(lVar, uVar.f310172a);
                            return;
                        }
                        return;
                    }
                }
                throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            java.lang.Object v17 = v((kotlinx.coroutines.k3) obj2, obj, i17, lVar, null);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310575h;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, v17)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
        } while (!z17);
        g();
        h(i17);
    }

    @Override // kotlinx.coroutines.n1
    public java.lang.Object takeState$kotlinx_coroutines_core() {
        return this._state;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(q());
        sb6.append('(');
        sb6.append(kotlinx.coroutines.c1.b(this.f310576d));
        sb6.append("){");
        java.lang.Object obj = this._state;
        sb6.append(obj instanceof kotlinx.coroutines.k3 ? "Active" : obj instanceof kotlinx.coroutines.u ? "Cancelled" : "Completed");
        sb6.append("}@");
        sb6.append(kotlinx.coroutines.c1.a(this));
        return sb6.toString();
    }

    public void u(kotlinx.coroutines.p0 p0Var, java.lang.Object obj) {
        kotlin.coroutines.Continuation continuation = this.f310576d;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        t(obj, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == p0Var ? 4 : this.resumeMode, null);
    }

    public final java.lang.Object v(kotlinx.coroutines.k3 k3Var, java.lang.Object obj, int i17, yz5.l lVar, java.lang.Object obj2) {
        if (obj instanceof kotlinx.coroutines.e0) {
            return obj;
        }
        boolean z17 = true;
        if (i17 != 1 && i17 != 2) {
            z17 = false;
        }
        if (!z17 && obj2 == null) {
            return obj;
        }
        if (lVar != null || (((k3Var instanceof kotlinx.coroutines.n) && !(k3Var instanceof kotlinx.coroutines.i)) || obj2 != null)) {
            return new kotlinx.coroutines.d0(obj, k3Var instanceof kotlinx.coroutines.n ? (kotlinx.coroutines.n) k3Var : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final kotlinx.coroutines.internal.l0 w(java.lang.Object obj, java.lang.Object obj2, yz5.l lVar) {
        kotlinx.coroutines.internal.l0 l0Var;
        boolean z17;
        do {
            java.lang.Object obj3 = this._state;
            boolean z18 = obj3 instanceof kotlinx.coroutines.k3;
            l0Var = kotlinx.coroutines.s.f310580a;
            if (!z18) {
                if (!(obj3 instanceof kotlinx.coroutines.d0)) {
                    return null;
                }
                if (obj2 == null || ((kotlinx.coroutines.d0) obj3).f310155d != obj2) {
                    return null;
                }
                return l0Var;
            }
            java.lang.Object v17 = v((kotlinx.coroutines.k3) obj3, obj, this.resumeMode, lVar, obj2);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310575h;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, v17)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        g();
        return l0Var;
    }
}
