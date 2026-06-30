package k84;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.f f305011d;

    public e(k84.f fVar) {
        this.f305011d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5$1");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView.c(this.f305011d.f305025d).n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5$1");
    }
}
