package ze5;

/* loaded from: classes9.dex */
public final class n5 {
    public n5(kotlin.jvm.internal.i iVar) {
    }

    public static final z01.g0 a(ze5.n5 n5Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        n5Var.getClass();
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.g0();
        }
        l15.c cVar = new l15.c();
        cVar.set__useLruCache(true);
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return new z01.g0();
        }
        z01.g0 g0Var = new z01.g0();
        int i17 = k17.f432315e + 25;
        r05.g gVar = (r05.g) k17.getCustom(i17);
        int o17 = gVar != null ? gVar.o() : -1;
        int i18 = k17.f368365d;
        if (o17 >= 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = dVar.g();
            java.lang.String string = k17.getString(i18 + 2);
            ((ke0.e) xVar).getClass();
            g0Var.f469031d = com.tencent.mm.pluginsdk.ui.span.c0.i(g17, string);
            r05.g gVar2 = (r05.g) k17.getCustom(i17);
            kotlin.jvm.internal.o.d(gVar2);
            if (gVar2.s() == 1) {
                g0Var.f469035h = dVar.s().getString(com.tencent.mm.R.string.f491229nh4);
            }
        } else {
            g0Var.f469031d = k17.getString(i18 + 2);
        }
        g0Var.f469032e = k17.getString(i18 + 3);
        g0Var.f469036i = new ze5.k5(dVar, cVar, k17);
        g0Var.f469034g = k17.getInteger(i18 + 6) == 4;
        g0Var.f469037m = new ze5.l5(f9Var, dVar, k17);
        return g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0202, code lost:
    
        if ((r5 == null || r5.length() == 0) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0214, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0211, code lost:
    
        if ((r8 == null || r8.length() == 0) == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(yb5.d r19, com.tencent.mm.storage.f9 r20) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.n5.b(yb5.d, com.tencent.mm.storage.f9):void");
    }

    public final void c(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String j17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(ui6.g(), msg.G, null)) {
            return;
        }
        com.tencent.mm.modelstat.b.d(msg, com.tencent.mm.modelstat.a.Click, ui6.f460722q, ui6.k());
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
        if (msg.j() == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.set__useLruCache(true);
        java.lang.String U1 = msg.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return;
        }
        int i17 = k17.f368365d;
        if (!r26.n0.N(k17.getString(i17 + 9))) {
            int i18 = k17.f432315e;
            r05.a aVar = (r05.a) k17.getCustom(i18 + 7);
            if (ca4.n0.d(aVar != null ? aVar.j() : null)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("sns_landig_pages_from_source", 5);
                intent.putExtra("msg_id", msg.getMsgId());
                intent.putExtra("msg_talker", msg.Q0());
                r05.a aVar2 = (r05.a) k17.getCustom(i18 + 7);
                intent.putExtra("sns_landing_pages_xml", (aVar2 == null || (j17 = aVar2.j()) == null) ? "" : j17);
                intent.putExtra("sns_landing_pages_share_thumb_url", msg.z0());
                java.lang.String V1 = msg.V1();
                if (V1 == null) {
                    V1 = msg.Q0();
                }
                java.lang.String A = ca4.m0.A(V1, msg.Q0());
                if (!android.text.TextUtils.isEmpty(A)) {
                    intent.putExtra("sns_landing_pages_extra", A);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgUrlMvvm", "open Ad ChattingItemAppMsg handleUrlClickFrom, selfUserName is " + c01.z1.r() + ", extraData is " + A);
                intent.addFlags(268435456);
                j45.l.j(ui6.g(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
                com.tencent.mm.modelstat.k0.j(msg);
                return;
            }
            java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(k17.getString(i17 + 9), ui6.D() ? "groupmessage" : "singlemessage");
            java.lang.String string = k17.getString(i18 + 0);
            if (r26.n0.N(string)) {
                string = k17.getString(i17 + 9);
            }
            android.content.pm.PackageInfo j18 = com.tencent.mm.ui.chatting.w5.j(ui6.g(), k17.getString(i17 + 0));
            android.content.Intent intent2 = new android.content.Intent();
            int intExtra = ui6.g().getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(wi6)) {
                str = "msg_talker";
                str2 = "msg_id";
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                str3 = ot0.g0.a(wi6, 1, intExtra, currentTimeMillis);
                str4 = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(msg);
            } else {
                str = "msg_talker";
                str2 = "msg_id";
                str3 = wi6;
                str4 = null;
            }
            intent2.putExtra("rawUrl", str3);
            intent2.putExtra("webpageTitle", k17.getString(i17 + 2));
            intent2.putExtra("KShareTraceLastGMsgId", str4);
            if (kotlin.jvm.internal.o.b("wx751a1acca5688ba3", k17.getString(i17 + 0)) || kotlin.jvm.internal.o.b("wxfbc915ff7c30e335", k17.getString(i17 + 0)) || kotlin.jvm.internal.o.b("wx482a4001c37e2b74", k17.getString(i17 + 0))) {
                android.os.Bundle bundle = new android.os.Bundle();
                str5 = str2;
                bundle.putString("jsapi_args_appid", k17.getString(i17 + 0));
                intent2.putExtra("jsapiargs", bundle);
            } else {
                str5 = str2;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                intent2.putExtra("shortUrl", k17.getString(i17 + 9));
            } else {
                intent2.putExtra("shortUrl", string);
            }
            intent2.putExtra("version_name", j18 != null ? j18.versionName : null);
            intent2.putExtra("version_code", j18 != null ? j18.versionCode : 0);
            if (!r26.n0.N(k17.getString(i18 + 11))) {
                intent2.putExtra("srcUsername", k17.getString(i18 + 11));
                intent2.putExtra("srcDisplayname", k17.getString(i18 + 12));
            }
            intent2.putExtra(str5, msg.getMsgId());
            intent2.putExtra(str, msg.Q0());
            intent2.putExtra("KPublisherId", "msg_" + msg.I0());
            intent2.putExtra("KAppId", k17.getString(i17 + 0));
            intent2.putExtra("geta8key_username", ui6.x());
            intent2.putExtra("pre_username", g95.e0.f(msg));
            intent2.putExtra("from_scence", 2);
            intent2.putExtra("expid_str", msg.Q);
            java.lang.String fromUsername = cVar.getFromUsername();
            intent2.putExtra("msgUsername", fromUsername == null ? "" : fromUsername);
            intent2.putExtra("serverMsgID", java.lang.String.valueOf(msg.I0()));
            intent2.putExtra("KMsgType", msg.getType());
            intent2.putExtra("KAppMsgType", k17.getInteger(i17 + 6));
            int a17 = c01.h2.a(g95.e0.f(msg), ui6.x());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msg_");
            java.lang.String str6 = str3;
            sb6.append(msg.I0());
            intent2.putExtra("prePublishId", sb6.toString());
            intent2.putExtra("preUsername", g95.e0.f(msg));
            intent2.putExtra("preChatName", ui6.x());
            intent2.putExtra("preChatTYPE", a17);
            intent2.putExtra("preMsgIndex", 0);
            int i19 = a17 != 1 ? a17 != 2 ? (a17 == 6 || a17 == 7) ? 5 : 0 : 2 : 3;
            intent2.putExtra("share_report_pre_msg_url", k17.getString(i17 + 9));
            intent2.putExtra("share_report_pre_msg_title", k17.getString(i17 + 2));
            intent2.putExtra("share_report_pre_msg_desc", k17.getString(i17 + 3));
            intent2.putExtra("share_report_pre_msg_icon_url", k17.getString(i18 + 14));
            intent2.putExtra("share_report_pre_msg_appid", k17.getString(i17 + 0));
            intent2.putExtra("share_report_from_scene", i19);
            intent2.putExtra("geta8key_scene", 1);
            if (i19 == 5) {
                intent2.putExtra("share_report_biz_username", ui6.x());
            }
            r05.g gVar = (r05.g) k17.getCustom(i18 + 25);
            int o17 = gVar != null ? gVar.o() : -1;
            java.lang.String str7 = com.tencent.mm.ui.w2.f211197j;
            r05.g gVar2 = (r05.g) k17.getCustom(i18 + 25);
            intent2.putExtra(str7, gVar2 != null ? gVar2.o() : -1);
            intent2.putExtra("key_enable_teen_mode_check", true);
            intent2.putExtra("key_enable_fts_quick", true);
            android.os.Bundle bundleExtra = intent2.getBundleExtra("jsapiargs");
            if (bundleExtra == null) {
                bundleExtra = new android.os.Bundle();
            }
            bundleExtra.putBoolean("k_is_secret_msg", true);
            r45.l97 l97Var = new r45.l97();
            l97Var.f379259d = (int) (java.lang.System.currentTimeMillis() / 1000);
            l97Var.f379262g = ui6.D() ? 2 : 1;
            l97Var.f379263h = ui6.x();
            l97Var.f379260e = k17.getString(i17 + 9);
            l97Var.f379261f = k17.getString(i17 + 0);
            try {
                bundleExtra.putByteArray("key_webview_secret_msg_info", l97Var.toByteArray());
                intent2.putExtra("jsapiargs", bundleExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemAppMsgUrlMvvm", e17, "fillWebPageSecretMsgInfo exception", new java.lang.Object[0]);
            }
            intent2.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            intent2.putExtra("thumbUrl", k17.getString(i18 + 14));
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            intent2.putExtra("thumbPath", m11.b1.Di().D2(msg, msg.z0(), true));
            if (o17 != 16) {
                te5.t.i(ui6, msg, 0);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(3)) {
                    if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(ui6.g(), str6, o17, false, 1, intExtra, intent2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgUrlMvvm", "jump to TmplWebview");
                        return;
                    }
                }
                j45.l.j(ui6.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
                return;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("biz_video_scene", 1);
            bundle2.putInt(com.tencent.mm.ui.j2.f208990a, intExtra);
            bundle2.putInt("geta8key_scene", 1);
            bundle2.putString("geta8key_username", ui6.x());
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            os1.a.a(g17, msg.getMsgId(), msg.Q0(), msg.I0(), 0, bundle2);
        }
    }

    public final boolean d(db5.g4 menu, android.view.View v17, com.tencent.mm.storage.f9 msg, yb5.d ui6) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(ui6, "ui");
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        int r17 = com.tencent.mm.pluginsdk.model.app.k0.r(c01.w9.l(ui6.D(), msg.j(), msg.A0()));
        l15.c cVar = new l15.c();
        cVar.set__useLruCache(true);
        java.lang.String U1 = msg.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String string = k17.getString(k17.f368365d + 0);
        ((kt.c) i0Var).getClass();
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(string, false, false)) && !com.tencent.mm.ui.chatting.n3.k(msg) && !c01.ia.x(msg) && !com.tencent.mm.ui.chatting.n3.j(msg) && !com.tencent.mm.ui.chatting.n3.D(msg)) {
            menu.c(d17, 111, 0, ui6.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        v05.a aVar = (v05.a) k17.getCustom(k17.f432315e + 8);
        long j17 = aVar != null ? aVar.getLong(aVar.f368364d + 0) : 0L;
        if ((j17 <= 0 || (j17 > 0 && r17 >= 100)) && r01.z.e() && !ui6.F()) {
            menu.add(d17, 114, 0, v17.getContext().getString(com.tencent.mm.R.string.b3l));
        }
        menu.c(d17, 116, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        if (((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).oj(msg, true)) {
            ((db5.h4) menu.c(d17, ib1.t.CTRL_INDEX, 0, ui6.s().getString(com.tencent.mm.R.string.nh7), com.tencent.mm.R.raw.article_ai_filled)).f228369m = v17.getContext().getString(com.tencent.mm.R.string.nh8);
            ((vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class))).aj();
        }
        if (!((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(msg)) {
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            long msgId = msg.getMsgId();
            am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
            b6Var.f6219a = msgId;
            b6Var.f6220b = msg.Q0();
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                menu.c(d17, 129, 0, v17.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
            }
        }
        if (c01.ia.A(msg)) {
            menu.clear();
        }
        if ((msg.K1() || msg.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(msg, ui6) && com.tencent.mm.ui.chatting.viewitems.a0.J(msg.Q0()) && !ui6.A()) {
            menu.c(d17, 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!ui6.F()) {
            menu.c(d17, 100, 0, ui6.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    public final boolean e(android.view.MenuItem item, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        int itemId = item.getItemId();
        if (itemId == 111) {
            ze5.m5 m5Var = new ze5.m5(ui6, msg);
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            com.tencent.mm.ui.chatting.manager.t.a(msg, g17, m5Var);
            return true;
        }
        if (itemId == 114) {
            if (msg.j() == null) {
                return false;
            }
            com.tencent.mm.ui.chatting.ed.b(msg, c01.w9.l(ui6.D(), msg.j(), msg.A0()), ui6.g(), 128);
            return true;
        }
        if (itemId != 173) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgUrlMvvm", "[onYuanBaoSummaryClick] AppMsgUrl, msgId: " + msg.getMsgId());
        ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).pj("journey_summarize");
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        android.app.Activity g18 = ui6.g();
        kotlin.jvm.internal.o.f(g18, "getContext(...)");
        ((qg5.z2) j3Var).ij(g18, msg, ui6.u());
        ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).wj(msg, ui6.x());
        return true;
    }
}
