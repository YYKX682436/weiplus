package gx4;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f277453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f277454e;

    public z(int i17, android.os.Bundle bundle) {
        this.f277453d = i17;
        this.f277454e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f277454e;
        int i17 = this.f277453d;
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = gx4.t.INSTANCE.f277443d;
                if (webViewBag == null) {
                    return;
                }
                webViewBag.setVisibility(8);
                return;
            }
            if (i17 == 3) {
                gx4.t.INSTANCE.i();
                return;
            }
            if (i17 == 4) {
                gx4.t.INSTANCE.j();
                return;
            } else {
                if (i17 != 9) {
                    return;
                }
                gx4.t.INSTANCE.n(bundle.getFloat("key_alpha", 1.0f));
                return;
            }
        }
        java.lang.String string = bundle.getString("key_url");
        java.lang.String string2 = bundle.getString("key_bag_icon");
        int i18 = bundle.getInt("key_scene", 0);
        boolean z17 = bundle.getBoolean("key_from_bag", false);
        android.os.Bundle bundle2 = bundle.getBundle("key_extras");
        gx4.t tVar = gx4.t.INSTANCE;
        tVar.getClass();
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            tVar.l(string, i18, string2, bundle2, z17);
            tVar.o(false);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewBagMgr", "showBag: no float window permission");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.l5b);
        gx4.o oVar = new gx4.o(tVar, string, i18, string2, bundle2, z17);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.S6(context, string3, new j35.f0(oVar), true, a17);
    }
}
