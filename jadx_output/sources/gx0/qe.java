package gx0;

/* loaded from: classes5.dex */
public final class qe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f276892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(gx0.bf bfVar, com.tencent.maas.model.time.MJTimeRange mJTimeRange, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276891d = bfVar;
        this.f276892e = mJTimeRange;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.qe(this.f276891d, this.f276892e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.qe) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f276891d.B;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (playbackSession == null) {
            com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - playbackSession is null");
            return f0Var;
        }
        playbackSession.updatePlaybackOptions(this.f276892e, 999999, true);
        return f0Var;
    }
}
