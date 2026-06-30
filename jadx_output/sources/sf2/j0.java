package sf2;

/* loaded from: classes10.dex */
public abstract class j0 {

    /* renamed from: c */
    public static final java.lang.String f407173c = com.tencent.mm.vfs.q7.c("finder_live_ktv_audition_temp") + '/';

    /* renamed from: a */
    public final sf2.f0 f407174a;

    /* renamed from: b */
    public com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver f407175b;

    public j0(sf2.f0 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f407174a = scene;
    }

    public static final r45.yx1 a(sf2.j0 j0Var, hn2.d dVar, r45.cy1 cy1Var) {
        j0Var.getClass();
        r45.yx1 yx1Var = new r45.yx1();
        yx1Var.f391458d = dVar.f282505a;
        r45.by1 by1Var = new r45.by1();
        r45.ay1 ay1Var = new r45.ay1();
        ay1Var.f370350d = dVar.f282505a;
        ay1Var.f370351e = dVar.f282506b;
        ay1Var.f370352f = dVar.f282507c;
        ay1Var.f370353g = dVar.f282508d;
        ay1Var.f370354h = dVar.f282509e;
        ay1Var.f370355i = dVar.f282510f;
        ay1Var.f370356m = dVar.f282511g;
        ay1Var.f370357n = dVar.f282512h;
        by1Var.f371143d = ay1Var;
        by1Var.f371144e = cy1Var;
        yx1Var.f391466o = by1Var;
        return yx1Var;
    }

    public static /* synthetic */ boolean l(sf2.j0 j0Var, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopAudition");
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        return j0Var.k(str, z17, z18);
    }

    public abstract void b();

    public final int c() {
        int ordinal = this.f407174a.ordinal();
        if (ordinal == 0) {
            return 99999;
        }
        if (ordinal == 1) {
            return 99998;
        }
        throw new jz5.j();
    }

    public abstract mm2.j5 d();

    public abstract android.content.Context e();

    public abstract tn0.w0 f();

    public abstract mm2.k5 g();

    public abstract kotlinx.coroutines.y0 h();

    public abstract void i();

    public final void j(hn2.d songInfo) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        sf2.h0 h0Var = new sf2.h0(this, songInfo);
        java.lang.String str = songInfo.f282505a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        r45.zr5 b17 = songInfo.b();
        r45.cy1 cy1Var = songInfo.f282518n;
        if (cy1Var != null && b17 != null) {
            kotlinx.coroutines.l.d(h(), null, null, new sf2.g0(this, str2, b17, songInfo, cy1Var, h0Var, null), 3, null);
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.or9);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        h0Var.invoke(java.lang.Boolean.FALSE, null, string);
        com.tencent.mars.xlog.Log.e("FinderLiveBaseSongAuditionHelper", "[" + this.f407174a + "] No valid resource type found for song: " + str2);
    }

    public final boolean k(java.lang.String songMid, boolean z17, boolean z18) {
        nm2.a aVar;
        com.tencent.trtc.TRTCCloud T;
        com.tencent.liteav.audio.TXAudioEffectManager audioEffectManager;
        sf2.f0 f0Var = this.f407174a;
        kotlin.jvm.internal.o.g(songMid, "songMid");
        try {
            tn0.w0 f17 = f();
            if (f17 != null && (T = f17.T()) != null && (audioEffectManager = T.getAudioEffectManager()) != null) {
                audioEffectManager.stopPlayMusic(c());
                audioEffectManager.setMusicObserver(c(), null);
            }
            if ((songMid.length() == 0) && (aVar = (nm2.a) ((kotlinx.coroutines.flow.h3) d().f329182g).getValue()) != null) {
                nm2.a aVar2 = aVar.b().length() > 0 ? aVar : null;
                if (aVar2 != null) {
                    songMid = aVar2.b();
                    z17 = aVar2.d();
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveBaseSongAuditionHelper", "[" + f0Var + "] stopAudition for songMid: " + songMid + ", result: " + d().R6(songMid, z17));
            if (z18) {
                i();
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveBaseSongAuditionHelper", "[" + f0Var + "] stopAudition error", e17);
            if (z18) {
                i();
            }
            return false;
        }
    }
}
