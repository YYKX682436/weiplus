package qn4;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f365295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f365296e;

    public u(yz5.a aVar, yz5.a aVar2) {
        this.f365295d = aVar;
        this.f365296e = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = jz5.f0.f302826a;
        qn4.v vVar = qn4.v.f365297a;
        yz5.a aVar = this.f365295d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            aVar.invoke();
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("TranslationSpeech", "ensureMainThread action failed", m524exceptionOrNullimpl);
            yz5.a aVar2 = this.f365296e;
            if (aVar2 != null) {
                qn4.v vVar2 = qn4.v.f365297a;
                try {
                    aVar2.invoke();
                    kotlin.Result.m521constructorimpl(f0Var);
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                }
            }
        }
    }
}
