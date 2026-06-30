package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class yc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc f186685d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc();

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc f186686e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc f186687f;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc f186688g;

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc f186689h;

    public static final java.util.HashMap e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc ycVar, com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        ycVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str6 = "";
        if (scVar == null || (str = scVar.f186529f) == null) {
            str = "";
        }
        hashMap.put("share_report_pre_msg_icon_url", str);
        if (scVar == null || (str2 = scVar.f186528e) == null) {
            str2 = "";
        }
        hashMap.put("share_report_pre_msg_desc", str2);
        if (scVar == null || (str3 = scVar.f186526c) == null) {
            str3 = "";
        }
        hashMap.put("share_report_pre_msg_title", str3);
        if (scVar == null || (str4 = scVar.f186527d) == null) {
            str4 = "";
        }
        hashMap.put("share_report_pre_msg_url", str4);
        if (scVar != null && (str5 = scVar.f186530g) != null) {
            str6 = str5;
        }
        hashMap.put("share_report_pre_msg_appid", str6);
        return hashMap;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = env.f340860a instanceof android.app.Activity;
        nw4.g gVar = env.f340863d;
        if (!z17 || !(gVar instanceof nw4.n)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "context error!");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, context error", null);
            return false;
        }
        java.lang.String str = (java.lang.String) msg.f340790a.get("friend");
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("timeline");
        java.lang.String str3 = (java.lang.String) msg.f340790a.get("menuItems");
        java.lang.String str4 = (java.lang.String) msg.f340790a.get("opItems");
        f186686e = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc(str);
        f186687f = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc(str2);
        f186688g = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc(str3);
        f186689h = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc(str4);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar = f186686e;
        kotlin.jvm.internal.o.d(scVar);
        if (!scVar.f186417b) {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar2 = f186687f;
            kotlin.jvm.internal.o.d(scVar2);
            if (!scVar2.f186417b) {
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar = f186688g;
                kotlin.jvm.internal.o.d(rcVar);
                if (!rcVar.f186417b) {
                    com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar2 = f186689h;
                    kotlin.jvm.internal.o.d(rcVar2);
                    if (!rcVar2.f186417b) {
                        com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar3 = f186686e;
                        kotlin.jvm.internal.o.d(scVar3);
                        if (scVar3.f186416a) {
                            com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar4 = f186686e;
                            kotlin.jvm.internal.o.d(scVar4);
                            if (!scVar4.a()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "shareFriendData isNotAvailable, friendStr = " + str);
                                gVar.e(msg.f341013c, msg.f341019i + ":fail, add share item, but friend data lack", null);
                                return false;
                            }
                        }
                        com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar5 = f186686e;
                        kotlin.jvm.internal.o.d(scVar5);
                        if (scVar5.f186416a) {
                            com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar6 = f186687f;
                            kotlin.jvm.internal.o.d(scVar6);
                            if (!scVar6.a()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "timelineTLData isNotAvailable, timelineStr = " + str2);
                                gVar.e(msg.f341013c, msg.f341019i + ":fail, add timeline item, but timeline data lack", null);
                                return false;
                            }
                        }
                        com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar7 = f186686e;
                        kotlin.jvm.internal.o.d(scVar7);
                        if (!scVar7.f186416a) {
                            com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar8 = f186687f;
                            kotlin.jvm.internal.o.d(scVar8);
                            if (!scVar8.f186416a) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "have to add either share friend or timeline!");
                                gVar.e(msg.f341013c, msg.f341019i + ":fail, have to add either share friend or timeline!", null);
                                return false;
                            }
                        }
                        com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar3 = f186688g;
                        kotlin.jvm.internal.o.d(rcVar3);
                        if (rcVar3.f186416a) {
                            com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar4 = f186688g;
                            kotlin.jvm.internal.o.d(rcVar4);
                            if (!rcVar4.a()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "menuItemsData isNotAvailable, timelineStr = " + str2);
                                gVar.e(msg.f341013c, msg.f341019i + ":fail, add menuItemsData item, but menuItemsData data lack", null);
                                return false;
                            }
                        }
                        com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar5 = f186689h;
                        kotlin.jvm.internal.o.d(rcVar5);
                        if (rcVar5.f186416a) {
                            com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar6 = f186689h;
                            kotlin.jvm.internal.o.d(rcVar6);
                            if (!rcVar6.a()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "opItemsData isNotAvailable, timelineStr = " + str2);
                                gVar.e(msg.f341013c, msg.f341019i + ":fail, add opItemsData item, but opItemsData data lack", null);
                                return false;
                            }
                        }
                        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(env.f340860a, 0, false);
                        k0Var.f211872n = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.tc(env);
                        k0Var.f211874o = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.uc(env);
                        android.content.Context context = env.f340860a;
                        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
                        if (webViewUI == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "webViewUI == null!");
                            gVar.e(msg.f341013c, msg.f341019i + ":fail, webViewUI == null", null);
                            return false;
                        }
                        com.tencent.mm.plugin.webview.core.e3 controller = webViewUI.L1;
                        kotlin.jvm.internal.o.f(controller, "controller");
                        hy4.m0 recentForwardReporter = webViewUI.f183849q2.f184052i;
                        kotlin.jvm.internal.o.f(recentForwardReporter, "recentForwardReporter");
                        com.tencent.mm.plugin.webview.ui.tools.newjsapi.vc vcVar = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.vc(env);
                        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                        com.tencent.mm.pluginsdk.forward.m mVar = new com.tencent.mm.pluginsdk.forward.m();
                        k0Var.f211876p = new com.tencent.mm.plugin.webview.ui.tools.widget.p(k0Var, mVar, webViewUI, controller, recentForwardReporter, null);
                        k0Var.f211885w = new com.tencent.mm.plugin.webview.ui.tools.widget.r(mVar, recentForwardReporter, vcVar, controller);
                        k0Var.f211886x = new com.tencent.mm.plugin.webview.ui.tools.widget.s(mVar, k0Var);
                        k0Var.f211881s = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wc(env);
                        k0Var.f211884v = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.xc(env);
                        k0Var.v();
                        return true;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "menuItem or opItem, json parse fail");
                gVar.e(msg.f341013c, msg.f341019i + ":fail, menuItem or opItem, json parse fail!", null);
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "share friends or timeline, json parse fail");
        gVar.e(msg.f341013c, msg.f341019i + ":fail, share friends or timeline, json parse fail!", null);
        return false;
    }

    @Override // nw4.q2
    public int b() {
        return 368;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "shareCustomContent";
    }
}
