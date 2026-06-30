package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.l f180606d;

    public s(com.tencent.mm.plugin.wallet_core.ui.l lVar) {
        this.f180606d = lVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "click bottomsheet ");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WX_PAY_HK_PLUGIN_DISABLE_URL_STRING_SYNC, null);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.wallet_core.ui.l lVar = this.f180606d;
        if (K0) {
            android.content.Context context = lVar.f180384d;
            db5.e1.y(context, context.getString(com.tencent.mm.R.string.l0g), "", context.getString(com.tencent.mm.R.string.ke6), new com.tencent.mm.plugin.wallet_core.ui.w(lVar));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "jump to h5:%s ", str);
            com.tencent.mm.wallet_core.ui.r1.W(lVar.f180384d, str, false, 4);
        }
    }
}
