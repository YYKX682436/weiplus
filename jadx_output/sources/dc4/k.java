package dc4;

/* loaded from: classes4.dex */
public final class k implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.p f228766a;

    public k(dc4.p pVar) {
        this.f228766a = pVar;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$initView$3");
        dc4.p pVar = this.f228766a;
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickListener", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickListener", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = pVar.f228799r;
        if (iVar != null) {
            iVar.J(pVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$initView$3");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$initView$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$initView$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$initView$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$initView$3");
        return null;
    }
}
