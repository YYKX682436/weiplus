package sf2;

/* loaded from: classes10.dex */
public final class o1 extends sf2.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.x f407229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(sf2.x controller) {
        super(sf2.f0.f407129e);
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f407229d = controller;
    }

    @Override // sf2.j0
    public void b() {
        try {
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSongAuditionHelper", "adjustVolumeForAudition");
            m();
            n();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSongAuditionHelper", "adjustVolumeForAudition error", e17);
        }
    }

    @Override // sf2.j0
    public mm2.j5 d() {
        return (mm2.j5) this.f407229d.business(mm2.j5.class);
    }

    @Override // sf2.j0
    public android.content.Context e() {
        return this.f407229d.O6();
    }

    @Override // sf2.j0
    public tn0.w0 f() {
        return dk2.ef.f233372a.f();
    }

    @Override // sf2.j0
    public mm2.k5 g() {
        return (mm2.k5) this.f407229d.business(mm2.k5.class);
    }

    @Override // sf2.j0
    public kotlinx.coroutines.y0 h() {
        return new sf2.n1(this);
    }

    @Override // sf2.j0
    public void i() {
        try {
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSongAuditionHelper", "restoreVolumeAfterAudition");
            o();
            p();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSongAuditionHelper", "restoreVolumeAfterAudition error", e17);
        }
    }

    public final void m() {
        com.tencent.trtc.TRTCCloud T;
        com.tencent.liteav.audio.TXAudioEffectManager audioEffectManager;
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam;
        try {
            tn0.w0 f17 = f();
            java.lang.Integer num = null;
            if (f17 != null && (audioMusicParam = f17.L) != null) {
                num = java.lang.Integer.valueOf(audioMusicParam.f46245id);
            }
            if (num == null) {
                com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSongAuditionHelper", "reduceBgMusicVolume: no bg music playing");
                return;
            }
            if (f17 != null && (T = f17.T()) != null && (audioEffectManager = T.getAudioEffectManager()) != null) {
                audioEffectManager.setMusicPlayoutVolume(num.intValue(), 0);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSongAuditionHelper", "reduceBgMusicVolume: bgMusicId=" + num + ", volume=0");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSongAuditionHelper", "reduceBgMusicVolume error", e17);
        }
    }

    public final void n() {
        sf2.x xVar = this.f407229d;
        try {
            sf2.e1 e1Var = (sf2.e1) xVar.getStore().controller(sf2.e1.class);
            if (e1Var == null || !(((kotlinx.coroutines.flow.h3) ((mm2.m6) xVar.business(mm2.m6.class)).f329251s).getValue() instanceof mm2.i6)) {
                com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSongAuditionHelper", "reduceSingSongVolume: not singing or controller not found");
            } else {
                e1Var.k7(0, dh2.c0.f232434e);
                com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSongAuditionHelper", "reduceSingSongVolume: volume=0");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSongAuditionHelper", "reduceSingSongVolume error", e17);
        }
    }

    public final void o() {
        com.tencent.trtc.TRTCCloud T;
        com.tencent.liteav.audio.TXAudioEffectManager audioEffectManager;
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam;
        try {
            tn0.w0 f17 = f();
            java.lang.Integer num = null;
            if (f17 != null && (audioMusicParam = f17.L) != null) {
                num = java.lang.Integer.valueOf(audioMusicParam.f46245id);
            }
            if (num != null) {
                int i17 = f17 != null ? f17.f420778x0 : 100;
                if (f17 != null && (T = f17.T()) != null && (audioEffectManager = T.getAudioEffectManager()) != null) {
                    audioEffectManager.setMusicPlayoutVolume(num.intValue(), i17);
                }
                com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSongAuditionHelper", "restoreBgMusicVolume: bgMusicId=" + num + ", volume=" + i17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSongAuditionHelper", "restoreBgMusicVolume error", e17);
        }
    }

    public final void p() {
        try {
            sf2.e1 e1Var = (sf2.e1) this.f407229d.getStore().controller(sf2.e1.class);
            if (e1Var != null) {
                dh2.c0 c0Var = dh2.c0.f232434e;
                com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "resetKtvBgmVolumeSource: source=" + c0Var);
                ah2.b f76 = e1Var.f7();
                if (f76 != null) {
                    ((dh2.x) f76).k(c0Var);
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSongAuditionHelper", "restoreSingSongVolume: reset AUDITION source");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSongAuditionHelper", "restoreSingSongVolume error", e17);
        }
    }
}
