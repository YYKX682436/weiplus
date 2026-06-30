package vc4;

/* loaded from: classes4.dex */
public final class q implements le0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc4.p f435302b;

    public q(com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter, xc4.p pVar) {
        this.f435301a = improveItemFooter;
        this.f435302b = pVar;
    }

    @Override // le0.s
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadItemErrorTipView$4");
        xc4.p pVar = this.f435302b;
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.e(this.f435301a, "MicroMsg.Improve.ItemFooter", "click urlLinks ".concat(pVar.W0()));
        if (pVar.isSecurityNeedVerifyDieItem()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo currentInfo = pVar.c1();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentSecuritySnsInfo", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
            kotlin.jvm.internal.o.g(currentInfo, "currentInfo");
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", "setCurrentSecuritySnsInfo >> " + currentInfo.getLocalid());
            mc4.c.f325646b = currentInfo;
            mc4.c.f325648d = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentSecuritySnsInfo", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadItemErrorTipView$4");
    }
}
