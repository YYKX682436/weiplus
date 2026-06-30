package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class mp {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f204599a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f204600b;

    static {
        android.view.ViewConfiguration.getDoubleTapTimeout();
        f204599a = com.tencent.mm.sdk.platformtools.o4.R("voice_continue_play_info");
        f204600b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceBackPlay()) == 1;
    }

    public static boolean a(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        boolean z17;
        if (f9Var.a2()) {
            return true;
        }
        sb5.k2 k2Var = (sb5.k2) dVar.f460708c.a(sb5.k2.class);
        long msgId = f9Var.getMsgId();
        synchronized (((com.tencent.mm.ui.chatting.component.xm) k2Var)) {
            java.lang.Boolean bool = (java.lang.Boolean) com.tencent.mm.ui.chatting.component.xm.f200250u.get(java.lang.Long.valueOf(msgId));
            if (bool != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "isShowTransformFlag[%s]:%s", java.lang.Long.valueOf(msgId), bool);
                z17 = bool.booleanValue();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "isShowTransformFlag[%s]: null", java.lang.Long.valueOf(msgId));
                z17 = false;
            }
        }
        return z17;
    }

    public static void b(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = new com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent();
        am.b9 b9Var = extVoiceTransformTextClickEvent.f54219g;
        b9Var.f6225b = 3;
        b9Var.f6226c = 1;
        b9Var.f6224a = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        extVoiceTransformTextClickEvent.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.view.View r24, com.tencent.mm.ui.chatting.viewitems.lp r25, yb5.d r26, com.tencent.mm.storage.f9 r27) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mp.c(android.view.View, com.tencent.mm.ui.chatting.viewitems.lp, yb5.d, com.tencent.mm.storage.f9):void");
    }

    public static boolean d(int i17, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, sb5.k2 k2Var, boolean z17) {
        if (!k(dVar, f9Var, com.tencent.mm.R.string.f490833az5) && !j(dVar, f9Var, com.tencent.mm.R.string.f490831az3)) {
            com.tencent.mm.ui.chatting.component.xm.f200246q = f9Var.getMsgId();
            s75.d.b(new com.tencent.mm.ui.chatting.viewitems.po(dVar, f9Var), "voice_transform_text_report");
            k2Var.getClass();
            if (z17) {
                w21.x0.q(f9Var);
            }
            ((com.tencent.mm.ui.chatting.component.xm) k2Var).p0(f9Var, true, i17, 0);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.tencent.mm.modelstat.e.f71505a.getClass();
        }
        return true;
    }

    public static void e(int i17, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "reportTransformTextLongClick type: %d, msgId: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(f9Var.getMsgId()));
        com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = new com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent();
        am.b9 b9Var = extVoiceTransformTextClickEvent.f54219g;
        b9Var.f6225b = 2;
        b9Var.f6226c = i17;
        b9Var.f6224a = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        extVoiceTransformTextClickEvent.e();
    }

    public static void f(int i17, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || !g(dVar, f9Var, null)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemVoice", "voiceBackPlay: can back play");
            return;
        }
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            o(i17, dVar, f9Var);
            return;
        }
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        android.app.Activity g17 = dVar.g();
        java.lang.String string = dVar.g().getString(com.tencent.mm.R.string.n6i);
        com.tencent.mm.ui.chatting.viewitems.so soVar = new com.tencent.mm.ui.chatting.viewitems.so(i17, dVar, f9Var);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.S6(g17, string, new j35.f0(soVar), true, a17);
    }

    public static boolean g(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        android.app.Activity g17 = dVar.g();
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
        if (w00Var.f8247c) {
            java.lang.String G = iq.b.G(g17, w00Var.f8245a);
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(g17);
            e4Var.f211776c = G;
            e4Var.c();
        }
        if (!w00Var.f8247c && !iq.b.q(dVar.g(), true)) {
            iq.b.u(dVar.g(), true);
            if (!iq.b.m(dVar.g(), true, null) && !iq.b.n(dVar.g(), true) && !iq.b.v(dVar.g()) && !iq.b.e(dVar.g())) {
                if (!c01.d9.b().E()) {
                    db5.t7.k(dVar.g(), dVar.f460717l.getContentView());
                    return false;
                }
                w21.u0 u0Var = new w21.u0(f9Var.j());
                if (!x51.t1.b(f9Var.j()) && u0Var.f442480b != 0) {
                    return true;
                }
                dp.a.makeText(dVar.g(), com.tencent.mm.R.string.b5a, 0).show();
                if (msgQuoteItem != null) {
                    ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(ty.p0.f422740i, msgQuoteItem, 0, dVar.x());
                }
            }
        }
        return false;
    }

    public static void h(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.er erVar, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        if (dVar != null) {
            dVar.y();
        }
        if (erVar == null || erVar.c() == null || !g(dVar, erVar.c(), msgQuoteItem)) {
            return;
        }
        w21.u0 u0Var = new w21.u0(erVar.c().j());
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        com.tencent.mm.ui.chatting.v0 p07 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class))).p0();
        long i17 = i(erVar.c().getMsgId(), u0Var.f442480b, true, dVar.x());
        if (i17 > 0) {
            com.tencent.mm.ui.report.l0.a(dVar.F(), !dVar.D(), 3L, erVar.c().getMsgId() + "", u0Var.f442480b, 0L, i17);
        }
        if (cVar.a(sb5.z.class) != null) {
            p(dVar, erVar.c());
            if (!p07.n()) {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
            }
            p07.i(erVar.d(), erVar.c());
        }
    }

    public static long i(long j17, long j18, boolean z17, java.lang.String str) {
        long parseLong;
        long currentTimeMillis;
        int g17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = f204599a;
        java.lang.String string = o4Var.getString(j17 + "", "0,0");
        if (o4Var.getLong("current_interrupt_msg_id-" + str, 0L) != j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] %d current voice isn't the latest interrupt one %s", java.lang.Long.valueOf(j17), str);
            return 0L;
        }
        if (string == null) {
            return -1L;
        }
        java.lang.String[] split = string.split(",");
        if (split.length != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] interrupt info format error");
            return -1L;
        }
        try {
            parseLong = java.lang.Long.parseLong(split[1]);
            currentTimeMillis = java.lang.System.currentTimeMillis() - parseLong;
            g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Chat_VoiceContinuePlayTimeout_Int, -1);
        } catch (java.lang.NumberFormatException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemVoice", "[voice interrupt] parse data error str: ".concat(string));
        }
        if (currentTimeMillis <= ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_chatting_voice_continue_play_timeout, 86400L) * 1000 && (g17 <= -1 || currentTimeMillis <= g17 * 60 * 1000)) {
            long parseLong2 = java.lang.Long.parseLong(split[0]);
            if (2500 >= parseLong2 || 2500 + parseLong2 >= j18) {
                o4Var.remove(j17 + "");
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] pts out of limit");
                return -1L;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] get interrupt time " + parseLong2);
            if (z17) {
                o4Var.remove(j17 + "");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[voice interrupt] return pts and remove info ");
                sb6.append(parseLong2);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", sb6.toString());
            }
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_chatting_voice_continue_play, -1) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] disable flag");
            if (z18) {
                return -1L;
            }
            return parseLong2;
        }
        o4Var.remove(j17 + "");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[voice interrupt] interrupt info expired, record timestamp: ");
        sb7.append(parseLong);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", sb7.toString());
        return -1L;
    }

    public static boolean j(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var == null || !f9Var.g3() || f9Var.A0() == 1 || f9Var.P0() != 5) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "handleDownloadFailVoiceMsg show alert!");
        db5.e1.y(dVar.g(), dVar.g().getString(i17), "", dVar.g().getString(com.tencent.mm.R.string.l_e), new com.tencent.mm.ui.chatting.viewitems.ro());
        return true;
    }

    public static boolean k(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        boolean z17 = false;
        if (f9Var == null || n(f9Var)) {
            return false;
        }
        if (((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).q0(f9Var.getMsgId())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onCreateContextMenu: voice msg is downloading.(1)");
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "handleNoFinishDownloadVoiceMsg show alert!");
            db5.e1.y(dVar.g(), dVar.g().getString(i17), "", dVar.g().getString(com.tencent.mm.R.string.l_e), new com.tencent.mm.ui.chatting.viewitems.qo());
        }
        return z17;
    }

    public static void l(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.lp lpVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.q0 q0Var, wl5.v vVar) {
        android.app.Activity g17 = dVar.g();
        wl5.x xVar = lpVar.f204513k;
        if (xVar != null) {
            xVar.c();
        }
        lpVar.f204510h.getContentView().setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.TRUE);
        rl5.r rVar = new rl5.r(g17, lpVar.f204510h.getContentView());
        lpVar.f204512j = rVar;
        rVar.L = new com.tencent.mm.ui.chatting.viewitems.to(dVar, lpVar);
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        rl5.r rVar2 = lpVar.f204512j;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f397355y = new com.tencent.mm.ui.chatting.viewitems.uo(lpVar, dVar, f9Var, g17, isTeenMode);
        rVar2.f397354x = new com.tencent.mm.ui.chatting.viewitems.vo(lpVar, f9Var, dVar, g17);
        wl5.o oVar = new wl5.o(lpVar.f204510h.getContentView(), lpVar.f204512j, vVar, null, new com.tencent.mm.pluginsdk.ui.span.y(lpVar.f204510h.getContentView(), new com.tencent.mm.pluginsdk.ui.span.y0(g17)));
        oVar.f447123g = com.tencent.mm.R.color.a3y;
        oVar.f447124h = 18;
        oVar.f447122f = com.tencent.mm.R.color.f478860j6;
        wl5.x xVar2 = new wl5.x(oVar);
        lpVar.f204513k = xVar2;
        xVar2.f447159d = new com.tencent.mm.ui.chatting.viewitems.wo(lpVar);
        q0Var.f205293h = new com.tencent.mm.ui.chatting.viewitems.jo(lpVar);
        xVar2.Y = new com.tencent.mm.ui.chatting.viewitems.jp(xVar2);
    }

    public static void m(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.lp lpVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.q0 q0Var, wl5.v vVar) {
        android.app.Activity g17 = dVar.g();
        wl5.x xVar = lpVar.f204515m;
        if (xVar != null) {
            xVar.c();
        }
        lpVar.f204511i.getContentView().setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.TRUE);
        rl5.r rVar = new rl5.r(g17, lpVar.f204511i.getContentView());
        lpVar.f204514l = rVar;
        rVar.L = new com.tencent.mm.ui.chatting.viewitems.ko(dVar, lpVar);
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        rl5.r rVar2 = lpVar.f204514l;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f397355y = new com.tencent.mm.ui.chatting.viewitems.lo(lpVar, dVar, f9Var, g17, isTeenMode);
        rVar2.f397354x = new com.tencent.mm.ui.chatting.viewitems.mo(lpVar, f9Var, dVar, g17);
        wl5.o oVar = new wl5.o(lpVar.f204511i.getContentView(), lpVar.f204514l, vVar, qn4.y.g() ? new com.tencent.mm.ui.chatting.viewitems.t0() : null, new com.tencent.mm.pluginsdk.ui.span.y(lpVar.f204511i.getContentView(), new com.tencent.mm.pluginsdk.ui.span.y0(g17)));
        oVar.f447123g = com.tencent.mm.R.color.a3y;
        oVar.f447124h = 18;
        oVar.f447122f = com.tencent.mm.R.color.f478860j6;
        wl5.x xVar2 = new wl5.x(oVar);
        lpVar.f204515m = xVar2;
        xVar2.f447159d = new com.tencent.mm.ui.chatting.viewitems.no(lpVar);
        q0Var.f205294i = new com.tencent.mm.ui.chatting.viewitems.oo(lpVar);
        xVar2.Y = new com.tencent.mm.ui.chatting.viewitems.jp(xVar2);
    }

    public static boolean n(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.storage.f9 f27;
        w21.w0 w0Var;
        if (f9Var == null || (f27 = pt0.f0.f2(f9Var.Q0(), f9Var.getMsgId())) == null) {
            return false;
        }
        if ((f27.F & 8192) > 0) {
            w21.g1 Di = w21.p0.Di();
            java.lang.String Q0 = f27.Q0();
            long I0 = f27.I0();
            Di.getClass();
            boolean a17 = pt0.p.f358218a1.a("voiceinfo");
            l75.k0 k0Var = Di.f442373d;
            if (a17) {
                android.database.Cursor f17 = k0Var.f(("SELECT Status FROM voiceinfo WHERE MsgId=" + I0) + " AND MsgTalker=" + Q0, null, 2);
                if (f17.moveToFirst()) {
                    w0Var = new w21.w0();
                    w0Var.f442492i = f17.getInt(0);
                } else {
                    w0Var = null;
                }
                f17.close();
            } else {
                android.database.Cursor f18 = k0Var.f("SELECT Status FROM voiceinfo WHERE MsgId=" + I0, null, 2);
                if (f18.moveToFirst()) {
                    w0Var = new w21.w0();
                    w0Var.f442492i = f18.getInt(0);
                } else {
                    w0Var = null;
                }
                f18.close();
            }
            if (w0Var == null) {
                w0Var = w21.p0.Di().D0(f27.getMsgId());
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "getInfoStatusByMsgId() voiceInfo = null, getInfoByMsgId() voiceInfo = " + w0Var);
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf((f27.F & 8192) > 0);
            objArr[1] = w0Var != null ? java.lang.Integer.valueOf(w0Var.f442492i) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "unfinished download! temp:%s, voiceInfo: %d", objArr);
            if (w0Var == null || w0Var.f442492i < 97) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "isVoicesFinishDownload: false");
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "isVoicesFinishDownload(): true");
        return true;
    }

    public static void o(int i17, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.v0 p07 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).p0();
        if (f9Var != null && g(dVar, f9Var, null)) {
            w21.u0 u0Var = new w21.u0(f9Var.j());
            if (!p07.n() || p07.f202766i != f9Var.getMsgId()) {
                long i18 = i(f9Var.getMsgId(), u0Var.f442480b, true, dVar.x());
                if (i18 > 0) {
                    com.tencent.mm.ui.report.l0.a(dVar.F(), !dVar.D(), 3L, f9Var.getMsgId() + "", u0Var.f442480b, 0L, i18);
                }
                if (dVar.f460708c.a(sb5.z.class) != null) {
                    p(dVar, f9Var);
                }
            }
        }
        p07.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "startBackPlay() called");
        if (p07.f202763f == null || p07.f202766i != f9Var.getMsgId()) {
            p07.i(i17, f9Var);
        }
        if (p07.f202763f != null) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = new com.tencent.mm.plugin.ball.model.BallInfo(41, "voice_back_play_" + p07.f202766i, null);
            ballInfo.f93045J = false;
            ballInfo.I = true;
            p07.C(ballInfo);
            p07.v(f9Var);
            p07.E(p07.f202766i);
            p07.o();
        }
    }

    public static void p(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        int i17;
        if (((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).s0(f9Var.getMsgId())) {
            return;
        }
        sb5.k2 k2Var = (sb5.k2) dVar.f460708c.a(sb5.k2.class);
        if (f9Var.a2()) {
            i17 = 7;
        } else {
            i17 = ((com.tencent.mm.ui.chatting.component.xm) k2Var).q0(f9Var.getMsgId()) ? 6 : 0;
        }
        if (i17 != 0) {
            com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = new com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent();
            am.b9 b9Var = extVoiceTransformTextClickEvent.f54219g;
            b9Var.f6225b = 1;
            b9Var.f6226c = i17;
            b9Var.f6224a = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
            extVoiceTransformTextClickEvent.e();
        }
    }
}
