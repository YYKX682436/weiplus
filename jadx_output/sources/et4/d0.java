package et4;

/* loaded from: classes9.dex */
public class d0 extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256608e;

    public d0(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        this.f256608e = wcPayCashierDialog;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256608e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "click pay btn: %s", java.lang.Integer.valueOf(wcPayCashierDialog.f180199J));
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 20, "");
        wcPayCashierDialog.G();
        int i17 = wcPayCashierDialog.f180199J;
        if (i17 != 1) {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "wrong mode, switch pwd");
                wcPayCashierDialog.F(true);
                return;
            }
            wcPayCashierDialog.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "go to verify faceid");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15817, 3);
            wcPayCashierDialog.Q = false;
            re4.n.b();
            mz2.e1 e1Var = (mz2.e1) i95.n0.c(mz2.e1.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("face_auth_scene", 1);
            ((mz2.j2) e1Var).wi((com.tencent.mm.ui.MMActivity) wcPayCashierDialog.H, new et4.v(wcPayCashierDialog), bundle);
            wcPayCashierDialog.f180200d.setVisibility(8);
            return;
        }
        wcPayCashierDialog.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "go to verify fingerprint");
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog = wcPayCashierDialog.E;
        if (wcPayCashierFingerprintDialog != null) {
            wcPayCashierFingerprintDialog.dismiss();
        }
        re4.n.b();
        wcPayCashierDialog.Q = false;
        wcPayCashierDialog.E = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog(wcPayCashierDialog.getContext());
        java.lang.String str = wcPayCashierDialog.L.f192126y;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = wcPayCashierDialog.M.f179673J;
        }
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog2 = wcPayCashierDialog.E;
        java.lang.String str2 = wcPayCashierDialog.L.f192114m;
        wcPayCashierFingerprintDialog2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "set view data: %s", str2);
        et4.q0 q0Var = wcPayCashierFingerprintDialog2.f180227i;
        q0Var.f256653a = str2;
        q0Var.f256654b = str;
        wcPayCashierDialog.E.f180228m = new et4.u(wcPayCashierDialog);
        ((com.tencent.mm.ui.MMActivity) wcPayCashierDialog.H).mo133getLifecycle().a(wcPayCashierDialog.E);
        wcPayCashierDialog.E.show();
        wcPayCashierDialog.f180200d.setVisibility(8);
        com.tencent.mm.wallet_core.ui.r1.q0(9, 1);
    }
}
