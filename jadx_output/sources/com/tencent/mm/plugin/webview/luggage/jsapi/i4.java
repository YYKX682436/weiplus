package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class i4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setScreenOrientation";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetScreenOrientation", "invoke");
        java.lang.String optString = bVar.f406597b.f344506c.optString("orientation");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetScreenOrientation", "data is null");
            bVar.c("invalid_data", null);
            return;
        }
        int i17 = 0;
        if (!optString.equals("horizontal")) {
            if (!optString.equals("vertical")) {
                if (optString.equals("sensor")) {
                    i17 = 4;
                } else if (!optString.equals("horizontal_unforced")) {
                    if (!optString.equals("vertical_unforced")) {
                        i17 = -1;
                    }
                }
            }
            i17 = 1;
        }
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = (com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a;
        e0Var.f406657n.putInt("screen_orientation", i17);
        e0Var.l();
        bVar.a();
    }
}
