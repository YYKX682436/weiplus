package dh2;

/* loaded from: classes10.dex */
public final class x implements ah2.b, ah2.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f232467d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f232468e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloud f232469f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f232470g;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.a f232471h;

    /* renamed from: i, reason: collision with root package name */
    public final dh2.d0 f232472i;

    /* renamed from: m, reason: collision with root package name */
    public ah2.c f232473m;

    /* renamed from: n, reason: collision with root package name */
    public final dh2.w f232474n;

    /* renamed from: o, reason: collision with root package name */
    public int f232475o;

    /* renamed from: p, reason: collision with root package name */
    public long f232476p;

    /* renamed from: q, reason: collision with root package name */
    public long f232477q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole f232478r;

    /* renamed from: s, reason: collision with root package name */
    public final hh2.a f232479s;

    /* renamed from: t, reason: collision with root package name */
    public final hh2.a f232480t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f232481u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f232482v;

    public x(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore controllerStore, gk2.e buContext, com.tencent.trtc.TRTCCloud trtcCloud, kotlinx.coroutines.y0 liveScope, zh2.a singService, dh2.d0 singScene) {
        kotlin.jvm.internal.o.g(controllerStore, "controllerStore");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(trtcCloud, "trtcCloud");
        kotlin.jvm.internal.o.g(liveScope, "liveScope");
        kotlin.jvm.internal.o.g(singService, "singService");
        kotlin.jvm.internal.o.g(singScene, "singScene");
        this.f232467d = controllerStore;
        this.f232468e = buContext;
        this.f232469f = trtcCloud;
        this.f232470g = liveScope;
        this.f232471h = singService;
        this.f232472i = singScene;
        this.f232474n = new dh2.w(this);
        hh2.a bVar = ((om2.l) buContext.a(om2.l.class)).O6() == 2 ? new ih2.b(ya.b.SCORE) : new ih2.e();
        bVar.b((om2.m) ((kotlinx.coroutines.flow.h3) ((om2.e) buContext.a(om2.e.class)).f346297p).getValue());
        bVar.a(new dh2.v(this));
        this.f232479s = bVar;
        hh2.a bVar2 = ((om2.l) buContext.a(om2.l.class)).O6() == 2 ? new ih2.b("ear") : new ih2.e();
        bVar2.b((om2.m) ((kotlinx.coroutines.flow.h3) ((om2.e) buContext.a(om2.e.class)).f346297p).getValue());
        this.f232480t = bVar2;
        this.f232481u = new java.util.concurrent.ConcurrentHashMap();
        this.f232482v = new java.util.concurrent.ConcurrentHashMap();
        kotlinx.coroutines.l.d(liveScope, null, null, new dh2.o(this, null), 3, null);
        kotlinx.coroutines.l.d(liveScope, null, null, new dh2.u(this, null), 3, null);
        kotlinx.coroutines.l.d(liveScope, null, null, new dh2.g(this, null), 3, null);
        kotlinx.coroutines.l.d(liveScope, null, null, new dh2.k(this, null), 3, null);
        kotlinx.coroutines.l.d(liveScope, null, null, new dh2.s(this, null), 3, null);
        kotlinx.coroutines.l.d(liveScope, null, null, new dh2.q(this, null), 3, null);
        kotlinx.coroutines.l.d(liveScope, null, null, new dh2.i(this, null), 3, null);
    }

    @Override // jh2.a
    public void B5(java.lang.String songUniqueId, float f17) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        c();
        if (d(songUniqueId)) {
            dh2.d0 d0Var = this.f232472i;
            java.util.Objects.toString(d0Var);
            int ordinal = d0Var.ordinal();
            gk2.e eVar = this.f232468e;
            if (ordinal == 0) {
                om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f346307n;
                if (iVar != null) {
                    int i17 = (int) f17;
                    synchronized (iVar.f346324d) {
                        iVar.f346324d.f375980d = i17;
                    }
                    return;
                }
                return;
            }
            if (ordinal != 1) {
                return;
            }
            mm2.m6 m6Var = (mm2.m6) eVar.a(mm2.m6.class);
            int i18 = (int) f17;
            m6Var.F = i18;
            ((kotlinx.coroutines.flow.h3) m6Var.G).k(java.lang.Integer.valueOf(i18));
        }
    }

    @Override // jh2.a
    public void E0(java.lang.String songUniqueId, jh2.d errorParams) {
        gh2.b bVar;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        kotlin.jvm.internal.o.g(errorParams, "errorParams");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "notifyChorusSingError songUniqueId: ".concat(songUniqueId));
        if (d(songUniqueId)) {
            boolean e17 = e();
            zh2.a aVar = this.f232471h;
            gk2.e eVar = this.f232468e;
            if (!e17) {
                b("notifyChorusSingError");
                java.util.List list = (java.util.List) ((kotlinx.coroutines.flow.h3) ((om2.g) eVar.a(om2.g.class)).A).getValue();
                if (list != null) {
                    kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.ktv.controller.FinderLiveKTVSingController");
                    ((ch2.o2) aVar).v7(list, false);
                    return;
                }
                return;
            }
            om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f346307n;
            if (iVar != null) {
                zh2.a.b3(aVar, iVar.f346321a, null, 2, null);
            }
            b("notifyChorusSingError");
            pm0.v.X(dh2.a.f232417d);
            int ordinal = errorParams.f299807a.ordinal();
            if (ordinal == 0) {
                bVar = gh2.b.f271862o;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                bVar = gh2.b.f271861n;
            }
            ((gh2.f) eVar.a(gh2.f.class)).O6(songUniqueId, bVar, new dh2.b(errorParams));
        }
    }

    @Override // jh2.a
    public void I4(java.lang.String songUniqueId) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "notifyFinishSing songUniqueId: " + songUniqueId + ", role: " + this.f232478r);
        if (e() && d(songUniqueId)) {
            om2.i iVar = ((om2.g) this.f232468e.a(om2.g.class)).f346307n;
            if (iVar != null) {
                this.f232471h.x5(iVar.f346321a, null);
            }
            b("notifyFinishSing");
        }
    }

    @Override // jh2.a
    public void M4(java.lang.String songUniqueId, int i17, boolean z17, float f17) {
        om2.i iVar;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        if (e()) {
            if (zl2.q4.f473933a.E()) {
                com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "hitGrove , grove: " + i17 + " hit: " + z17 + " timeStamp: " + f17 + " songUniqueId: " + songUniqueId + " cur: " + c());
            }
            if (d(songUniqueId) && (iVar = ((om2.g) this.f232468e.a(om2.g.class)).f346307n) != null) {
                int i18 = (int) f17;
                synchronized (iVar.f346325e) {
                    r45.ga4 ga4Var = iVar.f346325e;
                    ga4Var.f375037d = i17;
                    ga4Var.f375038e = i18;
                    ga4Var.f375039f = 20;
                    ga4Var.f375040g = z17;
                }
                synchronized (iVar.f346324d) {
                    iVar.f346324d.f375980d = i18;
                }
            }
        }
    }

    @Override // bh2.b
    public void P1(java.lang.String songUniqueId, int i17) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "onPlayBGMEnd , songUniqueId: " + songUniqueId + " errorCode: " + i17 + " cur: " + c() + " role: " + this.f232478r);
        if (e() && d(songUniqueId)) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f232467d;
            kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
            if2.z.f291153a.i(liveRoomControllerStore, new bh2.d(liveRoomControllerStore, songUniqueId, i17));
        }
    }

    @Override // jh2.a
    public void R0(java.lang.String songUniqueId, int i17) {
        om2.i iVar;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "onSongInfoPaserCallback songUniqueId: " + songUniqueId + " totalSentence: " + i17 + ", role: " + this.f232478r);
        if (e() && d(songUniqueId) && (iVar = ((om2.g) this.f232468e.a(om2.g.class)).f346307n) != null) {
            iVar.f346327g = i17;
        }
    }

    public final void a() {
        ah2.c cVar = this.f232473m;
        if (!(cVar instanceof dh2.b0)) {
            com.tencent.mars.xlog.Log.w("KTVSongPlayManager", "setEngineVolume: engine is not LiveKTVSingEngine");
            return;
        }
        dh2.b0 b0Var = (dh2.b0) cVar;
        java.util.Collection values = this.f232482v.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.lang.Integer num = (java.lang.Integer) kz5.n0.o0(values);
        dh2.w wVar = this.f232474n;
        int intValue = num != null ? num.intValue() : wVar.a();
        java.util.Collection values2 = this.f232481u.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        java.lang.Integer num2 = (java.lang.Integer) kz5.n0.o0(values2);
        int intValue2 = num2 != null ? num2.intValue() : wVar.a();
        com.tencent.mars.xlog.Log.i(b0Var.f232424d, "setVolume playoutVolume: " + intValue + ", publishVolume: " + intValue2);
        b0Var.f232431k.d(intValue, intValue2);
    }

    @Override // bh2.b
    public void a0(java.lang.String songUniqueId, int i17) {
        tn0.w0 Q6;
        vn0.e eVar;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "onPlayBGMStart, songUniqueId: " + songUniqueId + " errorCode: " + i17 + " cur: " + c() + " role: " + this.f232478r);
        a();
        if (e() && d(songUniqueId)) {
            gk2.e eVar2 = this.f232468e;
            om2.i iVar = ((om2.g) eVar2.a(om2.g.class)).f346307n;
            if (iVar != null) {
                iVar.j(r45.y84.LIVE_KTV_SING_STATE_SINGING, null);
            }
            om2.i iVar2 = ((om2.g) eVar2.a(om2.g.class)).f346307n;
            if (iVar2 != null) {
                iVar2.k(0, 0, 0.0f, 0);
            }
            om2.i iVar3 = ((om2.g) eVar2.a(om2.g.class)).f346307n;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f232467d;
            if (iVar3 != null) {
                ch2.o2 o2Var = (ch2.o2) liveRoomControllerStore.controller(ch2.o2.class);
                iVar3.h((o2Var == null || (Q6 = o2Var.Q6()) == null || (eVar = Q6.f420764m) == null) ? -1 : eVar.c());
            }
            kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
            if2.z.f291153a.i(liveRoomControllerStore, new bh2.g(liveRoomControllerStore, songUniqueId, i17));
        }
    }

    public final void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "clearStates, source: " + str);
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "destroyCurSingEngine, source: " + str);
        ah2.c cVar = this.f232473m;
        if (cVar != null) {
            dh2.b0 b0Var = (dh2.b0) cVar;
            com.tencent.mars.xlog.Log.i(b0Var.f232424d, "stop");
            jh2.c cVar2 = b0Var.f232426f;
            if (cVar2 != null) {
                cVar2.e(null);
            }
            jh2.c cVar3 = b0Var.f232426f;
            if (cVar3 != null) {
                cVar3.j();
            }
            b0Var.f232431k.destroy();
            kotlinx.coroutines.r2 r2Var = b0Var.f232429i;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        this.f232473m = null;
        this.f232478r = null;
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "currChorusRole: null");
    }

    public final java.lang.String c() {
        r45.ia4 ia4Var;
        int ordinal = this.f232472i.ordinal();
        gk2.e eVar = this.f232468e;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ((mm2.m6) eVar.a(mm2.m6.class)).N6();
            }
            throw new jz5.j();
        }
        om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f346307n;
        if (iVar == null || (ia4Var = iVar.f346323c) == null) {
            return null;
        }
        return ia4Var.f376870e;
    }

    public final boolean d(java.lang.String str) {
        return kotlin.jvm.internal.o.b(c(), str);
    }

    public final boolean e() {
        com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole = this.f232478r;
        return tXChorusRole == null || tXChorusRole == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger;
    }

    @Override // jh2.a
    public void e4(java.lang.String songUniqueId) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "notifySingSuccess songUniqueId: " + songUniqueId + ", role: " + this.f232478r);
        if (e() && d(songUniqueId)) {
            ((gh2.f) this.f232468e.a(gh2.f.class)).O6(songUniqueId, gh2.b.f271855e, new dh2.e(this));
        }
    }

    @Override // jh2.a
    public void e6(java.lang.String songUniqueId, jh2.d errorParams) {
        gh2.b bVar;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        kotlin.jvm.internal.o.g(errorParams, "errorParams");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "notifySingError songUniqueId: ".concat(songUniqueId));
        if (d(songUniqueId)) {
            boolean e17 = e();
            zh2.a aVar = this.f232471h;
            gk2.e eVar = this.f232468e;
            if (!e17) {
                b("notifySingError");
                java.util.List list = (java.util.List) ((kotlinx.coroutines.flow.h3) ((om2.g) eVar.a(om2.g.class)).A).getValue();
                if (list != null) {
                    kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.ktv.controller.FinderLiveKTVSingController");
                    ((ch2.o2) aVar).v7(list, false);
                    return;
                }
                return;
            }
            om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f346307n;
            if (iVar != null) {
                zh2.a.b3(aVar, iVar.f346321a, null, 2, null);
            }
            b("notifySingError");
            pm0.v.X(dh2.c.f232432d);
            int ordinal = errorParams.f299807a.ordinal();
            if (ordinal == 0) {
                bVar = gh2.b.f271862o;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                bVar = gh2.b.f271861n;
            }
            ((gh2.f) eVar.a(gh2.f.class)).O6(songUniqueId, bVar, new dh2.d(errorParams));
        }
    }

    public void f() {
        ah2.c cVar;
        ah2.c cVar2 = this.f232473m;
        boolean z17 = false;
        if (cVar2 != null && ((dh2.b0) cVar2).b()) {
            z17 = true;
        }
        if (!z17 || (cVar = this.f232473m) == null) {
            return;
        }
        dh2.b0 b0Var = (dh2.b0) cVar;
        long currentTimeMillis = (java.lang.System.currentTimeMillis() - b0Var.f232427g) + b0Var.f232428h;
        ah2.d dVar = b0Var.f232425e;
        if (dVar != null) {
            om2.s sVar = b0Var.f232423c;
            dVar.B5(sVar != null ? sVar.a() : "", (float) currentTimeMillis);
        }
    }

    @Override // jh2.a
    public void f6(java.lang.String songUniqueId) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "notifyVoiceEnd songUniqueId: " + songUniqueId + ", role: " + this.f232478r);
        if (e() && d(songUniqueId)) {
            gk2.e eVar = this.f232468e;
            om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f346307n;
            if (iVar != null) {
                r45.y84 y84Var = r45.y84.LIVE_KTV_SING_STATE_END;
                java.util.List list = ((om2.g) eVar.a(om2.g.class)).f346311r;
                iVar.j(y84Var, list != null ? (r45.yx1) kz5.n0.a0(list, 1) : null);
            }
            om2.i iVar2 = ((om2.g) eVar.a(om2.g.class)).f346307n;
            if (iVar2 != null) {
                this.f232471h.r(iVar2.f346321a, null);
            }
        }
    }

    public void g(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (e() && tRTCAudioFrame != null) {
            ah2.c cVar = this.f232473m;
            if (cVar != null && ((dh2.b0) cVar).b()) {
                ah2.c cVar2 = this.f232473m;
                if (cVar2 != null) {
                    dh2.b0 b0Var = (dh2.b0) cVar2;
                    com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole = b0Var.f232422b;
                    if ((tXChorusRole == null || tXChorusRole == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger) && b0Var.b()) {
                        long currentTimeMillis = (java.lang.System.currentTimeMillis() - b0Var.f232427g) + b0Var.f232428h;
                        com.tencent.mars.xlog.Log.i(b0Var.f232424d, "onScoreProcess offsetTime: " + currentTimeMillis + " localBGMProgress: " + b0Var.f232430j);
                        om2.s sVar = b0Var.f232423c;
                        if ((sVar == null || sVar.f346379b.f346369c) ? false : true) {
                            ah2.d dVar = b0Var.f232425e;
                            if (dVar != null) {
                                dVar.M4(sVar != null ? sVar.a() : "", 0, false, (float) currentTimeMillis);
                            }
                        } else {
                            jh2.c cVar3 = b0Var.f232426f;
                            if (cVar3 != null) {
                                cVar3.g(tRTCAudioFrame, currentTimeMillis, ((dh2.w) b0Var.f232421a).c());
                            }
                        }
                    }
                }
                if (this.f232474n.c()) {
                    return;
                }
                this.f232479s.c(tRTCAudioFrame);
            }
        }
    }

    @Override // bh2.b
    public void g1(java.lang.String songUniqueId) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "onPlayBGMPause, songUniqueId: " + songUniqueId + " cur: " + c() + " role: " + this.f232478r);
        if (e() && d(songUniqueId)) {
            om2.i iVar = ((om2.g) this.f232468e.a(om2.g.class)).f346307n;
            if (iVar != null) {
                iVar.e();
            }
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f232467d;
            kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
            if2.z.f291153a.i(liveRoomControllerStore, new bh2.e(liveRoomControllerStore, songUniqueId));
        }
    }

    public void h(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame != null) {
            long j17 = tRTCAudioFrame.timestamp;
            if (j17 - this.f232476p > (zl2.q4.f473933a.E() ? 1000L : 2000L)) {
                long networkTimestamp = com.tencent.rtmp.TXLiveBase.getNetworkTimestamp();
                r45.w74 w74Var = new r45.w74();
                hn0.u uVar = hn0.u.f282437e;
                w74Var.f388944d = 256;
                r45.ua4 ua4Var = new r45.ua4();
                ua4Var.f387166d = networkTimestamp;
                long j18 = this.f232477q;
                this.f232477q = 1 + j18;
                ua4Var.f387167e = j18;
                w74Var.f388945e = ua4Var;
                tRTCAudioFrame.extraData = w74Var.toByteArray();
                this.f232476p = j17;
                if (this.f232477q >= com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                    this.f232477q = 0L;
                }
            }
        }
    }

    public void i(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        byte[] bArr;
        r45.ua4 ua4Var;
        if (tRTCAudioFrame == null || (bArr = tRTCAudioFrame.extraData) == null) {
            return;
        }
        try {
            r45.w74 w74Var = new r45.w74();
            try {
                w74Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            int i17 = (int) w74Var.f388944d;
            hn0.u uVar = hn0.u.f282437e;
            if (!pm0.v.z(i17, 256) || (ua4Var = w74Var.f388945e) == null) {
                return;
            }
            long j17 = ua4Var.f387166d;
            if (j17 > 0) {
                long networkTimestamp = com.tencent.rtmp.TXLiveBase.getNetworkTimestamp();
                if (networkTimestamp >= j17) {
                    long j18 = networkTimestamp - j17;
                    if (str != null) {
                        ((gh2.f) this.f232468e.a(gh2.f.class)).N6(str, j18);
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("KTVSongPlayManager", "handleSeiMessage onRemoteUserAudioFrame Exception:" + e18.getMessage());
        }
    }

    public void j() {
        ah2.c cVar = this.f232473m;
        if (cVar != null) {
            dh2.b0 b0Var = (dh2.b0) cVar;
            com.tencent.mars.xlog.Log.i(b0Var.f232424d, "pause");
            b0Var.f232431k.pause();
        }
    }

    public void k(dh2.c0 source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "resetVolume source: " + source);
        this.f232481u.remove(source);
        this.f232482v.remove(source);
        a();
    }

    public void l() {
        ah2.c cVar = this.f232473m;
        if (cVar != null) {
            dh2.b0 b0Var = (dh2.b0) cVar;
            com.tencent.mars.xlog.Log.i(b0Var.f232424d, "resume");
            b0Var.f232431k.resume();
        }
    }

    public final void m(int i17) {
        com.tencent.liteav.audio.TXAudioEffectManager audioEffectManager;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVoiceCaptureVolume isMute: ");
        dh2.w wVar = this.f232474n;
        sb6.append(wVar.c());
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", sb6.toString());
        if (wVar.c() || (audioEffectManager = this.f232469f.getAudioEffectManager()) == null) {
            return;
        }
        audioEffectManager.setVoiceCaptureVolume(i17);
    }

    public final void n(int i17) {
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "setVoiceEarCaptureVolume value: " + i17 + " mute: " + this.f232474n.c());
        this.f232469f.getAudioEffectManager().setVoiceEarMonitorVolume((int) (((float) i17) * 0.8f));
    }

    public void o(java.lang.Integer num, java.lang.Integer num2, dh2.c0 source) {
        kotlin.jvm.internal.o.g(source, "source");
        if (num != null) {
            num.intValue();
        }
        if (num2 != null) {
            num2.intValue();
        }
        a();
    }

    @Override // bh2.b
    public void o2(java.lang.String songUniqueId) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "onPlayBGMStop, songUniqueId: " + songUniqueId + " cur: " + c() + " role: " + this.f232478r);
        if (e() && d(songUniqueId)) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f232467d;
            kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
            if2.z.f291153a.i(liveRoomControllerStore, new bh2.h(liveRoomControllerStore, songUniqueId));
        }
    }

    public void p(om2.s songInfo, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSingSong isFinish: ");
        ah2.c cVar = this.f232473m;
        jh2.c cVar2 = null;
        sb6.append(cVar != null ? java.lang.Boolean.valueOf(((dh2.b0) cVar).f232431k.c()) : null);
        sb6.append(" role: ");
        sb6.append(tXChorusRole);
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", sb6.toString());
        b("startSingSong");
        this.f232478r = tXChorusRole;
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "currChorusRole: " + tXChorusRole);
        ah2.c cVar3 = this.f232473m;
        com.tencent.trtc.TRTCCloud tRTCCloud = this.f232469f;
        dh2.w wVar = this.f232474n;
        if (cVar3 == null) {
            com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "startSingSong, init LiveKTVSingEngine");
            this.f232473m = new dh2.b0(tRTCCloud, wVar, tXChorusRole);
            this.f232476p = 0L;
            this.f232477q = 0L;
        } else if (tXChorusRole != null && (cVar3 instanceof dh2.b0)) {
            com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "updateChorusRole: " + tXChorusRole);
            ah2.c cVar4 = this.f232473m;
            kotlin.jvm.internal.o.e(cVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.ktv.core.LiveKTVSingEngine");
            bh2.c cVar5 = ((dh2.b0) cVar4).f232431k;
            if (cVar5 instanceof bh2.v) {
                bh2.v vVar = (bh2.v) cVar5;
                vVar.getClass();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateChorusRole role: ");
                sb7.append(tXChorusRole);
                sb7.append(" musicPlayer: ");
                com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = vVar.f20897e;
                sb7.append(tXChorusMusicPlayer);
                com.tencent.mars.xlog.Log.i(vVar.f20895c, sb7.toString());
                vVar.f20904l = tXChorusRole;
                if (tXChorusMusicPlayer != null) {
                    tXChorusMusicPlayer.setChorusRole(tXChorusRole, vVar.f20899g);
                }
            }
        }
        bh2.w wVar2 = wVar.d() ? bh2.w.f20906e : bh2.w.f20905d;
        ah2.c cVar6 = this.f232473m;
        if (cVar6 != null) {
            dh2.b0 b0Var = (dh2.b0) cVar6;
            java.lang.String concat = "LiveKTVSingEngine_".concat(songInfo.a());
            b0Var.f232424d = concat;
            com.tencent.mars.xlog.Log.i(concat, "start channel: " + wVar2 + ", songData: " + songInfo);
            b0Var.f232423c = songInfo;
            if (zl2.q4.f473933a.E() && ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3788k).getValue()).r()).intValue() == 1) {
                r26.n0.D(songInfo.a(), "000arL322n7lX4", false, 2, null);
            }
            om2.p pVar = songInfo.f346379b;
            if (pVar.f346369c) {
                com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole2 = b0Var.f232422b;
                if (tXChorusRole2 == null || tXChorusRole2 == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger) {
                    cVar2 = ((om2.l) ((dh2.w) b0Var.f232421a).f232466a.f232468e.a(om2.l.class)).P6() == 2 ? new kh2.r() : new kh2.l();
                    cVar2.a(new om2.u(songInfo.a(), pVar));
                }
            }
            b0Var.f232426f = cVar2;
            b0Var.f232431k.b(wVar2, songInfo);
        }
        ah2.c cVar7 = this.f232473m;
        if (cVar7 != null) {
            dh2.b0 b0Var2 = (dh2.b0) cVar7;
            b0Var2.f232425e = this;
            b0Var2.f232431k.g(new dh2.a0(this, b0Var2, new kotlin.jvm.internal.c0()));
            jh2.c cVar8 = b0Var2.f232426f;
            if (cVar8 != null) {
                cVar8.e(new jh2.f(this));
            }
        }
        tRTCCloud.getAudioEffectManager().enableVoiceEarMonitor(((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((om2.e) wVar.f232466a.f232468e.a(om2.e.class)).f346295n).getValue()).booleanValue());
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "observeVoiceVolumeChange: " + wVar.b());
        m(wVar.b());
        n(wVar.b());
    }

    @Override // bh2.b
    public void s0(java.lang.String songUniqueId, long j17) {
        tn0.w0 Q6;
        vn0.e eVar;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "onPlayBGMResumed, progressMs: " + j17 + " songUniqueId: " + songUniqueId + " cur: " + c() + " role: " + this.f232478r);
        if (e() && d(songUniqueId)) {
            gk2.e eVar2 = this.f232468e;
            om2.i iVar = ((om2.g) eVar2.a(om2.g.class)).f346307n;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f232467d;
            if (iVar != null) {
                ch2.o2 o2Var = (ch2.o2) liveRoomControllerStore.controller(ch2.o2.class);
                iVar.f((o2Var == null || (Q6 = o2Var.Q6()) == null || (eVar = Q6.f420764m) == null) ? -1 : eVar.c());
            }
            om2.i iVar2 = ((om2.g) eVar2.a(om2.g.class)).f346307n;
            if (iVar2 != null) {
                iVar2.j(r45.y84.LIVE_KTV_SING_STATE_SINGING, null);
            }
            kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
            if2.z.f291153a.i(liveRoomControllerStore, new bh2.f(liveRoomControllerStore, songUniqueId, j17));
        }
    }

    @Override // jh2.a
    public void v1(java.lang.String songUniqueId, int i17, int i18, float f17, int i19, float f18) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "scoreLineResult, songUniqueId: " + songUniqueId + " curScore: " + i17 + " totalScore: " + i18 + " avgScore: " + f17 + " sentenceIndex: " + i19 + " cur: " + c() + ", role: " + this.f232478r);
        if (e() && d(songUniqueId)) {
            gk2.e eVar = this.f232468e;
            om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f346307n;
            if (iVar != null) {
                if (i17 < 85 && 70 <= i17) {
                    iVar.f346328h++;
                } else if (i17 >= 85) {
                    iVar.f346329i++;
                }
            }
            om2.i iVar2 = ((om2.g) eVar.a(om2.g.class)).f346307n;
            if (iVar2 != null) {
                iVar2.k(i17, i18, f17, i19);
            }
        }
    }

    @Override // bh2.b
    public void y2(java.lang.String songUniqueId, long j17, long j18) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        if (e() && !d(songUniqueId)) {
            c();
        }
    }
}
