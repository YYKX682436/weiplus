package he0;

/* loaded from: classes4.dex */
public class s5 extends com.tencent.mm.sdk.event.n {
    public s5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        if (gm0.j1.a()) {
            int i17 = com.tencent.mm.plugin.sns.model.l4.Y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dumpSnsFile", "com.tencent.mm.plugin.sns.model.SnsCore");
            if (com.tencent.mm.plugin.sns.model.l4.f164405x1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpSnsFile", "com.tencent.mm.plugin.sns.model.SnsCore");
            } else {
                com.tencent.mm.plugin.sns.model.l4.Sj().execute(new com.tencent.mm.plugin.sns.model.y4());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpSnsFile", "com.tencent.mm.plugin.sns.model.SnsCore");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsFileCollectListener", "SnsFileCollectEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        return false;
    }
}
