package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class bb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCString f185979f;

    public bb(nw4.k kVar, nw4.y2 y2Var, com.tencent.mm.ipcinvoker.type.IPCString iPCString) {
        this.f185977d = kVar;
        this.f185978e = y2Var;
        this.f185979f = iPCString;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = this.f185979f;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        nw4.y2 y2Var = this.f185978e;
        java.lang.Object obj = y2Var.f340790a.get("requestName");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.Object obj2 = y2Var.f340790a.get("requestIconUrl");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        nw4.k kVar = this.f185977d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(kVar.f340860a, 0, 0, false);
        z2Var.f212058g.setBackgroundColor(kVar.f340860a.getResources().getColor(com.tencent.mm.R.color.aaw));
        android.view.View inflate = android.view.View.inflate(kVar.f340860a, com.tencent.mm.R.layout.d9w, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lzs);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.lzw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.kuo);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.kup);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.b3v);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.b3w);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.lzn);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.lzx);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        findViewById7.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.db(z2Var, kVar, y2Var));
        findViewById8.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.eb(z2Var, str, kVar, y2Var));
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.fb(z2Var, kVar, y2Var));
        ((android.widget.TextView) findViewById2).setText((java.lang.String) obj);
        o11.f fVar = new o11.f();
        boolean z17 = true;
        fVar.f342079c = true;
        fVar.f342091o = com.tencent.mm.R.raw.default_avatar_round;
        fVar.f342096t = true;
        n11.a.b().h((java.lang.String) obj2, (android.widget.ImageView) findViewById, fVar.a());
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            textView.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById6, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setTextColor(kVar.f340860a.getResources().getColor(com.tencent.mm.R.color.f479232tk));
            textView.setText(kVar.f340860a.getText(com.tencent.mm.R.string.l6c));
        } else {
            textView.setVisibility(0);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(str);
        }
        z2Var.j(inflate);
        z2Var.C();
    }
}
