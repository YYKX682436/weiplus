package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class m1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "hideMenuItems";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHideMenuItems", "invokeInOwn");
        org.json.JSONArray optJSONArray = bVar.f406597b.f344506c.optJSONArray("menuList");
        if (optJSONArray == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHideMenuItems", "data is null");
            bVar.c("invalid_data", null);
            return;
        }
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f182186t;
        if (y1Var != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                com.tencent.mm.plugin.webview.luggage.menu.y menuHelp = y1Var.getMenuHelp();
                java.lang.String optString = optJSONArray.optString(i17);
                java.util.Iterator it = menuHelp.f182569a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.tencent.mm.plugin.webview.luggage.menu.z zVar = (com.tencent.mm.plugin.webview.luggage.menu.z) it.next();
                        if (zVar.f182572b.equals(optString)) {
                            if (!zVar.f182574d) {
                                zVar.f182573c = true;
                            }
                        }
                    }
                }
            }
        }
        bVar.a();
    }
}
