package qg5;

/* loaded from: classes8.dex */
public final class w5 extends com.tencent.mm.sdk.event.n {
    public w5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.uq uqVar = event.f54679g;
        java.lang.String str = uqVar != null ? uqVar.f8126b : null;
        new com.tencent.mm.repairer.config.yuanbao.tos.RepairerConfigRevokeYuanBaoUnifiedTos();
        if (!kotlin.jvm.internal.o.b(str, "RepairerConfig_ResetYuanBaoUnifiedTos")) {
            return false;
        }
        vh0.p3 p3Var = (vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class));
        com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo agreement = p3Var.bj(false);
        kotlin.jvm.internal.o.g(agreement, "agreement");
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "revoke unified agreement");
        ((vh0.f2) ((vh0.d1) ((jz5.n) p3Var.f436938m).getValue())).Di("yuanbao_unified_scene", new com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo(agreement.f67865d, agreement.f67866e, agreement.f67867f, agreement.f67868g, agreement.f67869h, agreement.f67870i), false);
        return true;
    }
}
