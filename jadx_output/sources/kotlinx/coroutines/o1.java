package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class o1 {
    public static final void a(kotlinx.coroutines.n1 n1Var, kotlin.coroutines.Continuation continuation, boolean z17) {
        java.lang.Object successfulResult$kotlinx_coroutines_core;
        java.lang.Object takeState$kotlinx_coroutines_core = n1Var.takeState$kotlinx_coroutines_core();
        java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = n1Var.getExceptionalResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            successfulResult$kotlinx_coroutines_core = kotlin.ResultKt.createFailure(exceptionalResult$kotlinx_coroutines_core);
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            successfulResult$kotlinx_coroutines_core = n1Var.getSuccessfulResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        }
        java.lang.Object m521constructorimpl = kotlin.Result.m521constructorimpl(successfulResult$kotlinx_coroutines_core);
        if (!z17) {
            continuation.resumeWith(m521constructorimpl);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) continuation;
        kotlin.coroutines.Continuation<T> continuation2 = dispatchedContinuation.continuation;
        java.lang.Object obj = dispatchedContinuation.countOrElement;
        oz5.l context = continuation2.getContext();
        java.lang.Object c17 = kotlinx.coroutines.internal.r0.c(context, obj);
        kotlinx.coroutines.c4 c18 = c17 != kotlinx.coroutines.internal.r0.f310523a ? kotlinx.coroutines.m0.c(continuation2, context, c17) : null;
        try {
            dispatchedContinuation.continuation.resumeWith(m521constructorimpl);
        } finally {
            if (c18 == null || c18.k0()) {
                kotlinx.coroutines.internal.r0.a(context, c17);
            }
        }
    }
}
