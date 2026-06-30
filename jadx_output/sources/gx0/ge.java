package gx0;

/* loaded from: classes5.dex */
public final class ge extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276470d = bfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ge(this.f276470d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.ge geVar = (gx0.ge) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        geVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (az0.i5.f15557a.t()) {
            com.tencent.maas.moviecomposing.PlaybackSession playbackSession = new com.tencent.maas.moviecomposing.PlaybackSession(new android.os.Handler(android.os.Looper.getMainLooper()));
            gx0.bf bfVar = this.f276470d;
            playbackSession.setMediaTimeChangeListener(new gx0.de(bfVar));
            playbackSession.setPlaybackFinishListener(new gx0.ee(bfVar));
            playbackSession.setPlaybackFailListener(gx0.fe.f276437a);
            bfVar.B = playbackSession;
        }
        return jz5.f0.f302826a;
    }
}
