package qg5;

/* loaded from: classes5.dex */
public final class l2 extends com.tencent.mm.sdk.event.n {
    public l2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.uq uqVar = event.f54679g;
        java.lang.String str = uqVar != null ? uqVar.f8126b : null;
        new com.tencent.mm.repairer.config.yuanbao.tos.RepairerConfigResetYuanBaoCopyTos();
        if (!kotlin.jvm.internal.o.b(str, "RepairerConfig_ResetYuanBaoCopyTos")) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("yuanbao_chat_records_feature_service");
        M.putBoolean("yuanbao_copy_agreed", false);
        M.remove("yuanbao_copy_agreed");
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("yuanbao_forward_chat_records_feature_service");
        M2.putBoolean("yuanbao_forward_agreed", false);
        M2.remove("yuanbao_forward_agreed");
        return true;
    }
}
