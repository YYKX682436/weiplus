package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class v2 {
    public static kotlinx.coroutines.c0 a(kotlinx.coroutines.r2 r2Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            r2Var = null;
        }
        return new kotlinx.coroutines.u2(r2Var);
    }

    public static final void b(oz5.l lVar, java.util.concurrent.CancellationException cancellationException) {
        int i17 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) lVar.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var != null) {
            r2Var.b(cancellationException);
        }
    }

    public static /* synthetic */ void c(oz5.l lVar, java.util.concurrent.CancellationException cancellationException, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            cancellationException = null;
        }
        b(lVar, cancellationException);
    }

    public static final java.lang.Object d(kotlinx.coroutines.r2 r2Var, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        java.lang.Object C = r2Var.C(continuation);
        return C == pz5.a.f359186d ? C : jz5.f0.f302826a;
    }

    public static void e(oz5.l lVar, java.util.concurrent.CancellationException cancellationException, int i17, java.lang.Object obj) {
        q26.n c17;
        if ((i17 & 1) != 0) {
            cancellationException = null;
        }
        int i18 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) lVar.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var == null || (c17 = r2Var.c()) == null) {
            return;
        }
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            ((kotlinx.coroutines.r2) it.next()).b(cancellationException);
        }
    }

    public static final void f(oz5.l lVar) {
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) lVar.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var != null && !r2Var.a()) {
            throw r2Var.x();
        }
    }

    public static final kotlinx.coroutines.r2 g(oz5.l lVar) {
        int i17 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) lVar.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var != null) {
            return r2Var;
        }
        throw new java.lang.IllegalStateException(("Current context doesn't contain Job in it: " + lVar).toString());
    }

    public static final boolean h(oz5.l lVar) {
        int i17 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) lVar.get(kotlinx.coroutines.q2.f310571d);
        return r2Var != null && r2Var.a();
    }
}
