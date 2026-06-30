package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ud extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ud f186564d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ud();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("array");
        boolean z17 = str == null || r26.n0.N(str);
        nw4.g gVar = env.f340863d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowPickerView", "showPickerView array is null");
            gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
            return false;
        }
        android.content.Context context = env.f340860a;
        if (context == null || !(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowPickerView", "context error!");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, context error", null);
            return false;
        }
        try {
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) msg.f340790a.get("current"), 0);
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowPickerView", "showPickerView as selector, empty range");
                gVar.e(msg.f341013c, msg.f341019i + "fail", null);
                return true;
            }
            java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                strArr[i17] = jSONArray.getString(i17);
            }
            com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(context, strArr);
            try {
                c0Var.i(P);
                c0Var.f212259t = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.td(c0Var, env, msg);
                java.lang.Object obj = msg.f340790a.get("headerText");
                java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bmm, (android.view.ViewGroup) null);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hp9);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(str2);
                    c0Var.g(inflate);
                }
                c0Var.l();
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowPickerView", e17.getMessage());
                gVar.e(msg.f341013c, msg.f341019i + ":fail, index error", null);
                return false;
            }
        } catch (java.lang.Exception e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowPickerView", "showPickerView exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            gVar.e(msg.f341013c, msg.f341019i + "fail", null);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 447;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "showPickerView";
    }
}
