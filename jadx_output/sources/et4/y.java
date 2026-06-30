package et4;

/* loaded from: classes9.dex */
public class y implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256668d;

    public y(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        this.f256668d = wcPayCashierDialog;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "on dismissed");
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256668d;
        wcPayCashierDialog.Z = true;
        java.util.Iterator it = ((java.util.ArrayList) wcPayCashierDialog.f180219x0).iterator();
        while (it.hasNext()) {
            et4.a aVar = (et4.a) ((et4.h0) it.next());
            aVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierBankcardDialog", "cashier dialog has dismissed");
            aVar.f256601a.dismiss();
        }
        com.tencent.mm.wallet_core.ui.r1.p0(wcPayCashierDialog.f180208o, wcPayCashierDialog.f180218x);
    }
}
