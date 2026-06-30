package he0;

/* loaded from: classes4.dex */
public class p4 extends com.tencent.mm.sdk.event.n {
    public p4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        com.tencent.mm.autogen.events.GetAllNeedResendSnsEvent getAllNeedResendSnsEvent = (com.tencent.mm.autogen.events.GetAllNeedResendSnsEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        if (gm0.j1.a()) {
            am.ff ffVar = getAllNeedResendSnsEvent.f54378g;
            com.tencent.mm.plugin.sns.model.l4.Fj().f1();
            ffVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetAllNeedResendSnsListener", "GetAllNeedResendSnsEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        return false;
    }
}
