package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class v0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI f156731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI mobileRemitWelcomeUI) {
        super(false);
        this.f156731d = mobileRemitWelcomeUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "goto MobileRemitNumberInputUI");
        int i17 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI.f156611d;
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI mobileRemitWelcomeUI = this.f156731d;
        byte[] byteArrayExtra = mobileRemitWelcomeUI.getIntent().getByteArrayExtra("key_compliance_item ");
        r45.d70 d70Var = new r45.d70();
        try {
            d70Var.parseFrom(byteArrayExtra);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24835, 1, 1);
            com.tencent.mm.wallet_core.ui.r1.z0(mobileRemitWelcomeUI.getContext(), d70Var.f372192e, d70Var.f372191d, d70Var.f372193f, new com.tencent.mm.plugin.remittance.mobile.ui.w0(mobileRemitWelcomeUI));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "pars error :%s", e17.toString());
            db5.e1.y(mobileRemitWelcomeUI.getContext(), mobileRemitWelcomeUI.getContext().getString(com.tencent.mm.R.string.l0g), "", mobileRemitWelcomeUI.getContext().getString(com.tencent.mm.R.string.ke6), new com.tencent.mm.plugin.remittance.mobile.ui.x0(mobileRemitWelcomeUI));
        }
    }
}
