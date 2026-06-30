package ou0;

/* loaded from: classes5.dex */
public final class t implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f348909a;

    public t(kotlin.coroutines.Continuation continuation) {
        this.f348909a = continuation;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.coroutines.Continuation continuation = this.f348909a;
        if (mJError == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new xt0.c(mJError))));
        }
    }
}
