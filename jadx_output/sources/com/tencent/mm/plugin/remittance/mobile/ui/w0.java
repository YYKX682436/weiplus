package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class w0 implements com.tencent.mm.wallet_core.model.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI f156737a;

    public w0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI mobileRemitWelcomeUI) {
        this.f156737a = mobileRemitWelcomeUI;
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "showProtocalBottomDialog click next");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24835, 1, 2);
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI mobileRemitWelcomeUI = this.f156737a;
        j45.l.j(mobileRemitWelcomeUI.getContext(), "remittance", ".mobile.ui.MobileRemitNumberInputUI", mobileRemitWelcomeUI.getIntent(), null);
        mobileRemitWelcomeUI.finish();
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void onCancel() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24835, 1, 3);
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "showProtocalBottomDialog click cancel");
    }
}
