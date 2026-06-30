package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class j1 {
    public static void a(java.lang.String str, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        rj.a aVar;
        int i17;
        w05.h hVar;
        try {
            java.lang.String str2 = null;
            if (qVar.f348666i != 33) {
                aVar = (rj.a) qVar.y(rj.a.class);
                if (aVar == null) {
                    return;
                }
            } else {
                aVar = null;
            }
            java.lang.Integer valueOf = dVar.D() ? java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(dVar.x())) : null;
            java.lang.String str3 = qVar.f348677k2;
            java.lang.String str4 = qVar.f348669i2;
            if (aVar == null || (hVar = aVar.f396132b) == null) {
                i17 = 3;
            } else {
                i17 = hVar.n();
                str2 = aVar.f396132b.k();
            }
            e00.g.e(str, f9Var, dVar.D(), dVar.x(), i17, 0, str3, str4, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0), str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemAppMsg", e17, "report error", new java.lang.Object[0]);
        }
    }

    public static void b(java.lang.Runnable runnable) {
        if (com.tencent.mm.sdk.platformtools.o3.c()) {
            com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a.d(runnable);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }

    public static void c(android.view.View view, int i17, int i18, int i19, int i27) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null || (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.setMargins(i17, i18, i19, i27);
        view.setLayoutParams(marginLayoutParams);
    }

    public static java.lang.String d(java.lang.String str) {
        if (str == null || !str.startsWith("wcf://")) {
            str = "file://" + str;
        }
        if (!com.tencent.mm.sdk.platformtools.y1.g(str)) {
            return str;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        return "file://" + m11.b1.Di().P0(str);
    }

    public static void e(com.tencent.mm.storage.f9 f9Var, ot0.q qVar, db5.g4 g4Var, int i17, android.view.View view, java.lang.Boolean bool) {
        java.lang.String str = qVar.f348674k;
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        if (bool.booleanValue() && ((qg5.z2) j3Var).nj(f9Var, true)) {
            ((db5.h4) g4Var.c(i17, 174, 0, view.getResources().getString(com.tencent.mm.R.string.nh7), com.tencent.mm.R.raw.doc_ai_filled)).f228369m = view.getResources().getString(com.tencent.mm.R.string.nh8);
            ((vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class))).aj();
        } else {
            if (bool.booleanValue() || !((qg5.z2) j3Var).oj(f9Var, true)) {
                return;
            }
            ((db5.h4) g4Var.c(i17, ib1.t.CTRL_INDEX, 0, view.getResources().getString(com.tencent.mm.R.string.nh7), com.tencent.mm.R.raw.article_ai_filled)).f228369m = view.getResources().getString(com.tencent.mm.R.string.nh8);
            ((vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class))).aj();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(ot0.q r28, android.view.View r29, yb5.d r30, com.tencent.mm.ui.chatting.viewitems.a0 r31, com.tencent.mm.storage.f9 r32) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.j1.f(ot0.q, android.view.View, yb5.d, com.tencent.mm.ui.chatting.viewitems.a0, com.tencent.mm.storage.f9):boolean");
    }

    public static boolean g(yb5.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.os.Bundle bundle) {
        android.content.Intent putExtra = new android.content.Intent().putExtra("key_video_url", str);
        putExtra.putExtra("key_video_url", str);
        putExtra.putExtra("key_cover_path", str3);
        putExtra.putExtra("key_auto_save", z17);
        putExtra.putExtra("key_local_file_path", str2);
        putExtra.putExtra("key_ext_data", bundle);
        putExtra.putExtra("key_scene", 1);
        j45.l.j(dVar.g(), "appbrand", ".ui.AppBrandVideoPreviewUI", putExtra, null);
        return true;
    }

    public static void h(ot0.q qVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.qq qqVar) {
        int i17 = qVar.f348681l2;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            java.lang.String x17 = dVar.x();
            java.lang.String a17 = qqVar.a(dVar, f9Var);
            com.tencent.mm.plugin.wallet_core.utils.v0 v0Var = com.tencent.mm.plugin.wallet_core.utils.v0.f180993a;
            java.lang.String str = qVar.f348673j2;
            com.tencent.mm.plugin.wallet_core.utils.p0 p0Var = com.tencent.mm.plugin.wallet_core.utils.q0.f180965e;
            v0Var.a(str, new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo(x17, a17, 0, "", "", "", 0L));
        }
    }

    public static void i(com.tencent.mm.storage.f9 f9Var) {
        boolean z17;
        com.tencent.mm.ui.tools.sd sdVar = com.tencent.mm.ui.tools.sd.f210742a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceStateHolder", "open appBrand");
        sdVar.b(false);
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.X1())) {
            return;
        }
        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(f9Var.Q0(), f9Var.X1());
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo stoTodo(%s) == null", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(f9Var.X1())));
            return;
        }
        boolean e17 = kn.j0.e(z07);
        if (e17) {
            z17 = kn.j0.j(z07);
            if (z17) {
                com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent();
                am.ql qlVar = notifyGroupTodoEvent.f54545g;
                qlVar.f7715a = 3;
                qlVar.f7716b = f9Var.Q0();
                qlVar.f7717c = f9Var.X1();
                notifyGroupTodoEvent.b(android.os.Looper.getMainLooper());
            }
        } else {
            z17 = false;
        }
        kn.k0.a(f9Var.Q0(), 0, 3, f9Var.X1(), kn.j0.c(f9Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo stoTodo(%s) update finish(%s %s)", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(f9Var.X1())), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(e17));
    }

    public static void j(ot0.q qVar, yb5.d dVar, android.content.Intent intent) {
        rt0.a aVar = (rt0.a) qVar.y(rt0.a.class);
        if (aVar == null || !aVar.f399371b) {
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("jsapiargs");
        if (bundleExtra == null) {
            bundleExtra = new android.os.Bundle();
        }
        bundleExtra.putBoolean("k_is_secret_msg", true);
        r45.l97 l97Var = new r45.l97();
        l97Var.f379259d = (int) (java.lang.System.currentTimeMillis() / 1000);
        l97Var.f379262g = dVar.D() ? 2 : 1;
        l97Var.f379263h = dVar.x();
        l97Var.f379260e = qVar.f348674k;
        l97Var.f379261f = qVar.f348646d;
        try {
            bundleExtra.putByteArray("key_webview_secret_msg_info", l97Var.toByteArray());
            intent.putExtra("jsapiargs", bundleExtra);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemAppMsg", e17, "fillWebPageSecretMsgInfo exception", new java.lang.Object[0]);
        }
    }

    public static com.tencent.mm.sdk.platformtools.n3 k() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        }
        return null;
    }

    public static void l(ot0.q qVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
        openNoteFromSessionEvent.f54599g.f7906c = dVar.g();
        openNoteFromSessionEvent.f54599g.f7904a = f9Var.getMsgId();
        openNoteFromSessionEvent.f54599g.f7909f = f9Var.Q0();
        openNoteFromSessionEvent.f54599g.f7907d = dVar.D();
        am.sn snVar = openNoteFromSessionEvent.f54599g;
        snVar.f7905b = qVar.f348663h0;
        snVar.f7910g = 6;
        snVar.f7912i = c01.ia.q(f9Var);
        openNoteFromSessionEvent.e();
    }

    public static void m(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, int i17, r.a aVar) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.o4.M("group_to_do").getBoolean("introduce_dialog_first", true)) {
            n(f9Var, dVar, i17, 0, aVar);
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("group_to_do");
        M.getClass();
        M.putBoolean("introduce_dialog_first", false);
        android.app.Activity g17 = dVar.g();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(f9Var.X1());
        java.lang.String x17 = dVar.x();
        java.lang.String X1 = f9Var.X1();
        java.lang.String c17 = kn.j0.c(f9Var);
        com.tencent.mm.ui.chatting.viewitems.k1 k1Var = new com.tencent.mm.ui.chatting.viewitems.k1(f9Var, dVar, i17, aVar);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) g17, 1, false);
        android.view.View inflate = android.view.View.inflate(g17, com.tencent.mm.R.layout.d1g, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.oe_);
        if (com.tencent.mm.sdk.platformtools.m2.j()) {
            imageView.setImageResource(com.tencent.mm.R.drawable.cgl);
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.cgm);
        }
        com.tencent.mm.ui.chatting.viewitems.c3 c3Var = new com.tencent.mm.ui.chatting.viewitems.c3(null);
        inflate.findViewById(com.tencent.mm.R.id.oed).setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.m1(c3Var, k0Var, k1Var));
        k0Var.f211872n = new com.tencent.mm.ui.chatting.viewitems.n1(k0Var, inflate);
        k0Var.f211854d = new com.tencent.mm.ui.chatting.viewitems.o1(c3Var, x17, 0, K0, X1, c17);
        k0Var.e(true);
        k0Var.v();
    }

    public static void n(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, int i17, int i18, r.a aVar) {
        java.lang.String X1;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(f9Var.X1());
        android.app.Activity g17 = dVar.g();
        java.lang.String Q0 = f9Var.Q0();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var.X1())) {
            X1 = f9Var.X1();
        } else if (f9Var.y2()) {
            X1 = "related_msgid_" + f9Var.I0();
        } else {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
                X1 = "";
            } else {
                ot0.a aVar2 = (ot0.a) v17.y(ot0.a.class);
                if (aVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f348364t)) {
                    X1 = "related_msgid_" + f9Var.I0();
                } else {
                    X1 = aVar2.f348364t;
                }
            }
        }
        kn.j0.h(g17, Q0, X1, kn.j0.c(f9Var), K0, 2, i17, i18, new com.tencent.mm.ui.chatting.viewitems.l1(aVar, K0, f9Var));
    }

    public static boolean o(ot0.q qVar) {
        su4.l2 l2Var = (su4.l2) qVar.y(su4.l2.class);
        return (l2Var == null || com.tencent.mm.sdk.platformtools.t8.K0(l2Var.f412983b)) ? false : true;
    }

    public static void p(android.widget.TextView textView, ot0.q qVar) {
        int i17 = qVar.f348737z2;
        if (i17 == 1) {
            textView.setText(com.tencent.mm.R.string.f490289qt);
        } else if (i17 != 2) {
            textView.setText(com.tencent.mm.R.string.f490115lc);
        } else {
            textView.setText(com.tencent.mm.R.string.f490288qs);
        }
        textView.setVisibility(0);
    }

    public static void q(android.content.Intent intent, com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        intent.putExtra("webpageTitle", qVar.f348654f);
        intent.putExtra("thumbUrl", qVar.f348734z);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        intent.putExtra("thumbPath", m11.b1.Di().D2(f9Var, f9Var.z0(), true));
    }

    public static void r(android.view.View view, int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_group_todo_disable, 0) == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static boolean s(ot0.q qVar, com.tencent.mm.ui.chatting.viewitems.v1 v1Var) {
        if (!o(qVar)) {
            return false;
        }
        v1Var.f205749i.setVisibility(0);
        v1Var.f205741e.setVisibility(0);
        v1Var.f205741e.setText(com.tencent.mm.R.string.jzt);
        v1Var.f205743f.setVisibility(0);
        v1Var.f205743f.setImageResource(com.tencent.mm.R.drawable.cgn);
        return true;
    }

    public static void t(boolean z17, com.tencent.mm.ui.chatting.viewitems.v1 v1Var, yb5.d dVar) {
        if (v1Var == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = v1Var.f205760n0;
        if (linearLayout != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            v1Var.f205760n0.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).n0());
            marginLayoutParams.leftMargin = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).o0(i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479556yd));
            v1Var.f205760n0.setLayoutParams(marginLayoutParams);
        }
        if (z17) {
            v1Var.f205762o0.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.Link_100));
            v1Var.f205762o0.setText(com.tencent.mm.R.string.ft_);
        } else {
            v1Var.f205762o0.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.adg));
            v1Var.f205762o0.setText(com.tencent.mm.R.string.ftb);
        }
    }
}
