package et4;

/* loaded from: classes9.dex */
public class x implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256667d;

    public x(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        this.f256667d = wcPayCashierDialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "on canceled");
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256667d;
        wcPayCashierDialog.Z = true;
        et4.g0 g0Var = wcPayCashierDialog.f180210p0;
        if (g0Var != null) {
            g0Var.onCancel();
        }
    }
}
