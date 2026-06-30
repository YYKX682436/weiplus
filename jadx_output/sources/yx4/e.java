package yx4;

/* loaded from: classes7.dex */
public abstract class e extends qw4.a {
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String url;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        try {
            if (com.tencent.mm.plugin.webview.core.s1.f181972a.a()) {
                dp.a.makeText(env.f340860a, c() + " called", 0).show();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiTransferRequestBase", e17, "showToast exception", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo();
        transferRequestInfo.f93913d = e();
        java.lang.Object obj = msg.f340790a.get("scope");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        transferRequestInfo.f93915f = str;
        zg0.q2 a17 = env.a();
        if (a17 == null || (url = ((com.tencent.mm.plugin.webview.core.r0) a17).Z()) == null) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
            url = mMWebView != null ? mMWebView.getUrl() : null;
            if (url == null) {
                url = "";
            }
        }
        zq1.q0 q0Var = zq1.q0.f475019a;
        if (url.length() == 0) {
            url = "";
        } else if (r26.i0.y(url, "file", false)) {
            java.util.Iterator it = ((java.util.HashMap) ((jz5.n) zq1.q0.f475020b).getValue()).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (r26.i0.y(url, (java.lang.String) entry.getKey(), false)) {
                    java.lang.String str2 = (java.lang.String) entry.getValue();
                    com.tencent.mars.xlog.Log.i("TransferRequestUrlInterceptor", "transferRequest interceptUrl url: %s, result: %s", url, str2);
                    url = str2;
                    break;
                }
            }
        }
        transferRequestInfo.f93914e = url;
        r45.y24 y24Var = new r45.y24();
        java.lang.Object obj2 = msg.f340790a.get("reqUrl");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str3 == null) {
            str3 = "";
        }
        y24Var.f390725d = str3;
        java.lang.Object obj3 = msg.f340790a.get("reqBody");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str4 == null) {
            str4 = "";
        }
        y24Var.f390726e = str4;
        java.lang.Object obj4 = msg.f340790a.get("cgiCmdId");
        y24Var.f390727f = com.tencent.mm.sdk.platformtools.t8.D1(obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null, 0);
        java.lang.Object obj5 = msg.f340790a.get(ya.b.METHOD);
        y24Var.f390729h = com.tencent.mm.sdk.platformtools.t8.D1(obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null, 0);
        transferRequestInfo.f93917h = y24Var;
        transferRequestInfo.f93918i = java.lang.Boolean.parseBoolean((java.lang.String) msg.f340790a.get("is_security_check"));
        zq1.f0 f0Var = (zq1.f0) gm0.j1.s(zq1.f0.class);
        java.lang.Object obj6 = msg.f340790a.get("debug_env");
        java.lang.String str5 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String b17 = ((js1.m) f0Var).b(str5);
        if (b17 == null) {
            b17 = "";
        }
        transferRequestInfo.f93924r = b17;
        try {
            java.lang.Object obj7 = msg.f340790a.get("header");
            java.lang.String str6 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
            if (str6 == null) {
                str6 = "";
            }
            if (str6.length() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str6);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                kotlin.jvm.internal.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.String optString = jSONObject.optString(next);
                    if (optString == null) {
                        optString = "";
                    }
                    java.util.LinkedList linkedList = transferRequestInfo.f93917h.f390728g;
                    r45.cw3 cw3Var = new r45.cw3();
                    cw3Var.f371860d = next;
                    cw3Var.f371861e = optString;
                    linkedList.push(cw3Var);
                }
            }
            java.lang.Object obj8 = msg.f340790a.get("debug_cookies");
            java.lang.String str7 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
            if (str7 == null) {
                str7 = "";
            }
            if (str7.length() > 0) {
                transferRequestInfo.f93925s = new org.json.JSONObject(str7).optString("route_tag", "");
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiTransferRequestBase", e18, "parseTransferRequestInfo exception", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1454L, 183L, 1L);
        zq1.f0 f0Var2 = (zq1.f0) gm0.j1.s(zq1.f0.class);
        java.lang.String str8 = msg.f341013c;
        ((js1.m) f0Var2).c(transferRequestInfo, new yx4.d(str8 != null ? str8 : "", c(), new java.lang.ref.WeakReference(env.f340863d)));
        return true;
    }

    public abstract int e();
}
