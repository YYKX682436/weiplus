package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class u extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "batchAddCard";
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
        java.lang.String optString = bVar.f406597b.f344506c.optString("card_list");
        java.lang.String string = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406657n.getString("srcUsername");
        java.lang.String u17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).u();
        java.lang.String optString2 = bVar.f406597b.f344506c.optString("consumedCardId");
        ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406657n.getString("KTemplateId");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiBatchAddCard", "doBatchAddCard consumedCardId %s", optString2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_in_card_list", optString);
        intent.putExtra("key_from_scene", 7);
        intent.putExtra("src_username", string);
        intent.putExtra("js_url", u17);
        intent.putExtra("key_consumed_card_id", optString2);
        ((com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.t(this, bVar));
        j45.l.o(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d, "card", ".ui.CardAddEntranceUI", intent, hashCode() & 65535, false);
    }
}
