package gx0;

/* loaded from: classes5.dex */
public final class me extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276728d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276729e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276730f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f276731g;

    /* renamed from: h, reason: collision with root package name */
    public int f276732h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.SynthSpecWrapper f276733i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276734m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f276735n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276736o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, gx0.bf bfVar, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276733i = synthSpecWrapper;
        this.f276734m = bfVar;
        this.f276735n = timeline;
        this.f276736o = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.me(this.f276733i, this.f276734m, this.f276735n, this.f276736o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.me) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276732h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper = this.f276733i;
            gx0.bf bfVar = this.f276734m;
            com.tencent.maas.moviecomposing.Timeline timeline = this.f276735n;
            com.tencent.maas.model.time.MJTime mJTime = this.f276736o;
            this.f276728d = synthSpecWrapper;
            this.f276729e = bfVar;
            this.f276730f = timeline;
            this.f276731g = mJTime;
            this.f276732h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            if (synthSpecWrapper != null) {
                com.tencent.maas.moviecomposing.PlaybackSession playbackSession = bfVar.B;
                if (playbackSession != null) {
                    playbackSession.open(synthSpecWrapper, new gx0.je(synthSpecWrapper, rVar));
                }
            } else {
                com.tencent.maas.moviecomposing.PlaybackSession playbackSession2 = bfVar.B;
                if (playbackSession2 != null) {
                    playbackSession2.openWithTimeline(timeline, mJTime, new gx0.ke(rVar));
                }
            }
            rVar.m(new gx0.le(synthSpecWrapper, bfVar));
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
