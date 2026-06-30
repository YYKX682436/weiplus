package qg5;

/* loaded from: classes5.dex */
public final class n2 extends com.tencent.mm.sdk.event.n {
    public n2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.uq uqVar = event.f54679g;
        java.lang.String str = uqVar != null ? uqVar.f8126b : null;
        new com.tencent.mm.repairer.config.yuanbao.tos.RepairerConfigResetYuanBaoSummarizeTos();
        if (!kotlin.jvm.internal.o.b(str, "RepairerConfig_ResetYuanBaoSummarizeTos")) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("yuanbao_chat_records_feature_service");
        M.putBoolean("yuanbao_summarize_agreed", false);
        M.remove("yuanbao_summarize_agreed");
        return true;
    }
}
