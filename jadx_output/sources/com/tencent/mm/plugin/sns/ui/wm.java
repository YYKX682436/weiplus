package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes9.dex */
public abstract class wm {
    public static final java.lang.String a(com.tencent.mm.protocal.protobuf.TimeLineObject tlObj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMusicId", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        kotlin.jvm.internal.o.g(tlObj, "tlObj");
        java.lang.String str = tlObj.Id + "_sns";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMusicId", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        return str;
    }

    public static final boolean b(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return false;
        }
        boolean c17 = c(a(timeLineObject), d(timeLineObject).d().getListenId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        return c17;
    }

    public static final boolean c(java.lang.String musicId, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        i95.m c17 = i95.n0.c(qk.k6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        boolean i27 = qk.k6.i2((qk.k6) c17, musicId, null, str, null, null, 26, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        return i27;
    }

    public static final bw5.lp0 d(com.tencent.mm.protocal.protobuf.TimeLineObject tlObj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        kotlin.jvm.internal.o.g(tlObj, "tlObj");
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(new bw5.v70());
        lp0Var.g(a(tlObj));
        r45.a90 a90Var = tlObj.ContentObj;
        r45.xs4 xs4Var = a90Var != null ? a90Var.f369852w : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xs4Var != null ? xs4Var.getString(19) : null)) {
            bw5.v70 c17 = rk4.l5.c(xs4Var != null ? xs4Var.getString(19) : null);
            if (c17 != null) {
                lp0Var.j(c17);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsMusicPlayHelper", "parseListenItemFromTimeLineObject failed");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return lp0Var;
        }
        r45.a90 a90Var2 = tlObj.ContentObj;
        if ((a90Var2 != null ? a90Var2.f369840h : null) == null || a90Var2.f369840h.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return lp0Var;
        }
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(1);
        r45.jj4 jj4Var = (r45.jj4) tlObj.ContentObj.f369840h.get(0);
        if (jj4Var == null) {
            lp0Var.j(v70Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return lp0Var;
        }
        bw5.z90 z90Var = new bw5.z90();
        java.lang.String str = jj4Var.f377864o;
        if (str == null) {
            str = "";
        }
        z90Var.E(str);
        java.lang.String str2 = jj4Var.f377857f;
        if (str2 == null) {
            str2 = "";
        }
        z90Var.C(str2);
        java.lang.String str3 = tlObj.ContentObj.f369839g;
        if (str3 == null) {
            str3 = "";
        }
        z90Var.B(str3);
        java.lang.String str4 = jj4Var.f377858g;
        if (str4 == null) {
            str4 = "";
        }
        z90Var.z(str4);
        java.lang.String str5 = tlObj.AppInfo.f390846d;
        if (str5 == null) {
            str5 = "";
        }
        z90Var.y(str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowCoverUrl", "com.tencent.mm.modelsns.SnsMusicShareObjectUtils");
        java.lang.String a17 = m21.s.a(tlObj, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowCoverUrl", "com.tencent.mm.modelsns.SnsMusicShareObjectUtils");
        z90Var.r(a17);
        if (xs4Var != null) {
            java.lang.String string = xs4Var.getString(15);
            if (string == null) {
                string = "";
            }
            z90Var.x(string);
            java.lang.String string2 = xs4Var.getString(4);
            if (!(string2 == null || r26.n0.N(string2))) {
                z90Var.C(xs4Var.getString(4));
            }
            java.lang.String string3 = xs4Var.getString(11);
            if (string3 == null) {
                string3 = "";
            }
            z90Var.A(string3);
            java.lang.String string4 = xs4Var.getString(9);
            if (string4 == null) {
                string4 = "";
            }
            z90Var.w(string4);
            java.lang.String string5 = xs4Var.getString(6);
            if (string5 == null) {
                string5 = "";
            }
            z90Var.t(string5);
            java.lang.String string6 = xs4Var.getString(5);
            if (string6 == null) {
                string6 = "";
            }
            z90Var.q(string6);
            z90Var.s(xs4Var.getInteger(10));
            java.lang.String string7 = xs4Var.getString(7);
            if (string7 == null) {
                string7 = "";
            }
            z90Var.u(string7);
            z90Var.f35895r = xs4Var.getLong(8);
            z90Var.f35903x1[12] = true;
        }
        v70Var.w(z90Var);
        java.lang.String l17 = v70Var.j().l();
        if (l17 == null) {
            l17 = "";
        }
        v70Var.p(l17);
        java.lang.String o17 = v70Var.j().o();
        if (o17 == null) {
            o17 = "";
        }
        v70Var.x(o17);
        java.lang.String c18 = v70Var.j().c();
        v70Var.q(c18 != null ? c18 : "");
        v70Var.r(v70Var.j().f35898u);
        v70Var.t(true);
        lp0Var.j(v70Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        return lp0Var;
    }

    public static final void e(com.tencent.mm.protocal.protobuf.TimeLineObject tlObj, android.content.Context context, int i17) {
        jm4.i4 Zi;
        jm4.i4 Zi2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playWithTing", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        kotlin.jvm.internal.o.g(tlObj, "tlObj");
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String a17 = a(tlObj);
        bw5.lp0 d17 = d(tlObj);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(d17.d());
        lp0Var.g("ting_" + d17.d().e() + '_' + d17.d().getListenId());
        i95.m c17 = i95.n0.c(qk.k6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (qk.k6.i2((qk.k6) c17, a17, null, d17.d().getListenId(), null, null, 26, null)) {
            i95.m c18 = i95.n0.c(qk.k6.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            if (qk.k6.w4((qk.k6) c18, d17.d().getListenId(), null, null, 6, null) != qk.p9.f364313e && (Zi2 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi()) != null) {
                ((jm4.k4) Zi2).e(lp0Var, bw5.ar0.TingScene_Moment, 0, com.tencent.mm.plugin.sns.ui.um.f170588d);
            }
            i95.m c19 = i95.n0.c(qk.k6.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            qk.k6.Xg((qk.k6) c19, null, d17.d().getListenId(), null, null, 13, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playWithTing", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return;
        }
        i95.m c27 = i95.n0.c(qk.k6.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        if (qk.k6.hi((qk.k6) c27, a17, null, d17.d().getListenId(), null, null, 26, null)) {
            i95.m c28 = i95.n0.c(qk.k6.class);
            kotlin.jvm.internal.o.f(c28, "getService(...)");
            qk.k6.Hb((qk.k6) c28, null, d17.d().getListenId(), null, null, 13, null);
        } else if (!iq.b.C(context) && !iq.b.v(context) && !iq.b.e(context)) {
            qk.k6 k6Var = (qk.k6) i95.n0.c(qk.k6.class);
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            boolean z17 = i17 == 0;
            java.lang.String str = tlObj.Id;
            if (str == null) {
                str = "";
            }
            il4.e eVar = new il4.e(null, 0, v31.j.CTRL_INDEX, false, null, null, 0, 0, false, z17, str, null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_MomentsListen, false, 25164283, null);
            java.util.Map map = eVar.f292122s.f292132d;
            java.lang.String str2 = eVar.f292114k;
            if (str2 != null) {
                map.put("sns", str2);
            }
            java.lang.String str3 = tlObj.UserName;
            if (str3 != null) {
                map.put("sourceuser", str3);
            }
            if (tlObj.ContentObj.f369837e != 47) {
                map.put("baseidissharedfrom3rd", 1);
            }
            ((rk4.a) k6Var).Ui(a17, d17, eVar);
        }
        i95.m c29 = i95.n0.c(qk.k6.class);
        kotlin.jvm.internal.o.f(c29, "getService(...)");
        if (qk.k6.w4((qk.k6) c29, d17.d().getListenId(), null, null, 6, null) != qk.p9.f364313e && (Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi()) != null) {
            ((jm4.k4) Zi).e(lp0Var, bw5.ar0.TingScene_Moment, 0, com.tencent.mm.plugin.sns.ui.vm.f170696d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playWithTing", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
    }
}
