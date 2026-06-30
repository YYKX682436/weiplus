package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public abstract class w5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f206212a = new java.util.HashMap();

    public static void A(android.view.View view, boolean z17, boolean z18) {
        if (view == null) {
            return;
        }
        if (!z17) {
            view.setTag(com.tencent.mm.R.id.bpk, java.lang.Boolean.FALSE);
            java.util.Map map = f206212a;
            if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(view.hashCode())) != null) {
                if (((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(view.hashCode()))).get() != null) {
                    ((java.util.concurrent.Future) ((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(view.hashCode()))).get()).cancel(false);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!z18) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setTag(com.tencent.mm.R.id.bpk, java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.bpi);
        if (tag != null && ((java.lang.Long) tag).longValue() < c01.id.c() - 1000) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setTag(com.tencent.mm.R.id.bpk, java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.bpk);
        if (tag2 != null && ((java.lang.Boolean) tag2).booleanValue()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.ui.chatting.v5 v5Var = new com.tencent.mm.ui.chatting.v5(view);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c z19 = t0Var.z(v5Var, 1000L, false);
        ((java.util.HashMap) f206212a).put(java.lang.Integer.valueOf(view.hashCode()), new java.lang.ref.WeakReference(z19));
    }

    public static void a(com.tencent.mm.storage.f9 f9Var, android.content.Intent intent) {
        if (f9Var == null || intent == null) {
            return;
        }
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String Q02 = f9Var.Q0();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", c01.e2.G(Q0) ? 7 : 1);
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(f9Var.I0()));
        bundle.putString("stat_chat_talker_username", Q0);
        bundle.putString("stat_send_msg_user", Q02);
        intent.putExtra("_stat_obj", bundle);
    }

    public static void b(long j17, int i17, android.content.Context context, androidx.fragment.app.Fragment fragment, android.app.Activity activity, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String str2 = "";
        java.lang.String a17 = c01.n2.a("" + f9Var.I0());
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("prePublishId", "msg_" + f9Var.I0());
        c17.i("preUsername", Q0);
        c17.i("preChatName", Q0);
        c17.i("preMsgIndex", java.lang.Integer.valueOf(i17));
        c17.i("sendAppMsgScene", 1);
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6321g = i17;
        c4Var.f6322h = a17;
        c4Var.f6324j = fragment;
        c4Var.f6323i = activity;
        c4Var.f6327m = 40;
        com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, f9Var, false);
        doFavoriteEvent.e();
        if (doFavoriteEvent.f54091h.f6433a == 0) {
            ot0.q v17 = ot0.q.v(ot0.g0.i(context, i17, f9Var.j(), f9Var.Q0(), f9Var.getMsgId()));
            if (f9Var.k2()) {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                com.tencent.mm.modelstat.e.f71505a.getClass();
            } else {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                com.tencent.mm.modelstat.e.f71505a.getClass();
            }
            if (v17 == null || v17.f348666i != 5 || (str = v17.f348674k) == null) {
                return;
            }
            try {
                str2 = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemHelper", e17, "", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13378, str2, java.lang.Long.valueOf(j17), 1, 2, 1);
        }
    }

    public static void c(android.content.Intent intent, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String x17 = dVar.x();
        java.lang.String f17 = g95.e0.f(f9Var);
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar.D()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(f9Var.I0()));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", f17);
        intent.putExtra("_stat_obj", bundle);
    }

    public static void d(yb5.d dVar, ot0.q qVar, java.lang.String str, com.tencent.mm.pluginsdk.model.app.m mVar, long j17, int i17, java.lang.String str2) {
        com.tencent.mm.pluginsdk.ui.tools.k0 k0Var = (com.tencent.mm.pluginsdk.ui.tools.k0) qVar.y(com.tencent.mm.pluginsdk.ui.tools.k0.class);
        g(dVar, qVar.f348666i, qVar.f348646d, qVar.X, k0Var != null ? java.lang.Integer.valueOf(k0Var.f191741b) : null, str, mVar, j17, i17, str2);
    }

    public static void e(yb5.d dVar, ot0.q qVar, java.lang.String str, com.tencent.mm.pluginsdk.model.app.m mVar, long j17, java.lang.String str2) {
        d(dVar, qVar, str, mVar, j17, -1, str2);
    }

    public static void f(yb5.d dVar, v05.b bVar, java.lang.String str, com.tencent.mm.pluginsdk.model.app.m mVar, long j17, java.lang.String str2) {
        int integer = bVar.getInteger(bVar.f368365d + 6);
        java.lang.String string = bVar.getString(bVar.f368365d + 0);
        int i17 = bVar.f432315e;
        g(dVar, integer, string, bVar.getString(i17 + 15), java.lang.Integer.valueOf(bVar.getInteger(i17 + 53)), str, mVar, j17, -1, str2);
    }

    public static void g(yb5.d dVar, int i17, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, com.tencent.mm.pluginsdk.model.app.m mVar, long j17, int i18, java.lang.String str4) {
        int i19 = 1;
        int i27 = dVar.D() ? 2 : 1;
        if (i18 == -1) {
            i18 = i17 == 7 ? (mVar == null || !com.tencent.mm.pluginsdk.model.app.j1.f(dVar.g(), mVar.field_packageName)) ? 6 : 0 : 3;
        }
        if (i17 == 2) {
            i19 = 4;
        } else if (i17 != 5) {
            i19 = i18;
        }
        com.tencent.mm.autogen.events.ReportMsgClickEvent reportMsgClickEvent = new com.tencent.mm.autogen.events.ReportMsgClickEvent();
        android.app.Activity g17 = dVar.g();
        am.cr crVar = reportMsgClickEvent.f54687g;
        crVar.f6382a = g17;
        crVar.f6388g = i27;
        crVar.f6383b = str;
        crVar.f6384c = mVar == null ? null : mVar.field_packageName;
        crVar.f6386e = i17;
        crVar.f6385d = str3;
        crVar.f6389h = i19;
        crVar.f6387f = str2;
        crVar.f6390i = j17;
        crVar.f6391j = "";
        crVar.f6392k = str4;
        if (num != null) {
            crVar.f6393l = num.intValue();
        }
        reportMsgClickEvent.e();
    }

    public static int h(android.content.Context context) {
        float q17 = i65.a.q(context);
        return q17 == i65.a.y(context) ? i65.a.f(context, com.tencent.mm.R.dimen.f480244sd) : q17 == i65.a.w(context) ? i65.a.f(context, com.tencent.mm.R.dimen.f480235s6) : q17 == i65.a.z(context) ? i65.a.f(context, com.tencent.mm.R.dimen.f480245se) : q17 == i65.a.s(context) ? i65.a.f(context, com.tencent.mm.R.dimen.f480221rs) : (q17 == i65.a.t(context) || q17 == i65.a.u(context) || q17 == i65.a.v(context)) ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480222rt) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480241sa);
    }

    public static int i(android.content.Context context) {
        float q17 = i65.a.q(context);
        if (q17 != i65.a.y(context) && q17 != i65.a.w(context)) {
            return q17 == i65.a.z(context) ? i65.a.f(context, com.tencent.mm.R.dimen.f480220rr) : q17 == i65.a.s(context) ? i65.a.f(context, com.tencent.mm.R.dimen.f480218rp) : (q17 == i65.a.t(context) || q17 == i65.a.u(context) || q17 == i65.a.v(context)) ? i65.a.f(context, com.tencent.mm.R.dimen.f480222rt) : i65.a.f(context, com.tencent.mm.R.dimen.f480219rq);
        }
        return i65.a.f(context, com.tencent.mm.R.dimen.f480219rq);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.pm.PackageInfo j(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L21
            int r1 = r4.length()
            if (r1 != 0) goto La
            goto L21
        La:
            java.lang.Class<lt.i0> r1 = lt.i0.class
            i95.m r1 = i95.n0.c(r1)
            lt.i0 r1 = (lt.i0) r1
            kt.c r1 = (kt.c) r1
            r1.getClass()
            com.tencent.mm.pluginsdk.model.app.m r4 = com.tencent.mm.pluginsdk.model.app.w.h(r4)
            if (r4 != 0) goto L1e
            goto L21
        L1e:
            java.lang.String r4 = r4.field_packageName
            goto L22
        L21:
            r4 = r0
        L22:
            if (r4 != 0) goto L25
            return r0
        L25:
            r1 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            return r3
        L2f:
            r3 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "MicroMsg.ChattingItemHelper"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.w5.j(android.content.Context, java.lang.String):android.content.pm.PackageInfo");
    }

    public static java.lang.String k(long j17, java.lang.String str, java.lang.String str2) {
        java.lang.String a17 = c01.n2.a("" + j17);
        boolean z17 = true;
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("preUsername", str);
        c17.i("preChatName", str2);
        qk.o b17 = r01.z.b(str2);
        if (b17 == null || (!b17.Q0() && !b17.T0())) {
            z17 = false;
        }
        c17.i("Contact_Sub_Scene", java.lang.Integer.valueOf((z17 || com.tencent.mm.storage.z3.z3(str2)) ? 5 : 3));
        c17.i("Contact_Scene_Note", str2);
        return a17;
    }

    public static boolean l(yb5.d dVar, ot0.q qVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348637a2)) {
            return false;
        }
        com.tencent.mm.ui.chatting.e.a(com.tencent.mm.ui.chatting.a.EnterCompleteVideo, f9Var, qVar.f348665h2, qVar.f348661g2);
        java.lang.String z07 = f9Var.z0();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KFromTimeLine", false);
        intent.putExtra("KStremVideoUrl", qVar.f348637a2);
        intent.putExtra("KThumUrl", qVar.f348657f2);
        intent.putExtra("KThumbPath", z07);
        intent.putExtra("KSta_StremVideoAduxInfo", qVar.f348661g2);
        intent.putExtra("KSta_StremVideoPublishId", qVar.f348665h2);
        intent.putExtra("KSta_SourceType", 2);
        intent.putExtra("KSta_Scene", (dVar.D() ? com.tencent.mm.ui.chatting.b.TalkChat : com.tencent.mm.ui.chatting.b.Chat).f198482d);
        intent.putExtra("KSta_FromUserName", str);
        intent.putExtra("KSta_ChatName", dVar.x());
        intent.putExtra("KSta_MsgId", f9Var.I0());
        intent.putExtra("KSta_SnsStatExtStr", qVar.Y1);
        if (dVar.D()) {
            intent.putExtra("KSta_ChatroomMembercount", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(dVar.x()));
        }
        intent.putExtra("KMediaId", "fakeid_" + f9Var.getMsgId());
        intent.putExtra("KMediaVideoTime", qVar.f348641b2);
        intent.putExtra("StremWebUrl", qVar.f348653e2);
        intent.putExtra("StreamWording", qVar.f348649d2);
        intent.putExtra("KMediaTitle", qVar.n());
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
            j45.l.j(dVar.g(), "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelper", "use new stream video play UI");
        } else {
            j45.l.j(dVar.g(), "sns", ".ui.VideoAdPlayerUI", intent, null);
        }
        return true;
    }

    public static void m(yb5.d dVar, java.lang.String str, long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelper", "gotoEditUI() msgId:%s scene:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_Msg_Id", j17);
        intent.putExtra("key_group_solitatire_create", false);
        intent.putExtra("key_group_solitatire_key", Li.W1());
        intent.putExtra("key_group_solitatire_chatroom_username", Li.Q0());
        intent.putExtra("key_group_solitatire_scene", i17);
        j45.l.r(dVar.f460709d, "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, 3001, new com.tencent.mm.ui.chatting.u5(dVar));
    }

    public static void n(yb5.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, boolean z17, long j17, long j18, com.tencent.mm.storage.f9 f9Var, ot0.q qVar, java.lang.String str5) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemHelper", "url, lowUrl both are empty");
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isMobile(dVar.g()) ? str == null || str.length() <= 0 : str2 != null && str2.length() > 0) {
            str = str2;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("msg_id", j17);
        intent.putExtra("msg_talker", dVar.x());
        intent.putExtra("rawUrl", str);
        intent.putExtra("version_name", str3);
        intent.putExtra("version_code", i17);
        intent.putExtra("usePlugin", z17);
        intent.putExtra("geta8key_username", dVar.x());
        intent.putExtra("KPublisherId", "msg_" + java.lang.Long.toString(j18));
        intent.putExtra("KAppId", str4);
        intent.putExtra("pre_username", str5);
        intent.putExtra("msgUsername", str5);
        intent.putExtra("serverMsgID", java.lang.Long.toString(j18));
        intent.putExtra("geta8key_scene", 1);
        intent.putExtra("KMsgType", f9Var.getType());
        if (qVar != null) {
            intent.putExtra("KAppMsgType", qVar.f348666i);
        }
        intent.putExtra("prePublishId", "msg_" + java.lang.Long.toString(j18));
        intent.putExtra("preUsername", str5);
        intent.putExtra("preChatName", dVar.x());
        intent.putExtra("preChatTYPE", c01.h2.a(str5, dVar.x()));
        intent.putExtra("preMsgIndex", 0);
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void o(yb5.d dVar, android.view.View view, java.lang.Object obj) {
        view.setTag(obj);
        view.setOnClickListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).J1);
    }

    public static void p(yb5.d dVar, android.view.View view, com.tencent.mm.storage.f9 f9Var, ot0.q qVar, java.lang.String str, long j17) {
        s(dVar, view, f9Var, str, j17, qVar.f348646d, qVar.f348666i, qVar.X);
    }

    public static void q(yb5.d dVar, android.view.View view, java.lang.Object obj) {
        view.setTag(obj);
        view.setOnClickListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).F1);
    }

    public static void r(yb5.d dVar, android.view.View view, java.lang.String str) {
        if (!((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).wi(str)) {
            view.setTag(new com.tencent.mm.pluginsdk.ui.chat.ea());
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.ea eaVar = new com.tencent.mm.pluginsdk.ui.chat.ea();
        eaVar.f190300a = str;
        eaVar.f190301b = com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
        q(dVar, view, eaVar);
    }

    public static void s(yb5.d dVar, android.view.View view, com.tencent.mm.storage.f9 f9Var, java.lang.String str, long j17, java.lang.String str2, int i17, java.lang.String str3) {
        if (!((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).wi(str2)) {
            view.setTag(new com.tencent.mm.pluginsdk.ui.chat.ea());
            return;
        }
        int i18 = dVar.D() ? 2 : 1;
        com.tencent.mm.pluginsdk.ui.chat.da daVar = new com.tencent.mm.pluginsdk.ui.chat.da();
        daVar.f190272a = str2;
        daVar.f190273b = str;
        java.lang.String Q0 = f9Var.Q0();
        if (com.tencent.mm.storage.z3.R4(Q0)) {
            Q0 = c01.w9.s(f9Var.j());
        }
        daVar.f190274c = Q0;
        daVar.f190275d = i17;
        daVar.f190276e = i18;
        daVar.f190277f = str3;
        daVar.f190278g = j17;
        daVar.f190279h = dVar.x();
        q(dVar, view, daVar);
    }

    public static void t(yb5.d dVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmap);
        int dimension = (int) dVar.s().getDimension(com.tencent.mm.R.dimen.f479930ja);
        bitmapDrawable.setBounds(0, 0, dimension, dimension);
        imageView.setImageDrawable(bitmapDrawable);
        if (imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setImageBitmap(bitmap);
        }
    }

    public static void u(yb5.d dVar, android.widget.ImageView imageView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0("wx485a97c844086dc9", str)) {
            imageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_shake_gray);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0("wxaf060266bfa9a35c", str) && (imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView)) {
            imageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_tv);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setIconColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.FG_1));
            return;
        }
        if (imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setIconColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str, 2, i65.a.g(dVar.g()));
        if (Di != null && !Di.isRecycled()) {
            t(dVar, imageView, Di);
            return;
        }
        android.content.res.Resources s17 = dVar.s();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bku));
        arrayList.add(s17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "initWatermarkIcon", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Landroid/widget/ImageView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/ui/chatting/ChattingItemHelper", "initWatermarkIcon", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Landroid/widget/ImageView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        t(dVar, imageView, decodeResource);
    }

    public static void v(yb5.d dVar, android.widget.ImageView imageView, java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.D0("wx485a97c844086dc9", str)) {
            imageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_shake_gray);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0("wxaf060266bfa9a35c", str) && (imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView)) {
            imageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_tv);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setIconColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.FG_1));
        } else {
            if (imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setIconColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.a9e));
            }
            t(dVar, imageView, bitmap);
        }
    }

    public static void w(yb5.d dVar, android.widget.TextView textView, java.lang.String str) {
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str, 2, i65.a.g(dVar.g()));
        if (Di != null && !Di.isRecycled()) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(Di);
            int dimension = (int) dVar.s().getDimension(com.tencent.mm.R.dimen.f479930ja);
            bitmapDrawable.setBounds(0, 0, dimension, dimension);
            textView.setCompoundDrawables(bitmapDrawable, null, null, null);
            return;
        }
        android.content.res.Resources s17 = dVar.s();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bku));
        arrayList.add(s17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "initWatermarkIcon", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Landroid/widget/TextView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/ui/chatting/ChattingItemHelper", "initWatermarkIcon", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Landroid/widget/TextView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.drawable.BitmapDrawable bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(decodeResource);
        int dimension2 = (int) dVar.s().getDimension(com.tencent.mm.R.dimen.f479930ja);
        bitmapDrawable2.setBounds(0, 0, dimension2, dimension2);
        textView.setCompoundDrawables(bitmapDrawable2, null, null, null);
    }

    public static boolean x(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.equals("wx6618f1cfc6c132f8");
    }

    public static boolean y(java.lang.String str) {
        return ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).ij(str);
    }

    public static void z(yb5.d ui6, com.tencent.mm.storage.f9 msgInfo, java.lang.String str, int[] iArr, int i17, int i18, boolean z17, int i19, boolean z18, boolean z19, com.tencent.mm.ui.chatting.m5 m5Var) {
        com.tencent.mm.ui.chatting.m5 m5Var2 = m5Var == null ? new com.tencent.mm.ui.chatting.m5() : m5Var;
        m5Var2.b(new com.tencent.mm.ui.chatting.k5(iArr[0], iArr[1], i17, i18));
        m5Var2.b(new com.tencent.mm.ui.chatting.i5(z17));
        m5Var2.b(new com.tencent.mm.ui.chatting.j5(i19));
        m5Var2.b(new com.tencent.mm.ui.chatting.g5(z18));
        m5Var2.b(new com.tencent.mm.ui.chatting.h5(z19));
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        long msgId = msgInfo.getMsgId();
        long I0 = msgInfo.I0();
        java.lang.String Q0 = msgInfo.Q0();
        com.tencent.mm.ui.chatting.k5 k5Var = (com.tencent.mm.ui.chatting.k5) m5Var2.a(com.tencent.mm.ui.chatting.k5.class);
        com.tencent.mm.ui.chatting.i5 i5Var = (com.tencent.mm.ui.chatting.i5) m5Var2.a(com.tencent.mm.ui.chatting.i5.class);
        boolean z27 = i5Var != null ? i5Var.f201835a : false;
        com.tencent.mm.ui.chatting.j5 j5Var = (com.tencent.mm.ui.chatting.j5) m5Var2.a(com.tencent.mm.ui.chatting.j5.class);
        int i27 = j5Var != null ? j5Var.f201871a : 0;
        com.tencent.mm.ui.chatting.g5 g5Var = (com.tencent.mm.ui.chatting.g5) m5Var2.a(com.tencent.mm.ui.chatting.g5.class);
        boolean z28 = g5Var != null ? g5Var.f200523a : false;
        com.tencent.mm.ui.chatting.h5 h5Var = (com.tencent.mm.ui.chatting.h5) m5Var2.a(com.tencent.mm.ui.chatting.h5.class);
        boolean z29 = h5Var != null ? h5Var.f201661a : false;
        com.tencent.mm.ui.chatting.f5 f5Var = (com.tencent.mm.ui.chatting.f5) m5Var2.a(com.tencent.mm.ui.chatting.f5.class);
        boolean z37 = f5Var != null ? f5Var.f200486a : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingImageGalleryHelper", "showImageGallery: msgId=" + msgId + ", msgSvrId=" + I0 + ", talker=" + Q0 + ", thumbParams=" + k5Var + ", isSoonEnterPhotoEdit=" + z27 + ", scene=" + i27 + ", isOnlyPreview=" + z28 + ", isQuoteMsgWaitSend=" + z29 + ", isFromNewsJump=" + z37);
        android.content.Intent intent = new android.content.Intent(ui6.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
        intent.putExtra("img_gallery_msg_id", msgId);
        intent.putExtra("img_gallery_msg_svr_id", I0);
        com.tencent.mm.ui.chatting.manager.c cVar = ui6.f460708c;
        intent.putExtra("show_search_chat_content_result", ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f199295f);
        intent.putExtra("key_is_biz_chat", ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).f198753r);
        intent.putExtra("key_biz_chat_id", ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).w0());
        intent.putExtra("img_gallery_talker", Q0);
        intent.putExtra("img_gallery_chatroom_name", str);
        intent.putExtra("img_gallery_left", k5Var != null ? k5Var.f201892a : 0);
        intent.putExtra("img_gallery_top", k5Var != null ? k5Var.f201893b : 0);
        intent.putExtra("img_gallery_width", k5Var != null ? k5Var.f201894c : 0);
        intent.putExtra("img_gallery_height", k5Var != null ? k5Var.f201895d : 0);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        intent.putExtra("img_gallery_enter_PhotoEditUI", z27);
        intent.putExtra("msg_type", i27);
        if (z28) {
            intent.putExtra("img_preview_only", true);
        }
        if (z29) {
            intent.putExtra("key_quote_msg_wait_send", 1);
        }
        if (i27 == 0) {
            intent.putExtra("key_enter_scene", 1);
        } else if (i27 == 4) {
            intent.putExtra("key_enter_scene", 5);
        }
        intent.putExtra("key_is_from_news_jump", z37);
        intent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", com.tencent.mm.storage.z3.z3(Q0));
        java.lang.String x17 = ui6.x();
        if (msgInfo.A0() == 1) {
            Q0 = ui6.t();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (ui6.C()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + I0);
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", Q0);
        intent.putExtra("_stat_obj", bundle);
        intent.putExtra("img_gallery_session_id", k(I0, Q0, x17));
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.bm.a(intent, g17);
        com.tencent.mm.ui.report.KV17560Reporter c17 = com.tencent.mm.ui.report.KV17560Reporter.c(ui6.g());
        c17.f209616h = com.tencent.mm.sdk.platformtools.t8.r0(I0);
        c17.f209617i = com.tencent.mm.ui.report.h0.Image;
        int i28 = bundle.getInt("stat_scene", 0);
        if (i28 == 1) {
            c17.f209613e = com.tencent.mm.ui.report.j0.SingleChat;
            c17.b(com.tencent.mm.ui.report.i0.EnterSingleChat);
        } else if (i28 == 2) {
            c17.f209613e = com.tencent.mm.ui.report.j0.GroupChat;
            c17.b(com.tencent.mm.ui.report.i0.EnterGroupChat);
        }
        c17.a(intent);
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = ui6.f460717l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(baseChattingUIFragment, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingImageGalleryHelper", "showImageGallery", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/ChattingImageGalleryHelper$ExtrasBundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        baseChattingUIFragment.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(baseChattingUIFragment, "com/tencent/mm/ui/chatting/ChattingImageGalleryHelper", "showImageGallery", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/ChattingImageGalleryHelper$ExtrasBundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ui6.f460717l.overridePendingTransition(0, 0);
    }
}
