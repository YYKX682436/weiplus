package tl;

/* loaded from: classes12.dex */
public class p0 implements com.tencent.mm.modelbase.g1 {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f420066w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f420067x;

    /* renamed from: b, reason: collision with root package name */
    public f25.m0 f420069b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f420071d;

    /* renamed from: f, reason: collision with root package name */
    public qi3.b0 f420073f;

    /* renamed from: g, reason: collision with root package name */
    public cg0.d f420074g;

    /* renamed from: k, reason: collision with root package name */
    public long f420078k;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f420082o;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelbase.f1 f420085r;

    /* renamed from: t, reason: collision with root package name */
    public final fl.c f420087t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Runnable f420089v;

    /* renamed from: a, reason: collision with root package name */
    public tl.d f420068a = null;

    /* renamed from: c, reason: collision with root package name */
    public tl.o0 f420070c = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f420072e = "";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f420075h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f420076i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f420077j = false;

    /* renamed from: l, reason: collision with root package name */
    public long f420079l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f420080m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f420081n = false;

    /* renamed from: p, reason: collision with root package name */
    public int f420083p = 0;

    /* renamed from: q, reason: collision with root package name */
    public to.c f420084q = to.c.UNKNOWN;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.modelbase.e1 f420086s = null;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f420088u = new com.tencent.mm.sdk.platformtools.b4(new tl.k0(this), true);

    static {
        f420066w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceRecordUseBluetooth()) == 1;
        f420067x = false;
    }

    public p0(android.content.Context context, boolean z17) {
        this.f420082o = false;
        this.f420082o = z17;
        boolean z18 = f420066w;
        if (z18) {
            this.f420087t = new fl.c(new tl.j0(this));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "new SceneVoiceRecorder, useSpeex: %s, useBlurtooth: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    @Override // com.tencent.mm.modelbase.g1
    public java.lang.String a() {
        return this.f420072e;
    }

    @Override // com.tencent.mm.modelbase.g1
    public void b(com.tencent.mm.modelbase.e1 e1Var) {
        this.f420086s = e1Var;
    }

    @Override // com.tencent.mm.modelbase.g1
    public long c() {
        long j17 = this.f420079l;
        if (j17 == 0) {
            return 0L;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return android.os.SystemClock.elapsedRealtime() - j17;
    }

    @Override // com.tencent.mm.modelbase.g1
    public boolean cancel() {
        tl.d dVar;
        synchronized (this) {
            dVar = this.f420068a;
        }
        if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "lock[%s] of cancel[%s]! stop synchronized Record:" + this.f420072e, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this);
            dVar.stopRecord();
            l();
        }
        if (f420066w) {
            this.f420087t.C();
        }
        if (!m() || this.f420073f == null) {
            w21.x0.p(this.f420072e);
            w21.p0.Bi().e();
        } else {
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(this.f420073f);
        }
        if (this.f420068a != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f420072e) && !this.f420082o) {
            java.lang.String str = this.f420072e;
            long c17 = c();
            int a17 = this.f420068a.a();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(",");
            stringBuffer.append(c17);
            stringBuffer.append(",");
            stringBuffer.append(1);
            stringBuffer.append(",");
            stringBuffer.append(a17);
            g0Var.kvStat(10513, stringBuffer.toString());
        }
        this.f420072e = "";
        this.f420073f = null;
        this.f420074g = null;
        return true;
    }

    @Override // com.tencent.mm.modelbase.g1
    public int d() {
        tl.d dVar = this.f420068a;
        if (dVar == null) {
            return 0;
        }
        return dVar.d();
    }

    @Override // com.tencent.mm.modelbase.g1
    public int e() {
        if (this.f420082o) {
            return 1;
        }
        to.c cVar = this.f420084q;
        if (cVar == to.c.PCM || cVar == to.c.AMR) {
            return 0;
        }
        return cVar == to.c.SILK ? 2 : -1;
    }

    @Override // com.tencent.mm.modelbase.g1
    public void f() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f420088u;
        if (b4Var != null) {
            b4Var.d();
            this.f420088u.removeCallbacksAndMessages(null);
        }
        if (f420066w) {
            this.f420087t.C();
        }
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "lock[%s] of stop2[%s]! stop synchronized Record:" + this.f420072e, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this);
            tl.d dVar = this.f420068a;
            if (dVar != null) {
                dVar.stopRecord();
                l();
            }
        }
        this.f420083p = -1;
    }

    @Override // com.tencent.mm.modelbase.g1
    public boolean g(java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "Start Record to  " + str);
        reset();
        this.f420075h = f9Var;
        this.f420071d = str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f420078k = android.os.SystemClock.elapsedRealtime();
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoice.Recorder", "Start Record toUser null");
            return false;
        }
        this.f420076i = str.equals("_USER_FOR_THROWBOTTLE_");
        if (str.equals("medianote")) {
            this.f420077j = (c01.z1.p() & 16384) == 0;
        }
        if (this.f420082o) {
            this.f420072e = w21.x0.g(str, "spx_");
        } else if (this.f420076i) {
            this.f420072e = w21.g1.n0(c01.z1.r(), "amr_");
        } else if (this.f420077j) {
            this.f420072e = w21.g1.n0("medianote", "amr_");
        } else if (m() || com.tencent.mm.storage.z3.J3(str)) {
            java.lang.String n07 = w21.g1.n0(c01.z1.r(), "amr_");
            this.f420072e = n07;
            cg0.d dVar = new cg0.d(str, n07);
            this.f420074g = dVar;
            dVar.f41057j = this;
            dVar.f41056i = 0;
            dg0.f fVar = (dg0.f) i95.n0.c(dg0.f.class);
            cg0.d params = this.f420074g;
            ((ig0.o) fVar).getClass();
            kotlin.jvm.internal.o.g(params, "params");
            this.f420073f = new jg0.x(params);
            dg0.f fVar2 = (dg0.f) i95.n0.c(dg0.f.class);
            qi3.b0 b0Var = this.f420073f;
            ((ig0.o) fVar2).getClass();
            if (b0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgFeatureService", "initSync task is null");
            } else {
                if (!(b0Var instanceof qi3.c)) {
                    throw new java.lang.UnsupportedOperationException("initSync only support BaseSendMsgTask Type");
                }
                pu.t0 a17 = pu.t0.f358376i.a();
                qi3.c cVar = (qi3.c) b0Var;
                kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(1, 0, null, 6, null);
                cVar.f363678g = b17;
                v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) a17.f358378f).getValue(), null, new pu.j0(cVar, null), 1, null);
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new ig0.h(b17, null), 1, null);
                }
            }
        } else {
            this.f420072e = w21.x0.g(str, "amr_");
        }
        java.lang.String str2 = this.f420072e;
        if (str2 == null || str2.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoice.Recorder", "Start Record DBError fileName:%s", this.f420072e);
            return false;
        }
        this.f420081n = false;
        this.f420069b = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.k0.f259102c, null);
        if (f420066w) {
            fl.c cVar2 = this.f420087t;
            cVar2.getClass();
            ym1.f.f463134h.h(cVar2, "record");
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceRecorderAudioManager", "some one has been request audio to record");
            boolean b18 = an1.c.f8833a.b();
            yz5.l lVar = cVar2.f263693k;
            if (!b18 || !an1.c.f8836d) {
                lVar.invoke(java.lang.Boolean.TRUE);
            } else if (cVar2.k()) {
                cVar2.f263695m = true;
                lVar.invoke(java.lang.Boolean.TRUE);
                cVar2.r("record", 1);
            } else {
                cVar2.f263695m = true;
                if (cVar2.r("record", 4) != -1) {
                    cVar2.f263694l.sendEmptyMessageDelayed(0, 1000L);
                } else {
                    lVar.invoke(java.lang.Boolean.TRUE);
                }
            }
        } else {
            n();
        }
        return true;
    }

    @Override // com.tencent.mm.modelbase.g1
    public void h(com.tencent.mm.modelbase.f1 f1Var) {
        this.f420085r = f1Var;
    }

    @Override // com.tencent.mm.modelbase.g1
    public boolean i() {
        tl.d dVar = this.f420068a;
        return dVar != null && dVar.getStatus() == 1;
    }

    @Override // com.tencent.mm.modelbase.g1
    public com.tencent.mm.storage.f9 j() {
        return this.f420075h;
    }

    @Override // com.tencent.mm.modelbase.g1
    public int k() {
        return this.f420080m;
    }

    public final void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "abandonFocus: ");
        if (this.f420069b != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f420069b);
            this.f420069b = null;
        }
    }

    public final boolean m() {
        return ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).cj() || com.tencent.mm.storage.z3.J3(this.f420071d);
    }

    public final void n() {
        if (this.f420081n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "[startRecordInternal] return mHasBeginRec is true!");
            return;
        }
        this.f420081n = true;
        if (this.f420082o) {
            this.f420084q = to.c.SPEEX;
            this.f420068a = new w21.k0();
        } else {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
            wo.c cVar = wo.v1.f447823c;
            boolean z17 = cVar.f447605i != 1;
            if (!sharedPreferences.contains("settings_voicerecorder_mode")) {
                sharedPreferences.edit().putBoolean("settings_voicerecorder_mode", z17).commit();
            }
            com.tencent.mars.xlog.Log.i("AudioConfig", "getModeByConfig mVoiceRecordMode:%d defValue:%b settings_voicerecorder_mode:%b", java.lang.Integer.valueOf(cVar.f447605i), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(sharedPreferences.getBoolean("settings_voicerecorder_mode", z17)));
            boolean z18 = sharedPreferences.getBoolean("settings_voicerecorder_mode", z17);
            to.c cVar2 = to.c.PCM;
            to.c cVar3 = to.c.AMR;
            this.f420084q = z18 ? cVar2 : cVar3;
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceFormat");
            java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceFormatToQQ");
            if (this.f420084q == cVar2) {
                if (4 == com.tencent.mm.sdk.platformtools.t8.P(d17, 4) && tl.w0.f420175b) {
                    this.f420084q = to.c.SILK;
                }
                java.lang.String str = this.f420071d;
                if (str != null && str.endsWith("@qqim")) {
                    this.f420084q = cVar3;
                }
            }
            if (this.f420084q == cVar2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode, still in pcm mode, force to amr mode");
                this.f420084q = cVar3;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode dynamicFormat:%s dynamicFormatQQ:%s recdMode:%s isSilkSoLoadSuccess:%b", d17, d18, this.f420084q, java.lang.Boolean.valueOf(tl.w0.f420175b));
            this.f420068a = new w21.f1(this.f420084q);
        }
        tl.l0 l0Var = new tl.l0(this);
        tl.d dVar = this.f420068a;
        if (dVar != null) {
            dVar.b(l0Var);
        }
        tl.m0 m0Var = new tl.m0(this);
        this.f420089v = m0Var;
        com.tencent.mm.sdk.platformtools.u3.i(m0Var, 600L);
        this.f420070c = new tl.o0(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "[startRecordInternal] mRecordStartRunnable has post! threadPool:%s", ((ku5.t0) ku5.t0.f312616e).f());
        ((ku5.t0) ku5.t0.f312615d).g(this.f420070c);
        this.f420083p = 1;
        this.f420088u.c(3000L, 3000L);
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.tencent.mm.modelbase.g1
    public void reset() {
        tl.d dVar = this.f420068a;
        if (dVar != null) {
            dVar.stopRecord();
            l();
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoice.Recorder", "Reset recorder.stopReocrd");
        }
        this.f420072e = "";
        this.f420078k = 0L;
        this.f420070c = null;
        this.f420084q = to.c.UNKNOWN;
        this.f420083p = 0;
        this.f420079l = 0L;
    }

    @Override // com.tencent.mm.modelbase.g1
    public boolean stop() {
        tl.d dVar;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f420088u;
        if (b4Var != null) {
            b4Var.d();
            this.f420088u.removeCallbacksAndMessages(null);
        }
        if (f420066w) {
            this.f420087t.C();
        }
        int c17 = (int) c();
        this.f420080m = c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "stop Record : %s, len: %s", this.f420072e, java.lang.Integer.valueOf(c17));
        if (this.f420068a != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f420072e) && !this.f420082o) {
            java.lang.String str = this.f420072e;
            long j17 = this.f420080m;
            int a17 = this.f420068a.a();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(",");
            stringBuffer.append(j17);
            stringBuffer.append(",2,");
            stringBuffer.append(a17);
            g0Var.kvStat(10513, stringBuffer.toString());
        }
        synchronized (this) {
            dVar = this.f420068a;
            if (dVar == null) {
                dVar = null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "stop synchronized Record:%s, recorder:%s, lock[%s] of stop[%s]!", this.f420072e, dVar, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this);
        if (dVar != null) {
            dVar.stopRecord();
        }
        l();
        boolean z17 = false;
        if (this.f420083p != 2) {
            if (!m() || this.f420073f == null) {
                w21.x0.b(this.f420072e);
            } else {
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(this.f420073f);
            }
            this.f420072e = null;
            this.f420073f = null;
            this.f420074g = null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Stop ");
            sb6.append(this.f420072e);
            sb6.append(" by not onPart: ");
            long j18 = this.f420078k;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", sb6.toString());
        } else {
            long j19 = this.f420080m;
            if (j19 < 800 || (this.f420076i && j19 < 1000)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "Stop " + this.f420072e + " by voiceLen: " + this.f420080m);
                if (!m() || this.f420073f == null) {
                    w21.x0.b(this.f420072e);
                } else {
                    ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(this.f420073f);
                }
                this.f420072e = "";
                this.f420073f = null;
                this.f420074g = null;
            } else {
                if (!m() || this.f420073f == null) {
                    w21.x0.t(this.f420072e, this.f420080m, 0, this.f420075h);
                    w21.p0.Bi().e();
                } else {
                    if (this.f420074g == null) {
                        cg0.d dVar2 = new cg0.d(this.f420071d, this.f420072e);
                        this.f420074g = dVar2;
                        dVar2.f41057j = this;
                        dVar2.f41056i = 0;
                    }
                    cg0.d dVar3 = this.f420074g;
                    dVar3.f41055h = this.f420080m;
                    com.tencent.mm.storage.f9 f9Var = this.f420075h;
                    if (f9Var != null) {
                        dVar3.f41058k = g45.b.f268846a.b(f9Var);
                    }
                    ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).hj(this.f420073f);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "Stop file success: " + this.f420072e);
                z17 = true;
            }
            this.f420072e = "";
            this.f420073f = null;
            this.f420074g = null;
        }
        this.f420083p = -1;
        return z17;
    }
}
