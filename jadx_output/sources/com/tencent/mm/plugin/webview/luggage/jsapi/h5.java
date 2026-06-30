package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class h5 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "shareEmoticon";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareEmotion", "invoke");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareEmotion", "data is null");
            q5Var.a("null_data", null);
            return;
        }
        java.lang.String optString = e17.optString("base64DataString");
        java.lang.String optString2 = e17.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareEmotion", "doShareEmoticon use url:%s", optString2);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(context.getCacheDir(), kk.k.g(optString2.getBytes()));
            if (!r6Var.m()) {
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342082f = r6Var.o();
                fVar.f342102z = new java.lang.Object[]{r6Var.o()};
                ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).Di().j(optString2, null, fVar.a(), new com.tencent.mm.plugin.webview.luggage.jsapi.g5(this, optString2, context, q5Var));
                return;
            }
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
            com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            java.lang.String g17 = n22.m.g();
            ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
            java.lang.String p18 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", p17);
            if (!com.tencent.mm.vfs.w6.j(p18)) {
                com.tencent.mm.vfs.w6.c(r6Var.o(), p18);
            }
            f(context, p17, q5Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareEmotion", "use base64DataString");
        int indexOf = optString.indexOf(";base64,");
        try {
            byte[] decode = android.util.Base64.decode(indexOf != -1 ? optString.substring(indexOf + 8, optString.length()) : "", 0);
            if (com.tencent.mm.sdk.platformtools.t8.M0(decode)) {
                q5Var.a("fail", null);
                return;
            }
            java.lang.String g18 = kk.k.g(decode);
            com.tencent.mm.feature.emoji.api.x5 x5Var2 = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            java.lang.String g19 = n22.m.g();
            ((com.tencent.mm.feature.emoji.o0) x5Var2).getClass();
            java.lang.String p19 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g19, "", g18);
            if (!com.tencent.mm.vfs.w6.j(p19) || !com.tencent.mm.vfs.w6.p(p19).equalsIgnoreCase(g18)) {
                com.tencent.mm.vfs.w6.S(p19, decode, 0, decode.length);
            }
            f(context, g18, q5Var);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareEmotion", "doShareEmoticon error:" + e18.getMessage());
            q5Var.a("base64_decode_fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final void f(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mm.api.IEmojiInfo Bi = ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).Bi(str);
        if (Bi == null) {
            com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            java.lang.String g17 = n22.m.g();
            ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
            java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", str);
            if (com.tencent.mm.vfs.w6.j(p17)) {
                int i17 = com.tencent.mm.sdk.platformtools.y1.c(p17) ? 2 : 1;
                com.tencent.mm.feature.emoji.api.v5 v5Var = (com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class);
                int k17 = (int) com.tencent.mm.vfs.w6.k(p17);
                ((com.tencent.mm.feature.emoji.k0) v5Var).getClass();
                Bi = com.tencent.mm.storage.n5.f().c().b1(str, "", 65, i17, k17, null, null, null, "", 1);
            }
        }
        if (Bi == null) {
            q5Var.a(null, null);
        } else {
            ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).hj(context, ((com.tencent.mm.storage.emotion.EmojiInfo) Bi).getMd5(), Bi);
            q5Var.a(null, null);
        }
    }
}
