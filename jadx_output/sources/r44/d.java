package r44;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f369554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r44.f f369555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f369556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r44.f fVar, com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f369555e = fVar;
        this.f369556f = improveDataUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
        r44.d dVar = new r44.d(this.f369555e, this.f369556f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
        ((r44.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
        pz5.a aVar2 = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
        return aVar2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = this.f369556f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f369554d;
        r44.f fVar = this.f369555e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i(r44.f.P6(fVar), "before collect");
                kotlinx.coroutines.flow.n2 n2Var = improveDataUIC.S6().f152072v;
                r44.c cVar = new r44.c(fVar, improveDataUIC);
                this.f369554d = 1;
                kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) n2Var;
                q2Var.getClass();
                if (kotlinx.coroutines.flow.q2.l(q2Var, cVar, this) == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            jz5.d dVar = new jz5.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
            throw dVar;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i(r44.f.P6(fVar), "after collect");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$observeUIRefresh$1");
            throw th6;
        }
    }
}
