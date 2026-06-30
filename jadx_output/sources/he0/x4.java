package he0;

/* loaded from: classes4.dex */
public class x4 extends com.tencent.mm.sdk.event.n {
    public x4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent = (com.tencent.mm.autogen.events.OnlineVideoEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        com.tencent.mm.plugin.sns.model.i7 Pj = com.tencent.mm.plugin.sns.model.l4.Pj();
        com.tencent.mm.plugin.sns.model.z7 z7Var = Pj.f164308a;
        if (z7Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(z7Var.f164813b, onlineVideoEvent.f54588g.f6846c)) {
            am.hn hnVar = onlineVideoEvent.f54588g;
            if (hnVar.f6845b != 0) {
                Pj.w();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
            } else {
                int i17 = hnVar.f6844a;
                if (i17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoListener", "Moov ready: %s", hnVar.f6846c);
                    am.hn hnVar2 = onlineVideoEvent.f54588g;
                    z7Var.f164821j = hnVar2.f6847d;
                    z7Var.f164822k = hnVar2.f6848e;
                } else if (i17 == 5) {
                    z7Var.f164819h = hnVar.f6847d;
                    z7Var.f164820i = hnVar.f6848e;
                }
                int i18 = onlineVideoEvent.f54588g.f6844a;
                if (i18 == 4 || i18 == 6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.h7(Pj));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        return false;
    }
}
