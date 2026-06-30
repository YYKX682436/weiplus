package gd4;

/* loaded from: classes4.dex */
public final class v0 extends gd4.b {

    /* renamed from: s, reason: collision with root package name */
    public static final gd4.a0 f270859s = new gd4.a0(null);

    /* renamed from: m, reason: collision with root package name */
    public boolean f270860m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f270861n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f270862o;

    /* renamed from: p, reason: collision with root package name */
    public int f270863p;

    /* renamed from: q, reason: collision with root package name */
    public int f270864q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f270865r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(gd4.x0 x0Var, gd4.w0 w0Var, gd4.x0 x0Var2, kotlinx.coroutines.y0 y0Var, kotlinx.coroutines.flow.i2 restartPlayFlow, kotlinx.coroutines.flow.i2 playCommandFlow, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, yz5.p setClickArea, com.tencent.mm.plugin.sns.storage.a1 a1Var, r45.jj4 jj4Var, i64.b1 b1Var, java.lang.Object obj) {
        super(x0Var, w0Var, x0Var2, y0Var, restartPlayFlow, playCommandFlow, snsInfo, setClickArea, a1Var, jj4Var, b1Var, obj);
        int i17;
        kotlin.jvm.internal.o.g(restartPlayFlow, "restartPlayFlow");
        kotlin.jvm.internal.o.g(playCommandFlow, "playCommandFlow");
        kotlin.jvm.internal.o.g(setClickArea, "setClickArea");
        boolean z17 = obj instanceof gd4.b0;
        gd4.b0 b0Var = z17 ? (gd4.b0) obj : null;
        int i18 = 0;
        if (b0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            i17 = (int) b0Var.f270618a;
        } else {
            i17 = 0;
        }
        this.f270863p = i17;
        gd4.b0 b0Var2 = z17 ? (gd4.b0) obj : null;
        if (b0Var2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            i18 = b0Var2.f270619b;
        }
        this.f270864q = i18;
    }

    public static final /* synthetic */ int m(gd4.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        int i17 = v0Var.f270863p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return i17;
    }

    public static final /* synthetic */ boolean n(gd4.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        boolean z17 = v0Var.f270860m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return z17;
    }

    public static final /* synthetic */ void o(gd4.v0 v0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        v0Var.f270863p = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    public static final kotlinx.coroutines.r2 p(kotlinx.coroutines.y0 y0Var, gd4.v0 v0Var, kotlin.jvm.internal.e0 e0Var, float f17, kotlinx.coroutines.flow.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(y0Var, null, null, new gd4.i0(v0Var, e0Var, f17, i2Var, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return d17;
    }

    @Override // gd4.b
    public void a(com.tencent.mm.plugin.sns.storage.a1 a1Var) {
        com.tencent.mm.plugin.sns.storage.o1 b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        if (this.f270862o) {
            if (this.f270860m) {
                java.lang.Number valueOf = (a1Var == null || (b17 = a1Var.b()) == null) ? 0 : java.lang.Float.valueOf(b17.a());
                int i17 = this.f270863p;
                gd4.x0 f17 = f();
                this.f270863p = i17 + (((int) (f17 != null ? f17.getCurrentPosInMills() : 0L)) - valueOf.intValue());
            } else {
                int i18 = this.f270863p;
                gd4.x0 f18 = f();
                this.f270863p = i18 + ((int) (f18 != null ? f18.getCurrentPosInMills() : 0L));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    @Override // gd4.b
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        this.f270860m = false;
        this.f270861n = false;
        this.f270862o = false;
        gd4.b0 b0Var = new gd4.b0(this.f270863p, this.f270864q);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        this.f270617l = b0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    @Override // gd4.b
    public void k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.b0 b17;
        com.tencent.mm.plugin.sns.storage.d0 d0Var;
        com.tencent.mm.plugin.sns.storage.a1 a17;
        float durationMs;
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
            return;
        }
        try {
            com.tencent.mm.plugin.sns.storage.d0 d0Var2 = snsInfo.getAdXml().adBreakFrameInfo;
            b17 = d0Var2 != null ? d0Var2.b() : null;
            d0Var = snsInfo.getAdXml().adBreakFrameInfo;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CycleScheduleVideoController", "sns_ad_break_frame_report, exp=" + e17);
        }
        if (d0Var != null && (a17 = d0Var.a()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            r45.jj4 jj4Var = this.f270615j;
            if (jj4Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                return;
            }
            a(a17);
            float a18 = a17.b().a();
            float f17 = jj4Var.R;
            if (f17 > 0.0f) {
                durationMs = f17 * 1000.0f;
            } else {
                gd4.x0 f18 = f();
                durationMs = (float) (f18 != null ? f18.getDurationMs() : 0L);
            }
            com.tencent.mm.plugin.sns.storage.o1 b18 = a17.b();
            b18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoopEndTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoopEndTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            float f19 = b18.f166085d;
            float min = f19 > 0.0f ? java.lang.Math.min(f19, durationMs) : durationMs;
            i64.b1 h17 = h();
            int i17 = 0;
            int i18 = (h17 != null ? h17.f289095j : 0) == 0 ? 1 : 2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(snsInfo.field_snsId));
            jSONObject.put("uxinfo", snsInfo.getUxinfo());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i18);
            java.lang.String str = snsInfo.getAdXml().adExtInfo;
            if (str == null) {
                str = "";
            }
            jSONObject.put("adExtInfo", str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put("extInfo", jSONObject2);
            jSONObject2.put("videoDuration", java.lang.Float.valueOf(durationMs));
            com.tencent.mm.plugin.sns.storage.a1 d17 = d();
            jSONObject2.put("videoCompositeType", d17 != null ? d17.c() : 0);
            if (b17 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                obj = java.lang.Float.valueOf(b17.f165935e);
            } else {
                obj = 0;
            }
            jSONObject2.put("clickAreaStartTime", obj);
            jSONObject2.put("loopStartTime", java.lang.Float.valueOf(a18));
            jSONObject2.put("loopEndTime", java.lang.Float.valueOf(min));
            int i19 = this.f270863p;
            if (i19 >= 0) {
                i17 = i19;
            }
            jSONObject2.put("videoPlayTotalTime", i17);
            jSONObject2.put("videoPlayCount", this.f270864q);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("sns_ad_break_frame_report", jSONObject3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    @Override // gd4.b
    public void l() {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.storage.ADXml adXml2;
        com.tencent.mm.plugin.sns.storage.d0 d0Var;
        com.tencent.mm.plugin.sns.storage.a1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        com.tencent.mm.plugin.sns.storage.SnsInfo i17 = i();
        com.tencent.mm.plugin.sns.storage.o1 b17 = (i17 == null || (adXml2 = i17.getAdXml()) == null || (d0Var = adXml2.adBreakFrameInfo) == null || (a17 = d0Var.a()) == null) ? null : a17.b();
        com.tencent.mm.plugin.sns.storage.SnsInfo i18 = i();
        com.tencent.mm.plugin.sns.storage.d0 d0Var2 = (i18 == null || (adXml = i18.getAdXml()) == null) ? null : adXml.adBreakFrameInfo;
        float f17 = 0.0f;
        float a18 = b17 != null ? b17.a() : 0.0f;
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        if (b17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartOffset", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartOffset", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            f17 = b17.f166083b;
        }
        kotlinx.coroutines.flow.i2 b18 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.y0 e17 = e();
        if (e17 != null) {
            kotlinx.coroutines.l.d(e17, null, null, new gd4.k0(this, a18, null), 3, null);
        }
        kotlinx.coroutines.y0 e18 = e();
        if (e18 != null) {
            kotlinx.coroutines.l.d(e18, null, null, new gd4.u0(this, b18, a18, h0Var, e0Var, null), 3, null);
        }
        kotlinx.coroutines.y0 e19 = e();
        if (e19 != null) {
            kotlinx.coroutines.l.d(e19, null, null, new gd4.g0(this, d0Var2, h0Var, b17, e0Var, f17, a18, b18, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }
}
