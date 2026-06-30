package n0;

/* loaded from: classes14.dex */
public final class h implements n0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f333520d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Throwable f333522f;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f333521e = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f333523g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f333524h = new java.util.ArrayList();

    public h(yz5.a aVar) {
        this.f333520d = aVar;
    }

    public final boolean d() {
        boolean z17;
        synchronized (this.f333521e) {
            z17 = !this.f333523g.isEmpty();
        }
        return z17;
    }

    public final void e(long j17) {
        java.lang.Object m521constructorimpl;
        synchronized (this.f333521e) {
            java.util.List list = this.f333523g;
            this.f333523g = this.f333524h;
            this.f333524h = list;
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                n0.f fVar = (n0.f) list.get(i17);
                fVar.getClass();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(fVar.f333502a.invoke(java.lang.Long.valueOf(j17)));
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                fVar.f333503b.resumeWith(m521constructorimpl);
            }
            list.clear();
        }
    }

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.a(this, key);
    }

    @Override // oz5.i
    public oz5.j getKey() {
        return n0.q2.f333685d;
    }

    @Override // n0.r2
    public java.lang.Object l(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        yz5.a aVar;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        synchronized (this.f333521e) {
            java.lang.Throwable th6 = this.f333522f;
            if (th6 != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
            } else {
                h0Var.f310123d = new n0.f(lVar, rVar);
                boolean z17 = !this.f333523g.isEmpty();
                java.util.List list = this.f333523g;
                java.lang.Object obj = h0Var.f310123d;
                if (obj == null) {
                    kotlin.jvm.internal.o.o("awaiter");
                    throw null;
                }
                list.add((n0.f) obj);
                boolean z18 = !z17;
                rVar.m(new n0.g(this, h0Var));
                if (z18 && (aVar = this.f333520d) != null) {
                    try {
                        aVar.invoke();
                    } catch (java.lang.Throwable th7) {
                        synchronized (this.f333521e) {
                            if (this.f333522f == null) {
                                this.f333522f = th7;
                                java.util.List list2 = this.f333523g;
                                int size = list2.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    kotlin.coroutines.Continuation continuation2 = ((n0.f) list2.get(i17)).f333503b;
                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                    continuation2.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7)));
                                }
                                this.f333523g.clear();
                            }
                        }
                    }
                }
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f359186d;
        return j17;
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.b(this, key);
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l context) {
        kotlin.jvm.internal.o.g(context, "context");
        return oz5.g.a(this, context);
    }
}
