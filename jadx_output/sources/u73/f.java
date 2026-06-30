package u73;

/* loaded from: classes9.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u73.g f425123d;

    public f(u73.g gVar) {
        this.f425123d = gVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        u73.g gVar = this.f425123d;
        r45.wk4 wk4Var = (r45.wk4) gVar.f425125e.f374594d.get(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(wk4Var.f389231f)) {
            return;
        }
        if (!wk4Var.f389231f.equals("weixin://wcpay/honeypay/unbind") || com.tencent.mm.sdk.platformtools.t8.K0(gVar.f425126f) || gVar.f425127g == null) {
            com.tencent.mm.wallet_core.ui.r1.V(gVar.f425124d, wk4Var.f389231f, false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayUtil", "go to unbind");
        android.content.Intent intent = new android.content.Intent(gVar.f425124d, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.class);
        intent.putExtra("key_scene", 3);
        intent.putExtra("key_card_no", gVar.f425126f);
        try {
            intent.putExtra("key_toke_mess", gVar.f425127g.toByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HoneyPayUtil", e17, "", new java.lang.Object[0]);
        }
        gVar.f425124d.startActivityForResult(intent, gVar.f425128h);
    }
}
