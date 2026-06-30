package et4;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f256612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ et4.i f256613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(et4.i iVar, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        super(false);
        this.f256613e = iVar;
        this.f256612d = bankcard;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f256612d;
        java.lang.String str = bankcard.field_bindSerial;
        et4.i iVar = this.f256613e;
        java.util.Iterator it = ((java.util.ArrayList) iVar.f256620h).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout wcPayCashierBankcardItemLayout = (com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout) it.next();
            if (wcPayCashierBankcardItemLayout == view) {
                wcPayCashierBankcardItemLayout.f180186g.setChecked(true);
            } else {
                wcPayCashierBankcardItemLayout.f180186g.setChecked(false);
            }
        }
        iVar.dismiss();
        et4.h hVar = iVar.f256631v;
        if (hVar != null) {
            et4.w wVar = (et4.w) hVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "on select bankcard: %s, %s", bankcard.field_bankName, bankcard.field_bindSerial);
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = wVar.f256666c;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = wcPayCashierDialog.P;
            if (bankcard2 == null || !bankcard.field_bindSerial.equals(bankcard2.field_bindSerial)) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
                com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 13, bankcard.field_bindSerial);
                wcPayCashierDialog.P = bankcard;
                wcPayCashierDialog.N = wVar.f256664a;
                wcPayCashierDialog.r();
                wcPayCashierDialog.t();
                wcPayCashierDialog.z();
                wcPayCashierDialog.x();
                wcPayCashierDialog.A();
                if (wcPayCashierDialog.S) {
                    com.tencent.mm.plugin.wallet_core.model.Orders orders = wcPayCashierDialog.M;
                    vr4.b bVar = orders.N.f439769w;
                    if (bVar != null && bVar.f439681e == 1 && bVar.f439680d != null) {
                        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo g17 = com.tencent.mm.plugin.wallet_core.ui.h0.INSTANCE.a(orders).g(wcPayCashierDialog.M.N.f439769w.f439682f);
                        if (wcPayCashierDialog.P == null || g17.f179667d.equals("0") || !g17.f179672i.contains(wcPayCashierDialog.P.field_bindSerial)) {
                            wcPayCashierDialog.B(0);
                        } else {
                            wcPayCashierDialog.B(8);
                        }
                    }
                }
                wcPayCashierDialog.B(8);
            }
            ((java.util.ArrayList) wcPayCashierDialog.f180219x0).remove(wcPayCashierDialog.F.f256632w);
            wcPayCashierDialog.F = null;
            wcPayCashierDialog.show();
        }
    }
}
