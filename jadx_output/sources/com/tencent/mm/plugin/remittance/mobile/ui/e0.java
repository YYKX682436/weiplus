package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class e0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        super(false);
        this.f156663d = mobileRemitNumberInputUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "history click!");
        int i17 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI.f156574v;
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f156663d;
        mobileRemitNumberInputUI.getClass();
        mobileRemitNumberInputUI.doSceneProgress(new sw3.f("", mobileRemitNumberInputUI.f156586r.f381584n), true);
        com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f62121d = 12;
        wCPayTransferToPhoneActionReportStruct.k();
    }
}
