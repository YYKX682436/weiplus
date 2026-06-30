package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class z0 {
    public static final kotlinx.coroutines.y0 a(oz5.l lVar) {
        int i17 = kotlinx.coroutines.r2.O0;
        if (lVar.get(kotlinx.coroutines.q2.f310571d) == null) {
            lVar = lVar.plus(kotlinx.coroutines.v2.a(null, 1, null));
        }
        return new kotlinx.coroutines.internal.h(lVar);
    }

    public static final kotlinx.coroutines.y0 b() {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return new kotlinx.coroutines.internal.h(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
    }

    public static final void c(kotlinx.coroutines.y0 y0Var, java.util.concurrent.CancellationException cancellationException) {
        oz5.l coroutineContext = y0Var.getCoroutineContext();
        int i17 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) coroutineContext.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var != null) {
            r2Var.b(cancellationException);
        } else {
            throw new java.lang.IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + y0Var).toString());
        }
    }

    public static void d(kotlinx.coroutines.y0 y0Var, java.lang.String str, java.lang.Throwable th6, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            th6 = null;
        }
        c(y0Var, kotlinx.coroutines.e2.a(str, th6));
    }

    public static /* synthetic */ void e(kotlinx.coroutines.y0 y0Var, java.util.concurrent.CancellationException cancellationException, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            cancellationException = null;
        }
        c(y0Var, cancellationException);
    }

    public static final java.lang.Object f(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.internal.h0 h0Var = new kotlinx.coroutines.internal.h0(continuation.getContext(), continuation);
        java.lang.Object b17 = w26.a.b(h0Var, h0Var, pVar);
        pz5.a aVar = pz5.a.f359186d;
        return b17;
    }

    public static final void g(kotlinx.coroutines.y0 y0Var) {
        kotlinx.coroutines.v2.f(y0Var.getCoroutineContext());
    }

    public static final boolean h(kotlinx.coroutines.y0 y0Var) {
        oz5.l coroutineContext = y0Var.getCoroutineContext();
        int i17 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) coroutineContext.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var != null) {
            return r2Var.a();
        }
        return true;
    }

    public static final kotlinx.coroutines.y0 i(kotlinx.coroutines.y0 y0Var, oz5.l lVar) {
        return new kotlinx.coroutines.internal.h(y0Var.getCoroutineContext().plus(lVar));
    }
}
