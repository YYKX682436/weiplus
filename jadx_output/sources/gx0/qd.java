package gx0;

/* loaded from: classes5.dex */
public final class qd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f276890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(gx0.bf bfVar, com.tencent.maas.model.time.MJTime mJTime, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276888d = bfVar;
        this.f276889e = mJTime;
        this.f276890f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.qd(this.f276888d, this.f276889e, this.f276890f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.qd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.bf bfVar = this.f276888d;
        if (!bfVar.m7()) {
            com.tencent.mars.xlog.Log.w("MovieComp.PlaybackControlUIC", "clipSkimTo - not ready to play");
            return java.lang.Boolean.FALSE;
        }
        return kotlinx.coroutines.l.e(bfVar.f276252s, new gx0.pd(bfVar, this.f276889e, this.f276890f, null));
    }
}
