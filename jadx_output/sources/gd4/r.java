package gd4;

/* loaded from: classes4.dex */
public final class r implements gd4.z, com.tencent.mm.plugin.sns.ui.widget.p {

    /* renamed from: a, reason: collision with root package name */
    public final int f270816a;

    /* renamed from: b, reason: collision with root package name */
    public u74.d f270817b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f270818c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f270819d;

    /* renamed from: e, reason: collision with root package name */
    public i64.b1 f270820e;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f270822g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.i f270823h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f270824i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.s f270825j;

    /* renamed from: k, reason: collision with root package name */
    public kotlinx.coroutines.y0 f270826k;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.a1 f270830o;

    /* renamed from: p, reason: collision with root package name */
    public r45.jj4 f270831p;

    /* renamed from: q, reason: collision with root package name */
    public gd4.b f270832q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f270833r;

    /* renamed from: s, reason: collision with root package name */
    public hd4.i f270834s;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f270821f = kotlinx.coroutines.flow.i3.a(null);

    /* renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f270827l = kotlinx.coroutines.flow.i3.a(gd4.e.f270683f);

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f270828m = kotlinx.coroutines.flow.r2.a(1, 0, u26.u.DROP_OLDEST);

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f270829n = "";

    public r(int i17) {
        this.f270816a = i17;
    }

    public static final /* synthetic */ u74.d a(gd4.r rVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWrapHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        u74.d e17 = rVar.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWrapHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return e17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0274, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickArea", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d7 A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #2 {all -> 0x020b, blocks: (B:67:0x01bf, B:70:0x01d2, B:72:0x01d7), top: B:66:0x01bf }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(gd4.r r25, com.tencent.mm.plugin.sns.storage.d0 r26, com.tencent.mm.plugin.sns.storage.SnsInfo r27) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gd4.r.b(gd4.r, com.tencent.mm.plugin.sns.storage.d0, com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    public final gd4.x0 c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        u74.d dVar = this.f270817b;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = dVar != null ? dVar.f425156q : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return snsAdBreakFrameVideoView;
    }

    public final kotlinx.coroutines.flow.j2 d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUiReadyFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        kotlinx.coroutines.flow.j2 j2Var = this.f270821f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUiReadyFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return j2Var;
    }

    public final u74.d e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWrapHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        u74.d dVar = this.f270817b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWrapHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return dVar;
    }

    public final boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSolidBreakAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        boolean z17 = this.f270816a == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSolidBreakAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return z17;
    }

    public final boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTimeLine", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        i64.b1 b1Var = this.f270820e;
        boolean z17 = (b1Var != null ? b1Var.f289095j : 0) == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTimeLine", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return z17;
    }

    public final void h() {
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView;
        com.tencent.mm.plugin.sns.ui.g9 g9Var2;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView2;
        com.tencent.mm.plugin.sns.ui.g9 g9Var3;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView3;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView2;
        gd4.b bVar;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.storage.d0 d0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.tencent.mars.xlog.Log.i("BreakFrameCardAdController", "scope.cancel called");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f270818c;
        java.lang.Object obj = null;
        com.tencent.mm.plugin.sns.storage.a1 a17 = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (d0Var = adXml.adBreakFrameInfo) == null) ? null : d0Var.a();
        if (a17 != null && (bVar = this.f270832q) != null) {
            bVar.a(a17);
        }
        this.f270829n = "";
        kotlinx.coroutines.y0 y0Var = this.f270826k;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f270826k = null;
        u74.d dVar = this.f270817b;
        if (dVar != null && (snsAdBreakFrameVideoView2 = dVar.f425156q) != null) {
            snsAdBreakFrameVideoView2.stop();
        }
        if (f()) {
            com.tencent.mars.xlog.Log.i("BreakFrameCardAdController", "it is setting the thumb view to visible, on Clear");
            u74.d dVar2 = this.f270817b;
            if (dVar2 != null && (snsAdBreakFrameVideoView = dVar2.f425156q) != null) {
                snsAdBreakFrameVideoView.h(true);
            }
        }
        u74.d e17 = e();
        if (e17 != null && (g9Var3 = e17.f425154o) != null && (snsAdTimelineVideoView3 = g9Var3.f168417g) != null) {
            snsAdTimelineVideoView3.u();
        }
        u74.d e18 = e();
        if (e18 != null && (g9Var2 = e18.f425154o) != null && (snsAdTimelineVideoView2 = g9Var2.f168417g) != null) {
            snsAdTimelineVideoView2.w(true);
        }
        u74.d e19 = e();
        if (e19 != null && (g9Var = e19.f425154o) != null && (snsAdTimelineVideoView = g9Var.f168417g) != null) {
            snsAdTimelineVideoView.setOnReplay(null);
        }
        ((kotlinx.coroutines.flow.h3) this.f270827l).k(gd4.e.f270683f);
        gd4.b bVar2 = this.f270832q;
        if (bVar2 != null) {
            bVar2.j();
        }
        gd4.b bVar3 = this.f270832q;
        if (bVar3 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            java.lang.Object obj2 = bVar3.f270617l;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            obj = obj2;
        }
        this.f270833r = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
    }
}
