package u26;

/* loaded from: classes14.dex */
public final class a implements u26.y {

    /* renamed from: a, reason: collision with root package name */
    public final u26.k f424133a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f424134b = u26.l.f424169d;

    public a(u26.k kVar) {
        this.f424133a = kVar;
    }

    public java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj = this.f424134b;
        kotlinx.coroutines.internal.l0 l0Var = u26.l.f424169d;
        boolean z17 = false;
        if (obj != l0Var) {
            if (obj instanceof u26.e0) {
                u26.e0 e0Var = (u26.e0) obj;
                if (e0Var.f424148g != null) {
                    java.lang.Throwable A = e0Var.A();
                    int i17 = kotlinx.coroutines.internal.k0.f310507a;
                    throw A;
                }
            } else {
                z17 = true;
            }
            return java.lang.Boolean.valueOf(z17);
        }
        u26.k kVar = this.f424133a;
        java.lang.Object D = kVar.D();
        this.f424134b = D;
        if (D != l0Var) {
            if (D instanceof u26.e0) {
                u26.e0 e0Var2 = (u26.e0) D;
                if (e0Var2.f424148g != null) {
                    java.lang.Throwable A2 = e0Var2.A();
                    int i18 = kotlinx.coroutines.internal.k0.f310507a;
                    throw A2;
                }
            } else {
                z17 = true;
            }
            return java.lang.Boolean.valueOf(z17);
        }
        kotlinx.coroutines.r a17 = kotlinx.coroutines.t.a(pz5.f.b(continuation));
        u26.d dVar = new u26.d(this, a17);
        while (true) {
            if (kVar.x(dVar)) {
                a17.m(new u26.f(kVar, dVar));
                break;
            }
            java.lang.Object D2 = kVar.D();
            this.f424134b = D2;
            if (D2 instanceof u26.e0) {
                u26.e0 e0Var3 = (u26.e0) D2;
                if (e0Var3.f424148g == null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    a17.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                } else {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    a17.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e0Var3.A())));
                }
            } else if (D2 != l0Var) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                yz5.l lVar = kVar.f424181d;
                a17.s(bool, lVar != null ? new kotlinx.coroutines.internal.c0(lVar, D2, a17.f310577e) : null);
            }
        }
        java.lang.Object j17 = a17.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public java.lang.Object b() {
        java.lang.Object obj = this.f424134b;
        if (obj instanceof u26.e0) {
            java.lang.Throwable A = ((u26.e0) obj).A();
            int i17 = kotlinx.coroutines.internal.k0.f310507a;
            throw A;
        }
        kotlinx.coroutines.internal.l0 l0Var = u26.l.f424169d;
        if (obj == l0Var) {
            throw new java.lang.IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
        this.f424134b = l0Var;
        return obj;
    }
}
