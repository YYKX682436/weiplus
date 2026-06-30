package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public abstract class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f182980a;

    /* renamed from: b, reason: collision with root package name */
    public static long f182981b;

    public static void a(com.tencent.mm.plugin.webview.stub.v0 v0Var, java.lang.String str, int i17, java.util.ArrayList arrayList, com.tencent.mm.plugin.webview.model.u1 u1Var, boolean z17, int i18, com.tencent.mm.plugin.webview.model.l2 l2Var, android.content.Context context) {
        if (v0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorizeConfirm invoker null");
            return;
        }
        f182981b = java.lang.System.currentTimeMillis();
        r45.ix4 ix4Var = new r45.ix4();
        ix4Var.f377391d = str;
        ix4Var.f377392e = i17;
        ix4Var.f377393f = new java.util.LinkedList(arrayList);
        com.tencent.mm.plugin.webview.core.o2 o2Var = (com.tencent.mm.plugin.webview.core.o2) l2Var;
        ix4Var.f377395h = o2Var.c();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ix4Var;
        lVar.f70665b = new r45.jx4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.ld.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.model.v1(v0Var, u1Var, z17, context, o2Var));
    }

    public static void b(boolean z17, java.lang.String str, android.os.Bundle bundle, android.content.Context context, com.tencent.mm.plugin.webview.model.l2 l2Var, com.tencent.mm.plugin.webview.model.u1 u1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd suc: %b", java.lang.Boolean.valueOf(z17));
        if (context == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.webview.core.n2 n2Var = (com.tencent.mm.plugin.webview.core.n2) u1Var;
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) n2Var.f181896a.get();
        if (e3Var != null) {
            com.tencent.mm.plugin.webview.core.e3.e1(e3Var, com.tencent.mm.plugin.appbrand.jsapi.ld.CTRL_INDEX);
        }
        java.util.HashMap hashMap = (java.util.HashMap) n2Var.f181897b;
        if (hashMap.containsKey(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.ld.CTRL_INDEX))) {
            kotlin.jvm.internal.o.d(hashMap.get(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.ld.CTRL_INDEX)));
            hashMap.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.ld.CTRL_INDEX), java.lang.Integer.valueOf(((java.lang.Number) r0).intValue() - 1));
        } else {
            hashMap.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.ld.CTRL_INDEX), 0);
        }
        if (!z17) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.model.i2(context, str, l2Var));
        } else {
            if (bundle == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd resp null");
                return;
            }
            java.lang.String string = bundle.getString("redirect_url");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd redirect null");
            } else {
                ((com.tencent.mm.plugin.webview.core.o2) l2Var).b(string, 9);
                com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd redirectUrl: %s", string);
            }
        }
    }

    public static void c(boolean z17, java.lang.String str, android.os.Bundle bundle, android.content.Context context, com.tencent.mm.plugin.webview.stub.v0 v0Var, com.tencent.mm.plugin.webview.model.l2 l2Var, com.tencent.mm.plugin.webview.model.u1 u1Var, int i17, int i18, android.app.Dialog dialog) {
        android.content.Context context2 = context;
        if (context2 instanceof android.content.MutableContextWrapper) {
            context2 = ((android.content.MutableContextWrapper) context2).getBaseContext();
        }
        android.content.Context context3 = context2;
        boolean z18 = bundle.getBoolean("is_tourist_oauth");
        java.lang.String string = bundle.getString("tourist_banner_wording");
        java.lang.String string2 = bundle.getString("redirect_url");
        java.lang.String d17 = d(bundle.getString("oauth_url"));
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd suc: %b, isTouristOauth:%b, appID:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), d17);
        hy4.b bVar = hy4.b.INSTANCE;
        if (!z17) {
            com.tencent.mm.plugin.webview.core.o2 o2Var = (com.tencent.mm.plugin.webview.core.o2) l2Var;
            o2Var.a();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.model.z1(context3, str, o2Var));
            bVar.a(d17 == null ? "" : d17, f182980a, 2, 1, 0, 0, i18);
            bVar.b(1, (int) (java.lang.System.currentTimeMillis() - f182980a), i18);
            return;
        }
        boolean z19 = bundle.getBoolean("is_recent_has_auth");
        boolean z27 = bundle.getBoolean("is_silence_auth");
        if (z19 || z27) {
            com.tencent.mm.plugin.webview.core.o2 o2Var2 = (com.tencent.mm.plugin.webview.core.o2) l2Var;
            o2Var2.a();
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd redirect null");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd isRecentHasAuth:%b isSilenceAuth:%b redirectUrl:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), string2);
                ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).wi(context3, com.tencent.mm.model.gdpr.a.OPENSDK, d17, new com.tencent.mm.plugin.webview.model.b2(o2Var2, d17, i18, string2));
                return;
            }
        }
        com.tencent.mm.plugin.webview.core.o2 o2Var3 = (com.tencent.mm.plugin.webview.core.o2) l2Var;
        if (o2Var3.e() && z18 && !com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.model.c2(o2Var3, string2, string));
            return;
        }
        o2Var3.a();
        boolean z28 = bundle.getBoolean("is_use_new_page", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "isUseNewPage = %b", java.lang.Boolean.valueOf(z28));
        if (z28) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.model.d2(o2Var3, context3, bundle, i17, dialog));
        } else {
            com.tencent.mm.plugin.webview.model.g2 g2Var = new com.tencent.mm.plugin.webview.model.g2(context3, d17, o2Var3, i18, bundle, v0Var, u1Var, i17);
            if ((context3 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) && ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context3).isFinishing()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "showWebAuthorizeDialog isFinishing");
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.model.j2(context3, com.tencent.mm.plugin.webview.model.m2.a((java.util.ArrayList) bundle.getSerializable("scope_list")), bundle.getString("appname"), bundle.getString("appicon_url"), g2Var));
            }
        }
        bVar.b(1, (int) (java.lang.System.currentTimeMillis() - f182980a), i18);
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("appid");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                return queryParameter;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "parseAppId try case not sensitive, oauthUrl:%s", str);
            return android.net.Uri.parse(str.toLowerCase()).getQueryParameter("appid");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean e(java.lang.String str, int i17) {
        if (6 == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "shouldNativeOauthIntercept from oauth");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (com.tencent.mm.plugin.webview.model.m2.f183013a == null && !com.tencent.mm.plugin.webview.model.m2.f183014b) {
            java.lang.String b17 = com.tencent.mm.plugin.webview.model.m2.b();
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                b17 = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fya) + "/connect/oauth2/authorize";
            }
            com.tencent.mm.plugin.webview.model.m2.f183013a = b17.split(";");
            com.tencent.mm.plugin.webview.model.m2.f183014b = true;
        }
        java.lang.String[] strArr = com.tencent.mm.plugin.webview.model.m2.f183013a;
        if (strArr == null || strArr.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "isOauthHost sOauthHostPaths nil");
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = parse.getAuthority() + parse.getPath();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "isOauthHost target nil");
            return false;
        }
        int i18 = 0;
        while (true) {
            java.lang.String[] strArr2 = com.tencent.mm.plugin.webview.model.m2.f183013a;
            if (i18 >= strArr2.length) {
                return false;
            }
            if (str2.equalsIgnoreCase(strArr2[i18])) {
                return true;
            }
            i18++;
        }
    }
}
