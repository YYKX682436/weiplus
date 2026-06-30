package kotlinx.coroutines.selects;

/* loaded from: classes14.dex */
public final class a extends kotlinx.coroutines.internal.d {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.selects.f f310627b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.internal.b f310628c;

    /* renamed from: d, reason: collision with root package name */
    public final long f310629d;

    public a(kotlinx.coroutines.selects.f fVar, kotlinx.coroutines.internal.b bVar) {
        this.f310627b = fVar;
        this.f310628c = bVar;
        kotlinx.coroutines.selects.j jVar = kotlinx.coroutines.selects.i.f310642e;
        jVar.getClass();
        this.f310629d = kotlinx.coroutines.selects.j.f310643a.incrementAndGet(jVar);
        bVar.f310483a = this;
    }

    @Override // kotlinx.coroutines.internal.d
    public void d(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.selects.f fVar;
        boolean z17;
        kotlinx.coroutines.internal.t e17;
        kotlinx.coroutines.internal.t tVar;
        boolean z18 = false;
        boolean z19 = obj2 == null;
        java.lang.Object obj3 = z19 ? null : kotlinx.coroutines.selects.i.f310638a;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.selects.f.f310635h;
        while (true) {
            fVar = this.f310627b;
            if (atomicReferenceFieldUpdater.compareAndSet(fVar, this, obj3)) {
                z17 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(fVar) != this) {
                z17 = false;
                break;
            }
        }
        if (z17 && z19) {
            fVar.w();
        }
        kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) this.f310628c;
        oVar.getClass();
        boolean z27 = obj2 == null;
        kotlinx.coroutines.internal.t d17 = oVar.d();
        if (d17 == null || (e17 = oVar.e()) == null) {
            return;
        }
        if (z27) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.t.f310525d;
            tVar = e17.s();
        } else {
            tVar = e17;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = kotlinx.coroutines.internal.t.f310525d;
        while (true) {
            if (atomicReferenceFieldUpdater3.compareAndSet(d17, this, tVar)) {
                z18 = true;
                break;
            } else if (atomicReferenceFieldUpdater3.get(d17) != this) {
                break;
            }
        }
        if (z18 && z27) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = kotlinx.coroutines.internal.t.f310525d;
            e17.j(null);
        }
    }

    @Override // kotlinx.coroutines.internal.d
    public long g() {
        return this.f310629d;
    }

    @Override // kotlinx.coroutines.internal.d
    public java.lang.Object i(java.lang.Object obj) {
        kotlinx.coroutines.selects.f fVar;
        java.lang.Object obj2;
        boolean z17;
        if (obj == null) {
            kotlinx.coroutines.selects.f fVar2 = this.f310627b;
            while (true) {
                java.lang.Object obj3 = fVar2._state;
                obj2 = null;
                if (obj3 == this) {
                    break;
                }
                if (!(obj3 instanceof kotlinx.coroutines.internal.e0)) {
                    java.lang.Object obj4 = kotlinx.coroutines.selects.i.f310638a;
                    if (obj3 != obj4) {
                        obj2 = kotlinx.coroutines.selects.i.f310639b;
                        break;
                    }
                    kotlinx.coroutines.selects.f fVar3 = this.f310627b;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.selects.f.f310635h;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(fVar3, obj4, this)) {
                            z17 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(fVar3) != obj4) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17) {
                        break;
                    }
                } else {
                    ((kotlinx.coroutines.internal.e0) obj3).c(this.f310627b);
                }
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        try {
            return this.f310628c.a(this);
        } catch (java.lang.Throwable th6) {
            if (obj == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.selects.f.f310635h;
                java.lang.Object obj5 = kotlinx.coroutines.selects.i.f310638a;
                do {
                    fVar = this.f310627b;
                    if (atomicReferenceFieldUpdater2.compareAndSet(fVar, this, obj5)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(fVar) == this);
            }
            throw th6;
        }
    }

    @Override // kotlinx.coroutines.internal.e0
    public java.lang.String toString() {
        return "AtomicSelectOp(sequence=" + this.f310629d + ')';
    }
}
