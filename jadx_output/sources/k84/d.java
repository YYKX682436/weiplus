package k84;

/* loaded from: classes4.dex */
public class d implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView f304990d;

    public d(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView) {
        this.f304990d = adAttitudeAttractView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$4");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView = this.f304990d;
        adAttitudeAttractView.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView.d(adAttitudeAttractView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$4");
        return true;
    }
}
