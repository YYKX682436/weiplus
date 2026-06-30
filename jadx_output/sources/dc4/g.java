package dc4;

/* loaded from: classes4.dex */
public final class g implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.i f228747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.m0 f228748b;

    public g(dc4.i iVar, com.tencent.mm.plugin.sns.storage.m0 m0Var) {
        this.f228747a = iVar;
        this.f228748b = m0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1");
        dc4.i iVar = this.f228747a;
        android.app.Activity p17 = iVar.p();
        int i17 = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR;
        dc4.i.o(iVar, i65.a.b(p17, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR));
        dc4.i.n(iVar, i65.a.b(iVar.p(), 132));
        boolean z18 = iVar.f228839o;
        com.tencent.mm.plugin.sns.storage.m0 m0Var = this.f228748b;
        if (z18) {
            i17 = 396;
            dc4.i.o(iVar, i65.a.b(iVar.p(), 396));
            dc4.i.n(iVar, i65.a.b(iVar.p(), com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT));
        } else if (m0Var.b() == 1) {
            i17 = 248;
            dc4.i.o(iVar, i65.a.b(iVar.p(), 248));
            dc4.i.n(iVar, i65.a.b(iVar.p(), 140));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        android.view.ViewGroup viewGroup = iVar.f228758v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        int width = viewGroup != null ? viewGroup.getWidth() : 0;
        if (width != 0 && width < i65.a.b(iVar.p(), i17)) {
            dc4.i.o(iVar, width);
            dc4.i.n(iVar, (int) ((dc4.i.m(iVar) * 132.0f) / 233.0f));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMViewLogic", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            r74.a0 a0Var = iVar.f228762z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMViewLogic", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            if (a0Var != null) {
                a0Var.k(m0Var, new dc4.f(iVar));
            }
        }
        android.view.View itemRootView = iVar.f228836i;
        kotlin.jvm.internal.o.f(itemRootView, "itemRootView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        r45.jj4 r17 = iVar.r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        int m17 = dc4.i.m(iVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        int i18 = iVar.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        dc4.i.l(iVar, itemRootView, r17, m17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1");
    }
}
