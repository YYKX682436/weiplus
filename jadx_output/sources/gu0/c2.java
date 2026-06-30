package gu0;

/* loaded from: classes5.dex */
public final class c2 implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f275644a;

    public c2(kotlin.coroutines.Continuation continuation) {
        this.f275644a = continuation;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.coroutines.Continuation continuation = this.f275644a;
        if (mJError == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("startPlaying failed: " + mJError.message))));
        }
    }
}
