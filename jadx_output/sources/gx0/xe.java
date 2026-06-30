package gx0;

/* loaded from: classes5.dex */
public final class xe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f277180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f277181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f277182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f277183h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f277184i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(gx0.bf bfVar, com.tencent.maas.model.time.MJTime mJTime, int i17, com.tencent.maas.model.time.MJTimeRange mJTimeRange, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277180e = bfVar;
        this.f277181f = mJTime;
        this.f277182g = i17;
        this.f277183h = mJTimeRange;
        this.f277184i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.xe(this.f277180e, this.f277181f, this.f277182g, this.f277183h, this.f277184i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.xe) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime l17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277179d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f277180e.B;
                com.tencent.maas.moviecomposing.Timeline timeline = this.f277180e.E;
                com.tencent.maas.model.time.MJTime sub = (timeline == null || (l17 = timeline.l()) == null) ? null : l17.sub(new com.tencent.maas.model.time.MJTime(1L));
                if (playbackSession == null || sub == null) {
                    return java.lang.Boolean.FALSE;
                }
                this.f277180e.L = false;
                com.tencent.maas.model.time.MJTime b17 = this.f277181f.isValid() ? ou0.f.b(this.f277181f, sub) : this.f277180e.M;
                gx0.bf bfVar = this.f277180e;
                int i18 = bfVar.D;
                if (i18 <= 0) {
                    i18 = this.f277182g;
                }
                int i19 = i18;
                com.tencent.maas.model.time.MJTimeRange mJTimeRange = this.f277183h;
                com.tencent.maas.model.time.MJTimeRange mJTimeRange2 = mJTimeRange == null ? bfVar.C : mJTimeRange;
                kotlin.jvm.internal.o.d(mJTimeRange2);
                boolean z17 = this.f277184i;
                this.f277179d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                playbackSession.startPlaying(mJTimeRange2, b17, i19, z17, new ou0.t(nVar));
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
            yy0.m7 m7Var = (yy0.m7) this.f277180e.R6().O6();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.l4(m7Var, null), 3, null);
            gx0.bf bfVar2 = this.f277180e;
            bfVar2.getClass();
            com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
            bfVar2.M = InvalidTime;
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "startPlaying - failed:" + e17.getMessage(), e17);
            return java.lang.Boolean.FALSE;
        }
    }
}
