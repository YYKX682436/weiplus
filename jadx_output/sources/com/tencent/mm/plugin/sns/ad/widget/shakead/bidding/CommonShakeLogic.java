package com.tencent.mm.plugin.sns.ad.widget.shakead.bidding;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/shakead/bidding/CommonShakeLogic;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/sns/ui/y4;", "Lu44/b;", "La94/l;", "Landroid/content/Context;", "mContext", "Landroid/widget/FrameLayout;", "mShakeViewContainer", "Landroid/view/View;", "mAdRootView", "", "mSource", "Lb94/d;", "mOnShakeListener", "<init>", "(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/view/View;ILb94/d;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CommonShakeLogic implements androidx.lifecycle.x, com.tencent.mm.plugin.sns.ui.y4, u44.b, a94.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f163857d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f163858e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f163859f;

    /* renamed from: g, reason: collision with root package name */
    public final int f163860g;

    /* renamed from: h, reason: collision with root package name */
    public final b94.d f163861h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView f163862i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f163863m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f163864n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f163865o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f163866p;

    /* renamed from: q, reason: collision with root package name */
    public b94.a f163867q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163868r;

    /* renamed from: s, reason: collision with root package name */
    public int f163869s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f163870t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f163871u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f163872v;

    /* renamed from: w, reason: collision with root package name */
    public final b94.f f163873w;

    /* renamed from: x, reason: collision with root package name */
    public final b94.c f163874x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener f163875y;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonShakeLogic(android.content.Context mContext, android.widget.FrameLayout mShakeViewContainer, android.view.View mAdRootView, int i17, b94.d dVar) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mShakeViewContainer, "mShakeViewContainer");
        kotlin.jvm.internal.o.g(mAdRootView, "mAdRootView");
        this.f163857d = mContext;
        this.f163858e = mShakeViewContainer;
        this.f163859f = mAdRootView;
        this.f163860g = i17;
        this.f163861h = dVar;
        this.f163873w = new b94.f(mContext, new b94.b(this));
        this.f163874x = new b94.c(this, android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        boolean z17 = mContext instanceof androidx.lifecycle.y;
        androidx.lifecycle.y yVar = z17 ? (androidx.lifecycle.y) mContext : null;
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1
                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onCreate(androidx.lifecycle.y owner) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                    kotlin.jvm.internal.o.g(owner, "owner");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                }

                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onDestroy(androidx.lifecycle.y owner) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                    kotlin.jvm.internal.o.g(owner, "owner");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onActivityDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.this;
                    commonShakeLogic.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mars.xlog.Log.i("CommonShakeLogic", "onActivityDestroy, hash=" + commonShakeLogic.hashCode());
                    commonShakeLogic.f163863m = false;
                    commonShakeLogic.b();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deadAdAddStateListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener adAddStateListener = commonShakeLogic.f163875y;
                    if (adAddStateListener != null) {
                        adAddStateListener.dead();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deadAdAddStateListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    commonShakeLogic.a();
                    commonShakeLogic.f163870t = false;
                    commonShakeLogic.f163871u = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onActivityDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                }

                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onPause(androidx.lifecycle.y owner) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                    kotlin.jvm.internal.o.g(owner, "owner");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onActivityPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.this;
                    commonShakeLogic.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mars.xlog.Log.i("CommonShakeLogic", "onActivityPause, hash=" + commonShakeLogic.hashCode());
                    commonShakeLogic.f163863m = false;
                    commonShakeLogic.f163866p = true;
                    commonShakeLogic.b();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onActivityPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                }

                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onResume(androidx.lifecycle.y owner) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                    kotlin.jvm.internal.o.g(owner, "owner");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onActivityResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.this;
                    commonShakeLogic.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    commonShakeLogic.f163863m = true;
                    com.tencent.mars.xlog.Log.i("CommonShakeLogic", "onActivityResume， isPausedBefore=" + commonShakeLogic.f163866p + ", hash=" + commonShakeLogic.hashCode());
                    if (commonShakeLogic.f163866p) {
                        commonShakeLogic.i(1, 50L);
                    }
                    commonShakeLogic.f163866p = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onActivityResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                }
            });
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("aliveAdAddStateListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        androidx.lifecycle.y yVar2 = z17 ? (androidx.lifecycle.y) mContext : null;
        if (yVar2 != null) {
            if (this.f163875y == null) {
                this.f163875y = new com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener(this, yVar2);
            }
            com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener adAddStateListener = this.f163875y;
            if (adAddStateListener != null) {
                adAddStateListener.alive();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("aliveAdAddStateListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (((r6 == null || (r6 = r6.getAdInfo()) == null) ? null : r6.commonShakeInfo) != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(com.tencent.mm.plugin.sns.storage.SnsInfo r6) {
        /*
            java.lang.String r0 = "isEnableCommonShake"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            r3 = 1
            r4 = 0
            if (r6 == 0) goto L19
            boolean r5 = r6.isAd()
            if (r5 != r3) goto L19
            r5 = r3
            goto L1a
        L19:
            r5 = r4
        L1a:
            if (r5 == 0) goto L2b
            if (r6 == 0) goto L27
            com.tencent.mm.plugin.sns.storage.ADInfo r6 = r6.getAdInfo()
            if (r6 == 0) goto L27
            b94.a r6 = r6.commonShakeInfo
            goto L28
        L27:
            r6 = 0
        L28:
            if (r6 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.d(com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    public static final boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$Companion");
        boolean z17 = false;
        try {
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_common_shake_enable, -1) != 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$Companion");
            z17 = z18;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CommonShakeLogic", "isExpEnabled, exp=" + e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.y4
    public void F3() {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        b94.a aVar = this.f163867q;
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionDelay", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
            j17 = aVar.f18614d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionDelay", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
        } else {
            j17 = 0;
        }
        com.tencent.mars.xlog.Log.i("CommonShakeLogic", "onScrollIdle, hash=" + hashCode());
        i(1, j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkReportShakeFailed", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mars.xlog.Log.i("CommonShakeLogic", "checkReportShakeFailed, hasSuccOnece=" + this.f163870t + ", isReportedFail=" + this.f163872v + ", isShakableBefore=" + this.f163871u);
        if (!this.f163870t && !this.f163872v && this.f163871u) {
            k(2);
            this.f163872v = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReportShakeFailed", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    @Override // a94.l
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopDetectShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postMsg$default", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        i(2, 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postMsg$default", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopDetectShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final r44.f c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        try {
            android.content.Context context = this.f163857d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r44.f fVar = (r44.f) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(r44.f.class);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
            return fVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CommonShakeLogic", "getSnsAdBizUic, exp=" + e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
            return null;
        }
    }

    @Override // a94.l
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHighPriorityAd", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHighPriorityAd", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        return false;
    }

    public final void g(boolean z17) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mars.xlog.Log.i("CommonShakeLogic", "onRefresh, isShakeAd=" + z17 + ", hash=" + hashCode() + ", pos=" + this.f163869s);
        this.f163865o = z17;
        if (z17) {
            b94.a aVar = this.f163867q;
            if (aVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionDelay", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
                j17 = aVar.f18614d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionDelay", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
            } else {
                j17 = 0;
            }
            if (this.f163860g != 0 && j17 < 1000) {
                j17 = 1000;
            }
            i(1, j17);
        } else {
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    @Override // a94.l
    public int getPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        int i17 = this.f163869s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        return i17;
    }

    @Override // a94.l
    public float h() {
        int height;
        int a17;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdContentExposureRatio", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
        android.view.View view = this.f163859f;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
        } else {
            android.content.Context context = this.f163857d;
            if (context == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            } else {
                int height2 = view.getHeight();
                android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f482875qh);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                if (findViewById == null) {
                    com.tencent.mars.xlog.Log.e("TimelineAdVisibleAreaHelper", "getCommentViewHeight==null");
                } else if (findViewById.getVisibility() == 0) {
                    height = findViewById.getHeight() + c44.b.a(12);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                    a17 = l44.v5.f316394a.a(context);
                    int i18 = height2 - height;
                    if (a17 != 0 || i18 <= 0) {
                        com.tencent.mars.xlog.Log.w("TimelineAdVisibleAreaHelper", "getAdBodyVisibleRatio, bodyH=0, ratio=0");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                    } else {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        int[] iArr = {0, 0};
                        view.getLocalVisibleRect(rect);
                        view.getLocationOnScreen(iArr);
                        rect.toString();
                        int i19 = iArr[1];
                        int i27 = rect.top;
                        if (i27 == 0 && rect.bottom >= i18 && i19 >= a17) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                            r5 = 1.0f;
                        } else if (i27 >= 0 && i19 < a17) {
                            int i28 = a17 - i19;
                            r5 = i28 < i18 ? 1.0f - (i28 / i18) : 0.0f;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                        } else if (i27 != 0 || (i17 = rect.bottom) >= i18) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                        } else {
                            r5 = 1.0f - ((i18 - i17) / i18);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                        }
                    }
                }
                height = 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                a17 = l44.v5.f316394a.a(context);
                int i182 = height2 - height;
                if (a17 != 0) {
                }
                com.tencent.mars.xlog.Log.w("TimelineAdVisibleAreaHelper", "getAdBodyVisibleRatio, bodyH=0, ratio=0");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            }
        }
        float f17 = r5 * 100;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdContentExposureRatio", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        return f17;
    }

    public final void i(int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postMsg", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mars.xlog.Log.i("CommonShakeLogic", "postMsg, what=" + i17 + ", delay=" + j17 + ", hash=" + hashCode());
        b94.c cVar = this.f163874x;
        cVar.removeCallbacksAndMessages(null);
        cVar.sendEmptyMessageDelayed(i17, j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postMsg", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final void j(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, b94.a aVar, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        this.f163868r = snsInfo;
        this.f163869s = i17;
        this.f163867q = aVar;
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView = this.f163862i;
            if (commonShakeView != null) {
                commonShakeView.setVisibility(8);
            }
            g(false);
        } else {
            com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView2 = this.f163862i;
            if (commonShakeView2 == null) {
                com.tencent.mars.xlog.Log.i("CommonShakeLogic", "new shakeView, mediaWidth=" + i18 + ", source=" + this.f163860g + ", hash=" + hashCode());
                if (i18 > 0) {
                    android.content.Context context = this.f163857d;
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView3 = new com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView(context, null);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i18, c44.b.a(38));
                    layoutParams.gravity = 80;
                    this.f163858e.addView(commonShakeView3, layoutParams);
                    this.f163862i = commonShakeView3;
                }
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = commonShakeView2.getLayoutParams();
                if (!(layoutParams2 != null && layoutParams2.width == i18)) {
                    com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView4 = this.f163862i;
                    if (commonShakeView4 != null) {
                        commonShakeView4.getLayoutParams();
                    }
                    com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView5 = this.f163862i;
                    android.view.ViewGroup.LayoutParams layoutParams3 = commonShakeView5 != null ? commonShakeView5.getLayoutParams() : null;
                    if (layoutParams3 != null) {
                        layoutParams3.width = i18;
                    }
                    com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView6 = this.f163862i;
                    if (commonShakeView6 != null) {
                        commonShakeView6.requestLayout();
                    }
                }
            }
            com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView7 = this.f163862i;
            if (commonShakeView7 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionTip", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
                java.lang.String str = aVar.f18611a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionTip", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
                android.widget.TextView textView = commonShakeView7.f163877d;
                if (textView != null) {
                    textView.setTextSize(0, c44.b.a(12));
                }
                android.widget.TextView textView2 = commonShakeView7.f163877d;
                if (textView2 != null) {
                    if (str == null || str.length() == 0) {
                        str = commonShakeView7.getContext().getString(com.tencent.mm.R.string.f493170ls2);
                        kotlin.jvm.internal.o.f(str, "getString(...)");
                    }
                    textView2.setText(str);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
            }
            b94.f fVar = this.f163873w;
            fVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector");
            boolean z17 = fVar.f18624c != null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector");
            if (z17) {
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView8 = this.f163862i;
                if (commonShakeView8 != null) {
                    commonShakeView8.setVisibility(0);
                }
                g(true);
            } else {
                com.tencent.mars.xlog.Log.e("CommonShakeLogic", "isShakeSupported=false");
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView9 = this.f163862i;
                if (commonShakeView9 != null) {
                    commonShakeView9.setVisibility(8);
                }
                g(false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final void k(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportShakeResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        int i18 = this.f163860g == 0 ? 1 : 2;
        com.tencent.mars.xlog.Log.i("CommonShakeLogic", "reportShakeResult, result=" + i17 + ", scene=" + i18);
        a94.m.b(this.f163868r, i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportShakeResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final void l(boolean z17) {
        com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView commonShakeView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDebugTip", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        if (ca4.m0.d0() && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigCommonShake()) == 1 && (commonShakeView = this.f163862i) != null) {
            commonShakeView.setDebugTipColor(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDebugTip", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }
}
