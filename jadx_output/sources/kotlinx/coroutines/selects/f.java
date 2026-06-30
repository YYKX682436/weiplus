package kotlinx.coroutines.selects;

/* loaded from: classes14.dex */
public final class f extends kotlinx.coroutines.internal.m implements kotlinx.coroutines.selects.h, kotlin.coroutines.Continuation, qz5.e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310635h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.selects.f.class, java.lang.Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310636i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.selects.f.class, java.lang.Object.class, "_result");

    /* renamed from: g, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f310637g;
    volatile /* synthetic */ java.lang.Object _state = kotlinx.coroutines.selects.i.f310638a;
    private volatile /* synthetic */ java.lang.Object _result = kotlinx.coroutines.selects.i.f310640c;
    private volatile /* synthetic */ java.lang.Object _parentHandle = null;

    public f(kotlin.coroutines.Continuation continuation) {
        this.f310637g = continuation;
    }

    public void A(java.lang.Throwable th6) {
        while (true) {
            java.lang.Object obj = this._result;
            java.lang.Object obj2 = kotlinx.coroutines.selects.i.f310640c;
            boolean z17 = true;
            if (obj == obj2) {
                kotlinx.coroutines.e0 e0Var = new kotlinx.coroutines.e0(th6, false, 2, null);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310636i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, e0Var)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else {
                pz5.a aVar = pz5.a.f359186d;
                if (obj != aVar) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310636i;
                java.lang.Object obj3 = kotlinx.coroutines.selects.i.f310641d;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar, obj3)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != aVar) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    kotlin.coroutines.Continuation b17 = pz5.f.b(this.f310637g);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    b17.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
                    return;
                }
            }
        }
    }

    public boolean B() {
        java.lang.Object E = E(null);
        if (E == kotlinx.coroutines.s.f310580a) {
            return true;
        }
        if (E == null) {
            return false;
        }
        throw new java.lang.IllegalStateException(("Unexpected trySelectIdempotent result " + E).toString());
    }

    public java.lang.Object E(kotlinx.coroutines.internal.q qVar) {
        kotlinx.coroutines.internal.l0 l0Var;
        while (true) {
            java.lang.Object obj = this._state;
            java.lang.Object obj2 = kotlinx.coroutines.selects.i.f310638a;
            l0Var = kotlinx.coroutines.s.f310580a;
            if (obj == obj2) {
                boolean z17 = false;
                if (qVar == null) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310635h;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, null)) {
                            z17 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z17) {
                        break;
                    }
                } else {
                    kotlinx.coroutines.selects.c cVar = new kotlinx.coroutines.selects.c(qVar);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310635h;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, cVar)) {
                            z17 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z17) {
                        java.lang.Object c17 = cVar.c(this);
                        if (c17 != null) {
                            return c17;
                        }
                    }
                }
            } else {
                if (!(obj instanceof kotlinx.coroutines.internal.e0)) {
                    if (qVar != null && obj == qVar.f310518c) {
                        return l0Var;
                    }
                    return null;
                }
                if (qVar != null) {
                    kotlinx.coroutines.internal.d a17 = qVar.a();
                    if ((a17 instanceof kotlinx.coroutines.selects.a) && ((kotlinx.coroutines.selects.a) a17).f310627b == this) {
                        throw new java.lang.IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (a17.b((kotlinx.coroutines.internal.e0) obj)) {
                        return kotlinx.coroutines.internal.c.f310486b;
                    }
                }
                ((kotlinx.coroutines.internal.e0) obj).c(this);
            }
        }
        w();
        return l0Var;
    }

    @Override // qz5.e
    public qz5.e getCallerFrame() {
        kotlin.coroutines.Continuation continuation = this.f310637g;
        if (continuation instanceof qz5.e) {
            return (qz5.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return this.f310637g.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this._result;
            java.lang.Object obj3 = kotlinx.coroutines.selects.i.f310640c;
            boolean z17 = false;
            if (obj2 == obj3) {
                java.lang.Object b17 = kotlinx.coroutines.i0.b(obj, null);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310636i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, b17)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else {
                pz5.a aVar = pz5.a.f359186d;
                if (obj2 != aVar) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310636i;
                java.lang.Object obj4 = kotlinx.coroutines.selects.i.f310641d;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar, obj4)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != aVar) {
                        break;
                    }
                }
                if (z17) {
                    if (!kotlin.Result.m527isFailureimpl(obj)) {
                        this.f310637g.resumeWith(obj);
                        return;
                    }
                    kotlin.coroutines.Continuation continuation = this.f310637g;
                    java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                    kotlin.jvm.internal.o.d(m524exceptionOrNullimpl);
                    continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(m524exceptionOrNullimpl)));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0009, code lost:
    
        if (y() == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (n().i(r0, r2) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (y() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(kotlinx.coroutines.s1 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.selects.b r0 = new kotlinx.coroutines.selects.b
            r0.<init>(r3)
            boolean r1 = r2.y()
            if (r1 != 0) goto L1c
        Lb:
            kotlinx.coroutines.internal.t r1 = r2.n()
            boolean r1 = r1.i(r0, r2)
            if (r1 == 0) goto Lb
            boolean r0 = r2.y()
            if (r0 != 0) goto L1c
            return
        L1c:
            r3.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.f.u(kotlinx.coroutines.s1):void");
    }

    public final void w() {
        kotlinx.coroutines.s1 s1Var = (kotlinx.coroutines.s1) this._parentHandle;
        if (s1Var != null) {
            s1Var.dispose();
        }
        for (kotlinx.coroutines.internal.t tVar = (kotlinx.coroutines.internal.t) l(); !kotlin.jvm.internal.o.b(tVar, this); tVar = tVar.m()) {
            if (tVar instanceof kotlinx.coroutines.selects.b) {
                ((kotlinx.coroutines.selects.b) tVar).f310630g.dispose();
            }
        }
    }

    public final java.lang.Object x() {
        boolean z17;
        if (!y()) {
            oz5.l context = getContext();
            int i17 = kotlinx.coroutines.r2.O0;
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) context.get(kotlinx.coroutines.q2.f310571d);
            if (r2Var != null) {
                kotlinx.coroutines.s1 b17 = kotlinx.coroutines.p2.b(r2Var, true, false, new kotlinx.coroutines.selects.d(this), 2, null);
                this._parentHandle = b17;
                if (y()) {
                    b17.dispose();
                }
            }
        }
        java.lang.Object obj = this._result;
        java.lang.Object obj2 = kotlinx.coroutines.selects.i.f310640c;
        if (obj == obj2) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310636i;
            pz5.a aVar = pz5.a.f359186d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                return pz5.a.f359186d;
            }
            obj = this._result;
        }
        if (obj == kotlinx.coroutines.selects.i.f310641d) {
            throw new java.lang.IllegalStateException("Already resumed");
        }
        if (obj instanceof kotlinx.coroutines.e0) {
            throw ((kotlinx.coroutines.e0) obj).f310172a;
        }
        return obj;
    }

    public boolean y() {
        while (true) {
            java.lang.Object obj = this._state;
            if (obj == kotlinx.coroutines.selects.i.f310638a) {
                return false;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.e0)) {
                return true;
            }
            ((kotlinx.coroutines.internal.e0) obj).c(this);
        }
    }

    public void z(long j17, yz5.l lVar) {
        if (j17 > 0) {
            u(kotlinx.coroutines.k1.d(getContext()).v(j17, new kotlinx.coroutines.selects.e(this, lVar), getContext()));
            return;
        }
        if (B()) {
            try {
                kotlin.jvm.internal.m0.e(lVar, 1);
                java.lang.Object invoke = lVar.invoke(this);
                if (invoke != pz5.a.f359186d) {
                    resumeWith(kotlin.Result.m521constructorimpl(invoke));
                }
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
            }
        }
    }
}
