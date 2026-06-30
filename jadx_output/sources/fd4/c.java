package fd4;

/* loaded from: classes4.dex */
public abstract class c implements fd4.l {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f261287d;

    /* renamed from: e, reason: collision with root package name */
    public i64.b1 f261288e;

    /* renamed from: f, reason: collision with root package name */
    public u74.d f261289f;

    /* renamed from: g, reason: collision with root package name */
    public u74.f f261290g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.i f261291h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f261292i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.n f261293m;

    /* renamed from: n, reason: collision with root package name */
    public int f261294n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f261295o;

    /* renamed from: p, reason: collision with root package name */
    public final w64.l f261296p = new fd4.a(this);

    @Override // fd4.l
    public void a(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        this.f261292i = snsInfo;
        if (snsInfo != null) {
            ca4.z0.t0(snsInfo.field_snsId);
        }
        this.f261293m = nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, u74.d dVar, u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        this.f261287d = activity;
        this.f261291h = iVar;
        this.f261288e = b1Var;
        this.f261289f = dVar;
        this.f261294n = dVar.T.f425131a;
        this.f261290g = fVar;
        if (n()) {
            u74.d dVar2 = this.f261289f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            com.tencent.mars.xlog.Log.i("BaseFullCardAdBusiness", "initBreakFrameContainer, hash=" + hashCode());
            if (m()) {
                android.view.ViewStub viewStub = (android.view.ViewStub) dVar2.f425163x.findViewById(com.tencent.mm.R.id.n3o);
                if (viewStub == null || this.f261295o != null) {
                    com.tencent.mars.xlog.Log.e("BaseFullCardAdBusiness", "onCreate, no fullFrameContainerStub in timeline");
                } else {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewStub.inflate();
                    this.f261295o = frameLayout;
                    frameLayout.setVisibility(0);
                }
            } else {
                android.view.View view = dVar2.f425163x;
                if (view instanceof com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout) {
                    android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.f261287d);
                    this.f261295o = frameLayout2;
                    ((com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout) view).setAdFullFrameContainer(frameLayout2);
                } else {
                    com.tencent.mars.xlog.Log.e("BaseFullCardAdBusiness", "onCreate, no AdLinearLayout in detail");
                }
            }
            android.widget.FrameLayout frameLayout3 = this.f261295o;
            if (frameLayout3 != null) {
                o(frameLayout3);
            }
            dVar2.f425165z.getViewTreeObserver().addOnPreDrawListener(new fd4.b(this, dVar2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void k(int i17) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mars.xlog.Log.i("BaseFullCardAdBusiness", "doEggClickReport, clickPos=" + i17 + ", source=" + this.f261294n);
        if (this.f261288e == null || (snsInfo = this.f261292i) == null) {
            com.tencent.mars.xlog.Log.e("BaseFullCardAdBusiness", "doEggClickReport err, param==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            return;
        }
        try {
            int i18 = this.f261294n;
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i18, i18 == 0 ? 1 : 2, snsInfo.field_snsId, i17, 21);
            ca4.m0.f(snsAdClick, this.f261288e, this.f261292i, i17);
            ca4.z0.x0(snsAdClick);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("BaseFullCardAdBusiness", "doEggClickReport, clickPos=" + i17 + ", source=" + this.f261294n + ", exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void l() {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mars.xlog.Log.i("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage, source=" + this.f261294n);
        android.app.Activity activity = this.f261287d;
        if (activity == null || (snsInfo = this.f261292i) == null) {
            com.tencent.mars.xlog.Log.e("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage err, param==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            return;
        }
        try {
            int i17 = this.f261294n;
            int i18 = 2;
            if (i17 == 2) {
                i18 = 16;
            } else if (i17 != 1) {
                i18 = 1;
            }
            android.view.View view = this.f261289f.f425165z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            ca4.m0.p0(activity, view, snsInfo, i18, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public boolean m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromTimeline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        boolean z17 = this.f261289f.T.f425131a == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromTimeline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        return z17;
    }

    public boolean n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        return false;
    }

    public void o(android.widget.FrameLayout frameLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void onVideoPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void p(android.widget.FrameLayout frameLayout, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void q(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void r(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f261291h;
        if (iVar != null) {
            iVar.M(this.f261289f, bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }
}
