package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes8.dex */
public class ScrollableLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f170937d;

    /* renamed from: e, reason: collision with root package name */
    public int f170938e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Scroller f170939f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f170940g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f170941h;

    /* renamed from: i, reason: collision with root package name */
    public int f170942i;

    /* renamed from: m, reason: collision with root package name */
    public int f170943m;

    /* renamed from: n, reason: collision with root package name */
    public int f170944n;

    /* renamed from: o, reason: collision with root package name */
    public int f170945o;

    /* renamed from: p, reason: collision with root package name */
    public int f170946p;

    /* renamed from: q, reason: collision with root package name */
    public int f170947q;

    /* renamed from: r, reason: collision with root package name */
    public int f170948r;

    /* renamed from: s, reason: collision with root package name */
    public int f170949s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.ad.f1 f170950t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.ad.d1 f170951u;

    public ScrollableLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a(android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        boolean z17 = false;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return false;
        }
        int scrollY = getScrollY();
        if (i18 >= view.getTop() - scrollY && i18 < view.getBottom() - scrollY && i17 >= view.getLeft() && i17 < view.getRight()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return z17;
    }

    public final boolean b(android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        int action = motionEvent.getAction();
        if (action == 2 && this.f170940g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return true;
        }
        int i17 = action & 255;
        boolean z17 = false;
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            this.f170948r = getScrollY();
            if (a(this.f170941h, x17, y17)) {
                this.f170947q = motionEvent.getPointerId(0);
                this.f170942i = y17;
                this.f170940g = !this.f170939f.isFinished();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeRealScrollY", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                int i18 = this.f170943m;
                if (i18 <= 0) {
                    i18 = this.f170944n / 3;
                }
                this.f170945o = this.f170944n + i18;
                this.f170946p = -i18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeRealScrollY", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            } else {
                this.f170940g = false;
            }
            com.tencent.mars.xlog.Log.i("ScrollLinearLayout", "the onInterceptTouchActionDown is called " + this.f170940g + ", mScrollYWhenTouchDown = " + this.f170948r);
            boolean z18 = this.f170940g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return z18;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                int i19 = this.f170947q;
                if (i19 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i19)) >= 0) {
                    motionEvent.getX(findPointerIndex);
                    int y18 = (int) motionEvent.getY(findPointerIndex);
                    int i27 = y18 - this.f170942i;
                    int scrollY = getScrollY();
                    if (java.lang.Math.abs(i27) >= this.f170937d) {
                        com.tencent.mm.plugin.sns.ui.widget.ad.d1 d1Var = this.f170951u;
                        if (d1Var != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$2");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                            boolean z19 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a0) d1Var).f165047a.B;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$2");
                            z17 = z19;
                        }
                        this.f170942i = y18;
                        if ((i27 < 0 && scrollY <= 0) || (i27 > 0 && scrollY >= this.f170944n && !z17)) {
                            this.f170940g = true;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("ScrollLinearLayout", "the onInterceptTouchActionMove is called " + this.f170940g);
                boolean z27 = this.f170940g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return z27;
            }
            if (i17 != 3) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f170940g = false;
        this.f170947q = -1;
        com.tencent.mars.xlog.Log.i("ScrollLinearLayout", "the onInterceptTouchActionUpOrCancel is called " + this.f170940g);
        boolean z28 = this.f170940g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return z28;
    }

    public final boolean c(android.view.MotionEvent motionEvent) {
        int i17;
        int i18;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        int actionMasked = motionEvent.getActionMasked();
        boolean z17 = false;
        boolean z18 = true;
        if (actionMasked == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            if (a(this.f170941h, x17, y17)) {
                this.f170940g = true ^ this.f170939f.isFinished();
                if (!this.f170939f.isFinished()) {
                    this.f170939f.abortAnimation();
                }
                this.f170942i = y17;
                this.f170947q = motionEvent.getPointerId(0);
                com.tencent.mars.xlog.Log.i("ScrollLinearLayout", "the onTouchActionDown is called " + this.f170940g);
                z17 = this.f170940g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return z17;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                int findPointerIndex = motionEvent.findPointerIndex(this.f170947q);
                if (findPointerIndex < 0) {
                    com.tencent.mars.xlog.Log.e("ScrollLinearLayout", "Invalid pointerId=" + this.f170947q + " in onTouchEvent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                } else {
                    motionEvent.getX(findPointerIndex);
                    int y18 = (int) motionEvent.getY(findPointerIndex);
                    int i27 = y18 - this.f170942i;
                    if (!this.f170940g) {
                        int abs = java.lang.Math.abs(i27);
                        int i28 = this.f170937d;
                        if (abs >= i28) {
                            this.f170940g = true;
                            i27 = i27 > 0 ? i27 - i28 : i27 + i28;
                        }
                    }
                    int scrollY = getScrollY() - i27;
                    if (this.f170940g && this.f170946p < scrollY && this.f170945o > scrollY) {
                        d(1);
                        scrollBy(0, -i27);
                        this.f170942i = y18;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return true;
            }
            if (actionMasked != 3) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        int i29 = this.f170948r;
        int scrollY2 = getScrollY();
        int i37 = scrollY2 - i29;
        if (i37 > 0) {
            i17 = this.f170944n - scrollY2;
            if (i37 < this.f170938e) {
                i18 = -scrollY2;
                i19 = i18;
            }
            i19 = i17;
        } else {
            i17 = -scrollY2;
            if (i37 > (-this.f170938e)) {
                i18 = this.f170944n - scrollY2;
                i19 = i18;
            }
            i19 = i17;
        }
        com.tencent.mars.xlog.Log.i("ScrollLinearLayout", "the onTouchActionUpOrCancel is called, mScrollYWhenTouchDown = " + i29 + ", currentScrollY = " + scrollY2 + ", yDistance = " + i19);
        if (this.f170940g) {
            this.f170939f.startScroll(getScrollX(), scrollY2, 0, i19, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
            invalidate();
            d(2);
        } else {
            d(0);
            z18 = false;
        }
        this.f170940g = false;
        this.f170947q = -1;
        this.f170942i = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return z18;
    }

    @Override // android.view.View
    public void computeScroll() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        super.computeScroll();
        try {
            if (this.f170939f.computeScrollOffset()) {
                scrollTo(this.f170939f.getCurrX(), this.f170939f.getCurrY());
                invalidate();
            } else if (this.f170949s == 2) {
                com.tencent.mars.xlog.Log.i("ScrollLinearLayout", "compute scroll offset is false the currY is " + this.f170939f.getCurrY() + ", the final Y is " + this.f170939f.getFinalY());
                d(0);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("ScrollLinearLayout", "the compute scroll has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public final void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportScrollStateChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        if (i17 != this.f170949s) {
            com.tencent.mm.plugin.sns.ui.widget.ad.f1 f1Var = this.f170950t;
            if (f1Var != null) {
                int i18 = 1;
                boolean z17 = getScrollY() >= this.f170944n;
                android.content.Context context = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0) f1Var).f165049d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                if (i17 == 0) {
                    try {
                        b4.d a17 = b4.d.a(context);
                        android.content.Intent intent = new android.content.Intent("com.tencent.mm.adlanding.video.action.PAUSE_OR_RESUME");
                        if (!z17) {
                            i18 = 2;
                        }
                        intent.putExtra("TRY_PAUSE_OR_RESUME", i18);
                        intent.putExtra("identity", context.hashCode());
                        a17.c(intent);
                    } catch (java.lang.Throwable unused) {
                        com.tencent.mars.xlog.Log.w("AdLandingFloatWebView", "onScrollChanged method has something wrong");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            }
            com.tencent.mars.xlog.Log.i("ScrollLinearLayout", "the new state is " + i17);
            this.f170949s = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScrollStateChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            if (b(motionEvent)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return true;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("ScrollLinearLayout", "the onInterceptTouchEventInner has something wrong");
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return onInterceptTouchEvent;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            if (c(motionEvent)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return true;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("ScrollLinearLayout", "the onTouchEventInner is called " + this.f170940g);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return onTouchEvent;
    }

    public void setChildScrollableListener(com.tencent.mm.plugin.sns.ui.widget.ad.d1 d1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setChildScrollableListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f170951u = d1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setChildScrollableListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public void setDescendantScrollStatusHunter(com.tencent.mm.plugin.sns.ui.widget.ad.e1 e1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDescendantScrollStatusHunter", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDescendantScrollStatusHunter", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public void setMaxOverScrollOffset(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxOverScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f170943m = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxOverScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public void setMaxYScrollOffset(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxYScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f170944n = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxYScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public void setOnScrollStatusListener(com.tencent.mm.plugin.sns.ui.widget.ad.f1 f1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnScrollStatusListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f170950t = f1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnScrollStatusListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public ScrollableLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f170940g = false;
        this.f170943m = 0;
        this.f170944n = 0;
        this.f170945o = 0;
        this.f170946p = 0;
        this.f170947q = -1;
        this.f170948r = 0;
        this.f170949s = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            this.f170939f = new android.widget.Scroller(context, new android.view.animation.DecelerateInterpolator());
            this.f170937d = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
            setOrientation(1);
            this.f170938e = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a_e);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("ScrollLinearLayout", "the init method has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }
}
