package n0;

/* loaded from: classes14.dex */
public abstract class s2 {
    public static final n0.r2 a(oz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<this>");
        int i17 = n0.r2.U0;
        n0.r2 r2Var = (n0.r2) lVar.get(n0.q2.f333685d);
        if (r2Var != null) {
            return r2Var;
        }
        throw new java.lang.IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final java.lang.Object b(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        return a(continuation.getContext()).l(lVar, continuation);
    }
}
