package et4;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr4.b f256660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog, vr4.b bVar) {
        super(false);
        this.f256661e = wcPayCashierDialog;
        this.f256660d = bVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "click bank favor btn");
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256661e;
        wcPayCashierDialog.S = false;
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        vr4.b bVar = this.f256660d;
        wcPayCashierDialog.P = fj6.e(bVar.f439680d.f439805f);
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo g17 = com.tencent.mm.plugin.wallet_core.ui.h0.INSTANCE.a(wcPayCashierDialog.M).g(bVar.f439682f);
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "set favor info: %s", g17.f179667d);
        if (g17.f179667d.equals("0")) {
            wcPayCashierDialog.r();
        } else {
            wcPayCashierDialog.N = g17;
        }
        wcPayCashierDialog.t();
        wcPayCashierDialog.z();
        wcPayCashierDialog.x();
        wcPayCashierDialog.A();
        wcPayCashierDialog.B(8);
    }
}
