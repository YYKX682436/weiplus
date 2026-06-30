package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.webcompt.f1 f187894a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187895b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.protocal.JsapiPermissionWrapper f187896c;

    /* renamed from: d, reason: collision with root package name */
    public final nw4.e f187897d;

    public r1(com.tencent.mm.plugin.webview.webcompt.f1 webComponent, java.lang.String webComptName) {
        kotlin.jvm.internal.o.g(webComponent, "webComponent");
        kotlin.jvm.internal.o.g(webComptName, "webComptName");
        this.f187894a = webComponent;
        this.f187895b = webComptName;
        this.f187897d = new com.tencent.mm.plugin.webview.webcompt.m1(this);
    }

    public static final void a(com.tencent.mm.plugin.webview.webcompt.r1 r1Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsruntime.r f17 = r1Var.f187894a.f(r1Var.f187895b);
        if (f17 != null) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) f17).evaluateJavascript(str, null);
        }
    }

    public static final void b(com.tencent.mm.plugin.webview.webcompt.r1 r1Var, java.lang.String str) {
        nw4.n nVar;
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        java.lang.ref.WeakReference weakReference = r1Var.f187894a.f187811a;
        if (weakReference == null || (nVar = (nw4.n) weakReference.get()) == null) {
            return;
        }
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = r1Var.f187896c;
        if (jsapiPermissionWrapper == null) {
            kotlin.jvm.internal.o.o("jsPerm");
            throw null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, r1Var.f187895b);
        nw4.e eVar = r1Var.f187897d;
        boolean z17 = false;
        nw4.y2 y2Var = (nw4.y2) ((java.util.LinkedList) nw4.z2.b("[" + str + "]", false, nVar.f340904r)).remove(0);
        if (y2Var != null) {
            try {
                z17 = nVar.f340899m.ja(nVar.f340906t);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "isBusy, ex = " + e17.getMessage());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "checkIsMsgQueueBusy isBusy = " + z17);
            if (z17 && (n3Var = nVar.f340892f) != null) {
                y2Var.f341015e = bundle;
                y2Var.f341016f = jsapiPermissionWrapper;
                y2Var.f341017g = eVar;
                n3Var.post(new nw4.m2(nVar, y2Var));
                return;
            }
        }
        if (nVar.f340894h) {
            return;
        }
        nVar.m(y2Var, jsapiPermissionWrapper, bundle, eVar);
    }

    @android.webkit.JavascriptInterface
    public final void cgi(java.lang.String callbackId, java.lang.String request) {
        kotlin.jvm.internal.o.g(callbackId, "callbackId");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.webview.webcompt.s1 s1Var = this.f187894a.f187812b;
        if (s1Var != null) {
            s1Var.a(com.tencent.mm.plugin.webview.webcompt.b.f187743J);
        }
        com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g97 g97Var = new r45.g97();
        g97Var.f375029d = request;
        lVar.f70664a = g97Var;
        lVar.f70665b = new r45.h97();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/webcompt/webcomptcommcgi";
        lVar.f70667d = 2936;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ((h80.i) xVar).wi(lVar.a(), new com.tencent.mm.plugin.webview.webcompt.n1(this, callbackId));
    }

    @android.webkit.JavascriptInterface
    public final void errReport(java.lang.String errMsg, java.lang.String errStack, int i17, int i18) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(errStack, "errStack");
        this.f187894a.g(this.f187895b, errMsg, errStack, i17, i18);
    }

    @android.webkit.JavascriptInterface
    public final void idkey(long j17, long j18, long j19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, j18, j19);
    }

    @android.webkit.JavascriptInterface
    public final void idkeyList(java.lang.String list) {
        kotlin.jvm.internal.o.g(list, "list");
        cl0.e eVar = new cl0.e(list);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = eVar.length();
        for (int i17 = 0; i17 < length; i17++) {
            cl0.e a17 = eVar.a(i17);
            linkedList.add(new com.tencent.mars.smc.IDKey(a17.getLong(0), a17.getLong(1), a17.getLong(2)));
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(new java.util.ArrayList(linkedList), false, false);
    }

    @android.webkit.JavascriptInterface
    public final void invoke(java.lang.String message) {
        kotlin.jvm.internal.o.g(message, "message");
        if (message.length() == 0) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            b(this, message);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.webcompt.o1(this, message));
        }
    }

    @android.webkit.JavascriptInterface
    public final void kv(int i17, java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, data);
    }

    @android.webkit.JavascriptInterface
    public final void log(int i17, java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = "webCompt[" + tag + ']';
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i(str, msg);
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.w(str, msg);
        } else if (i17 == 4) {
            com.tencent.mars.xlog.Log.e(str, msg);
        } else {
            if (i17 != 5) {
                return;
            }
            com.tencent.mars.xlog.Log.f(str, msg);
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String performance(java.lang.String frontEndPerformance) {
        java.lang.String str;
        o25.k2 k2Var;
        kotlin.jvm.internal.o.g(frontEndPerformance, "frontEndPerformance");
        com.tencent.mm.plugin.webview.webcompt.f1 f1Var = this.f187894a;
        f1Var.getClass();
        java.lang.String webCompt = this.f187895b;
        kotlin.jvm.internal.o.g(webCompt, "webCompt");
        com.tencent.mm.plugin.webview.webcompt.k0 k0Var = (com.tencent.mm.plugin.webview.webcompt.k0) f1Var.k().get(webCompt);
        if (k0Var == null || (k2Var = k0Var.f187849l) == null) {
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.List<com.tencent.mm.plugin.webview.webcompt.j0> i17 = kz5.c0.i(com.tencent.mm.plugin.webview.webcompt.j0.f187828f, com.tencent.mm.plugin.webview.webcompt.j0.f187830h, com.tencent.mm.plugin.webview.webcompt.j0.f187831i, com.tencent.mm.plugin.webview.webcompt.j0.f187829g);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (com.tencent.mm.plugin.webview.webcompt.j0 j0Var : i17) {
                java.lang.String str2 = j0Var.f187833d + "_START";
                long j17 = k2Var.f342550a;
                linkedList.add(java.lang.String.valueOf(k2Var.b(str2, j17) - j17));
                linkedList.add(java.lang.String.valueOf(k2Var.b(j0Var.f187833d + "_END", j17) - j17));
            }
            sb6.append(kz5.n0.g0(linkedList, ",", null, ",", 0, null, null, 58, null) + r26.i0.s("0,", (9 - i17.size()) * 2));
            sb6.append(frontEndPerformance);
            str = sb6.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "performance: " + str);
            java.lang.Object[] objArr = new java.lang.Object[6];
            nw4.n nVar = (nw4.n) f1Var.f187811a.get();
            java.lang.String str3 = nVar != null ? nVar.f340888b : null;
            if (str3 == null) {
                str3 = "";
            }
            java.util.HashMap hashMap = com.tencent.mm.plugin.webview.webcompt.a.f187737a;
            objArr[0] = fp.s0.b(str3, com.tencent.mapsdk.internal.rv.f51270c);
            java.lang.String str4 = k0Var.f187845h;
            kotlin.jvm.internal.o.g(str4, "<this>");
            objArr[1] = fp.s0.b(str4, com.tencent.mapsdk.internal.rv.f51270c);
            objArr[2] = k0Var.f187844g;
            objArr[3] = webCompt;
            objArr[4] = java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.webview.webcompt.f1.f187797e.j().f187823b).getValue()).intValue());
            objArr[5] = k0Var.f187848k;
            java.lang.String g07 = kz5.n0.g0(kz5.c0.i(objArr), ",", null, ",", 0, null, null, 58, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(18151, g07 + str);
        }
        return str == null ? "" : str;
    }

    @android.webkit.JavascriptInterface
    public final void refreshA8Key(java.lang.String callbackId) {
        kotlin.jvm.internal.o.g(callbackId, "callbackId");
        com.tencent.mm.plugin.webview.webcompt.p1 p1Var = new com.tencent.mm.plugin.webview.webcompt.p1(this);
        com.tencent.mm.plugin.webview.webcompt.q1 q1Var = new com.tencent.mm.plugin.webview.webcompt.q1(this, callbackId);
        com.tencent.mm.plugin.webview.webcompt.f1 f1Var = this.f187894a;
        f1Var.getClass();
        java.lang.String webCompt = this.f187895b;
        kotlin.jvm.internal.o.g(webCompt, "webCompt");
        com.tencent.mm.plugin.webview.webcompt.k0 k0Var = (com.tencent.mm.plugin.webview.webcompt.k0) f1Var.k().get(webCompt);
        if (k0Var == null || !(!r26.n0.N(k0Var.f187846i))) {
            return;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.webview.webcompt.d1(f1Var, k0Var, q1Var, p1Var, null), 3, null);
    }

    @android.webkit.JavascriptInterface
    public final void sendMessage(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.webview.webcompt.f1 f1Var = this.f187894a;
        f1Var.getClass();
        pm0.v.X(new com.tencent.mm.plugin.webview.webcompt.z0(f1Var, "window.WeixinOpenTags && window.WeixinOpenTags.onMessage(" + data + ')', com.tencent.mm.plugin.webview.webcompt.x0.f187946d));
        f1Var.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.I);
    }
}
