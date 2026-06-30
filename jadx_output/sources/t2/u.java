package t2;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final wa.a f414662d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.q f414663e;

    public u(wa.a futureToObserve, kotlinx.coroutines.q continuation) {
        kotlin.jvm.internal.o.h(futureToObserve, "futureToObserve");
        kotlin.jvm.internal.o.h(continuation, "continuation");
        this.f414662d = futureToObserve;
        this.f414663e = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        wa.a aVar = this.f414662d;
        boolean isCancelled = aVar.isCancelled();
        kotlinx.coroutines.q qVar = this.f414663e;
        if (isCancelled) {
            kotlinx.coroutines.p.a(qVar, null, 1, null);
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(t2.j.e(aVar)));
        } catch (java.util.concurrent.ExecutionException e17) {
            java.lang.Throwable cause = e17.getCause();
            if (cause == null) {
                kotlin.jvm.internal.o.n();
                throw null;
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(cause)));
        }
    }
}
