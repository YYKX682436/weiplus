package dk2;

/* loaded from: classes3.dex */
public final class ef implements hn0.i, com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver {
    public static dk2.xf A;
    public static boolean C;
    public static boolean D;
    public static boolean E;
    public static java.lang.Integer F;
    public static java.lang.Integer G;
    public static km2.n H;
    public static gk2.e I;

    /* renamed from: J, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f233371J;
    public static long L;
    public static long M;
    public static com.tencent.mm.protobuf.g N;
    public static final boolean R;
    public static final boolean S;
    public static final boolean T;
    public static final boolean U;
    public static final jz5.g V;
    public static boolean W;
    public static dk2.tc X;
    public static dk2.uc Y;
    public static final boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public static te2.j0 f233373a0;

    /* renamed from: b0, reason: collision with root package name */
    public static boolean f233375b0;

    /* renamed from: c, reason: collision with root package name */
    public static int f233376c;

    /* renamed from: c0, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f233377c0;

    /* renamed from: d, reason: collision with root package name */
    public static tn0.w0 f233378d;

    /* renamed from: d0, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f233379d0;

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.live.view.k0 f233380e;

    /* renamed from: e0, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f233381e0;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.ref.WeakReference f233382f;

    /* renamed from: f0, reason: collision with root package name */
    public static final java.lang.Runnable f233383f0;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f233384g;

    /* renamed from: g0, reason: collision with root package name */
    public static final java.lang.Runnable f233385g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final java.util.HashMap f233387h0;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f233388i;

    /* renamed from: i0, reason: collision with root package name */
    public static final java.lang.Runnable f233389i0;

    /* renamed from: j0, reason: collision with root package name */
    public static dk2.xg f233391j0;

    /* renamed from: k0, reason: collision with root package name */
    public static dk2.xg f233393k0;

    /* renamed from: l, reason: collision with root package name */
    public static dk2.g0 f233394l;

    /* renamed from: l0, reason: collision with root package name */
    public static dk2.xg f233395l0;

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.live.view.u7 f233396m;

    /* renamed from: m0, reason: collision with root package name */
    public static int f233397m0;

    /* renamed from: n, reason: collision with root package name */
    public static os5.r f233398n;

    /* renamed from: n0, reason: collision with root package name */
    public static final long f233399n0;

    /* renamed from: p, reason: collision with root package name */
    public static f25.m0 f233401p;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f233403r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f233404s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f233405t;

    /* renamed from: w, reason: collision with root package name */
    public static long f233408w;

    /* renamed from: x, reason: collision with root package name */
    public static long f233409x;

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.ef f233372a = new dk2.ef();

    /* renamed from: b, reason: collision with root package name */
    public static final long f233374b = android.os.SystemClock.elapsedRealtime();

    /* renamed from: h, reason: collision with root package name */
    public static final em2.u f233386h = new em2.u();

    /* renamed from: j, reason: collision with root package name */
    public static final dk2.k6 f233390j = new dk2.k6();

    /* renamed from: k, reason: collision with root package name */
    public static final dk2.tb f233392k = new dk2.tb();

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f233400o = "";

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f233402q = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.live.widget.de f233406u = new com.tencent.mm.plugin.finder.live.widget.de(com.tencent.mm.plugin.finder.live.widget.fe.f118342i, "");

    /* renamed from: v, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.live.widget.qv f233407v = new com.tencent.mm.plugin.finder.live.widget.qv(com.tencent.mm.plugin.finder.live.widget.sv.f119839i, "");

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.HashMap f233410y = new java.util.HashMap();

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.HashMap f233411z = new java.util.HashMap();
    public static final com.tencent.mm.sdk.platformtools.c0 B = new com.tencent.mm.sdk.platformtools.c0(20);
    public static int K = 1000;
    public static final java.util.Map O = java.util.Collections.synchronizedMap(new java.util.HashMap());
    public static int P = -1;
    public static int Q = -1;

    static {
        R = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3871s2).getValue()).r()).intValue() == 0;
        S = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3881t2).getValue()).r()).intValue() == 0;
        T = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3822n3).getValue()).r()).intValue() == 0;
        U = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3936z3).getValue()).r()).intValue() == 0;
        V = jz5.h.b(dk2.wd.f234288d);
        Z = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Z4).getValue()).r()).intValue() == 0;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f233377c0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.model.FinderLiveService$voipCallEvent$1
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent event = voipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new dk2.df(event));
                return false;
            }
        };
        f233379d0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiTalkActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.model.FinderLiveService$multiTalkActionListener$1
            {
                this.__eventId = 1177822575;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent) {
                com.tencent.mm.autogen.events.MultiTalkActionEvent event = multiTalkActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new dk2.ce(event));
                return false;
            }
        };
        f233381e0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiTalkStatusEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.model.FinderLiveService$multiTaskCreateListener$1
            {
                this.__eventId = -1297118925;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MultiTalkStatusEvent multiTalkStatusEvent) {
                com.tencent.mm.autogen.events.MultiTalkStatusEvent event = multiTalkStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new dk2.de(event));
                return false;
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveStateActionEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveStateActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.model.FinderLiveService$checkDeviceLsn$1
            {
                this.__eventId = 35180853;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveStateActionEvent finderLiveStateActionEvent) {
                kn0.p pVar;
                am.ac acVar;
                java.util.List list;
                java.lang.String str;
                java.util.List list2;
                com.tencent.mm.autogen.events.FinderLiveStateActionEvent event = finderLiveStateActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ac acVar2 = event.f54296g;
                boolean z17 = false;
                if (acVar2 != null) {
                    acVar2.f6146a = false;
                }
                if (acVar2 != null) {
                    acVar2.f6147b = false;
                }
                if (acVar2 != null) {
                    acVar2.f6148c = false;
                }
                if (acVar2 != null) {
                    acVar2.f6150e = false;
                }
                dk2.ef efVar = dk2.ef.f233372a;
                mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
                if (e1Var != null) {
                    if (e1Var.f328988r.getLong(0) != 0 && !((mm2.c1) e1Var.business(mm2.c1.class)).U7()) {
                        am.ac acVar3 = event.f54296g;
                        if (acVar3 != null) {
                            acVar3.f6147b = dk2.ef.f233384g;
                        }
                        if (acVar3 != null) {
                            acVar3.f6146a = true;
                        }
                        mm2.o4 o4Var = (mm2.o4) efVar.i(mm2.o4.class);
                        int size = (o4Var == null || (list2 = o4Var.f329327v) == null) ? 0 : list2.size();
                        am.ac acVar4 = event.f54296g;
                        if (acVar4 != null) {
                            tn0.w0 w0Var = dk2.ef.f233378d;
                            if (w0Var != null && w0Var.X()) {
                                z17 = true;
                            }
                            acVar4.f6149d = z17;
                        }
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "audienceLinkMicUserList size = " + size);
                        mm2.o4 o4Var2 = (mm2.o4) efVar.i(mm2.o4.class);
                        km2.q qVar = null;
                        if (o4Var2 != null && (list = o4Var2.f329327v) != null) {
                            synchronized (list) {
                                java.util.Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    java.lang.Object next = it.next();
                                    java.lang.String str2 = ((km2.q) next).f309170a;
                                    mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                                    if (c1Var == null || (str = c1Var.m8()) == null) {
                                        str = "";
                                    }
                                    if (com.tencent.mm.sdk.platformtools.t8.D0(str2, str)) {
                                        qVar = next;
                                        break;
                                    }
                                }
                            }
                            qVar = qVar;
                        }
                        if (qVar != null) {
                            int i17 = qVar.f309174e;
                            if (i17 == 2) {
                                am.ac acVar5 = event.f54296g;
                                if (acVar5 != null) {
                                    acVar5.f6148c = true;
                                }
                            } else if (i17 == 1 && (acVar = event.f54296g) != null) {
                                acVar.f6148c = true;
                            }
                        }
                    } else if (dk2.ef.f233384g && e1Var.f328988r.getLong(0) == 0 && ((mm2.c1) e1Var.business(mm2.c1.class)).T7()) {
                        tn0.w0 w0Var2 = dk2.ef.f233378d;
                        if (w0Var2 != null && (pVar = w0Var2.D) != null && pVar.f()) {
                            z17 = true;
                        }
                        if (z17) {
                            am.ac acVar6 = event.f54296g;
                            if (acVar6 != null) {
                                acVar6.f6147b = dk2.ef.f233384g;
                            }
                            if (acVar6 != null) {
                                acVar6.f6150e = true;
                            }
                        }
                    }
                }
                return true;
            }
        };
        jz5.h.b(dk2.je.f233664d);
        f233383f0 = dk2.yd.f234390d;
        f233385g0 = dk2.be.f233261d;
        f233387h0 = new java.util.HashMap();
        f233389i0 = dk2.me.f233771d;
        iListener.alive();
        f233399n0 = 1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0957  */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58, types: [dk2.g0, java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [dk2.ef] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void S(dk2.ef r47, java.lang.String r48, boolean r49, boolean r50, java.lang.Boolean r51, boolean r52, int r53, java.lang.Object r54) {
        /*
            Method dump skipped, instructions count: 2682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.S(dk2.ef, java.lang.String, boolean, boolean, java.lang.Boolean, boolean, int, java.lang.Object):void");
    }

    public static void T(dk2.ef efVar, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        efVar.getClass();
        pm0.v.X(new dk2.re(z17, aVar));
    }

    public static final java.lang.String d() {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        kotlin.jvm.internal.o.d(stackTrace);
        int length = stackTrace.length - 8;
        if (length < 2) {
            length = 2;
        }
        java.lang.String g07 = kz5.n0.g0(kz5.n0.K0(kz5.z.t0(stackTrace, length), 7), "|", null, null, 0, null, dk2.jd.f233663d, 30, null);
        com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", "finderLiveAssistant stacktrace: ".concat(g07));
        return g07;
    }

    public static /* synthetic */ void h(dk2.ef efVar, gk2.e eVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, com.tencent.mm.plugin.finder.live.view.k0 k0Var, int i17, r45.qt2 qt2Var, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = (i18 & 4) != 0 ? null : k0Var;
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        efVar.g(eVar, liveRoomControllerStore, k0Var2, i17, (i18 & 16) != 0 ? null : qt2Var);
    }

    public static /* synthetic */ void s0(dk2.ef efVar, int i17, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, int i18, java.lang.Object obj) {
        org.json.JSONObject jSONObject4 = (i18 & 2) != 0 ? null : jSONObject;
        org.json.JSONObject jSONObject5 = (i18 & 4) != 0 ? null : jSONObject2;
        org.json.JSONObject jSONObject6 = (i18 & 8) != 0 ? null : jSONObject3;
        if ((i18 & 16) != 0) {
            z17 = true;
        }
        efVar.r0(i17, jSONObject4, jSONObject5, jSONObject6, z17);
    }

    public final boolean A() {
        gk2.e eVar = I;
        return (eVar == null || ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0) == 0 || ((mm2.c1) eVar.a(mm2.c1.class)).U7() || f233384g) ? false : true;
    }

    public final void B(long j17) {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keepAlive delay:");
        sb6.append(j17);
        sb6.append(" curLive:");
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        sb6.append((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
        dk2.xg xgVar = f233393k0;
        if (xgVar != null) {
            xgVar.b();
        }
        dk2.xg xgVar2 = f233393k0;
        if (xgVar2 != null) {
            xgVar2.c(java.lang.Long.valueOf(j17));
        }
    }

    public final void C() {
        wu5.c cVar = dk2.x7.f234335b;
        if (cVar != null) {
            cVar.cancel(false);
        }
        wu5.c cVar2 = dk2.x7.f234337d;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        c();
        dk2.xg xgVar = f233391j0;
        if (xgVar != null) {
            xgVar.b();
        }
        dk2.xg xgVar2 = f233393k0;
        if (xgVar2 != null) {
            xgVar2.b();
        }
        dk2.xg xgVar3 = f233395l0;
        if (xgVar3 != null) {
            xgVar3.b();
        }
        dk2.kc.f233701f.d();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "removeBattleEndDelayTimer");
        com.tencent.mm.sdk.platformtools.u3.l(X);
        java.util.Iterator it = f233387h0.entrySet().iterator();
        while (it.hasNext()) {
            lk2.d dVar = (lk2.d) ((java.util.Map.Entry) it.next()).getValue();
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("LoopTask", "stopTaskLoop task: activeMicHeartBeat");
            dVar.f319012d.b();
        }
    }

    public final void D() {
        V(false);
        dk2.kc kcVar = dk2.kc.f233696a;
        dk2.kc.f233697b = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.b4 b4Var = dk2.kc.f233701f;
        b4Var.d();
        b4Var.c(60000L, 60000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(dk2.ad r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.E(dk2.ad, java.lang.String):void");
    }

    public final int F() {
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3850q1).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "mirroMode:" + intValue);
        return intValue;
    }

    public final boolean G() {
        kn0.i iVar;
        kn0.f fVar;
        kn0.i iVar2;
        kn0.f fVar2;
        boolean z17 = false;
        if (zl2.r4.f473950a.v2()) {
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        if ((e1Var != null ? e1Var.f328990t : null) != null) {
            mm2.e1 e1Var2 = (mm2.e1) i(mm2.e1.class);
            if (!((e1Var2 == null || (iVar2 = e1Var2.f328990t) == null || (fVar2 = iVar2.f309560d) == null || !fVar2.f309530b) ? false : true)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "use back camera, finalMirror:false");
                return z17;
            }
        }
        mm2.e1 e1Var3 = (mm2.e1) i(mm2.e1.class);
        z17 = (e1Var3 == null || (iVar = e1Var3.f328990t) == null || (fVar = iVar.f309560d) == null) ? true : fVar.f309533e;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "use front camera, finalMirror:" + z17);
        return z17;
    }

    public final void H(boolean z17) {
        te2.j0 q17 = q();
        if (!z17) {
            if (q17 != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "playStart");
                pm0.v.X(new te2.d1((te2.p1) q17));
                return;
            }
            return;
        }
        if (q17 != null) {
            te2.p1 p1Var = (te2.p1) q17;
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "playComplete");
            dk2.vg c17 = p1Var.c();
            if (c17 != null) {
                te2.d4.f417948a.c(p1Var.h(), 4, c17, false, true);
            }
            pm0.v.X(new te2.y0(p1Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r8.h8() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(int r7, r45.qp1 r8) {
        /*
            r6 = this;
            boolean r8 = dk2.ef.f233384g
            if (r8 == 0) goto L78
            java.lang.Class<mm2.c1> r8 = mm2.c1.class
            androidx.lifecycle.c1 r8 = r6.i(r8)
            mm2.c1 r8 = (mm2.c1) r8
            r0 = 0
            if (r8 == 0) goto L17
            boolean r8 = r8.h8()
            r1 = 1
            if (r8 != r1) goto L17
            goto L18
        L17:
            r1 = r0
        L18:
            if (r1 == 0) goto L78
            dk2.k6 r8 = dk2.ef.f233390j
            java.util.List r8 = r8.f233683a
            java.lang.String r1 = "externalLiveCallbacks"
            kotlin.jvm.internal.o.f(r8, r1)
            monitor-enter(r8)
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L75
        L28:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L73
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L75
            os5.n r2 = (os5.n) r2     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "FinderLiveExternalHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r4.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r5 = "onLiveForceQuit errCode:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L75
            r4.append(r7)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L75
            com.tencent.mars.xlog.Log.i(r3, r4)     // Catch: java.lang.Throwable -> L75
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75
            r3.<init>()     // Catch: java.lang.Throwable -> L75
            r45.nf4 r4 = new r45.nf4     // Catch: java.lang.Throwable -> L75
            r4.<init>()     // Catch: java.lang.Throwable -> L75
            com.tencent.mm.plugin.finder.assist.b3 r5 = com.tencent.mm.plugin.finder.assist.b3.f102022a     // Catch: java.lang.Throwable -> L75
            switch(r7) {
                case -200018: goto L5c;
                case -200017: goto L5c;
                case -200013: goto L5c;
                default: goto L59;
            }     // Catch: java.lang.Throwable -> L75
        L59:
            os5.m[] r5 = os5.m.f348289d     // Catch: java.lang.Throwable -> L75
            goto L61
        L5c:
            os5.m[] r5 = os5.m.f348289d     // Catch: java.lang.Throwable -> L75
            r5 = 19
            goto L62
        L61:
            r5 = r0
        L62:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L75
            r4.set(r0, r5)     // Catch: java.lang.Throwable -> L75
            r3.add(r4)     // Catch: java.lang.Throwable -> L75
            h63.d1 r2 = (h63.d1) r2     // Catch: java.lang.Throwable -> L75
            r4 = 0
            r2.a(r3, r4)     // Catch: java.lang.Throwable -> L75
            goto L28
        L73:
            monitor-exit(r8)
            goto L78
        L75:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.I(int, r45.qp1):void");
    }

    public final void J(int i17) {
        dk2.xf xfVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseLive: liveStarted:");
        mm2.c1 c1Var = (mm2.c1) i(mm2.c1.class);
        sb6.append(c1Var != null ? java.lang.Boolean.valueOf(c1Var.a8()) : null);
        sb6.append(", scene:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
        mm2.c1 c1Var2 = (mm2.c1) i(mm2.c1.class);
        boolean z17 = false;
        if (c1Var2 != null && c1Var2.a8()) {
            z17 = true;
        }
        if (z17 && (xfVar = A) != null) {
            ((dk2.r4) xfVar).d0(1, i17, new dk2.ge());
        }
    }

    public final void K(dk2.vg musicItem, int i17, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playMusic ");
        sb6.append(musicItem);
        sb6.append(", forcePlay:");
        sb6.append(z17);
        sb6.append(", stack:");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        r45.d22 d22Var = musicItem.f234254a;
        h0Var.f310123d = d22Var.getString(7);
        java.lang.String string = d22Var.getString(9);
        tn0.w0 f17 = f();
        mm2.c1 c1Var = (mm2.c1) i(mm2.c1.class);
        if (c1Var != null) {
            r5 = f17 != null ? java.lang.Boolean.valueOf(f17.N) : null;
            if (z17 || !kotlin.jvm.internal.o.b(r5, java.lang.Boolean.TRUE)) {
                c1Var.Z6().j(musicItem, i17);
            }
            r5 = jz5.f0.f302826a;
        }
        if (r5 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", "playMusic error curLiveRoomData is null!");
        }
        if (!dk2.q.f(d22Var)) {
            L(z17, musicItem, aVar, (java.lang.String) h0Var.f310123d);
        } else {
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).wi(string == null ? "" : string, true, false, new dk2.ke(musicItem, h0Var, z17, aVar, string));
        }
    }

    public final void L(boolean z17, dk2.vg vgVar, yz5.a aVar, java.lang.String str) {
        tn0.w0 f17 = f();
        java.lang.Boolean valueOf = f17 != null ? java.lang.Boolean.valueOf(f17.N) : null;
        if (z17 || !kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            if (f17 != null) {
                r45.rm1 g17 = dk2.q.g(vgVar.f234254a);
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "playBgMusic path:" + str2 + ", publish:true, loopCount:0, listener:" + this);
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = f17.L;
                if (audioMusicParam != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "already has playing music [" + audioMusicParam.path + ", " + audioMusicParam.publish + ", " + audioMusicParam.loopCount + "], stop it firstly.");
                    f17.T().getAudioEffectManager().stopPlayMusic(audioMusicParam.f46245id);
                    f17.T().getAudioEffectManager().setMusicObserver(audioMusicParam.f46245id, null);
                }
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam H2 = tn0.w0.H(f17, g17.getInteger(0), str2, false, 0, 12, null);
                f17.L = H2;
                f17.M = g17;
                f17.T().getAudioEffectManager().setMusicObserver(H2.f46245id, new tn0.j(this, f17));
                f17.T().getAudioEffectManager().startPlayMusic(H2);
            }
        }
    }

    public final void M(boolean z17) {
        jz5.f0 f0Var;
        dk2.p Z6;
        dk2.ef efVar;
        jz5.f0 f0Var2;
        dk2.vg vgVar;
        te2.j0 q17;
        com.tencent.mm.plugin.finder.live.view.k0 Y0;
        dk2.p Z62;
        mm2.c1 c1Var = (mm2.c1) i(mm2.c1.class);
        dk2.vg vgVar2 = null;
        dk2.vg d17 = (c1Var == null || (Z62 = c1Var.Z6()) == null) ? null : Z62.d();
        gk2.e eVar = I;
        if (eVar == null || d17 == null) {
            f0Var = null;
        } else {
            dk2.p Z63 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6();
            jz5.l c17 = Z63 != null ? Z63.c(d17, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233875d) : null;
            f0Var = jz5.f0.f302826a;
            te2.d4 d4Var = te2.d4.f417948a;
            dk2.ef efVar2 = f233372a;
            if (c17 == null || (vgVar = (dk2.vg) c17.f302833d) == null) {
                efVar = efVar2;
                f0Var2 = null;
            } else {
                zl2.r4 r4Var = zl2.r4.f473950a;
                if (r4Var.s1(eVar) && (q17 = efVar2.q()) != null) {
                    te2.p1 p1Var = (te2.p1) q17;
                    p1Var.f418292m = vgVar.f234254a;
                    if ((r4Var.s1(p1Var.f418287e) || p1Var.g()) && (Y0 = p1Var.f418289g.Y0()) != null) {
                        com.tencent.mm.plugin.finder.live.util.y.n(Y0, null, null, new te2.u0(p1Var, vgVar, null), 3, null);
                    }
                }
                efVar2.K(vgVar, ((java.lang.Number) c17.f302834e).intValue(), true, null);
                efVar2.H(z17);
                d4Var.c(((mm2.c1) eVar.a(mm2.c1.class)).a8(), 4, d17, false, true);
                efVar = efVar2;
                d4Var.c(((mm2.c1) eVar.a(mm2.c1.class)).a8(), 2, vgVar, false, true);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                ((mm2.c1) eVar.a(mm2.c1.class)).Z6().k(d17, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233875d);
                efVar.H(z17);
                in0.q e17 = efVar.e();
                if (e17 != null) {
                    e17.N = false;
                }
                d4Var.c(((mm2.c1) eVar.a(mm2.c1.class)).a8(), 4, d17, false, true);
            }
        }
        if (f0Var == null) {
            H(z17);
            in0.q e18 = e();
            if (e18 != null) {
                e18.N = false;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playNext error curMusicItem:");
            mm2.c1 c1Var2 = (mm2.c1) i(mm2.c1.class);
            if (c1Var2 != null && (Z6 = c1Var2.Z6()) != null) {
                vgVar2 = Z6.d();
            }
            sb6.append(vgVar2);
            sb6.append(",curLiveRoomData:");
            sb6.append(I);
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", sb6.toString());
        }
    }

    public final void N() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = f233380e;
        jz5.f0 f0Var = null;
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            em2.u uVar = f233386h;
            uVar.getClass();
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            uVar.f255171d = new em2.j(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).c(zy2.ra.class))).f135388t);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveService", "[preprocessOnShowMiniWindow] null live activity");
        }
    }

    public final void O(r45.na4 na4Var, com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams, kn0.g gVar) {
        java.lang.Boolean bool;
        r45.oa4 oa4Var;
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        if (e1Var != null && (oa4Var = na4Var.f381195d) != null) {
            e1Var.p7(oa4Var);
        }
        P(na4Var.f381195d);
        r45.ja4 ja4Var = na4Var.f381196e;
        if (ja4Var != null) {
            if (ja4Var.f377678d > 0) {
                vn0.b.f438174a.a().f455409g = ja4Var.f377678d;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "processLiveAudioSdkParam audioQuality:" + ja4Var.f377678d);
        }
        r45.ka4 ka4Var = na4Var.f381197f;
        if (ka4Var == null || tRTCParams == null || gVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "userDefineRecordId:" + ka4Var.f378533d + ',' + ka4Var.f378534e);
        java.lang.String str = ka4Var.f378534e;
        java.lang.String str2 = ka4Var.f378533d;
        int i17 = ka4Var.f378546q;
        java.lang.String str3 = ka4Var.Q;
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        if (!d11.s.Di(5)) {
            i17 = ka4Var.f378547r;
        }
        gVar.f309542i = ka4Var.f378547r;
        if (i17 < 100) {
            gVar.f309540g = kn0.a.f309493d;
            gVar.f309541h = i17;
        } else {
            hn0.a[] aVarArr = hn0.a.f282382d;
            if (i17 == 101) {
                gVar.f309540g = kn0.a.f309494e;
            } else if (i17 == 102) {
                gVar.f309540g = kn0.a.f309495f;
            }
        }
        java.util.LinkedList<r45.gv> cdn_trans_info = ka4Var.f378540m;
        if (!(cdn_trans_info == null || cdn_trans_info.isEmpty())) {
            kotlin.jvm.internal.o.f(cdn_trans_info, "cdn_trans_info");
            for (r45.gv gvVar : cdn_trans_info) {
                java.util.HashMap hashMap = gVar.f309544k;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(gvVar.f375538f);
                java.lang.String str4 = gvVar.f375537e;
                java.lang.String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                int i18 = gvVar.f375542m;
                java.lang.String str6 = gvVar.f375543n;
                java.lang.String str7 = gvVar.f375545p;
                if (str7 != null) {
                    str5 = str7;
                }
                hashMap.put(valueOf, new kn0.r(str4, i18, str6, str5));
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.sdk.platformtools.t8.K0(str2) || !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            cl0.g gVar2 = new cl0.g();
            mm2.c1 c1Var = (mm2.c1) i(mm2.c1.class);
            boolean booleanValue = (c1Var == null || (bool = c1Var.f328847n2) == null) ? false : bool.booleanValue();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !booleanValue) {
                gVar2.h("userdefine_streamid_main", str);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                gVar2.h("userdefine_record_id", str2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                gVar2.h("userdefine_push_args", str3);
            }
            cl0.g gVar3 = new cl0.g();
            gVar3.h("Str_uc_params", gVar2);
            tRTCParams.businessInfo = gVar3.toString();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "processLiveSdkParams cdnQualitySvrcfg" + gVar.f309541h + " cdnSwitchMode:" + gVar.f309540g + " cdn_quality_h265backcfg:" + gVar.f309542i);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0484  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(r45.oa4 r17) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.P(r45.oa4):void");
    }

    public final void Q(long j17) {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshMic delay:");
        sb6.append(j17);
        sb6.append(" curLive:");
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        sb6.append((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(" curLinkUser:");
        mm2.o4 o4Var = (mm2.o4) i(mm2.o4.class);
        sb6.append(o4Var != null ? o4Var.l7() : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
        dk2.xg xgVar = f233395l0;
        if (xgVar != null) {
            xgVar.c(java.lang.Long.valueOf(j17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.R():void");
    }

    public final void U(int i17) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new r45.qt2();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = f233380e;
        if (k0Var != null) {
            android.content.Context context = k0Var.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            h0Var.f310123d = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        }
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        long j17 = e1Var != null ? e1Var.f328983m : 0L;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = f233380e;
        if (k0Var2 != null) {
            com.tencent.mm.plugin.finder.live.util.y.f(k0Var2, kotlinx.coroutines.q1.f310570c, null, new dk2.ue(h0Var, j17, i17, null), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.x()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L24
            tn0.w0 r0 = dk2.ef.f233378d
            boolean r4 = r0 instanceof co0.s
            if (r4 == 0) goto L12
            co0.s r0 = (co0.s) r0
            goto L13
        L12:
            r0 = r3
        L13:
            if (r0 == 0) goto L1d
            boolean r0 = r0.X()
            if (r0 != r1) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 == 0) goto L21
            goto L24
        L21:
            f25.l r0 = f25.l.f259103c
            goto L26
        L24:
            f25.m r0 = f25.m.f259106c
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestAudioFocus audioFocusSession:"
            r4.<init>(r5)
            f25.m0 r5 = dk2.ef.f233401p
            r4.append(r5)
            java.lang.String r5 = ", skipResume:"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = ", gainFocus:"
            r4.append(r5)
            f25.m0 r5 = dk2.ef.f233401p
            if (r5 == 0) goto L4c
            g25.e r5 = (g25.e) r5
            boolean r5 = r5.f267980c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L4d
        L4c:
            r5 = r3
        L4d:
            r4.append(r5)
            java.lang.String r5 = ", requestScene: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.FinderLiveService"
            com.tencent.mars.xlog.Log.i(r5, r4)
            f25.m0 r4 = dk2.ef.f233401p
            if (r4 == 0) goto L7b
            if (r4 == 0) goto L6b
            g25.e r4 = (g25.e) r4
            f25.l0 r3 = r4.f267979b
        L6b:
            boolean r3 = kotlin.jvm.internal.o.b(r0, r3)
            if (r3 != 0) goto L7a
            java.lang.String r3 = "LiveAudioFocus requestAudioFocus abandonFocus"
            com.tencent.mars.xlog.Log.i(r5, r3)
            r6.c()
            goto L7b
        L7a:
            return
        L7b:
            java.lang.Class<f25.n0> r3 = f25.n0.class
            i95.m r3 = i95.n0.c(r3)
            f25.n0 r3 = (f25.n0) r3
            dk2.ve r4 = new dk2.ve
            r4.<init>(r0)
            f25.m0 r0 = r3.m9(r0, r4)
            dk2.ef.f233401p = r0
            if (r0 == 0) goto L97
            g25.e r0 = (g25.e) r0
            boolean r0 = r0.f267980c
            if (r0 != r1) goto L97
            goto L98
        L97:
            r1 = r2
        L98:
            if (r1 != 0) goto La2
            dk2.ad r7 = dk2.ad.f233206f
            java.lang.String r0 = "not gain focus"
            r6.E(r7, r0)
            goto La7
        La2:
            java.lang.String r0 = "requestAudioFocus"
            r6.p(r0, r7)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.V(boolean):void");
    }

    public final void W() {
        tn0.w0 w0Var = f233378d;
        boolean z17 = w0Var instanceof co0.s;
        if (z17) {
            java.lang.Integer num = null;
            co0.s sVar = z17 ? (co0.s) w0Var : null;
            if (sVar != null) {
                kn0.p pVar = sVar.D;
                pVar.getClass();
                pVar.f309583c = kn0.j.f309562d;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMic", "[sdk]stop link mic");
                vn0.e eVar = sVar.f420764m;
                if (!(eVar != null && eVar.f438185c == 21)) {
                    vn0.c cVar = vn0.b.f438174a;
                    cVar.a().getClass();
                    cVar.d().getClass();
                    vn0.e eVar2 = sVar.f420764m;
                    if (eVar2 != null) {
                        int i17 = eVar2.f438185c != 20 ? 20 : 21;
                        com.tencent.trtc.TRTCCloud tRTCCloud = eVar2.f438183a;
                        if (tRTCCloud != null) {
                            tRTCCloud.switchRole(i17);
                        }
                        eVar2.f438185c = i17;
                    }
                    vn0.e eVar3 = sVar.f420764m;
                    if (eVar3 != null) {
                        eVar3.f438183a.stopLocalAudio();
                    }
                    sVar.H0();
                    sVar.f420771r.h(null);
                    sVar.D(false);
                    sVar.E = false;
                }
                num = 0;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "requestLinkMic ret:" + num);
        }
    }

    public final void X() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = f233386h.f255168a;
        gk2.e eVar = I;
        if (finderLiveMiniView == null || eVar == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView.j(finderLiveMiniView, false, eVar, em2.d0.A, new org.json.JSONObject(), new org.json.JSONObject(), null, null, 96, null);
    }

    public final void Y(r45.oa4 it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (f233384g) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "[LiveSdkParams] setAnchorMicCloudVideoConfig encBR: " + it.f382079g + " encResEnum: " + it.f382076d + " encResEnum_HEVC: " + it.f382088s + " capFps_HEVC: " + it.f382089t + " capFps: " + it.f382078f);
            int i17 = it.f382079g;
            vn0.c cVar = vn0.b.f438174a;
            if (i17 > 0) {
                cVar.c().f455433f = it.f382079g;
            }
            if (it.f382076d > 0) {
                cVar.c().f455431d = it.f382076d;
            }
            if (it.f382088s > 0) {
                cVar.c().f455435h = it.f382088s;
            }
            if (it.f382089t > 0) {
                cVar.c().f455436i = it.f382089t;
            }
            if (it.f382078f > 0) {
                cVar.c().f455432e = it.f382078f;
            }
        }
    }

    public final void Z() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "setAnchorPauseMiniView");
        tn0.w0 w0Var = f233378d;
        if (w0Var != null) {
            w0Var.y(2);
        }
    }

    public final void a0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("write curControllerStore to :");
        sb6.append(liveRoomControllerStore != null ? liveRoomControllerStore.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
        f233371J = liveRoomControllerStore;
    }

    @Override // hn0.i
    public void b(int i17, r45.fa4 fa4Var) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = f233380e;
        if (k0Var != null) {
            k0Var.callbackSEIData(i17, fa4Var);
        }
    }

    public final void b0(gk2.e eVar) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "write curLiveRoomData to :" + eVar);
        I = eVar;
        com.tencent.mm.app.MMCrashReportContents.D.e(java.lang.Boolean.valueOf(eVar != null));
        com.tencent.mm.app.MMBugReportContents.f53230k.f53729s.e(java.lang.Boolean.valueOf(eVar != null));
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "LiveAudioFocus abandonFocus " + f233401p);
        f25.m0 m0Var = f233401p;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f233401p = null;
    }

    public final void c0(java.lang.String str) {
        if (!kotlin.jvm.internal.o.b(str, f233403r)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "customGiftCodeVersion from " + f233403r + " to " + str);
        }
        f233403r = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hn0.i
    public void callback(int i17, android.os.Bundle bundle) {
        gk2.e eVar;
        int i18;
        java.util.ArrayList parcelableArrayList;
        kn0.p pVar;
        int i19;
        if (i17 == 31) {
            gk2.e eVar2 = I;
            if (eVar2 != null) {
                com.tencent.mm.plugin.finder.assist.u8 u8Var = com.tencent.mm.plugin.finder.assist.u8.f102599a;
                if (eVar2 != null) {
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    i19 = r4Var.W1(eVar2) ? 2 : r4Var.z1(eVar2) ? 3 : 1;
                } else {
                    i19 = 0;
                }
                u8Var.b(eVar2, i19, i17, "connectionLost", "0-vBitrate:" + hn0.v.f282442c);
            }
        } else if (i17 == 32 && (eVar = I) != null) {
            com.tencent.mm.plugin.finder.assist.u8 u8Var2 = com.tencent.mm.plugin.finder.assist.u8.f102599a;
            if (eVar != null) {
                zl2.r4 r4Var2 = zl2.r4.f473950a;
                i18 = r4Var2.W1(eVar) ? 2 : r4Var2.z1(eVar) ? 3 : 1;
            } else {
                i18 = 0;
            }
            u8Var2.b(eVar, i18, i17, "connectionRecovery", "0-vBitrate:" + hn0.v.f282442c);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = f233380e;
        if (k0Var != null) {
            k0Var.onLiveEventCallback(i17, bundle);
        }
        if (f233384g) {
            mm2.c1 c1Var = (mm2.c1) i(mm2.c1.class);
            if (c1Var != null && c1Var.Y4) {
                dk2.k6 k6Var = f233390j;
                gk2.e eVar3 = I;
                tn0.w0 w0Var = f233378d;
                com.tencent.mm.live.core.core.model.UserVolumeInfo userVolumeInfo = null;
                java.lang.String str = (w0Var == null || (pVar = w0Var.D) == null) ? null : pVar.f309586f;
                k6Var.getClass();
                if (i17 != 19) {
                    if (i17 != 3) {
                        if (i17 == 4) {
                            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
                            com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1143L);
                            if (eVar3 != null) {
                                com.tencent.mm.plugin.finder.assist.u8.f102599a.b(eVar3, 1144, i17, "externalErrorBackgroundReport", "0-vBitrate:" + hn0.v.f282442c);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (w0Var == null) {
                        return;
                    }
                    java.util.List<os5.n> externalLiveCallbacks = k6Var.f233683a;
                    kotlin.jvm.internal.o.f(externalLiveCallbacks, "externalLiveCallbacks");
                    synchronized (externalLiveCallbacks) {
                        for (os5.n nVar : externalLiveCallbacks) {
                            int i27 = w0Var.R;
                            int i28 = k6Var.f233685c;
                            ((h63.d1) nVar).getClass();
                            com.tencent.mm.ipcinvoker.extension.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.H, null, 0, new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload(i27, i28), 6, null), p60.q.class, null);
                        }
                    }
                    return;
                }
                if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("live_user_volume_info")) != null) {
                    synchronized (parcelableArrayList) {
                        java.util.Iterator it = parcelableArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (com.tencent.mm.sdk.platformtools.t8.D0(((com.tencent.mm.live.core.core.model.UserVolumeInfo) next).f68557d, str)) {
                                userVolumeInfo = next;
                                break;
                            }
                        }
                    }
                    userVolumeInfo = userVolumeInfo;
                }
                if (userVolumeInfo != null) {
                    java.util.List<os5.n> externalLiveCallbacks2 = k6Var.f233683a;
                    kotlin.jvm.internal.o.f(externalLiveCallbacks2, "externalLiveCallbacks");
                    synchronized (externalLiveCallbacks2) {
                        for (os5.n nVar2 : externalLiveCallbacks2) {
                            com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", "onLiveVoiceVolume user:" + userVolumeInfo.f68557d + " volume:" + userVolumeInfo.f68558e);
                            ((h63.d1) nVar2).b(userVolumeInfo.f68558e);
                        }
                    }
                }
            }
        }
    }

    public final android.util.Size d0(int i17, int i18, boolean z17, boolean z18) {
        android.util.Size size;
        android.util.Size size2;
        vn0.c cVar = vn0.b.f438174a;
        if (z18 && ((java.lang.Boolean) ((jz5.n) V).getValue()).booleanValue()) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            int i19 = cVar.d().f455431d;
            if (i19 == 3) {
                size = new android.util.Size(160, 160);
            } else if (i19 != 7) {
                if (i19 == 56) {
                    size2 = z17 ? new android.util.Size(240, com.tencent.mapsdk.internal.km.f50100e) : new android.util.Size(com.tencent.mapsdk.internal.km.f50100e, 240);
                } else if (i19 == 62) {
                    size = z17 ? new android.util.Size(480, 640) : new android.util.Size(640, 480);
                } else if (i19 == 104) {
                    size2 = z17 ? new android.util.Size(192, 336) : new android.util.Size(336, 192);
                } else if (i19 == 108) {
                    size = z17 ? new android.util.Size(368, 640) : new android.util.Size(640, 368);
                } else if (i19 == 110) {
                    size2 = z17 ? new android.util.Size(544, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT) : new android.util.Size(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, 544);
                } else if (i19 != 112) {
                    size = i19 != 114 ? z17 ? new android.util.Size(1088, 1920) : new android.util.Size(1920, 1088) : z17 ? new android.util.Size(1088, 1920) : new android.util.Size(1920, 1088);
                } else {
                    size2 = z17 ? new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280) : new android.util.Size(1280, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH);
                }
                size = size2;
            } else {
                size = new android.util.Size(480, 480);
            }
            if (size.getWidth() > 0 && size.getHeight() > 0 && (i17 > size.getWidth() || i18 > size.getHeight())) {
                float f17 = i17;
                float width = f17 / size.getWidth();
                float f18 = i18;
                float height = f18 / size.getHeight();
                if (width < height) {
                    width = height;
                }
                int i27 = (int) (f17 / width);
                int i28 = (int) (f18 / width);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "setCustomResolution(hevc:" + cVar.d().f455444t + ") isVertical:" + z17 + ", but resolution too large,scale:" + width + ",oriSize:" + i17 + '*' + i18 + ",newSize:" + i27 + '*' + i28 + ";maxSize:" + size + '!');
                i17 = i27;
                i18 = i28;
            }
        }
        cVar.d().f455449y = i17;
        cVar.d().f455450z = i18;
        cVar.d().f455441q = z17;
        cVar.c().f455441q = z17;
        tn0.w0 w0Var = f233378d;
        if (w0Var != null) {
            w0Var.Q0();
        }
        return new android.util.Size(i17, i18);
    }

    public final in0.q e() {
        tn0.w0 w0Var = f233378d;
        if (w0Var == null || !(w0Var instanceof in0.q)) {
            return null;
        }
        kotlin.jvm.internal.o.e(w0Var, "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore");
        return (in0.q) w0Var;
    }

    public final void e0(com.tencent.mm.plugin.finder.live.widget.de value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (!kotlin.jvm.internal.o.b(value.f118100a.getString(0), f233406u.f118100a.getString(0))) {
            f233408w = java.lang.System.currentTimeMillis();
        }
        f233406u = value;
    }

    public final tn0.w0 f() {
        in0.q e17 = e();
        if (e17 != null) {
            return e17;
        }
        tn0.w0 w0Var = f233378d;
        if (w0Var == null || !(w0Var instanceof sn0.b)) {
            return null;
        }
        return (sn0.b) w0Var;
    }

    public final void f0(java.lang.Integer num) {
        F = num;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "#floatWindowEnterMode set:" + num);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(gk2.e r31, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r32, com.tencent.mm.plugin.finder.live.view.k0 r33, int r34, r45.qt2 r35) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.g(gk2.e, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore, com.tencent.mm.plugin.finder.live.view.k0, int, r45.qt2):void");
    }

    public final void g0(km2.n nVar) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "FinderLiveDataModel set " + nVar);
        H = nVar;
    }

    public final void h0(com.tencent.mm.plugin.finder.live.widget.qv value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (!kotlin.jvm.internal.o.b(value.f119555a.getString(0), f233407v.f119555a.getString(0))) {
            f233409x = java.lang.System.currentTimeMillis();
        }
        f233407v = value;
    }

    public final androidx.lifecycle.c1 i(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        gk2.e eVar = I;
        if (eVar != null) {
            return eVar.a(bu6);
        }
        return null;
    }

    public final void i0(boolean z17) {
        if (z17 != E) {
            E = z17;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "SliderBarEntranceExpose: " + z17);
        }
    }

    public final dk2.xf j(com.tencent.mm.live.view.BaseLivePluginLayout baseLivePluginLayout) {
        if (!(baseLivePluginLayout instanceof com.tencent.mm.plugin.finder.live.view.k0)) {
            pm0.z.b(xy2.b.f458155b, "Finder.FinderLiveService_wrongPlugin", false, pm0.w.f356804e, null, false, false, dk2.gd.f233527d, 56, null);
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", "A FinderBaseLivePluginLayout is needed to check assistant. Got " + baseLivePluginLayout + " instead. Will skip check.");
            return A;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) baseLivePluginLayout;
        dk2.xf tempFinderLiveAssistant = k0Var.getTempFinderLiveAssistant();
        dk2.xf xfVar = A;
        if (xfVar == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", "Null FinderLiveService finderLiveAssistant");
        } else if (tempFinderLiveAssistant == null) {
            pm0.z.b(xy2.b.f458155b, "Finder.FinderLiveService_nullPluginAssistant", false, pm0.w.f356804e, null, false, false, dk2.hd.f233584d, 56, null);
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", "Null plugin finderLiveAssistant: FinderLiveService finderLiveAssistant " + dk2.yf.a(xfVar));
        } else if (kotlin.jvm.internal.o.b(tempFinderLiveAssistant, xfVar)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "check finderLiveAssistant ok. " + dk2.yf.a(xfVar));
        } else {
            pm0.z.b(xy2.b.f458155b, "Finder.FinderLiveService_incorrectAssistant", false, pm0.w.f356804e, null, false, false, dk2.id.f233625d, 56, null);
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", "Incorrect finderLiveAssistant: expected " + k0Var.getTempRoomLog() + ", actual " + dk2.yf.a(xfVar));
        }
        return xfVar;
    }

    public final void j0() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "setupBeautyAndFilterConfig start");
        mm2.c1 c1Var = (mm2.c1) i(mm2.c1.class);
        ko0.c0.f309825a.d(c1Var != null ? c1Var.O3 : true);
    }

    public final dk2.xf k(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        java.lang.ref.WeakReference weakReference = ((mm2.l2) buContext.a(mm2.l2.class)).f329218f;
        return j(weakReference != null ? (com.tencent.mm.live.view.BaseLivePluginLayout) weakReference.get() : null);
    }

    public final void k0() {
        f233391j0 = new dk2.xg("heartBeatLooper", null, f233383f0, 2, null);
        f233393k0 = new dk2.xg("keepLiveLooper", null, f233385g0, 2, null);
        f233395l0 = new dk2.xg("refreshMicLooper", null, f233389i0, 2, null);
        f233387h0.put("activeMicHeartBeat", new lk2.c());
    }

    public final boolean l() {
        java.lang.String lowerCase = wo.w0.m().toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        boolean z17 = !r26.n0.D(f233400o, lowerCase, false, 2, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "enableDynamicVideoParam notSupportDynamicVideoParamDevice:" + f233400o + " model:" + lowerCase + " result:" + z17);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r2.Y4 == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(androidx.appcompat.app.AppCompatActivity r11, android.os.Bundle r12, yz5.a r13) {
        /*
            r10 = this;
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.o.g(r11, r2)
            java.lang.String r2 = "failCallback"
            kotlin.jvm.internal.o.g(r13, r2)
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r3 = r10.i(r2)
            mm2.c1 r3 = (mm2.c1) r3
            if (r3 == 0) goto L72
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f328846n
            if (r3 == 0) goto L72
            dk2.ef r4 = dk2.ef.f233372a
            java.lang.Class<mm2.n0> r5 = mm2.n0.class
            androidx.lifecycle.c1 r5 = r4.i(r5)
            mm2.n0 r5 = (mm2.n0) r5
            qe2.a.f(r3, r5)
            java.lang.Class<c61.ub> r5 = c61.ub.class
            i95.m r5 = i95.n0.c(r5)
            java.lang.String r6 = "getService(...)"
            kotlin.jvm.internal.o.f(r5, r6)
            c61.ub r5 = (c61.ub) r5
            com.tencent.mm.plugin.finder.storage.h90 r6 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion
            r7 = 16384(0x4000, float:2.2959E-41)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r6.a(r3, r7)
            r6 = 9
            r3.setMediaType(r6)
            if (r12 != 0) goto L47
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            goto L48
        L47:
            r6 = r12
        L48:
            androidx.lifecycle.c1 r2 = r4.i(r2)
            mm2.c1 r2 = (mm2.c1) r2
            r4 = 0
            if (r2 == 0) goto L57
            boolean r2 = r2.Y4
            r7 = 1
            if (r2 != r7) goto L57
            goto L58
        L57:
            r7 = r4
        L58:
            if (r7 == 0) goto L5f
            java.lang.String r2 = "Retr_show_success_tips"
            r6.putBoolean(r2, r4)
        L5f:
            r4 = 0
            dk2.ye r7 = new dk2.ye
            r7.<init>(r11, r13)
            r8 = 8
            r9 = 0
            r0 = r5
            r1 = r11
            r2 = r3
            r3 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            c61.ub.ah(r0, r1, r2, r3, r4, r5, r6, r7)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.l0(androidx.appcompat.app.AppCompatActivity, android.os.Bundle, yz5.a):void");
    }

    public final void m(yz5.s callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        tn0.w0 w0Var = f233378d;
        gk2.e eVar = I;
        dk2.xf xfVar = A;
        dk2.k6 k6Var = f233390j;
        k6Var.getClass();
        jz5.f0 f0Var = null;
        kn0.i iVar = eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f328990t : null;
        if (w0Var != null && iVar != null && eVar != null) {
            hn0.h.f(w0Var, iVar, false, false, 6, null);
            com.tencent.mm.plugin.finder.assist.p8.c(com.tencent.mm.plugin.finder.assist.p8.f102460a, com.tencent.mm.plugin.finder.assist.t8.f102579y.f102540b, null, false, false, 14, null);
            zl2.r4.f473950a.d3(w0Var);
            w0Var.E(new dk2.c6(eVar, xfVar, callback, k6Var));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            callback.v(java.lang.Boolean.FALSE, -1, -1, null, null);
        }
    }

    public final void m0(android.os.Bundle bundle, android.content.Context context) {
        kn0.p pVar;
        kn0.p pVar2;
        boolean z17 = bundle.getBoolean("PARAM_FINDER_LIVE_FORCE_TASK", false);
        int i17 = bundle.getInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showMiniWindowWithoutPermissionCheck: forceMoveTask:");
        sb6.append(z17);
        sb6.append(", generateType:");
        sb6.append(i17);
        sb6.append(", isFloatMode:");
        tn0.w0 w0Var = f233378d;
        sb6.append((w0Var == null || (pVar2 = w0Var.D) == null) ? null : java.lang.Boolean.valueOf(pVar2.f()));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
        tn0.w0 w0Var2 = f233378d;
        if ((w0Var2 == null || (pVar = w0Var2.D) == null || pVar.f()) ? false : true) {
            ml2.m5.f327718a.b();
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
            ((ku5.t0) ku5.t0.f312615d).h(dk2.lg.f233737d, "Finder.LiveExceptionMonitor");
            N();
            tn0.w0 w0Var3 = f233378d;
            if (w0Var3 != null) {
                mm2.c1 c1Var = (mm2.c1) i(mm2.c1.class);
                w0Var3.G(new jn0.a(context, z17, true, i17, 0, c1Var != null ? c1Var.I4 : null, false, null, false, null, false, 2000, null));
            }
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = f233371J;
            if (liveRoomControllerStore != null) {
                if2.z.f291153a.b(liveRoomControllerStore);
            }
            mm2.c1 c1Var2 = (mm2.c1) i(mm2.c1.class);
            if (pm0.v.z(c1Var2 != null ? c1Var2.f328807g2 : 0, 524288)) {
                Z();
            }
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.j0.f327583i.T.f327665l++;
    }

    public final void n(boolean z17, int i17) {
        java.util.List<os5.n> externalLiveCallbacks = f233390j.f233683a;
        kotlin.jvm.internal.o.f(externalLiveCallbacks, "externalLiveCallbacks");
        synchronized (externalLiveCallbacks) {
            for (os5.n nVar : externalLiveCallbacks) {
                com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", "onPostResult result:" + z17 + " errType:" + i17);
                ((h63.d1) nVar).d(z17, i17);
            }
        }
    }

    public final void n0() {
        gk2.e eVar;
        kn0.p pVar;
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopRefreshMic curLive:");
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        boolean z17 = false;
        sb6.append((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(" curLinkUser:");
        mm2.o4 o4Var = (mm2.o4) i(mm2.o4.class);
        sb6.append(o4Var != null ? o4Var.l7() : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
        dk2.xg xgVar = f233395l0;
        if (xgVar != null) {
            xgVar.b();
        }
        em2.u uVar = f233386h;
        uVar.getClass();
        tn0.w0 w0Var = f233378d;
        if (w0Var != null && (pVar = w0Var.D) != null && !pVar.f()) {
            z17 = true;
        }
        if (z17 || (eVar = I) == null) {
            return;
        }
        pm0.v.X(new em2.s(eVar, uVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if ((r0.f309584d == kn0.m.f309576g) == true) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r4 = this;
            tn0.w0 r0 = dk2.ef.f233378d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            kn0.p r0 = r0.D
            if (r0 == 0) goto L12
            boolean r0 = r0.f()
            if (r0 != r1) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 != 0) goto L49
            tn0.w0 r0 = dk2.ef.f233378d
            if (r0 == 0) goto L29
            kn0.p r0 = r0.D
            if (r0 == 0) goto L29
            kn0.m r0 = r0.f309584d
            kn0.m r3 = kn0.m.f309576g
            if (r0 != r3) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 != r1) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L2d
            goto L49
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fullScreen liveStatus:"
            r0.<init>(r1)
            tn0.w0 r1 = dk2.ef.f233378d
            if (r1 == 0) goto L3b
            kn0.p r1 = r1.D
            goto L3c
        L3b:
            r1 = 0
        L3c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveService"
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto L64
        L49:
            ku5.u0 r0 = ku5.t0.f312615d
            dk2.mg r1 = dk2.mg.f233782d
            java.lang.String r2 = "Finder.LiveExceptionMonitor"
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r1, r2)
            tn0.w0 r0 = dk2.ef.f233378d
            if (r0 == 0) goto L5b
            r0.h0()
        L5b:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = dk2.ef.f233371J
            if (r0 == 0) goto L64
            if2.z r1 = if2.z.f291153a
            r1.e(r0)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.o():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x014c, code lost:
    
        if (r9 == null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final gk2.e o0(km2.m r28) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.o0(km2.m):gk2.e");
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i17, int i18) {
        M(true);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i17, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "[onPlayBgmProgress], " + i17 + " , " + j17 + " ," + j18);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i17, int i18) {
        jz5.f0 f0Var;
        kn0.p pVar;
        kn0.p pVar2;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = f233380e;
        gk2.e eVar = I;
        if (k0Var == null || eVar == null) {
            f0Var = null;
        } else {
            if (i18 != 0) {
                boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
                dk2.ef efVar = f233372a;
                if (isConnected) {
                    tn0.w0 w0Var = f233378d;
                    if (!((w0Var == null || (pVar2 = w0Var.D) == null || pVar2.f309590j != 2) ? false : true)) {
                        if (!((w0Var == null || (pVar = w0Var.D) == null || pVar.f309590j != 3) ? false : true)) {
                            efVar.M(false);
                        }
                    }
                }
                te2.j0 q17 = efVar.q();
                if (q17 != null) {
                    te2.p1 p1Var = (te2.p1) q17;
                    com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "playError songId:" + i17);
                    gk2.e eVar2 = p1Var.f418287e;
                    jz5.l b17 = ((mm2.c1) eVar2.a(mm2.c1.class)).Z6().b(java.lang.String.valueOf(i17));
                    ((mm2.c1) eVar2.a(mm2.c1.class)).Z6().k((dk2.vg) b17.f302833d, ((java.lang.Number) b17.f302834e).intValue());
                    pm0.v.X(new te2.z0(p1Var));
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "onStart:" + i17 + " error,but network error!");
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", "onStart error curLiveLayout:" + f233380e + ",curLiveRoomData:" + I);
        }
        if (i18 != 0) {
            pm0.v.X(dk2.ee.f233370d);
        }
    }

    public final void p(java.lang.String source, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", source + " AudioFocus gain skipResume: " + z17);
        mm2.w wVar = (mm2.w) i(mm2.w.class);
        boolean z18 = (wVar != null && wVar.O6()) || z();
        mm2.c1 c1Var = (mm2.c1) i(mm2.c1.class);
        boolean z19 = pm0.v.z(c1Var != null ? c1Var.f328807g2 : 0, 524288);
        tn0.w0 w0Var = f233378d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null) {
            sVar.f1(z18 || z19);
            if (!z19) {
                hn0.r rVar = sVar.R1;
                if (!rVar.h() && !z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCdnPlayerManager", "resumePlay");
                    mn0.b0 b0Var = rVar.f282409a;
                    if (b0Var != null) {
                        ((mn0.y) b0Var).y();
                    }
                }
            }
        }
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        if (!(e1Var != null && e1Var.b7())) {
            tn0.w0 w0Var2 = f233378d;
            in0.q qVar = w0Var2 instanceof in0.q ? (in0.q) w0Var2 : null;
            if (qVar != null) {
                qVar.f0(z18 || z19);
            }
        }
        f233375b0 = true;
        java.util.Iterator it = ((java.util.ArrayList) f233402q).iterator();
        while (it.hasNext()) {
            try {
                df2.k2 k2Var = (df2.k2) ((dk2.wf) it.next());
                k2Var.getClass();
                kotlin.jvm.internal.o.g(source, "source");
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onAudioFocusGain - source: ".concat(source));
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "startMediaBrowser - Start requested");
                d75.b.g(new df2.i2(k2Var));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Finder.FinderLiveService", "notifyAudioFocusGain error: " + e17.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0242, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, (r4 == null || (r4 = r4.f328988r) == null) ? null : java.lang.Long.valueOf(r4.getLong(r1))) != false) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(gk2.e r18, boolean r19, qo0.b r20, android.os.Bundle r21, long r22) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ef.p0(gk2.e, boolean, qo0.b, android.os.Bundle, long):void");
    }

    public final te2.j0 q() {
        com.tencent.mm.plugin.finder.live.plugin.h8 h8Var;
        te2.j0 j0Var = f233373a0;
        if (j0Var != null) {
            return j0Var;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = f233380e;
        if (k0Var == null || (h8Var = (com.tencent.mm.plugin.finder.live.plugin.h8) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.h8.class)) == null) {
            return null;
        }
        return h8Var.f112785q;
    }

    public final void q0(r45.nz6 videoParams) {
        r45.ma4 ma4Var;
        r45.oa4 oa4Var;
        kotlin.jvm.internal.o.g(videoParams, "videoParams");
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        if (e1Var == null || (ma4Var = e1Var.f328987q) == null) {
            return;
        }
        if (ma4Var.f380300m == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "updateAnchorVideoQuality: sdk_params is null, skip");
            return;
        }
        r45.na4 na4Var = new r45.na4();
        byte[] bArr = ma4Var.f380300m.f192156a;
        if (bArr != null) {
            try {
                na4Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            if (na4Var != null || (oa4Var = na4Var.f381195d) == null) {
            }
            int i17 = videoParams.f381779e;
            oa4Var.f382076d = i17;
            int i18 = videoParams.f381780f;
            oa4Var.f382078f = i18;
            int i19 = videoParams.f381781g;
            oa4Var.f382079g = i19;
            int i27 = videoParams.f381782h;
            oa4Var.f382086q = i27;
            oa4Var.f382088s = i17;
            oa4Var.f382089t = i18;
            oa4Var.f382090u = i19;
            oa4Var.f382091v = i27;
            f233372a.P(oa4Var);
            tn0.w0 w0Var = f233378d;
            if (w0Var != null) {
                w0Var.Q0();
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "updateAnchorVideoQuality applied videoQualityLevel:" + videoParams.f381778d);
            return;
        }
        na4Var = null;
        if (na4Var != null) {
        }
    }

    public final com.tencent.mm.plugin.finder.live.view.k0 r() {
        return f233380e;
    }

    public final void r0(int i17, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17) {
        android.graphics.Point size;
        kn0.p pVar;
        em2.u uVar = f233386h;
        uVar.getClass();
        tn0.w0 w0Var = f233378d;
        boolean z18 = true;
        if ((w0Var == null || (pVar = w0Var.D) == null || !pVar.i()) ? false : true) {
            em2.d0.A = i17;
            em2.d0.B = jSONObject2;
            em2.d0.C = jSONObject;
            em2.d0.D = jSONObject3;
            return;
        }
        if (i17 == 3 && jSONObject2 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = uVar.f255168a;
        gk2.e eVar = I;
        if (finderLiveMiniView == null || eVar == null) {
            return;
        }
        tn0.w0 w0Var2 = f233378d;
        if (w0Var2 != null) {
            fo0.q qVar = w0Var2.O().f264826m;
            if (qVar == null || (size = qVar.f264837b) == null) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                size = w0Var2.z(context, ((mm2.c1) eVar.a(mm2.c1.class)).O7());
            }
            kotlin.jvm.internal.o.g(size, "size");
            fo0.c.f264798a.getClass();
            fo0.c.f264799b.a(size);
        }
        tn0.w0 w0Var3 = f233378d;
        co0.s sVar = w0Var3 instanceof co0.s ? (co0.s) w0Var3 : null;
        if (sVar != null) {
            if (!tn0.w0.Y(sVar, null, 1, null) && !sVar.D.h()) {
                z18 = false;
            }
            fo0.n nVar = sVar.f420767p;
            if (nVar.f264830q != z18) {
                nVar.f264830q = z18;
                pm0.v.X(new fo0.k(z18));
            }
        }
        if (!finderLiveMiniView.f116044s || ((mm2.e1) eVar.a(mm2.e1.class)).g7()) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView.j(finderLiveMiniView, z17, eVar, i17, jSONObject, jSONObject2, jSONObject3, null, 64, null);
        }
    }

    public final boolean s() {
        return R;
    }

    public final lk2.d t(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return (lk2.d) f233387h0.get(key);
    }

    public final void t0(r45.ma4 ma4Var) {
        mm2.e1 e1Var;
        if (!f233384g || (e1Var = (mm2.e1) i(mm2.e1.class)) == null) {
            return;
        }
        try {
            com.tencent.mm.protobuf.f parseFrom = new r45.na4().parseFrom(ma4Var.f380300m.f192156a);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveSdkParams");
            r45.na4 na4Var = (r45.na4) parseFrom;
            dk2.ef efVar = f233372a;
            kn0.i iVar = e1Var.f328990t;
            efVar.O(na4Var, iVar != null ? iVar.f309557a : null, iVar != null ? iVar.f309558b : null);
            tn0.w0 w0Var = f233378d;
            if (w0Var != null) {
                w0Var.Q0();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSdkParam lastFps:");
            tn0.w0 w0Var2 = f233378d;
            sb6.append(w0Var2 != null ? java.lang.Integer.valueOf(w0Var2.Q) : null);
            sb6.append(" new Fps:");
            vn0.c cVar = vn0.b.f438174a;
            sb6.append(cVar.d().f455432e);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
            tn0.w0 w0Var3 = f233378d;
            if (w0Var3 == null || !(w0Var3 instanceof in0.q)) {
                return;
            }
            boolean z17 = true;
            if ((w0Var3 != null && w0Var3.Q == cVar.d().f455432e) || !efVar.l()) {
                return;
            }
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var == null || !c1Var.Y4) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            pm0.v.X(dk2.cf.f233300d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveService", "updateSdkParam fail:" + e17.getMessage());
        }
    }

    public final dk2.tb u() {
        return f233392k;
    }

    public final co0.s u0() {
        tn0.w0 w0Var = f233378d;
        if (w0Var != null && (w0Var instanceof co0.s)) {
            kotlin.jvm.internal.o.e(w0Var, "null cannot be cast to non-null type com.tencent.mm.live.core.core.visitor.LiveVisitorTRTCCore");
            return (co0.s) w0Var;
        }
        if (w0Var == null || !(w0Var instanceof sn0.b)) {
            return null;
        }
        kotlin.jvm.internal.o.e(w0Var, "null cannot be cast to non-null type com.tencent.mm.live.core.core.secdevice.LiveSecondaryDeviceTRTCCore");
        return (sn0.b) w0Var;
    }

    public final void v(long j17, long j18) {
        pm0.v.X(new dk2.ae(j18, j17));
    }

    public final void w() {
        ae2.in inVar = ae2.in.f3688a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.D1).getValue()).r()).intValue() == 1;
        if (z17 != f233404s) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "enableCustomGift from " + f233404s + " to " + z17);
        }
        f233404s = z17;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.E1).getValue()).r()).intValue() == 1;
        if (z18 != f233405t) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "lazyLoadCustomGiftPagResource from " + f233405t + " to " + z18);
        }
        f233405t = z18;
        c0(((it2.x) ((rs5.f) i95.n0.c(rs5.f.class))).Bi());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "initCustomGiftSwitch enableCustomGift:" + f233404s + ",customGiftCodeVersion:" + f233403r + ",lazyLoadCustomGiftPagResource:" + f233405t + '!');
    }

    public final boolean x() {
        gk2.e eVar = I;
        return (eVar == null || ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0) == 0 || ((mm2.c1) eVar.a(mm2.c1.class)).U7() || !f233384g) ? false : true;
    }

    public final boolean y(java.lang.String str) {
        mm2.e1 e1Var = (mm2.e1) i(mm2.e1.class);
        return (str == null || str.length() == 0) || !com.tencent.mm.sdk.platformtools.t8.D0(str, e1Var != null ? e1Var.f328995y : null);
    }

    public final boolean z() {
        return ws2.k1.f449066r.a().f449071c != null;
    }
}
