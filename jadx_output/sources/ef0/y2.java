package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class y2 extends i95.w implements qk.o8 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lc0 f252360d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f252361e = jz5.h.b(ef0.r2.f252314d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f252362f = jz5.h.b(ef0.w2.f252350d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f252363g = jz5.h.b(ef0.m2.f252273d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f252364h = jz5.h.b(new ef0.n2(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f252365i = jz5.h.b(new ef0.o2(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f252366m = jz5.h.b(new ef0.q2(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f252367n = jz5.h.b(ef0.x2.f252357d);

    public boolean Ai() {
        if (bj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "enableAddToListenMenu isWeChatUser and not enable");
            return false;
        }
        if (((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Di()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "enableAddToListenMenu isInAudioPanelBlackList and not enable");
            return false;
        }
        if (!((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode()) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "enableAddToListenMenu isTeenMode and not enable");
        return false;
    }

    public boolean Bi() {
        return ((java.lang.Boolean) ((jz5.n) this.f252363g).getValue()).booleanValue();
    }

    public boolean Di() {
        if (bj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "enableTimelineTingEntry isWeChatUser and not enable");
            return false;
        }
        if (((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "enableTimelineTingEntry isTeenMode and not enable");
            return false;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingAudioTimelineEntry()) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "enableShowMusicSettingEntry newStyleOk:true, configOk:" + z17);
        return z17;
    }

    public boolean Ni() {
        return ((java.lang.Boolean) ((jz5.n) this.f252365i).getValue()).booleanValue();
    }

    public boolean Ri() {
        if (!Vi()) {
            return false;
        }
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
        boolean z17 = (c01.z1.h() & 2097152) != 2097152;
        com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "canShowReddot_Ting return " + z17);
        return z17;
    }

    public final bw5.lc0 Ui() {
        if (this.f252360d == null) {
            byte[] b17 = gm4.a.f273557a.b("key_listen_user_config");
            if (b17 != null) {
                bw5.lc0 lc0Var = new bw5.lc0();
                lc0Var.parseFrom(b17);
                this.f252360d = lc0Var;
            } else {
                this.f252360d = new bw5.lc0();
            }
        }
        return this.f252360d;
    }

    public final boolean Vi() {
        return ((java.lang.Boolean) ((jz5.n) this.f252364h).getValue()).booleanValue();
    }

    public java.lang.Object Zi(im5.b bVar, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "getListenUserConfig");
        pq5.g l17 = new vk4.d().l();
        l17.f(bVar);
        l17.q(new ef0.p2(this, nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public java.lang.Boolean aj() {
        bw5.lc0 Ui = Ui();
        if (Ui != null) {
            return java.lang.Boolean.valueOf(Ui.f29737d);
        }
        return null;
    }

    public final boolean bj() {
        return ((java.lang.Boolean) ((jz5.n) this.f252366m).getValue()).booleanValue();
    }

    public void cj(java.lang.Boolean bool, boolean z17) {
        if (bool == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "saveMusicRecommendStateLocal fail state null");
            return;
        }
        bw5.lc0 Ui = Ui();
        java.lang.Boolean valueOf = Ui != null ? java.lang.Boolean.valueOf(Ui.f29737d) : null;
        bw5.lc0 Ui2 = Ui();
        if (Ui2 != null) {
            Ui2.f29737d = bool.booleanValue();
            Ui2.f29749s[1] = true;
        }
        wi();
        if (!z17 || kotlin.jvm.internal.o.b(valueOf, bool)) {
            return;
        }
        nj(valueOf, bool.booleanValue());
    }

    public boolean fj() {
        if (!Vi()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry not enable, not show");
            return false;
        }
        if (((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry isTeenMode and not show");
            return false;
        }
        if (((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Di()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry isInAudioPanelBlackList and not show");
            return false;
        }
        if (!((c01.z1.h() & 32768) == 32768)) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry tingEntryClose and not show");
        return false;
    }

    public boolean hj() {
        if (!Vi()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry not enable, not show");
            return false;
        }
        if (((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry isTeenMode and not show");
            return false;
        }
        if (!((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Di()) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry isInAudioPanelBlackList and not show");
        return false;
    }

    public boolean ij(int i17) {
        boolean z17;
        if (!Ni()) {
            return false;
        }
        if (!il4.l.l(i17) && !il4.l.g(i17)) {
            return false;
        }
        if (!(i17 == 101)) {
            if (!(i17 == 103)) {
                z17 = false;
                return (z17 || il4.l.i(i17)) ? false : true;
            }
        }
        z17 = true;
        if (z17) {
            return false;
        }
    }

    public boolean mj() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_ting_audio_square_remove", null);
        return aj6 == null || java.lang.Integer.parseInt(aj6) != 0;
    }

    public final void nj(java.lang.Boolean bool, boolean z17) {
        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
        if (ip1.e.f293584a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "tryNotifyMusicRecommendStateChanged old: " + bool + ", newState: " + z17);
            ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
            ip1.r.f293608a.b();
            com.tencent.mm.autogen.events.TingMusicRecommendStateChangedEvent tingMusicRecommendStateChangedEvent = new com.tencent.mm.autogen.events.TingMusicRecommendStateChangedEvent();
            tingMusicRecommendStateChangedEvent.f54897g.getClass();
            tingMusicRecommendStateChangedEvent.e();
        }
    }

    public final void wi() {
        bw5.lc0 Ui = Ui();
        if (Ui != null) {
            gm4.a.f273557a.h("key_listen_user_config", Ui.toByteArray());
        }
        bw5.lc0 Ui2 = Ui();
        if (Ui2 != null) {
            try {
                bw5.lc0 lc0Var = new bw5.lc0();
                lc0Var.parseFrom(Ui2.toByteArray());
                int i17 = jm4.z5.f300455d;
                jm4.x5 x5Var = (jm4.x5) urgen.ur_0025.UR_DAAF.UR_1332();
                if (x5Var != null) {
                    byte[] byteArray = lc0Var.toByteArray();
                    long cppPointer = ((jm4.z5) x5Var).getCppPointer();
                    kotlin.jvm.internal.o.d(byteArray);
                    urgen.ur_0025.UR_DAAF.UR_5D87(cppPointer, byteArray, false);
                }
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingEntryConfigService", "syncToUserConfigAff error");
            }
        }
    }
}
