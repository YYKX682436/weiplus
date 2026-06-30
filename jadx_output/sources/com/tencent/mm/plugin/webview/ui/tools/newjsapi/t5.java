package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class t5 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.t5 f186539d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t5();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        android.net.Uri uri;
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.Map map = msg.f340790a;
        boolean z17 = map == null || map.isEmpty();
        nw4.g gVar = env.f340863d;
        if (z17) {
            java.lang.String callbackId = msg.f341013c;
            kotlin.jvm.internal.o.f(callbackId, "callbackId");
            e(gVar, callbackId, "launchAppByScheme:fail", "params dic is invalid");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchAppByScheme", "schemeUrl is nil for launchAppByScheme");
            return true;
        }
        java.lang.Object obj = map.get("schemeUrl");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchAppByScheme", "schemeUrl is nil for launchAppByScheme");
            java.lang.String callbackId2 = msg.f341013c;
            kotlin.jvm.internal.o.f(callbackId2, "callbackId");
            e(gVar, callbackId2, "launchAppByScheme:fail", "schemeUrl is null");
            return true;
        }
        try {
            uri = android.net.Uri.parse(str2);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchAppByScheme", "schemeUri is not valid:" + str2);
            uri = null;
        }
        if (uri == null) {
            java.lang.String callbackId3 = msg.f341013c;
            kotlin.jvm.internal.o.f(callbackId3, "callbackId");
            e(gVar, callbackId3, "launchAppByScheme:fail", "schemeUrl is invalid");
            return true;
        }
        zg0.q2 a17 = env.a();
        com.tencent.mm.plugin.webview.core.r0 r0Var = a17 instanceof com.tencent.mm.plugin.webview.core.r0 ? (com.tencent.mm.plugin.webview.core.r0) a17 : null;
        com.tencent.mm.plugin.webview.core.z0 z0Var = r0Var != null ? r0Var.f181923d0 : null;
        if (z0Var != null) {
            android.graphics.Point point = z0Var.f182028a;
            if ((point.x == 0 && point.y == 0) ? false : true) {
                com.tencent.mm.plugin.webview.permission.d O = r0Var.O();
                int i17 = O.f183390j;
                java.lang.String str3 = O.f183386f;
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = O.f183402v;
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = O.A;
                if (str5 == null) {
                    str5 = "";
                }
                int i18 = O.F;
                android.net.Uri uri2 = uri;
                int i19 = O.G;
                int d17 = O.d();
                int i27 = O.f183383c;
                long j17 = z0Var.f182029b;
                long currentTimeMillis = j17 > 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
                r45.yg4 yg4Var = new r45.yg4();
                yg4Var.f391046d = i27;
                zg0.q2 a18 = env.a();
                if (a18 == null || (str = ((com.tencent.mm.plugin.webview.core.r0) a18).Z()) == null) {
                    str = "";
                }
                yg4Var.f391047e = str;
                yg4Var.f391048f = str2;
                yg4Var.f391060u = i17;
                yg4Var.f391050h = str3;
                yg4Var.f391051i = str4;
                yg4Var.f391052m = str5;
                yg4Var.f391053n = i18;
                yg4Var.f391054o = i19;
                yg4Var.f391055p = d17;
                yg4Var.f391057r = currentTimeMillis;
                yg4Var.f391058s = point.x;
                yg4Var.f391059t = point.y;
                yg4Var.f391056q = 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchAppByScheme", "do MMNewCheckLaunchAppReq, scene:" + yg4Var.f391046d + ", content_type:" + yg4Var.f391053n + ", appmsg_inner_type:" + yg4Var.f391054o + ", scheme_url:" + yg4Var.f391048f);
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = yg4Var;
                lVar.f70665b = new r45.zg4();
                lVar.f70666c = "/cgi-bin/micromsg-bin/newchecklaunchapp";
                lVar.f70667d = 9558;
                android.content.Context context = env.f340860a;
                if (!(context instanceof android.app.Activity)) {
                    context = r0Var.f181916a.getActivityContextIfHas();
                }
                com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
                com.tencent.mm.modelbase.o a19 = lVar.a();
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
                java.lang.String callbackId4 = msg.f341013c;
                kotlin.jvm.internal.o.f(callbackId4, "callbackId");
                ((h80.i) xVar).wi(a19, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s5(weakReference, callbackId4, uri2, new java.lang.ref.WeakReference(gVar)));
                return true;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchAppByScheme", "launchAppByScheme fail not click webview");
        java.lang.String callbackId5 = msg.f341013c;
        kotlin.jvm.internal.o.f(callbackId5, "callbackId");
        e(gVar, callbackId5, "launchAppByScheme:fail", "can not launch app without user interaction");
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return wc1.p.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "launchAppByScheme";
    }

    public final void e(nw4.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("err_desc", str3);
        gVar.e(str, str2, linkedHashMap);
    }
}
