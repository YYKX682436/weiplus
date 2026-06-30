package n34;

/* loaded from: classes12.dex */
public class t extends com.tencent.mm.sdk.event.n {
    public t() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        com.tencent.mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent extStartSnsServerAndCallbackOnFpSetSizeEvent = (com.tencent.mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "ExtStartSnsServerAndCallbackOnFpSetSizeEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        } else if (extStartSnsServerAndCallbackOnFpSetSizeEvent instanceof com.tencent.mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent) {
            com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
            am.s8 s8Var = extStartSnsServerAndCallbackOnFpSetSizeEvent.f54210g;
            Kj.w(s8Var.f7873a, s8Var.f7874b, new n34.s(this, extStartSnsServerAndCallbackOnFpSetSizeEvent));
            am.s8 s8Var2 = extStartSnsServerAndCallbackOnFpSetSizeEvent.f54210g;
            Kj.e(1, s8Var2.f7874b, s8Var2.f7875c, s8Var2.f7876d, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        return z17;
    }
}
