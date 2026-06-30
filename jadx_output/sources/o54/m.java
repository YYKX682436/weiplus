package o54;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f343156d;

    public m(long j17) {
        this.f343156d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader$1");
        com.tencent.mars.xlog.Log.i("AdToolsProcessPreloader", "AdLandingPagesProxy connected, cost=" + (java.lang.System.currentTimeMillis() - this.f343156d));
        ((ku5.t0) ku5.t0.f312615d).q(new o54.l(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader$1");
    }
}
