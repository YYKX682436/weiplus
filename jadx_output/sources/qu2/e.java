package qu2;

/* loaded from: classes12.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu2.f f366764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f366765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qu2.f fVar, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366764d = fVar;
        this.f366765e = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qu2.e(this.f366764d, this.f366765e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qu2.e eVar = (qu2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rh.c1 c17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qu2.f fVar = this.f366764d;
        fVar.f366768c = true;
        try {
            nh.c cVar = fVar.f366769d;
            if (cVar != null && (c17 = cVar.c()) != null) {
                c17.u(uh.g.class, new qu2.d(fVar, c17, this.f366765e));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AvgPowerConsumeCollector", e17.toString());
        }
        return jz5.f0.f302826a;
    }
}
