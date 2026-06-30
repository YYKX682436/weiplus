package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class d0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        super(false);
        this.f156660d = mobileRemitNumberInputUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "mSubmitBt click!");
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f156660d;
        mobileRemitNumberInputUI.doSceneProgress(new sw3.h(mobileRemitNumberInputUI.f156581m.getText(), "", mobileRemitNumberInputUI.f156586r.f381584n, !com.tencent.mm.sdk.platformtools.t8.K0(mobileRemitNumberInputUI.f156589u) ? 3 : 1), true);
        com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f62121d = 5;
        wCPayTransferToPhoneActionReportStruct.k();
    }
}
