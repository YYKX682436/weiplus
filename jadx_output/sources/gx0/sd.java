package gx0;

/* loaded from: classes5.dex */
public final class sd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f276958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f276960h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(gx0.bf bfVar, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime mJTime, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276957e = bfVar;
        this.f276958f = timeline;
        this.f276959g = mJTime;
        this.f276960h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.sd(this.f276957e, this.f276958f, this.f276959g, this.f276960h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.sd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276956d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f276957e.f276256w == gx0.fd.f276432h) {
                com.tencent.mars.xlog.Log.w("MovieComp.PlaybackControlUIC", "commitUpdate - state is Playing");
                gx0.bf bfVar = this.f276957e;
                this.f276956d = 1;
                if (gx0.bf.t7(bfVar, false, this, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.maas.moviecomposing.Timeline timeline = this.f276958f;
        if (timeline != null) {
            this.f276957e.E = timeline;
        }
        com.tencent.maas.moviecomposing.Timeline timeline2 = this.f276957e.E;
        if (timeline2 == null) {
            timeline2 = this.f276958f;
        }
        if (timeline2 == null) {
            com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - timeline is null");
            return java.lang.Boolean.FALSE;
        }
        com.tencent.maas.moviecomposing.SynthSpecWrapper n17 = timeline2.n(this.f276958f != null);
        if (n17 == null) {
            return java.lang.Boolean.FALSE;
        }
        gx0.bf bfVar2 = this.f276957e;
        com.tencent.maas.model.time.MJTime mJTime = this.f276959g;
        boolean z17 = this.f276960h;
        this.f276956d = 2;
        bfVar2.getClass();
        obj = kotlinx.coroutines.l.g(bfVar2.f276253t, new gx0.be(bfVar2, true, n17, mJTime, z17, null), this);
        return obj == aVar ? aVar : obj;
    }
}
