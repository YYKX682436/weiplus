package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class m5 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return hc1.i.NAME;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowSmileyPanel", "invokeInOwn");
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = (com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a;
        int i17 = 0;
        if (e0Var.f182188v != null) {
            long id6 = java.lang.Thread.currentThread().getId();
            com.tencent.mm.sdk.platformtools.n3 n3Var = e0Var.M;
            if (id6 == n3Var.getLooper().getThread().getId()) {
                com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = e0Var.f182188v;
                webViewInputFooter.setVisibility(0);
                android.widget.LinearLayout linearLayout = webViewInputFooter.f187287q;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                webViewInputFooter.f187289s = true;
                webViewInputFooter.f187280g = 1;
                i17 = webViewInputFooter.c();
            } else {
                i17 = ((java.lang.Integer) new com.tencent.mm.plugin.webview.luggage.q0(e0Var, 1000L, 0).a(n3Var)).intValue();
            }
        }
        if (i17 <= 0) {
            bVar.c("fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("height", java.lang.Integer.valueOf(i65.a.c(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d, i17)));
        bVar.d(hashMap);
    }
}
