package dc4;

/* loaded from: classes4.dex */
public class c0 implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f228722a;

    public c0(dc4.d0 d0Var) {
        this.f228722a = d0Var;
    }

    @Override // b94.d
    public void a() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$7");
        dc4.d0 d0Var = this.f228722a;
        d0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnShake", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        try {
            if (d0Var.f228835h.f168418h.getVisibility() == 0) {
                view = d0Var.f228835h.f168418h;
                com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailItemView", "doOnShake, sight");
            } else if (d0Var.f228739y.getVisibility() == 0) {
                view = d0Var.f228739y;
                com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailItemView", "doOnShake, img");
            } else {
                view = null;
            }
            if (view != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailItemView", "doOnShake, succ");
                view.performClick();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailItemView", "doOnShake, clickView==null");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailItemView", "doOnShake, exp=" + e17);
            ca4.q.c("doOnShake, cardAdDetail", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnShake", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$7");
    }
}
