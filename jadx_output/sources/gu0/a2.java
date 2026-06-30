package gu0;

/* loaded from: classes5.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp0.q0 f275624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(pp0.q0 q0Var, gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275624d = q0Var;
        this.f275625e = k2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.a2(this.f275624d, this.f275625e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((yy0.k8) this.f275624d).getClass();
        if (!az0.i5.f15557a.t()) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "setupPlayback: MaasCore not inited, skip PlaybackSession creation");
            return null;
        }
        com.tencent.maas.moviecomposing.PlaybackSession playbackSession = new com.tencent.maas.moviecomposing.PlaybackSession(new android.os.Handler(android.os.Looper.getMainLooper()));
        playbackSession.setMediaTimeChangeListener(new gu0.y1(this.f275625e));
        playbackSession.setPlaybackFinishListener(gu0.z1.f275866a);
        return playbackSession;
    }
}
