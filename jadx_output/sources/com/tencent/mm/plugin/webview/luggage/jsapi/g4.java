package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class g4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return nd1.d1.NAME;
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
        java.lang.String str;
        float f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetNavigationBarColor", "invoke");
        boolean z17 = bVar.f406597b.f344506c.optInt("actionCode") == 1;
        try {
            org.json.JSONObject optJSONObject = bVar.f406597b.f344506c.optJSONObject("wxcolor");
            str = optJSONObject != null ? com.tencent.mm.ui.bk.C() ? optJSONObject.optString("dark") : optJSONObject.optString("light") : bVar.f406597b.f344506c.optString("color");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetNavigationBarColor", e17.getMessage());
            str = "";
            z17 = true;
        }
        try {
            f17 = (float) bVar.f406597b.f344506c.optDouble("alpha", -1.0d);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetNavigationBarColor", e18.getMessage());
            f17 = -1.0f;
        }
        int optInt = bVar.f406597b.f344506c.optInt("iconDark", -1);
        if (z17) {
            com.tencent.mm.plugin.webview.luggage.e0 e0Var = (com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a;
            e0Var.S = b3.l.getColor(e0Var.f406610d, com.tencent.mm.R.color.f478586bk);
            e0Var.f182186t.f182710y = -1;
            e0Var.G();
        } else {
            com.tencent.mm.plugin.webview.luggage.e0 e0Var2 = (com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a;
            e0Var2.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    int parseColor = android.graphics.Color.parseColor(str) | (-16777216);
                    e0Var2.R = true;
                    e0Var2.S = parseColor;
                    e0Var2.f182186t.setActionBarColorValue(parseColor);
                } catch (java.lang.Exception unused) {
                }
            }
            e0Var2.f182186t.setIconDark(optInt);
            if (f17 < 0.0f || f17 > 1.0f) {
                e0Var2.G();
            } else {
                e0Var2.M.post(new com.tencent.mm.plugin.webview.luggage.n1(e0Var2, f17));
            }
        }
        bVar.a();
    }
}
