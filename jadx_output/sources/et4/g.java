package et4;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et4.i f256615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(et4.i iVar) {
        super(false);
        this.f256615d = iVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        et4.i iVar = this.f256615d;
        iVar.dismiss();
        et4.h hVar = iVar.f256631v;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "on click add new bankcard");
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = ((et4.w) hVar).f256666c;
            ((java.util.ArrayList) wcPayCashierDialog.f180219x0).remove(wcPayCashierDialog.F.f256632w);
            wcPayCashierDialog.F = null;
            et4.g0 g0Var = wcPayCashierDialog.f180210p0;
            if (g0Var != null) {
                g0Var.a();
            }
            wcPayCashierDialog.dismiss();
        }
    }
}
