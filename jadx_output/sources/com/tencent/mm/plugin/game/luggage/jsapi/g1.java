package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class g1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.event.c f139645e;

    @Override // sd.c
    public java.lang.String b() {
        return "getWepkgFileList";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWepkgFileList", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("wepkgId");
        int optInt = e17.optInt("loadType", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWepkgFileList", "wepkgId:[%s] loadType:[%d]", optString, java.lang.Integer.valueOf(optInt));
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("null_data", null);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.d1(this, optString, optInt, q5Var));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject f(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "size"
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r10 = com.tencent.mm.plugin.wepkg.model.o0.e(r10)
            r1 = 0
            java.lang.String r2 = "MicroMsg.JsApiGetWepkgFileList"
            if (r10 == 0) goto L8c
            java.lang.String r3 = r10.f188377g
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 == 0) goto L16
            goto L8c
        L16:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "version"
            java.lang.String r5 = r10.f188376f     // Catch: java.lang.Exception -> L7d
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L7d
            int r4 = r10.f188385r     // Catch: java.lang.Exception -> L7d
            r3.put(r0, r4)     // Catch: java.lang.Exception -> L7d
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L7d
            java.lang.String r10 = r10.f188377g     // Catch: java.lang.Exception -> L7d
            r4.<init>(r10)     // Catch: java.lang.Exception -> L7d
            boolean r10 = r4.m()     // Catch: java.lang.Exception -> L7d
            if (r10 != 0) goto L36
        L35:
            goto L92
        L36:
            com.tencent.mm.plugin.wepkg.model.o r10 = new com.tencent.mm.plugin.wepkg.model.o     // Catch: java.lang.Exception -> L7d
            r10.<init>(r4)     // Catch: java.lang.Exception -> L7d
            r45.l87 r10 = r10.f188450e     // Catch: java.lang.Exception -> L7d
            if (r10 != 0) goto L40
            goto L35
        L40:
            java.util.LinkedList r4 = r10.f379238d     // Catch: java.lang.Exception -> L7d
            if (r4 == 0) goto L93
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L7d
            r4.<init>()     // Catch: java.lang.Exception -> L7d
            java.util.LinkedList r10 = r10.f379238d     // Catch: java.lang.Exception -> L7d
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L7d
        L4f:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r5 == 0) goto L77
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Exception -> L7d
            r45.ps0 r5 = (r45.ps0) r5     // Catch: java.lang.Exception -> L7d
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            r6.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.String r7 = "rid"
            java.lang.String r8 = r5.f383367d     // Catch: java.lang.Exception -> L7d
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L7d
            int r7 = r5.f383369f     // Catch: java.lang.Exception -> L7d
            r6.put(r0, r7)     // Catch: java.lang.Exception -> L7d
            java.lang.String r7 = "mimeType"
            java.lang.String r5 = r5.f383370g     // Catch: java.lang.Exception -> L7d
            r6.put(r7, r5)     // Catch: java.lang.Exception -> L7d
            r4.put(r6)     // Catch: java.lang.Exception -> L7d
            goto L4f
        L77:
            java.lang.String r10 = "fileList"
            r3.put(r10, r4)     // Catch: java.lang.Exception -> L7d
            goto L93
        L7d:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "errMsg:%s"
            com.tencent.mars.xlog.Log.e(r2, r0, r10)
            goto L92
        L8c:
            java.lang.String r10 = "wepkgVersion not exists or pkgPath is empty"
            com.tencent.mars.xlog.Log.i(r2, r10)
        L92:
            r3 = r1
        L93:
            if (r3 != 0) goto L96
            return r1
        L96:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r0 = "data"
            r10.put(r0, r3)     // Catch: org.json.JSONException -> La0
        La0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.g1.f(java.lang.String):org.json.JSONObject");
    }
}
