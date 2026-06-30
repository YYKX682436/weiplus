package w26;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(yz5.p pVar, java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        try {
            kotlin.jvm.internal.m0.e(pVar, 2);
            java.lang.Object invoke = pVar.invoke(obj, completion);
            if (invoke != pz5.a.f359186d) {
                completion.resumeWith(kotlin.Result.m521constructorimpl(invoke));
            }
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            completion.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
        }
    }

    public static final java.lang.Object b(kotlinx.coroutines.internal.h0 h0Var, java.lang.Object obj, yz5.p pVar) {
        java.lang.Object e0Var;
        java.lang.Object V;
        try {
            kotlin.jvm.internal.m0.e(pVar, 2);
            e0Var = pVar.invoke(obj, h0Var);
        } catch (java.lang.Throwable th6) {
            e0Var = new kotlinx.coroutines.e0(th6, false, 2, null);
        }
        pz5.a aVar = pz5.a.f359186d;
        if (e0Var == aVar || (V = h0Var.V(e0Var)) == kotlinx.coroutines.d3.f310162b) {
            return aVar;
        }
        if (V instanceof kotlinx.coroutines.e0) {
            throw ((kotlinx.coroutines.e0) V).f310172a;
        }
        return kotlinx.coroutines.d3.a(V);
    }
}
