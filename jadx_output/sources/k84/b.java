package k84;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView f304947d;

    public b(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView) {
        this.f304947d = adAttitudeAttractView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView.c(this.f304947d).g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$2");
    }
}
