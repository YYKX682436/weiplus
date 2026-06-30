package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class m8 extends com.tencent.mm.plugin.webview.ui.tools.jsapi.r8 {
    public m8(com.tencent.mm.plugin.webview.ui.tools.jsapi.l8 l8Var) {
        super(null);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.r8
    public java.lang.String a() {
        return jt.w.BaiduMap.h();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.r8
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 q8Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 q8Var2, java.lang.String str) {
        if (context == null) {
            super.b(context, q8Var, q8Var2, str);
            return;
        }
        java.lang.String format = java.lang.String.format("baidumap://map/direction?destination=%f,%f&mode=driving", java.lang.Double.valueOf(q8Var2.f185368a), java.lang.Double.valueOf(q8Var2.f185369b));
        if (q8Var != null) {
            format = format + java.lang.String.format("origin=%f,%f", java.lang.Double.valueOf(q8Var.f185368a), java.lang.Double.valueOf(q8Var.f185369b));
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(format + "&src=webapp.car.carroutelistmappg.weixindrivenav"));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$BaiduNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$BaiduNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenMapNavigator", e17, "", new java.lang.Object[0]);
        }
    }
}
