package gx0;

/* loaded from: classes5.dex */
public final class ze extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277286d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f277288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277288f = bfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        gx0.ze zeVar = new gx0.ze(this.f277288f, continuation);
        zeVar.f277287e = obj;
        return zeVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ze) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277286d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f277288f.B;
                if (playbackSession == null) {
                    com.tencent.mars.xlog.Log.w("MovieComp.PlaybackControlUIC", "stopPlaying - playbackSession is null");
                    return java.lang.Boolean.FALSE;
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f277286d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                playbackSession.stopPlaying(new ou0.u(nVar));
                java.lang.Object a17 = nVar.a();
                if (a17 != aVar) {
                    a17 = jz5.f0.f302826a;
                }
                if (a17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return kotlin.Result.m527isFailureimpl(m521constructorimpl) ? java.lang.Boolean.FALSE : m521constructorimpl;
    }
}
