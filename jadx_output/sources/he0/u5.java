package he0;

/* loaded from: classes4.dex */
public class u5 extends com.tencent.mm.sdk.event.n {
    public u5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        com.tencent.mm.autogen.events.SnsImageDownloadedEvent snsImageDownloadedEvent = (com.tencent.mm.autogen.events.SnsImageDownloadedEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        if (snsImageDownloadedEvent instanceof com.tencent.mm.autogen.events.SnsImageDownloadedEvent) {
            am.yv yvVar = snsImageDownloadedEvent.f54816g;
            int i17 = yvVar.f8481a;
            com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195309m;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]start do download ", "[image-flow]", yvVar.f8482b.f377855d);
                ca4.s0 s0Var = new ca4.s0(yvVar.f8482b);
                s0Var.d(1);
                s0Var.e(yvVar.f8482b.f377855d);
                if (yvVar.f8482b.f377856e == 6) {
                    com.tencent.mm.plugin.sns.model.l4.Cj().d(yvVar.f8482b, 5, s0Var, s7Var);
                } else {
                    com.tencent.mm.plugin.sns.model.l4.Cj().d(yvVar.f8482b, 1, s0Var, s7Var);
                }
            } else if (i17 == 3) {
                java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), yvVar.f8483c) + ca4.z0.V(yvVar.f8483c);
                yvVar.f8484d = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]GENERATE_PATH:%s", "[image-flow]", yvVar.f8483c, str);
            } else if (i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]start do download big img", "[image-flow]", yvVar.f8482b.f377855d);
                ca4.s0 s0Var2 = new ca4.s0(yvVar.f8482b);
                s0Var2.d(3);
                s0Var2.e(yvVar.f8482b.f377855d);
                if (yvVar.f8482b.f377856e == 6) {
                    com.tencent.mm.plugin.sns.model.l4.Cj().d(yvVar.f8482b, 4, null, s7Var);
                } else {
                    com.tencent.mm.plugin.sns.model.l4.Cj().d(yvVar.f8482b, 2, s0Var2, s7Var);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        return false;
    }
}
