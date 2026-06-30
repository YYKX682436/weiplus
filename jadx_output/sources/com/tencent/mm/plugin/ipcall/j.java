package com.tencent.mm.plugin.ipcall;

/* loaded from: classes14.dex */
public class j implements com.tencent.mm.plugin.ipcall.model.o, m83.b, com.tencent.mm.plugin.voip.model.z1 {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f142443u = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.l f142444d;

    /* renamed from: e, reason: collision with root package name */
    public s83.l f142445e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f142446f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f142447g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f142448h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.h5 f142449i = new com.tencent.mm.plugin.ipcall.d(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f142450m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f142451n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f142452o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f142453p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f142454q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.ui.e f142455r;

    /* renamed from: s, reason: collision with root package name */
    public long f142456s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f142457t;

    public j() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f142450m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BackupProcessMgrExitEvent>(a0Var) { // from class: com.tencent.mm.plugin.ipcall.IPCallManager$2
            {
                this.__eventId = 176812961;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "recevive BackupProcessMgrExitEvent");
                com.tencent.mm.plugin.ipcall.j.this.j(0, 0);
                return false;
            }
        };
        this.f142451n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.ipcall.IPCallManager$3
            {
                this.__eventId = 1403859438;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent) {
                com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent2 = voipCheckIsDeviceUsingEvent;
                if (voipCheckIsDeviceUsingEvent2 instanceof com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent) {
                    am.w00 w00Var = voipCheckIsDeviceUsingEvent2.f54943g;
                    w00Var.f8245a = false;
                    w00Var.f8246b = false;
                    w00Var.f8247c = true;
                    w00Var.f8248d = "";
                }
                return false;
            }
        };
        this.f142452o = new com.tencent.mm.plugin.ipcall.e(this);
        this.f142453p = new com.tencent.mm.plugin.ipcall.f(this);
        this.f142455r = new com.tencent.mm.plugin.ipcall.g(this);
        this.f142456s = 0L;
    }

    public void a(boolean z17) {
        synchronized (this.f142448h) {
            this.f142454q = false;
            gq4.v.Ai().a(z17);
            ((android.app.NotificationManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification")).cancel(42);
        }
    }

    @Override // com.tencent.mm.plugin.voip.model.z1
    public void b() {
        if (com.tencent.mm.plugin.ipcall.model.r.bj().f142482a != 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onResumeGoodNetStatus currentState != accept:%d", java.lang.Integer.valueOf(com.tencent.mm.plugin.ipcall.model.r.bj().f142482a));
            return;
        }
        l83.d Di = com.tencent.mm.plugin.ipcall.model.r.Di();
        Di.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDeviceManager", "onResumeGoodNetStatus");
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = Di.f317098d;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    public boolean c(int i17, int i18, int i19) {
        int i27;
        boolean z17;
        com.tencent.mm.plugin.voip.model.e eVar;
        tl.w wVar;
        k83.g gVar = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u;
        if (!com.tencent.mm.plugin.ipcall.model.r.bj().f(i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
            if (gVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now inviteId:%d, roomId:%d, state:%d,errStatus:%d, pstnErrCode:%d", java.lang.Integer.valueOf(gVar.f304901d), java.lang.Integer.valueOf(gVar.f304898a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            }
            return false;
        }
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "finishIPCall inviteId:%d, roomId:%d, state:%d, errStatus:%d, pstnErrCode:%d", java.lang.Integer.valueOf(gVar.f304901d), java.lang.Integer.valueOf(gVar.f304898a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        com.tencent.mm.plugin.ipcall.model.r.aj().e();
        wq4.k0 aj6 = com.tencent.mm.plugin.ipcall.model.r.aj();
        boolean n17 = com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.n();
        aj6.getClass();
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.x2.e();
        android.content.Context context = aj6.f448648b;
        context.getSharedPreferences(e17, 0).getBoolean("settings_shake", true);
        ym1.f.Ai("voip").a(n17);
        if (n17) {
            i95.m c17 = i95.n0.c(ym1.f.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xm1.h hVar = ((ym1.f) c17).f463136e;
            if (hVar == null) {
                hVar = new xm1.j();
                i95.m c18 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((ym1.f) c18).f463136e = hVar;
                i95.m c19 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ((ym1.f) c19).f463138g[0] = "music";
            }
            xm1.h.y(hVar, 0, null, 2, null);
        } else {
            i95.m c27 = i95.n0.c(ym1.f.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            xm1.h hVar2 = ((ym1.f) c27).f463136e;
            if (hVar2 == null) {
                hVar2 = new xm1.j();
                i95.m c28 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c28, "getService(...)");
                ((ym1.f) c28).f463136e = hVar2;
                i95.m c29 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c29, "getService(...)");
                ((ym1.f) c29).f463138g[0] = "music";
            }
            xm1.h.y(hVar2, 2, null, 2, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RingPlayer", "playSound, shake: %s, isSpeakerOn: %s, type: %s", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(n17), 2);
        aj6.f448653g = java.lang.System.currentTimeMillis();
        to.g gVar2 = new to.g();
        try {
            gVar2.setDataSource(context, aj6.b("close_lower_volume"));
            gVar2.setOnCompletionListener(new wq4.h0(aj6));
            gVar2.setOnErrorListener(new wq4.i0(aj6));
            gVar2.setAudioStreamType((ym1.f.Ni() || !n17) ? 0 : 2);
            gVar2.prepare();
            gVar2.setLooping(false);
            gVar2.start();
            if (java.lang.System.currentTimeMillis() - aj6.f448653g > 2000) {
                aj6.getClass();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", th6);
            aj6.getClass();
            gVar2.stop();
            gVar2.release();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "closeDeviceEngine");
        com.tencent.mm.plugin.voip.model.a2 a17 = com.tencent.mm.plugin.voip.model.a2.a();
        a17.f176327e = -1L;
        a17.f176325c = false;
        a17.f176326d = false;
        a17.f176329g = false;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.y1(a17));
        com.tencent.mm.plugin.voip.model.a2 a18 = com.tencent.mm.plugin.voip.model.a2.a();
        a18.getClass();
        a18.f176328f = new java.lang.ref.WeakReference(null);
        m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
        l83.h hVar3 = com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.f298162m;
        int i28 = (hVar3 == null || (wVar = hVar3.f317104a) == null) ? 0 : wVar.f420148a;
        if (Zi.D == 0) {
            Zi.D = i28;
        }
        m83.d Zi2 = com.tencent.mm.plugin.ipcall.model.r.Zi();
        l83.c cVar = com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.f298161l;
        int i29 = (cVar == null || (eVar = cVar.f317090a) == null) ? 0 : eVar.K;
        if (Zi2.E == 0) {
            Zi2.E = i29;
        }
        l83.d Di = com.tencent.mm.plugin.ipcall.model.r.Di();
        Di.getClass();
        m83.c Ni = com.tencent.mm.plugin.ipcall.model.r.Ni();
        l83.c cVar2 = Di.f317096b.f298161l;
        if (cVar2 != null) {
            com.tencent.mm.plugin.voip.model.e eVar2 = cVar2.f317090a;
            i27 = (eVar2 == null || !cVar2.f317092c) ? -1 : eVar2.g();
        } else {
            i27 = 0;
        }
        Ni.f324717a.f176860k0 = i27 == -1 ? 0 : (int) ((r6.h(i27) / r6.g(i27)) * 100);
        Di.f317099e = null;
        j83.b bVar = Di.f317096b;
        l83.c cVar3 = bVar.f298161l;
        if (cVar3 != null && cVar3.f317092c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAudioPlayer", "stopPlay");
            synchronized (cVar3.f317091b) {
                s75.d.b(new l83.b(cVar3, cVar3.f317090a), "IPCallAudioPlayer_stop");
                cVar3.f317092c = false;
                cVar3.f317090a = null;
            }
        }
        bVar.q("ipcall");
        bVar.f298160k = null;
        bVar.f298163n.a();
        Di.f317098d = null;
        l83.d Di2 = com.tencent.mm.plugin.ipcall.model.r.Di();
        l83.h hVar4 = Di2.f317096b.f298162m;
        if (hVar4 != null && hVar4.f317106c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRecorder", "stop record");
            synchronized (hVar4.f317105b) {
                tl.w wVar2 = hVar4.f317104a;
                if (wVar2 != null) {
                    s75.d.b(new l83.g(hVar4, wVar2), "IPCallRecorder_stopRecord");
                    hVar4.f317104a = null;
                    hVar4.f317106c = false;
                    hVar4.f317107d = false;
                }
            }
        }
        Di2.f317099e = null;
        m83.c Ni2 = com.tencent.mm.plugin.ipcall.model.r.Ni();
        Ni2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "close engine");
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = Ni2.f324717a;
        v2protocalVar.A(true);
        m83.d Zi3 = com.tencent.mm.plugin.ipcall.model.r.Zi();
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi3.f324746x) && com.tencent.mm.sdk.platformtools.t8.K0(Zi3.f324745w)) {
            Zi3.f324746x = com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a.t(Zi3.f324730h == 1, com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304923z);
            Zi3.f324745w = com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a.u();
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a;
            Zi3.f324747y = v2protocalVar2.j() + "," + v2protocalVar2.J0 + "," + (com.tencent.mm.plugin.voip.model.v2protocal.X1 & 255) + v2protocalVar2.g() + "," + v2protocalVar2.f176860k0;
        }
        v2protocalVar.B();
        Ni2.f324720d = false;
        Ni2.f324719c = false;
        Ni2.f324721e = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = f142443u;
        n3Var.removeCallbacks(this.f142453p);
        n3Var.removeCallbacks(this.f142452o);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f142457t;
        if (b4Var != null) {
            b4Var.d();
            this.f142457t = null;
        }
        com.tencent.mm.plugin.ipcall.model.r.Zi().f324732j = i19;
        m83.d Zi4 = com.tencent.mm.plugin.ipcall.model.r.Zi();
        if (Zi4.f324744v == 0 && Zi4.f324743u != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            Zi4.f324744v = currentTimeMillis;
            Zi4.f324731i = (currentTimeMillis - Zi4.f324743u) / 1000;
        }
        if (i17 == 8) {
            com.tencent.mm.plugin.ipcall.model.r.cj().c();
            com.tencent.mm.plugin.ipcall.model.r.Zi().a();
            s83.l lVar = this.f142445e;
            if (lVar != null && lVar.systemRowid != -1) {
                lVar.field_status = 2;
                com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar);
            }
        } else if (i17 == 12) {
            com.tencent.mm.plugin.ipcall.model.r.cj().c();
            com.tencent.mm.plugin.ipcall.model.r.Zi().a();
            if (i18 == 11) {
                s83.l lVar2 = this.f142445e;
                if (lVar2 != null && lVar2.systemRowid != -1) {
                    lVar2.field_status = 7;
                    com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar2);
                }
            } else {
                s83.l lVar3 = this.f142445e;
                if (lVar3 != null && lVar3.systemRowid != -1) {
                    lVar3.field_status = 6;
                    com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar3);
                }
            }
        } else if (i17 == 9) {
            com.tencent.mm.plugin.ipcall.model.r.cj().m(1);
            m83.d Zi5 = com.tencent.mm.plugin.ipcall.model.r.Zi();
            Zi5.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "selfShutdown");
            Zi5.f324727e = 1;
            s83.l lVar4 = this.f142445e;
            long j17 = com.tencent.mm.plugin.ipcall.model.r.Zi().f324731i;
            if (lVar4 != null && lVar4.systemRowid != -1) {
                lVar4.field_status = 4;
                lVar4.field_duration = j17;
                com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar4);
            }
        } else if (i17 == 10) {
            com.tencent.mm.plugin.ipcall.model.r.cj().m(1);
            m83.d Zi6 = com.tencent.mm.plugin.ipcall.model.r.Zi();
            Zi6.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "otherSideUserShutdown");
            Zi6.f324725c = 1;
            s83.l lVar5 = this.f142445e;
            long j18 = com.tencent.mm.plugin.ipcall.model.r.Zi().f324731i;
            if (lVar5 != null && lVar5.systemRowid != -1) {
                lVar5.field_status = 5;
                lVar5.field_duration = j18;
                com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar5);
            }
        } else if (i17 == 11) {
            if (i18 == 5) {
                com.tencent.mm.plugin.ipcall.model.r.cj().m(3);
            } else if (i18 == 11) {
                com.tencent.mm.plugin.ipcall.model.r.cj().m(1);
            } else {
                com.tencent.mm.plugin.ipcall.model.r.cj().m(2);
            }
            m83.d Zi7 = com.tencent.mm.plugin.ipcall.model.r.Zi();
            Zi7.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "selfShutdown");
            Zi7.f324727e = 1;
            if (i18 == 11) {
                s83.l lVar6 = this.f142445e;
                if (lVar6 != null && lVar6.systemRowid != -1) {
                    lVar6.field_status = 7;
                    com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar6);
                }
            } else {
                s83.l lVar7 = this.f142445e;
                long j19 = com.tencent.mm.plugin.ipcall.model.r.Zi().f324731i;
                if (lVar7 != null && lVar7.systemRowid != -1) {
                    lVar7.field_status = 4;
                    lVar7.field_duration = j19;
                    com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar7);
                }
            }
        }
        if (com.tencent.mm.plugin.ipcall.model.r.cj().f142500w) {
            if (this.f142454q || com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304898a == 0 || com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304900c == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallManager", "roomId = 0,ignore feedback");
            } else {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                int i37 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304898a;
                long j27 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304900c;
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog");
                if (com.tencent.mm.plugin.ipcall.k.a()) {
                    int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WCOMaxTimesForShowFeedback", 0);
                    com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERFINO_IPCALL_SHOW_FEEDBACK_TIME_COUNT_INT;
                    int intValue = ((java.lang.Integer) p17.m(u3Var, 0)).intValue();
                    com.tencent.mm.storage.n3 p18 = c01.d9.b().p();
                    com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERFINO_IPCALL_SHOW_FEEDBACK_LAST_TIME_LONG;
                    long longValue = ((java.lang.Long) p18.m(u3Var2, 0L)).longValue();
                    long i110 = com.tencent.mm.sdk.platformtools.t8.i1();
                    long j28 = i110 - longValue;
                    if (j28 > 86400) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reset time");
                        intValue = 0;
                    }
                    if (intValue >= b17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reach max time" + b17);
                    } else if (j28 < 1800) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog not reach INTERVAL_TIMES_TRY_SHOW_WCO_FEEDBACK_MAIN");
                    } else {
                        c01.d9.b().p().x(u3Var, java.lang.Integer.valueOf(intValue + 1));
                        c01.d9.b().p().x(u3Var2, java.lang.Long.valueOf(i110));
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("IPCallFeedbackDialogUI_KRoomId", i37);
                        intent.putExtra("IPCallFeedbackDialogUI_KCallseq", j27);
                        j45.l.j(context2, "ipcall", ".ui.IPCallFeedbackDialogUI", intent, null);
                    }
                }
            }
        }
        com.tencent.mm.plugin.ipcall.model.r.cj().f142489i = null;
        com.tencent.mm.plugin.ipcall.model.r.Ni().f324722f = null;
        com.tencent.mm.plugin.ipcall.model.r.bj().f142482a = -1;
        l83.d dVar = com.tencent.mm.plugin.ipcall.model.r.Bi().f142506g;
        if (dVar.f317097c) {
            dVar.f317096b.getClass();
            ym1.f.f463134h.o("ipcall");
            dVar.f317097c = false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.ipcall.h(this));
        ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).Di(this.f142449i);
        this.f142451n.dead();
        this.f142450m.dead();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.IPCallManager", "unbindIPCallForegroundIfNeed", new java.lang.Object[0]);
        if (!fp.h.c(26)) {
            return true;
        }
        try {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.ipcall.model.IPCallForegroundService.class);
            com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent2);
            z17 = true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCallManager", e18, "unbindIPCallForegroundIfNeed error: %s", e18.getMessage());
            z17 = false;
        }
        if (!z17) {
            return true;
        }
        this.f142447g = false;
        return true;
    }

    public void d() {
        synchronized (this.f142448h) {
            if (com.tencent.mm.plugin.ipcall.model.r.bj().d()) {
                if (this.f142454q) {
                    l();
                    return;
                }
                this.f142454q = true;
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h2d, 0).show();
                android.content.Intent intent = new android.content.Intent();
                intent.setFlags(268435456);
                intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.class);
                intent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
                gq4.v.Ai().d(intent, false, true, this.f142455r);
                l();
                com.tencent.mm.plugin.ipcall.l lVar = this.f142444d;
                if (lVar != null) {
                    ((com.tencent.mm.plugin.ipcall.ui.l6) lVar).f142924w.finish();
                }
            }
        }
    }

    public void e(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onAccountOverdue, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
        if (j(8, 9)) {
            i(8, str, str2, i18);
        }
    }

    public void f(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onCallPhoneNumberInvalid, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
        if (j(11, 0)) {
            i(11, str, str2, i18);
        }
    }

    public void g(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onChannelConnectFailed, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
        if (com.tencent.mm.plugin.ipcall.model.r.Ni().f324720d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel already connected");
            if (j(5, i17)) {
                i(5, null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.apy), 1);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel not connet, may be request connect failed");
        if (j(4, i17)) {
            i(4, null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.apy), 1);
        }
    }

    public void h(int i17, java.lang.String str, java.lang.String str2, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onDisasterHappen, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
        if (j(12, 0)) {
            h(12, str, str2, i18, i19);
        }
    }

    public void i(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mm.plugin.ipcall.l lVar = this.f142444d;
        if (lVar == null) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str2, 1).show();
            return;
        }
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = (com.tencent.mm.plugin.ipcall.ui.l6) lVar;
        if (i18 == 1) {
            l6Var.D = false;
        }
        if (i17 == 8) {
            if (i18 != 1) {
                l6Var.j(str, str2, i18, l6Var.f142924w.getString(com.tencent.mm.R.string.g3g));
                l6Var.k(8);
                return;
            }
            l6Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = l6Var.f142924w.getString(com.tencent.mm.R.string.g3h);
            }
            com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI = l6Var.f142924w;
            db5.e1.E(iPCallTalkUI, str2, str, iPCallTalkUI.getString(com.tencent.mm.R.string.g3i), false, new com.tencent.mm.plugin.ipcall.ui.a6(l6Var));
            l6Var.k(8);
            return;
        }
        if (i17 == 10) {
            l6Var.j(str, str2, i18, null);
            l6Var.k(10);
        } else {
            if (i17 == 11) {
                l6Var.j(str, str2, i18, null);
                l6Var.k(11);
                return;
            }
            l6Var.j(str, str2, i18, null);
            if (i17 == 5) {
                l6Var.k(3);
            } else {
                l6Var.k(2);
            }
        }
    }

    public boolean j(int i17, int i18) {
        return com.tencent.mm.plugin.ipcall.model.r.bj().c() ? i17 == 0 ? c(9, i17, i18) : c(11, i17, i18) : i17 == 0 ? c(8, i17, i18) : c(12, i17, i18);
    }

    @Override // com.tencent.mm.plugin.voip.model.z1
    public void k() {
    }

    public void l() {
        if (fp.h.a(26)) {
            java.lang.String string = com.tencent.mm.plugin.ipcall.model.r.bj().c() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492338g41, java.lang.String.format("%02d:%02d", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.H1(this.f142456s) / 60), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.H1(this.f142456s) % 60))) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492337g40);
            android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.class);
            intent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 42, intent, fp.g0.a(134217728));
            int i17 = fp.h.a(19) ? com.tencent.mm.R.drawable.c7u : com.tencent.mm.R.drawable.c7v;
            z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
            k0Var.m(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492337g40));
            k0Var.D.when = java.lang.System.currentTimeMillis();
            k0Var.f(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g3s));
            k0Var.e(string);
            k0Var.f469463g = activity;
            android.app.Notification b17 = k0Var.b();
            b17.icon = i17;
            b17.flags |= 32;
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).n(42, b17, false);
        }
        if (com.tencent.mm.plugin.ipcall.model.r.bj().c()) {
            com.tencent.mm.plugin.voip.ui.t0 Ai = gq4.v.Ai();
            int H1 = (int) com.tencent.mm.sdk.platformtools.t8.H1(this.f142456s);
            int i18 = H1 > 0 ? H1 : 0;
            if (Ai.f176987a != null) {
                Ai.f176987a.f(java.lang.String.format("%02d:%02d", java.lang.Integer.valueOf(i18 / 60), java.lang.Integer.valueOf(i18 % 60)));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.voip.ui.t0 Ai2 = gq4.v.Ai();
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h3d);
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = Ai2.f176987a;
        if (voipViewFragment != null) {
            voipViewFragment.e(string2);
        }
    }

    @Override // com.tencent.mm.plugin.voip.model.z1
    public void m(boolean z17) {
        if (com.tencent.mm.plugin.ipcall.model.r.bj().f142482a != 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onBadNetStatus currentState != accept:%d", java.lang.Integer.valueOf(com.tencent.mm.plugin.ipcall.model.r.bj().f142482a));
            return;
        }
        l83.d Di = com.tencent.mm.plugin.ipcall.model.r.Di();
        Di.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDeviceManager", "onBadNetStatus");
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = Di.f317098d;
        if (l6Var != null) {
            android.widget.TextView textView = l6Var.f142912k;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View view = l6Var.f142913l;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "tryShowNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "tryShowNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (Di.f317096b.n()) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - Di.f317100f > 30000) {
            Di.f317100f = currentTimeMillis;
            gq4.v.Bi().f176558a.getClass();
        }
    }

    public final void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "startTimeCount");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f142457t;
        if (b4Var != null) {
            b4Var.d();
            return;
        }
        if (b4Var == null) {
            this.f142457t = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.ipcall.i(this), true);
        }
        this.f142457t.c(1000L, 1000L);
    }

    @Override // com.tencent.mm.plugin.voip.model.z1
    public void p() {
    }
}
