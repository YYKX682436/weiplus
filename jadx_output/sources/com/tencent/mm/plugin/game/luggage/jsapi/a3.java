package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class a3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139587e = "JsApiOpenStoreEmoticonDetailPage";

    @Override // sd.c
    public java.lang.String b() {
        return "openStoreEmoticonDetailPage";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        java.lang.Object obj = com.tencent.mm.plugin.webview.luggage.util.g.e(str).get("productId");
        java.lang.String productId = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (productId == null || productId.length() == 0) {
            if (q5Var != null) {
                q5Var.a("openStoreEmoticonDetailPage:fail empty productId", null);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.g(productId, "productId");
        java.lang.System.currentTimeMillis();
        if (((com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class)) != null) {
            if (q5Var != null) {
                q5Var.a("openStoreEmoticonDetailPage:ok", null);
            }
        } else {
            com.tencent.mars.xlog.Log.e(this.f139587e, "emoticon liteapp service not found");
            if (q5Var != null) {
                q5Var.a("openStoreEmoticonDetailPage:fail unable to get service", null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
