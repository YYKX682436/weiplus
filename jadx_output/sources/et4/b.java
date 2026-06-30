package et4;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et4.i f256603d;

    public b(et4.i iVar) {
        this.f256603d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        et4.h hVar = this.f256603d.f256631v;
        if (hVar != null) {
            et4.w wVar = (et4.w) hVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "on bankcard dialog cancel");
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = wVar.f256666c;
            ((java.util.ArrayList) wcPayCashierDialog.f180219x0).remove(wcPayCashierDialog.F.f256632w);
            wcPayCashierDialog.F = null;
            if (wVar.f256665b) {
                wcPayCashierDialog.show();
            } else {
                wcPayCashierDialog.show();
            }
        }
    }
}
