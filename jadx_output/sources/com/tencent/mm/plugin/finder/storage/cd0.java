package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes11.dex */
public final class cd0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cd0 f126580a = new com.tencent.mm.plugin.finder.storage.cd0();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(java.lang.String musicId, boolean z17) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        if ((musicId.length() == 0) == true) {
            rk4.z8 z8Var = (rk4.z8) e();
            rk4.z8 z8Var2 = z8Var.nj() ? z8Var : null;
            if (z8Var2 != null) {
                z8Var2.pj();
            }
            if (b21.m.c()) {
                com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
                mvCardActionReportStruct.f59456j = 2L;
                mvCardActionReportStruct.f59457k = 8L;
                zy2.oc.b(mvCardActionReportStruct);
                b21.m.f();
            }
            return false;
        }
        if (z17) {
            if (!f(musicId, true)) {
                return false;
            }
            ((rk4.z8) e()).pj();
            com.tencent.mars.xlog.Log.i("FinderMvLogic", "stopMusic");
            return true;
        }
        b21.r b17 = b21.m.b();
        if ((b17 != null ? b17.f17346e : null) == null || !com.tencent.mm.sdk.platformtools.t8.D0(b17.f17346e, musicId) || !b21.m.c()) {
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
        mvCardActionReportStruct2.f59456j = 2L;
        mvCardActionReportStruct2.f59457k = 8L;
        zy2.oc.b(mvCardActionReportStruct2);
        b21.m.f();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bw5.ar0 b(android.content.Context context, bw5.ar0 scene) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scene, "scene");
        if (context instanceof qk.c9) {
            if (((qk.c9) context).getF109514v()) {
                int ordinal = scene.ordinal();
                return ordinal != 116 ? ordinal != 126 ? ordinal != 134 ? ordinal != 128 ? ordinal != 129 ? scene : bw5.ar0.TingScene_FinderProfileCategoryHalfScreen : bw5.ar0.TingScene_FinderProfileSingerHalfScreen : bw5.ar0.TingScene_FinderProfileAudioHalfScreen : bw5.ar0.TingScene_FinderProfileMusicHalfScreen : bw5.ar0.TingScene_BrandProfileHalfScreen;
            }
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            boolean z17 = false;
            if (activity != null && (intent = activity.getIntent()) != null && lk5.s.c(intent)) {
                z17 = true;
            }
            if (z17 && com.tencent.mm.plugin.finder.storage.bd0.f126523a[scene.ordinal()] == 4) {
                return bw5.ar0.TingScene_FinderProfileAudioTabFromFinder;
            }
        }
        return scene;
    }

    public final bw5.lp0 c(r45.zi2 zi2Var, java.lang.String str) {
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(1);
        bw5.z90 z90Var = new bw5.z90();
        java.lang.String string = zi2Var.getString(2);
        if (string == null) {
            string = "";
        }
        z90Var.E(string);
        java.lang.String string2 = zi2Var.getString(3);
        if (string2 == null) {
            string2 = "";
        }
        z90Var.C(string2);
        java.lang.String string3 = zi2Var.getString(7);
        if (string3 == null) {
            string3 = "";
        }
        z90Var.B(string3);
        java.lang.String string4 = zi2Var.getString(5);
        if (string4 == null) {
            string4 = "";
        }
        z90Var.z(string4);
        java.lang.String string5 = zi2Var.getString(6);
        if (string5 == null) {
            string5 = "";
        }
        z90Var.y(string5);
        java.lang.String string6 = zi2Var.getString(4);
        if (string6 == null) {
            string6 = "";
        }
        z90Var.q(string6);
        java.lang.String string7 = zi2Var.getString(8);
        if (string7 == null) {
            string7 = "";
        }
        z90Var.r(string7);
        java.lang.String string8 = zi2Var.getString(0);
        if (string8 == null) {
            string8 = "";
        }
        z90Var.A(string8);
        v70Var.w(z90Var);
        java.lang.String o17 = v70Var.j().o();
        if (o17 == null) {
            o17 = "";
        }
        v70Var.p(o17);
        java.lang.String l17 = v70Var.j().l();
        if (l17 == null) {
            l17 = "";
        }
        v70Var.x(l17);
        java.lang.String c17 = v70Var.j().c();
        v70Var.q(c17 != null ? c17 : "");
        v70Var.t(true);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        if (str.length() == 0) {
            str = v70Var.getListenId();
        }
        if (str.length() == 0) {
            str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        lp0Var.g(str);
        return lp0Var;
    }

    public final void d(r45.zi2 musicInfo, java.lang.String musicId, int i17, r45.xs4 xs4Var, boolean z17) {
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        b21.r rVar = new b21.r();
        rVar.f17345d = i17;
        rVar.f17346e = musicId;
        rVar.f17358t = musicInfo.getString(6);
        rVar.f17350i = musicInfo.getString(4);
        rVar.f17348g = musicInfo.getString(2);
        rVar.f17349h = musicInfo.getString(3);
        rVar.f17351m = musicInfo.getString(8);
        rVar.f17362x = musicInfo.getString(1);
        rVar.f17354p = musicInfo.getString(7);
        rVar.f17352n = musicInfo.getString(5);
        rVar.T = true;
        rVar.P = musicInfo.getString(0);
        rVar.M = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_use_network_data_play, bm5.h0.RepairerConfig_Mv_UseNetworkDataPlay_Int, 0) == 1;
        if (!z17) {
            rVar.N = false;
        }
        c21.i iVar = (c21.i) i95.n0.c(c21.i.class);
        b21.t a17 = b21.t.a(musicId, xs4Var);
        ((ll3.j1) iVar).getClass();
        ll3.q0.e(rVar, a17);
        if (xs4Var != null) {
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(11)))) {
                xs4Var = null;
            }
            if (xs4Var != null) {
                rVar.P = xs4Var.getString(11);
            }
        }
        b21.m.i(rVar);
    }

    public final qk.g9 e() {
        return (qk.g9) i95.n0.c(qk.g9.class);
    }

    public final boolean f(java.lang.String playId, boolean z17) {
        kotlin.jvm.internal.o.g(playId, "playId");
        if (z17) {
            return ((rk4.z8) e()).oj(playId);
        }
        b21.r b17 = b21.m.b();
        if ((b17 != null ? b17.f17346e : null) != null && b17.f17345d == 0 && b21.m.c()) {
            try {
                if (com.tencent.mm.sdk.platformtools.t8.D0(b17.f17346e, playId)) {
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public final boolean g(android.content.Context context, r45.zi2 musicSongInfo, java.lang.String musicId, int i17, r45.xs4 xs4Var, boolean z17, bw5.ar0 tingScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(musicSongInfo, "musicSongInfo");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        kotlin.jvm.internal.o.g(tingScene, "tingScene");
        if (z17) {
            if (f(musicId, true)) {
                ((rk4.z8) e()).zj();
                com.tencent.mars.xlog.Log.i("FinderMvLogic", "stopMusic");
                return true;
            }
            com.tencent.mars.xlog.Log.i("FinderMvLogic", "playMusic");
            bw5.lp0 c17 = c(musicSongInfo, musicId);
            boolean h17 = il4.l.f292142a.h(context);
            il4.e eVar = new il4.e(null, 0, b(context, tingScene).f25422d, true, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null);
            eVar.f292122s.f292131c = h17;
            qk.g9 e17 = e();
            java.lang.String b17 = c17.b();
            kotlin.jvm.internal.o.f(b17, "getClientId(...)");
            ((rk4.z8) e17).qj(b17, c17, eVar);
            return false;
        }
        b21.r b18 = b21.m.b();
        if ((b18 != null ? b18.f17346e : null) == null || !com.tencent.mm.sdk.platformtools.t8.D0(b18.f17346e, musicId)) {
            com.tencent.mars.xlog.Log.i("FinderMvLogic", "playMusic");
            d(musicSongInfo, musicId, i17, xs4Var, z17);
        } else {
            if (b21.m.c()) {
                com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
                mvCardActionReportStruct.f59456j = 2L;
                mvCardActionReportStruct.f59457k = 8L;
                zy2.oc.b(mvCardActionReportStruct);
                b21.m.j();
                return true;
            }
            d(musicSongInfo, musicId, i17, xs4Var, z17);
        }
        return false;
    }
}
