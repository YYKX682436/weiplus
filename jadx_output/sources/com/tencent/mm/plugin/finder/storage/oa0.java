package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes11.dex */
public final class oa0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.oa0 f127302a = new com.tencent.mm.plugin.finder.storage.oa0();

    public final b21.r a(r45.hf2 hf2Var, java.lang.String str, int i17) {
        b21.r rVar = new b21.r();
        rVar.f17345d = i17;
        rVar.f17346e = str;
        rVar.f17358t = hf2Var.getString(3);
        rVar.f17350i = hf2Var.getString(7);
        rVar.f17348g = hf2Var.getString(0);
        rVar.f17349h = hf2Var.getString(1);
        rVar.f17351m = hf2Var.getString(8);
        rVar.f17362x = hf2Var.getString(8);
        rVar.f17354p = hf2Var.getString(4);
        rVar.f17352n = hf2Var.getString(2);
        rVar.T = true;
        rVar.M = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_use_network_data_play, bm5.h0.RepairerConfig_Mv_UseNetworkDataPlay_Int, 0) == 1;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(hf2Var.getString(18))) {
            rVar.P = hf2Var.getString(18);
        }
        return rVar;
    }

    public final bw5.lp0 b(r45.hf2 musicSongInfo, java.lang.String musicId, r45.xs4 xs4Var) {
        kotlin.jvm.internal.o.g(musicSongInfo, "musicSongInfo");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        bw5.v70 v70Var = new bw5.v70();
        boolean z17 = true;
        v70Var.y(1);
        bw5.z90 z90Var = new bw5.z90();
        z90Var.E(musicSongInfo.getString(0));
        z90Var.C(musicSongInfo.getString(1));
        z90Var.B(musicSongInfo.getString(4));
        z90Var.z(musicSongInfo.getString(2));
        z90Var.y(musicSongInfo.getString(3));
        z90Var.q(musicSongInfo.getString(7));
        z90Var.r(musicSongInfo.getString(8));
        z90Var.A(musicSongInfo.getString(18));
        z90Var.w(musicSongInfo.getString(13));
        z90Var.t(musicSongInfo.getString(12));
        java.lang.String d17 = z90Var.d();
        if (d17 != null && !r26.n0.N(d17)) {
            z17 = false;
        }
        if (z17 && xs4Var != null) {
            z90Var.t(xs4Var.getString(6));
        }
        z90Var.x(musicSongInfo.getString(6));
        v70Var.w(z90Var);
        v70Var.p(v70Var.j().o());
        v70Var.x(v70Var.j().l());
        v70Var.q(v70Var.j().c());
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        lp0Var.g(musicId);
        return lp0Var;
    }

    public final boolean c(java.lang.String playId) {
        kotlin.jvm.internal.o.g(playId, "playId");
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

    public final void d(r45.hf2 musicSongInfo, java.lang.String musicId, int i17, java.lang.String musicCoverUrl) {
        kotlin.jvm.internal.o.g(musicSongInfo, "musicSongInfo");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        kotlin.jvm.internal.o.g(musicCoverUrl, "musicCoverUrl");
        if (c(musicId)) {
            com.tencent.mars.xlog.Log.i("FinderMvLogic", "same music");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderMvLogic", "playMusic");
        b21.r a17 = a(musicSongInfo, musicId, i17);
        c21.i iVar = (c21.i) i95.n0.c(c21.i.class);
        b21.t tVar = new b21.t();
        tVar.f17365a = musicId;
        tVar.f17367c = musicCoverUrl;
        ((ll3.j1) iVar).getClass();
        ll3.q0.e(a17, tVar);
        b21.m.i(a17);
    }

    public final void e(r45.hf2 musicSongInfo, java.lang.String musicId, int i17, r45.xs4 xs4Var) {
        kotlin.jvm.internal.o.g(musicSongInfo, "musicSongInfo");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        if (c(musicId)) {
            com.tencent.mars.xlog.Log.i("FinderMvLogic", "same music");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderMvLogic", "playMusic");
        b21.r a17 = a(musicSongInfo, musicId, i17);
        c21.i iVar = (c21.i) i95.n0.c(c21.i.class);
        b21.t a18 = b21.t.a(musicId, xs4Var);
        ((ll3.j1) iVar).getClass();
        ll3.q0.e(a17, a18);
        if (xs4Var != null) {
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(11)))) {
                xs4Var = null;
            }
            if (xs4Var != null) {
                a17.P = xs4Var.getString(11);
            }
        }
        b21.m.i(a17);
    }
}
