package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class o extends kotlinx.coroutines.internal.b {
    @Override // kotlinx.coroutines.internal.b
    public final java.lang.Object a(kotlinx.coroutines.internal.d dVar) {
        kotlinx.coroutines.internal.t tVar;
        boolean z17;
        while (true) {
            kotlinx.coroutines.internal.r rVar = (kotlinx.coroutines.internal.r) this;
            kotlinx.coroutines.internal.t tVar2 = rVar.f310522b;
            while (true) {
                java.lang.Object obj = tVar2._next;
                if (!(obj instanceof kotlinx.coroutines.internal.e0)) {
                    tVar = (kotlinx.coroutines.internal.t) obj;
                    break;
                }
                kotlinx.coroutines.internal.e0 e0Var = (kotlinx.coroutines.internal.e0) obj;
                if (dVar.b(e0Var)) {
                    tVar = null;
                    break;
                }
                e0Var.c(rVar.f310522b);
            }
            java.lang.Object obj2 = kotlinx.coroutines.internal.c.f310486b;
            if (tVar == null) {
                return obj2;
            }
            java.lang.Object obj3 = tVar._next;
            if (obj3 == dVar || dVar.h()) {
                return null;
            }
            if (obj3 instanceof kotlinx.coroutines.internal.e0) {
                kotlinx.coroutines.internal.e0 e0Var2 = (kotlinx.coroutines.internal.e0) obj3;
                if (dVar.b(e0Var2)) {
                    return obj2;
                }
                e0Var2.c(tVar);
            } else {
                java.lang.Object b17 = b(tVar);
                if (b17 != null) {
                    return b17;
                }
                boolean z18 = false;
                if (obj3 instanceof kotlinx.coroutines.internal.f0) {
                    ((kotlinx.coroutines.internal.f0) obj3).f310493a.o();
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    continue;
                } else {
                    kotlinx.coroutines.internal.q qVar = new kotlinx.coroutines.internal.q(tVar, (kotlinx.coroutines.internal.t) obj3, this);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.t.f310525d;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(tVar, obj3, qVar)) {
                            z18 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(tVar) != obj3) {
                            break;
                        }
                    }
                    if (z18) {
                        try {
                            if (qVar.c(tVar) != kotlinx.coroutines.internal.u.f310528a) {
                                return null;
                            }
                        } catch (java.lang.Throwable th6) {
                            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.t.f310525d;
                            while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, qVar, obj3) && atomicReferenceFieldUpdater2.get(tVar) == qVar) {
                            }
                            throw th6;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public abstract java.lang.Object b(kotlinx.coroutines.internal.t tVar);

    public abstract void c(kotlinx.coroutines.internal.q qVar);

    public abstract kotlinx.coroutines.internal.t d();

    public abstract kotlinx.coroutines.internal.t e();

    public java.lang.Object f(kotlinx.coroutines.internal.q qVar) {
        c(qVar);
        return null;
    }

    public void g(kotlinx.coroutines.internal.t tVar) {
    }
}
