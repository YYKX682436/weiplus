package com.tencent.mm.plugin.sns.ad.landingpage.halfscreen;

/* loaded from: classes4.dex */
public class AdLandingPageHalfScreenContainer extends com.tencent.mm.ui.widget.RoundedCornerFrameLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f163045x = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f163046g;

    /* renamed from: h, reason: collision with root package name */
    public int f163047h;

    /* renamed from: i, reason: collision with root package name */
    public float f163048i;

    /* renamed from: m, reason: collision with root package name */
    public float f163049m;

    /* renamed from: n, reason: collision with root package name */
    public int f163050n;

    /* renamed from: o, reason: collision with root package name */
    public int f163051o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f163052p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f163053q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f163054r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f163055s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Context f163056t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f163057u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f163058v;

    /* renamed from: w, reason: collision with root package name */
    public n54.n f163059w;

    public AdLandingPageHalfScreenContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163052p = false;
        this.f163053q = false;
        this.f163054r = false;
        this.f163055s = true;
        this.f163057u = true;
        this.f163058v = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        this.f163056t = context;
        this.f163051o = android.view.ViewConfiguration.getTouchSlop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public static /* synthetic */ n54.n c(com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        n54.n nVar = adLandingPageHalfScreenContainer.f163059w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return nVar;
    }

    private int getCurrentPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        int translationY = (int) getTranslationY();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return translationY;
    }

    private android.view.ViewGroup.LayoutParams getModifyLayoutParams() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getModifyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getModifyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return layoutParams;
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSlideToBottomAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(getCurrentPosition(), getHeight());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new n54.l(this));
        ofInt.addListener(new n54.m(this));
        if (n54.i.a() && !g()) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().onHalfScreenAnimationChange(false, true);
        }
        ofInt.start();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.5f);
        ofFloat.setDuration(250L);
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSlideToBottomAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r3 != 3) goto L82;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void e() {
        n54.n nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSlideToTopAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        if (!this.f163057u) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSlideToTopAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return;
        }
        int currentPosition = getCurrentPosition();
        int i17 = this.f163047h;
        if (currentPosition != i17) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(currentPosition, i17);
            ofInt.setDuration(150L);
            ofInt.addUpdateListener(new n54.j(this));
            ofInt.addListener(new n54.k(this));
            ofInt.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSlideToTopAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return;
        }
        com.tencent.mars.xlog.Log.i("LandingPageHalfScreenContainer", "arend doSlideToTopAnim mIsStayTop = " + this.f163052p);
        if (!this.f163052p && (nVar = this.f163059w) != null) {
            this.f163052p = true;
            ((n54.b) nVar).a();
        }
        this.f163052p = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSlideToTopAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public boolean f() {
        int computeVerticalScrollOffset;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        n54.n nVar = this.f163059w;
        if (nVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return false;
        }
        n54.b bVar = (n54.b) nVar;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z76 = n54.f.a(bVar.f335124a).z7();
        if (z76 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            try {
                computeVerticalScrollOffset = z76.C.f270077g.computeVerticalScrollOffset();
            } catch (java.lang.Exception unused) {
            }
            if (z76.f165744n) {
                r3 = computeVerticalScrollOffset > 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            r3 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return r3;
    }

    public final boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        android.content.Context context = this.f163056t;
        if (!(context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return false;
        }
        boolean u17 = ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context).A7().u();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return u17;
    }

    public final void h(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyHalfScreenPercent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LandingPageHalfScreenContainer", "notifyHalfScreenPercent, exp=" + th6.toString());
        }
        if (n54.i.a() && !g()) {
            int i18 = this.f163046g;
            if (i17 < i18) {
                i17 = i18;
            }
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().onHalfScreenHeightChange(1.0f - ((getHeight() - i17) / (getHeight() - this.f163046g)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyHalfScreenPercent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyHalfScreenPercent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSlideToBottom", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        com.tencent.mars.xlog.Log.i("LandingPageHalfScreenContainer", "onSlideToBottom, hash=" + hashCode());
        n54.n nVar = this.f163059w;
        if (nVar != null) {
            n54.b bVar = (n54.b) nVar;
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartSlideToBottom", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
            n54.f.a(bVar.f335124a).l8();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartSlideToBottom", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        } else {
            d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSlideToBottom", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public final void j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        setTranslationY(i17);
        n54.n nVar = this.f163059w;
        if (nVar != null) {
            n54.b bVar = (n54.b) nVar;
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTransYChange", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a17 = n54.f.a(bVar.f335124a);
            a17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixedBottomContainer", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            android.widget.FrameLayout frameLayout = a17.Q2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixedBottomContainer", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                frameLayout.setTranslationY(-i17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTransYChange", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        if (this.f163058v) {
            boolean z17 = this.f163053q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return z17;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return onInterceptTouchEvent;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        if (this.f163058v) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return true;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return onTouchEvent;
    }

    public void setEnableSlideToTop(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnableSlideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        com.tencent.mars.xlog.Log.i("LandingPageHalfScreenContainer", "setEnableSlideToTop, enable=" + z17);
        this.f163057u = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnableSlideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public void setHalfScreenListener(n54.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        this.f163059w = nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public void setHalfScreenModeEnable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenModeEnable", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        this.f163058v = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenModeEnable", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public AdLandingPageHalfScreenContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163052p = false;
        this.f163053q = false;
        this.f163054r = false;
        this.f163055s = true;
        this.f163057u = true;
        this.f163058v = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        this.f163056t = context;
        this.f163051o = android.view.ViewConfiguration.getTouchSlop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }
}
