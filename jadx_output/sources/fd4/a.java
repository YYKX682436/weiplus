package fd4;

/* loaded from: classes4.dex */
public class a implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.c f261284a;

    public a(fd4.c cVar) {
        this.f261284a = cVar;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$1");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("ad_no_click_anim", false);
        this.f261284a.r(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$1");
        android.view.View view = this.f261284a.f261289f.f425165z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$1");
        return view;
    }
}
