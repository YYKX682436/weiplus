package fd4;

/* loaded from: classes4.dex */
public class r extends fd4.c implements a94.l {
    public boolean A;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView f261325q;

    /* renamed from: r, reason: collision with root package name */
    public int f261326r;

    /* renamed from: s, reason: collision with root package name */
    public int f261327s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f261328t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f261329u;

    /* renamed from: x, reason: collision with root package name */
    public int f261332x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer f261333y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f261334z;

    /* renamed from: v, reason: collision with root package name */
    public int[] f261330v = new int[2];

    /* renamed from: w, reason: collision with root package name */
    public int[] f261331w = new int[2];
    public int B = Integer.MAX_VALUE;
    public final a94.x C = new fd4.p(this);

    @Override // fd4.c, fd4.l
    public void a(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.a(i17, snsInfo, nVar, layoutParams);
        this.B = i17;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f261292i;
        if (snsInfo2 != null && (shakeCoverView = this.f261325q) != null) {
            int i18 = this.f261294n == 0 ? 1 : 2;
            shakeCoverView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            if (snsInfo2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            } else {
                shakeCoverView.f163840r = i18;
                shakeCoverView.f163835m = snsInfo2;
                a94.a aVar = snsInfo2.getAdXml().adShakeInfo;
                shakeCoverView.f163836n = aVar;
                shakeCoverView.f163841s = this;
                if (aVar != null) {
                    shakeCoverView.f163830e.setText(aVar.f2434h);
                    shakeCoverView.f163831f.setText(shakeCoverView.f163836n.f2435i);
                }
                if (layoutParams != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = shakeCoverView.f163829d.getLayoutParams();
                    int i19 = (int) (layoutParams.height * 0.32d);
                    if (i19 > 0 && layoutParams2.height != i19) {
                        layoutParams2.height = i19;
                        layoutParams2.width = i19;
                        shakeCoverView.f163829d.setLayoutParams(layoutParams2);
                    }
                }
                shakeCoverView.f163838p = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            }
            this.f261289f.f425154o.f168417g.setTimerInterval(300);
        }
        if (!ca4.m0.V(this.f261334z, snsInfo)) {
            if (this.f261333y != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                try {
                    if (this.f261294n == 0 && !this.A) {
                        this.f261289f.f425165z.getViewTreeObserver().addOnPreDrawListener(new fd4.q(this));
                        this.A = true;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "resizeBreakFrameContainer, exp is " + th6);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                this.f261333y.b();
                this.f261333y.setSnsId(snsInfo.field_snsId);
                this.f261333y.setEventListenerEnabled(true);
            }
            this.f261334z = snsInfo;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // a94.l
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopDetectShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.tencent.mars.xlog.Log.i("ShakeAdBusiness", "stopDetectShake");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopDetectShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.d();
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView = this.f261325q;
        if (shakeCoverView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            shakeCoverView.f163838p = true;
            shakeCoverView.f163842t.removeCallbacksAndMessages(null);
            shakeCoverView.c();
            shakeCoverView.h(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        }
        this.f261334z = null;
        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer = this.f261333y;
        if (adPAGFrameContainer != null) {
            adPAGFrameContainer.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.e();
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView = this.f261325q;
        if (shakeCoverView != null) {
            shakeCoverView.b(0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // a94.l
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHighPriorityAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHighPriorityAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return true;
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        if (this.f261288e == null || this.f261292i == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView = this.f261325q;
        if (shakeCoverView != null) {
            shakeCoverView.b(j17);
        }
        v(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // a94.l
    public int getPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        int i17 = this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return i17;
    }

    @Override // a94.l
    public float h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdContentExposureRatio", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdContentExposureRatio", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return 100.0f;
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, u74.d dVar, u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f261325q == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) this.f261289f.f425165z.findViewById(com.tencent.mm.R.id.naq);
            if (viewStub != null) {
                com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView = (com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView) viewStub.inflate();
                this.f261325q = shakeCoverView;
                shakeCoverView.setVisibility(0);
                this.f261325q.setOnShakeListener(this.C);
            } else {
                com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "coverStub==null");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        r44.f t17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.j();
        if (this.f261294n == 0 && (t17 = t()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShakableAdRemoved", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            if (kotlin.jvm.internal.o.b(t17.f369566h, this)) {
                t17.f369566h = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShakableAdRemoved", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c
    public boolean n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return true;
    }

    @Override // fd4.c
    public void o(android.widget.FrameLayout frameLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.o(frameLayout);
        try {
            this.f261326r = i65.a.b(this.f261287d, 100);
            this.f261327s = i65.a.b(this.f261287d, 200);
            u();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onBreakFrameContainerInflated exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void onVideoPause() {
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.onVideoPause();
        if (this.f261292i != null && (shakeCoverView = this.f261325q) != null) {
            shakeCoverView.c();
        }
        v(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c
    public void p(android.widget.FrameLayout frameLayout, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.p(frameLayout, i17, i18);
        if (this.f261332x <= 0) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onBreakFrameContainerSizeCalcFinish but interactionLabelTitleView height <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPAGViewMargins", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            int[] iArr = this.f261330v;
            int[] iArr2 = {iArr[0] - this.f261326r, ((iArr[1] + this.f261332x) - this.f261331w[1]) - this.f261327s};
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPAGViewMargins", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer = this.f261333y;
            if (adPAGFrameContainer == null || adPAGFrameContainer.getParent() != null) {
                com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer2 = this.f261333y;
                if (adPAGFrameContainer2 != null && adPAGFrameContainer2.getParent() != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = this.f261333y.getLayoutParams();
                    if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.width = this.f261326r;
                        layoutParams2.height = this.f261327s;
                        layoutParams2.leftMargin = iArr2[0];
                        layoutParams2.topMargin = iArr2[1];
                        this.f261333y.setLayoutParams(layoutParams2);
                    }
                }
            } else {
                android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(this.f261326r, this.f261327s);
                layoutParams3.leftMargin = iArr2[0];
                layoutParams3.topMargin = iArr2[1];
                frameLayout.addView(this.f261333y, layoutParams3);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onBreakFrameContainerSizeCalcFinish exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c
    public void q(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.q(i17, i18);
        try {
            if (this.f261328t == null) {
                this.f261328t = (android.view.ViewGroup) this.f261289f.f425163x.findViewById(com.tencent.mm.R.id.f486996n46);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onContentPreDraw exp is " + th6);
        }
        if (this.f261328t == null) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onContentPreDraw but mInteractionLabelViewGroup is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        int[] iArr = new int[2];
        this.f261331w = iArr;
        this.f261289f.f425163x.getLocationOnScreen(iArr);
        if (this.f261329u == null) {
            this.f261329u = this.f261328t.findViewById(com.tencent.mm.R.id.obc);
        }
        android.view.View view = this.f261329u;
        if (view != null) {
            int[] iArr2 = new int[2];
            this.f261330v = iArr2;
            view.getLocationOnScreen(iArr2);
            this.f261332x = this.f261329u.getHeight();
            com.tencent.mars.xlog.Log.i("ShakeAdBusiness", "shake title x is " + this.f261330v[0] + ", y is " + this.f261330v[1] + ", titleView height is " + this.f261332x + ", itemRootView y is " + this.f261331w[1]);
        } else {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onContentPreDraw but mInteractionLabelTitleView is null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    public final boolean s(android.app.Activity activity) {
        int i17;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        if (activity instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) this.f261287d;
            snsCommentDetailUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            i17 = snsCommentDetailUI.P1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            if (activity instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
                com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI activity2 = (com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) this.f261287d;
                kotlin.jvm.internal.o.g(activity2, "activity");
                com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = (com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.class);
                improveMainUIC.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                int i18 = improveMainUIC.f168699h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                z17 = i18 == 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                return z17;
            }
            i17 = -1;
        }
        z17 = i17 == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return z17;
    }

    public r44.f t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        try {
            android.app.Activity context = this.f261287d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r44.f fVar = (r44.f) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(r44.f.class);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return fVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "getSnsAdBizUic, exp=" + e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return null;
        }
    }

    public final void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer = new com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer(this.f261287d);
        this.f261333y = adPAGFrameContainer;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initThumbView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            adPAGFrameContainer.f163315e = new android.widget.ImageView(adPAGFrameContainer.getContext());
            adPAGFrameContainer.addView(adPAGFrameContainer.f163315e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initThumbView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer2 = this.f261333y;
        adPAGFrameContainer2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(adPAGFrameContainer2.getContext());
            adPAGFrameContainer2.f163314d = mMPAGView;
            boolean z17 = true;
            if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) != 1) {
                z17 = false;
            }
            mMPAGView.o(z17);
            adPAGFrameContainer2.addView(adPAGFrameContainer2.f163314d, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer3 = this.f261333y;
        adPAGFrameContainer3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initThumbData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            android.widget.ImageView imageView = adPAGFrameContainer3.f163315e;
            if (imageView != null) {
                imageView.setImageDrawable(adPAGFrameContainer3.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cfh));
            }
        } catch (java.lang.Throwable unused3) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initThumbData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer4 = this.f261333y;
        adPAGFrameContainer4.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPAGData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.view.MMPAGView mMPAGView2 = adPAGFrameContainer4.f163314d;
        if (mMPAGView2 != null) {
            mMPAGView2.setPath("assets://sns/sna_ad_shake_attract_anim.pag");
            adPAGFrameContainer4.f163314d.setScaleMode(3);
            adPAGFrameContainer4.f163314d.setRepeatCount(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPAGData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    public final void v(boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer = this.f261333y;
        if (adPAGFrameContainer == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        boolean z19 = false;
        try {
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                com.tencent.mm.view.MMPAGView mMPAGView = adPAGFrameContainer.f163314d;
                if (mMPAGView != null) {
                    z19 = mMPAGView.f();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                }
                if (z19) {
                    com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer2 = this.f261333y;
                    adPAGFrameContainer2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    com.tencent.mm.view.MMPAGView mMPAGView2 = adPAGFrameContainer2.f163314d;
                    if (mMPAGView2 != null) {
                        mMPAGView2.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.h(adPAGFrameContainer2));
                        com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "stop");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                }
            } else {
                if (!s(this.f261287d)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                    return;
                }
                if (!this.f261333y.isAttachedToWindow()) {
                    com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "notifyPAGStatus, isVideoPlaying is true but mAdPAGFrameContainer is onDetachedFromWindow");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                    return;
                }
                com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer3 = this.f261333y;
                adPAGFrameContainer3.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                com.tencent.mm.view.MMPAGView mMPAGView3 = adPAGFrameContainer3.f163314d;
                if (mMPAGView3 != null) {
                    z18 = mMPAGView3.f();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    z18 = false;
                }
                if (!z18) {
                    com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer4 = this.f261333y;
                    adPAGFrameContainer4.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReset", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    boolean z27 = adPAGFrameContainer4.f163316f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReset", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    if (z27) {
                        this.f261333y.c();
                    } else {
                        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer5 = this.f261333y;
                        adPAGFrameContainer5.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                        com.tencent.mm.view.MMPAGView mMPAGView4 = adPAGFrameContainer5.f163314d;
                        if (mMPAGView4 != null) {
                            mMPAGView4.setVisibility(0);
                            adPAGFrameContainer5.f163314d.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.g(adPAGFrameContainer5));
                            adPAGFrameContainer5.f163316f = false;
                            com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "resume");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "notifyPAGPlayingStatus exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }
}
