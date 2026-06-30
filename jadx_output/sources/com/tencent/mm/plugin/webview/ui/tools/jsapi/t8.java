package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class t8 extends com.tencent.mm.plugin.webview.ui.tools.jsapi.r8 {
    public t8(com.tencent.mm.plugin.webview.ui.tools.jsapi.l8 l8Var) {
        super(null);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.r8
    public java.lang.String a() {
        return jt.w.TencentMap.h();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.r8
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 q8Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 q8Var2, java.lang.String str) {
        if (context == null) {
            super.b(context, q8Var, q8Var2, str);
            return;
        }
        java.lang.String format = java.lang.String.format("sosomap://type=nav&tocoord=%f,%f", java.lang.Double.valueOf(q8Var2.f185369b), java.lang.Double.valueOf(q8Var2.f185368a));
        if (q8Var != null) {
            format = format + java.lang.String.format("fromcoord=%f,%f", java.lang.Double.valueOf(q8Var.f185369b), java.lang.Double.valueOf(q8Var.f185368a));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                format = format + java.lang.String.format("&from=%s", java.net.URLEncoder.encode(null));
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = !com.tencent.mm.sdk.platformtools.t8.K0(null) ? null : "地图选点";
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse((format + java.lang.String.format("&to=%s", java.net.URLEncoder.encode(str))) + "&referer=wx_client"));
        intent.setPackage(a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$TencentNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$TencentNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
