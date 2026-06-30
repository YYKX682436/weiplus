package et4;

/* loaded from: classes9.dex */
public class k0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog f256640d;

    public k0(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog) {
        this.f256640d = wcPayCashierFingerprintDialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        et4.r0 r0Var = this.f256640d.f180228m;
        if (r0Var != null) {
            et4.u uVar = (et4.u) r0Var;
            uVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "verify canceled");
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = uVar.f256662a;
            wcPayCashierDialog.Q = true;
            wcPayCashierDialog.f180200d.setVisibility(0);
            wcPayCashierDialog.E = null;
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
            com.tencent.mm.wallet_core.model.a2.a(payInfo != null ? payInfo.f192109e : 0, payInfo == null ? "" : payInfo.f192114m, 24, "");
        }
    }
}
