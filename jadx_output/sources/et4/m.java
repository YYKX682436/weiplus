package et4;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256643d;

    public m(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        this.f256643d = wcPayCashierDialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256643d;
        wcPayCashierDialog.i(false, 0, true, wcPayCashierDialog.N);
        wcPayCashierDialog.setOnShowListener(null);
    }
}
