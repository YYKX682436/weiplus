package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class f extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139634e = "MicroMsg.JsApiBrowseEmoticonView";

    @Override // sd.c
    public java.lang.String b() {
        return "browseEmoticonView";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null || context == null || q5Var == null) {
            if (q5Var != null) {
                q5Var.a("invalid_params", null);
                return;
            }
            return;
        }
        java.lang.String optString = e17.optString("md5");
        java.lang.String optString2 = e17.optString("product_id");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("invalid_params", null);
            return;
        }
        com.tencent.mm.api.IEmojiInfo Bi = ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).Bi(optString);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = Bi;
        if (Bi == null) {
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.d(optString2);
            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            emojiInfo.field_catalog = 84;
            emojiInfo.field_reserved4 |= 1;
            emojiInfo.field_groupId = optString2;
            emojiInfo.field_md5 = optString;
            iEmojiInfo = emojiInfo;
        }
        kotlin.jvm.internal.o.d(optString);
        qk.u uVar = new qk.u(optString, iEmojiInfo);
        uVar.f364156b = true;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e(this.f139634e, "unable to get emoticon liteapp feature service");
            q5Var.a(null, null);
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, uVar);
            q5Var.a(null, null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
