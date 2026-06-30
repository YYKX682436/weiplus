package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f169459a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f169460b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f169461c;

    /* renamed from: d, reason: collision with root package name */
    public i64.b1 f169462d;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Animation f169464f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.animation.Animation f169465g;

    /* renamed from: i, reason: collision with root package name */
    public final ra4.b f169467i;

    /* renamed from: k, reason: collision with root package name */
    public final i74.i f169469k;

    /* renamed from: l, reason: collision with root package name */
    public final k74.i f169470l;

    /* renamed from: m, reason: collision with root package name */
    public final l74.m f169471m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f169472n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ListView f169473o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f169474p;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.AbsoluteLayout f169463e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f169466h = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f169468j = false;

    /* renamed from: q, reason: collision with root package name */
    public int f169475q = -1;

    /* JADX WARN: Removed duplicated region for block: B:9:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(android.content.Context r11, com.tencent.mm.plugin.sns.ui.listener.i r12, android.widget.FrameLayout r13, android.view.View r14, ra4.b r15) {
        /*
            r10 = this;
            r10.<init>()
            r14 = 0
            r10.f169463e = r14
            r0 = 0
            r10.f169466h = r0
            r10.f169468j = r0
            r0 = -1
            r10.f169475q = r0
            r10.f169459a = r11
            r10.f169467i = r15
            r10.f169460b = r12
            r10.f169461c = r13
            android.view.animation.ScaleAnimation r13 = new android.view.animation.ScaleAnimation
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            r9 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f169464f = r13
            r13 = 2130772029(0x7f01003d, float:1.7147165E38)
            android.view.animation.Animation r13 = android.view.animation.AnimationUtils.loadAnimation(r11, r13)
            r10.f169464f = r13
            android.view.animation.ScaleAnimation r13 = new android.view.animation.ScaleAnimation
            r1 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1
            r8 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.f169465g = r13
            r13 = 2130772030(0x7f01003e, float:1.7147167E38)
            android.view.animation.Animation r13 = android.view.animation.AnimationUtils.loadAnimation(r11, r13)
            r10.f169465g = r13
            java.lang.String r13 = "newInstance"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r15)
            java.lang.String r0 = "setTimelineClickListener"
            java.lang.String r1 = "create new feedback panel failed!"
            if (r11 == 0) goto L6f
            i74.i r2 = new i74.i     // Catch: java.lang.Throwable -> L68
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L68
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r15)     // Catch: java.lang.Throwable -> L69
            r2.f289497m = r12     // Catch: java.lang.Throwable -> L69
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r15)     // Catch: java.lang.Throwable -> L69
            goto L70
        L68:
            r2 = r14
        L69:
            java.lang.String r3 = "FeedbackPromptManager"
            com.tencent.mars.xlog.Log.w(r3, r1)
            goto L70
        L6f:
            r2 = r14
        L70:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r15)
            r10.f169469k = r2
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r15)
            if (r11 == 0) goto L91
            k74.i r2 = new k74.i     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L8c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r15)     // Catch: java.lang.Throwable -> L8b
            r2.f304803i = r12     // Catch: java.lang.Throwable -> L8b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r15)     // Catch: java.lang.Throwable -> L8b
            r14 = r2
            goto L91
        L8b:
            r14 = r2
        L8c:
            java.lang.String r0 = "FeedbackNewStylePromptManager"
            com.tencent.mars.xlog.Log.w(r0, r1)
        L91:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r15)
            r10.f169470l = r14
            l74.m r13 = new l74.m
            r13.<init>(r11, r12)
            r10.f169471m = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.j.<init>(android.content.Context, com.tencent.mm.plugin.sns.ui.listener.i, android.widget.FrameLayout, android.view.View, ra4.b):void");
    }

    public static /* synthetic */ boolean a(com.tencent.mm.plugin.sns.ui.j jVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        jVar.f169466h = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return z17;
    }

    public static boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpUseNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_new_style_feedback, 1) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpUseNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdNotLikeHelper", "isExpUseNewStyleFeedback, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpUseNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.j.b(android.view.View):boolean");
    }

    public final boolean d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, ca4.j jVar) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        boolean z18 = false;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpDisableFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        try {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_disable_feedback_version2, 0) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpDisableFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdNotLikeHelper", "isExpDisableFeedbackVer2, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpDisableFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
        ca4.i iVar = jVar.f39952a;
        com.tencent.mm.plugin.sns.storage.ADXml aDXml = iVar != null ? iVar.f39939a : null;
        if (aDXml == null) {
            aDXml = snsInfo.getAdXml();
        }
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowOpenPersonalizedVer2", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        if (aDXml == null || adInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowOpenPersonalizedVer2", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        } else {
            z18 = aDXml.dynamicCommonConfig.f359963g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowOpenPersonalizedVer2", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return z18;
    }

    public boolean e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        boolean z19 = false;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
        if (ca4.m0.d0()) {
            int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigNewStyleFeedback());
            com.tencent.mars.xlog.Log.i("MicroMsg.AdNotLikeHelper", "isNewStyleFeedback, debugEnv, cfgInt=" + h17);
            if (h17 == 0) {
                if (!c()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
                    return false;
                }
            } else {
                if (h17 == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
                    return true;
                }
                if (h17 == 2) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
                    return false;
                }
            }
        } else if (!c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdNotLikeHelper", "isNewStyleFeedback, exp=false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
        try {
            com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
            boolean isNewStyleFeedback = com.tencent.mm.plugin.sns.storage.ADInfo.isNewStyleFeedback(adInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            if (adInfo != null) {
                z17 = adInfo.forbidClick;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z17 = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowOpenPersonalized", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            if (adInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowOpenPersonalized", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z18 = false;
            } else {
                java.lang.String a17 = i74.e.a(adInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                boolean z27 = adInfo.isPersonalizedAdClose;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z18 = z27 && i74.a.a() && !com.tencent.mm.sdk.platformtools.t8.K0(a17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowOpenPersonalized", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AdNotLikeHelper", "isNewStyleFeedback, isXmlNewStyle=" + isNewStyleFeedback + ", isSpecialAd=" + z17 + ", isShowOpenPersonalized=" + z18);
            if (isNewStyleFeedback && !z17 && !z18) {
                z19 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return z19;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdNotLikeHelper", "isNewStyleFeedback, exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
    }

    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        if (this.f169467i != null) {
            com.tencent.mm.plugin.sns.model.l4.vj().getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAbTestRunner", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAbTestRunner", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        }
        android.widget.AbsoluteLayout absoluteLayout = this.f169463e;
        if (absoluteLayout != null) {
            this.f169461c.removeView(absoluteLayout);
            this.f169463e = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return true;
        }
        this.f169466h = false;
        this.f169473o = null;
        this.f169474p = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return false;
    }

    public boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showUnLikeReasonList", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        int height = this.f169472n.getHeight();
        this.f169472n.setVisibility(8);
        int i17 = 0;
        android.view.View view = null;
        for (int i18 = 0; i18 < this.f169473o.getAdapter().getCount(); i18++) {
            view = this.f169473o.getAdapter().getView(i18, view, null);
            view.measure(this.f169474p.getWidth(), -2);
            i17 += view.getMeasuredHeight();
        }
        ((android.widget.RelativeLayout.LayoutParams) this.f169473o.getLayoutParams()).bottomMargin = height - i17;
        this.f169473o.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.h hVar = new com.tencent.mm.plugin.sns.ui.h(this, height, i17);
        hVar.setDuration(250L);
        this.f169473o.startAnimation(hVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showUnLikeReasonList", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return true;
    }
}
