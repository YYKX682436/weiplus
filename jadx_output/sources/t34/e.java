package t34;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI f415421d;

    public e(com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI snsAdAnimProxyUI) {
        this.f415421d = snsAdAnimProxyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$4");
        com.tencent.mars.xlog.Log.w("SnsAdAnimProxyUI", "enable back");
        t34.f fVar = com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.f162628m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        this.f415421d.f162632g = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$4");
    }
}
