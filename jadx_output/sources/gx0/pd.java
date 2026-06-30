package gx0;

/* loaded from: classes5.dex */
public final class pd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f276846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(gx0.bf bfVar, com.tencent.maas.model.time.MJTime mJTime, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276844d = bfVar;
        this.f276845e = mJTime;
        this.f276846f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.pd(this.f276844d, this.f276845e, this.f276846f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.pd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f276844d.B;
            if (playbackSession == null) {
                com.tencent.mars.xlog.Log.w("MovieComp.PlaybackControlUIC", "clipSkimTo - playbackSession is null");
                return java.lang.Boolean.FALSE;
            }
            playbackSession.clipSkimToTime(this.f276845e, this.f276846f);
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "clipSkimTo - failed:" + e17.getMessage(), e17);
            return java.lang.Boolean.FALSE;
        }
    }
}
