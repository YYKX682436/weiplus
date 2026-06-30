package n0;

/* loaded from: classes13.dex */
public final class t1 implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f333703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f333704e;

    public t1(kotlinx.coroutines.q qVar, yz5.l lVar) {
        this.f333703d = qVar;
        this.f333704e = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j17) {
        java.lang.Object m521constructorimpl;
        n0.u1 u1Var = n0.u1.f333714d;
        yz5.l lVar = this.f333704e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(lVar.invoke(java.lang.Long.valueOf(j17)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        ((kotlinx.coroutines.r) this.f333703d).resumeWith(m521constructorimpl);
    }
}
