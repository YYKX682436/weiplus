package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class s8 extends com.tencent.mm.plugin.webview.ui.tools.jsapi.r8 {
    public s8(com.tencent.mm.plugin.webview.ui.tools.jsapi.l8 l8Var) {
        super(null);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.r8
    public java.lang.String a() {
        return jt.w.SogouMap.h();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.r8
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 q8Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 q8Var2, java.lang.String str) {
        java.lang.String str2;
        if (context == null) {
            super.b(context, q8Var, q8Var2, str);
            return;
        }
        java.lang.String format = java.lang.String.format("wechatnav://type=nav&tocoord=%f,%f", java.lang.Double.valueOf(q8Var2.f185368a), java.lang.Double.valueOf(q8Var2.f185369b));
        if (q8Var != null) {
            str2 = format + java.lang.String.format("&fromcoord=%f,%f", java.lang.Double.valueOf(q8Var.f185368a), java.lang.Double.valueOf(q8Var.f185369b));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                str2 = str2 + java.lang.String.format("&from=%s", java.net.URLEncoder.encode(null));
            }
        } else {
            str2 = format + java.lang.String.format("&from=%s", com.tencent.map.lib.models.AccessibleTouchItem.MY_LOCATION_PREFIX);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = !com.tencent.mm.sdk.platformtools.t8.K0(null) ? null : "目的地";
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str2 + java.lang.String.format("&to=%s", str)));
        intent.setPackage(a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$SogouNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$SogouNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
