package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class v0 implements com.tencent.mm.modelbase.x0, com.tencent.mm.modelbase.y0, com.tencent.mm.modelbase.z0, com.tencent.mm.modelbase.b1, com.tencent.mm.modelbase.w0, dg0.e, com.tencent.mm.sdk.platformtools.q7, c01.a8 {
    public static com.tencent.mm.ui.chatting.v0 U;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f202760J;
    public gp1.v K;
    public com.tencent.mm.plugin.ball.model.BallInfo L;
    public boolean M;
    public final com.tencent.matrix.lifecycle.h N;
    public final com.tencent.mm.modelbase.a1 P;
    public final com.tencent.mm.sdk.event.IListener Q;
    public final gp1.z R;
    public final com.tencent.mm.sdk.platformtools.n3 S;
    public boolean T;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f202762e;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.c1 f202765h;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f202769o;

    /* renamed from: q, reason: collision with root package name */
    public yb5.d f202771q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.Context f202772r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.ro f202773s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.SensorController f202774t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f202775u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.s7 f202776v;

    /* renamed from: y, reason: collision with root package name */
    public boolean f202779y;

    /* renamed from: z, reason: collision with root package name */
    public int f202780z;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f202761d = com.tencent.mm.sdk.platformtools.o4.R("voice_continue_play_info");

    /* renamed from: f, reason: collision with root package name */
    public w21.u0 f202763f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f202764g = false;

    /* renamed from: i, reason: collision with root package name */
    public long f202766i = -1;

    /* renamed from: m, reason: collision with root package name */
    public long f202767m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f202768n = -1;

    /* renamed from: p, reason: collision with root package name */
    public long f202770p = -1;

    /* renamed from: w, reason: collision with root package name */
    public long f202777w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f202778x = -1;
    public java.lang.String A = "";
    public boolean B = true;
    public boolean C = false;
    public long D = 0;
    public long E = 0;
    public boolean F = false;
    public boolean G = false;
    public float H = 1.0f;
    public final float I = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoicePlaySpeedUpSpeed());

    public v0(yb5.d dVar, com.tencent.mm.ui.chatting.component.ro roVar, java.lang.String str) {
        this.f202760J = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceSpeakerSeek()) == 1;
        this.M = false;
        this.N = new com.tencent.mm.ui.chatting.w0(this);
        this.P = new com.tencent.mm.ui.chatting.x0(this);
        com.tencent.mm.ui.chatting.AutoPlay$3 autoPlay$3 = new com.tencent.mm.ui.chatting.AutoPlay$3(this, com.tencent.mm.app.a0.f53288d);
        this.Q = autoPlay$3;
        this.R = new com.tencent.mm.ui.chatting.z0(this);
        this.S = new com.tencent.mm.ui.chatting.a1(this, android.os.Looper.getMainLooper());
        this.T = false;
        this.f202772r = dVar.g();
        this.f202771q = dVar;
        this.f202773s = roVar;
        if (this.f202774t == null) {
            this.f202774t = new com.tencent.mm.sdk.platformtools.SensorController(this.f202772r.getApplicationContext());
        }
        if (this.f202776v == null) {
            this.f202776v = new com.tencent.mm.sdk.platformtools.s7(this.f202772r.getApplicationContext());
        }
        g(str);
        autoPlay$3.alive();
        com.tencent.mm.booter.b bVar = (com.tencent.mm.booter.b) c01.d9.c();
        bVar.getClass();
        ((java.util.ArrayList) bVar.f63305a).add(this);
    }

    public final void A() {
        final com.tencent.mm.ui.chatting.component.ro roVar = this.f202773s;
        if (roVar != null) {
            if (android.os.Looper.getMainLooper().isCurrentThread()) {
                roVar.u0();
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.v0$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.chatting.component.ro.this.u0();
                }
            });
        }
    }

    public boolean B(long j17) {
        tl.h hVar;
        com.tencent.mm.modelbase.c1 c1Var = this.f202765h;
        if (c1Var == null || (hVar = ((sl.j) c1Var).f409028a) == null) {
            return false;
        }
        return hVar.seek(j17);
    }

    public final void C(final com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (android.os.Looper.getMainLooper().isCurrentThread()) {
            D(ballInfo);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.v0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.chatting.v0.this.D(ballInfo);
            }
        });
    }

    public final void D(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "setBallInfo: " + ballInfo);
        if (ballInfo == null && this.L == null) {
            return;
        }
        if (this.K == null) {
            this.K = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        }
        gp1.v vVar = this.K;
        if (vVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoPlay", "setBallInfo: float ball service is null");
            return;
        }
        android.content.Context context = this.f202772r;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.matrix.lifecycle.h hVar = this.N;
        gp1.z zVar = this.R;
        if (ballInfo != null) {
            if (this.f202766i >= 0) {
                ballInfo.H = 32768;
                android.content.res.Resources resources = context.getResources();
                float f17 = this.H;
                int i17 = com.tencent.mm.R.drawable.czb;
                ballInfo.f93061v = resources.getDrawable(f17 > 1.0f ? com.tencent.mm.R.drawable.czb : com.tencent.mm.R.drawable.cza);
                android.content.res.Resources resources2 = context.getResources();
                if (this.H <= 1.0f) {
                    i17 = com.tencent.mm.R.drawable.cza;
                }
                ballInfo.f93062w = resources2.getDrawable(i17);
            } else {
                ballInfo.H = 65536;
                ballInfo.f93061v = context.getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f3);
                ballInfo.f93062w = context.getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f3);
            }
            if (this.K.t0(ballInfo) != null) {
                this.K.V(ballInfo);
            } else {
                this.K.a0(ballInfo.f93046d, zVar);
                com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(hVar);
                sl.j jVar = (sl.j) this.f202765h;
                jVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "setOnBackPlayInterruptListener() called with: onBackPlayInterruptListener = [" + this + "]");
                jVar.f409034g = this;
                ballInfo.f93048f = 2;
                this.K.u(ballInfo);
                yd5.r.f461152f = true;
            }
        } else if (vVar.t0(this.L) != null) {
            this.K.L(this.L.f93046d, zVar);
            this.K.U(this.L);
            sl.j jVar2 = (sl.j) this.f202765h;
            jVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "setOnBackPlayInterruptListener() called with: onBackPlayInterruptListener = [null]");
            jVar2.f409034g = null;
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(hVar);
        }
        this.L = ballInfo;
    }

    public final void E(long j17) {
        if (this.L != null) {
            this.f202767m = j17;
        } else {
            this.f202767m = -1L;
        }
        this.f202766i = j17;
        if (j17 == -1) {
            this.f202770p = -1L;
        }
    }

    public final void F(boolean z17) {
        yb5.d dVar = this.f202771q;
        if (dVar != null) {
            dVar.e().F0(z17);
        }
    }

    public void G(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.AutoPlay", "speakerOn has been set %s", java.lang.Boolean.valueOf(z17));
        this.f202775u = z17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:61|62|63|(3:98|99|(3:103|94|95))|65|(4:67|(1:69)|74|(1:76))(4:87|(1:93)|94|95)|70|71|74|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(com.tencent.mm.storage.f9 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.v0.H(com.tencent.mm.storage.f9, boolean):void");
    }

    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "stopBackPlay() called");
        C(null);
        this.f202768n = -1L;
        this.f202769o = null;
        com.tencent.mars.xlog.Log.w("MicroMsg.AutoPlay", "destroyBack: ");
        com.tencent.mm.ui.chatting.v0 v0Var = U;
        U = null;
        if (v0Var != null) {
            v0Var.J(true);
            v0Var.r();
        }
    }

    public void J(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "stop play");
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        u();
        com.tencent.mm.modelbase.c1 c1Var = this.f202765h;
        ((sl.j) c1Var).f409037j = true;
        ((sl.j) c1Var).h(false);
        this.f202763f = null;
        I();
    }

    public void K() {
        com.tencent.mm.modelbase.c1 c1Var = this.f202765h;
        if (c1Var == null || !((sl.j) c1Var).c()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "switchSpeaker, isSpeakerOn: %b, isPlaying: %b", java.lang.Boolean.valueOf(this.f202775u), java.lang.Boolean.valueOf(((sl.j) this.f202765h).c()));
        ((sl.j) this.f202765h).f(this.f202775u);
    }

    @Override // com.tencent.mm.modelbase.y0
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AutoPlay", "voice play error");
        J(true);
        s();
    }

    @Override // c01.a8
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "phone or record stop, resume and do nothing");
        this.G = false;
    }

    @Override // com.tencent.mm.modelbase.z0
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AutoPlay", "voice play pause. %b", java.lang.Boolean.valueOf(z17));
        onStop();
    }

    @Override // c01.a8
    public void d() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.AutoPlay", "phone comming or record start, stop play", new java.lang.Object[0]);
        this.G = true;
        if (m()) {
            return;
        }
        J(true);
        h();
        y();
    }

    public void e(int i17) {
        com.tencent.mm.storage.f9 item;
        if (this.f202772r == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoPlay", "context is null");
            return;
        }
        yb5.d dVar = this.f202771q;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoPlay", "add next failed: null mChattingContext");
            return;
        }
        int count = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).getCount();
        if (i17 < 0 || i17 >= count || (item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f202771q.f460708c.a(sb5.z.class))).getItem(i17)) == null) {
            return;
        }
        if (item.g3() && item.A0() == 0 && !w21.x0.n(item) && !w21.x0.o(item)) {
            f(item);
        }
        e(i17 + 1);
    }

    public void f(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        if (!c01.d9.b().E() && this.f202771q != null) {
            if (this.f202762e.isEmpty()) {
                return;
            }
            this.f202762e.clear();
            db5.t7.k(this.f202772r, this.f202771q.f460717l.getContentView());
            return;
        }
        int size = this.f202762e.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((com.tencent.mm.storage.f9) this.f202762e.get(i17)).getMsgId() == f9Var.getMsgId()) {
                return;
            }
        }
        if (this.f202779y || this.f202762e.isEmpty()) {
            this.f202762e.add(f9Var);
        }
        this.f202762e.size();
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public void f1(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSensorEvent, isON:");
        sb6.append(z17);
        sb6.append("  hasSkip:");
        sb6.append(this.T);
        sb6.append(" tick:");
        long j17 = this.f202777w;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
        sb6.append("  lt:");
        sb6.append(this.f202777w);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", sb6.toString());
        if (this.T) {
            this.T = !z17;
            return;
        }
        if (this.f202772r == null) {
            this.f202774t.a();
            return;
        }
        yb5.d dVar = this.f202771q;
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "isScreenOn: %s", java.lang.Boolean.valueOf(dVar != null ? dVar.e().f208650j : false));
        if (!z17) {
            long j18 = this.f202777w;
            if (j18 != -1 && android.os.SystemClock.elapsedRealtime() - j18 > 400) {
                this.T = true;
                return;
            }
        }
        this.T = false;
        this.f202765h.getClass();
        if (ym1.f.Ni()) {
            return;
        }
        com.tencent.mm.ui.chatting.component.ro roVar = this.f202773s;
        if (roVar != null ? roVar.f199865e : this.M) {
            G(false);
            if (this.f202766i != -1) {
                F(z17);
                this.C = z17;
            } else {
                F(true);
                this.C = true;
            }
            K();
            return;
        }
        if (this.f202766i != -1) {
            yb5.d dVar2 = this.f202771q;
            if ((dVar2 != null ? dVar2.e().f208650j : false) == z17) {
                return;
            }
            F(z17);
            this.C = z17;
            new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.chatting.c1(this, z17), false).c(50L, 50L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "onSensorEvent, isResumeFromDisableScreen:%b", java.lang.Boolean.valueOf(this.C));
    }

    public void g(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "changeTalker, isResumeFromDisableScreen: %b", java.lang.Boolean.valueOf(this.C));
        if (this.C || this.f202772r == null) {
            return;
        }
        this.A = str;
        if (str == null) {
            this.A = "";
        }
        this.f202762e = new java.util.LinkedList();
        this.f202764g = false;
        u();
        E(-1L);
        this.f202775u = false;
        this.f202777w = -1L;
        this.f202779y = false;
        this.f202780z = 0;
        com.tencent.mm.modelbase.c1 c1Var = this.f202765h;
        com.tencent.mm.modelbase.a1 a1Var = this.P;
        if (c1Var != null) {
            ((java.util.ArrayList) ((sl.j) c1Var).f409039l).remove(a1Var);
        }
        boolean I4 = com.tencent.mm.storage.z3.I4(str);
        float f17 = this.I;
        if (I4) {
            this.f202780z = 1;
            this.f202765h = new sl.j(this.f202772r, 1, f17);
        } else {
            this.f202780z = 0;
            this.f202765h = new sl.j(this.f202772r, 0, f17);
        }
        ((java.util.ArrayList) ((sl.j) this.f202765h).f409039l).add(a1Var);
    }

    public void h() {
        if (1 == com.tencent.mars.xlog.Log.getLogLevel()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        }
        this.f202768n = -1L;
        this.f202769o = null;
        this.f202762e.clear();
    }

    public void i(int i17, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || !f9Var.g3()) {
            return;
        }
        long j17 = new w21.u0(f9Var.j()).f442480b;
        if (j17 == 0 && f9Var.A0() == 0) {
            return;
        }
        if (f9Var.P0() == 1 && f9Var.A0() == 1) {
            return;
        }
        if (f9Var.A0() == 0 && j17 == -1) {
            return;
        }
        h();
        I();
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4115, null);
        if (bool == null || !bool.booleanValue()) {
            c01.d9.b().p().w(4115, java.lang.Boolean.TRUE);
            this.f202771q.Z(com.tencent.mm.R.raw.icons_filled_ear, com.tencent.mm.R.color.f478496g, this.f202772r.getString(com.tencent.mm.R.string.b4s), 4000L);
        }
        if (((sl.j) this.f202765h).c() && f9Var.getMsgId() == this.f202766i) {
            this.F = true;
            J(true);
            return;
        }
        f(f9Var);
        if (f9Var.A0() == 0 && !w21.x0.n(f9Var)) {
            e(i17 + 1);
        }
        s();
    }

    public void j(int i17, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        h();
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4115, null);
        if (bool == null || !bool.booleanValue()) {
            c01.d9.b().p().w(4115, java.lang.Boolean.TRUE);
            this.f202771q.Z(com.tencent.mm.R.raw.icons_filled_ear, com.tencent.mm.R.color.f478496g, this.f202772r.getString(com.tencent.mm.R.string.b4s), 4000L);
        }
        if (((sl.j) this.f202765h).c() && f9Var.getMsgId() == this.f202766i) {
            J(true);
            return;
        }
        f(f9Var);
        if (f9Var.A0() == 0 && !w21.x0.n(f9Var)) {
            e(i17 + 1);
        }
        s();
    }

    public void k(int i17, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        h();
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4115, null);
        if (bool == null || !bool.booleanValue()) {
            c01.d9.b().p().w(4115, java.lang.Boolean.TRUE);
            this.f202771q.Z(com.tencent.mm.R.raw.icons_filled_ear, com.tencent.mm.R.color.f478496g, this.f202772r.getString(com.tencent.mm.R.string.b4s), 4000L);
        }
        if (((sl.j) this.f202765h).c() && f9Var.getMsgId() == this.f202766i) {
            J(true);
            return;
        }
        f(f9Var);
        if (f9Var.A0() == 0 && !w21.x0.n(f9Var)) {
            e(i17 + 1);
        }
        s();
    }

    public void l() {
        this.f202764g = false;
        if (m()) {
            return;
        }
        s();
    }

    public boolean m() {
        return this.f202767m >= 0 || this.L != null;
    }

    public boolean n() {
        return ((sl.j) this.f202765h).c();
    }

    public final void o() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.b1(this));
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "voice play completion isSpeakerOn %b, %d, %d", java.lang.Boolean.valueOf(this.f202775u), java.lang.Long.valueOf(this.f202766i), java.lang.Long.valueOf(this.E));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15160, java.lang.Long.valueOf(this.f202766i), java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(this.E), 0);
        if (this.f202772r != null || m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "stop play complete");
            com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
            A();
            x();
            if (this.f202762e.isEmpty()) {
                y();
            }
            o();
            E(-1L);
            yd5.r.f461147a.a();
            A();
            t(false, false);
        }
    }

    @Override // com.tencent.mm.modelbase.b1
    public void onStop() {
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f202766i);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.E);
        long j17 = this.D;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.AutoPlay", "voice play stop. %d, %d, %d, %b, %b, %s", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(this.F), new com.tencent.mm.sdk.platformtools.z3());
        long j18 = this.f202766i;
        if (j18 > 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Long.valueOf(j18);
            objArr[1] = java.lang.Long.valueOf(this.E);
            int i17 = 2;
            objArr[2] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.D);
            if (this.G) {
                i17 = 3;
            } else if (this.F) {
                i17 = 1;
            }
            objArr[3] = java.lang.Integer.valueOf(i17);
            g0Var.d(15160, objArr);
        }
        this.G = false;
        this.F = false;
        A();
        u();
        x();
        if (this.f202762e.isEmpty()) {
            y();
        }
        o();
        E(-1L);
        yd5.r.f461147a.a();
        this.C = false;
        F(true);
        I();
    }

    public void p(com.tencent.mm.storage.f9 f9Var) {
        if (!(this.B && this.f202762e.isEmpty()) && f9Var != null && f9Var.g3() && f9Var.A0() != 1 && f9Var.Q0() != null && f9Var.Q0().equals(this.f202771q.x()) && c01.d9.e().f70771n && this.f202771q.f460714i) {
            if (w21.x0.o(f9Var)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AutoPlay", "should not in this setData");
                return;
            }
            f(f9Var);
            if (this.f202764g || ((sl.j) this.f202765h).c() || !com.tencent.mm.sdk.platformtools.t8.U0(this.f202772r)) {
                return;
            }
            s();
        }
    }

    public void q(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "onBackPlayInterrupt() called with: pause = [" + z17 + "]");
        if (z17) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.L;
            if (ballInfo != null) {
                this.f202768n = this.f202767m;
                java.util.Iterator it = this.f202762e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                    if (f9Var.getMsgId() == this.f202768n) {
                        this.f202769o = f9Var;
                        break;
                    }
                }
            }
            this.G = false;
            this.F = false;
            A();
            u();
            y();
            E(-1L);
            o();
            this.C = false;
            F(true);
            if (ballInfo != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "onPause: back playing");
                C(ballInfo);
                y();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.L;
        if (ballInfo2 == null || this.f202768n < 0 || this.f202769o == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AutoPlay", "resumeBackPlay: resume, but no pausedBackPlayingVoiceId or ball info");
        } else {
            boolean n17 = n();
            com.tencent.mm.sdk.platformtools.o4 o4Var = this.f202761d;
            if (n17) {
                w();
                z();
                E(this.f202768n);
                o4Var.putLong("current_interrupt_msg_id-" + this.A, 0L);
                o();
                C(ballInfo2);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AutoPlay", "onBackPlayInterrupt: resume, but player is playing");
            yb5.d dVar = this.f202771q;
            int R0 = dVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).R0(this.f202769o) : 0;
            if (R0 >= 0) {
                com.tencent.mm.storage.f9 f9Var2 = this.f202769o;
                if (f9Var2 != null && f9Var2.g3()) {
                    long j17 = new w21.u0(f9Var2.j()).f442480b;
                    if ((j17 != 0 || f9Var2.A0() != 0) && ((f9Var2.P0() != 1 || f9Var2.A0() != 1) && (f9Var2.A0() != 0 || j17 != -1))) {
                        boolean z18 = ((java.util.LinkedList) this.f202762e).size() > 1;
                        h();
                        if (((sl.j) this.f202765h).c() && f9Var2.getMsgId() == this.f202766i) {
                            this.F = true;
                            J(true);
                        } else {
                            f(f9Var2);
                            if (f9Var2.A0() == 0 && z18) {
                                e(R0 + 1);
                            }
                            s();
                            long j18 = this.f202778x;
                            if (j18 > 0 && B(j18)) {
                                o4Var.putLong("current_interrupt_msg_id-" + this.A, 0L);
                            }
                        }
                    }
                }
                C(ballInfo2);
                return;
            }
        }
        C(null);
        this.f202768n = -1L;
        this.f202769o = null;
    }

    public void r() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "AutoPlay release");
        com.tencent.mm.sdk.platformtools.s7 s7Var = this.f202776v;
        if (s7Var != null) {
            s7Var.b();
        }
        ((sl.j) this.f202765h).i();
        this.f202772r = null;
        this.C = false;
        this.f202771q = null;
        this.f202773s = null;
        this.Q.dead();
        ((java.util.ArrayList) ((com.tencent.mm.booter.b) c01.d9.c()).f63305a).remove(this);
    }

    public void s() {
        t(true, false);
    }

    public final void t(boolean z17, boolean z18) {
        com.tencent.mm.storage.f9 f27;
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "play next: size: %s needAudioFocus: %s", java.lang.Integer.valueOf(((java.util.LinkedList) this.f202762e).size()), java.lang.Boolean.valueOf(z17));
        int size = ((java.util.LinkedList) this.f202762e).size();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.S;
        if (size <= 0) {
            n3Var.sendEmptyMessageDelayed(0, 1000L);
            I();
            return;
        }
        com.tencent.mm.modelbase.c1 c1Var = this.f202765h;
        if (c1Var != null) {
            ((sl.j) c1Var).f409037j = z17;
            ((sl.j) c1Var).f409036i = z17;
        }
        if (!z18) {
            this.H = 1.0f;
        }
        boolean z19 = !z18;
        try {
            ((java.util.LinkedList) this.f202762e).size();
            if (((java.util.LinkedList) this.f202762e).size() <= 0) {
                n3Var.sendEmptyMessageDelayed(0, 1000L);
                return;
            }
            long createTime = ((com.tencent.mm.storage.f9) ((java.util.LinkedList) this.f202762e).get(0)).getCreateTime();
            int size2 = ((java.util.LinkedList) this.f202762e).size();
            int i17 = 0;
            for (int i18 = 1; i18 < size2; i18++) {
                if (createTime > ((com.tencent.mm.storage.f9) ((java.util.LinkedList) this.f202762e).get(i18)).getCreateTime()) {
                    createTime = ((com.tencent.mm.storage.f9) ((java.util.LinkedList) this.f202762e).get(i18)).getCreateTime();
                    i17 = i18;
                }
            }
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) ((java.util.LinkedList) this.f202762e).get(i17);
            if (f9Var == null || (f27 = pt0.f0.f2(f9Var.Q0(), f9Var.getMsgId())) == null || !f27.g3()) {
                return;
            }
            H(f9Var, z19);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AutoPlay", e17, "", new java.lang.Object[0]);
        }
    }

    public final void u() {
        if (this.f202766i < 0 || this.f202778x <= 2500) {
            return;
        }
        java.lang.String str = this.f202766i + "";
        java.lang.String str2 = this.f202778x + "," + java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f202761d;
        o4Var.putString(str, str2);
        o4Var.putLong("current_interrupt_msg_id-" + this.A, this.f202766i);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "[voice interrupt] record id: " + str + " info: " + str2 + this.A);
    }

    public final void v(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.L;
        if (ballInfo != null) {
            boolean R4 = com.tencent.mm.storage.z3.R4(f9Var.Q0());
            java.lang.Object[] objArr = new java.lang.Object[2];
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String y07 = f9Var.y0();
            java.lang.String Q0 = R4 ? f9Var.Q0() : null;
            ((sg3.a) v0Var).getClass();
            objArr[0] = c01.a2.f(y07, Q0);
            objArr[1] = java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.huk), java.lang.Integer.valueOf((int) w21.x0.m(this.f202763f.f442480b)));
            ballInfo.f93063x = java.lang.String.format("%s：%s", objArr);
            C(ballInfo);
        }
    }

    public final void w() {
        com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f202774t;
        if (sensorController.f192433h) {
            return;
        }
        sensorController.b(this);
        if (this.f202776v.a(new com.tencent.mm.ui.chatting.d1(this))) {
            this.f202777w = 0L;
        } else {
            this.f202777w = -1L;
        }
    }

    public final void x() {
        int size = ((java.util.LinkedList) this.f202762e).size();
        int i17 = -1;
        for (int i18 = 0; i18 < size; i18++) {
            if (((com.tencent.mm.storage.f9) ((java.util.LinkedList) this.f202762e).get(i18)).getMsgId() == this.f202766i) {
                i17 = i18;
            }
        }
        if (i17 != -1) {
            ((java.util.LinkedList) this.f202762e).remove(i17);
        }
        ((java.util.LinkedList) this.f202762e).size();
        if (((java.util.LinkedList) this.f202762e).size() == 0) {
            new com.tencent.mm.autogen.events.VoicePlayStopEvent().b(android.os.Looper.getMainLooper());
        }
    }

    public final void y() {
        try {
            com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f202774t;
            if (sensorController != null) {
                sensorController.a();
            }
            com.tencent.mm.sdk.platformtools.s7 s7Var = this.f202776v;
            if (s7Var != null) {
                s7Var.b();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AutoPlay", e17, "reset sensor error: %s", e17.getMessage());
        }
    }

    public final void z() {
        final com.tencent.mm.ui.chatting.component.ro roVar = this.f202773s;
        if (roVar != null) {
            if (android.os.Looper.getMainLooper().isCurrentThread()) {
                roVar.f198580d.Q(true);
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.v0$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.chatting.component.ro.this.f198580d.Q(true);
                }
            });
        }
    }
}
