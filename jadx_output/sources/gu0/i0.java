package gu0;

/* loaded from: classes5.dex */
public final class i0 implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f275697a;

    public i0(kotlin.coroutines.Continuation continuation) {
        this.f275697a = continuation;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "closePlayback: close error: " + mJError.message);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f275697a.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
