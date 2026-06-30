package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 f140255a;

    public static java.lang.String a(java.lang.String str, com.tencent.mm.plugin.game.model.e1 e1Var, android.content.Intent intent, boolean z17) {
        if (e1Var != null && !((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().b()) {
            e1Var.t0();
            if (intent != null && !intent.hasExtra("game_pre_inject_data")) {
                intent.putExtra("game_pre_inject_data", e1Var.N2.f140356a);
            }
            com.tencent.mm.plugin.game.model.h0 h0Var = e1Var.f140291p2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(h0Var.f140323a)) {
                if (z17) {
                    java.util.List list = h0Var.f140327e;
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                        com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
                        am.t20 t20Var = wepkgNotifyEvent.f54992g;
                        t20Var.f7969a = 8;
                        t20Var.f7975g = 1;
                        t20Var.f7976h = list;
                        wepkgNotifyEvent.e();
                    }
                }
                str = b(str, "h5FloatLayer=1");
                com.tencent.mars.xlog.Log.i("MicroMsg.GameEntranceChecker", "after checking float, url = %s", str);
            }
            com.tencent.mm.plugin.game.model.o0 o0Var = e1Var.G2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(o0Var.f140389a)) {
                if (z17) {
                    java.util.List list2 = o0Var.f140390b;
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(list2)) {
                        com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent2 = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
                        am.t20 t20Var2 = wepkgNotifyEvent2.f54992g;
                        t20Var2.f7969a = 8;
                        t20Var2.f7975g = 1;
                        t20Var2.f7976h = list2;
                        wepkgNotifyEvent2.e();
                    }
                }
                try {
                    str = b(str, "h5BannerId=" + fp.s0.b(o0Var.f140389a, com.tencent.mapsdk.internal.rv.f51270c));
                } catch (java.io.UnsupportedEncodingException unused) {
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GameEntranceChecker", "after checking banner, url = %s", str);
            }
            com.tencent.mm.plugin.game.model.p0 p0Var = e1Var.f140281f2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f140401b) && !com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f140400a) && !com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f140402c)) {
                str = b(str, "hasBubble=1");
            }
            str = b(b(str, "localMsgId=" + e1Var.field_msgId), "gameMsgId=" + e1Var.field_gameMsgId);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var.V2)) {
                try {
                    str = b(str, "business_data=" + java.net.URLEncoder.encode(e1Var.V2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                } catch (java.io.UnsupportedEncodingException unused2) {
                }
            }
            if (com.tencent.mm.plugin.game.commlib.i.k() != null && com.tencent.mm.plugin.game.commlib.i.k().f323979h) {
                com.tencent.mm.plugin.game.model.q0 q0Var = e1Var.f140279d2;
                if (q0Var.f140417h == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f140416g)) {
                    str = b(str, "fromReddotExternPage=1");
                }
            }
        }
        if (intent == null || !intent.hasExtra("key_game_url_ext_param")) {
            return str;
        }
        try {
            return b(str, "fromGameParam=" + fp.s0.b(intent.getStringExtra("key_game_url_ext_param"), com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameEntranceChecker", e17.getMessage());
            return str;
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String query = parse.getQuery();
        if (query != null) {
            str2 = query + "&" + str2;
        }
        try {
            return new java.net.URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str2, parse.getFragment()).toString();
        } catch (java.net.URISyntaxException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameEntranceChecker", e17, "", new java.lang.Object[0]);
            return str;
        }
    }

    public static void c(android.content.Intent intent, java.lang.String str, boolean z17, com.tencent.mm.plugin.game.model.e1 e1Var, int i17, java.lang.String str2) {
        int i18;
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str);
        intent.putExtra("game_check_float", z17);
        if (!z17 || e1Var == null) {
            return;
        }
        e1Var.t0();
        com.tencent.mm.plugin.game.model.h0 h0Var = e1Var.f140291p2;
        if (h0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(h0Var.f140323a)) {
            com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo gameFloatLayerInfo = new com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo();
            java.lang.String str3 = h0Var.f140323a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                java.lang.String queryParameter = android.net.Uri.parse(str2).getQueryParameter("nav_color");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                    str3 = b(str3, "nav_color=" + queryParameter);
                }
            }
            gameFloatLayerInfo.f139474d = str3;
            gameFloatLayerInfo.f139475e = h0Var.f140324b;
            int i19 = h0Var.f140325c;
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            i18 = -1;
                            gameFloatLayerInfo.f139476f = i18;
                            com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams gameWebViewLaunchParams = new com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams();
                            gameWebViewLaunchParams.f139487d = gameFloatLayerInfo;
                            intent.putExtra("launchParams", gameWebViewLaunchParams);
                            intent.putExtra("game_float_layer_url", h0Var.f140323a);
                        }
                    }
                }
                i18 = 1;
                gameFloatLayerInfo.f139476f = i18;
                com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams gameWebViewLaunchParams2 = new com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams();
                gameWebViewLaunchParams2.f139487d = gameFloatLayerInfo;
                intent.putExtra("launchParams", gameWebViewLaunchParams2);
                intent.putExtra("game_float_layer_url", h0Var.f140323a);
            }
            i18 = 0;
            gameFloatLayerInfo.f139476f = i18;
            com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams gameWebViewLaunchParams22 = new com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams();
            gameWebViewLaunchParams22.f139487d = gameFloatLayerInfo;
            intent.putExtra("launchParams", gameWebViewLaunchParams22);
            intent.putExtra("game_float_layer_url", h0Var.f140323a);
        }
        f(e1Var, i17, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cb A[Catch: JSONException -> 0x02e7, TRY_LEAVE, TryCatch #5 {JSONException -> 0x02e7, blocks: (B:68:0x025c, B:70:0x026b, B:72:0x0277, B:74:0x0287, B:77:0x028e, B:80:0x0298, B:83:0x02b6, B:144:0x02cb, B:155:0x02ab), top: B:67:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b6 A[Catch: JSONException -> 0x02e7, TRY_ENTER, TryCatch #5 {JSONException -> 0x02e7, blocks: (B:68:0x025c, B:70:0x026b, B:72:0x0277, B:74:0x0287, B:77:0x028e, B:80:0x0298, B:83:0x02b6, B:144:0x02cb, B:155:0x02ab), top: B:67:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0341 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.app.Activity r38, android.content.Intent r39) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.d0.d(android.app.Activity, android.content.Intent):boolean");
    }

    public static void e(android.content.Context context, android.content.Intent intent, java.lang.String str, boolean z17, com.tencent.mm.plugin.game.model.e1 e1Var, int i17) {
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str);
        intent.putExtra("game_check_float", z17);
        if (z17 && e1Var != null) {
            e1Var.t0();
            com.tencent.mm.plugin.game.model.h0 h0Var = e1Var.f140291p2;
            if (h0Var.f140326d) {
                intent.putExtra("game_transparent_float_url", h0Var.f140323a);
            }
            intent.putExtra("game_sourceScene", i17);
            intent.putExtra("game_float_layer_url", h0Var.f140323a);
        }
        r53.f.E(intent, context);
    }

    public static void f(com.tencent.mm.plugin.game.model.e1 e1Var, int i17, int i18) {
        com.tencent.mm.plugin.game.model.e1 l17;
        if (e1Var != null) {
            l17 = e1Var;
        } else {
            l17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().l();
            if (l17 == null) {
                return;
            }
        }
        l17.t0();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameEntranceChecker", "float layer report");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17.f140291p2.f140323a)) {
            com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 10, 1006, 1, 1, 0, l17.field_appId, i17, l17.S2, l17.field_gameMsgId, l17.T2, com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(l17.f140279d2.f140410a), l17.U2, null));
            if (i18 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 16L, 1L, false);
            } else if (i18 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 17L, 1L, false);
            }
            l17.field_isRead = true;
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().update(l17, new java.lang.String[0]);
        }
        ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().f();
    }

    public static void g(int i17, boolean z17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.game.model.e1 m17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().m();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z17) {
            hashMap.put("luggage", "1");
        }
        if (str != null) {
            hashMap.put("entrance_url", str);
        }
        com.tencent.mm.plugin.game.model.a2 Bi = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi();
        if (Bi != null && Bi.b()) {
            m17 = null;
        }
        if (m17 == null) {
            hashMap.put("function_type", "resource");
            hashMap.put("function_value", java.lang.String.valueOf(0));
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 9, 901, 1, i17, 0, n53.a.d(hashMap));
        } else {
            m17.t0();
            hashMap.put("reddot_strategy", com.tencent.mm.plugin.game.commlib.util.d.a() ? "1" : "0");
            hashMap.put("channel", java.lang.Integer.toString(m17.field_channel));
            com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 9, 901, 1, i17, 0, m17.field_appId, i18, m17.S2, m17.field_gameMsgId, m17.T2, com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(m17.f140279d2.f140410a), m17.U2, hashMap));
            ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().c(com.tencent.mm.plugin.game.model.n1.GAME_REDDOT_EXIT_USER_CLICK);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 3L, 1L, false);
        }
    }
}
