package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f171425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.w f171426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.sns.ui.wsfold.w wVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f171426e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
        com.tencent.mm.plugin.sns.ui.wsfold.s sVar = new com.tencent.mm.plugin.sns.ui.wsfold.s(this.f171426e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
        return sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.wsfold.s) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171425d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "refresh start");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setRequestLastFeedId$p", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
            com.tencent.mm.plugin.sns.ui.wsfold.w wVar = this.f171426e;
            wVar.f171447e = 0L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setRequestLastFeedId$p", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
            wVar.T6().k(false);
            wVar.T6().f152058e.f455361f = com.tencent.mm.plugin.sns.ui.wsfold.w.P6(wVar);
            com.tencent.mm.plugin.mvvmlist.MvvmList T6 = wVar.T6();
            this.f171425d = 1;
            xm3.n0 n0Var = T6.f152058e;
            T6.getClass();
            if (com.tencent.mm.plugin.mvvmlist.MvvmList.C(T6, n0Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "refresh finish");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$refresh$1");
        return f0Var;
    }
}
