package et4;

/* loaded from: classes9.dex */
public class r extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256658e;

    public r(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        this.f256658e = wcPayCashierDialog;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256658e;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 12, "");
        wcPayCashierDialog.hide();
        com.tencent.mm.plugin.wallet_core.ui.m4 m4Var = wcPayCashierDialog.G;
        if (m4Var == null) {
            wcPayCashierDialog.G = com.tencent.mm.plugin.wallet_core.ui.m4.c(wcPayCashierDialog.getContext(), wcPayCashierDialog.M, wcPayCashierDialog.N.f179667d, new et4.p(this), new et4.q(this));
        } else {
            m4Var.dismiss();
            wcPayCashierDialog.G = null;
        }
    }
}
