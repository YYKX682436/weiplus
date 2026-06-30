package he0;

/* loaded from: classes4.dex */
public class v4 extends com.tencent.mm.sdk.event.n {
    public v4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        com.tencent.mm.autogen.events.OmitAllResendSnsEvent omitAllResendSnsEvent = (com.tencent.mm.autogen.events.OmitAllResendSnsEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        if (gm0.j1.a()) {
            java.util.ArrayList arrayList = omitAllResendSnsEvent.f54560g.f6686a;
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            Fj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.tencent.mm.plugin.sns.storage.p2 aj6 = com.tencent.mm.plugin.sns.model.l4.aj();
            long F = aj6.F(-1L);
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) it.next();
                    com.tencent.mm.plugin.sns.storage.SnsInfo i17 = Fj.i1((int) msgIdTalker.f149480d);
                    if (i17 != null) {
                        i17.setOmittedFailResend();
                        Fj.w3((int) msgIdTalker.f149480d, i17);
                    }
                }
                aj6.w(java.lang.Long.valueOf(F));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
            } catch (java.lang.Throwable th6) {
                aj6.w(java.lang.Long.valueOf(F));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                throw th6;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OmitAllResendSnsListener", "OmitAllResendSnsEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        return false;
    }
}
