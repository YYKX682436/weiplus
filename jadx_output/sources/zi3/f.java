package zi3;

/* loaded from: classes14.dex */
public class f extends xm1.i {

    /* renamed from: u, reason: collision with root package name */
    public static f25.m0 f473169u;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.e f473170k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f473171l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f473172m;

    /* renamed from: n, reason: collision with root package name */
    public final f25.f f473173n = new zi3.c(this);

    /* renamed from: o, reason: collision with root package name */
    public final xm1.o f473174o;

    /* renamed from: p, reason: collision with root package name */
    public final cv.u0 f473175p;

    /* renamed from: q, reason: collision with root package name */
    public int f473176q;

    /* renamed from: r, reason: collision with root package name */
    public cv.v0 f473177r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f473178s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Toast f473179t;

    public f() {
        zi3.b bVar = new zi3.b(this);
        this.f473174o = new xm1.o(bVar);
        this.f473175p = new cv.u0(bVar, 3);
        i();
        com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothMgr", "refreshForbiddenCauseVoipRequest，".concat("multitalke"));
        an1.c.f8836d = true;
        om1.a.f346265c = 0;
        this.f473176q = -1;
    }

    public static final void C(zi3.f fVar, cv.v0 v0Var, boolean z17) {
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "switchUIVoicePlayDevice: " + v0Var + ", " + z17);
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = fVar.f473178s;
        if (multiTalkMainUI != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "setVoicePlayDevice: " + v0Var);
            if (v0Var != null) {
                com.tencent.mm.plugin.multitalk.ui.b0 b0Var = multiTalkMainUI.f150242u;
                b0Var.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVoicePlayDevice: ");
                int i17 = v0Var.f222516a;
                sb6.append(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
                if (i17 == 3 || i17 == 4) {
                    com.tencent.mm.plugin.multitalk.model.e3.Bi().a(true);
                } else {
                    com.tencent.mm.plugin.multitalk.model.e3.Bi().a(false);
                }
                b0Var.f150258f.postValue(java.lang.Integer.valueOf(i17));
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ui.z(i17));
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new zi3.e(fVar, v0Var));
    }

    public static /* synthetic */ void P(zi3.f fVar, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchOutput");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        fVar.O(i17, z17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0.f176438a == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(boolean r6) {
        /*
            r5 = this;
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.MT.MultiTalkAudioManager"
            java.lang.String r2 = "setSpeakerPhoneOn, isSpeakerPhoneOn: %b"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            r5.A(r6)
            com.tencent.mm.plugin.voip.model.e r0 = r5.f473170k
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r3 = r0.f176438a
            r4 = 1
            if (r3 != r4) goto L1d
            goto L1e
        L1d:
            r4 = r2
        L1e:
            if (r4 == 0) goto L26
            if (r0 == 0) goto L26
            boolean r2 = r0.j(r6)
        L26:
            r5.f473171l = r2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "setSpeakerPhoneOn, result %b"
            com.tencent.mars.xlog.Log.i(r1, r0, r6)
            boolean r6 = r5.f473171l
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zi3.f.D(boolean):boolean");
    }

    public final int E() {
        com.tencent.mm.plugin.voip.model.e eVar = this.f473170k;
        if (eVar != null) {
            return eVar.g();
        }
        return 0;
    }

    public final boolean F() {
        return m(3) || m(4);
    }

    public void G() {
        if (!e()) {
            H();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new zi3.d(this));
    }

    public void H() {
        v();
        a(false);
        q("multitalke");
        this.f473174o.b();
        f25.m0 m0Var = f473169u;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f473169u = null;
    }

    public final void I(boolean z17, int i17) {
        if (i17 != 0) {
            this.f455177i = null;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
            bundle.putInt("streamType", E());
            ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.MULTITALK, bundle);
        } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj() || ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioDeviceToStartRing but waitting the bt connected");
            M(z17);
            this.f455177i = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioDeviceToStartRing ignore bluetooth or not bt plug");
            M(z17);
        }
        if (z17 || mx3.f0.f332548a.k()) {
            Q();
        }
    }

    public final void J() {
        Q();
        boolean Ui = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(m(3));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(m(4));
        i();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b, isUsingExternalAudioDevice:%b, isBluetoothCanUse:%b, %s", valueOf, valueOf2, java.lang.Boolean.valueOf(an1.c.f8834b || an1.d.f8839b), java.lang.Boolean.valueOf(Ui), java.lang.Integer.valueOf(hashCode()));
        f25.n0 n0Var = (f25.n0) i95.n0.c(f25.n0.class);
        f25.u uVar = f25.u.f259113c;
        f473169u = n0Var.m9(uVar, null);
        if (Ui) {
            O(4, false);
        } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
            O(3, false);
        } else {
            O(1, false);
        }
        f25.m0 m0Var = f473169u;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(uVar, this.f473173n);
        f473169u = m96;
        if (m96 != null && ((g25.e) m96).f267980c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioFocus: gain focus");
            N(false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioFocus: not gain focus");
            N(true);
        }
    }

    public final void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestPreviousDevice: " + this.f473177r);
        cv.v0 v0Var = this.f473177r;
        if (v0Var == null) {
            J();
        } else {
            O(v0Var != null ? v0Var.f222516a : 1, false);
        }
    }

    public final void L(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI, boolean z17) {
        this.f473178s = multiTalkMainUI;
        if (multiTalkMainUI == null) {
            if (z17) {
                this.f473177r = null;
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "setMultiTalkUIProxy: " + this.f473178s + ", " + this.f473177r);
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(this.f473175p);
    }

    public final void M(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isOutCall", z17);
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "start");
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.MULTITALK, bundle);
    }

    public final void N(boolean z17) {
        if (j65.e.b() && j65.e.g()) {
            this.f473172m = z17;
            com.tencent.mm.plugin.voip.model.e eVar = this.f473170k;
            if (eVar != null) {
                eVar.R = z17;
            }
            yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
            if (Ai != null) {
                Ai.f467948h = z17;
                yx3.k kVar = Ai.f467943c;
                if (kVar != null) {
                    kVar.i(z17);
                }
            }
        }
    }

    public final void O(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "switchOutput: " + i17 + ", " + z17);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().M(i17 != 2);
        this.f473174o.c(i17, z17);
    }

    public final void Q() {
        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "tryRequestBluetoothDevice, ret:" + r("multitalke", 4));
        }
    }

    public void R() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "MultiTalkAudioManager: unInit");
        G();
        this.f473178s = null;
        this.f473177r = null;
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).oj(this.f473175p);
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).release();
    }

    @Override // xm1.h
    public void o(int i17) {
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s == sj3.e4.Init) {
            super.o(i17);
            return;
        }
        super.o(i17);
        boolean z17 = false;
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 7:
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_BT_ScoStateDisconnected");
                boolean z18 = com.tencent.mm.plugin.multitalk.model.e3.Ri().A() && !m(3);
                if (com.tencent.mm.plugin.multitalk.model.e3.Ri().A() && !m(3)) {
                    z18 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150164g;
                }
                if (m(3)) {
                    com.tencent.mm.plugin.multitalk.model.e3.Bi().a(true);
                } else {
                    com.tencent.mm.plugin.multitalk.model.e3.Bi().c(z18);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "isSpeakerAfterBluetoothDisconnected: isHeadsetPlugged: %s, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s, isSpeaker: %s", java.lang.Boolean.valueOf(m(3)), java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150163f), java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150164g), java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().A()), java.lang.Boolean.valueOf(m(4)), java.lang.Boolean.valueOf(z18));
                com.tencent.mm.plugin.multitalk.model.e3.Ri().R(z18);
                com.tencent.mm.plugin.multitalk.model.e3.Bi().a(false);
                if (m(3)) {
                    com.tencent.mm.plugin.multitalk.model.e3.Ri().P(false);
                    com.tencent.mm.plugin.multitalk.model.e3.Bi().a(true);
                } else {
                    com.tencent.mm.plugin.multitalk.model.e3.Ri().P(true);
                }
                if (z18) {
                    com.tencent.mm.plugin.multitalk.model.e3.Zi().m(1);
                    return;
                } else if (m(3)) {
                    com.tencent.mm.plugin.multitalk.model.e3.Zi().m(3);
                    return;
                } else {
                    com.tencent.mm.plugin.multitalk.model.e3.Zi().m(2);
                    return;
                }
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_BT_ScoStateConnected");
                com.tencent.mm.plugin.multitalk.model.e3.Ri().P(false);
                a(false);
                com.tencent.mm.plugin.multitalk.model.e3.Ri().R(false);
                com.tencent.mm.plugin.multitalk.model.e3.Bi().a(true);
                com.tencent.mm.plugin.multitalk.model.e3.Bi().c(false);
                com.tencent.mm.plugin.multitalk.model.e3.Zi().m(4);
                return;
            case 4:
            case 5:
            default:
                return;
            case 8:
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_HP_HeadsetPlugged");
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "isHeadsetPlug connected, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s", java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150163f), java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150164g), java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().A()), java.lang.Boolean.valueOf(m(3)));
                com.tencent.mm.plugin.multitalk.model.e3.Ri().P(false);
                com.tencent.mm.plugin.multitalk.model.e3.Ri().R(false);
                com.tencent.mm.plugin.multitalk.model.e3.Zi().m(3);
                com.tencent.mm.plugin.multitalk.model.e3.Bi().a(true);
                com.tencent.mm.plugin.multitalk.model.e3.Bi().c(false);
                return;
            case 9:
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_HP_HeadsetUnPlugged");
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "isHeadsetPlug disconnected, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s", java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150163f), java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150164g), java.lang.Boolean.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().A()), java.lang.Boolean.valueOf(m(4)));
                boolean z19 = com.tencent.mm.plugin.multitalk.model.e3.Ri().A() ? com.tencent.mm.plugin.multitalk.model.e3.Ri().f150164g : true;
                com.tencent.mm.plugin.multitalk.model.e3.Bi().a(false);
                if (m(4)) {
                    com.tencent.mm.plugin.multitalk.model.e3.Bi().a(true);
                } else {
                    z17 = z19;
                }
                if (z17) {
                    com.tencent.mm.plugin.multitalk.model.e3.Zi().m(1);
                } else if (m(4)) {
                    com.tencent.mm.plugin.multitalk.model.e3.Zi().m(4);
                } else {
                    com.tencent.mm.plugin.multitalk.model.e3.Zi().m(2);
                }
                com.tencent.mm.plugin.multitalk.model.e3.Ri().R(z17);
                com.tencent.mm.plugin.multitalk.model.e3.Ri().P(true);
                com.tencent.mm.plugin.multitalk.model.e3.Bi().c(z17);
                return;
        }
    }
}
