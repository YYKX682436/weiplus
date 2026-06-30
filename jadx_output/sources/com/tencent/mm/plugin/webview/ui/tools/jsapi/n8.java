package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class n8 extends com.tencent.mm.plugin.webview.ui.tools.jsapi.r8 {
    public n8(com.tencent.mm.plugin.webview.ui.tools.jsapi.l8 l8Var) {
        super(null);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.r8
    public java.lang.String a() {
        return jt.w.AutonaviMap.h();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.r8
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 q8Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 q8Var2, java.lang.String str) {
        if (context == null) {
            super.b(context, q8Var, q8Var2, str);
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=1&style=2", "MicroMessager", java.lang.Double.valueOf(q8Var2.f185368a), java.lang.Double.valueOf(q8Var2.f185369b))));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage(a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$GaodeNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$GaodeNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
