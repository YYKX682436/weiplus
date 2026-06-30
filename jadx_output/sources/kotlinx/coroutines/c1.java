package kotlinx.coroutines;

/* loaded from: classes13.dex */
public abstract class c1 {
    public static final java.lang.String a(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final java.lang.String b(kotlin.coroutines.Continuation continuation) {
        java.lang.Object m521constructorimpl;
        if (continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(continuation + '@' + a(continuation));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = continuation.getClass().getName() + '@' + a(continuation);
        }
        return (java.lang.String) m521constructorimpl;
    }
}
