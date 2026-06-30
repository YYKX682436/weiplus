package he0;

/* loaded from: classes4.dex */
public class m5 extends com.tencent.mm.sdk.event.n {
    public m5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        com.tencent.mm.autogen.events.ResendSnsEvent resendSnsEvent = (com.tencent.mm.autogen.events.ResendSnsEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        if (gm0.j1.a()) {
            long j17 = resendSnsEvent.f54706g.f8211a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ResendSnsListener", "try resend msg for SnsInfoId:%d", java.lang.Long.valueOf(j17));
            com.tencent.mm.sdk.platformtools.u3.h(new he0.l5(this, j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ResendSnsListener", "ResendSnsEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        return false;
    }
}
