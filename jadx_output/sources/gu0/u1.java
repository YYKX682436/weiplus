package gu0;

/* loaded from: classes5.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275818d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275819e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f275820f;

    /* renamed from: g, reason: collision with root package name */
    public int f275821g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275822h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275822h = k2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.u1(this.f275822h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.Timeline timeline;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f275821g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                gu0.k2 k2Var = this.f275822h;
                com.tencent.maas.moviecomposing.PlaybackSession playbackSession = k2Var.f275738n;
                if (playbackSession == null || (timeline = k2Var.f275737m) == null) {
                    return f0Var;
                }
                com.tencent.maas.model.time.MJTimeRange fromStartEnd = com.tencent.maas.model.time.MJTimeRange.fromStartEnd(com.tencent.maas.model.time.MJTime.ZeroTime, timeline.l());
                kotlin.jvm.internal.o.f(fromStartEnd, "fromStartEnd(...)");
                this.f275818d = playbackSession;
                this.f275819e = fromStartEnd;
                this.f275820f = k2Var;
                this.f275821g = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                playbackSession.startPlaying(fromStartEnd, k2Var.f275741q, Integer.MAX_VALUE, true, new gu0.t1(nVar));
                if (nVar.a() == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "resumePlayback: " + e17.getMessage());
        }
        return f0Var;
    }
}
