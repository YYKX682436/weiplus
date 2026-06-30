package k84;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView f305057d;

    public i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView) {
        this.f305057d = adAttitudePlayView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$3");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f305057d.f163419d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        mMPAGView.n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$3");
    }
}
