package sx4;

/* loaded from: classes8.dex */
public class h0 implements tx4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413611a;

    public h0(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI) {
        this.f413611a = gameWebViewUI;
    }

    @Override // tx4.f
    public void a(android.view.MenuItem menuItem) {
        tx4.h hVar;
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413611a;
        r45.rk4 rk4Var = (r45.rk4) ((java.util.HashMap) gameWebViewUI.E3).get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (rk4Var == null) {
            return;
        }
        int i17 = rk4Var.f384967g;
        java.util.Iterator it = tx4.h.f422687f.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                hVar = tx4.h.HVGAME_MENU_ACTION_DEFAULT;
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((java.lang.Integer) entry.getValue()).intValue() == i17) {
                hVar = (tx4.h) entry.getKey();
                break;
            }
        }
        switch (hVar.ordinal()) {
            case 1:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", rk4Var.f384968h);
                j45.l.j(gameWebViewUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            case 2:
                com.tencent.mm.plugin.webview.model.t5.a(gameWebViewUI.F7(), 32, 1);
                if (gameWebViewUI.U8()) {
                    return;
                }
                gameWebViewUI.finish();
                return;
            case 3:
                com.tencent.mm.plugin.webview.model.t5.a(gameWebViewUI.F7(), 1, 1, gameWebViewUI.getIntent().getStringExtra("KPublisherId"), gameWebViewUI.getIntent().getStringExtra("KAppId"), gameWebViewUI.getIntent().getStringExtra("srcUsername"));
                gameWebViewUI.H8(0);
                return;
            case 4:
                com.tencent.mm.plugin.webview.model.t5.a(gameWebViewUI.F7(), 3, 1);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(157L, 6L, 1L, false);
                gameWebViewUI.f183849q2.s();
                return;
            case 5:
                com.tencent.mm.plugin.webview.model.t5.a(gameWebViewUI.F7(), 10, 1);
                com.tencent.mm.ui.widget.MMWebView mMWebView = gameWebViewUI.f183815f;
                if (mMWebView != null) {
                    mMWebView.reload();
                    return;
                }
                return;
            case 6:
                com.tencent.mm.plugin.webview.model.t5.a(gameWebViewUI.F7(), 31, 1);
                gameWebViewUI.f183849q2.j();
                return;
            case 7:
                com.tencent.mm.plugin.webview.model.t5.a(gameWebViewUI.F7(), 11, 1);
                gameWebViewUI.f183849q2.p(null);
                return;
            case 8:
                nw4.n nVar = gameWebViewUI.f183844p0;
                if (nVar != null) {
                    int i18 = rk4Var.f384964d;
                    if (!nVar.f340895i) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onCustomGameMenuClicked");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("itemId", java.lang.Integer.valueOf(i18));
                    com.tencent.mm.sdk.platformtools.u3.h(new nw4.i2(nVar, nw4.x2.c("onCustomGameMenuClicked", hashMap, nVar.f340903q, nVar.f340904r)));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
