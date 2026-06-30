package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class o2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openCustomWebview";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(sd.b r11) {
        /*
            r10 = this;
            java.lang.String r0 = "invokeInOwn"
            java.lang.String r1 = "MicroMsg.JsApiOpenCustomWebView"
            com.tencent.mars.xlog.Log.i(r1, r0)
            od.g r0 = r11.f406597b
            org.json.JSONObject r0 = r0.f344506c
            java.lang.String r2 = "url"
            java.lang.String r7 = r0.optString(r2)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r0 == 0) goto L1f
            r0 = 0
            java.lang.String r1 = "invalid_url"
            r11.c(r1, r0)
            return
        L1f:
            java.lang.String r0 = "url: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            com.tencent.mars.xlog.Log.i(r1, r0, r2)
            od.g r0 = r11.f406597b
            org.json.JSONObject r0 = r0.f344506c
            java.lang.String r1 = "orientation"
            java.lang.String r0 = r0.optString(r1)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r2 = 0
            if (r1 != 0) goto L4f
            java.lang.String r1 = "horizontal"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L44
            r0 = r2
            goto L50
        L44:
            java.lang.String r1 = "vertical"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = -1
        L50:
            od.g r1 = r11.f406597b
            org.json.JSONObject r1 = r1.f344506c
            java.lang.String r3 = "fullscreen"
            boolean r1 = r1.optBoolean(r3)
            od.g r3 = r11.f406597b
            org.json.JSONObject r3 = r3.f344506c
            java.lang.String r4 = "finish_recent_webview"
            java.lang.String r3 = r3.optString(r4)
            java.lang.String r4 = "1"
            boolean r5 = r3.equals(r4)
            od.g r3 = r11.f406597b
            org.json.JSONObject r3 = r3.f344506c
            java.lang.String r6 = "disable_swipe_back"
            java.lang.String r3 = r3.optString(r6)
            boolean r3 = r3.equals(r4)
            od.g r4 = r11.f406597b
            org.json.JSONObject r4 = r4.f344506c
            java.lang.String r8 = "username"
            java.lang.String r4 = r4.optString(r8)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r9 = "rawUrl"
            r8.putString(r9, r7)
            java.lang.String r9 = "screen_orientation"
            r8.putInt(r9, r0)
            java.lang.String r0 = "show_full_screen"
            r8.putBoolean(r0, r1)
            r8.putBoolean(r6, r3)
            java.lang.String r0 = "shortcut_user_name"
            r8.putString(r0, r4)
            od.g r0 = r11.f406597b
            org.json.JSONObject r0 = r0.f344506c
            java.lang.String r1 = "gameAppid"
            java.lang.String r0 = r0.optString(r1)
            if (r0 != 0) goto Lb0
            java.lang.String r0 = ""
        Lb0:
            java.lang.String r1 = "game_hv_menu_appid"
            r8.putString(r1, r0)
            sd.d r0 = r11.f406596a
            com.tencent.mm.plugin.webview.luggage.e0 r0 = (com.tencent.mm.plugin.webview.luggage.e0) r0
            android.os.Bundle r0 = r0.f406657n
            java.lang.String r1 = "from_find_more_friend"
            boolean r0 = r0.getBoolean(r1, r2)
            r8.putBoolean(r1, r0)
            com.tencent.mm.plugin.webview.luggage.jsapi.n2 r0 = new com.tencent.mm.plugin.webview.luggage.jsapi.n2
            r3 = r0
            r4 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            com.tencent.mm.sdk.platformtools.u3.h(r0)
            r11.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.luggage.jsapi.o2.e(sd.b):void");
    }
}
