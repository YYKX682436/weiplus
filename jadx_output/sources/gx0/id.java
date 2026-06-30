package gx0;

/* loaded from: classes5.dex */
public final class id implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f276541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.VideoClipWrapper f276543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f276544d;

    public id(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, gx0.bf bfVar, com.tencent.maas.moviecomposing.VideoClipWrapper videoClipWrapper, kotlin.coroutines.Continuation continuation) {
        this.f276541a = clipSegment;
        this.f276542b = bfVar;
        this.f276543c = videoClipWrapper;
        this.f276544d = continuation;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.coroutines.Continuation continuation = this.f276544d;
        com.tencent.maas.moviecomposing.VideoClipWrapper videoClipWrapper = this.f276543c;
        gx0.bf bfVar = this.f276542b;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f276541a;
        if (mJError == null) {
            com.tencent.mars.xlog.Log.i("MovieComp.PlaybackControlUIC", "onComplete: clipSegment = " + clipSegment.C() + ", beginClipSkimming success");
            bfVar.L = true;
            videoClipWrapper.a();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            return;
        }
        com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "onComplete: clipSegment = " + clipSegment.f48532a + ", beginClipSkimming mjError " + mJError.f48175ec.getErrorCode() + ", " + mJError.message);
        bfVar.L = false;
        videoClipWrapper.a();
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }
}
