package gx4;

/* loaded from: classes8.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx4.t f277432d;

    public r(gx4.t tVar) {
        this.f277432d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.Iterator<java.lang.String> keys;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/bag/WebViewBagMgr$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx4.t tVar = this.f277432d;
        gx4.s sVar = tVar.f277447h;
        java.lang.String str = sVar.f277434b;
        int i17 = sVar.f277439g;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "bag handleClick: url:%s scene:%d", str, java.lang.Integer.valueOf(i17));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = tVar.f277446g;
        if (j17 <= 0 || currentTimeMillis - j17 >= 500) {
            tVar.f277446g = currentTimeMillis;
            tVar.k(13);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                android.content.Intent intent = new android.content.Intent();
                gx4.s sVar2 = tVar.f277447h;
                org.json.JSONObject jSONObject = sVar2.f277440h;
                int i18 = gx4.n.f277423a;
                if (jSONObject != null && (keys = jSONObject.keys()) != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        try {
                            gx4.m.a(bundle, next, jSONObject.getJSONObject(next));
                        } catch (org.json.JSONException unused) {
                        }
                    }
                    intent.putExtras(bundle);
                }
                intent.putExtra("rawUrl", str);
                intent.putExtra("from_bag", true);
                intent.putExtra("from_bag_id", sVar2.f277433a);
                intent.putExtra("from_bag_icon", sVar2.f277435c);
                if (i17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "handleClick go jd url");
                    intent.putExtra("useJs", true);
                    intent.putExtra("vertical_scroll", true);
                    intent.putExtra("minimize_secene", 1);
                    intent.putExtra("KPublisherId", "jd_store");
                    h45.g0.f278945a = 9;
                } else if (i17 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "handleClick go game url");
                }
                if (i17 == 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "handleClick luggage");
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("rawUrl"))) {
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    }
                } else {
                    j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
                }
                com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = tVar.f277443d;
                if (webViewBag != null) {
                    webViewBag.setTouchEnable(false);
                }
                tVar.n(0.0f);
                sVar2.f277438f = java.lang.System.currentTimeMillis();
                sVar2.a();
                tVar.m();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "handleClick twice click too short");
            tVar.f277446g = currentTimeMillis;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/bag/WebViewBagMgr$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
