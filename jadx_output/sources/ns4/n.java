package ns4;

/* loaded from: classes8.dex */
public final class n implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339595d;

    public n(ns4.s sVar) {
        this.f339595d = sVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        ns4.s sVar = this.f339595d;
        if (!sVar.f339636a.isFinishing() && !sVar.f339636a.isDestroyed()) {
            ms4.h hVar = sVar.f339640e;
            com.tencent.mars.xlog.Log.i("MicroMsg.RechargeProductsDialogViewModel", "cancelGetPriceListRequest, mGetPriceListCgi: " + hVar.f331033i);
            ks4.g gVar = hVar.f331033i;
            if (gVar != null) {
                gVar.j();
            }
            hVar.N6(8, 2, 0, "");
            sVar.f339636a.finish();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = sVar.f339646k;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        u3Var.dismiss();
        sVar.f339646k = null;
    }
}
