package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class z1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "launch3rdApp";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        android.content.pm.Signature signature;
        java.lang.String g17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunch3RdApp", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_data", null);
            return;
        }
        int optInt = e17.optInt("type");
        java.lang.String optString = e17.optString("appID");
        if (optInt == 0) {
            java.lang.String optString2 = e17.optString("extInfo");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunch3RdApp", "appid:[%s], extinfo:[%s]", optString, optString2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunch3RdApp", "appid is null or nil");
                q5Var.a("fail", null);
                return;
            }
            if (!((com.tencent.mm.app.o7) dw4.a.f244298b).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, optString)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunch3RdApp", "app is not installed, appid:[%s]", optString);
                q5Var.a("fail", null);
                return;
            }
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
            wXAppExtendObject.extInfo = optString2;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
            wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
            wXMediaMessage.messageExt = optString2;
            com.tencent.mm.autogen.events.Launch3RdAppEvent launch3RdAppEvent = new com.tencent.mm.autogen.events.Launch3RdAppEvent();
            am.ki kiVar = launch3RdAppEvent.f54461g;
            kiVar.f7149a = wXMediaMessage;
            kiVar.f7150b = optString;
            kiVar.f7152d = context;
            kiVar.f7153e = new com.tencent.mm.plugin.webview.luggage.jsapi.x1(this, q5Var);
            launch3RdAppEvent.e();
            return;
        }
        if (optInt != 1) {
            q5Var.a("invalid_type", null);
            return;
        }
        java.lang.String optString3 = e17.optString("signature");
        java.lang.String optString4 = e17.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        java.lang.String optString5 = e17.optString("param");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp, signature:[%s], packageName:[%s], param:[%s]", optString3, optString4, optString5);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3) || com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp invalid_args");
            q5Var.a("invalid_args", null);
            return;
        }
        if (!com.tencent.mm.pluginsdk.model.app.j1.f(context, optString4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp not_install");
            if (!com.tencent.mm.sdk.platformtools.t8.w0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                q5Var.a("not_install", null);
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp isAffectedByPackageVisibility");
                f(context, optString4, e17, optString5, q5Var);
                return;
            }
        }
        android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, optString4, false);
        if (a17 != null && (signature = a17[0]) != null && (g17 = kk.k.g(signature.toByteArray())) != null && g17.equalsIgnoreCase(optString3)) {
            f(context, optString4, e17, optString5, q5Var);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp signature_mismatch");
            q5Var.a("signature_mismatch", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final void f(android.content.Context context, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        android.content.Intent launchIntentForPackage;
        java.lang.String optString = jSONObject.optString("currentUrl");
        java.lang.String optString2 = jSONObject.optString("preVerifyAppId");
        try {
            launchIntentForPackage = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getLaunchIntentForPackage(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp getLaunchIntentForPackage, %s", e17.getMessage());
        }
        if (launchIntentForPackage == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp  intent == null, pkg:" + str);
            q5Var.a("fail", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp  intent != null, pkg:" + str);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.pluginsdk.model.app.j1.i(bundle, str2);
        launchIntentForPackage.putExtras(bundle);
        launchIntentForPackage.addFlags(268435456);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("current_page_url", optString);
        bundle2.putString("current_page_appid", optString2);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.tencent.mm.plugin.webview.luggage.jsapi.y1 y1Var = new com.tencent.mm.plugin.webview.luggage.jsapi.y1(this, str, q5Var);
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.w.v(context, launchIntentForPackage, null, y1Var, bundle2);
    }
}
