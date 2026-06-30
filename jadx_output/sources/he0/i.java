package he0;

/* loaded from: classes.dex */
public class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        if (gm0.j1.a()) {
            gm0.j1.i();
            java.lang.String h17 = gm0.j1.u().h();
            java.lang.String D = lp0.b.D();
            com.tencent.mars.xlog.Log.i("MicroMsg.DumpSnsListener", "dump %s", D);
            com.tencent.mm.vfs.w6.h(D + "sns.dump");
            com.tencent.mm.vfs.w6.c(h17 + "SnsMicroMsg.db", D + "sns.dump");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.DumpSnsListener", "DumpSnsEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        return false;
    }
}
