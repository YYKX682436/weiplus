package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes12.dex */
public final class w0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getStoreEmoticonImage";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("invalid_params", null);
            return;
        }
        com.tencent.mm.api.IEmojiInfo Bi = ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).Bi(optString);
        if (Bi != null) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) Bi;
            if (o35.a.b(emojiInfo.h0())) {
                f(Bi, q5Var);
                return;
            } else {
                emojiInfo.W(context);
                f(Bi, q5Var);
                return;
            }
        }
        java.lang.String optString2 = e17.optString("product_id");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = new com.tencent.mm.storage.emotion.EmojiInfo();
            emojiInfo2.field_md5 = optString;
            emojiInfo2.field_groupId = optString2;
            com.tencent.mm.feature.emoji.api.w5 w5Var = (com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class);
            com.tencent.mm.plugin.game.luggage.jsapi.v0 v0Var = new com.tencent.mm.plugin.game.luggage.jsapi.v0(q5Var, this, context);
            ((com.tencent.mm.feature.emoji.m0) w5Var).getClass();
            zq.h.f474972a.c(emojiInfo2, v0Var);
            return;
        }
        java.lang.String optString3 = e17.optString("emojiInfoBufferBase64");
        if (optString3 == null || optString3.length() == 0) {
            q5Var.a("productId is null and emojiInfoBufferBase64 is null", null);
            return;
        }
        byte[] decode = android.util.Base64.decode(optString3, 2);
        r45.ri0 ri0Var = new r45.ri0();
        ri0Var.parseFrom(decode);
        java.lang.String str2 = ri0Var.f384886d;
        if (str2 == null || str2.length() == 0) {
            q5Var.a("emojiInfoBufferBase64 cast to emojiInfo error", null);
            return;
        }
        ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo3.field_md5 = ri0Var.f384886d;
        emojiInfo3.field_groupId = ri0Var.f384892m;
        emojiInfo3.field_aeskey = ri0Var.f384891i;
        emojiInfo3.field_cdnUrl = ri0Var.f384890h;
        emojiInfo3.field_externUrl = ri0Var.f384893n;
        emojiInfo3.field_externMd5 = ri0Var.f384894o;
        com.tencent.mm.feature.emoji.api.w5 w5Var2 = (com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class);
        com.tencent.mm.plugin.game.luggage.jsapi.v0 v0Var2 = new com.tencent.mm.plugin.game.luggage.jsapi.v0(q5Var, this, context);
        ((com.tencent.mm.feature.emoji.m0) w5Var2).getClass();
        zq.h.f474972a.c(emojiInfo3, v0Var2);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x0031, B:15:0x0016), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.tencent.mm.api.IEmojiInfo r5, com.tencent.mm.plugin.webview.luggage.jsapi.q5 r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.lang.String r5 = r5.h0()     // Catch: java.lang.Exception -> L3f
            if (r5 == 0) goto L11
            int r2 = r5.length()     // Catch: java.lang.Exception -> L3f
            if (r2 != 0) goto Lf
            goto L11
        Lf:
            r2 = r0
            goto L12
        L11:
            r2 = 1
        L12:
            if (r2 == 0) goto L16
            r5 = r1
            goto L31
        L16:
            java.io.InputStream r5 = com.tencent.mm.vfs.w6.E(r5)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "openRead(...)"
            kotlin.jvm.internal.o.f(r5, r2)     // Catch: java.lang.Exception -> L3f
            int r2 = r5.available()     // Catch: java.lang.Exception -> L3f
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L3f
            r5.read(r2)     // Catch: java.lang.Exception -> L3f
            r5.close()     // Catch: java.lang.Exception -> L3f
            r5 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r2, r5)     // Catch: java.lang.Exception -> L3f
        L31:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3f
            r2.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "base64GifData"
            r2.put(r3, r5)     // Catch: java.lang.Exception -> L3f
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L3f
            goto L4c
        L3f:
            r5 = move-exception
            java.lang.String r2 = "JsApiGetStoreEmoticonImage"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r5, r1, r0)
            java.lang.String r5 = "fail"
            r6.a(r5, r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.w0.f(com.tencent.mm.api.IEmojiInfo, com.tencent.mm.plugin.webview.luggage.jsapi.q5):void");
    }
}
