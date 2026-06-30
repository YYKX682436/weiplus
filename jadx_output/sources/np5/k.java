package np5;

/* loaded from: classes9.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f338839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f338840e;

    public k(com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f338839d = m1Var;
        this.f338840e = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.m1 m1Var = this.f338839d;
        java.lang.String str = m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.p ? ((com.tencent.mm.wallet_core.tenpay.model.p) m1Var).f214064v : "";
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f338840e;
        if (!K0) {
            com.tencent.mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct wCPayResetPwdClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct();
            wCPayResetPwdClickReportStruct.f62114d = 1L;
            wCPayResetPwdClickReportStruct.f62115e = 2L;
            wCPayResetPwdClickReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletErrMgr", "jump to forget_url %s", str);
            com.tencent.mm.wallet_core.ui.r1.V(walletBaseUI, str, false);
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct wCPayResetPwdClickReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct();
        wCPayResetPwdClickReportStruct2.f62114d = 1L;
        wCPayResetPwdClickReportStruct2.f62115e = 1L;
        wCPayResetPwdClickReportStruct2.k();
        if (c01.z1.I()) {
            com.tencent.mm.wallet_core.a.k(walletBaseUI, "wallet_payu", "PayUForgotPwdProcess", null, null);
        } else {
            com.tencent.mm.wallet_core.b.a().getClass();
            ((h45.q) i95.n0.c(h45.q.class)).startResetPwdUseCase(walletBaseUI, null);
        }
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
