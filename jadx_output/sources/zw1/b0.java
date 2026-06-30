package zw1;

/* loaded from: classes9.dex */
public class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.t1 f476582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI f476583e;

    public b0(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI, ww1.t1 t1Var) {
        this.f476583e = collectCreateQRCodeNewUI;
        this.f476582d = t1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ww1.t1 t1Var = this.f476582d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(t1Var.f450292p)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "goto h5: %s", t1Var.f450292p);
        com.tencent.mm.wallet_core.ui.r1.V(this.f476583e.getContext(), t1Var.f450292p, true);
    }
}
