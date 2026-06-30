package zv;

@j95.b(dependencies = {com.tencent.mm.plugin.magicbrush.s4.class})
/* loaded from: classes11.dex */
public final class e2 extends i95.w implements bw.k {

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f475948f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.l1 f475949g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f475950h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f475951i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f475952m;

    /* renamed from: s, reason: collision with root package name */
    public long f475958s;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f475946d = "MicroMsg.FlutterBrandServiceFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f475947e = kotlinx.coroutines.z0.b();

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f475953n = jz5.h.b(new zv.k1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f475954o = jz5.h.b(new zv.i1(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f475955p = jz5.h.b(zv.c2.f475923d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f475956q = jz5.h.b(zv.q1.f476087d);

    /* renamed from: r, reason: collision with root package name */
    public final long f475957r = 15000;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ai(android.content.Context r24, bw5.x7 r25) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.e2.Ai(android.content.Context, bw5.x7):void");
    }

    public boolean Bi(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        return !yo.a.b(qw.a.f367052b, userName);
    }

    public void Di() {
        if (Ui()) {
            zv.e0.f475937a.a("mainCellExpose");
            boolean Vi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Vi();
            if ((!this.f475950h && !Vi) || (!Vi && ((java.lang.Boolean) ((jz5.n) this.f475954o).getValue()).booleanValue())) {
                zv.f0.f475964b = true;
                com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = zv.f0.f475963a;
                zv.f0.f475963a = bizEnterStatusInfo != null ? bizEnterStatusInfo.copy((r44 & 1) != 0 ? bizEnterStatusInfo.enterSource : null, (r44 & 2) != 0 ? bizEnterStatusInfo.openArticleFromScene : null, (r44 & 4) != 0 ? bizEnterStatusInfo.isTeenMode : null, (r44 & 8) != 0 ? bizEnterStatusInfo.redDotCount : null, (r44 & 16) != 0 ? bizEnterStatusInfo.pos : null, (r44 & 32) != 0 ? bizEnterStatusInfo.finderLiveRedDotType : null, (r44 & 64) != 0 ? bizEnterStatusInfo.finderFeedExportId : null, (r44 & 128) != 0 ? bizEnterStatusInfo.exposeMsgType : null, (r44 & 256) != 0 ? bizEnterStatusInfo.exposeUserName : null, (r44 & 512) != 0 ? bizEnterStatusInfo.lastExposeId : null, (r44 & 1024) != 0 ? bizEnterStatusInfo.lastExposeMsgId : null, (r44 & 2048) != 0 ? bizEnterStatusInfo.lastExposeMid : null, (r44 & 4096) != 0 ? bizEnterStatusInfo.sessionId : null, (r44 & 8192) != 0 ? bizEnterStatusInfo.enterTime : null, (r44 & 16384) != 0 ? bizEnterStatusInfo.netType : null, (r44 & 32768) != 0 ? bizEnterStatusInfo.isHeadsetOn : null, (r44 & 65536) != 0 ? bizEnterStatusInfo.redDotReportItem : null, (r44 & 131072) != 0 ? bizEnterStatusInfo.createEngineGroup : java.lang.Boolean.TRUE, (r44 & 262144) != 0 ? bizEnterStatusInfo.createEngine : null, (r44 & 524288) != 0 ? bizEnterStatusInfo.startOpenTime : null, (r44 & 1048576) != 0 ? bizEnterStatusInfo.endOnEnterTime : null, (r44 & 2097152) != 0 ? bizEnterStatusInfo.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? bizEnterStatusInfo.startCreateEngineTime : null, (r44 & 8388608) != 0 ? bizEnterStatusInfo.startShowFlutterPageTime : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? bizEnterStatusInfo.firstGroupMsgCount : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? bizEnterStatusInfo.reddotReportInfo : null) : null;
                this.f475950h = true;
                kotlinx.coroutines.l.d(this.f475947e, null, null, new zv.u1(null), 3, null);
            }
            jz5.g gVar = ew.e.f256965a;
            if (((java.lang.Boolean) ((jz5.n) ew.e.f256965a).getValue()).booleanValue()) {
                pm0.v.X(new zv.v1(this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(int r43, r45.oh0 r44, java.lang.String r45) {
        /*
            Method dump skipped, instructions count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.e2.Ni(int, r45.oh0, java.lang.String):void");
    }

    public boolean Ri(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - this.f475958s);
        java.lang.String str = this.f475946d;
        if (abs < 1000) {
            jx3.f.INSTANCE.w(2053L, 7L, 1L);
            com.tencent.mars.xlog.Log.i(str, "openBrandServiceTimeLineWithFlutter click in 1000ms");
            return false;
        }
        if (this.f475948f != null) {
            com.tencent.mars.xlog.Log.i(str, "current job not finish, return (lastClickTime=" + this.f475958s + "  current=" + currentTimeMillis + ')');
            return false;
        }
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        yw.a3 a3Var = yw.a3.f466266a;
        com.tencent.wechat.aff.brand_service.a d17 = a3Var.d();
        if (d17 != null) {
            d17.a();
        }
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        com.tencent.wechat.aff.brand_service.a d18 = a3Var.d();
        java.lang.String b17 = d18 != null ? d18.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        com.tencent.mars.xlog.Log.i(str, "gen custom_session_id ".concat(b17));
        this.f475958s = currentTimeMillis;
        this.f475948f = kotlinx.coroutines.l.d(this.f475947e, null, null, new zv.a2(currentTimeMillis, intent, this, context, null), 3, null);
        return true;
    }

    public boolean Ui() {
        boolean f17 = zv.q.f476079a.f();
        synchronized (yw.a3.f466266a) {
            if (yw.a3.f466273h == null) {
                jz5.g gVar = yw.a3.f466267b;
                boolean i17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).i("enable_brand_service_timeline", false);
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).G("enable_brand_service_timeline", f17);
                if (i17 == f17 || !f17) {
                    yw.a3.f466273h = java.lang.Boolean.FALSE;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBrandServiceBridge", "resetData");
                    yw.a3.f466273h = java.lang.Boolean.TRUE;
                }
            }
        }
        return f17;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i(this.f475946d, "[BRS] FlutterBrandEcsFeatureService onAccountInitialized");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizEcsBrandServiceNotifyEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizEcsBrandServiceNotifyEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.FlutterBrandEcsFeatureService$onAccountInitialized$1
            {
                this.__eventId = -210338515;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BypCommonBizEcsBrandServiceNotifyEvent bypCommonBizEcsBrandServiceNotifyEvent) {
                com.tencent.mm.autogen.events.BypCommonBizEcsBrandServiceNotifyEvent event = bypCommonBizEcsBrandServiceNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                zv.e2 e2Var = zv.e2.this;
                com.tencent.mars.xlog.Log.i(e2Var.f475946d, "[BRS] receive reliable notify");
                if (zv.q.f476079a.g()) {
                    com.tencent.wechat.aff.brand_service.v.f216049c.n(zv.r1.f476096a);
                    return true;
                }
                com.tencent.mars.xlog.Log.w(e2Var.f475946d, "openFlutterBrandServiceTimeLine is false, return");
                return true;
            }
        };
        this.f475952m = iListener;
        iListener.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i(this.f475946d, "[BRS] FlutterBrandEcsFeatureService onAccountReleased");
        com.tencent.mm.sdk.event.IListener iListener = this.f475952m;
        if (iListener != null) {
            iListener.dead();
        }
        this.f475952m = null;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        boolean z17;
        com.tencent.pigeon.mm_foundation.DartServiceCallerApi Bi;
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mm.plugin.magicbrush.s7 s7Var = (com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class));
        s7Var.bj("MagicEcsTimeline", zv.w1.f476124a);
        s7Var.bj("MagicEcsTimelineSubscribe", zv.x1.f476129a);
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 && j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigAmoebaDebugView()) == 1 && (Bi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Bi()) != null) {
            Bi.setEnableAmoebaDebugView(true, zv.y1.f476136d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wi(java.util.Map r47, java.lang.String r48, kotlin.coroutines.Continuation r49) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.e2.wi(java.util.Map, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
