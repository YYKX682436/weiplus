package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185015e;

    public c2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185015e = c1Var;
        this.f185014d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        nw4.y2 y2Var = this.f185014d;
        boolean equals = y2Var.f341019i.equals("login");
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185015e;
        if (equals) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.R1;
            c1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doLogin!");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            try {
                str2 = c1Var.f184998y.getCurrentUrl();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "exception in get currentUrl %s", e17.getMessage());
                str2 = null;
            }
            java.lang.String c17 = c1Var.A.c(str2);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = c17 == null ? "" : c17;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "appId is null!");
                c1Var.i5(y2Var, "doLogin:fail", null);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
                return;
            } else {
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                k80.e eVar = (k80.e) i95.n0.c(k80.e.class);
                com.tencent.mm.plugin.webview.ui.tools.jsapi.g2 g2Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.g2(c1Var, y2Var, e8Var, str3);
                ((j80.e) eVar).getClass();
                d17.g(new bl0.c(str3, linkedList, 0, "", "", 0, -1, g2Var));
                return;
            }
        }
        if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.auth.o1.NAME)) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var2 = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.R1;
            c1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doOauthAuthorize!");
            java.lang.String str4 = (java.lang.String) y2Var.f340790a.get("scope");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "scope is null!");
                c1Var.i5(y2Var, "authorize:fail", null);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var2).a();
                return;
            }
            try {
                str = c1Var.f184998y.getCurrentUrl();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "exception in get currentUrl %s", e18.getMessage());
                str = null;
            }
            java.lang.String c18 = c1Var.A.c(str);
            java.lang.String str5 = c18 == null ? "" : c18;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "appId is null!");
                c1Var.i5(y2Var, "authorize:fail", null);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var2).a();
                return;
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str4);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    linkedList2.add(jSONArray.optString(i17));
                }
                com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
                k80.e eVar2 = (k80.e) i95.n0.c(k80.e.class);
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k2 k2Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.k2(c1Var, y2Var, e8Var2, str5);
                ((j80.e) eVar2).getClass();
                d18.g(new bl0.a(str5, null, linkedList2, 0, -1, false, k2Var));
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "Exception %s", e19.getMessage());
                c1Var.i5(y2Var, "authorize:fail", null);
            }
        }
    }
}
