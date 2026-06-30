package et4;

/* loaded from: classes9.dex */
public class c0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        super(false);
        this.f256606d = wcPayCashierDialog;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.f180198y0;
        this.f256606d.k();
    }
}
