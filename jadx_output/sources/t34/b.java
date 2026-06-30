package t34;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI f415417d;

    public b(com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI snsAdAnimProxyUI) {
        this.f415417d = snsAdAnimProxyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$1");
        com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI snsAdAnimProxyUI = this.f415417d;
        if (!snsAdAnimProxyUI.isFinishing()) {
            snsAdAnimProxyUI.finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$1");
    }
}
