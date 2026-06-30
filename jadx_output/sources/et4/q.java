package et4;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et4.r f256652d;

    public q(et4.r rVar) {
        this.f256652d = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "on cancel");
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256652d.f256658e;
        wcPayCashierDialog.G = null;
        wcPayCashierDialog.show();
    }
}
