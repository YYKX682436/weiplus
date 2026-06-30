package qu2;

/* loaded from: classes12.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu2.o f366800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f366801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qu2.o oVar, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366800d = oVar;
        this.f366801e = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qu2.n(this.f366800d, this.f366801e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qu2.n nVar = (qu2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rh.c1 c17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qu2.o oVar = this.f366800d;
        oVar.f366804c = true;
        try {
            nh.c cVar = oVar.f366805d;
            if (cVar != null && (c17 = cVar.c()) != null) {
                c17.u(uh.g.class, new qu2.m(oVar, this.f366801e, c17));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PowerConsumptionEasyCollector", e17.toString());
        }
        return jz5.f0.f302826a;
    }
}
