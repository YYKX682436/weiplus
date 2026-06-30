package v74;

/* loaded from: classes4.dex */
public final class f0 implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f433779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f433780b;

    public f0(v74.k0 k0Var, android.view.View view) {
        this.f433779a = k0Var;
        this.f433780b = view;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$onItemClick$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnPrepareOpenCanvasAnimListener$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        v74.u uVar = this.f433779a.f433840f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnPrepareOpenCanvasAnimListener$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        if (uVar != null) {
            uVar.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$onItemClick$1$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$onItemClick$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$onItemClick$1$1");
        return this.f433780b;
    }
}
