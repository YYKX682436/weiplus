package gx0;

/* loaded from: classes5.dex */
public final class zd implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.SynthSpecWrapper f277284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f277285b;

    public zd(com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, kotlin.coroutines.Continuation continuation) {
        this.f277284a = synthSpecWrapper;
        this.f277285b = continuation;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        this.f277284a.a();
        kotlin.coroutines.Continuation continuation = this.f277285b;
        if (mJError == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            return;
        }
        com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - failed:" + mJError.message, mJError);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }
}
