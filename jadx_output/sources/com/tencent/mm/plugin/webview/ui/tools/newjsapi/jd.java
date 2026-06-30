package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class jd extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.jd f186291d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.jd();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = env.f340860a;
        boolean z17 = context instanceof android.app.Activity;
        nw4.g gVar = env.f340863d;
        if (!z17 || !(gVar instanceof nw4.n)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowMultiPickerView", "context error!");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, context error", null);
            return false;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.Object obj = msg.f340790a.get("array");
        java.lang.Object obj2 = msg.f340790a.get("current");
        java.lang.Object obj3 = msg.f340790a.get("headerText");
        java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (obj2 != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(obj2.toString());
                int length = jSONArray.length();
                java.lang.Integer[] numArr = new java.lang.Integer[length];
                for (int i17 = 0; i17 < length; i17++) {
                    numArr[i17] = jSONArray.get(i17);
                }
                arrayList3 = (java.util.ArrayList) kz5.z.z0(numArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowMultiPickerView", e17.getMessage());
                gVar.e(msg.f341013c, msg.f341019i + ":fail, json parse error", null);
                return false;
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        if (obj != null) {
            arrayList2 = new java.util.ArrayList();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(obj.toString());
            int length2 = jSONArray2.length();
            for (int i18 = 0; i18 < length2; i18++) {
                org.json.JSONArray optJSONArray = jSONArray2.optJSONArray(i18);
                kotlin.jvm.internal.o.f(optJSONArray, "optJSONArray(...)");
                int length3 = optJSONArray.length();
                java.lang.String[] strArr = new java.lang.String[length3];
                for (int i19 = 0; i19 < length3; i19++) {
                    strArr[i19] = optJSONArray.get(i19);
                }
                arrayList2.add(nf.e.e(strArr));
            }
        }
        if (arrayList2.size() < 2 || arrayList2.size() > 3) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail, array size error!", null);
            return false;
        }
        java.lang.Object obj4 = arrayList2.get(0);
        kotlin.jvm.internal.o.f(obj4, "get(...)");
        java.util.ArrayList arrayList5 = (java.util.ArrayList) obj4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        int size = ((java.util.ArrayList) arrayList2.get(0)).size();
        for (int i27 = 0; i27 < size; i27++) {
            arrayList6.add(arrayList2.get(1));
        }
        if (arrayList2.size() == 3) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            int size2 = ((java.util.ArrayList) arrayList2.get(0)).size() * ((java.util.ArrayList) arrayList2.get(1)).size();
            for (int i28 = 0; i28 < size2; i28++) {
                arrayList7.add(arrayList2.get(2));
            }
            arrayList = arrayList7;
        } else {
            arrayList = null;
        }
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(context, arrayList5, arrayList6, arrayList, true);
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).f340912z.f340797a = c0Var;
        c0Var.B = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gd(env);
        c0Var.C = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.hd(env);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bmm, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hp9);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hp8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((java.lang.CharSequence) null);
            }
            c0Var.g(inflate);
        }
        try {
            if (c0Var.f()) {
                java.lang.Object obj5 = arrayList4.get(0);
                kotlin.jvm.internal.o.f(obj5, "get(...)");
                int intValue = ((java.lang.Number) obj5).intValue();
                java.lang.Object obj6 = arrayList4.get(1);
                kotlin.jvm.internal.o.f(obj6, "get(...)");
                int intValue2 = ((java.lang.Number) obj6).intValue();
                java.lang.Object obj7 = arrayList4.get(2);
                kotlin.jvm.internal.o.f(obj7, "get(...)");
                c0Var.k(intValue, intValue2, ((java.lang.Number) obj7).intValue());
            } else {
                java.lang.Object obj8 = arrayList4.get(0);
                kotlin.jvm.internal.o.f(obj8, "get(...)");
                int intValue3 = ((java.lang.Number) obj8).intValue();
                java.lang.Object obj9 = arrayList4.get(1);
                kotlin.jvm.internal.o.f(obj9, "get(...)");
                c0Var.j(intValue3, ((java.lang.Number) obj9).intValue());
            }
            c0Var.f212260u = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.id(c0Var, env, msg);
            c0Var.l();
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowMultiPickerView", e18.getMessage());
            gVar.e(msg.f341013c, msg.f341019i + ":fail, index error", null);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wcdb.FileUtils.S_IRWXU;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "showMultiPickerView";
    }
}
