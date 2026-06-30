package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: a */
    public static final kotlinx.coroutines.internal.l0 f310498a = new kotlinx.coroutines.internal.l0("UNDEFINED");

    /* renamed from: b */
    public static final kotlinx.coroutines.internal.l0 f310499b = new kotlinx.coroutines.internal.l0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final void a(kotlin.coroutines.Continuation continuation, java.lang.Object obj, yz5.l lVar) {
        boolean z17;
        if (!(continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation)) {
            continuation.resumeWith(obj);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) continuation;
        java.lang.Object b17 = kotlinx.coroutines.i0.b(obj, lVar);
        if (dispatchedContinuation.dispatcher.I(dispatchedContinuation.getContext())) {
            dispatchedContinuation._state = b17;
            dispatchedContinuation.resumeMode = 1;
            dispatchedContinuation.dispatcher.D(dispatchedContinuation.getContext(), dispatchedContinuation);
            return;
        }
        kotlinx.coroutines.w1 a17 = kotlinx.coroutines.v3.f310684a.a();
        if (a17.O()) {
            dispatchedContinuation._state = b17;
            dispatchedContinuation.resumeMode = 1;
            a17.M(dispatchedContinuation);
            return;
        }
        a17.N(true);
        try {
            oz5.l context = dispatchedContinuation.getContext();
            int i17 = kotlinx.coroutines.r2.O0;
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) context.get(kotlinx.coroutines.q2.f310571d);
            if (r2Var == null || r2Var.a()) {
                z17 = false;
            } else {
                java.util.concurrent.CancellationException x17 = r2Var.x();
                dispatchedContinuation.cancelCompletedResult$kotlinx_coroutines_core(b17, x17);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                dispatchedContinuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(x17)));
                z17 = true;
            }
            if (!z17) {
                kotlin.coroutines.Continuation<T> continuation2 = dispatchedContinuation.continuation;
                java.lang.Object obj2 = dispatchedContinuation.countOrElement;
                oz5.l context2 = continuation2.getContext();
                java.lang.Object c17 = kotlinx.coroutines.internal.r0.c(context2, obj2);
                kotlinx.coroutines.c4 c18 = c17 != kotlinx.coroutines.internal.r0.f310523a ? kotlinx.coroutines.m0.c(continuation2, context2, c17) : null;
                try {
                    dispatchedContinuation.continuation.resumeWith(obj);
                    if (c18 == null || c18.k0()) {
                        kotlinx.coroutines.internal.r0.a(context2, c17);
                    }
                } catch (java.lang.Throwable th6) {
                    if (c18 == null || c18.k0()) {
                        kotlinx.coroutines.internal.r0.a(context2, c17);
                    }
                    throw th6;
                }
            }
            do {
            } while (a17.Q());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void b(kotlin.coroutines.Continuation continuation, java.lang.Object obj, yz5.l lVar, int i17, java.lang.Object obj2) {
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        a(continuation, obj, lVar);
    }
}
