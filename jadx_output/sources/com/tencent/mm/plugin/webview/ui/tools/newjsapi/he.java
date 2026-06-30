package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class he extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.he f186238d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.he();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String[] strArr;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = env.f340860a instanceof android.app.Activity;
        nw4.g gVar = env.f340863d;
        if (!z17 || !(gVar instanceof nw4.n)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateMultiPickerView", "context error!");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, context error", null);
            return false;
        }
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        com.tencent.mm.ui.widget.picker.c0 c0Var = ((nw4.n) gVar).f340912z.f340797a;
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateMultiPickerView", "picker is null");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, picker view is null, please showMultiPicker firstly!", null);
            return false;
        }
        if (!c0Var.A) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateMultiPickerView", "picker.isDisableLink = false");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, update mod is not support for link", null);
            return false;
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(java.lang.String.valueOf(((java.util.HashMap) msg.f340790a).get("column")), 0);
        java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("array");
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1(java.lang.String.valueOf(((java.util.HashMap) msg.f340790a).get("current")), 0);
        if (obj != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(obj.toString());
                int length = jSONArray.length();
                strArr = new java.lang.String[length];
                for (int i17 = 0; i17 < length; i17++) {
                    strArr[i17] = jSONArray.get(i17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateMultiPickerView", e17.getMessage());
                gVar.e(msg.f341013c, msg.f341019i + ":fail, json parse error", null);
                return false;
            }
        } else {
            strArr = 0;
        }
        if (D1 == 0) {
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = c0Var.f212256q;
            if (customOptionPickNew != null) {
                customOptionPickNew.setOptionsArray(strArr);
            }
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = c0Var.f212256q;
            if (customOptionPickNew2 != null) {
                customOptionPickNew2.setValue(D12);
                c0Var.f212256q.c(D12);
            }
        } else if (D1 == 1) {
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew3 = c0Var.f212257r;
            if (customOptionPickNew3 != null) {
                customOptionPickNew3.setOptionsArray(strArr);
            }
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew4 = c0Var.f212257r;
            if (customOptionPickNew4 != null) {
                customOptionPickNew4.setValue(D12);
                c0Var.f212257r.c(D12);
            }
        } else if (D1 != 2) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail, index error", null);
        } else {
            if (!c0Var.f()) {
                gVar.e(msg.f341013c, msg.f341019i + ":fail, index error", null);
                return false;
            }
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew5 = c0Var.f212258s;
            if (customOptionPickNew5 != null) {
                customOptionPickNew5.setOptionsArray(strArr);
            }
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew6 = c0Var.f212258s;
            if (customOptionPickNew6 != null) {
                customOptionPickNew6.setValue(D12);
                c0Var.f212258s.c(D12);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 449;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "updateMultiPickerView";
    }
}
