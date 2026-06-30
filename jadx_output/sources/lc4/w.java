package lc4;

/* loaded from: classes4.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f317993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f317994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f317995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f317994e = improveDataUIC;
        this.f317995f = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
        lc4.w wVar = new lc4.w(this.f317994e, this.f317995f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
        return wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
        java.lang.Object invokeSuspend = ((lc4.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f317993d;
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = this.f317994e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            lc4.d dVar = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168761r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOnlineRepository$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository snsInfoImproveOnlineRepository = improveDataUIC.f168769g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOnlineRepository$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            this.f317993d = 1;
            snsInfoImproveOnlineRepository.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFirstPageRequest", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataFlow", "doFirstPageRequest");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setRefreshContinuation$p", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
            snsInfoImproveOnlineRepository.f169107f = rVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setRefreshContinuation$p", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
            rVar.m(zc4.i.f471438d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getServer$p", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
            com.tencent.mm.plugin.sns.model.d6 d6Var = snsInfoImproveOnlineRepository.f169106e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getServer$p", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
            d6Var.e(1, "", false, false, 0);
            j17 = rVar.j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFirstPageRequest", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        int intValue = ((java.lang.Number) j17).intValue();
        this.f317995f.f310116d = intValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "refresh net result count:" + intValue);
        if (intValue > 0 && !com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.P6(improveDataUIC).a7()) {
            n34.h3 h3Var = n34.h3.f334610d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCacheData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFinderPostManager", "clearCacheData: ");
            n34.h3.f334611e.clear();
            java.util.HashMap hashMap = n34.h3.f334612f;
            for (jz5.l lVar : kz5.e1.v(hashMap)) {
                ((wu5.c) lVar.f302834e).cancel(false);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFinderPostManager", "cancel " + ((java.lang.String) lVar.f302833d));
            }
            hashMap.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCacheData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            improveDataUIC.S6().f152058e.f455359d = intValue;
            com.tencent.mm.plugin.mvvmlist.MvvmList.r(improveDataUIC.S6(), null, 1, null);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
        return f0Var;
    }
}
