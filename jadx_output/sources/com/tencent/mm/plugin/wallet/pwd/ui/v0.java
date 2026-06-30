package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class v0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI f179091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI) {
        super(false);
        this.f179091d = walletIdCardCheckUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        boolean z17;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI = this.f179091d;
        if (walletIdCardCheckUI.f178898d.c(walletIdCardCheckUI.f178899e)) {
            z17 = true;
        } else {
            walletIdCardCheckUI.f178899e.setText(com.tencent.mm.R.string.kia);
            walletIdCardCheckUI.f178899e.setTextColor(walletIdCardCheckUI.getResources().getColor(com.tencent.mm.R.color.a2y));
            z17 = false;
        }
        if (z17) {
            walletIdCardCheckUI.f178899e.setVisibility(4);
        } else {
            db5.e1.y(walletIdCardCheckUI.getContext(), walletIdCardCheckUI.getContext().getString(com.tencent.mm.R.string.kia), "", walletIdCardCheckUI.getContext().getString(com.tencent.mm.R.string.kmf), new com.tencent.mm.plugin.wallet.pwd.ui.z0(walletIdCardCheckUI));
        }
        walletIdCardCheckUI.f178899e.setVisibility(4);
        if (z17) {
            com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct.f62116d = 1L;
            wCPaySaftyClickReportStruct.f62117e = 1L;
            wCPaySaftyClickReportStruct.k();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 2);
            walletIdCardCheckUI.doSceneProgress(new com.tencent.mm.wallet_core.model.t0(walletIdCardCheckUI.f178898d.getText(), walletIdCardCheckUI.f178903i, ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q(), com.tencent.mm.wallet_core.model.p1.c().f213981f));
        }
    }
}
