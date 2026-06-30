package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class s2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.s2 f186512d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("opCode");
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        nw4.g gVar = env.f340863d;
        if (D1 != 0) {
            gVar.e(msg.f341013c, "gotoSetting:fail opCode is not defined", null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("JsApiGotoSettingTAG", "opCode 0");
        android.content.Context context = env.f340860a;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        java.lang.String str = zc.c.f471340c;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
            throw null;
        }
        intent.setData(android.net.Uri.fromParts("package", str, null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGotoSetting", "openAppSettings", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGotoSetting", "openAppSettings", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        gVar.e(msg.f341013c, "gotoSetting:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "gotoSetting";
    }
}
