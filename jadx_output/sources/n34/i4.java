package n34;

/* loaded from: classes4.dex */
public final class i4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListUIC f334634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334634d = snsStarListUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.SnsStarListUIC$showEndFooterView$2");
        n34.i4 i4Var = new n34.i4(this.f334634d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.SnsStarListUIC$showEndFooterView$2");
        return i4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListUIC$showEndFooterView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListUIC$showEndFooterView$2");
        java.lang.Object invokeSuspend = ((n34.i4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListUIC$showEndFooterView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListUIC$showEndFooterView$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsStarListUIC$showEndFooterView$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setLoadFinish$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = this.f334634d;
        snsStarListUIC.f162553s = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setLoadFinish$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.LoadingMoreView loadingMoreView = snsStarListUIC.f162542e;
        if (loadingMoreView != null) {
            loadingMoreView.b(0, "");
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsStarListUIC$showEndFooterView$2");
        return f0Var;
    }
}
