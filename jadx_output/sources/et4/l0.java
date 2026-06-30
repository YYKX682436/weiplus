package et4;

/* loaded from: classes9.dex */
public class l0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog f256642d;

    public l0(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog) {
        this.f256642d = wcPayCashierFingerprintDialog;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "dialog dismiss");
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog = this.f256642d;
        et4.q0 q0Var = wcPayCashierFingerprintDialog.f180227i;
        if (q0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "release fingerprint");
            q0Var.f256655c.cancel();
            ju5.n.c().b();
            q0Var.f256655c = null;
            wcPayCashierFingerprintDialog.f180227i = null;
        }
        wcPayCashierFingerprintDialog.f180228m = null;
    }
}
