package ed4;

/* loaded from: classes4.dex */
public class g implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.l f251298a;

    public g(com.tencent.mm.plugin.sns.ui.item.l lVar) {
        this.f251298a = lVar;
    }

    @Override // b94.d
    public void a() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$6");
        com.tencent.mm.plugin.sns.ui.item.l lVar = this.f251298a;
        lVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnShake", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        try {
            if (lVar.f169370q.f169269f0.f168418h.getVisibility() == 0) {
                view = lVar.f169370q.f169269f0.f168418h;
                com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "doOnShake, sight");
            } else if (lVar.f169370q.G0.getVisibility() == 0) {
                view = lVar.f169370q.G0;
                com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "doOnShake, img");
            } else {
                view = null;
            }
            if (view != null) {
                com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "doOnShake, succ");
                view.performClick();
            } else {
                com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "doOnShake, clickView==null");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "doOnShake, exp=" + e17);
            ca4.q.c("doOnShake, cardAd", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnShake", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$6");
    }
}
