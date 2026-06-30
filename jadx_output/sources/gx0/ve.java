package gx0;

/* loaded from: classes5.dex */
public final class ve extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277078d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f277079e;

    /* renamed from: f, reason: collision with root package name */
    public int f277080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f277081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f277082h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(gx0.bf bfVar, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277081g = bfVar;
        this.f277082h = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ve(this.f277081g, this.f277082h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ve) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277080f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f277081g.B;
            if (playbackSession == null) {
                com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - playbackSession is null");
                return null;
            }
            com.tencent.maas.model.time.MJTime mJTime = this.f277082h;
            this.f277078d = playbackSession;
            this.f277079e = mJTime;
            this.f277080f = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            playbackSession.snapshotAtTime(mJTime, new gx0.ue(nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
