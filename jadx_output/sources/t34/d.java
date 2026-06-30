package t34;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f415419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI f415420e;

    public d(com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI snsAdAnimProxyUI, int i17) {
        this.f415420e = snsAdAnimProxyUI;
        this.f415419d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$3");
        com.tencent.mars.xlog.Log.e("SnsAdAnimProxyUI", "protectFinish run, maxLifeDuration=" + this.f415419d);
        com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI snsAdAnimProxyUI = this.f415420e;
        if (!snsAdAnimProxyUI.isFinishing()) {
            com.tencent.mars.xlog.Log.e("SnsAdAnimProxyUI", "do protect finish activity");
            com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.T6(13);
            snsAdAnimProxyUI.finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$3");
    }
}
