package dc4;

/* loaded from: classes4.dex */
public class t implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.u f228816a;

    public t(dc4.u uVar) {
        this.f228816a = uVar;
    }

    @Override // b94.d
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$4");
        android.view.View view = this.f228816a.f228835h.f168418h;
        if (view != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdNormalSightDetailItem", "doOnShake, succ");
            view.performClick();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdNormalSightDetailItem", "doOnShake, clickView==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$4");
    }
}
