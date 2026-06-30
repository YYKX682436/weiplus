package et4;

/* loaded from: classes9.dex */
public class p implements com.tencent.mm.plugin.wallet_core.ui.k4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ et4.r f256650a;

    public p(et4.r rVar) {
        this.f256650a = rVar;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.k4
    public void a(com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "on select favor: %s", favorPayInfo.f179667d);
        et4.r rVar = this.f256650a;
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = rVar.f256658e;
        wcPayCashierDialog.G = null;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 15, favorPayInfo.f179667d);
        java.util.List h17 = com.tencent.mm.plugin.wallet_core.ui.g0.h(favorPayInfo.f179668e, favorPayInfo.f179669f);
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog2 = rVar.f256658e;
        wcPayCashierDialog2.N.f179671h = "";
        if (com.tencent.mm.plugin.wallet_core.ui.g0.j(favorPayInfo, wcPayCashierDialog2.P)) {
            if (((java.util.ArrayList) h17).size() == 0) {
                favorPayInfo.f179671h = rVar.f256658e.getContext().getString(com.tencent.mm.R.string.klp);
            } else {
                favorPayInfo.f179671h = rVar.f256658e.getContext().getString(com.tencent.mm.R.string.klq);
            }
            rVar.f256658e.i(true, -100, false, favorPayInfo);
        } else {
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog3 = rVar.f256658e;
            wcPayCashierDialog3.N = favorPayInfo;
            wcPayCashierDialog3.show();
        }
        rVar.f256658e.t();
        rVar.f256658e.z();
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog4 = rVar.f256658e;
        wcPayCashierDialog4.h(wcPayCashierDialog4.C.f180193f);
    }
}
