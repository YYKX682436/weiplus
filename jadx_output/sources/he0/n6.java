package he0;

/* loaded from: classes4.dex */
public class n6 extends com.tencent.mm.sdk.event.n {
    public n6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TrigerAdReportListener", "triger snslogmgr try report");
            com.tencent.mm.plugin.sns.model.l4.Gj().i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.TrigerAdReportListener", "TrigerAdReportEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        return false;
    }
}
