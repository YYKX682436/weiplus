package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class a extends kotlinx.coroutines.c3 implements kotlin.coroutines.Continuation, kotlinx.coroutines.y0 {

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f310128e;

    public a(oz5.l lVar, boolean z17, boolean z18) {
        super(z18);
        if (z17) {
            S((kotlinx.coroutines.r2) lVar.get(kotlinx.coroutines.q2.f310571d));
        }
        this.f310128e = lVar.plus(this);
    }

    @Override // kotlinx.coroutines.c3
    public java.lang.String E() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.c3
    public final void R(java.lang.Throwable th6) {
        kotlinx.coroutines.u0.a(this.f310128e, th6);
    }

    @Override // kotlinx.coroutines.c3
    public java.lang.String W() {
        return super.W();
    }

    @Override // kotlinx.coroutines.c3
    public final void Z(java.lang.Object obj) {
        if (!(obj instanceof kotlinx.coroutines.e0)) {
            i0(obj);
        } else {
            kotlinx.coroutines.e0 e0Var = (kotlinx.coroutines.e0) obj;
            h0(e0Var.f310172a, e0Var.a());
        }
    }

    @Override // kotlinx.coroutines.c3, kotlinx.coroutines.r2
    public boolean a() {
        return super.a();
    }

    @Override // kotlin.coroutines.Continuation
    public final oz5.l getContext() {
        return this.f310128e;
    }

    @Override // kotlinx.coroutines.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF11582e() {
        return this.f310128e;
    }

    public void h0(java.lang.Throwable th6, boolean z17) {
    }

    public void i0(java.lang.Object obj) {
    }

    public final void j0(kotlinx.coroutines.a1 a1Var, java.lang.Object obj, yz5.p pVar) {
        int ordinal = a1Var.ordinal();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (ordinal == 0) {
            try {
                kotlin.coroutines.Continuation b17 = pz5.f.b(pz5.f.a(pVar, obj, this));
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlinx.coroutines.internal.i.a(b17, kotlin.Result.m521constructorimpl(f0Var), null);
                return;
            } finally {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th)));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.o.g(pVar, "<this>");
                kotlin.coroutines.Continuation b18 = pz5.f.b(pz5.f.a(pVar, obj, this));
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                b18.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
                return;
            }
            if (ordinal != 3) {
                throw new jz5.j();
            }
            try {
                oz5.l lVar = this.f310128e;
                java.lang.Object c17 = kotlinx.coroutines.internal.r0.c(lVar, null);
                try {
                    kotlin.jvm.internal.m0.e(pVar, 2);
                    java.lang.Object invoke = pVar.invoke(obj, this);
                    if (invoke != pz5.a.f359186d) {
                        resumeWith(kotlin.Result.m521constructorimpl(invoke));
                    }
                } finally {
                    kotlinx.coroutines.internal.r0.a(lVar, c17);
                }
            } catch (java.lang.Throwable th6) {
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object obj) {
        java.lang.Object V = V(kotlinx.coroutines.i0.b(obj, null));
        if (V == kotlinx.coroutines.d3.f310162b) {
            return;
        }
        v(V);
    }
}
