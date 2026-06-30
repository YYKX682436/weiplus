package gx0;

/* loaded from: classes5.dex */
public final class re extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f276931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(gx0.bf bfVar, com.tencent.maas.model.time.MJTimeRange mJTimeRange, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276930d = bfVar;
        this.f276931e = mJTimeRange;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.re(this.f276930d, this.f276931e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.re reVar = (gx0.re) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        reVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.bf bfVar = this.f276930d;
        kotlinx.coroutines.l.e(bfVar.f276252s, new gx0.qe(bfVar, this.f276931e, null));
        return jz5.f0.f302826a;
    }
}
