package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class da extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.da f186038d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.da();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r6.equals("trial") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.da r5, java.lang.String r6) {
        /*
            r5.getClass()
            l81.b1 r5 = new l81.b1
            r5.<init>()
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L76
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r6 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r6.<init>()
            r5.f317041s = r6
            java.lang.String r3 = "referrerAppId"
            java.lang.String r3 = r0.optString(r3)
            r6.f77323e = r3
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r6 = r5.f317041s
            r3 = 2
            r6.f77322d = r3
            java.lang.String r6 = "targetAppId"
            java.lang.String r6 = r0.optString(r6)
            r5.f317014b = r6
            java.lang.String r6 = "path"
            java.lang.String r6 = r0.optString(r6)
            r5.f317022f = r6
            java.lang.String r6 = "envVersion"
            java.lang.String r6 = r0.optString(r6)
            java.lang.String r0 = "optString(...)"
            kotlin.jvm.internal.o.f(r6, r0)
            int r0 = r6.hashCode()
            r4 = 110628630(0x6980f16, float:5.719821E-35)
            if (r0 == r4) goto L6a
            r3 = 1090594823(0x41012807, float:8.072272)
            if (r0 == r3) goto L64
            r3 = 1559690845(0x5cf6fe5d, float:5.5618016E17)
            if (r0 == r3) goto L59
            goto L73
        L59:
            java.lang.String r0 = "develop"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L62
            goto L73
        L62:
            r3 = r1
            goto L74
        L64:
            java.lang.String r0 = "release"
            r6.equals(r0)
            goto L73
        L6a:
            java.lang.String r0 = "trial"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L74
        L73:
            r3 = r2
        L74:
            r5.f317016c = r3
        L76:
            java.lang.String r6 = r5.f317014b
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r6 != 0) goto L9a
            java.lang.String r6 = r5.f317022f
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r6 == 0) goto L87
            goto L9a
        L87:
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.h6> r6 = com.tencent.mm.plugin.appbrand.service.h6.class
            i95.m r6 = i95.n0.c(r6)
            com.tencent.mm.plugin.appbrand.service.h6 r6 = (com.tencent.mm.plugin.appbrand.service.h6) r6
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.ba r0 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ba
            r0.<init>()
            com.tencent.mm.plugin.appbrand.launching.xc r6 = (com.tencent.mm.plugin.appbrand.launching.xc) r6
            r6.ij(r5, r0)
            goto Lb3
        L9a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[preRender] fail, stack:"
            r5.<init>(r6)
            com.tencent.mm.sdk.platformtools.z3 r6 = new com.tencent.mm.sdk.platformtools.z3
            r6.<init>()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.prerenderMiniProgram"
            com.tencent.mars.xlog.Log.i(r6, r5)
            r1 = r2
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.da.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.da, java.lang.String):boolean");
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.prerenderMiniProgram", "prerenderMiniProgram");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("referrerAppId", (java.lang.String) msg.f340790a.get("referrerAppId"));
        jSONObject.put("targetAppId", (java.lang.String) msg.f340790a.get("targetAppId"));
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, (java.lang.String) msg.f340790a.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
        jSONObject.put("envVersion", (java.lang.String) msg.f340790a.get("envVersion"));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram$PreRenderMiniProgramData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.aa.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ca(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 417;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "prerenderMiniProgram";
    }
}
