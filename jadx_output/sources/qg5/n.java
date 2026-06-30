package qg5;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.p f363085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qg5.p pVar) {
        super(0);
        this.f363085d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int b17;
        qg5.p pVar = this.f363085d;
        vh0.o1 o1Var = (vh0.o1) ((jz5.n) pVar.f363123e).getValue();
        ((vh0.p3) ((vh0.o1) ((jz5.n) pVar.f363123e).getValue())).getClass();
        boolean z17 = false;
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.tos.RepairerConfigEnableYuanBaoUnifiedTosDebug()) == 1)) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("YuanBaoUnifiedTermsFeatAnalyzeChatMinVer", 1);
            }
            b17 = 1;
        } else if (kotlin.jvm.internal.o.b("YuanBaoUnifiedTermsFeatAnalyzeChatMinVer", "YuanBaoUnifiedTermsFeatAnalyzeChatMinVer")) {
            b17 = j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.tos.RepairerConfigYuanBaoUnifiedTosFeatureAnalyzeChatVersion());
        } else {
            if (kotlin.jvm.internal.o.b("YuanBaoUnifiedTermsFeatAnalyzeChatMinVer", "YuanBaoUnifiedTermsFeatSummarizeMinVer")) {
                b17 = j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.tos.RepairerConfigYuanBaoUnifiedTosFeatureSummarizeVersion());
            }
            b17 = 1;
        }
        com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo agreement = (com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo) ((jz5.n) pVar.f363127i).getValue();
        ((vh0.p3) o1Var).getClass();
        kotlin.jvm.internal.o.g(agreement, "agreement");
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "feature version: " + b17);
        if (agreement.f67870i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "never signed before, show agreement");
        } else if (agreement.f67871m >= b17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "signed version is greater than feature version, hide agreement");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "latest version: " + agreement.f67868g + ", feature version: " + b17 + ", signed: " + agreement.f67869h);
            z17 = agreement.f67869h;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
