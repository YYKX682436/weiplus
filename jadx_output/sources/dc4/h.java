package dc4;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.plugin.sns.ui.widget.l {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f228749o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ dc4.i f228750p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, dc4.i iVar, android.app.Activity activity, android.view.ViewGroup viewGroup) {
        super("AdCombineGridDetailItem", activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null, viewGroup);
        this.f228749o = snsInfo;
        this.f228750p = iVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        com.tencent.mm.plugin.sns.storage.m0 m0Var = snsInfo.getAdXml().adCombinedGridInfo;
        if (m0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        } else {
            c(new dc4.g(this.f228750p, m0Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        com.tencent.mm.plugin.sns.storage.SnsInfo lastModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo currentModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        kotlin.jvm.internal.o.g(lastModel, "lastModel");
        kotlin.jvm.internal.o.g(currentModel, "currentModel");
        boolean b17 = kotlin.jvm.internal.o.b(lastModel.getSnsId(), currentModel.getSnsId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        return b17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void s(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        kotlin.jvm.internal.o.g(model, "model");
        super.s(model);
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(model)) {
            dc4.i iVar = this.f228750p;
            if (dc4.i.m(iVar) > 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                int i17 = iVar.H;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                if (i17 > 0) {
                    com.tencent.mars.xlog.Log.i(j(), "showAdLivingStream onResume");
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
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f228749o)) {
            com.tencent.mars.xlog.Log.i(j(), "showAdLivingStream resetComponentState");
            dc4.i iVar = this.f228750p;
            dc4.i.o(iVar, 0);
            dc4.i.n(iVar, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2");
    }
}
