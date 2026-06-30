package gx0;

/* loaded from: classes5.dex */
public final class be extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f276246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.SynthSpecWrapper f276247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f276249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(gx0.bf bfVar, boolean z17, com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, com.tencent.maas.model.time.MJTime mJTime, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276245d = bfVar;
        this.f276246e = z17;
        this.f276247f = synthSpecWrapper;
        this.f276248g = mJTime;
        this.f276249h = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.be(this.f276245d, this.f276246e, this.f276247f, this.f276248g, this.f276249h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.be) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.bf bfVar = this.f276245d;
        if (!bfVar.m7() && this.f276246e) {
            com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - state is not ready to play. state:" + bfVar.f276255v.getValue());
            return java.lang.Boolean.FALSE;
        }
        try {
            gx0.bf bfVar2 = this.f276245d;
            z17 = ((java.lang.Boolean) kotlinx.coroutines.l.e(bfVar2.f276252s, new gx0.ae(bfVar2, this.f276247f, this.f276248g, this.f276249h, null))).booleanValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - failed:" + e17.getMessage(), e17);
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
