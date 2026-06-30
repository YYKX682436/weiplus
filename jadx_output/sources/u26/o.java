package u26;

/* loaded from: classes14.dex */
public abstract class o implements u26.y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f424180f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(u26.o.class, java.lang.Object.class, "onCloseHandler");

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f424181d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.internal.m f424182e = new kotlinx.coroutines.internal.m();
    private volatile /* synthetic */ java.lang.Object onCloseHandler = null;

    public o(yz5.l lVar) {
        this.f424181d = lVar;
    }

    public static final void a(u26.o oVar, kotlin.coroutines.Continuation continuation, java.lang.Object obj, u26.e0 e0Var) {
        kotlinx.coroutines.internal.v0 a17;
        oVar.o(e0Var);
        java.lang.Throwable th6 = e0Var.f424148g;
        if (th6 == null) {
            th6 = new u26.g0("Channel was closed");
        }
        yz5.l lVar = oVar.f424181d;
        if (lVar == null || (a17 = kotlinx.coroutines.internal.d0.a(lVar, obj, null)) == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
        } else {
            jz5.a.a(a17, th6);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(a17)));
        }
    }

    public java.lang.Object c(u26.w0 w0Var) {
        boolean z17;
        kotlinx.coroutines.internal.t n17;
        boolean p17 = p();
        kotlinx.coroutines.internal.t tVar = this.f424182e;
        if (!p17) {
            u26.n nVar = new u26.n(w0Var, this);
            while (true) {
                kotlinx.coroutines.internal.t n18 = tVar.n();
                if (!(n18 instanceof u26.u0)) {
                    int t17 = n18.t(w0Var, tVar, nVar);
                    z17 = true;
                    if (t17 != 1) {
                        if (t17 == 2) {
                            z17 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return n18;
                }
            }
            if (z17) {
                return null;
            }
            return u26.l.f424170e;
        }
        do {
            n17 = tVar.n();
            if (n17 instanceof u26.u0) {
                return n17;
            }
        } while (!n17.i(w0Var, tVar));
        return null;
    }

    @Override // u26.y0
    public final java.lang.Object e(java.lang.Object obj) {
        u26.a0 a0Var;
        java.lang.Object u17 = u(obj);
        if (u17 == u26.l.f424167b) {
            return jz5.f0.f302826a;
        }
        if (u17 == u26.l.f424168c) {
            u26.e0 l17 = l();
            if (l17 == null) {
                return u26.c0.f424140b;
            }
            o(l17);
            java.lang.Throwable th6 = l17.f424148g;
            if (th6 == null) {
                th6 = new u26.g0("Channel was closed");
            }
            a0Var = new u26.a0(th6);
        } else {
            if (!(u17 instanceof u26.e0)) {
                throw new java.lang.IllegalStateException(("trySend returned " + u17).toString());
            }
            u26.e0 e0Var = (u26.e0) u17;
            o(e0Var);
            java.lang.Throwable th7 = e0Var.f424148g;
            if (th7 == null) {
                th7 = new u26.g0("Channel was closed");
            }
            a0Var = new u26.a0(th7);
        }
        return a0Var;
    }

    public java.lang.String f() {
        return "";
    }

    @Override // u26.y0
    public final boolean j() {
        return l() != null;
    }

    public final u26.e0 k() {
        kotlinx.coroutines.internal.t m17 = this.f424182e.m();
        u26.e0 e0Var = m17 instanceof u26.e0 ? (u26.e0) m17 : null;
        if (e0Var == null) {
            return null;
        }
        o(e0Var);
        return e0Var;
    }

    public final u26.e0 l() {
        kotlinx.coroutines.internal.t n17 = this.f424182e.n();
        u26.e0 e0Var = n17 instanceof u26.e0 ? (u26.e0) n17 : null;
        if (e0Var == null) {
            return null;
        }
        o(e0Var);
        return e0Var;
    }

    @Override // u26.y0
    public void n(yz5.l lVar) {
        boolean z17;
        boolean z18;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f424180f;
        while (true) {
            z17 = false;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                z18 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z18 = false;
                break;
            }
        }
        kotlinx.coroutines.internal.l0 l0Var = u26.l.f424171f;
        if (!z18) {
            java.lang.Object obj = this.onCloseHandler;
            if (obj == l0Var) {
                throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new java.lang.IllegalStateException("Another handler was already registered: " + obj);
        }
        u26.e0 l17 = l();
        if (l17 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f424180f;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, lVar, l0Var)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                    break;
                }
            }
            if (z17) {
                lVar.invoke(l17.f424148g);
            }
        }
    }

    public final void o(u26.e0 e0Var) {
        java.lang.Object obj = null;
        while (true) {
            kotlinx.coroutines.internal.t n17 = e0Var.n();
            u26.s0 s0Var = n17 instanceof u26.s0 ? (u26.s0) n17 : null;
            if (s0Var == null) {
                break;
            } else if (s0Var.q()) {
                obj = kotlinx.coroutines.internal.j.a(obj, s0Var);
            } else {
                ((kotlinx.coroutines.internal.f0) s0Var.l()).f310493a.o();
            }
        }
        if (obj != null) {
            if (!(obj instanceof java.util.ArrayList)) {
                ((u26.s0) obj).w(e0Var);
                return;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((u26.s0) arrayList.get(size)).w(e0Var);
            }
        }
    }

    @Override // u26.y0
    public boolean offer(java.lang.Object obj) {
        kotlinx.coroutines.internal.v0 a17;
        try {
            java.lang.Object e17 = e(obj);
            if (!(e17 instanceof u26.b0)) {
                return true;
            }
            java.lang.Throwable a18 = u26.c0.a(e17);
            if (a18 == null) {
                return false;
            }
            int i17 = kotlinx.coroutines.internal.k0.f310507a;
            throw a18;
        } catch (java.lang.Throwable th6) {
            yz5.l lVar = this.f424181d;
            if (lVar == null || (a17 = kotlinx.coroutines.internal.d0.a(lVar, obj, null)) == null) {
                throw th6;
            }
            jz5.a.a(a17, th6);
            throw a17;
        }
    }

    public abstract boolean p();

    public abstract boolean q();

    @Override // u26.y0
    public boolean s(java.lang.Throwable th6) {
        boolean z17;
        boolean z18;
        java.lang.Object obj;
        kotlinx.coroutines.internal.l0 l0Var;
        u26.e0 e0Var = new u26.e0(th6);
        kotlinx.coroutines.internal.t tVar = this.f424182e;
        while (true) {
            kotlinx.coroutines.internal.t n17 = tVar.n();
            z17 = false;
            if (!(!(n17 instanceof u26.e0))) {
                z18 = false;
                break;
            }
            if (n17.i(e0Var, tVar)) {
                z18 = true;
                break;
            }
        }
        if (!z18) {
            e0Var = (u26.e0) this.f424182e.n();
        }
        o(e0Var);
        if (z18 && (obj = this.onCloseHandler) != null && obj != (l0Var = u26.l.f424171f)) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f424180f;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, l0Var)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (z17) {
                kotlin.jvm.internal.m0.e(obj, 1);
                ((yz5.l) obj).invoke(th6);
            }
        }
        return z18;
    }

    @Override // u26.y0
    public final java.lang.Object t(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object u17 = u(obj);
        kotlinx.coroutines.internal.l0 l0Var = u26.l.f424167b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (u17 == l0Var) {
            return f0Var;
        }
        kotlinx.coroutines.r a17 = kotlinx.coroutines.t.a(pz5.f.b(continuation));
        while (true) {
            if (!(this.f424182e.m() instanceof u26.u0) && q()) {
                yz5.l lVar = this.f424181d;
                u26.z0 z0Var = lVar == null ? new u26.z0(obj, a17) : new u26.a1(obj, a17, lVar);
                java.lang.Object c17 = c(z0Var);
                if (c17 == null) {
                    a17.m(new kotlinx.coroutines.m3(z0Var));
                    break;
                }
                if (c17 instanceof u26.e0) {
                    a(this, a17, obj, (u26.e0) c17);
                    break;
                }
                if (c17 != u26.l.f424170e && !(c17 instanceof u26.s0)) {
                    throw new java.lang.IllegalStateException(("enqueueSend returned " + c17).toString());
                }
            }
            java.lang.Object u18 = u(obj);
            if (u18 == l0Var) {
                a17.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
                break;
            }
            if (u18 != u26.l.f424168c) {
                if (!(u18 instanceof u26.e0)) {
                    throw new java.lang.IllegalStateException(("offerInternal returned " + u18).toString());
                }
                a(this, a17, obj, (u26.e0) u18);
            }
        }
        java.lang.Object j17 = a17.j();
        pz5.a aVar = pz5.a.f359186d;
        if (j17 != aVar) {
            j17 = f0Var;
        }
        return j17 == aVar ? j17 : f0Var;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getClass().getSimpleName());
        sb6.append('@');
        sb6.append(kotlinx.coroutines.c1.a(this));
        sb6.append('{');
        kotlinx.coroutines.internal.t tVar = this.f424182e;
        kotlinx.coroutines.internal.t m17 = tVar.m();
        if (m17 == tVar) {
            str2 = "EmptyQueue";
        } else {
            if (m17 instanceof u26.e0) {
                str = m17.toString();
            } else if (m17 instanceof u26.s0) {
                str = "ReceiveQueued";
            } else if (m17 instanceof u26.w0) {
                str = "SendQueued";
            } else {
                str = "UNEXPECTED:" + m17;
            }
            kotlinx.coroutines.internal.t n17 = tVar.n();
            if (n17 != m17) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str);
                sb7.append(",queueSize=");
                int i17 = 0;
                for (kotlinx.coroutines.internal.t tVar2 = (kotlinx.coroutines.internal.t) tVar.l(); !kotlin.jvm.internal.o.b(tVar2, tVar); tVar2 = tVar2.m()) {
                    if (tVar2 instanceof kotlinx.coroutines.internal.t) {
                        i17++;
                    }
                }
                sb7.append(i17);
                str2 = sb7.toString();
                if (n17 instanceof u26.e0) {
                    str2 = str2 + ",closedForSend=" + n17;
                }
            } else {
                str2 = str;
            }
        }
        sb6.append(str2);
        sb6.append('}');
        sb6.append(f());
        return sb6.toString();
    }

    public java.lang.Object u(java.lang.Object obj) {
        u26.u0 v17;
        do {
            v17 = v();
            if (v17 == null) {
                return u26.l.f424168c;
            }
        } while (v17.h(obj, null) == null);
        v17.g(obj);
        return v17.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.t] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public u26.u0 v() {
        ?? r17;
        kotlinx.coroutines.internal.t r18;
        kotlinx.coroutines.internal.m mVar = this.f424182e;
        while (true) {
            r17 = (kotlinx.coroutines.internal.t) mVar.l();
            if (r17 != mVar && (r17 instanceof u26.u0)) {
                if (((((u26.u0) r17) instanceof u26.e0) && !r17.p()) || (r18 = r17.r()) == null) {
                    break;
                }
                r18.o();
            }
        }
        r17 = 0;
        return (u26.u0) r17;
    }

    public final u26.w0 w() {
        kotlinx.coroutines.internal.t tVar;
        kotlinx.coroutines.internal.t r17;
        kotlinx.coroutines.internal.m mVar = this.f424182e;
        while (true) {
            tVar = (kotlinx.coroutines.internal.t) mVar.l();
            if (tVar != mVar && (tVar instanceof u26.w0)) {
                if (((((u26.w0) tVar) instanceof u26.e0) && !tVar.p()) || (r17 = tVar.r()) == null) {
                    break;
                }
                r17.o();
            }
        }
        tVar = null;
        return (u26.w0) tVar;
    }
}
