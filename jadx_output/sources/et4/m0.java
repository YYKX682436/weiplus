package et4;

/* loaded from: classes9.dex */
public class m0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog f256644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog) {
        super(false);
        this.f256644d = wcPayCashierFingerprintDialog;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "click back icon");
        this.f256644d.cancel();
    }
}
