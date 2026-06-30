package et4;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog f256646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog) {
        super(false);
        this.f256646d = wcPayCashierFingerprintDialog;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "click switch payway");
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog = this.f256646d;
        wcPayCashierFingerprintDialog.dismiss();
        et4.r0 r0Var = wcPayCashierFingerprintDialog.f180228m;
        if (r0Var != null) {
            et4.u uVar = (et4.u) r0Var;
            uVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "switch pay way");
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = uVar.f256662a;
            wcPayCashierDialog.Q = true;
            wcPayCashierDialog.f180200d.setVisibility(0);
            wcPayCashierDialog.E = null;
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.c(wcPayCashierDialog);
        }
    }
}
