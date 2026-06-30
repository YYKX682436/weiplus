package vw;

@j95.b
/* loaded from: classes11.dex */
public final class m2 extends i95.w implements rv.k3 {

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f440686f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.l1 f440687g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f440688h;

    /* renamed from: i, reason: collision with root package name */
    public long f440689i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f440690m;

    /* renamed from: w, reason: collision with root package name */
    public long f440700w;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440684d = "MicroMsg.FlutterBizFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f440685e = kotlinx.coroutines.z0.b();

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f440691n = jz5.h.b(new vw.y1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f440692o = jz5.h.b(new vw.l2(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f440693p = jz5.h.b(new vw.a1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f440694q = jz5.h.b(new vw.z0(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f440695r = jz5.h.b(new vw.j1(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f440696s = jz5.h.b(vw.i2.f440663d);

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f440697t = jz5.h.b(new vw.x1(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f440698u = jz5.h.b(vw.l1.f440678d);

    /* renamed from: v, reason: collision with root package name */
    public final long f440699v = 15000;

    public static final void wi(vw.m2 m2Var) {
        m2Var.getClass();
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(32266, new java.lang.Object[0]);
            com.tencent.wechat.mm.biz.g0 c17 = yw.q3.f466437a.c();
            if (c17 != null) {
                c17.s(vw.i1.f440662a);
            }
        }
    }

    public rv.l3 Ai() {
        long j17;
        java.lang.String str;
        java.lang.String str2;
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("FinderMyTab");
        r45.vs2 vs2Var = L0 != null ? L0.field_ctrInfo : null;
        r45.f03 I0 = nk6.I0("FinderMyTab");
        java.util.Objects.toString(vs2Var);
        java.util.Objects.toString(I0);
        boolean z17 = (vs2Var == null || I0 == null || com.tencent.mm.sdk.platformtools.t8.K0(I0.f373889f)) ? false : true;
        if (!z17 || vs2Var == null) {
            j17 = 0;
        } else {
            java.lang.String str3 = vs2Var.f388490h;
            j17 = str3 != null && r26.i0.y(str3, "BizPhotoLocal_", false) ? 10L : 20L;
        }
        java.lang.String str4 = "";
        if (I0 == null || (str = I0.f373889f) == null) {
            str = "";
        }
        java.lang.String t17 = r26.i0.t(str, ",", ";", false);
        if (vs2Var != null && (str2 = vs2Var.f388499t) != null) {
            str4 = str2;
        }
        java.lang.String t18 = r26.i0.t(str4, ",", ";", false);
        com.tencent.mars.xlog.Log.i(this.f440684d, "collectRedDotInfo result: hasRedDot=" + z17 + ", redDotType=" + j17 + ", redDotContent=" + t17 + ", redDotId=" + t18);
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = nk6.L0("FinderMentionMyTab");
        return new rv.l3(z17, j17, t17, t18, (L02 != null ? L02.field_ctrInfo : null) != null, nk6.I0("FinderMentionMyTab") != null ? r0.f373888e : 0L);
    }

    public void Bi(android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, boolean z17, rv.f3 f3Var, rv.i3 i3Var) {
        ij();
        kotlinx.coroutines.l.d(this.f440685e, null, null, new vw.d1(context, i3Var, i17, i18, str, str2, i19, z17, f3Var, null), 3, null);
    }

    public boolean Di() {
        boolean z17;
        synchronized (yw.q3.f466437a) {
            z17 = yw.q3.f466440d;
        }
        return z17;
    }

    public void Ni() {
        com.tencent.wechat.mm.biz.g0 c17;
        com.tencent.wechat.mm.finder_box.c0 a17;
        com.tencent.wechat.mm.biz.n3 n3Var = null;
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Di()) {
            if (Zi()) {
                com.tencent.mm.pluginsdk.model.e eVar = com.tencent.mm.pluginsdk.model.e.f189277a;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.R("brandService").getLong("k_LastPullCreationCenterInfoTime", java.lang.System.currentTimeMillis());
                yw.q3 q3Var = yw.q3.f466437a;
                if (gm0.j1.a() && (c17 = q3Var.c()) != null) {
                    n3Var = c17.g();
                }
                boolean z17 = currentTimeMillis > ((long) (n3Var != null ? n3Var.f218378f : Integer.MAX_VALUE));
                r45.dn c18 = eVar.c();
                boolean z18 = (c18 != null ? c18.f372587n : 0) == 1;
                if (z18 && z17 && yw.h1.f466332a.n()) {
                    ur1.j jVar = ur1.j.f430354a;
                    if (ur1.n.f430361a.a()) {
                        jVar.a().n(true);
                    }
                    com.tencent.mm.sdk.platformtools.o4.R("brandService").putLong("k_LastPullCreationCenterInfoTime", java.lang.System.currentTimeMillis());
                }
                com.tencent.mars.xlog.Log.i(this.f440684d, "[onBizMainCellExpose] requestCreationCenterInfo  reachTime=" + z17 + " personalCenterFeatureOn=" + z18);
                yw.w1.f466487a.a("mainCellExpose");
                ij();
                pm0.v.X(vw.q1.f440720d);
                ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).ij("brandServiceBoxExpose");
                if (yw.h1.f466332a.b()) {
                    com.tencent.wechat.mm.biz.g0.f218063b.F(vw.r1.f440724a);
                    return;
                }
                return;
            }
            return;
        }
        y40.i0 i0Var = (y40.i0) z40.e.get();
        java.lang.String str = i0Var.f459295d;
        com.tencent.mars.xlog.Log.i(str, "onBizMainCellExpose");
        if (i0Var.Di()) {
            com.tencent.mm.pluginsdk.model.e eVar2 = com.tencent.mm.pluginsdk.model.e.f189277a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.R("brandService").getLong("k_LastPullCreationCenterInfoTime", java.lang.System.currentTimeMillis());
            com.tencent.wechat.mm.finder_box.p2 f17 = (gm0.j1.a() && (a17 = a50.e1.f1471a.a()) != null) ? a17.f() : null;
            boolean z19 = currentTimeMillis2 > ((long) (f17 != null ? f17.f219734f : Integer.MAX_VALUE));
            r45.dn c19 = eVar2.c();
            boolean z27 = (c19 != null ? c19.f372587n : 0) == 1;
            if (z27 && z19 && yw.h1.f466332a.n()) {
                ur1.j jVar2 = ur1.j.f430354a;
                if (ur1.n.f430361a.a()) {
                    jVar2.a().n(true);
                }
                com.tencent.mm.sdk.platformtools.o4.R("brandService").putLong("k_LastPullCreationCenterInfoTime", java.lang.System.currentTimeMillis());
            }
            com.tencent.mars.xlog.Log.i(str, "[onBizMainCellExpose] requestCreationCenterInfo  reachTime=" + z19 + " personalCenterFeatureOn=" + z27);
            a50.v0.f1544a.a("mainCellExpose");
            boolean Vi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Vi();
            if ((!i0Var.f459299h && !Vi) || (!Vi && ((java.lang.Boolean) ((jz5.n) i0Var.f459305q).getValue()).booleanValue())) {
                yw.y1.f466513c = true;
                com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = yw.y1.f466512b;
                yw.y1.f466512b = bizEnterStatusInfo != null ? bizEnterStatusInfo.copy((r44 & 1) != 0 ? bizEnterStatusInfo.enterSource : null, (r44 & 2) != 0 ? bizEnterStatusInfo.openArticleFromScene : null, (r44 & 4) != 0 ? bizEnterStatusInfo.isTeenMode : null, (r44 & 8) != 0 ? bizEnterStatusInfo.redDotCount : null, (r44 & 16) != 0 ? bizEnterStatusInfo.pos : null, (r44 & 32) != 0 ? bizEnterStatusInfo.finderLiveRedDotType : null, (r44 & 64) != 0 ? bizEnterStatusInfo.finderFeedExportId : null, (r44 & 128) != 0 ? bizEnterStatusInfo.exposeMsgType : null, (r44 & 256) != 0 ? bizEnterStatusInfo.exposeUserName : null, (r44 & 512) != 0 ? bizEnterStatusInfo.lastExposeId : null, (r44 & 1024) != 0 ? bizEnterStatusInfo.lastExposeMsgId : null, (r44 & 2048) != 0 ? bizEnterStatusInfo.lastExposeMid : null, (r44 & 4096) != 0 ? bizEnterStatusInfo.sessionId : null, (r44 & 8192) != 0 ? bizEnterStatusInfo.enterTime : null, (r44 & 16384) != 0 ? bizEnterStatusInfo.netType : null, (r44 & 32768) != 0 ? bizEnterStatusInfo.isHeadsetOn : null, (r44 & 65536) != 0 ? bizEnterStatusInfo.redDotReportItem : null, (r44 & 131072) != 0 ? bizEnterStatusInfo.createEngineGroup : java.lang.Boolean.TRUE, (r44 & 262144) != 0 ? bizEnterStatusInfo.createEngine : null, (r44 & 524288) != 0 ? bizEnterStatusInfo.startOpenTime : null, (r44 & 1048576) != 0 ? bizEnterStatusInfo.endOnEnterTime : null, (r44 & 2097152) != 0 ? bizEnterStatusInfo.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? bizEnterStatusInfo.startCreateEngineTime : null, (r44 & 8388608) != 0 ? bizEnterStatusInfo.startShowFlutterPageTime : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? bizEnterStatusInfo.firstGroupMsgCount : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? bizEnterStatusInfo.reddotReportInfo : null) : null;
                i0Var.f459299h = true;
                kotlinx.coroutines.l.d(i0Var.f459296e, null, null, new y40.a0(null), 3, null);
            }
            pm0.v.X(y40.p.f459325d);
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).ij("brandServiceBoxExpose");
            if (yw.h1.f466332a.b()) {
                com.tencent.wechat.mm.finder_box.c0.f219335b.z(y40.q.f459326a);
            }
        }
    }

    public void Ri(rv.g3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i(this.f440684d, "onMainTabDisappeared, reason: " + reason);
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Ni()) {
            if (aj()) {
                ((ku5.t0) ku5.t0.f312615d).h(new vw.t1(reason), "onMainTabDisappeared");
                return;
            }
            return;
        }
        y40.i0 i0Var = (y40.i0) z40.e.get();
        i0Var.getClass();
        com.tencent.mars.xlog.Log.i(i0Var.f459295d, "onMainTabDisappeared, reason: " + reason);
        if (i0Var.Ni()) {
            ((ku5.t0) ku5.t0.f312615d).h(new y40.t(reason), "onMainTabDisappeared");
        }
    }

    public void Ui(rv.g3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i(this.f440684d, "onMainTabExposed, reason: " + reason);
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Ni()) {
            if (aj()) {
                ((ku5.t0) ku5.t0.f312615d).h(new vw.v1(reason), "onMainTabExposed");
                return;
            }
            return;
        }
        y40.i0 i0Var = (y40.i0) z40.e.get();
        i0Var.getClass();
        com.tencent.mars.xlog.Log.i(i0Var.f459295d, "onMainTabExposed, reason: " + reason);
        if (i0Var.Ni()) {
            ((ku5.t0) ku5.t0.f312615d).h(new y40.v(reason), "onMainTabExposed");
        }
    }

    public boolean Vi(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - this.f440700w);
        java.lang.String str = this.f440684d;
        if (abs < 1000) {
            jx3.f.INSTANCE.w(1971L, 7L, 1L);
            com.tencent.mars.xlog.Log.i(str, "openBizTimeLineWithFlutter click in 1000ms");
            return false;
        }
        if (this.f440686f != null) {
            com.tencent.mars.xlog.Log.i(str, "current job not finish, return (lastClickTime=" + this.f440700w + "  current=" + currentTimeMillis + ')');
            return false;
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347325v);
        eq1.j.f255821a.j();
        this.f440700w = currentTimeMillis;
        this.f440689i = currentTimeMillis;
        this.f440686f = kotlinx.coroutines.l.d(this.f440685e, null, null, new vw.w1(currentTimeMillis, intent, this, context, null), 3, null);
        return true;
    }

    public boolean Zi() {
        int i17 = yw.h1.f466336e;
        if (((i17 == 1 || i17 != 0) && ((java.lang.Boolean) ((jz5.n) this.f440692o).getValue()).booleanValue()) && !yw.q3.f466442f) {
            return false;
        }
        yw.h1 h1Var = yw.h1.f466332a;
        int i18 = yw.h1.f466335d;
        return (i18 == 1 || i18 != 0) && ((java.lang.Boolean) ((jz5.n) this.f440691n).getValue()).booleanValue();
    }

    public boolean aj() {
        int i17 = yw.h1.f466336e;
        boolean z17 = ((i17 == 1 || i17 != 0) && ((java.lang.Boolean) ((jz5.n) this.f440692o).getValue()).booleanValue()) && yw.q3.f466442f && Zi();
        synchronized (yw.q3.f466437a) {
            if (yw.q3.f466443g == null) {
                jz5.g gVar = yw.q3.f466438b;
                boolean i18 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).i("openAff", false);
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).G("openAff", z17);
                if (i18 == z17 || !z17) {
                    yw.q3.f466443g = java.lang.Boolean.FALSE;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMsgBridge", "resetData");
                    yw.q3.f466443g = java.lang.Boolean.TRUE;
                }
            }
        }
        return z17;
    }

    public boolean bj(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vw.a2(i17, context, null), 3, null);
        return true;
    }

    public boolean cj(android.content.Context context, rv.l3 redDotReportInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(redDotReportInfo, "redDotReportInfo");
        ij();
        lr1.k.a();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vw.e2(this, context, redDotReportInfo, null), 3, null);
        return true;
    }

    public boolean fj(android.content.Context context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vw.f2(i17, i18, context, null), 3, null);
        return true;
    }

    public boolean hj(android.content.Context context, com.tencent.wechat.mm.biz.b2 b2Var, rv.e3 e3Var) {
        kotlin.jvm.internal.o.g(context, "context");
        if (b2Var == null) {
            com.tencent.mars.xlog.Log.e(this.f440684d, "publish launch info is null");
            return false;
        }
        if (e3Var == null) {
            yw.x1.f466507a = null;
        } else {
            yw.x1.f466507a = e3Var;
        }
        ij();
        kotlinx.coroutines.l.d(this.f440685e, null, null, new vw.g2(b2Var, context, null), 3, null);
        return true;
    }

    public final void ij() {
        boolean Vi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Vi();
        if ((this.f440688h || Vi) && (Vi || !((java.lang.Boolean) ((jz5.n) this.f440694q).getValue()).booleanValue())) {
            return;
        }
        yw.y1.f466513c = true;
        com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = yw.y1.f466512b;
        yw.y1.f466512b = bizEnterStatusInfo != null ? bizEnterStatusInfo.copy((r44 & 1) != 0 ? bizEnterStatusInfo.enterSource : null, (r44 & 2) != 0 ? bizEnterStatusInfo.openArticleFromScene : null, (r44 & 4) != 0 ? bizEnterStatusInfo.isTeenMode : null, (r44 & 8) != 0 ? bizEnterStatusInfo.redDotCount : null, (r44 & 16) != 0 ? bizEnterStatusInfo.pos : null, (r44 & 32) != 0 ? bizEnterStatusInfo.finderLiveRedDotType : null, (r44 & 64) != 0 ? bizEnterStatusInfo.finderFeedExportId : null, (r44 & 128) != 0 ? bizEnterStatusInfo.exposeMsgType : null, (r44 & 256) != 0 ? bizEnterStatusInfo.exposeUserName : null, (r44 & 512) != 0 ? bizEnterStatusInfo.lastExposeId : null, (r44 & 1024) != 0 ? bizEnterStatusInfo.lastExposeMsgId : null, (r44 & 2048) != 0 ? bizEnterStatusInfo.lastExposeMid : null, (r44 & 4096) != 0 ? bizEnterStatusInfo.sessionId : null, (r44 & 8192) != 0 ? bizEnterStatusInfo.enterTime : null, (r44 & 16384) != 0 ? bizEnterStatusInfo.netType : null, (r44 & 32768) != 0 ? bizEnterStatusInfo.isHeadsetOn : null, (r44 & 65536) != 0 ? bizEnterStatusInfo.redDotReportItem : null, (r44 & 131072) != 0 ? bizEnterStatusInfo.createEngineGroup : true, (r44 & 262144) != 0 ? bizEnterStatusInfo.createEngine : null, (r44 & 524288) != 0 ? bizEnterStatusInfo.startOpenTime : null, (r44 & 1048576) != 0 ? bizEnterStatusInfo.endOnEnterTime : null, (r44 & 2097152) != 0 ? bizEnterStatusInfo.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? bizEnterStatusInfo.startCreateEngineTime : null, (r44 & 8388608) != 0 ? bizEnterStatusInfo.startShowFlutterPageTime : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? bizEnterStatusInfo.firstGroupMsgCount : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? bizEnterStatusInfo.reddotReportInfo : null) : null;
        this.f440688h = true;
        kotlinx.coroutines.l.d(this.f440685e, null, null, new vw.h2(null), 3, null);
    }

    public void mj() {
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Di()) {
            com.tencent.wechat.mm.biz.h3 h3Var = new com.tencent.wechat.mm.biz.h3();
            h3Var.f218137e = "get_close_appmsglist";
            com.tencent.wechat.iam.biz.q0.f217771b.a(h3Var, new vw.k2(this));
        } else {
            y40.i0 i0Var = (y40.i0) z40.e.get();
            i0Var.getClass();
            com.tencent.wechat.mm.finder_box.j2 j2Var = new com.tencent.wechat.mm.finder_box.j2();
            j2Var.f219548e = "get_close_appmsglist";
            com.tencent.wechat.iam.finder_box.m.f217846b.a(j2Var, new y40.g0(i0Var));
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i(this.f440684d, "onAccountInitialized");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent>(a0Var) { // from class: com.tencent.mm.feature.brandservice.FlutterBizFeatureService$onAccountInitialized$1
            {
                this.__eventId = 915464157;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent bypCommonBizMMBizNotifyEvent) {
                com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent event = bypCommonBizMMBizNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i(vw.m2.this.f440684d, "receive reliable notify");
                com.tencent.wechat.mm.biz.g0.f218063b.x(event.f54016g.f6727a, vw.m1.f440683a);
                return true;
            }
        };
        this.f440690m = iListener;
        iListener.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i(this.f440684d, "onAccountReleased");
        com.tencent.mm.sdk.event.IListener iListener = this.f440690m;
        if (iListener != null) {
            iListener.dead();
        }
        this.f440690m = null;
    }
}
