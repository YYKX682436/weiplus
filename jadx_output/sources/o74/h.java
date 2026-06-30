package o74;

/* loaded from: classes4.dex */
public class h implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f343570a;

    public h(o74.j jVar, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f343570a = baseViewHolder;
    }

    @Override // b94.d
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$4");
        android.view.View view = this.f343570a.f169269f0.f168418h;
        if (view != null) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "doOnShake, succ");
            view.performClick();
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "doOnShake, clickView==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$4");
    }
}
