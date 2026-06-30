package gd4;

/* loaded from: classes4.dex */
public final class c2 extends gd4.b {

    /* renamed from: w, reason: collision with root package name */
    public static final gd4.y0 f270650w = new gd4.y0(null);

    /* renamed from: m, reason: collision with root package name */
    public final u74.d f270651m;

    /* renamed from: n, reason: collision with root package name */
    public long f270652n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f270653o;

    /* renamed from: p, reason: collision with root package name */
    public int f270654p;

    /* renamed from: q, reason: collision with root package name */
    public int f270655q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f270656r;

    /* renamed from: s, reason: collision with root package name */
    public long f270657s;

    /* renamed from: t, reason: collision with root package name */
    public int f270658t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f270659u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f270660v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(gd4.x0 x0Var, gd4.w0 w0Var, gd4.x0 x0Var2, kotlinx.coroutines.y0 y0Var, kotlinx.coroutines.flow.i2 restartPlayFlow, kotlinx.coroutines.flow.i2 playCommandFlow, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, yz5.p setClickArea, com.tencent.mm.plugin.sns.storage.a1 a1Var, r45.jj4 jj4Var, i64.b1 b1Var, u74.d dVar, java.lang.Object obj) {
        super(x0Var, w0Var, x0Var2, y0Var, restartPlayFlow, playCommandFlow, snsInfo, setClickArea, a1Var, jj4Var, b1Var, obj);
        long j17;
        kotlin.jvm.internal.o.g(restartPlayFlow, "restartPlayFlow");
        kotlin.jvm.internal.o.g(playCommandFlow, "playCommandFlow");
        kotlin.jvm.internal.o.g(setClickArea, "setClickArea");
        this.f270651m = dVar;
        int i17 = 0;
        this.f270654p = 0;
        this.f270655q = 0;
        boolean z17 = obj instanceof gd4.z0;
        gd4.z0 z0Var = z17 ? (gd4.z0) obj : null;
        if (z0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo");
            j17 = z0Var.f270878a;
        } else {
            j17 = 0;
        }
        this.f270657s = j17;
        gd4.z0 z0Var2 = z17 ? (gd4.z0) obj : null;
        if (z0Var2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo");
            i17 = z0Var2.f270879b;
        }
        this.f270658t = i17;
    }

    public static final /* synthetic */ int m(gd4.c2 c2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        int i17 = c2Var.f270654p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return i17;
    }

    public static final /* synthetic */ android.widget.ImageView n(gd4.c2 c2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTagIconView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        android.widget.ImageView imageView = c2Var.f270659u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTagIconView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return imageView;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView o(gd4.c2 c2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTagTextView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = c2Var.f270660v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTagTextView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return adAppCompatTextView;
    }

    public static final /* synthetic */ void p(gd4.c2 c2Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        c2Var.f270654p = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    public static final kotlinx.coroutines.r2 q(kotlinx.coroutines.y0 y0Var, gd4.c2 c2Var, com.tencent.mm.plugin.sns.storage.s1 s1Var, kotlinx.coroutines.flow.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(y0Var, null, null, new gd4.f1(r(c2Var, s1Var), c2Var, c2Var.f270654p, i2Var, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return d17;
    }

    public static final com.tencent.mm.plugin.sns.storage.r1 r(gd4.c2 c2Var, com.tencent.mm.plugin.sns.storage.s1 s1Var) {
        com.tencent.mm.plugin.sns.storage.r1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProcessCommandFlow$getPlayState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        int i17 = c2Var.f270654p;
        if (i17 == 4) {
            a17 = s1Var.b();
        } else if (i17 == 3) {
            s1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            a17 = s1Var.f166131e;
        } else if (i17 == 2) {
            s1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            a17 = s1Var.f166130d;
        } else {
            a17 = i17 == 0 ? s1Var.a() : s1Var.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow$getPlayState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return a17;
    }

    @Override // gd4.b
    public void a(com.tencent.mm.plugin.sns.storage.a1 a1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        android.os.SystemClock.elapsedRealtime();
        if (this.f270652n > 0) {
            this.f270657s += android.os.SystemClock.elapsedRealtime() - this.f270652n;
        }
        if (this.f270653o) {
            this.f270652n = android.os.SystemClock.elapsedRealtime();
        } else {
            this.f270652n = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    @Override // gd4.b
    public void j() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        android.widget.ImageView imageView = this.f270659u;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            kk.j jVar = a84.m.f2329a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            imageView.setTag(com.tencent.mm.R.id.n1z, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        }
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.f270660v;
        if (adAppCompatTextView != null) {
            adAppCompatTextView.setText("");
        }
        u74.d dVar = this.f270651m;
        if (dVar != null && (view = dVar.P) != null) {
            view.setOnClickListener(null);
        }
        gd4.z0 z0Var = new gd4.z0(this.f270657s, this.f270658t);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        this.f270617l = z0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    @Override // gd4.b
    public void k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.b0 b17;
        com.tencent.mm.plugin.sns.storage.d0 d0Var;
        com.tencent.mm.plugin.sns.storage.a1 a17;
        float durationMs;
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        try {
            com.tencent.mm.plugin.sns.storage.d0 d0Var2 = snsInfo.getAdXml().adBreakFrameInfo;
            b17 = d0Var2 != null ? d0Var2.b() : null;
            d0Var = snsInfo.getAdXml().adBreakFrameInfo;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("IpInteractScheduleVideoController", "sns_ad_ip_interact_report, exp=" + e17);
        }
        if (d0Var != null && (a17 = d0Var.a()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            r45.jj4 jj4Var = this.f270615j;
            if (jj4Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                return;
            }
            a(a17);
            a17.b().a();
            float f17 = jj4Var.R;
            long j17 = 0;
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
            if (f19 > 0.0f) {
                java.lang.Math.min(f19, durationMs);
            }
            i64.b1 h17 = h();
            int i17 = (h17 != null ? h17.f289095j : 0) == 0 ? 1 : 2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(snsInfo.field_snsId));
            jSONObject.put("uxinfo", snsInfo.getUxinfo());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
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
            long j18 = this.f270657s;
            if (j18 >= 0) {
                j17 = j18;
            }
            jSONObject2.put("videoPlayTotalTime", j17);
            jSONObject2.put("videoSeekCount", this.f270658t + 1);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("sns_ad_ip_interact_report", jSONObject3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    @Override // gd4.b
    public void l() {
        com.tencent.mm.plugin.sns.storage.s1 b17;
        java.lang.String str;
        java.lang.String b18;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.tencent.mm.plugin.sns.storage.SnsInfo i17 = i();
        com.tencent.mm.plugin.sns.storage.d0 d0Var = (i17 == null || (adXml = i17.getAdXml()) == null) ? null : adXml.adBreakFrameInfo;
        if (d0Var == null) {
            com.tencent.mars.xlog.Log.e("IpInteractScheduleVideoController", "adBreakFrameInfo is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        com.tencent.mm.plugin.sns.storage.a1 a17 = d0Var.a();
        com.tencent.mm.plugin.sns.storage.o1 b19 = a17 != null ? a17.b() : null;
        if (b19 == null || (b17 = b19.b()) == null) {
            com.tencent.mars.xlog.Log.e("IpInteractScheduleVideoController", "playStateInfo is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        u74.d dVar = this.f270651m;
        this.f270659u = (dVar == null || (view3 = dVar.P) == null) ? null : (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.n48);
        this.f270660v = (dVar == null || (view2 = dVar.P) == null) ? null : (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) view2.findViewById(com.tencent.mm.R.id.n4_);
        if (dVar != null && (view = dVar.P) != null) {
            view.setOnClickListener(new gd4.a1(this));
        }
        kotlinx.coroutines.flow.i2 b27 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.sns.storage.y2 y2Var = (com.tencent.mm.plugin.sns.storage.y2) kz5.n0.w0(b17.a().a(), c06.e.f37716d);
        java.lang.String str2 = "";
        if (y2Var == null || (str = y2Var.a()) == null) {
            str = "";
        }
        a84.m.a(str, this.f270659u);
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.f270660v;
        if (adAppCompatTextView != null) {
            if (y2Var != null && (b18 = y2Var.b()) != null) {
                str2 = b18;
            }
            adAppCompatTextView.setText(str2);
        }
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = this.f270660v;
        if (adAppCompatTextView2 != null) {
            android.content.Context context = adAppCompatTextView2.getContext();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dp2Pix", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            int round = java.lang.Math.round(i65.a.g(context) * 14);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dp2Pix", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            androidx.core.widget.a0.b(adAppCompatTextView2, 1, round, 1, 0);
        }
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.y0 e17 = e();
        if (e17 != null) {
            kotlinx.coroutines.l.d(e17, null, null, new gd4.h1(this, b17, null), 3, null);
        }
        kotlinx.coroutines.y0 e18 = e();
        if (e18 != null) {
            kotlinx.coroutines.l.d(e18, null, null, new gd4.a2(b27, this, b17, h0Var, b19, h0Var2, y2Var, null), 3, null);
        }
        kotlinx.coroutines.y0 e19 = e();
        if (e19 != null) {
            kotlinx.coroutines.l.d(e19, null, null, new gd4.d1(this, d0Var, h0Var, b17, b27, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }
}
