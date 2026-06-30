package kd2;

/* loaded from: classes10.dex */
public final class l0 extends gp1.a0 {
    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kd2.p0 p0Var;
        kd2.o0 o0Var = kd2.p1.N;
        kd2.q0 q0Var = o0Var.a().I;
        long j17 = (q0Var == null || (p0Var = q0Var.f306809j) == null) ? 0L : p0Var.f306783a;
        com.tencent.mars.xlog.Log.i("FinderVideoPassive", "onFloatBallInfoRemoved: ballInfo=" + ballInfo + " stayTimeMs:" + (j17 != 0 ? android.os.SystemClock.elapsedRealtime() - j17 : 0L));
        boolean z17 = true;
        if (ballInfo != null && ballInfo.f93046d == 32) {
            o0Var.a().E0().c();
            o0Var.a().t0();
            o0Var.a().I = null;
            or2.a aVar = or2.a.f347607a;
            if (or2.a.f347614h) {
                or2.a.f347614h = false;
                int i17 = or2.a.f347612f - 1;
                or2.a.f347612f = i17;
                if (i17 <= 0) {
                    or2.a.f347612f = 0;
                    aVar.b(false, false);
                } else {
                    z17 = false;
                }
                if (!z17) {
                    aVar.e();
                }
            }
            o0Var.a().A0();
        }
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kd2.o0 o0Var = kd2.p1.N;
        kd2.b0 E0 = o0Var.a().E0();
        E0.b();
        E0.d();
        kd2.q0 q0Var = o0Var.a().f306787x;
        if (q0Var != null && q0Var.f306806g != null) {
            o0Var.a().Q0(1);
        }
        o0Var.a().f93132d.M.f93090m = 14;
        o0Var.a().f93132d.f93059t = true;
        o0Var.a().t0();
        com.tencent.mm.plugin.finder.viewmodel.component.nb0.F0((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class), false, null, 2, null);
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17;
        java.lang.String str;
        int i18;
        r45.qt2 qt2Var;
        r45.qt2 qt2Var2;
        r45.qt2 qt2Var3;
        kd2.q0 q0Var;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        java.lang.String str2;
        nk4.a f130672x0;
        kd2.o0 o0Var = kd2.p1.N;
        boolean T0 = kd2.p1.T0(o0Var.a(), false, false, false, 7, null);
        int i19 = 0;
        if (T0 && (q0Var = o0Var.a().f306787x) != null && (feedData = q0Var.f306806g) != null) {
            java.lang.String str3 = kd2.v1.f306853a;
            kd2.p1 helper = o0Var.a();
            cw2.da daVar = o0Var.a().f306788y;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar : null;
            kd2.q0 q0Var2 = o0Var.a().f306787x;
            r45.qt2 qt2Var4 = q0Var2 != null ? q0Var2.f306803d : null;
            kotlin.jvm.internal.o.g(helper, "helper");
            if (helper.G) {
                long currentPlayMs = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getCurrentPlayMs() : 0L;
                long videoDurationMs = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getVideoDurationMs() : 0L;
                int i27 = (int) ((videoDurationMs <= 0 ? 0.0f : ((float) currentPlayMs) / ((float) videoDurationMs)) * 100);
                if (finderThumbPlayerProxy != null && (f130672x0 = finderThumbPlayerProxy.getF130672x0()) != null) {
                    f130672x0.g();
                }
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[6];
                lVarArr[0] = new jz5.l("feed_id", pm0.v.u(feedData.getId()));
                lVarArr[1] = new jz5.l("curr_progress", java.lang.Integer.valueOf(i27));
                java.lang.String sessionBuffer = feedData.getSessionBuffer();
                if (sessionBuffer == null) {
                    sessionBuffer = "";
                }
                lVarArr[2] = new jz5.l("session_buffer", sessionBuffer);
                if (qt2Var4 == null || (str2 = qt2Var4.getString(1)) == null) {
                    str2 = "";
                }
                lVarArr[3] = new jz5.l("source_contextid", str2);
                lVarArr[4] = new jz5.l("source_commentscene", qt2Var4 != null ? java.lang.Integer.valueOf(qt2Var4.getInteger(5)) : "");
                lVarArr[5] = new jz5.l("float_frame_sessionid", kd2.v1.f306853a);
                ((cy1.a) rVar).yj("float_frame_feed_pause", null, kz5.c1.k(lVarArr), 1, true);
            }
        }
        kd2.b0 E0 = o0Var.a().E0();
        E0.getClass();
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        r45.qt2 qt2Var5 = new r45.qt2();
        kd2.p1 p1Var = E0.f306709a;
        kd2.q0 q0Var3 = p1Var.f306787x;
        qt2Var5.set(1, (q0Var3 == null || (qt2Var3 = q0Var3.f306803d) == null) ? null : qt2Var3.getString(1));
        kd2.q0 q0Var4 = p1Var.f306787x;
        if (q0Var4 == null || (qt2Var2 = q0Var4.f306803d) == null) {
            i17 = 2;
            str = null;
        } else {
            i17 = 2;
            str = qt2Var2.getString(2);
        }
        qt2Var5.set(i17, str);
        kd2.q0 q0Var5 = p1Var.f306787x;
        if (q0Var5 == null || (qt2Var = q0Var5.f306803d) == null) {
            i18 = 5;
        } else {
            i18 = 5;
            i19 = qt2Var.getInteger(5);
        }
        qt2Var5.set(i18, java.lang.Integer.valueOf(i19));
        java.lang.String str4 = T0 ? "button_pause_play_by_float_frame" : "button_goon_play_by_float_frame";
        cl0.g gVar = new cl0.g();
        java.lang.String str5 = p1Var.D;
        E0.a(gVar, str5 != null ? str5 : "", p1Var.E);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, qt2Var5, str4, 1, gVar, false, null, 48, null);
    }

    @Override // gp1.a0, gp1.z
    public boolean Y0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127618b8).getValue()).r()).intValue() != 1) {
            com.tencent.mars.xlog.Log.i("FinderVideoPassive", "addMiniView: FINDER_PASSIVE_VIDEO_SWITCH is close");
            return true;
        }
        boolean Di = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di();
        if (!Di) {
            kd2.p1.N.a().S0();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, kotlinx.coroutines.a1.UNDISPATCHED, new kd2.k0(Di, null), 1, null);
        return true;
    }

    @Override // gp1.a0, gp1.z
    public void a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        java.lang.String str;
        r45.qt2 qt2Var;
        java.lang.String string;
        r45.qt2 qt2Var2;
        r45.qt2 qt2Var3;
        kd2.p0 p0Var3;
        kd2.p0 p0Var4;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo2;
        kd2.o0 o0Var = kd2.p1.N;
        o0Var.a().k0().setVideoMode((ballInfo == null || (ballButtonInfo2 = ballInfo.f93054o) == null || !ballButtonInfo2.f93077o) ? false : true);
        kd2.b0 E0 = o0Var.a().E0();
        cw2.da daVar = o0Var.a().f306788y;
        boolean z17 = daVar != null && daVar.isPlaying();
        boolean z18 = (ballInfo == null || (ballButtonInfo = ballInfo.f93054o) == null || !ballButtonInfo.f93077o) ? false : true;
        kd2.p1 p1Var = E0.f306709a;
        kd2.q0 q0Var = p1Var.f306787x;
        long feedId = (q0Var == null || (feedData = q0Var.f306806g) == null) ? 0L : feedData.getFeedId();
        kd2.q0 q0Var2 = p1Var.f306787x;
        long a17 = (q0Var2 == null || (p0Var4 = q0Var2.f306810k) == null) ? (q0Var2 == null || (p0Var = q0Var2.f306809j) == null) ? 0L : p0Var.a() : p0Var4.a();
        kd2.q0 q0Var3 = p1Var.f306787x;
        long b17 = (q0Var3 == null || (p0Var3 = q0Var3.f306810k) == null) ? (q0Var3 == null || (p0Var2 = q0Var3.f306809j) == null) ? 0L : p0Var2.b() : p0Var3.b();
        kd2.q0 q0Var4 = p1Var.f306787x;
        if (q0Var4 != null) {
            q0Var4.f306810k = new kd2.p0(android.os.SystemClock.elapsedRealtime(), z17 ? 0L : android.os.SystemClock.elapsedRealtime(), 0L);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[10];
        lVarArr[0] = new jz5.l("view_id", z18 ? "floatframe_look_button" : "floatframe_ting_button");
        java.lang.String str2 = p1Var.D;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("float_frame_id", str2);
        lVarArr[2] = new jz5.l("float_frame_create_type", java.lang.String.valueOf(p1Var.E));
        lVarArr[3] = new jz5.l("real_play_time", java.lang.Long.valueOf(a17));
        lVarArr[4] = new jz5.l("stay_time_ms", java.lang.Long.valueOf(b17));
        lVarArr[5] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, "1");
        kd2.q0 q0Var5 = p1Var.f306787x;
        if (q0Var5 == null || (qt2Var3 = q0Var5.f306803d) == null || (str = qt2Var3.getString(1)) == null) {
            str = "";
        }
        lVarArr[6] = new jz5.l("source_contextid", str);
        kd2.q0 q0Var6 = p1Var.f306787x;
        lVarArr[7] = new jz5.l("source_commentscene", (q0Var6 == null || (qt2Var2 = q0Var6.f306803d) == null) ? "" : java.lang.Integer.valueOf(qt2Var2.getInteger(5)));
        kd2.q0 q0Var7 = p1Var.f306787x;
        if (q0Var7 != null && (qt2Var = q0Var7.f306803d) != null && (string = qt2Var.getString(2)) != null) {
            str3 = string;
        }
        lVarArr[8] = new jz5.l("source_tabcontextid", str3);
        lVarArr[9] = new jz5.l("feed_id", pm0.v.u(feedId));
        ((cy1.a) rVar).Cj("view_clk", null, kz5.c1.k(lVarArr), 25496);
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }
}
