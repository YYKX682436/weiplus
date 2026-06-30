package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class z4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setGameTab";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetGameTab", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetGameTab", "data is null");
            bVar.c("null_data", null);
        } else {
            if (((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).V1 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetGameTab", "is not tab page");
                bVar.c("not_tab", null);
                return;
            }
            com.tencent.mm.autogen.events.SetGameTabEvent setGameTabEvent = new com.tencent.mm.autogen.events.SetGameTabEvent();
            setGameTabEvent.f54765g.f8606a = jSONObject.toString();
            setGameTabEvent.e();
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()), com.tencent.mm.plugin.game.luggage.jsapi.y4.class, null);
            bVar.a();
        }
    }
}
