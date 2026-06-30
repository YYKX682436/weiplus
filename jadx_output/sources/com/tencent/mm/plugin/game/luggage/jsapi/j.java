package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class j extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139680e = "JsApiCheckPCWechatOnline";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139681f = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL;

    @Override // sd.c
    public java.lang.String b() {
        return "checkPCWechatOnline";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        boolean z17;
        java.lang.String str2 = this.f139680e;
        com.tencent.mars.xlog.Log.i(str2, "invokeInMM!");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            if (q5Var != null) {
                q5Var.a("checkPCWechatOnline:fail. empty params", null);
                return;
            }
            return;
        }
        boolean z18 = true;
        if (e17.has("target")) {
            java.lang.String optString = e17.optString("target");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            this.f139681f = optString;
            if ((optString.length() == 0) || (!kotlin.jvm.internal.o.b(this.f139681f, com.eclipsesource.mmv8.Platform.WINDOWS) && !kotlin.jvm.internal.o.b(this.f139681f, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC) && !kotlin.jvm.internal.o.b(this.f139681f, "ohos") && !kotlin.jvm.internal.o.b(this.f139681f, com.eclipsesource.mmv8.Platform.LINUX))) {
                if (q5Var != null) {
                    q5Var.a("checkPCWechatOnline:fail. target params is not null and illegal", null);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "target type:%s", this.f139681f);
        java.util.ArrayList arrayList = (java.util.ArrayList) ((com.tencent.mm.modelsimple.t) ((com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class))).Ai();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.service.v6 v6Var = (com.tencent.mm.plugin.appbrand.service.v6) it.next();
            int i17 = v6Var.f88808c;
            long j17 = v6Var.f88807b;
            if ((f(38) && i17 == 38 && j17 >= 4066640128L) || ((f(37) && i17 == 37 && j17 >= 4065591552L) || ((f(43) && i17 == 43 && j17 >= 4071883008L) || (f(39) && i17 == 39 && j17 >= 4067688704L)))) {
                z17 = true;
                break;
            }
        }
        z17 = false;
        if (!z17) {
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z18 = false;
                    break;
                }
                com.tencent.mm.plugin.appbrand.service.v6 v6Var2 = (com.tencent.mm.plugin.appbrand.service.v6) it6.next();
                int i18 = v6Var2.f88808c;
                long j18 = v6Var2.f88807b;
                if ((f(14) && i18 == 14 && j18 >= 318898176) || (f(15) && i18 == 15 && j18 >= 1661009920)) {
                    break;
                }
            }
        }
        if (z18) {
            if (q5Var != null) {
                q5Var.a(null, null);
            }
        } else if (q5Var != null) {
            q5Var.a("checkPCWechatOnline:fail. no support platform online", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final boolean f(int i17) {
        if (kotlin.jvm.internal.o.b(this.f139681f, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(this.f139681f, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC) && (i17 == 38 || i17 == 14)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(this.f139681f, com.eclipsesource.mmv8.Platform.WINDOWS) && (i17 == 37 || i17 == 15)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(this.f139681f, "ohos") && i17 == 43) {
            return true;
        }
        return kotlin.jvm.internal.o.b(this.f139681f, com.eclipsesource.mmv8.Platform.LINUX) && i17 == 39;
    }
}
