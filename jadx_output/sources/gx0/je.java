package gx0;

/* loaded from: classes5.dex */
public final class je implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.SynthSpecWrapper f276593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f276594b;

    public je(com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, kotlinx.coroutines.q qVar) {
        this.f276593a = synthSpecWrapper;
        this.f276594b = qVar;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlinx.coroutines.q qVar = this.f276594b;
        com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper = this.f276593a;
        if (mJError == null) {
            synthSpecWrapper.a();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        } else {
            synthSpecWrapper.a();
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new xt0.c(mJError))));
        }
    }
}
