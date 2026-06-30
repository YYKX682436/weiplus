package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class h2 {
    public static final kk.j F = new jt0.j(5);
    public final com.tencent.mm.network.s0 A;
    public final kh3.e B;
    public final com.tencent.mm.sdk.platformtools.b4 C;
    public vq4.z D;
    public dr4.p1 E;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.d3 f176558a;

    /* renamed from: b, reason: collision with root package name */
    public gq4.a f176559b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f176562e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f176563f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f176564g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f176565h;

    /* renamed from: n, reason: collision with root package name */
    public volatile uq4.a f176571n;

    /* renamed from: v, reason: collision with root package name */
    public long f176579v;

    /* renamed from: x, reason: collision with root package name */
    public final jq4.c1 f176581x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f176582y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.c0 f176583z;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f176560c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f176561d = false;

    /* renamed from: i, reason: collision with root package name */
    public long f176566i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f176567j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final int f176568k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f176569l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f176570m = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f176572o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f176573p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f176574q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176575r = false;

    /* renamed from: s, reason: collision with root package name */
    public r45.r27 f176576s = null;

    /* renamed from: t, reason: collision with root package name */
    public long f176577t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f176578u = false;

    /* renamed from: w, reason: collision with root package name */
    public long f176580w = 0;

    public h2() {
        this.f176562e = false;
        this.f176563f = false;
        this.f176564g = false;
        this.f176565h = null;
        this.f176579v = 0L;
        jq4.c1 c1Var = new jq4.c1();
        this.f176581x = c1Var;
        this.f176582y = true;
        com.tencent.mm.plugin.voip.model.i2 i2Var = new com.tencent.mm.plugin.voip.model.i2(this);
        this.A = i2Var;
        com.tencent.mm.plugin.voip.model.j2 j2Var = new com.tencent.mm.plugin.voip.model.j2(this);
        this.B = j2Var;
        this.C = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.l2(this), true);
        new java.util.HashMap();
        com.tencent.mm.plugin.voip.model.d3 d3Var = new com.tencent.mm.plugin.voip.model.d3();
        this.f176558a = d3Var;
        this.f176579v = 0L;
        this.f176562e = false;
        this.f176563f = false;
        this.f176565h = null;
        this.f176564g = false;
        this.f176583z = new com.tencent.mm.plugin.voip.model.c0(c1Var, d3Var);
        gm0.j1.n().a(i2Var);
        ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ni(2, j2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(android.content.Context r7, boolean r8) {
        /*
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            sb0.f r0 = (sb0.f) r0
            boolean r0 = r0.Ui(r7)
            java.lang.String r1 = "android.permission.RECORD_AUDIO"
            int r1 = b3.l.checkSelfPermission(r7, r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L24
            if (r8 == 0) goto L22
            java.lang.String r1 = "android.permission.CAMERA"
            int r7 = b3.l.checkSelfPermission(r7, r1)
            if (r7 != 0) goto L24
        L22:
            r7 = r3
            goto L25
        L24:
            r7 = r2
        L25:
            java.lang.Class<d85.m0> r1 = d85.m0.class
            i95.m r4 = i95.n0.c(r1)
            d85.m0 r4 = (d85.m0) r4
            d85.g0 r5 = d85.g0.CAMERA
            d85.f0 r6 = d85.f0.f227159g
            d85.d1 r4 = (d85.d1) r4
            boolean r4 = r4.Ri(r5, r6)
            if (r4 == 0) goto L4b
            i95.m r1 = i95.n0.c(r1)
            d85.m0 r1 = (d85.m0) r1
            d85.g0 r4 = d85.g0.MICRO_PHONE
            d85.d1 r1 = (d85.d1) r1
            boolean r1 = r1.Ri(r4, r6)
            if (r1 == 0) goto L4b
            r1 = r3
            goto L4c
        L4b:
            r1 = r2
        L4c:
            if (r0 == 0) goto L52
            if (r7 == 0) goto L52
            if (r1 != 0) goto L68
        L52:
            r4 = 2
            if (r8 == 0) goto L57
            r8 = r4
            goto L58
        L57:
            r8 = r3
        L58:
            rq4.s r5 = rq4.s.f399098a
            rq4.r r5 = rq4.s.f399100c
            r5.f399095c = r8
            if (r7 != 0) goto L62
            r4 = 3
            goto L66
        L62:
            if (r0 != 0) goto L65
            goto L66
        L65:
            r4 = -1
        L66:
            r5.f399096d = r4
        L68:
            if (r0 == 0) goto L6f
            if (r7 == 0) goto L6f
            if (r1 == 0) goto L6f
            r2 = r3
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.h2.j(android.content.Context, boolean):boolean");
    }

    public void A(int i17, int i18) {
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176558a.f176411a;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        if (i17 == 1) {
            int i19 = g1Var.G;
            if (i19 == 0) {
                g1Var.G = 1;
            } else if (i19 == 2) {
                g1Var.G = 3;
            }
        } else if (i17 == 2) {
            int i27 = g1Var.G;
            if (i27 == 1) {
                g1Var.G = 0;
            } else if (i27 == 3) {
                g1Var.G = 2;
            }
        }
        vq4.d0.c("MicroMsg.Voip.VoipContext", "zhengxue: audio device occupied stat sync stat " + i17 + " app " + i18);
        try {
            byte[] bArr = new byte[4];
            bArr[0] = (byte) i17;
            v2protocalVar.setJNIAppCmd(2, bArr, 4);
            r45.f27 f27Var = new r45.f27();
            f27Var.f373955d = i17;
            f27Var.f373956e = i18;
            r45.ww6 ww6Var = new r45.ww6();
            ww6Var.f389547d = 4;
            ww6Var.f389548e = new com.tencent.mm.protobuf.g(f27Var.toByteArray());
            v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
        } catch (java.lang.Exception unused) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "onAudioDevOccupiedStat Error");
        }
    }

    public void B(int i17, long j17, boolean z17, java.lang.String str) {
        if (i17 == this.f176558a.f176434x && i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "current room id %s have been exit.", java.lang.Integer.valueOf(i17));
            return;
        }
        ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).Ai(java.lang.String.valueOf(j17), 1);
        ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).Di(java.lang.String.valueOf(j17), 2, z17 ? 1 : 2, 1);
        bd0.n nVar = (bd0.n) i95.n0.c(bd0.n.class);
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        int i18 = 0;
        if (!this.f176558a.h()) {
            this.f176558a.getClass();
            if (!((ip.b.t() || com.tencent.mm.sdk.platformtools.s1.a(com.tencent.mm.sdk.platformtools.x2.f193071a)) ? false : true)) {
                i18 = 1;
            }
        }
        mg0.a wi6 = ((kg0.m) nVar).wi(valueOf);
        if (wi6 != null) {
            if (wi6.f326202f < 1) {
                wi6.f326202f = 1;
            }
            com.tencent.mm.autogen.mmdata.rpt.VoIPMobileReportStruct voIPMobileReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIPMobileReportStruct();
            voIPMobileReportStruct.f61640e = voIPMobileReportStruct.b("RoomUin", wi6.f326197a, true);
            voIPMobileReportStruct.f61642g = wi6.f326198b;
            voIPMobileReportStruct.f61641f = wi6.f326199c;
            voIPMobileReportStruct.f61639d = wi6.f326200d;
            voIPMobileReportStruct.f61643h = 1;
            voIPMobileReportStruct.f61644i = 11;
            voIPMobileReportStruct.f61645j = i18;
            voIPMobileReportStruct.o();
            voIPMobileReportStruct.k();
        }
        if (!((jp5.o) i95.n0.c(jp5.o.class)).ie()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.k2(this, i17, j17, z17, str));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Voip.VoipService", "onDelayInvite: now ilink voip talking, busy " + i17);
        this.f176558a.d(i17, j17, 2, null, null, this.f176565h);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: IOException -> 0x021f, TryCatch #0 {IOException -> 0x021f, blocks: (B:13:0x0047, B:16:0x0077, B:18:0x0090, B:20:0x009b, B:25:0x00ab, B:27:0x00be, B:29:0x00de, B:31:0x0107, B:32:0x0110, B:35:0x012c, B:39:0x0135, B:42:0x0169, B:46:0x0176, B:49:0x017d, B:51:0x0183, B:54:0x018c, B:56:0x019b, B:58:0x01a7, B:60:0x01ab, B:61:0x01af, B:64:0x01b5, B:67:0x01be, B:70:0x01e7), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[Catch: IOException -> 0x021f, TryCatch #0 {IOException -> 0x021f, blocks: (B:13:0x0047, B:16:0x0077, B:18:0x0090, B:20:0x009b, B:25:0x00ab, B:27:0x00be, B:29:0x00de, B:31:0x0107, B:32:0x0110, B:35:0x012c, B:39:0x0135, B:42:0x0169, B:46:0x0176, B:49:0x017d, B:51:0x0183, B:54:0x018c, B:56:0x019b, B:58:0x01a7, B:60:0x01ab, B:61:0x01af, B:64:0x01b5, B:67:0x01be, B:70:0x01e7), top: B:12:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(byte[] r22) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.h2.C(byte[]):void");
    }

    public com.tencent.mm.plugin.voip.model.m1 D(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int hashCode = str.hashCode();
        kk.j jVar = F;
        com.tencent.mm.plugin.voip.model.m1 m1Var = (com.tencent.mm.plugin.voip.model.m1) ((lt0.f) jVar).get(java.lang.Integer.valueOf(hashCode));
        if (m1Var != null) {
            return m1Var;
        }
        com.tencent.mm.plugin.voip.model.m1 m1Var2 = new com.tencent.mm.plugin.voip.model.m1();
        if (!m1Var2.a(str)) {
            return null;
        }
        ((lt0.f) jVar).j(java.lang.Integer.valueOf(hashCode), m1Var2);
        return m1Var2;
    }

    public final void E(int i17) {
        com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent = new com.tencent.mm.autogen.events.VoipCallingStatusEvent();
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        boolean z17 = d3Var.f176433w;
        am.v00 v00Var = voipCallingStatusEvent.f54942g;
        v00Var.f8158a = z17;
        v00Var.f8160c = d3Var.f176432v;
        v00Var.f8159b = d3Var.f176431u;
        v00Var.f8161d = i17;
        voipCallingStatusEvent.e();
    }

    public void F(java.lang.String str, boolean z17, boolean z18, long j17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipService", "bindVoipForegroundIfNeed", new java.lang.Object[0]);
        if (z17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
                return;
            }
        }
        if (!z17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.RECORD_AUDIO")) {
                return;
            }
        }
        if (fp.h.c(26)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("isRecalled", z18);
            intent.putExtra("Voip_User", str);
            intent.putExtra("Voip_CallRoomKey", j17);
            intent.putExtra("Voip_VideoCall", z17);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.voip.widget.VoipNewForegroundService.class);
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipService", e17, "using start foreground service to bindVoipForegroundIfNeed error: %s", e17.getMessage());
            }
        }
    }

    public void G() {
        this.f176571n = null;
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(41);
    }

    public void H() {
        uq4.a aVar = this.f176571n;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "do not need voip resume");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "resetFullscreenIntent ");
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        java.lang.String str = d3Var.f176431u;
        boolean z17 = d3Var.f176433w;
        boolean z18 = d3Var.f176432v;
        long j17 = aVar.f430230d;
        G();
        M(com.tencent.mm.sdk.platformtools.x2.f193071a, str, j17, z17, z18, true);
    }

    public void I(boolean z17, boolean z18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "setCalling " + z17 + "  videoCall " + z18 + "username " + str);
        this.f176562e = z17;
        if (z18) {
            this.f176563f = z17;
            this.f176558a.f176411a.f176532x.f176828J = 0;
        } else {
            this.f176558a.f176411a.f176532x.f176828J = 1;
        }
        this.f176565h = str;
        this.f176558a.f176411a.f176532x.M1.getClass();
    }

    public void J(int i17) {
        this.f176558a.f176411a.f176532x.K = java.lang.Math.abs(i17);
    }

    public void K(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipService", "setEngineHeadsetPlugged, %s", java.lang.Boolean.valueOf(z17));
        byte[] bArr = {z17 ? (byte) 1 : (byte) 0};
        this.f176558a.f176411a.f176532x.setAppCmd(425, bArr, 1);
        if (!z17) {
            this.f176558a.f176411a.f176532x.setAppCmd(com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.CTRL_INDEX, bArr, 1);
            this.f176558a.f176411a.f176532x.setAppCmd(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX, bArr, 1);
            return;
        }
        if (ym1.f.Ri()) {
            this.f176558a.f176411a.f176532x.setAppCmd(com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.CTRL_INDEX, bArr, 1);
        }
        if (ym1.f.Ni()) {
            this.f176558a.f176411a.f176532x.setAppCmd(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX, bArr, 1);
        }
    }

    public void L(android.content.Context context, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "startVideoCall, toUser:" + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (java.lang.System.currentTimeMillis() - this.f176566i >= 2000 || java.lang.System.currentTimeMillis() - this.f176566i <= 0) {
            if (java.lang.System.currentTimeMillis() - this.f176569l < this.f176570m && java.lang.System.currentTimeMillis() - this.f176569l > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
                db5.e1.m(context, com.tencent.mm.R.string.kd9, com.tencent.mm.R.string.kdo, null);
                return;
            }
            this.f176566i = java.lang.System.currentTimeMillis();
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true) == null) {
                return;
            }
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).o2()) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                u1Var.g(context.getString(com.tencent.mm.R.string.kcq));
                u1Var.n(context.getString(com.tencent.mm.R.string.f490454vi));
                u1Var.l(new com.tencent.mm.plugin.voip.model.h2$$b());
                u1Var.q(false);
                return;
            }
            com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176558a.f176411a;
            if (2 != g1Var.f176510b) {
                g1Var.f176510b = 2;
            }
            ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).Ai(java.lang.String.valueOf(n()), 1);
            M(context, str, n(), true, true, false);
            com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
            voipEvent.f54945g.f8415b = 7;
            voipEvent.e();
        }
    }

    public final void M(android.content.Context context, final java.lang.String str, final long j17, final boolean z17, final boolean z18, final boolean z19) {
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        boolean z27 = false;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_mutex_adjust, false);
        if (fj6) {
            I(true, z18, str);
        }
        nq4.f fVar = nq4.f.f339014a;
        nq4.f.f339015b = 1;
        fVar.g(z17);
        vq4.b0.o();
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        d3Var.f176431u = str;
        d3Var.f176433w = z17;
        d3Var.f176432v = z18;
        G();
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipService", "start VideoActivity in foreground,%s bSetCallFlagBeforeUI %b", java.lang.Boolean.valueOf(wVar.f53889n), java.lang.Boolean.valueOf(fj6));
        final long m17 = m();
        if (vq4.b0.f439271b && z18 && this.E == null) {
            gq4.v.wi().d();
            if (fp.h.a(26) || z17 || (wVar.f53889n && !u() && !v())) {
                z27 = true;
            }
            dr4.p1 p1Var = new dr4.p1(z17, z27);
            this.E = p1Var;
            if (vq4.b0.f439280k) {
                p1Var.f();
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.model.m2(this, z18, str, j17));
        final android.content.Context context3 = context2;
        ((y03.e) i95.n0.c(y03.e.class)).d8(context3, str, z18, new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.h2$$c
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.String str2;
                android.content.Context context4;
                android.content.Intent intent;
                boolean z28;
                long j18;
                java.lang.String str3;
                android.widget.RemoteViews remoteViews;
                boolean z29;
                android.content.Context context5;
                java.lang.String string;
                android.widget.RemoteViews remoteViews2;
                com.tencent.mm.plugin.voip.model.h2 h2Var = com.tencent.mm.plugin.voip.model.h2.this;
                long j19 = m17;
                java.lang.String str4 = str;
                boolean z37 = z18;
                long j27 = j17;
                boolean z38 = z17;
                long j28 = currentTimeMillis;
                boolean z39 = z19;
                android.content.Context context6 = context3;
                android.content.Intent intent2 = (android.content.Intent) obj;
                if (j19 != h2Var.f176558a.f176434x || j19 == 0) {
                    if (vq4.b0.f439276g) {
                        h2Var.f176560c = true;
                        str2 = "MicroMsg.Voip.VoipService";
                        context4 = context6;
                        intent = intent2;
                        h2Var.F(str4, z37, false, j27);
                    } else {
                        str2 = "MicroMsg.Voip.VoipService";
                        context4 = context6;
                        intent = intent2;
                    }
                    vq4.m0 m0Var = new vq4.m0();
                    h2Var.D = m0Var;
                    m0Var.f439359w = z38;
                    m0Var.f439360x = z37;
                    com.tencent.mm.plugin.voip.model.j0.o(h2Var.z());
                    intent.putExtra("Voip_User", str4);
                    intent.putExtra("Voip_Outcall", z38);
                    intent.putExtra("Voip_VideoCall", z37);
                    intent.putExtra("Voip_LastPage_Hash", j28);
                    intent.putExtra("Voip_CallRoomKey", j27);
                    if (!z38 && fp.h.c(29) && (!com.tencent.mm.app.w.INSTANCE.f53889n || h2Var.u() || h2Var.v())) {
                        z28 = z39;
                        j18 = j28;
                        h2Var.f176571n = new uq4.a(false, z37, str4, z39, j27);
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String d17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(intent.getStringExtra("Voip_User"), true).d1();
                        ((sg3.a) v0Var).getClass();
                        java.lang.String e17 = c01.a2.e(d17);
                        if (ip.b.a()) {
                            remoteViews2 = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.d4o);
                            remoteViews2.setTextViewText(com.tencent.mm.R.id.f486168kg0, e17);
                            if (intent.getBooleanExtra("Voip_VideoCall", true)) {
                                string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493470kc3);
                                remoteViews2.setImageViewResource(com.tencent.mm.R.id.kfv, com.tencent.mm.R.drawable.btp);
                            } else {
                                string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493469kc2);
                                remoteViews2.setImageViewResource(com.tencent.mm.R.id.kfv, com.tencent.mm.R.drawable.btq);
                            }
                            remoteViews2.setTextViewText(com.tencent.mm.R.id.kg7, string);
                            remoteViews2.setImageViewBitmap(com.tencent.mm.R.id.kfq, h2Var.y(str4));
                            remoteViews2.setImageViewResource(com.tencent.mm.R.id.pjk, com.tencent.mm.R.drawable.btt);
                        } else {
                            string = intent.getBooleanExtra("Voip_VideoCall", true) ? com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493470kc3) : com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493469kc2);
                            if (!fp.h.c(31) || com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion < 31) {
                                remoteViews2 = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.d4p);
                                remoteViews2.setTextViewText(com.tencent.mm.R.id.pjm, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490495wp));
                                remoteViews2.setTextViewText(com.tencent.mm.R.id.kfu, string);
                            } else {
                                remoteViews2 = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.eqj);
                                remoteViews2.setTextViewText(com.tencent.mm.R.id.kfu, string);
                            }
                        }
                        str3 = e17 + string;
                        remoteViews = remoteViews2;
                    } else {
                        z28 = z39;
                        j18 = j28;
                        str3 = "";
                        remoteViews = null;
                    }
                    if (z28) {
                        intent.setFlags(603979776);
                        intent.addFlags(268435456);
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 29 && (!com.tencent.mm.app.w.INSTANCE.f53889n || h2Var.u() || h2Var.v())) {
                        h2Var.f176580w = j18;
                        com.tencent.mars.xlog.Log.i(str2, "start channel ring, now:" + h2Var.f176580w);
                    }
                    if (z38) {
                        z29 = false;
                        context5 = context4;
                    } else {
                        context5 = context4;
                        if (com.tencent.mm.plugin.voip.model.h2.j(context5, z37) && h2Var.f176582y && com.tencent.mm.app.w.INSTANCE.f53889n && !h2Var.u() && !h2Var.v()) {
                            if (gm0.j1.a()) {
                                h2Var.f176573p = false;
                                h2Var.f176574q = false;
                            }
                            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
                            com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
                            com.tencent.mm.pointers.PBool pBool2 = new com.tencent.mm.pointers.PBool();
                            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                            com.tencent.mm.pointers.PLong pLong = new com.tencent.mm.pointers.PLong();
                            pString.value = str4;
                            pBool.value = z38;
                            pBool2.value = z37;
                            pInt.value = vq4.n0.c(pBool.value, z37);
                            pLong.value = j27;
                            int m18 = gq4.v.Bi().m();
                            gq4.a t17 = gq4.v.Bi().t(context5, pString, pBool, pBool2, pInt, pLong, ((y03.e) i95.n0.c(y03.e.class)).pd(intent));
                            if (t17 != null) {
                                jq4.c1 c1Var = h2Var.f176581x;
                                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(t17);
                                c1Var.getClass();
                                c1Var.C = weakReference;
                                z29 = false;
                                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.model.p2(h2Var, j27, context5, intent, m18, z37, str4));
                            } else {
                                z29 = false;
                            }
                            if (mx3.f0.j() && fp.e0.g()) {
                                com.tencent.mm.sdk.platformtools.x2.f193071a.grantUriPermission("com.android.systemui", com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.vfs.r6.j(new java.io.File(mx3.i0.j(str4).h()))), 1);
                            }
                            rq4.u.f399109a.c(z29, z38);
                            h2Var.E(7);
                            if (!z38 && !com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.isForeground()) {
                                ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).aj(j27);
                            }
                        } else {
                            z29 = false;
                        }
                    }
                    h2Var.f176582y = z29;
                    mg0.a wi6 = ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).wi(java.lang.String.valueOf(j27));
                    if (wi6 != null) {
                        wi6.a();
                    }
                    ((tf0.a) ((uf0.e) i95.n0.c(uf0.e.class))).wi(context5, intent, remoteViews, str3, intent.getComponent().getClassName(), true, mx3.i0.h(str4), true, true);
                    if (mx3.f0.j()) {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.grantUriPermission("com.android.systemui", com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.vfs.r6.j(new java.io.File(mx3.i0.j(str4).h()))), 1);
                    }
                    rq4.u.f399109a.c(z29, z38);
                    h2Var.E(7);
                    if (!z38) {
                        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).aj(j27);
                    }
                } else {
                    h2Var.G();
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "current room is exit %s", java.lang.Long.valueOf(j19));
                }
                return null;
            }
        });
    }

    public void N(android.content.Context context, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "startVoiceCall, toUser:" + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (java.lang.System.currentTimeMillis() - this.f176566i >= 2000 || java.lang.System.currentTimeMillis() - this.f176566i <= 0) {
            if (java.lang.System.currentTimeMillis() - this.f176569l < this.f176570m && java.lang.System.currentTimeMillis() - this.f176569l > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
                db5.e1.m(context, com.tencent.mm.R.string.kd9, com.tencent.mm.R.string.kdo, null);
                return;
            }
            this.f176566i = java.lang.System.currentTimeMillis();
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true) == null) {
                return;
            }
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).o2()) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                u1Var.g(context.getString(com.tencent.mm.R.string.kcr));
                u1Var.n(context.getString(com.tencent.mm.R.string.f490454vi));
                u1Var.l(new com.tencent.mm.plugin.voip.model.h2$$b());
                u1Var.q(false);
                return;
            }
            com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176558a.f176411a;
            if (2 != g1Var.f176510b) {
                g1Var.f176510b = 2;
            }
            ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).Ai(java.lang.String.valueOf(n()), 1);
            M(context, str, n(), true, false, false);
            com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
            voipEvent.f54945g.f8415b = 7;
            voipEvent.e();
        }
    }

    public void O(int i17, boolean z17) {
        this.f176558a.f176411a.I(i17, z17);
    }

    public int P(boolean z17) {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176558a.f176411a.f176532x;
        int C = z17 ? v2protocalVar.C(412) : v2protocalVar.C(413);
        if (C < 0) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "voipContext tryMuteMicrophone ret:" + C);
        }
        return C;
    }

    public int Q(boolean z17) {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176558a.f176411a.f176532x;
        int C = z17 ? v2protocalVar.C(401) : v2protocalVar.C(402);
        if (C < 0) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "voipContext trySwitchSpeakerPhone ret:" + C);
        }
        return C;
    }

    public void R() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "unRegister and remove all notification and voip foreground service");
        gq4.v.Bi().I(false, this.f176563f, this.f176558a.f176431u);
        if (!this.f176561d) {
            vq4.z zVar = this.D;
            if (zVar != null) {
                ((vq4.m0) zVar).j();
                ((vq4.m0) this.D).f();
                this.D = null;
            }
            dr4.p1 p1Var = this.E;
            if (p1Var != null) {
                p1Var.n();
                this.E = null;
            }
        }
        boolean z17 = true;
        this.f176582y = true;
        rq4.s sVar = rq4.s.f399098a;
        rq4.r rVar = rq4.s.f399100c;
        if (rVar.f399096d == 1) {
            rVar.f399093a = 1;
            rVar.f399097e = java.lang.System.currentTimeMillis() - rq4.s.f399099b;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.h2$$a
            @Override // java.lang.Runnable
            public final void run() {
                jq4.c1 c1Var = com.tencent.mm.plugin.voip.model.h2.this.f176581x;
                c1Var.getClass();
                jq4.z0.c(c1Var, false, false, false, 7, null);
            }
        });
        this.f176564g = false;
        this.f176580w = 0L;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipService", "unbindVoiceServiceIfNeed", new java.lang.Object[0]);
        if (fp.h.c(26)) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.voip.widget.VoipNewForegroundService.class);
                com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipService", e17, "unBind vidoeforeground error: %s", e17.getMessage());
                z17 = false;
            }
            if (z17) {
                this.f176575r = false;
            }
        }
        G();
        E(11);
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(40);
        nq4.f.f339014a.d();
    }

    public int a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        com.tencent.mm.sdk.platformtools.b4 b4Var = d3Var.f176435y;
        if (b4Var != null) {
            vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "devincdai: voip reset timecount");
            b4Var.d();
            b4Var.c(60000L, 60000L);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = d3Var.D;
        if (!b4Var2.e()) {
            b4Var2.d();
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        com.tencent.mm.plugin.voip.model.l1 l1Var = g1Var.f176532x.M1;
        l1Var.getClass();
        l1Var.S = java.lang.System.currentTimeMillis();
        vq4.d0.a("MicroMsg.VoipDailReport", "devin:acceptCallTime:" + l1Var.S);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "accept onlyAudio:" + z17);
        if (g1Var.f176508a == 3) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
            if (v2protocalVar.f176877q != 0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                g1Var.f(linkedList);
                v2protocalVar.f176884s0 += "|answer:" + v2protocalVar.f176869n0 + ":" + v2protocalVar.f176872o0;
                vq4.d0.a("MicroMsg.Voip.VoipServiceEx", fp.k.c() + "accept invite, roomid:" + v2protocalVar.f176877q + " nic list size:" + linkedList.size());
                d3Var.C.c(50000L, 50000L);
                com.tencent.mm.plugin.voip.model.l1 l1Var2 = v2protocalVar.M1;
                l1Var2.a();
                mq4.g gVar = new mq4.g(1, v2protocalVar.f176847g, v2protocalVar.f176877q, v2protocalVar.field_peerId, v2protocalVar.field_capInfo, v2protocalVar.f176883s, z17, z18, linkedList);
                l1Var2.getClass();
                l1Var2.M = java.lang.System.currentTimeMillis();
                if (v2protocalVar.f176879q1) {
                    g1Var.y(1);
                    com.tencent.mm.sdk.platformtools.b4 b4Var3 = d3Var.f176436z;
                    if (!b4Var3.e()) {
                        b4Var3.d();
                    }
                    long j17 = v2protocalVar.f176882r1 * 1000;
                    b4Var3.c(j17, j17);
                }
                gVar.L();
                g1Var.D(4);
                g1Var.A.f176648c = 1;
                g1Var.f176515g = true;
                return 0;
            }
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to accept with roomid = 0. ");
        } else {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to accept with calling, status =" + g1Var.f176508a);
        }
        return -1;
    }

    public void b(java.lang.String str, boolean z17, boolean z18, long j17) {
        boolean z19 = false;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipService", "bindVoipForegroundIfNeed", new java.lang.Object[0]);
        if (!fp.h.c(26) || this.f176575r) {
            return;
        }
        if (z17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
                return;
            }
        }
        if (!z17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.RECORD_AUDIO")) {
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("isRecalled", z18);
        intent.putExtra("Voip_User", str);
        intent.putExtra("Voip_CallRoomKey", j17);
        intent.putExtra("Voip_VideoCall", z17);
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.voip.widget.VoipNewForegroundService.class);
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent);
            z19 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipService", e17, "using start foreground service to bindVoipForegroundIfNeed error: %s", e17.getMessage());
        }
        if (z19) {
            this.f176575r = true;
        }
    }

    public int c() {
        rq4.q qVar = rq4.q.f399067a;
        rq4.q.f399070d = rq4.o.f399062i;
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelCallByPhoneInter, roomId:");
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        sb6.append(g1Var.f176532x.f176877q);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", sb6.toString());
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        if (v2protocalVar.f176877q == 0) {
            return -1;
        }
        com.tencent.mm.plugin.voip.model.l1 l1Var = v2protocalVar.M1;
        l1Var.f176713a = 102;
        l1Var.f176726m = 6;
        if (gq4.v.Bi().f176559b != null) {
            v2protocalVar.M1.Z = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).P;
            v2protocalVar.M1.X = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).M / 1000;
            v2protocalVar.M1.Y = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).N / 1000;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11521, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return d3Var.b(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if ((r14 == 2) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(java.lang.String r13, int r14) {
        /*
            r12 = this;
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_voip_newsimulcall_switch
            h62.d r0 = (h62.d) r0
            r2 = 0
            boolean r0 = r0.fj(r1, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "danial:[simucall]checkSimulBeforeCall bNewSimulCallSwitch:%b "
            java.lang.String r4 = "MicroMsg.Voip.VoipService"
            com.tencent.mars.xlog.Log.i(r4, r3, r1)
            if (r0 == 0) goto L7e
            com.tencent.mm.plugin.voip.model.d3 r0 = r12.f176558a
            r7 = 0
            r9 = -1
            r10 = -1
            r5 = r12
            r6 = r13
            r8 = r14
            int r13 = r5.g(r6, r7, r8, r9, r10)
            r0.f176418h = r13
            com.tencent.mm.plugin.voip.model.d3 r13 = r12.f176558a
            int r14 = r13.f176418h
            r0 = 1
            if (r14 != r0) goto L3a
            r1 = r0
            goto L3b
        L3a:
            r1 = r2
        L3b:
            if (r1 != 0) goto L45
            r1 = 2
            if (r14 != r1) goto L42
            r14 = r0
            goto L43
        L42:
            r14 = r2
        L43:
            if (r14 == 0) goto L7e
        L45:
            int r13 = r13.f176419i
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.tencent.mm.plugin.voip.model.d3 r14 = r12.f176558a
            int r14 = r14.f176418h
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r14}
            java.lang.String r14 = "danial[simucall]giveup call-out, turn to auto-accept call-in! finalroomType:%d, simuCallRole:%d"
            com.tencent.mars.xlog.Log.i(r4, r14, r13)
            com.tencent.mm.plugin.voip.model.d3 r13 = r12.f176558a
            com.tencent.mm.plugin.voip.model.g1 r13 = r13.f176411a
            com.tencent.mm.plugin.voip.model.v2protocal r13 = r13.f176532x
            boolean r14 = r13.Q1
            if (r14 != 0) goto L72
            int r13 = r13.z()
            if (r13 >= 0) goto L72
            java.lang.String r13 = "Failed to init v2protocol."
            vq4.d0.b(r4, r13)
            return r2
        L72:
            com.tencent.mm.plugin.voip.model.d3 r13 = r12.f176558a
            com.tencent.mm.plugin.voip.model.g1 r14 = r13.f176411a
            com.tencent.mm.plugin.voip.model.k3 r14 = r14.f176534z
            int r13 = r13.f176419i
            r14.C(r13)
            return r0
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.h2.d(java.lang.String, int):boolean");
    }

    public int e(int i17, long j17, int i18) {
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        int i19 = -1;
        if (d3Var.f176411a.p()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "steve:[simucall] try to cancel my invite due to Simulcall(callee), roomId:%s, roomKey:%s, roomType:%d, inviteId:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d3Var.f176411a.f176532x.f176886t));
            synchronized (d3Var.f176412b) {
                if (i17 != 0) {
                    if (d3Var.f176411a.f176532x.f176886t != 0) {
                        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.voip.model.j0.h(i17));
                        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = d3Var.f176411a.f176532x;
                        new mq4.i(i17, j17, v2protocalVar.f176853i, "", v2protocalVar.f176886t, 2, currentTimeMillis, v2protocalVar.f176828J).L();
                        i19 = 0;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11521, true, true, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "steve:[simucall] voipcancelinvite sent!");
                    }
                }
                vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "steve:[simucall] Failed to cancel call with roomid = 0 and inviteId = 0 ");
            }
        } else {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "steve:[simucall]Failed to cancel call ,as not in calling.");
        }
        return i19;
    }

    public void f(android.content.Context context, com.tencent.mm.plugin.voip.model.k3 k3Var) {
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176558a.f176411a;
        if (context != g1Var.f176533y || k3Var != g1Var.f176534z) {
            vq4.d0.a("MicroMsg.Voip.VoipServiceEx", "cannot detach other's ui.");
            return;
        }
        g1Var.f176533y = null;
        g1Var.f176534z = com.tencent.mm.plugin.voip.model.k3.A0;
        vq4.d0.a("MicroMsg.Voip.VoipServiceEx", "detach ui........");
    }

    public void finalize() {
        vq4.z zVar = this.D;
        if (zVar != null) {
            ((vq4.m0) zVar).j();
            ((vq4.m0) this.D).f();
            this.D = null;
        }
        dr4.p1 p1Var = this.E;
        if (p1Var != null) {
            p1Var.n();
            this.E = null;
        }
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        d3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "stop");
        d3Var.n();
        d3Var.f176411a.getClass();
        this.f176558a = null;
        this.f176564g = false;
        gm0.j1.n().d(this.A);
        ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Vi(2, this.B);
        super.finalize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int g(java.lang.String str, boolean z17, int i17, int i18, long j17) {
        com.tencent.mm.plugin.voip.model.a3 a3Var;
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        int i27;
        java.lang.String r17 = c01.z1.r();
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        com.tencent.mm.plugin.voip.model.a3 a3Var2 = d3Var.f176421k;
        if (a3Var2 != null && (a3Var = d3Var.f176420j) != null) {
            if (z17) {
                a3Var2.a();
                com.tencent.mm.plugin.voip.model.a3 a3Var3 = this.f176558a.f176421k;
                a3Var3.f176332a = str;
                a3Var3.f176333b = r17;
                a3Var3.f176334c = i17;
                a3Var3.f176335d = i18;
                a3Var3.f176336e = j17;
            } else {
                a3Var.a();
                com.tencent.mm.plugin.voip.model.a3 a3Var4 = this.f176558a.f176420j;
                a3Var4.f176332a = r17;
                a3Var4.f176333b = str;
                a3Var4.f176334c = i17;
                a3Var4.f176335d = i18;
                a3Var4.f176336e = j17;
            }
            if (z17) {
                str3 = this.f176558a.f176420j.f176333b;
                str2 = str;
            } else {
                str2 = this.f176558a.f176421k.f176332a;
                str3 = str;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "danial:[simucall] isCallin %b, myname:%s, remoteName:%s, inviteType:%d, roomid:%d", java.lang.Boolean.valueOf(z17), r17, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (str2 != null && str3 != null) {
                boolean equals = str3.equals(str2);
                if (this.f176558a.f176411a == null) {
                    return -1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall]  mutualCalling:%s", java.lang.Boolean.valueOf(equals));
                if (!equals) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall] myInviteName:%s, mutualCalling:%s", str3, java.lang.Boolean.valueOf(equals));
                    return -1;
                }
                if (this.f176559b == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "mVoipMgr is null");
                    return -1;
                }
                this.f176558a.f176417g = true;
                int i28 = (str3.compareTo(r17) < 0 || str3.contains("@")) ? 1 : 2;
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "danialguo: callout and setmyself callee");
                    i28 = 2;
                }
                com.tencent.mm.plugin.voip.model.d3 d3Var2 = this.f176558a;
                d3Var2.f176411a.f176532x.N1 |= 2;
                if (z17) {
                    i19 = !((com.tencent.mm.plugin.voip.model.d0) this.f176559b).f176388s ? 1 : 0;
                } else {
                    i17 = d3Var2.f176421k.f176334c;
                    i19 = i17;
                }
                int i29 = (i17 == 1 || i19 == 1) ? 1 : 0;
                if (((com.tencent.mm.plugin.voip.model.d0) this.f176559b).f176388s && i29 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall]audio room, close camera first! myInviteType:%d, finalRoomType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i29));
                    this.f176558a.f176432v = false;
                    H();
                    this.f176558a.f176411a.f176534z.O(1);
                }
                com.tencent.mm.plugin.voip.model.d3 d3Var3 = this.f176558a;
                d3Var3.f176419i = i29;
                d3Var3.f176411a.f176532x.f176828J = i29;
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall]myInviteName:%s, mutualCalling:%s,caller:%d,myInviteType:%d,finalType:%d", str3, java.lang.Boolean.valueOf(equals), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i29));
                if (i28 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall] i'm callee, cancel my previous invite!");
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176558a.f176411a.f176532x;
                    if (v2protocalVar != null && (i27 = v2protocalVar.f176877q) != 0) {
                        long j18 = v2protocalVar.f176883s;
                        if (j18 != 0 && i27 != i18) {
                            e(i27, j18, i19);
                        }
                    }
                    this.f176559b.e0(false, i29 ^ 1);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall] i'm caller, do NOT answer others' invite!");
                }
                return i28;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "steve:[simucall] name null! myname:%s, remoteInviteName:%s, myInviteName:%s", r17, str2, str3);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public void h(r45.r27 r27Var) {
        int i17;
        boolean z17;
        ?? r142;
        if (this.f176558a.f176411a.f176532x.N1 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall]doTaskCallin simulcall already processed, return! VoipGetRoomInfoResp roomid:%d, roomType:%d, mProtocol.roomId:%d, iSimulCallStatus:%d ", java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Integer.valueOf(r27Var.f384495m), java.lang.Integer.valueOf(this.f176558a.f176411a.f176532x.f176877q), java.lang.Integer.valueOf(this.f176558a.f176411a.f176532x.N1));
            return;
        }
        int i18 = r27Var.f384495m;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_newsimulcall_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall]doTaskCallin bNewSimulCallSwitch:%b ", java.lang.Boolean.valueOf(fj6));
        if (fj6) {
            this.f176558a.f176418h = g(r27Var.f384494i, true, r27Var.f384495m, r27Var.f384489d, r27Var.f384490e);
            com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
            if (d3Var.f176417g) {
                r27Var.f384495m = d3Var.f176419i;
            }
        }
        com.tencent.mm.plugin.voip.model.d3 d3Var2 = this.f176558a;
        if (d3Var2.f176418h == 1) {
            if (!d3Var2.f176411a.E) {
                d3Var2.d(r27Var.f384489d, r27Var.f384490e, 5, null, null, r27Var.f384494i);
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall]doTaskCallin simulcall caller send ack roomid:%d, finalRoomType:%d, orgRoomType:%d ", java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Integer.valueOf(r27Var.f384495m), java.lang.Integer.valueOf(i18));
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11525, true, true, java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(i18), 6, java.lang.Integer.valueOf(vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        if (!ip.b.t() && !com.tencent.mm.app.w.INSTANCE.f53889n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
            if (this.f176576s == null && this.C.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "voipGetRoomInfoResp is null and time is stopped.");
                this.f176576s = r27Var;
                this.f176558a.f176411a.D = r27Var;
                this.C.c(2000L, 2000L);
                this.f176577t = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:voip roominfo stored!! roomid:%d, roomkey:%s, time:%d", java.lang.Integer.valueOf(this.f176576s.f384489d), java.lang.Long.valueOf(this.f176576s.f384490e), java.lang.Integer.valueOf(this.f176576s.f384491f));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 4L, 1L, false);
                vq4.d0.i(0);
                return;
            }
            return;
        }
        java.lang.String str = r27Var.f384494i;
        java.lang.String r17 = c01.z1.r();
        int i19 = r27Var.f384495m;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "doTaskCallin self:%s talker:%s type:%d roomid:%d, roomkey:%s, time:%d", r17, str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384491f));
        com.tencent.mm.plugin.voip.model.d3 d3Var3 = this.f176558a;
        d3Var3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "isOutCallReady");
        if (((d3Var3.f176411a.f176510b == 2) && d3Var3.f176433w) || (this.f176558a.f176411a.p() && !this.f176558a.f176417g)) {
            if (this.f176558a.e() != r27Var.f384489d) {
                long f17 = this.f176558a.f();
                long j17 = r27Var.f384490e;
                if (f17 != j17) {
                    r45.r27 r27Var2 = this.f176583z.f176760n;
                    int i27 = r27Var2 != null ? r27Var2.f384489d : 0;
                    int i28 = r27Var.f384489d;
                    if (i27 != i28) {
                        if ((r27Var2 != null ? r27Var2.f384490e : 0L) != j17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "doTaskCallIn processing, response busy, %s %s", java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(r27Var.f384490e));
                            this.f176558a.d(r27Var.f384489d, r27Var.f384490e, 2, null, null, str);
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because voip busy:roomid " + r27Var.f384489d);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.r(11525, true, true, java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384495m), 2, java.lang.Integer.valueOf(vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var.r(11526, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 7);
            vq4.d0.i(0);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.l5.Bi()) {
            this.f176558a.d(r27Var.f384489d, r27Var.f384490e, 3, null, null, str);
            com.tencent.mm.plugin.voip.model.d3 d3Var4 = this.f176558a;
            d3Var4.f176411a.f176532x.M1.f176732s = 4;
            d3Var4.l(6, 0, "", 0, null);
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because telephone busy:roomid " + r27Var.f384489d);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.r(11525, true, true, java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384495m), 3, java.lang.Integer.valueOf(vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var2.r(11526, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 7);
            vq4.d0.i(0);
            return;
        }
        this.f176558a.c();
        com.tencent.mm.plugin.voip.model.d3 d3Var5 = this.f176558a;
        if (d3Var5.f176418h == 2) {
            com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var5.f176411a;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
            if (v2protocalVar.f176877q != r27Var.f384489d) {
                g1Var.f176516h = true;
                g1Var.f176518j = false;
                g1Var.f176517i = false;
                v2protocalVar.L0 = 0;
                v2protocalVar.K0 = 0;
                g1Var.D(3);
                com.tencent.mm.plugin.voip.model.g1 g1Var2 = this.f176558a.f176411a;
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var2.f176532x;
                v2protocalVar2.f176877q = r27Var.f384489d;
                v2protocalVar2.f176883s = r27Var.f384490e;
                v2protocalVar2.f176828J = r27Var.f384495m;
                v2protocalVar2.f176880r = 1;
                g1Var2.D = r27Var;
                if (!g1Var2.E) {
                    g1Var2.f176534z.C(i19);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:[simucall]doTaskCallin simulcall callee, auto accept! mProtocol.roomId=%d, roomInfo.roomId=%d", java.lang.Integer.valueOf(this.f176558a.f176411a.f176532x.f176877q), java.lang.Integer.valueOf(r27Var.f384489d));
                }
                com.tencent.mm.plugin.voip.model.k0 z18 = z();
                com.tencent.mm.plugin.voip.model.j0 j0Var = com.tencent.mm.plugin.voip.model.j0.f176682a;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "updateRoomInfo: " + z18);
                com.tencent.mm.plugin.voip.model.k0 k0Var = new com.tencent.mm.plugin.voip.model.k0(0L, z18.f176690b, z18.f176691c, z18.f176692d, z18.f176693e, z18.f176694f);
                com.tencent.mm.plugin.voip.model.j0 j0Var2 = com.tencent.mm.plugin.voip.model.j0.f176682a;
                dm.sb f18 = j0Var2.f(k0Var);
                if (f18 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateRoomInfo: update roomid from ");
                    sb6.append(f18.Q0());
                    sb6.append(" to ");
                    long j18 = z18.f176689a;
                    sb6.append(j18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", sb6.toString());
                    f18.q1(j18);
                    f18.r1(z18.f176690b);
                    f18.p1(!z18.f176693e ? 1 : 0);
                    j0Var2.t(f18);
                    return;
                }
                return;
            }
            return;
        }
        if (!d3Var5.p(r27Var)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "doTaskCallin setInviteContent failed!");
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.r(11525, true, true, java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384495m), 5, java.lang.Integer.valueOf(vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var3.r(11526, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 7);
            vq4.d0.i(0);
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true) == null) {
            this.f176558a.d(r27Var.f384489d, r27Var.f384490e, 4, null, null, str);
            this.f176558a.l(6, 0, "", 0, null);
            int i29 = r27Var.f384489d;
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var4.r(11525, true, true, java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384495m), 4, java.lang.Integer.valueOf(vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var4.r(11526, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 7);
            vq4.d0.i(0);
            return;
        }
        if (1 == i19 || i19 == 0) {
            try {
                i17 = 11525;
                z17 = true;
                try {
                    M(context, str, this.f176558a.f(), false, i19 == 0, true);
                    com.tencent.mm.plugin.voip.model.d3 d3Var6 = this.f176558a;
                    r142 = true;
                    if (d3Var6 != null) {
                        d3Var6.f176413c = r27Var.f384489d;
                        com.tencent.mm.sdk.platformtools.b4 b4Var = d3Var6.D;
                        if (!b4Var.e()) {
                            b4Var.d();
                        }
                        b4Var.c(70000L, 70000L);
                        r142 = true;
                    }
                } catch (java.lang.Exception unused) {
                    vq4.d0.i(2);
                    r142 = z17;
                    com.tencent.mm.plugin.voip.model.d3 d3Var7 = this.f176558a;
                    int i37 = r27Var.f384489d;
                    long j19 = r27Var.f384490e;
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = d3Var7.f176411a.f176532x;
                    d3Var7.d(i37, j19, 1, v2protocalVar3.field_peerId, v2protocalVar3.field_capInfo, str);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.r(i17, r142, r142, java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384495m), java.lang.Integer.valueOf((int) r142), java.lang.Integer.valueOf(vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                }
            } catch (java.lang.Exception unused2) {
                i17 = 11525;
                z17 = true;
            }
        } else {
            i17 = 11525;
            r142 = 1;
        }
        com.tencent.mm.plugin.voip.model.d3 d3Var72 = this.f176558a;
        int i372 = r27Var.f384489d;
        long j192 = r27Var.f384490e;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar32 = d3Var72.f176411a.f176532x;
        d3Var72.d(i372, j192, 1, v2protocalVar32.field_peerId, v2protocalVar32.field_capInfo, str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.r(i17, r142, r142, java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384495m), java.lang.Integer.valueOf((int) r142), java.lang.Integer.valueOf(vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public int i(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, int i28, boolean z17) {
        java.nio.ByteBuffer byteBuffer2;
        int i29;
        int i37;
        int a17;
        int i38;
        int i39;
        com.tencent.mm.plugin.voip.model.i1 i1Var = this.f176558a.f176411a.A;
        if (i1Var.f176648c != 2 || !i1Var.f176649d.t()) {
            return 0;
        }
        if (i19 == 1 || i27 == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipDeviceHandler", "error w and h param! w: " + i19 + ", h: " + i27);
            return 0;
        }
        i1Var.f176649d.f176532x.A1++;
        if (i1Var.f176656k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "steve: StopHWEnc!!!");
            com.tencent.mm.plugin.voip.model.g1 g1Var = i1Var.f176649d;
            g1Var.f176532x.W1 = false;
            i1Var.f176655j = false;
            i1Var.f176656k = false;
            if (g1Var.N) {
                g1Var.x(1);
            }
            i1Var.f176649d.b(8, true, true);
            i1Var.f176649d.b(4, true, true);
        }
        boolean z18 = i1Var.f176655j;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = i1Var.f176649d.f176532x;
        if (!v2protocalVar.W1 || v2protocalVar.R1 == null) {
            i1Var.f176655j = false;
        } else {
            if (!z17) {
                i1Var.f176649d.f176532x.R1.b();
            }
            boolean equalsIgnoreCase = i1Var.f176649d.f176532x.R1.f176618c.equalsIgnoreCase("video/avc");
            boolean equalsIgnoreCase2 = i1Var.f176649d.f176532x.R1.f176618c.equalsIgnoreCase("video/hevc");
            i1Var.f176660o = equalsIgnoreCase;
            i1Var.f176659n = equalsIgnoreCase2;
            boolean z19 = 1 == (i1Var.f176649d.f176532x.R1.C.f176547j & 1);
            i1Var.f176655j = (equalsIgnoreCase2 && z19) || (equalsIgnoreCase && z19 && i1Var.f176649d.f176532x.R1.C.f176546i >= 6);
        }
        vq4.a0.f439264a.a(!i1Var.f176655j);
        if (z18 && !i1Var.f176655j && i1Var.f176649d.f176532x.R1 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "StopThread, oldHWEncUsing: " + z18 + ", mIsHWEncUsing: " + i1Var.f176655j);
            i1Var.f176649d.f176532x.R1.f();
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = i1Var.f176649d.f176532x;
        int i47 = v2protocalVar2.f176829a;
        int i48 = v2protocalVar2.f176832b;
        if (i19 > i47) {
            i47 = i19;
        }
        v2protocalVar2.f176829a = i47;
        if (i19 > i48) {
            i48 = i27;
        }
        v2protocalVar2.f176832b = i48;
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = i1Var.f176649d.f176532x;
        int i49 = v2protocalVar3.A1;
        if (!i1Var.f176655j || v2protocalVar3.R1 == null) {
            if (i19 <= 1 || i27 <= 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipDeviceHandler", "error w and h param! w: " + i19 + ", h: " + i27);
                return 0;
            }
            int i57 = i1Var.f176661p;
            if ((i57 >> 8) != 0) {
                int i58 = i57 & (-257);
                i1Var.f176661p = i58;
                i1Var.f176649d.f176534z.B(i58);
            }
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            if (i28 == 2) {
                java.nio.ByteBuffer byteBuffer3 = i1Var.W;
                if (byteBuffer3 == null || byteBuffer3.capacity() < byteBuffer.capacity()) {
                    i1Var.W = java.nio.ByteBuffer.allocateDirect(byteBuffer.capacity());
                }
                i1Var.W.clear();
                byteBuffer.clear();
                i1Var.W.put(byteBuffer).rewind();
                byteBuffer2 = i1Var.W;
            } else {
                byteBuffer2 = byteBuffer;
            }
            if (byteBuffer2 != null) {
                return i1Var.f176649d.f176532x.videoEncodeToSend2(byteBuffer2, i17, i19, i27, i18);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipDeviceHandler", "in put buffer is null!");
            return 0;
        }
        int i59 = i1Var.f176661p;
        if (1 != (i59 >> 8)) {
            int i66 = i59 | 256;
            i1Var.f176661p = i66;
            i1Var.f176649d.f176534z.B(i66);
        }
        if (i1Var.f176649d.f176532x.R1 == null) {
            return 0;
        }
        if (i28 == 1) {
            if (z17) {
                i38 = i1Var.f176649d.f176532x.R1.F;
                i39 = i1Var.f176649d.f176532x.R1.G;
            } else {
                if (i19 <= 1 || i27 <= 1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipDeviceHandler", "error w and h param! w: " + i19 + ", h: " + i27);
                    return 0;
                }
                i38 = i19;
                i39 = i27;
            }
            a17 = i1Var.f176649d.f176532x.R1.a(byteBuffer, i38, i39, i18, false);
        } else if (i28 == 2) {
            a17 = 0;
        } else {
            if (z17) {
                i29 = i1Var.f176649d.f176532x.R1.F;
                i37 = i1Var.f176649d.f176532x.R1.G;
            } else {
                if (i19 <= 1 || i27 <= 1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipDeviceHandler", "error w and h param! w: " + i19 + ", h: " + i27);
                    return 0;
                }
                i29 = i19;
                i37 = i27;
            }
            a17 = i1Var.f176649d.f176532x.R1.a(byteBuffer, i29, i37, i18, true);
        }
        i1Var.W = null;
        if (a17 >= 0) {
            return 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "StopHWEnc!! hw encoder error: " + a17 + "old:" + i1Var.f176649d.N);
        com.tencent.mm.plugin.voip.model.g1 g1Var2 = i1Var.f176649d;
        if (g1Var2.N) {
            g1Var2.x(1);
        }
        if (i1Var.f176660o) {
            i1Var.f176657l = true;
            i1Var.f176649d.b(8, true, true);
            return 0;
        }
        if (i1Var.f176659n) {
            i1Var.f176658m = true;
            i1Var.f176649d.b(4, true, true);
            return 0;
        }
        if (!i1Var.f176657l || !i1Var.f176658m) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "steve: StopHWEnc!!!");
        i1Var.f176649d.f176532x.W1 = false;
        i1Var.f176655j = false;
        i1Var.f176656k = false;
        return 0;
    }

    public void k() {
        this.f176558a.f176411a.A.a();
    }

    public pq4.c l(java.lang.String type) {
        if (!vq4.b0.f439280k) {
            qq4.b wi6 = gq4.v.wi();
            wi6.getClass();
            kotlin.jvm.internal.o.g(type, "type");
            return (pq4.c) wi6.f365978l.get(type);
        }
        dr4.p1 p1Var = this.E;
        if (p1Var == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipService", "current mVoipRenderMgr is null", new java.lang.Object[0]);
            return null;
        }
        p1Var.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        pq4.c cVar = (pq4.c) p1Var.B.get(type + '_' + p1Var.C);
        if (cVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "gainThread " + type + " is null");
        }
        return cVar;
    }

    public int m() {
        return this.f176558a.e();
    }

    public long n() {
        return this.f176558a.f();
    }

    public long o() {
        return this.f176558a.f176411a.f176532x.f176828J;
    }

    public float p(boolean z17) {
        try {
            com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
            byte[] bArr = z17 ? Bi.f176558a.f176411a.f176532x.field_capInfo : Bi.f176558a.f176411a.f176532x.f176892v;
            if (bArr == null) {
                return 0.74766356f;
            }
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
            if (wrap.getInt() > 65535) {
                wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            }
            wrap.getShort();
            wrap.getShort();
            float f17 = wrap.getInt() / 100.0f;
            if (f17 != 0.0f) {
                return f17;
            }
            return 0.74766356f;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "update failed: " + e17.getMessage());
            return 0.74766356f;
        }
    }

    public gq4.a q() {
        return this.f176559b;
    }

    public int r() {
        int i17;
        rq4.q qVar = rq4.q.f399067a;
        rq4.q.f399070d = rq4.o.f399058e;
        rq4.u uVar = rq4.u.f399109a;
        rq4.u.f399116h = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        d3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "hangUp");
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        if (v2protocalVar.f176877q == 0) {
            g1Var.A.j();
            g1Var.i();
            d3Var.n();
        } else {
            int i18 = g1Var.f176508a;
            if (i18 == 1) {
                i17 = 0;
            } else {
                i17 = 2;
                if (i18 == 2 || i18 == 3) {
                    i17 = 1;
                } else if (i18 != 4) {
                    i17 = 3;
                }
            }
            v2protocalVar.M1.f176713a = i17;
            d3Var.g(1);
        }
        return 0;
    }

    public int s(int i17) {
        rq4.q qVar = rq4.q.f399067a;
        rq4.q.f399070d = rq4.o.f399062i;
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        d3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "hangUpByPhoneInter");
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        if (v2protocalVar.f176877q == 0) {
            g1Var.A.j();
            d3Var.n();
        } else {
            com.tencent.mm.plugin.voip.model.l1 l1Var = v2protocalVar.M1;
            l1Var.f176713a = 109;
            l1Var.f176732s = i17;
            d3Var.g(5);
        }
        com.tencent.mm.plugin.voip.model.c0 c0Var = this.f176583z;
        c0Var.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.VoipIncomingCallManager", "hangUpByPhoneOrAppInter, interType:" + i17);
        jq4.z0.c(c0Var.f176753d, true, false, false, 2, null);
        c0Var.v();
        return 0;
    }

    public gq4.a t(android.content.Context context, com.tencent.mm.pointers.PString pString, com.tencent.mm.pointers.PBool pBool, com.tencent.mm.pointers.PBool pBool2, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PLong pLong, java.lang.String str) {
        java.lang.String str2;
        if (this.f176559b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "voipMgr is not null");
            gq4.a aVar = this.f176559b;
            com.tencent.mm.plugin.voip.model.d0 d0Var = (com.tencent.mm.plugin.voip.model.d0) aVar;
            pString.value = d0Var.f176383p;
            pBool.value = d0Var.f176387r;
            pBool2.value = d0Var.f176388s;
            pInt.value = aVar.c0();
            return this.f176559b;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "pToUser before is %s and after is %s", pString.value, this.f176558a.f176431u);
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        java.lang.String str3 = d3Var.f176431u;
        pString.value = str3;
        pBool2.value = d3Var.f176432v;
        if (str3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "username is null, can't start voip");
            return null;
        }
        if (pBool.value || d3Var.f176411a.p()) {
            ((y03.e) i95.n0.c(y03.e.class)).W9(str);
            gq4.a aVar2 = this.f176559b;
            if (aVar2 == null) {
                throw new java.lang.IllegalStateException("setMgr() should be called in createVoIPMgr()");
            }
            aVar2.f0(context, pString.value, pBool.value, pBool2.value, pLong.value);
            this.f176561d = true;
            return this.f176559b;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "is out call, but kenerl is not working");
        java.lang.String str4 = pString.value;
        if (pBool2.value) {
            int i17 = com.tencent.mm.storage.f9.f193926r2;
            str2 = "voip_content_video";
        } else {
            int i18 = com.tencent.mm.storage.f9.f193926r2;
            str2 = "voip_content_voice";
        }
        boolean z17 = pBool.value;
        com.tencent.mm.plugin.voip.model.b2.c(str4, str2, z17 ? 1 : 0, 4, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493457ka2));
        return null;
    }

    public boolean u() {
        if (((android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power")) == null) {
            return true;
        }
        return !r0.isInteractive();
    }

    public boolean v() {
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("keyguard");
        if (keyguardManager == null) {
            return true;
        }
        return keyguardManager.inKeyguardRestrictedInputMode();
    }

    public boolean w() {
        com.tencent.mm.plugin.voip.model.g1 g1Var;
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        if (d3Var == null || (g1Var = d3Var.f176411a) == null) {
            return false;
        }
        return g1Var.X;
    }

    public boolean x() {
        vq4.z zVar = this.D;
        if (zVar == null) {
            return true;
        }
        vq4.m0 m0Var = (vq4.m0) zVar;
        return !(m0Var.C || !m0Var.A);
    }

    public final android.graphics.Bitmap y(java.lang.String str) {
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap b17 = com.tencent.mm.modelavatar.g.b(str, false, 20, null);
        return b17 == null ? ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Vi(str, 20) : b17;
    }

    public com.tencent.mm.plugin.voip.model.k0 z() {
        long m17 = m();
        long n17 = n();
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176558a;
        return new com.tencent.mm.plugin.voip.model.k0(m17, n17, r5.f176886t, d3Var.f176411a.f176532x.f176853i, d3Var.f176432v, d3Var.f176433w);
    }
}
