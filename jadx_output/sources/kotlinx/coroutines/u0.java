package kotlinx.coroutines;

/* loaded from: classes12.dex */
public abstract class u0 {
    public static final void a(oz5.l lVar, java.lang.Throwable th6) {
        try {
            kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) lVar.get(kotlinx.coroutines.q0.f310567d);
            if (r0Var != null) {
                r0Var.handleException(lVar, th6);
            } else {
                kotlinx.coroutines.t0.a(lVar, th6);
            }
        } catch (java.lang.Throwable th7) {
            if (th6 != th7) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th7);
                jz5.a.a(runtimeException, th6);
                th6 = runtimeException;
            }
            kotlinx.coroutines.t0.a(lVar, th6);
        }
    }
}
