package com.tencent.mm.plugin.qrcode.model;

/* loaded from: classes15.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.x0 f154966a = new bm5.x0(new com.tencent.mm.plugin.qrcode.model.l());

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.event.IListener f154967b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseIntArray f154968c = new com.tencent.mm.plugin.qrcode.model.b();

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.SparseIntArray f154969d = new com.tencent.mm.plugin.qrcode.model.c();

    /* renamed from: e, reason: collision with root package name */
    public static final android.util.SparseIntArray f154970e = new com.tencent.mm.plugin.qrcode.model.d();

    public static int a(int i17) {
        if (i17 == 30 || i17 == 37 || i17 == 38 || i17 == 40) {
            return 13;
        }
        if (i17 == 4 || i17 == 47) {
            return 12;
        }
        if (i17 == 34) {
            return 24;
        }
        return i17 == 39 ? 5 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:245:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a1f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(com.tencent.mm.plugin.qrcode.model.n r33, w60.k r34, android.content.DialogInterface.OnClickListener r35, java.lang.String r36, int r37, int r38, int r39, java.lang.Runnable r40, android.os.Bundle r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 3208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.qrcode.model.p.b(com.tencent.mm.plugin.qrcode.model.n, w60.k, android.content.DialogInterface$OnClickListener, java.lang.String, int, int, int, java.lang.Runnable, android.os.Bundle, boolean):boolean");
    }

    public static void c(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.Runnable runnable) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_short_url", str);
        intent.putExtra("tab_type", 9);
        int i18 = 1;
        if (i17 != 0) {
            if (i17 == 1) {
                i18 = 2;
            } else {
                e04.p.y(i17);
                i18 = 0;
            }
        }
        intent.putExtra("KEY_SCAN_TYPE", i18);
        intent.putExtra("KEY_SCAN_EXPORT_URL", str2);
        intent.getIntExtra("report_scene", 2000);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(40, 2, 40, intent);
        intent.putExtra("key_need_related_list", false);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.A(context, intent, false);
        if (runnable != null) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(runnable, 200L);
        }
    }

    public static boolean d(android.content.Context context, java.lang.String str, int i17, int i18, android.os.Bundle bundle, android.os.Bundle bundle2, int i19, boolean z17, com.tencent.mm.plugin.qrcode.model.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.GetA8KeyRedirect", "processAppBrandFullURL, fullURL: " + str);
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse.getQueryParameter("search_query") == null || parse.getQueryParameter("search_query").length() <= 0) {
            int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("wxa_open_scene"), -1);
            if (P > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.scanner.GetA8KeyRedirect", "processAppBrandFullURL, override scene:%d from wxa_open_scene", java.lang.Integer.valueOf(P));
            } else {
                P = (com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("qr_type4wxa"), 0) == 2 ? f154970e : i18 != 22 ? f154968c : f154969d).get(i17);
            }
            if (bundle != null) {
                if (i19 == 37) {
                    bundle.putInt("stat_geta8key_msg_scene", 37);
                } else if (i19 == 38) {
                    bundle.putInt("stat_geta8key_msg_scene", 38);
                } else {
                    bundle.putInt("stat_geta8key_msg_scene", 0);
                }
            }
            int i27 = z17 ? 1374 : P;
            bm5.x0 x0Var = f154966a;
            if (((java.lang.Boolean) x0Var.b()).booleanValue()) {
                com.tencent.mm.sdk.event.IListener iListener = f154967b;
                if (iListener != null) {
                    iListener.dead();
                    f154967b = null;
                }
                ((tg1.n) ((com.tencent.mm.plugin.appbrand.service.i6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i6.class))).Ai(context, str, i27, bundle, bundle2, new com.tencent.mm.plugin.qrcode.model.m(oVar));
            } else {
                ((tg1.n) ((com.tencent.mm.plugin.appbrand.service.i6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i6.class))).Ai(context, str, i27, bundle, bundle2, null);
            }
            if (!((java.lang.Boolean) x0Var.b()).booleanValue()) {
                ((e04.p) ((com.tencent.mm.plugin.qrcode.model.h) oVar).f154961a).D(false);
            }
            return true;
        }
        java.lang.String queryParameter = parse.getQueryParameter("search_query");
        java.lang.String queryParameter2 = parse.getQueryParameter("appid");
        java.lang.String queryParameter3 = parse.getQueryParameter("search_extInfo");
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("debug"), 0);
        int P3 = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("version"), 0);
        com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent onSearchSearchBoxCtrlInfoChangedEvent = new com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent();
        am.cn cnVar = onSearchSearchBoxCtrlInfoChangedEvent.f54583g;
        cnVar.f6362a = 1;
        cnVar.f6363b = queryParameter2;
        cnVar.f6364c = P2;
        cnVar.f6365d = P3;
        cnVar.f6366e = queryParameter3;
        onSearchSearchBoxCtrlInfoChangedEvent.e();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsbizscene", 99999);
        a17.putExtra("ftsQuery", queryParameter);
        a17.putExtra("ftsqrcodestring", str);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(300, false, 262144);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put("query", queryParameter);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put("sessionid", f17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_session_id", f17);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.fts.MMFTSWebViewUI", a17, null);
        ((e04.p) ((com.tencent.mm.plugin.qrcode.model.h) oVar).f154961a).D(false);
        return true;
    }

    public static void e(com.tencent.mm.plugin.qrcode.model.n nVar, java.lang.String str, java.lang.Runnable runnable) {
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f72273e = java.lang.System.currentTimeMillis();
        openIMKefuStartConversationRequest.f72274f = 1;
        e04.p pVar = (e04.p) nVar;
        openIMKefuStartConversationRequest.f72272d = pVar.j();
        r45.s4 s4Var = new r45.s4();
        openIMKefuStartConversationRequest.f72277i = s4Var;
        s4Var.f385486d = str;
        s4Var.f385487e = str;
        openIMKefuStartConversationRequest.f72285t = true;
        openIMKefuStartConversationRequest.f72281p = true;
        openIMKefuStartConversationRequest.f72282q = openIMKefuStartConversationRequest.f72272d.getString(com.tencent.mm.R.string.hez);
        openIMKefuStartConversationRequest.f72276h = j41.f0.a(openIMKefuStartConversationRequest.f72274f);
        openIMKefuStartConversationRequest.f72283r = true;
        android.content.Intent intent = new android.content.Intent();
        openIMKefuStartConversationRequest.f72288w = intent;
        intent.putExtra("key_result_receiver", new com.tencent.mm.plugin.qrcode.model.OpenCustomerServiceChatResultReceiver(com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper()), pVar, runnable));
        ((l41.g2) ((j41.z) i95.n0.c(j41.z.class))).Bi(openIMKefuStartConversationRequest);
    }

    public static void f(com.tencent.mm.plugin.qrcode.model.n nVar, int i17, int i18, java.lang.String str, int i19) {
        android.content.Context j17 = nVar != null ? ((e04.p) nVar).j() : null;
        if (j17 == null) {
            return;
        }
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = new com.tencent.mm.autogen.events.GetA8KeyRedirectEvent();
        am.df dfVar = getA8KeyRedirectEvent.f54376g;
        dfVar.f6446a = i18;
        dfVar.f6447b = str;
        dfVar.f6448c = new java.lang.ref.WeakReference(j17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("pay_channel", i19);
        if (i18 == 55) {
            bundle.putInt("entrance", i17);
        }
        dfVar.f6449d = bundle;
        getA8KeyRedirectEvent.f192364d = new com.tencent.mm.plugin.qrcode.model.a(getA8KeyRedirectEvent, nVar);
        getA8KeyRedirectEvent.b(android.os.Looper.myLooper());
    }

    public static void g(android.content.Intent intent, w60.k kVar, android.os.Bundle bundle) {
        com.tencent.mm.modelsimple.k0 k0Var = (com.tencent.mm.modelsimple.k0) kVar;
        r45.y73 y73Var = ((r45.s83) k0Var.f71356e.f70711b.f70700a).f385551m;
        com.tencent.mm.modelbase.o oVar = k0Var.f71356e;
        if (y73Var != null) {
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = new com.tencent.mm.protocal.JsapiPermissionWrapper();
            r45.cu5 cu5Var = ((r45.s83) oVar.f70711b.f70700a).f385560v;
            byte[] bArr = null;
            if (cu5Var != null) {
                try {
                    bArr = x51.j1.d(cu5Var);
                } catch (java.lang.Exception unused) {
                }
            }
            jsapiPermissionWrapper.f192180d = bArr;
            intent.putExtra("scan_jspermission", jsapiPermissionWrapper);
        }
        intent.putExtra("scan_general_ctrl", new com.tencent.mm.protocal.GeneralControlWrapper(((r45.s83) oVar.f70711b.f70700a).f385551m));
        if (bundle != null) {
            intent.putExtra("geta8key_init_request_id", bundle.getInt("geta8key_init_request_id", 0));
            intent.putExtra("serverMsgID", java.lang.String.valueOf(bundle.getLong("serverMsgID", 0L)));
            intent.putExtra("geta8key_username", bundle.getString("geta8key_username", ""));
            intent.putExtra("msgUsername", bundle.getString("msgUsername", ""));
            intent.putExtra("KMsgType", bundle.getInt("KMsgType", 0));
            intent.putExtra("KAppMsgType", bundle.getInt("KAppMsgType", 0));
        }
    }
}
