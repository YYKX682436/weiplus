package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public final class k implements kotlinx.coroutines.sync.d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310656a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.k.class, java.lang.Object.class, "_state");
    volatile /* synthetic */ java.lang.Object _state;

    public k(boolean z17) {
        this._state = z17 ? kotlinx.coroutines.sync.l.f310660d : kotlinx.coroutines.sync.l.f310661e;
    }

    public boolean a() {
        while (true) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return ((kotlinx.coroutines.sync.b) obj).f310646a != kotlinx.coroutines.sync.l.f310659c;
            }
            if (obj instanceof kotlinx.coroutines.sync.h) {
                return true;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.e0)) {
                throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
            }
            ((kotlinx.coroutines.internal.e0) obj).c(this);
        }
    }

    public java.lang.Object b(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean c17 = c(obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (c17) {
            return f0Var;
        }
        kotlinx.coroutines.r a17 = kotlinx.coroutines.t.a(pz5.f.b(continuation));
        kotlinx.coroutines.sync.f fVar = new kotlinx.coroutines.sync.f(this, obj, a17);
        while (true) {
            java.lang.Object obj2 = this._state;
            boolean z17 = false;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj2;
                if (bVar.f310646a != kotlinx.coroutines.sync.l.f310659c) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310656a;
                    kotlinx.coroutines.sync.h hVar = new kotlinx.coroutines.sync.h(bVar.f310646a);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, hVar) && atomicReferenceFieldUpdater.get(this) == obj2) {
                    }
                } else {
                    kotlinx.coroutines.sync.b bVar2 = obj == null ? kotlinx.coroutines.sync.l.f310660d : new kotlinx.coroutines.sync.b(obj);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310656a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, bVar2)) {
                            z17 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z17) {
                        a17.s(f0Var, new kotlinx.coroutines.sync.j(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof kotlinx.coroutines.sync.h) {
                kotlinx.coroutines.sync.h hVar2 = (kotlinx.coroutines.sync.h) obj2;
                if (!(hVar2.owner != obj)) {
                    throw new java.lang.IllegalStateException(("Already locked by " + obj).toString());
                }
                do {
                } while (!hVar2.n().i(fVar, hVar2));
                if (this._state == obj2 || !kotlinx.coroutines.sync.g.f310651h.compareAndSet(fVar, 0, 1)) {
                    break;
                }
                fVar = new kotlinx.coroutines.sync.f(this, obj, a17);
            } else {
                if (!(obj2 instanceof kotlinx.coroutines.internal.e0)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((kotlinx.coroutines.internal.e0) obj2).c(this);
            }
        }
        a17.m(new kotlinx.coroutines.m3(fVar));
        java.lang.Object j17 = a17.j();
        pz5.a aVar = pz5.a.f359186d;
        if (j17 != aVar) {
            j17 = f0Var;
        }
        return j17 == aVar ? j17 : f0Var;
    }

    public boolean c(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this._state;
            boolean z17 = false;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                if (((kotlinx.coroutines.sync.b) obj2).f310646a != kotlinx.coroutines.sync.l.f310659c) {
                    return false;
                }
                kotlinx.coroutines.sync.b bVar = obj == null ? kotlinx.coroutines.sync.l.f310660d : new kotlinx.coroutines.sync.b(obj);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310656a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (z17) {
                    return true;
                }
            } else {
                if (obj2 instanceof kotlinx.coroutines.sync.h) {
                    if (((kotlinx.coroutines.sync.h) obj2).owner != obj) {
                        return false;
                    }
                    throw new java.lang.IllegalStateException(("Already locked by " + obj).toString());
                }
                if (!(obj2 instanceof kotlinx.coroutines.internal.e0)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((kotlinx.coroutines.internal.e0) obj2).c(this);
            }
        }
    }

    public void d(java.lang.Object obj) {
        kotlinx.coroutines.internal.t tVar;
        while (true) {
            java.lang.Object obj2 = this._state;
            boolean z17 = true;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                if (obj == null) {
                    if (!(((kotlinx.coroutines.sync.b) obj2).f310646a != kotlinx.coroutines.sync.l.f310659c)) {
                        throw new java.lang.IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj2;
                    if (!(bVar.f310646a == obj)) {
                        throw new java.lang.IllegalStateException(("Mutex is locked by " + bVar.f310646a + " but expected " + obj).toString());
                    }
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310656a;
                kotlinx.coroutines.sync.b bVar2 = kotlinx.coroutines.sync.l.f310661e;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else if (obj2 instanceof kotlinx.coroutines.internal.e0) {
                ((kotlinx.coroutines.internal.e0) obj2).c(this);
            } else {
                if (!(obj2 instanceof kotlinx.coroutines.sync.h)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj2).toString());
                }
                if (obj != null) {
                    kotlinx.coroutines.sync.h hVar = (kotlinx.coroutines.sync.h) obj2;
                    if (!(hVar.owner == obj)) {
                        throw new java.lang.IllegalStateException(("Mutex is locked by " + hVar.owner + " but expected " + obj).toString());
                    }
                }
                kotlinx.coroutines.sync.h hVar2 = (kotlinx.coroutines.sync.h) obj2;
                while (true) {
                    tVar = (kotlinx.coroutines.internal.t) hVar2.l();
                    if (tVar == hVar2) {
                        tVar = null;
                        break;
                    } else if (tVar.q()) {
                        break;
                    } else {
                        ((kotlinx.coroutines.internal.f0) tVar.l()).f310493a.o();
                    }
                }
                if (tVar == null) {
                    kotlinx.coroutines.sync.i iVar = new kotlinx.coroutines.sync.i(hVar2);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310656a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, iVar)) {
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17 && iVar.c(this) == null) {
                        return;
                    }
                } else {
                    kotlinx.coroutines.sync.g gVar = (kotlinx.coroutines.sync.g) tVar;
                    if (gVar.w()) {
                        java.lang.Object obj3 = gVar.f310652g;
                        if (obj3 == null) {
                            obj3 = kotlinx.coroutines.sync.l.f310658b;
                        }
                        hVar2.owner = obj3;
                        gVar.u();
                        return;
                    }
                }
            }
        }
    }

    public java.lang.String toString() {
        while (true) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return "Mutex[" + ((kotlinx.coroutines.sync.b) obj).f310646a + ']';
            }
            if (!(obj instanceof kotlinx.coroutines.internal.e0)) {
                if (!(obj instanceof kotlinx.coroutines.sync.h)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((kotlinx.coroutines.sync.h) obj).owner + ']';
            }
            ((kotlinx.coroutines.internal.e0) obj).c(this);
        }
    }
}
