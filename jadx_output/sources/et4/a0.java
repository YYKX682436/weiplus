package et4;

/* loaded from: classes9.dex */
public class a0 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256602a;

    public a0(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        this.f256602a = wcPayCashierDialog;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256602a;
        if (z17) {
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.e(wcPayCashierDialog, wcPayCashierDialog.f180208o.getText(), wcPayCashierDialog.L, wcPayCashierDialog.N);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 0, 0, 0, 0, 0, 0);
            return;
        }
        int pwdInputTextLength = wcPayCashierDialog.f180208o.getPwdInputTextLength();
        wcPayCashierDialog.f180208o.setContentDescription(wcPayCashierDialog.H.getString(com.tencent.mm.R.string.l3p, pwdInputTextLength + ""));
    }
}
