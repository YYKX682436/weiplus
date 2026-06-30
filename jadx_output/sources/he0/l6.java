package he0;

/* loaded from: classes4.dex */
public class l6 extends com.tencent.mm.sdk.event.n {
    public l6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.model.q6 q6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent = (com.tencent.mm.autogen.events.TranslateMessageResultEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        if (translateMessageResultEvent instanceof com.tencent.mm.autogen.events.TranslateMessageResultEvent) {
            am.kz kzVar = translateMessageResultEvent.f54905g;
            java.lang.String str = kzVar.f7196d;
            int i17 = kzVar.f7197e;
            java.util.HashMap hashMap = com.tencent.mm.plugin.sns.model.s6.f164679a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            java.util.Iterator it = com.tencent.mm.plugin.sns.model.s6.f164680b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    q6Var = null;
                    break;
                }
                q6Var = (com.tencent.mm.plugin.sns.model.q6) it.next();
                if (q6Var.f164619d == i17 && !com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(q6Var.f164616a) && str.equals(q6Var.f164616a)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    break;
                }
            }
            if (q6Var != null) {
                am.kz kzVar2 = translateMessageResultEvent.f54905g;
                q6Var.f164617b = kzVar2.f7195c;
                q6Var.f164618c = kzVar2.f7199g;
                com.tencent.mars.xlog.Log.i("MicroMsg.TranslateMessageResultEventListener", "finish translate, id:%s, type: %d, success: %b", q6Var.f164616a, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(r4)));
                int i18 = i17 != 2 ? i17 != 3 ? -1 : 2 : 1;
                if (i18 != -1) {
                    com.tencent.mm.plugin.sns.model.s6.i(str, i18, q6Var.f164617b, q6Var.f164618c);
                    com.tencent.mm.plugin.sns.model.s6.f164680b.remove(q6Var);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        return false;
    }
}
