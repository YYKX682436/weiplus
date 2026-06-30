package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class x0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getWePkgAuthResult";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(sd.b r12) {
        /*
            r11 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "MicroMsg.JsApiGetWePkgAuthResult"
            com.tencent.mars.xlog.Log.i(r1, r0)
            sd.d r0 = r12.f406596a
            r2 = r0
            com.tencent.mm.plugin.game.luggage.page.x0 r2 = (com.tencent.mm.plugin.game.luggage.page.x0) r2
            boolean r2 = r2.Q
            r3 = 0
            if (r2 == 0) goto L1c
            java.lang.String r0 = "gettingA8Key"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.String r0 = "auth_result_not_return"
            r12.c(r0, r3)
            return
        L1c:
            r1 = r0
            com.tencent.mm.plugin.game.luggage.page.x0 r1 = (com.tencent.mm.plugin.game.luggage.page.x0) r1
            java.lang.String r1 = r1.P
            com.tencent.mm.plugin.game.luggage.page.x0 r0 = (com.tencent.mm.plugin.game.luggage.page.x0) r0
            boolean r0 = r0.J1
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L66
            java.lang.String r2 = com.tencent.mm.plugin.game.luggage.h0.f139559a
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            java.lang.String r6 = "MicroMsg.LuggageGameUinKeyHolder"
            if (r2 == 0) goto L3e
            java.lang.String r2 = "fullUrl is null"
            com.tencent.mars.xlog.Log.i(r6, r2)
        L3c:
            r2 = r5
            goto L60
        L3e:
            int r2 = com.tencent.mm.plugin.game.commlib.i.q()
            if (r2 > 0) goto L45
            goto L3c
        L45:
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            long r9 = com.tencent.mm.plugin.game.luggage.h0.f139560b
            long r7 = r7 - r9
            int r2 = com.tencent.mm.plugin.game.commlib.i.q()
            long r9 = (long) r2
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L5f
            java.lang.String r2 = "updateTime bigger that one hour"
            com.tencent.mars.xlog.Log.i(r6, r2)
            goto L3c
        L5f:
            r2 = r4
        L60:
            if (r2 == 0) goto L66
            java.lang.String r1 = com.tencent.mm.plugin.game.luggage.h0.f139559a
            r2 = r4
            goto L67
        L66:
            r2 = r5
        L67:
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r6 == 0) goto L73
            java.lang.String r0 = "full_url_empty"
            r12.c(r0, r3)
            goto La0
        L73:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r6 = "set_cookie"
            if (r0 == 0) goto L85
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.put(r6, r0)
            goto L8c
        L85:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.put(r6, r0)
        L8c:
            if (r2 == 0) goto L98
            java.lang.String r0 = "used_cache_uinkey"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3.put(r0, r2)
        L98:
            java.lang.String r0 = "full_url"
            r3.put(r0, r1)
            r12.d(r3)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.x0.e(sd.b):void");
    }
}
