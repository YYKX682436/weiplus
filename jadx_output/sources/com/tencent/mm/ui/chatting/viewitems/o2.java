package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class o2 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6, we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204964s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.g6 f204965t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.j6 f204966u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.h6 f204967v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.k6 f204968w;

    /* JADX WARN: Removed duplicated region for block: B:34:0x021d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d0(ot0.q r16, yb5.d r17, com.tencent.mm.storage.f9 r18, com.tencent.mm.ui.chatting.viewitems.qq r19) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.o2.d0(ot0.q, yb5.d, com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.qq):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r4.equals(r14) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e0(ot0.q r18, yb5.d r19, com.tencent.mm.storage.f9 r20, com.tencent.mm.ui.chatting.viewitems.qq r21) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.o2.e0(ot0.q, yb5.d, com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.qq):boolean");
    }

    public static boolean f0(ot0.q qVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.qq qqVar) {
        java.lang.String str = qVar.f348674k;
        int i17 = 0;
        if (str == null || str.equals("")) {
            return false;
        }
        if (ca4.n0.d(qVar.C2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_landig_pages_from_source", 5);
            intent.putExtra("msg_id", f9Var.getMsgId());
            intent.putExtra("msg_talker", f9Var.Q0());
            intent.putExtra("sns_landing_pages_xml", qVar.C2);
            intent.putExtra("sns_landing_pages_share_thumb_url", f9Var.z0());
            intent.addFlags(268435456);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "open Ad ChattingItemAppMsg handleDefaultClickTo, selfUserName is " + c01.z1.r() + ", extraData is " + ca4.m0.A(dVar.f460716k, f9Var.Q0()));
            j45.l.j(dVar.g(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
            return true;
        }
        su4.l2 l2Var = (su4.l2) qVar.y(su4.l2.class);
        if (l2Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(l2Var.f412983b)) {
            r45.y97 y97Var = new r45.y97();
            y97Var.f390898d = l2Var.f412983b;
            y97Var.f390899e = l2Var.f412984c;
            y97Var.f390900f = l2Var.f412985d;
            y97Var.f390901g = l2Var.f412986e;
            y97Var.f390902h = l2Var.f412987f;
            y97Var.f390903i = l2Var.f412996o;
            y97Var.f390904m = l2Var.f412988g;
            y97Var.f390905n = l2Var.f412989h;
            y97Var.f390906o = l2Var.f412990i;
            y97Var.f390907p = l2Var.f412991j;
            y97Var.f390908q = l2Var.f412992k;
            y97Var.f390909r = l2Var.f412993l;
            y97Var.f390910s = l2Var.f412994m;
            y97Var.f390911t = l2Var.f412995n;
            y97Var.f390912u = l2Var.f412997p;
            y97Var.f390914w = l2Var.f412999r;
            y97Var.f390915x = l2Var.f413000s;
            y97Var.f390917z = l2Var.f413002u;
            y97Var.f390913v = l2Var.f412998q;
            su4.r2.r(dVar.g(), pm4.w.q(y97Var, 32, dVar.g().getString(com.tencent.mm.R.string.f492173fh3)));
            pm4.y.e(y97Var, f9Var);
            return true;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f348674k, dVar.D() ? "groupmessage" : "singlemessage");
        java.lang.String str2 = qVar.f348674k;
        android.content.pm.PackageInfo j17 = com.tencent.mm.ui.chatting.w5.j(dVar.g(), qVar.f348646d);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", wi6);
        intent2.putExtra("webpageTitle", qVar.f348654f);
        java.lang.String str3 = qVar.f348646d;
        if (str3 != null && ("wx751a1acca5688ba3".equals(str3) || "wxfbc915ff7c30e335".equals(qVar.f348646d) || "wx482a4001c37e2b74".equals(qVar.f348646d))) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("jsapi_args_appid", qVar.f348646d);
            intent2.putExtra("jsapiargs", bundle);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent2.putExtra("shortUrl", qVar.f348674k);
        } else {
            intent2.putExtra("shortUrl", str2);
        }
        intent2.putExtra("version_name", j17 == null ? null : j17.versionName);
        intent2.putExtra("version_code", j17 == null ? 0 : j17.versionCode);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348722w)) {
            intent2.putExtra("srcUsername", qVar.f348722w);
            intent2.putExtra("srcDisplayname", qVar.f348726x);
        }
        intent2.putExtra("msg_id", f9Var.getMsgId());
        intent2.putExtra("msg_talker", f9Var.Q0());
        intent2.putExtra("KPublisherId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent2.putExtra("KAppId", qVar.f348646d);
        intent2.putExtra("geta8key_username", dVar.x());
        intent2.putExtra("pre_username", qqVar.a(dVar, f9Var));
        intent2.putExtra("from_scence", 2);
        intent2.putExtra("expid_str", com.tencent.mm.pluginsdk.model.app.k0.l(f9Var));
        intent2.putExtra("key_enable_teen_mode_check", true);
        intent2.putExtra("key_enable_fts_quick", true);
        com.tencent.mm.ui.chatting.viewitems.j1.q(intent2, f9Var, qVar);
        int a17 = c01.h2.a(qqVar.a(dVar, f9Var), dVar.x());
        intent2.putExtra("prePublishId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent2.putExtra("preUsername", qqVar.a(dVar, f9Var));
        intent2.putExtra("preChatName", dVar.x());
        intent2.putExtra("preChatTYPE", a17);
        intent2.putExtra("preMsgIndex", 0);
        if (a17 == 1) {
            i17 = 3;
        } else if (a17 == 2) {
            i17 = 2;
        } else if (a17 == 6 || a17 == 7) {
            i17 = 5;
        }
        intent2.putExtra("share_report_pre_msg_url", qVar.f348674k);
        intent2.putExtra("share_report_pre_msg_title", qVar.f348654f);
        intent2.putExtra("share_report_pre_msg_desc", qVar.f348658g);
        intent2.putExtra("share_report_pre_msg_icon_url", qVar.f348734z);
        intent2.putExtra("share_report_pre_msg_appid", qVar.f348646d);
        intent2.putExtra("share_report_from_scene", i17);
        if (i17 == 5) {
            intent2.putExtra("share_report_biz_username", dVar.x());
        }
        j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
        return true;
    }

    public static boolean g0(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.qq qqVar) {
        if (i17 != 19) {
            return false;
        }
        if (((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).oj(f9Var.Q0())) {
            te5.t.f(dVar, f9Var);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", f9Var.getMsgId());
        intent.putExtra("message_talker", f9Var.Q0());
        intent.putExtra("Retr_Security_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_Security_Msg_Talker", f9Var.Q0());
        intent.putExtra("blacklist_file_md5", te5.p1.a(f9Var));
        int a17 = c01.h2.a(str, dVar.x());
        intent.putExtra("prePublishId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent.putExtra("preUsername", str);
        intent.putExtra("preChatName", dVar.x());
        intent.putExtra("preChatTYPE", a17);
        intent.putExtra("msgUsername", dVar.f460716k);
        intent.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
        intent.putExtra("chatTypeForAppbrand", k01.d.a(dVar.x()));
        com.tencent.mm.ui.chatting.w5.c(intent, dVar, f9Var);
        com.tencent.mm.modelstat.b.a(f9Var);
        j45.l.j(dVar.g(), "record", ".ui.RecordMsgDetailUI", intent, null);
        return true;
    }

    public static boolean h0(ot0.q qVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (com.tencent.mm.ui.chatting.w5.l(dVar, qVar, f9Var, str)) {
            return true;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f348674k, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        java.lang.String wi7 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f348678l, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        android.content.pm.PackageInfo j17 = com.tencent.mm.ui.chatting.w5.j(dVar.g(), qVar.f348646d);
        com.tencent.mm.ui.chatting.w5.n(dVar, wi6, wi7, j17 == null ? null : j17.versionName, j17 == null ? 0 : j17.versionCode, qVar.f348646d, true, f9Var.getMsgId(), f9Var.I0(), f9Var, qVar, str);
        return true;
    }

    public static boolean i0(ot0.q qVar, android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.qq qqVar) {
        java.lang.String str;
        if (!com.tencent.mm.storage.z3.N4(f9Var.Q0())) {
            el0.i.b(false, f9Var.I0(), f9Var.Q0());
        }
        if (ca4.n0.d(qVar.C2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_landig_pages_from_source", 5);
            intent.putExtra("msg_id", f9Var.getMsgId());
            intent.putExtra("msg_talker", f9Var.Q0());
            intent.putExtra("sns_landing_pages_xml", qVar.C2);
            intent.putExtra("sns_landing_pages_share_thumb_url", f9Var.z0());
            java.lang.String A = ca4.m0.A(dVar.f460716k, f9Var.Q0());
            if (!android.text.TextUtils.isEmpty(A)) {
                intent.putExtra("sns_landing_pages_extra", A);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "open Ad ChattingItemAppMsg handleUrlClickTo, selfUserName is " + c01.z1.r() + ", extraData is " + A);
            intent.addFlags(268435456);
            j45.l.j(dVar.g(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
            com.tencent.mm.modelstat.k0.j(f9Var);
            return true;
        }
        su4.l2 l2Var = (su4.l2) qVar.y(su4.l2.class);
        if (l2Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(l2Var.f412983b)) {
            r45.y97 y97Var = new r45.y97();
            y97Var.f390898d = l2Var.f412983b;
            y97Var.f390899e = l2Var.f412984c;
            y97Var.f390900f = l2Var.f412985d;
            y97Var.f390901g = l2Var.f412986e;
            y97Var.f390902h = l2Var.f412987f;
            y97Var.f390903i = l2Var.f412996o;
            y97Var.f390904m = l2Var.f412988g;
            y97Var.f390905n = l2Var.f412989h;
            y97Var.f390906o = l2Var.f412990i;
            y97Var.f390907p = l2Var.f412991j;
            y97Var.f390908q = l2Var.f412992k;
            y97Var.f390909r = l2Var.f412993l;
            y97Var.f390910s = l2Var.f412994m;
            y97Var.f390911t = l2Var.f412995n;
            y97Var.f390912u = l2Var.f412997p;
            y97Var.f390914w = l2Var.f412999r;
            y97Var.f390915x = l2Var.f413000s;
            y97Var.f390917z = l2Var.f413002u;
            y97Var.f390913v = l2Var.f412998q;
            su4.r2.r(dVar.g(), pm4.w.q(y97Var, 32, dVar.g().getString(com.tencent.mm.R.string.f492173fh3)));
            pm4.y.e(y97Var, f9Var);
            return true;
        }
        java.lang.String str2 = qVar.f348674k;
        if (str2 == null || str2.equals("")) {
            return true;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f348674k, dVar.D() ? "groupmessage" : "singlemessage");
        java.lang.String str3 = qVar.f348678l;
        int a17 = c01.h2.a(qqVar.a(dVar, f9Var), dVar.x());
        int intExtra = dVar.g().getIntent().getIntExtra("KOpenArticleSceneFromScene", a17 == 2 ? qf1.f.CTRL_INDEX : qf1.j.CTRL_INDEX);
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(wi6)) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            wi6 = ot0.g0.a(wi6, 1, intExtra, currentTimeMillis);
            str = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(f9Var);
        } else {
            str = null;
        }
        android.content.pm.PackageInfo j17 = com.tencent.mm.ui.chatting.w5.j(dVar.g(), qVar.f348646d);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", wi6);
        java.lang.String str4 = wi6;
        intent2.putExtra("webpageTitle", qVar.f348654f);
        intent2.putExtra("msgUsername", dVar.f460716k);
        intent2.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
        intent2.putExtra("KMsgType", f9Var.getType());
        intent2.putExtra("KAppMsgType", qVar.f348666i);
        intent2.putExtra("KShareTraceLastGMsgId", str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_snsad_statextstr", qVar.Y1);
        java.lang.String str5 = qVar.f348646d;
        if (str5 != null && ("wx751a1acca5688ba3".equals(str5) || "wxfbc915ff7c30e335".equals(qVar.f348646d) || "wx482a4001c37e2b74".equals(qVar.f348646d))) {
            bundle.putString("jsapi_args_appid", qVar.f348646d);
        }
        intent2.putExtra("jsapiargs", bundle);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            intent2.putExtra("shortUrl", qVar.f348674k);
        } else {
            intent2.putExtra("shortUrl", str3);
        }
        intent2.putExtra("version_name", j17 == null ? null : j17.versionName);
        intent2.putExtra("version_code", j17 == null ? 0 : j17.versionCode);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348722w)) {
            intent2.putExtra("srcUsername", qVar.f348722w);
            intent2.putExtra("srcDisplayname", qVar.f348726x);
        }
        intent2.putExtra("msg_id", f9Var.getMsgId());
        intent2.putExtra("msg_talker", f9Var.Q0());
        com.tencent.mm.ui.chatting.viewitems.j1.q(intent2, f9Var, qVar);
        intent2.putExtra("KPublisherId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent2.putExtra("KAppId", qVar.f348646d);
        intent2.putExtra("geta8key_username", dVar.x());
        intent2.putExtra("pre_username", qqVar.a(dVar, f9Var));
        intent2.putExtra("from_scence", 2);
        intent2.putExtra("prePublishId", "msg_" + java.lang.Long.toString(f9Var.I0()));
        intent2.putExtra("preUsername", qqVar.a(dVar, f9Var));
        intent2.putExtra("preChatName", dVar.x());
        intent2.putExtra("preChatTYPE", a17);
        int i17 = 0;
        intent2.putExtra("preMsgIndex", 0);
        if (a17 == 1) {
            i17 = 3;
        } else if (a17 == 2) {
            i17 = 2;
        } else if (a17 == 6 || a17 == 7) {
            i17 = 5;
        }
        intent2.putExtra("share_report_pre_msg_url", qVar.f348674k);
        intent2.putExtra("share_report_pre_msg_title", qVar.f348654f);
        intent2.putExtra("share_report_pre_msg_desc", qVar.f348658g);
        intent2.putExtra("share_report_pre_msg_icon_url", qVar.f348734z);
        intent2.putExtra("share_report_pre_msg_appid", qVar.f348646d);
        intent2.putExtra("geta8key_scene", 1);
        intent2.putExtra("share_report_from_scene", i17);
        if (i17 == 5) {
            intent2.putExtra("share_report_biz_username", dVar.x());
        }
        ot0.f fVar = (ot0.f) qVar.y(ot0.f.class);
        int i18 = fVar != null ? fVar.f348455b : -1;
        intent2.putExtra(com.tencent.mm.ui.w2.f211197j, i18);
        intent2.putExtra("key_enable_teen_mode_check", true);
        intent2.putExtra("key_enable_fts_quick", true);
        intent2.putExtra("msgUsername", dVar.f460716k);
        intent2.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
        if (fVar == null || i18 != 16) {
            com.tencent.mm.ui.chatting.viewitems.j1.j(qVar, dVar, intent2);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(3)) {
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(dVar.g(), str4, i18, false, 1, intExtra, intent2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgTo", "jump to TmplWebview");
                    return true;
                }
            }
            intent2.putExtra("pay_chat_type", k01.d.a(dVar.x()));
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
            return true;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("biz_video_scene", 1);
        bundle2.putInt(com.tencent.mm.ui.j2.f208990a, intExtra);
        bundle2.putInt("geta8key_scene", 1);
        bundle2.putString("geta8key_username", dVar.x());
        bundle2.putString("webpageTitle", qVar.f348654f);
        if (l2Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(l2Var.f412983b)) {
            cy4.b.f224859a.d(l2Var.f412983b);
        }
        os1.a.a(dVar.g(), f9Var.getMsgId(), f9Var.Q0(), f9Var.I0(), 0, bundle2);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1w);
        com.tencent.mm.ui.chatting.viewitems.v1 v1Var = new com.tencent.mm.ui.chatting.viewitems.v1();
        v1Var.b(xgVar, false);
        xgVar.setTag(v1Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, final yb5.d dVar, rd5.d dVar2) {
        ot0.q v17;
        final com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int itemId = menuItem.getItemId();
        if (itemId == 103) {
            java.lang.String j17 = f9Var.j();
            if (j17 == null) {
                return false;
            }
            ot0.q v18 = ot0.q.v(j17);
            if (v18 != null && v18.f348666i == 16) {
                com.tencent.mm.autogen.events.GiftCardEvent giftCardEvent = new com.tencent.mm.autogen.events.GiftCardEvent();
                java.lang.String str = v18.T0;
                am.yg ygVar = giftCardEvent.f54423g;
                ygVar.f8458a = str;
                ygVar.f8459b = f9Var.getMsgId();
                ygVar.f8460c = f9Var.Q0();
                giftCardEvent.e();
            }
        } else {
            if (itemId == 111) {
                com.tencent.mm.ui.chatting.manager.t.a(f9Var, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.o2$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ot0.q v19;
                        com.tencent.mm.ui.chatting.viewitems.o2 o2Var = com.tencent.mm.ui.chatting.viewitems.o2.this;
                        yb5.d dVar3 = dVar;
                        com.tencent.mm.storage.f9 f9Var2 = f9Var;
                        if (f9Var2 != null) {
                            o2Var.getClass();
                            if (f9Var2.k2() && (v19 = ot0.q.v(f9Var2.j())) != null) {
                                int i17 = v19.f348666i;
                                if (i17 == 40) {
                                    db5.e1.y(dVar3.g(), dVar3.g().getString(com.tencent.mm.R.string.c96), "", dVar3.g().getString(com.tencent.mm.R.string.l_e), null);
                                    return;
                                } else if (i17 == 33 && !com.tencent.mm.sdk.platformtools.f9.SessionAppbrand.k(dVar3.g(), null)) {
                                    return;
                                }
                            }
                        }
                        com.tencent.mm.ui.chatting.viewitems.s1.c(dVar3, f9Var2, o2Var.A(dVar3, f9Var2), -1, null);
                    }
                });
                return false;
            }
            if (itemId == 114) {
                java.lang.String j18 = f9Var.j();
                if (j18 != null && (v17 = ot0.q.v(j18)) != null) {
                    int i17 = v17.f348666i;
                    if (i17 == 1) {
                        com.tencent.mm.ui.chatting.ed.e(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()), dVar.g());
                    } else if (i17 == 2) {
                        com.tencent.mm.ui.chatting.ed.d(f9Var, dVar.g(), A(dVar, f9Var), dVar.D());
                    } else if (i17 == 4) {
                        com.tencent.mm.ui.chatting.ed.f(f9Var, dVar.g());
                    } else if (i17 == 5) {
                        com.tencent.mm.ui.chatting.ed.b(f9Var, c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()), dVar.g(), 128);
                    } else if (i17 == 8) {
                        com.tencent.mm.ui.chatting.ed.c(f9Var, dVar.g());
                    }
                }
                return false;
            }
            if (itemId != 173) {
                if (itemId != 174) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgTo", "[onYuanBaoSummaryFileClick] AppMsgUrl, msgId: ${msg.msgId}");
                ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).pj("journey_summarize");
                ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).hj(dVar.g(), f9Var, dVar.u());
                ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).vj(f9Var, dVar.x());
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgTo", "[onYuanBaoSummaryArticleClick] AppMsgUrl, msgId: ${msg.msgId}");
        ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).pj("journey_summarize");
        ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).ij(dVar.g(), f9Var, dVar.u());
        ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).wj(f9Var, dVar.x());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x014d, code lost:
    
        if (r01.q3.cj().u1(64) > 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x014f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0168, code lost:
    
        if (r01.q3.cj().u1(1) > 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d4, code lost:
    
        if (r3 != 20) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bc  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r17, android.view.View r18, rd5.d r19) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.o2.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        if (r7 != 103) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(android.view.View r28, yb5.d r29, com.tencent.mm.storage.f9 r30) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.o2.R(android.view.View, yb5.d, com.tencent.mm.storage.f9):boolean");
    }

    @Override // we5.b
    public rd5.d b(we5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.u1(aVar);
    }

    @Override // we5.b
    public boolean c() {
        boolean z17 = od5.b.f344655a;
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.asyncbind.RepairerConfigChatListAsyncBind_AppMsg()) == 1;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5h), "", dVar.s().getString(com.tencent.mm.R.string.f490543y2), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.viewitems.p2(this, f9Var, dVar), new com.tencent.mm.ui.chatting.viewitems.q2(this));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x0288. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022f  */
    @Override // we5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(final yb5.d r30, rd5.d r31, final java.lang.String r32, we5.y0 r33) {
        /*
            Method dump skipped, instructions count: 2772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.o2.e(yb5.d, rd5.d, java.lang.String, we5.y0):void");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        e(dVar, dVar2, str, we5.y0.a((com.tencent.mm.ui.chatting.viewitems.v1) g0Var));
    }
}
