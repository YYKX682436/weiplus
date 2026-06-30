package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class k5 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5 f186304d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f186305e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f186306f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f186307g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f186308h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f186309i;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f186310m;

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f186311n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f186312o;

    static {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5 k5Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5();
        f186304d = k5Var;
        f186305e = cf.b.a(k5Var);
        f186306f = 345;
        f186307g = "handleMPPageAction";
        f186308h = true;
        f186309i = jz5.h.b(com.tencent.mm.plugin.webview.ui.tools.newjsapi.u4.f186557d);
        f186310m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_can_share_url_exceprt, false);
        f186311n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_android_excerpt_share_image, 0) == 1;
        f186312o = 524288;
    }

    public static final int e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5 k5Var, int i17, android.content.Intent intent) {
        k5Var.getClass();
        int i18 = 0;
        if (i17 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
            if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
                java.util.Iterator<T> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    i18 = com.tencent.mm.storage.z3.R4((java.lang.String) it.next()) ? i18 | 1 : i18 | 2;
                }
            }
        }
        return i18;
    }

    public final boolean A(nw4.k kVar, nw4.y2 y2Var) {
        float f17;
        android.app.Activity a17 = q75.a.a(kVar.f340860a);
        nw4.g gVar = kVar.f340863d;
        if (a17 == null) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        int c17 = com.tencent.mm.ui.bl.c(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction navBarHeight=" + c17);
        java.util.HashMap hashMap = new java.util.HashMap();
        float f18 = (float) c17;
        android.content.Context context = kVar.f340860a;
        if (context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183815f;
            f17 = mMWebView != null ? mMWebView.getMMDensity() : j65.f.f();
        } else {
            f17 = j65.f.f();
        }
        hashMap.put("height", java.lang.Float.valueOf(f18 / f17));
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        return true;
    }

    public final boolean B(nw4.k kVar, nw4.y2 y2Var) {
        boolean d17;
        nw4.g gVar;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getPosition");
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = kVar.f340860a;
            ((sb0.f) jVar).getClass();
            d17 = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true);
            gVar = kVar.f340863d;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandleMPPageAction", "getPosition outer fail e:%s", e17.getMessage());
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail interal error", null);
        }
        if (!d17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getPosition no system permission");
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail permission denied", null);
            return true;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227167r)) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.webview.ui.tools.newjsapi.d.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.q4(kVar, y2Var));
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getPosition no business permission");
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail business permission denied", null);
        return true;
    }

    public final boolean C(nw4.k kVar, nw4.y2 y2Var) {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.Object l17 = gm0.j1.u().c().l(66832, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
            z17 = ((java.lang.Boolean) l17).booleanValue();
        } else {
            z17 = true;
        }
        boolean z18 = !z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getSingleSendButton: useSingleSendButton: " + z18);
        nw4.g gVar = kVar.f340863d;
        java.lang.String str = y2Var.f341013c;
        java.lang.String str2 = y2Var.f341019i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("useSingleSendButton", java.lang.Integer.valueOf(z18 ? 1 : 0));
        gVar.e(str, str2, hashMap);
        return true;
    }

    public final boolean D(nw4.k kVar, nw4.y2 y2Var) {
        qk.s6 s6Var = (qk.s6) gm0.j1.s(qk.s6.class);
        boolean z17 = false;
        boolean isTeenMode = s6Var != null ? s6Var.isTeenMode() : false;
        if (!isTeenMode) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandleMPPageAction", "getTeenModeTemporaryVisitInfo isTeenMode = " + isTeenMode);
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail, not int teen mode now", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        zg0.q2 a17 = kVar.a();
        java.lang.String Z = a17 != null ? ((com.tencent.mm.plugin.webview.core.r0) a17).Z() : null;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if ((a0Var != null && ((yq1.z) a0Var).o(Z)) || (a17 != null && ((com.tencent.mm.plugin.webview.core.r0) a17).f181940m)) {
            z17 = true;
        }
        c0Var.f310112d = z17;
        hashMap.put("isValidVisitNoAccessPage", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.webview.ui.tools.newjsapi.v3.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r4(hashMap, c0Var, kVar, y2Var));
        return true;
    }

    public final void E(nw4.k kVar, nw4.y2 y2Var, int i17, long j17) {
        if (i17 == 1) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        }
        if (i17 == 2) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.t4 t4Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t4(kVar, y2Var);
            java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.c_d);
            o72.a5 a5Var = (o72.a5) i95.n0.c(o72.a5.class);
            android.content.Context context = kVar.f340860a;
            kotlin.jvm.internal.o.d(r17);
            ((com.tencent.mm.plugin.fav.ui.la) a5Var).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            if (context instanceof android.app.Activity) {
                com.tencent.mm.ui.widget.snackbar.j.c(r17, i65.a.r(context, com.tencent.mm.R.string.c_a), (android.app.Activity) context, com.tencent.mm.sdk.platformtools.x2.n() ? com.tencent.mm.plugin.fav.ui.ja.f101209a : new com.tencent.mm.plugin.fav.ui.ka(j17, context), t4Var);
            }
        }
    }

    public final boolean F(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) msg.f340790a.get(dm.i4.COL_ID), 0L);
        long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) msg.f340790a.get("key"), 0L);
        long V3 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) msg.f340790a.get("value"), 0L);
        nw4.g gVar = env.f340863d;
        if (V <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "idKey id can't be 0");
            gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(V, V2, V3);
        gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    public final boolean G(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("entrance");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        boolean Ni = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(7, java.lang.Integer.parseInt(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "isEnabledForCircleToSearch status:" + Ni);
        if (Ni) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", kz5.b1.e(new jz5.l("supportExtInfo", java.lang.Boolean.TRUE)));
            return true;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", kz5.b1.e(new jz5.l("err_desc", "circleToSearch is not enabled.")));
        return true;
    }

    public final boolean H(nw4.k kVar, nw4.y2 y2Var) {
        boolean z17 = kVar.f340860a instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ai()) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        } else {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        }
        return true;
    }

    public final boolean I(nw4.k kVar, nw4.y2 y2Var) {
        com.tencent.wechat.aff.chatbot.w1 w1Var;
        java.lang.String str = (java.lang.String) y2Var.f340790a.get("roominfo");
        java.lang.String str2 = (java.lang.String) y2Var.f340790a.get("extinfo");
        if (str2 == null) {
            str2 = "";
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "joinChatBotRoom: roomInfo is empty");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail roomInfo is empty", null);
            return true;
        }
        try {
            byte[] decode = android.util.Base64.decode(str, 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            com.tencent.wechat.aff.chatbot.d0 d0Var = new com.tencent.wechat.aff.chatbot.d0();
            d0Var.parseFrom(decode);
            if (str2.length() > 0) {
                byte[] decode2 = android.util.Base64.decode(str2, 0);
                kotlin.jvm.internal.o.f(decode2, "decode(...)");
                w1Var = new com.tencent.wechat.aff.chatbot.w1();
                w1Var.parseFrom(decode2);
            } else {
                w1Var = null;
            }
            ((wx.u) ((wx.e1) i95.n0.c(wx.e1.class))).wi(kVar.f340860a, d0Var, w1Var);
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        } catch (java.lang.Exception e17) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail start chatbot", null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start chatbot fail: ");
            sb6.append(e17.getMessage());
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        }
        return true;
    }

    public final boolean J(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) msg.f340790a.get(dm.i4.COL_ID), 0);
        nw4.g gVar = env.f340863d;
        if (P <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "kvStat id can't be 0");
            gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(P, (java.lang.String) msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
        gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    public final boolean K(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f340860a;
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail, is not WebviewUI", null);
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        cw4.p0 p0Var = (cw4.p0) ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183866w2.f185656g.f181745h.getValue();
        int i17 = p0Var != null ? p0Var.f224268d : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction current trans status  = " + i17 + '}');
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("status", java.lang.Integer.valueOf(i17));
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        return true;
    }

    public final boolean L(nw4.k kVar, nw4.y2 y2Var) {
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        zg0.q2 a17 = kVar.a();
        java.lang.String Z = a17 != null ? ((com.tencent.mm.plugin.webview.core.r0) a17).Z() : null;
        nw4.g gVar = kVar.f340863d;
        if (a0Var != null && (kVar.f340860a instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI)) {
            yq1.z zVar = (yq1.z) a0Var;
            if (zVar.o(Z)) {
                android.content.Context context = kVar.f340860a;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                java.lang.String stringExtra = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).getIntent().getStringExtra("srcUsername");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "openFinderLive userName null)");
                    gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
                    return true;
                }
                java.lang.String i17 = zVar.i(stringExtra);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).s(com.tencent.mm.sdk.platformtools.x2.f193071a, stringExtra, i17, 16, ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(stringExtra), null);
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "openFinderLive exportId null");
                gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "openFinderLive service pre condition check fail. url:%s", Z);
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        return true;
    }

    public final boolean M(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("jumpUrl");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = y2Var.f340790a.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.Object obj3 = y2Var.f340790a.get("downloadTitle");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.Object obj4 = y2Var.f340790a.get("confirmLabel");
        java.lang.String str6 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String str7 = str6 == null ? "" : str6;
        java.lang.Object obj5 = y2Var.f340790a.get("cancelLabel");
        java.lang.String str8 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        java.lang.String str9 = str8 != null ? str8 : "";
        if (r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "openMPApp: jumpUrl 为空");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail jumpUrl invalid", null);
            return true;
        }
        rv.q2 q2Var = (rv.q2) i95.n0.c(rv.q2.class);
        android.content.Context context = kVar.f340860a;
        ((qv.i) q2Var).getClass();
        eq1.x xVar = eq1.x.f255875a;
        kotlin.jvm.internal.o.g(context, "context");
        xVar.a(context, str, 2, true, str3, str5, str7, str9);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "openMPApp: jumpUrl=" + str + ", title=" + str3 + ", downloadTitle=" + str5 + ", confirmLabel=" + str7 + ", cancelLabel=" + str9);
        return true;
    }

    public final boolean N(nw4.k kVar, nw4.y2 y2Var) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandleMPPageAction", "openPublishEditFromMoment not main process");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail not main process", null);
            return true;
        }
        java.lang.String str = (java.lang.String) y2Var.f340790a.get("snsBizPublishUniqueId");
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandleMPPageAction", "openPublishEdit uniqueId is empty");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail uniqueId is empty", null);
            return true;
        }
        java.util.List arrayList = new java.util.ArrayList();
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        tk.y Bi = ((ox.e0) i95.n0.c(ox.e0.class)).Bi(str);
        if (Bi == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandleMPPageAction", "sns published info is empty");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail sns published info is empty", null);
            return true;
        }
        java.util.List<tk.x> list = Bi.f419886a;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandleMPPageAction", "sns photos is empty");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail sns photos is empty", null);
            return true;
        }
        for (tk.x xVar : list) {
            java.lang.String str2 = xVar.f419883a;
            if (str2.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "sns photo path is empty, uniqueId: ".concat(str));
            } else {
                arrayList.add(new com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo(str2, null, null, null, null, java.lang.Boolean.valueOf(xVar.f419884b && xVar.f419885c != null), xVar.f419885c, null, null, null, null, null, null, null, null, null, 65438, null));
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        tk.t tVar = tk.u.f419871e;
        jSONObject.put("mpPublishAction", 2);
        jSONObject.put("publishScene", "sns_new");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1410);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("content", Bi.f419887b);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, Bi.f419888c);
        jSONObject4.put("address", Bi.f419889d);
        jSONObject4.put("longitude", java.lang.Float.valueOf(Bi.f419890e));
        jSONObject4.put("latitude", java.lang.Float.valueOf(Bi.f419891f));
        jSONObject4.put("poiid", Bi.f419892g);
        jSONObject3.put("poiInfo", jSONObject4);
        jSONObject2.put("nativeExtraData", jSONObject3);
        jSONObject.put("weAppParam", jSONObject2);
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Di(kVar.f340860a, jSONObject, arrayList, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.v4(kVar, y2Var, str));
        return true;
    }

    public final boolean O(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("appId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = y2Var.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2);
                ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai(str, jSONObject.toString());
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
                return true;
            }
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail param is empty", null);
        return true;
    }

    public final boolean P(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.String sb6;
        java.lang.Object obj = y2Var.f340790a.get("urlList");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String string = jSONArray.getString(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "preloadImage url=" + string);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342077a = false;
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    sb6 = "";
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(g83.a.d());
                    sb7.append("preview_");
                    char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                    sb7.append(com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()));
                    sb6 = sb7.toString();
                }
                fVar.f342082f = sb6;
                n11.a.b().i(string, null, fVar.a(), new com.tencent.mm.plugin.webview.ui.tools.newjsapi.w4(currentTimeMillis));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandleMPPageAction", e17, "preloadImage parse jsonArray error", new java.lang.Object[0]);
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q(nw4.k r7, nw4.y2 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "optString(...)"
            java.util.Map r1 = r8.f340790a
            java.lang.String r2 = "reportData"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ""
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L29
            r3.<init>(r1)     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = "data"
            java.lang.String r1 = r3.optString(r1, r2)     // Catch: java.lang.Exception -> L29
            kotlin.jvm.internal.o.f(r1, r0)     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = "music_data"
            java.lang.String r3 = r3.optString(r4, r2)     // Catch: java.lang.Exception -> L27
            kotlin.jvm.internal.o.f(r3, r0)     // Catch: java.lang.Exception -> L27
            r2 = r3
            goto L3a
        L27:
            r0 = move-exception
            goto L2b
        L29:
            r0 = move-exception
            r1 = r2
        L2b:
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "MicroMsg.JsApiHandleMPPageAction"
            java.lang.String r4 = "reportByLeaveForMPGateway, ex = %s"
            com.tencent.mars.xlog.Log.w(r3, r4, r0)
        L3a:
            cy4.b r0 = cy4.b.f224859a
            boolean r3 = r0.a()
            if (r3 != 0) goto L43
            goto L63
        L43:
            java.lang.String r3 = "MicroMsg.MPVideoPreviewDataMgr"
            java.lang.String r4 = "reportByLeaveForMPGateway"
            com.tencent.mars.xlog.Log.i(r3, r4)
            java.util.Map r4 = r8.f340790a
            java.lang.String r5 = "native_data"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 == 0) goto L60
            java.lang.String r0 = "reportByLeaveForMPGateway native_data null"
            com.tencent.mars.xlog.Log.i(r3, r0)
            goto L63
        L60:
            r0.c(r4)
        L63:
            com.tencent.mm.plugin.webview.modeltools.f1.b(r1)
            com.tencent.mm.plugin.webview.modeltools.f1.c(r2)
            nw4.g r7 = r7.f340863d
            java.lang.String r0 = r8.f341013c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = r8.f341019i
            r1.append(r8)
            java.lang.String r8 = ":ok"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r1 = 0
            r7.e(r0, r8, r1)
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.Q(nw4.k, nw4.y2):boolean");
    }

    public final boolean R(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.sdk.platformtools.b0.d(kVar.f340860a, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str, null);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    public final boolean S(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.String str = (java.lang.String) y2Var.f340790a.get("reportData");
        if (str == null || r26.n0.N(str)) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.webview.ui.tools.newjsapi.z4.f186706d, null);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T(nw4.k r29, nw4.y2 r30) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.T(nw4.k, nw4.y2):boolean");
    }

    public final boolean U(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("buttons");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null || str.length() == 0) {
            kVar.f340863d.e(y2Var.f341013c, "handleMPPageAction:fail params invalid", null);
            return true;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                arrayList.add(new android.util.Pair(optJSONObject.optString(dm.i4.COL_ID), optJSONObject.optString("label")));
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.e5(kVar, arrayList, y2Var));
        } catch (java.lang.Exception unused) {
        }
        return true;
    }

    public final boolean V(nw4.k kVar, nw4.y2 y2Var) {
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        java.lang.Object obj = ((java.util.HashMap) y2Var.f340790a).get(dm.i4.COL_USERNAME);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (!(str2.length() == 0) && kotlin.jvm.internal.o.b("wxid_wi_1d142z0zdj03", str2)) {
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) ((java.util.HashMap) y2Var.f340790a).get("enter_scene"), 0);
            java.lang.String a17 = com.tencent.mm.ui.l2.a(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "showChatBotPrivacyPageSheet enterType:" + P);
            ((vh0.f3) n1Var).bj(kVar.f340860a, str2, P, a17, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.f5(kVar, y2Var));
            return true;
        }
        java.lang.String concat = "chatbotUsername is invalid: ".concat(str2);
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", concat);
        java.util.Map l17 = kz5.c1.l(new jz5.l("err_desc", concat));
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", l17);
        return true;
    }

    public final boolean W(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("biz");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = y2Var.f340790a.get("nickname");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.Object obj3 = y2Var.f340790a.get("identityName");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.Object obj4 = y2Var.f340790a.get("identityType");
        java.lang.String str6 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str6 == null) {
            str6 = "0";
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(str6, 0);
        java.lang.Object obj5 = y2Var.f340790a.get("headImgUrl");
        java.lang.String str7 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        java.lang.String str8 = str7 != null ? str7 : "";
        java.lang.Object obj6 = y2Var.f340790a.get("bizType");
        java.lang.String str9 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(str9 != null ? str9 : "0", 0);
        int i17 = P2 == 2 ? 5 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "showInteractiveHalfScreenProfile biz: " + str + ", nickname: " + str3 + ", identityName: " + str5 + ", identityType: " + P + ", headImgUrl: " + str8 + ", bizType: " + P2);
        zq1.y yVar = (zq1.y) i95.n0.c(zq1.y.class);
        android.content.Context context = kVar.f340860a;
        ((yq1.k) yVar).getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5) || context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginBrandService", "showInteractiveHalfScreenProfile, identityName invalid or context is null, identityName:%s", str5);
            return true;
        }
        ir1.i1.R.a(context, new com.tencent.pigeon.biz.BizInteractiveUserInfo(str8, str3, str5, java.lang.Long.valueOf(P), java.lang.Long.valueOf(-1)), str, i17);
        return true;
    }

    public final boolean X(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f340860a;
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = (java.lang.String) y2Var.f340790a.get("menuItems");
        if (!(str == null || r26.n0.N(str))) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String string = jSONArray.getString(i17);
                    arrayList.add(string);
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "showMenu:" + string);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandleMPPageAction", e17, "", new java.lang.Object[0]);
                gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
                return true;
            }
        }
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) y2Var.f340790a.get("forbidFlag"), 0L);
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0("dark", (java.lang.String) y2Var.f340790a.get("style"));
        int v76 = webViewUI.v7();
        com.tencent.mm.plugin.webview.ui.tools.jd w76 = webViewUI.w7();
        boolean z18 = w76 != null ? w76.f184878h : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "isCurrentMPPageDisableMenuHeader  disableMenuHeader:" + z18);
        webViewUI.f183849q2.h0(V, arrayList, D0, z18, v76, 1);
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    public final boolean Y(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f340860a;
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context;
        java.lang.String str = (java.lang.String) y2Var.f340790a.get("color");
        java.lang.String str2 = (java.lang.String) y2Var.f340790a.get("traceId");
        if (str2 == null) {
            str2 = "";
        }
        float L = com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) y2Var.f340790a.get("alpha"), 0.0f);
        if (L <= 0.0f || L > 1.0f) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail alpha value is invalid", null);
            return true;
        }
        int i17 = 0;
        int c17 = com.tencent.mm.plugin.webview.ui.tools.a1.c(str, 0);
        android.view.View decorView = webViewUI.getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        if ((decorView instanceof android.view.ViewGroup) && decorView.findViewById(com.tencent.mm.R.id.piu) == null) {
            android.view.View view = new android.view.View(webViewUI);
            view.setBackgroundColor(c17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(L));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction", "showNavShadow", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction", "showNavShadow", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setId(com.tencent.mm.R.id.piu);
            view.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.g5(str2, kVar));
            fq1.e eVar = fq1.e.f265507a;
            android.view.View view2 = kVar.f340864e;
            if (view2 != null && decorView != view2) {
                while (view2 != decorView) {
                    i17 += view2.getTop();
                    if (!(view2.getParent() instanceof android.view.View)) {
                        break;
                    }
                    java.lang.Object parent = view2.getParent();
                    kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
                    view2 = (android.view.View) parent;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "showNavShadow shadowHeight=" + i17);
            ((android.view.ViewGroup) decorView).addView(view, new android.widget.FrameLayout.LayoutParams(-1, i17));
        }
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    public final boolean Z(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("show");
        boolean y17 = com.tencent.mm.sdk.platformtools.t8.y(obj instanceof java.lang.String ? (java.lang.String) obj : null, false);
        android.content.Context context = kVar.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        if (webViewUI != null) {
            nf.e.f(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.h5(y17, webViewUI, kVar, y2Var));
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "wrong ctx");
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.tencent.xweb.z0 settings;
        android.view.View j17;
        android.view.View j18;
        java.lang.String str;
        float f17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("action");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction action=%s", str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            env.f340863d.e(msg.f341013c, msg.f341019i + ":fail action is empty", null);
            return true;
        }
        if (kotlin.jvm.internal.o.b("holdGoBackAction", str2)) {
            android.content.Context context = env.f340860a;
            if (context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).C = true;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "not in WebViewUI now!");
            }
            env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            return true;
        }
        if (kotlin.jvm.internal.o.b("enterEmbedMpVideo", str2)) {
            if (h(env, msg)) {
                ot0.m1 t17 = t(env, msg);
                android.content.Context context2 = env.f340860a;
                if (context2 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
                    if (context2 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
                        com.tencent.mm.ui.widget.MMWebView mMWebView = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).f183815f;
                        f17 = mMWebView != null ? mMWebView.getMMDensity() : j65.f.f();
                    } else {
                        f17 = j65.f.f();
                    }
                    int a17 = com.tencent.mm.ui.bl.a(env.f340860a);
                    int h17 = com.tencent.mm.ui.bl.h(env.f340860a);
                    com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) ((java.util.HashMap) msg.f340790a).get("videoCurrTime"), 0.0f);
                    t17.f348583u = (int) (com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) ((java.util.HashMap) msg.f340790a).get("playerX"), 0.0f) * f17);
                    t17.f348584v = (int) ((com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) ((java.util.HashMap) msg.f340790a).get("playerY"), 0.0f) * f17) + a17 + h17);
                    t17.f348585w = (int) (com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) ((java.util.HashMap) msg.f340790a).get("playerWidth"), 0.0f) * f17);
                    t17.f348586x = (int) (com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) ((java.util.HashMap) msg.f340790a).get("playerHeight"), 0.0f) * f17);
                    com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView I7 = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).I7();
                    synchronized (I7) {
                        I7.f185725x = t17;
                        I7.forbidForward = t17.C;
                        I7.m();
                        if (I7.U) {
                            I7.h();
                        }
                        I7.e();
                    }
                }
                env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            }
            return true;
        }
        int i17 = 0;
        if (kotlin.jvm.internal.o.b("getBiz", str2)) {
            java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("bizType");
            java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str3 == null) {
                str3 = "0";
            }
            int P = com.tencent.mm.sdk.platformtools.t8.P(str3, 1);
            java.lang.Object obj2 = ((java.util.HashMap) msg.f340790a).get("needCheckBiz");
            str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str == null) {
                str = "false";
            }
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.brandService.GetBizRequest(com.tencent.mm.sdk.platformtools.t8.y(str, false), P, false), rm.a0.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.o4(env, msg));
            return true;
        }
        if (kotlin.jvm.internal.o.b("getAllBiz", str2)) {
            java.lang.Object obj3 = ((java.util.HashMap) msg.f340790a).get("bizType");
            java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str4 == null) {
                str4 = "0";
            }
            int P2 = com.tencent.mm.sdk.platformtools.t8.P(str4, 1);
            java.lang.Object obj4 = ((java.util.HashMap) msg.f340790a).get("needCheckBiz");
            str = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
            if (str == null) {
                str = "false";
            }
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.brandService.GetBizRequest(com.tencent.mm.sdk.platformtools.t8.y(str, false), P2, true), rm.a0.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.n4(env, msg));
            return true;
        }
        if (kotlin.jvm.internal.o.b("getWxInfo", str2)) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.webview.ui.tools.newjsapi.e.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s4(env, msg));
            return true;
        }
        if (kotlin.jvm.internal.o.b("refreshTimelineFeed", str2)) {
            java.lang.Object obj5 = ((java.util.HashMap) msg.f340790a).get("triggerJson");
            java.lang.String str5 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "refreshTimelineFeed triggerJson: " + str5);
            if (z40.e.l4() && ((y40.i0) z40.e.get()).Di()) {
                z40.e eVar = z40.e.get();
                if (str5 == null) {
                    str5 = "";
                }
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.x4 x4Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.x4.f186654a;
                ((y40.i0) eVar).getClass();
                com.tencent.wechat.mm.finder_box.c0 a18 = a50.e1.f1471a.a();
                if (a18 != null) {
                    a18.x(str5, new y40.c0(x4Var));
                }
            } else {
                com.tencent.wechat.mm.biz.g0 g0Var = com.tencent.wechat.mm.biz.g0.f218063b;
                if (str5 == null) {
                    str5 = "";
                }
                g0Var.C(str5, com.tencent.mm.plugin.webview.ui.tools.newjsapi.y4.f186676a);
            }
            env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            return true;
        }
        if (kotlin.jvm.internal.o.b("shareEmbedMpVideo", str2)) {
            if (h(env, msg)) {
                ot0.m1 t18 = t(env, msg);
                android.content.Context context3 = env.f340860a;
                if (context3 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
                    kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                    t18.f348587y = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context3).f183813e2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "shareEmbedMpVideo bizUsrName=" + t18.f373348p + ", mpUrl=" + t18.f373339d + ", videoUrl=" + t18.f373340e + ", width=" + t18.f373345m + ", height=" + t18.f373346n + ", videoDuration=" + t18.f373344i);
                }
                if (com.tencent.mm.pluginsdk.ui.tools.e9.l()) {
                    com.tencent.mm.plugin.webview.ui.tools.media.v0.f185829a.a(env.f340860a, t18, 2);
                } else {
                    android.content.Context context4 = env.f340860a;
                    if (context4 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
                        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context4).f183811d3.f185807a = t18;
                        com.tencent.mm.plugin.webview.ui.tools.media.j0.f185786a.b(context4, t18.f373343h, "", t18.f373342g, t18.f373339d, 2);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "not in WebViewUI now!");
                    }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18589, 14, 3);
                env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b(nd1.a2.NAME, str2)) {
            android.content.Context context5 = env.f340860a;
            boolean z17 = context5 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
            nw4.g gVar = env.f340863d;
            if (z17) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = z17 ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context5 : null;
                if (webViewUI != null) {
                    if (com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) ((java.util.HashMap) msg.f340790a).get("show"), true)) {
                        androidx.appcompat.app.b bVar = webViewUI.f183840o;
                        if (bVar != null && (j18 = bVar.j()) != null && j18.getVisibility() != 0) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(j18, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            j18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(j18, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        androidx.appcompat.app.b bVar2 = webViewUI.f183840o;
                        if (bVar2 != null && (j17 = bVar2.j()) != null && j17.getVisibility() == 0) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(4);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(j17, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "hideActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            j17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(j17, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "hideActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
            } else {
                gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b(ya.a.SHARE, str2)) {
            android.content.Context context6 = env.f340860a;
            if (context6 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
                kotlin.jvm.internal.o.e(context6, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context6;
                new android.os.Bundle().putString("extInfo", (java.lang.String) ((java.util.HashMap) msg.f340790a).get("extInfo"));
                if (com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) ((java.util.HashMap) msg.f340790a).get("useScrollActionSheet"), false)) {
                    webViewUI2.X8();
                } else {
                    com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = webViewUI2.f183849q2;
                    if (c6Var.c() == null || c6Var.c().f183876z1 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "showShareMenu params failed");
                    } else {
                        com.tencent.mm.protocal.JsapiPermissionWrapper c17 = c6Var.c().f183876z1.c();
                        if (c6Var.A(c17, 21, 1) || c6Var.A(c17, 23, 2)) {
                            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) c6Var.c(), 1, false);
                            k0Var.f211872n = new com.tencent.mm.plugin.webview.ui.tools.b7(c6Var, c17);
                            k0Var.f211892z = c6Var;
                            k0Var.f211881s = new com.tencent.mm.plugin.webview.ui.tools.c7(c6Var);
                            k0Var.q(" ", 1);
                            k0Var.X1 = c6Var.f184058o || c6Var.c().v7() == 16;
                            k0Var.v();
                        } else {
                            db5.e1.T(c6Var.c(), c6Var.c().getString(com.tencent.mm.R.string.lan));
                        }
                    }
                }
            } else {
                java.lang.String str6 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("extInfo");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("extInfo", str6);
                com.tencent.mm.plugin.webview.stub.z0 b17 = env.b();
                if (b17 != null) {
                    b17.i(88, bundle);
                }
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("showToast", str2)) {
            android.content.Context context7 = env.f340860a;
            if (context7 instanceof bx4.a) {
                kotlin.jvm.internal.o.e(context7, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView");
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.lang.Object obj6 = ((java.util.HashMap) msg.f340790a).get("wording");
                kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj7 = ((java.util.HashMap) msg.f340790a).get("status");
                kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.String");
                bundle2.putString("wording", (java.lang.String) obj6);
                bundle2.putString("status", (java.lang.String) obj7);
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) ((bx4.a) context7)).Z8(bundle2);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("writeCommentReply", str2)) {
            android.content.Context context8 = env.f340860a;
            if (context8 instanceof bx4.a) {
                kotlin.jvm.internal.o.e(context8, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView");
                android.os.Bundle bundle3 = new android.os.Bundle();
                java.lang.Object obj8 = ((java.util.HashMap) msg.f340790a).get("comment_id");
                kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type kotlin.String");
                long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) obj8, 0L);
                java.lang.Object obj9 = ((java.util.HashMap) msg.f340790a).get("reply_content");
                kotlin.jvm.internal.o.e(obj9, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj10 = ((java.util.HashMap) msg.f340790a).get("personal_comment_id");
                kotlin.jvm.internal.o.e(obj10, "null cannot be cast to non-null type kotlin.String");
                int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) obj10, 0);
                bundle3.putLong("commentTopicId", V);
                bundle3.putString("reply_content", (java.lang.String) obj9);
                bundle3.putInt("personal_comment_id", P3);
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) ((bx4.a) context8)).k9(bundle3);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("writeComment", str2)) {
            android.content.Context context9 = env.f340860a;
            if (context9 instanceof bx4.a) {
                kotlin.jvm.internal.o.e(context9, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView");
                android.os.Bundle bundle4 = new android.os.Bundle();
                java.lang.Object obj11 = ((java.util.HashMap) msg.f340790a).get("style");
                kotlin.jvm.internal.o.e(obj11, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj12 = ((java.util.HashMap) msg.f340790a).get("comment_id");
                kotlin.jvm.internal.o.e(obj12, "null cannot be cast to non-null type kotlin.String");
                long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) obj12, 0L);
                bundle4.putString("style", (java.lang.String) obj11);
                bundle4.putLong("commentTopicId", V2);
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) ((bx4.a) context9)).j9(bundle4);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("longPressEmbedMpVideo", str2)) {
            if (h(env, msg)) {
                ot0.m1 t19 = t(env, msg);
                android.content.Context context10 = env.f340860a;
                if (context10 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
                    kotlin.jvm.internal.o.e(context10, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                    t19.f348587y = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context10).f183813e2;
                }
                com.tencent.mm.plugin.webview.ui.tools.media.v0.f185829a.a(env.f340860a, t19, 1);
                env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("insertVideoNativeView", str2)) {
            env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            return true;
        }
        if (kotlin.jvm.internal.o.b("wxConfig", str2)) {
            java.lang.String str7 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("appid");
            java.lang.String str8 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("webComptList");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "wxConfig webComptList=" + str8 + ", appId=" + str7);
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str8);
                java.lang.String str9 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("url");
                if (str9 == null) {
                    env.f340863d.e(msg.f341013c, msg.f341019i + ":fail invalid params", null);
                } else {
                    java.util.LinkedList b18 = com.tencent.mm.plugin.webview.webcompt.h1.f187820a.b(str9, jSONArray);
                    if (com.tencent.mm.sdk.platformtools.t8.L0(b18)) {
                        env.f340863d.e(msg.f341013c, msg.f341019i + ":fail webComptList is null", null);
                    } else {
                        nw4.g gVar2 = env.f340863d;
                        kotlin.jvm.internal.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                        com.tencent.mm.plugin.webview.webcompt.y1 y17 = ((nw4.n) gVar2).y();
                        if (y17 != null) {
                            if (str7 == null) {
                                str7 = "";
                            }
                            y17.b(str7, str9, b18);
                        }
                        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "wxConfig ex " + e17.getMessage());
                env.f340863d.e(msg.f341013c, msg.f341019i + ":fail ex " + e17 + ".message", null);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("getFuncFlag", str2)) {
            android.content.Context context11 = env.f340860a;
            boolean z18 = context11 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
            nw4.g gVar3 = env.f340863d;
            if (z18) {
                kotlin.jvm.internal.o.e(context11, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("shareFuncFlag", java.lang.Integer.valueOf(((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context11).f183849q2.x()));
                gVar3.e(msg.f341013c, msg.f341019i + ":ok", hashMap);
            } else {
                gVar3.e(msg.f341013c, msg.f341019i + ":fail", null);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("sendMPPageData", str2)) {
            android.os.Bundle bundle5 = new android.os.Bundle();
            bundle5.putString("action", "sendMPPageData");
            java.lang.Object obj13 = ((java.util.HashMap) msg.f340790a).get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            kotlin.jvm.internal.o.e(obj13, "null cannot be cast to non-null type kotlin.String");
            bundle5.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, (java.lang.String) obj13);
            java.lang.Object obj14 = ((java.util.HashMap) msg.f340790a).get("sendTo");
            kotlin.jvm.internal.o.e(obj14, "null cannot be cast to non-null type kotlin.String");
            bundle5.putString("sendTo", (java.lang.String) obj14);
            if (((java.util.HashMap) msg.f340790a).containsKey("webviewId")) {
                java.lang.Object obj15 = ((java.util.HashMap) msg.f340790a).get("webviewId");
                kotlin.jvm.internal.o.e(obj15, "null cannot be cast to non-null type kotlin.String");
                i17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) obj15, 0);
            }
            bundle5.putInt("webviewId", i17);
            env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            return true;
        }
        if (kotlin.jvm.internal.o.b("hasActivity", str2)) {
            boolean z19 = env.f340860a instanceof android.app.Activity;
            nw4.g gVar4 = env.f340863d;
            if (z19) {
                gVar4.e(msg.f341013c, msg.f341019i + ":ok", null);
            } else {
                gVar4.e(msg.f341013c, msg.f341019i + ":fail", null);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("showMenu", str2)) {
            X(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("doFavorite", str2)) {
            nw4.g gVar5 = env.f340863d;
            kotlin.jvm.internal.o.e(gVar5, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar5).j("sendAppMessage", false);
            nw4.g gVar6 = env.f340863d;
            kotlin.jvm.internal.o.e(gVar6, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar6).J(null, 1);
            gVar6.e(msg.f341013c, msg.f341019i + ":ok", null);
            return true;
        }
        if (kotlin.jvm.internal.o.b("showNavShadow", str2)) {
            Y(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("hideNavShadow", str2)) {
            android.content.Context context12 = env.f340860a;
            boolean z27 = context12 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
            nw4.g gVar7 = env.f340863d;
            if (z27) {
                kotlin.jvm.internal.o.e(context12, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                android.view.View decorView = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context12).getWindow().getDecorView();
                kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
                android.view.View findViewById = decorView.findViewById(com.tencent.mm.R.id.piu);
                if (findViewById != null && (decorView instanceof android.view.ViewGroup)) {
                    ((android.view.ViewGroup) decorView).removeView(findViewById);
                }
                gVar7.e(msg.f341013c, msg.f341019i + ":ok", null);
            } else {
                gVar7.e(msg.f341013c, msg.f341019i + ":fail", null);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("syncReadState", str2)) {
            d0(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("reportRecommend", str2)) {
            S(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getTeenModeTemporaryVisitInfo", str2)) {
            D(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("setLocalData", str2)) {
            java.lang.Object obj16 = ((java.util.HashMap) msg.f340790a).get("url");
            kotlin.jvm.internal.o.e(obj16, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str10 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("key");
            java.lang.String str11 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            ((com.tencent.mm.sdk.platformtools.o4) ((com.tencent.mm.sdk.platformtools.v3) ((jz5.n) f186309i).getValue()).i()).D(y((java.lang.String) obj16) + ':' + str10, str11);
            env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getLocalData", str2)) {
            java.lang.Object obj17 = ((java.util.HashMap) msg.f340790a).get("url");
            kotlin.jvm.internal.o.e(obj17, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str12 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("key");
            java.lang.String t27 = com.tencent.mm.sdk.platformtools.v3.t((com.tencent.mm.sdk.platformtools.v3) ((jz5.n) f186309i).getValue(), y((java.lang.String) obj17) + ':' + str12, null, 2, null);
            if (t27 == null) {
                t27 = "";
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, t27);
            env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", hashMap2);
            return true;
        }
        if (kotlin.jvm.internal.o.b("reportByLeaveForMPGateway", str2)) {
            Q(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getEnterTime", str2)) {
            x(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getNavigationBarHeight", str2)) {
            A(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("kv", str2)) {
            J(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("idKey", str2)) {
            F(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("showActionSheet", str2)) {
            U(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.jsapi.g5.NAME, str2)) {
            int i18 = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) ((java.util.HashMap) msg.f340790a).get("disable"), false) ? Integer.MAX_VALUE : 0;
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = env.f340864e;
            if (mMWebView2 != null && (settings = mMWebView2.getSettings()) != null) {
                settings.x(i18);
            }
            return true;
        }
        if (kotlin.jvm.internal.o.b("getWebTransStatus", str2)) {
            K(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("doFavoriteExcerpt", str2)) {
            p(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("delFavoriteExcerpt", str2)) {
            return k(env, msg);
        }
        if (kotlin.jvm.internal.o.b("shareExcerpts", str2)) {
            T(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b(be1.r0.NAME, str2)) {
            R(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("isSupportAddToTingPlayList", str2)) {
            H(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getLiveStatus", str2)) {
            z(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("syncPhotoSwitch", str2)) {
            c0(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("checkCanCreatePhotoAccount", str2)) {
            g(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("openFinderLive", str2)) {
            L(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("deleteBrandOutboxMsgId", str2)) {
            return n(env, msg);
        }
        if (kotlin.jvm.internal.o.b("disableExposeAlert", str2)) {
            o(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("showTingEntry", str2)) {
            return Z(env, msg);
        }
        if (kotlin.jvm.internal.o.b("switchPublishImageEntry", str2)) {
            return b0(env, msg);
        }
        if (kotlin.jvm.internal.o.b("isEnabledForCircleToSearch", str2)) {
            G(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getDraftData", str2)) {
            w(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.jsapi.le.NAME, str2)) {
            a0(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("showChatBotPrivacyPageSheet", str2)) {
            V(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("preloadImage", str2)) {
            P(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getClientLanguage", str2)) {
            u(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getClientTranslateLanguage", str2)) {
            v(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("deleteBizArticle", str2)) {
            m(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("openMPApp", str2)) {
            M(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("showInteractiveHalfScreenProfile", str2)) {
            W(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("cleanPageData", str2)) {
            i(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("createWxInputConnection", str2)) {
            j(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("startMpKeyBoard", str2)) {
            r(env, msg, true);
            return true;
        }
        if (kotlin.jvm.internal.o.b("stopMpKeyBoard", str2)) {
            r(env, msg, false);
            return true;
        }
        if (kotlin.jvm.internal.o.b("joinChatBotRoom", str2)) {
            I(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getSingleSendButton", str2)) {
            C(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("getPosition", str2)) {
            B(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("openPublishEditFromMoment", str2)) {
            N(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("postDataToMiniApp", str2)) {
            O(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("bizImagePreview", str2)) {
            f(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("paySuccess", str2)) {
            m0.g0.b(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("isGPVersion", str2)) {
            m0.g0.a(env, msg);
            return true;
        }
        if (kotlin.jvm.internal.o.b("requestTeenModeTemporaryVisit", str2)) {
            m0.g0.d(env, msg);
            return true;
        }
        if (!kotlin.jvm.internal.o.b("setScrollIndicatorVisable", str2)) {
            return false;
        }
        m0.g0.c(env, msg);
        return true;
    }

    public final boolean a0(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("entrance");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int parseInt = java.lang.Integer.parseInt(str);
        tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
        android.content.Context context = kVar.f340860a;
        tu4.a aVar = com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo.f181442u;
        java.util.Map params = y2Var.f340790a;
        kotlin.jvm.internal.o.f(params, "params");
        org.json.JSONObject a17 = ri.l0.a(params);
        kotlin.jvm.internal.o.d(a17);
        ((sg0.e) f1Var).Ai(context, 7, parseInt, aVar.a(a17).b());
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", kz5.q0.f314001d);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return f186306f;
    }

    public final boolean b0(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        if (webViewUI != null) {
            java.lang.Object obj = y2Var.f340790a.get("show");
            nf.e.f(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.i5(com.tencent.mm.sdk.platformtools.t8.y(obj instanceof java.lang.String ? (java.lang.String) obj : null, false), webViewUI, kVar, y2Var));
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "wrong ctx");
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", kz5.b1.e(new jz5.l("err_desc", "context is not webviewUI")));
        return false;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return f186307g;
    }

    public final boolean c0(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("enable");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "syncPhotoSwitch enable:" + P);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.brandService.SyncPhotoRequest(P == 1), rm.g0.class, com.tencent.mm.plugin.webview.ui.tools.newjsapi.j5.f186277d);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    @Override // qw4.a
    public boolean d() {
        return f186308h;
    }

    public final boolean d0(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f340860a;
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) y2Var.f340790a.get("state"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction syncReadState state=" + P);
        vx4.d dVar = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).F2;
        if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "sync Read State %d", java.lang.Integer.valueOf(P));
            dVar.f441319z = true;
            if (P == 0) {
                dVar.f441318y = false;
                dVar.j();
                dVar.m(null);
            } else {
                dVar.f441318y = true;
                dVar.D();
            }
        }
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d0, code lost:
    
        if ((r0.length() > 0) != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(nw4.k r21, nw4.y2 r22) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f(nw4.k, nw4.y2):boolean");
    }

    public final boolean g(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        if (P == 0 || P == 1 || P == 3) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.brandService.CheckCanCreatePhotoAccountRequest(P), rm.i.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.x3(P, kVar, y2Var));
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "checkCanCreatePhotoAccount invalid scene=" + P);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_desc", "invalid scene: " + P);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", hashMap);
        return true;
    }

    public final boolean h(nw4.k kVar, nw4.y2 y2Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) y2Var.f340790a.get("mpUrl"))) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail, mpUrl is null", null);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) y2Var.f340790a.get("bizUsrName"))) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail, bizUsrName is null", null);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) y2Var.f340790a.get("videoUrl"))) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail, videoUrl is null", null);
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) y2Var.f340790a.get("videoVid"))) {
            return true;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail, videoVid is null", null);
        return false;
    }

    public final boolean i(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.String str = (java.lang.String) ((java.util.HashMap) y2Var.f340790a).get("url");
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "cleanPageData: url is null");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail url is null", null);
            return true;
        }
        if (((zq1.a0) gm0.j1.s(zq1.a0.class)) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "cleanPageData: service is null");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail service is null", null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "cleanPageData");
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a.l(str);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    public final boolean j(nw4.k kVar, nw4.y2 y2Var) {
        jz5.f0 f0Var;
        android.content.Context context = kVar.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        nw4.g gVar = kVar.f340863d;
        if (webViewUI != null) {
            if (webViewUI.C2 == null) {
                webViewUI.C2 = new fy4.e(webViewUI);
            }
            com.tencent.mm.ui.widget.MMWebView mMWebView = webViewUI.f183815f;
            if (mMWebView == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "initWebviewWxInputConnHelper viewWV is null");
            } else {
                mMWebView.setInputConnectionWrapperHelper(webViewUI.C2);
            }
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "wrong ctx");
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        return true;
    }

    public final boolean k(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj = y2Var.f340790a.get("excerptKeys");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str3 = (java.lang.String) obj;
        java.lang.Object obj2 = y2Var.f340790a.get("pageKey");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str4 = (java.lang.String) obj2;
        java.lang.String str5 = (java.lang.String) y2Var.f340790a.get("url");
        java.lang.String str6 = (java.lang.String) y2Var.f340790a.get("src_displayname");
        java.lang.String str7 = (java.lang.String) y2Var.f340790a.get("itemShowType");
        java.lang.String str8 = (java.lang.String) y2Var.f340790a.get("src_username");
        java.lang.String str9 = (java.lang.String) y2Var.f340790a.get("userName");
        java.lang.String valueOf = java.lang.String.valueOf(str5);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            zg0.q2 a17 = kVar.a();
            if (a17 == null || (str2 = ((com.tencent.mm.plugin.webview.core.r0) a17).f181964y) == null) {
                java.lang.Object obj3 = y2Var.f340790a.get("key_webview_init_url");
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                str2 = (java.lang.String) obj3;
            }
            str = str2;
        } else {
            str = valueOf;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            int l17 = l(str3, str4, str, str6, str7, str8, str9);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] main process result = " + l17);
            E(kVar, y2Var, l17, -1L);
            return true;
        }
        com.tencent.mm.plugin.fav.api.DelFavoriteData delFavoriteData = new com.tencent.mm.plugin.fav.api.DelFavoriteData();
        delFavoriteData.f100215d = str3;
        delFavoriteData.f100216e = str4;
        delFavoriteData.f100217f = str;
        if (str6 == null) {
            str6 = "";
        }
        delFavoriteData.f100218g = str6;
        if (str7 == null) {
            str7 = "";
        }
        delFavoriteData.f100219h = str7;
        if (str8 == null) {
            str8 = "";
        }
        delFavoriteData.f100220i = str8;
        if (str9 == null) {
            str9 = "";
        }
        delFavoriteData.f100221m = str9;
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, delFavoriteData, com.tencent.mm.plugin.webview.ui.tools.newjsapi.r3.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] tools process result = " + iPCInteger.f68404d);
        E(kVar, y2Var, iPCInteger.f68404d, -1L);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public final boolean m(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("bizType");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(str, 1);
        java.lang.Object obj2 = y2Var.f340790a.get("msgId");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 == null ? "0" : str2;
        int p07 = com.tencent.mm.sdk.platformtools.t8.p0(str3, 0);
        if (p07 == 0) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail invalid msgId", null);
            return true;
        }
        java.lang.Object obj3 = y2Var.f340790a.get("idx");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(str4 != null ? str4 : "0", 0);
        java.lang.Object obj4 = y2Var.f340790a.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = str5;
        java.lang.Object obj5 = y2Var.f340790a.get("showSuccessToast");
        java.lang.String str7 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str7 == null) {
            str7 = "false";
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.l4(kVar, str6, p07, P2, P, y2Var, str3, com.tencent.mm.sdk.platformtools.t8.y(str7, false)));
        return true;
    }

    public final boolean n(nw4.k kVar, nw4.y2 y2Var) {
        int i17;
        java.lang.Object obj = y2Var.f340790a.get("appMsgId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = y2Var.f340790a.get("bizType");
        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
        if (num != null) {
            i17 = num.intValue();
        } else {
            tk.s[] sVarArr = tk.s.f419870d;
            i17 = 1;
        }
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "appMsgId: ".concat(str));
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest(str, i17), com.tencent.mm.plugin.webview.ui.tools.newjsapi.t3.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m4(kVar, y2Var));
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "try deleteBrandOutbox, but appMsgId isInvalid: " + y2Var.f340790a.get("appMsgId"));
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", kz5.b1.e(new jz5.l("err_desc", "appMsgId is invalid")));
        return false;
    }

    public final boolean o(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f340860a;
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context;
        java.lang.Object obj = y2Var.f340790a.get("disable");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = webViewUI.f183849q2;
            if (c6Var != null) {
                c6Var.f184059p = booleanValue ? com.tencent.mm.plugin.webview.ui.tools.m7.DISABLED : com.tencent.mm.plugin.webview.ui.tools.m7.ENABLED;
            }
        }
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return true;
    }

    public final boolean p(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj;
        java.lang.Object obj2 = y2Var.f340790a.get("excerptList");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str2 = (java.lang.String) obj2;
        java.lang.Object obj3 = y2Var.f340790a.get("cover");
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str3 = (java.lang.String) obj3;
        java.lang.Object obj4 = y2Var.f340790a.get("key_webview_init_url");
        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str4 = (java.lang.String) obj4;
        java.lang.Object obj5 = y2Var.f340790a.get("pageKey");
        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str5 = (java.lang.String) obj5;
        java.lang.String str6 = (java.lang.String) y2Var.f340790a.get("src_displayname");
        java.lang.String str7 = (java.lang.String) y2Var.f340790a.get("itemShowType");
        java.lang.String str8 = (java.lang.String) y2Var.f340790a.get("src_username");
        java.lang.String str9 = (java.lang.String) y2Var.f340790a.get("userName");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            int q17 = q(str, str2, str3, str4, str5, str6, str7, str8, str9);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] main process result = " + q17);
            E(kVar, y2Var, q17, -1L);
            return true;
        }
        com.tencent.mm.plugin.fav.api.DoFavoriteData doFavoriteData = new com.tencent.mm.plugin.fav.api.DoFavoriteData();
        doFavoriteData.f100222d = str;
        doFavoriteData.f100223e = str2;
        doFavoriteData.f100224f = str3;
        doFavoriteData.f100225g = str4;
        doFavoriteData.f100226h = str5;
        if (str6 == null) {
            str6 = "";
        }
        doFavoriteData.f100227i = str6;
        if (str7 == null) {
            str7 = "";
        }
        doFavoriteData.f100228m = str7;
        if (str8 == null) {
            str8 = "";
        }
        doFavoriteData.f100229n = str8;
        if (str9 == null) {
            str9 = "";
        }
        doFavoriteData.f100230o = str9;
        android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, doFavoriteData, com.tencent.mm.plugin.webview.ui.tools.newjsapi.u3.class);
        if (bundle == null) {
            return true;
        }
        int i17 = bundle.getInt("key_result_code", 2);
        long j17 = bundle.getLong("key_result_id", -1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] tools process result code = " + i17 + ", favId = " + j17);
        E(kVar, y2Var, i17, j17);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5 A[LOOP:1: B:30:0x00e0->B:32:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.q(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public final boolean r(nw4.k kVar, nw4.y2 y2Var, boolean z17) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        android.content.Context context = kVar.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        nw4.g gVar = kVar.f340863d;
        if (webViewUI != null) {
            fy4.e eVar = webViewUI.C2;
            f0Var = jz5.f0.f302826a;
            if (eVar != null) {
                eVar.f267260e = z17;
                gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "webViewInputConnHelper is null");
                gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail no inputConnection", null);
            }
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "wrong ctx");
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        return true;
    }

    public final boolean s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.LinkedList linkedList, java.lang.String str6, java.lang.String str7, int i17) {
        if (ot0.f.f(i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] itemShowType isBizVideo = " + i17);
            return false;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6328n = true;
        com.tencent.mm.plugin.webview.model.z zVar = new com.tencent.mm.plugin.webview.model.z();
        zVar.f183217h = true;
        zVar.f183213d = str4;
        zVar.f183211b = str2;
        zVar.f183212c = str3;
        zVar.f183214e = "";
        zVar.f183215f = str5;
        zVar.f183216g = linkedList;
        zVar.f183210a = str;
        r45.qp0 qp0Var = new r45.qp0();
        zVar.f183219j = qp0Var;
        qp0Var.f384162d = i17;
        qp0Var.f384169n = str7;
        qp0Var.f384170o = java.lang.String.valueOf(str6);
        com.tencent.mm.plugin.webview.model.a0.a(doFavoriteEvent, zVar);
        c4Var.f6331q = false;
        doFavoriteEvent.e();
        if (doFavoriteEvent.f54091h.f6433a == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] do favorite success");
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] do favorite fail");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ot0.m1 t(nw4.k r26, nw4.y2 r27) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.t(nw4.k, nw4.y2):ot0.m1");
    }

    public final boolean u(nw4.k kVar, nw4.y2 y2Var) {
        boolean z17 = kVar.f340860a instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.d(f17);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getClientLanguage lan: ".concat(f17));
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        return true;
    }

    public final boolean v(nw4.k kVar, nw4.y2 y2Var) {
        boolean z17 = kVar.f340860a instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.f(c17, "getActualTranslateLanguageIso(...)");
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getClientTranslateLanguage lan: ".concat(c17));
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        return true;
    }

    public final boolean w(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f340790a.get("type");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
        if (D1 == 0) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail draftType error", null);
            return true;
        }
        java.lang.Object obj2 = y2Var.f340790a.get("bizType");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "1";
        }
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1(str2, 0);
        java.lang.Object obj3 = y2Var.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        ((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Vi(D1, str3, D12, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.p4(kVar, y2Var));
        return true;
    }

    public final boolean x(nw4.k kVar, nw4.y2 y2Var) {
        hy4.k0 k0Var;
        hy4.k0 k0Var2;
        boolean z17 = kVar.f340860a instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = kVar.f340863d;
        if (!z17) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        zg0.q2 a17 = kVar.a();
        com.tencent.mm.plugin.webview.core.r0 r0Var = a17 instanceof com.tencent.mm.plugin.webview.core.r0 ? (com.tencent.mm.plugin.webview.core.r0) a17 : null;
        long j17 = 0;
        hashMap.put("clickTimeMs", java.lang.Long.valueOf((r0Var == null || (k0Var2 = r0Var.V) == null) ? 0L : k0Var2.f286137s));
        zg0.q2 a18 = kVar.a();
        com.tencent.mm.plugin.webview.core.r0 r0Var2 = a18 instanceof com.tencent.mm.plugin.webview.core.r0 ? (com.tencent.mm.plugin.webview.core.r0) a18 : null;
        if (r0Var2 != null && (k0Var = r0Var2.V) != null) {
            j17 = k0Var.f286140v;
        }
        hashMap.put("enterTimeMs", java.lang.Long.valueOf(j17));
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        return true;
    }

    public final java.lang.String y(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            return host == null ? "unknow" : host;
        } catch (java.lang.Exception unused) {
            return "unknow";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z(nw4.k kVar, nw4.y2 y2Var) {
        int i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        zg0.q2 a17 = kVar.a();
        java.lang.String Z = a17 != null ? ((com.tencent.mm.plugin.webview.core.r0) a17).Z() : null;
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if (a0Var != null && (kVar.f340860a instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI)) {
            yq1.z zVar = (yq1.z) a0Var;
            if (zVar.o(Z)) {
                android.content.Context context = kVar.f340860a;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                java.lang.String stringExtra = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).getIntent().getStringExtra("srcUsername");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "doGetLiveStatus userName null)");
                } else {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(zVar.i(stringExtra))) {
                        i17 = com.tencent.mm.pluginsdk.model.b0.f189197a.o(stringExtra);
                        hashMap.put("liveStatus", java.lang.Integer.valueOf(i17));
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getLiveStatus status:" + hashMap.get("liveStatus"));
                        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
                        return true;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "doGetLiveStatus exportId null");
                }
                i17 = 0;
                hashMap.put("liveStatus", java.lang.Integer.valueOf(i17));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getLiveStatus status:" + hashMap.get("liveStatus"));
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "openFinderLive service pre condition check fail. url:%s", Z);
        i17 = 0;
        hashMap.put("liveStatus", java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getLiveStatus status:" + hashMap.get("liveStatus"));
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        return true;
    }
}
