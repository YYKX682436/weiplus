package gx0;

/* loaded from: classes5.dex */
public final class ud implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f277038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f277039b;

    public ud(kotlin.coroutines.Continuation continuation, gx0.bf bfVar) {
        this.f277038a = continuation;
        this.f277039b = bfVar;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.coroutines.Continuation continuation = this.f277038a;
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "onComplete: endClipSkimming mjError " + mJError.f48175ec.getErrorCode() + ", " + mJError.message);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        } else {
            com.tencent.mars.xlog.Log.i("MovieComp.PlaybackControlUIC", "onComplete: endClipSkimming success");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        }
        this.f277039b.L = false;
    }
}
