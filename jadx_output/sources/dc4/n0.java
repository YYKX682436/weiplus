package dc4;

/* loaded from: classes4.dex */
public class n0 implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.o0 f228783a;

    public n0(dc4.o0 o0Var) {
        this.f228783a = o0Var;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
        dc4.o0 o0Var = this.f228783a;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = o0Var.f228838n;
        if (iVar != null) {
            iVar.J(o0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView = this.f228783a.f228790t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
        return adSlideRecyclerView;
    }
}
