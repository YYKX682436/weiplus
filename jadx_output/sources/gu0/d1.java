package gu0;

/* loaded from: classes5.dex */
public final class d1 implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f275649b;

    public d1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        this.f275648a = k2Var;
        this.f275649b = continuation;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        this.f275648a.f275741q = com.tencent.maas.model.time.MJTime.ZeroTime;
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "PlaybackSession open failed: " + mJError.message);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f275649b.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
