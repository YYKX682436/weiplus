package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes8.dex */
public class k0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 implements com.tencent.mm.plugin.sns.ui.widget.ad.e1, com.tencent.mm.plugin.sns.ui.widget.ad.f1 {
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e0 A;
    public boolean B;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f165302s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout f165303t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f165304u;

    /* renamed from: v, reason: collision with root package name */
    public zg0.q2 f165305v;

    /* renamed from: w, reason: collision with root package name */
    public final ab4.f f165306w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f165307x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f165308y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f165309z;

    public k0(android.content.Context context, ab4.f fVar, android.view.ViewGroup viewGroup) {
        super(context, fVar, viewGroup);
        this.f165309z = false;
        this.A = null;
        this.B = false;
        try {
            this.f165306w = fVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            if (this.f165307x == null) {
                final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4
                    {
                        this.__eventId = -1022821005;
                    }

                    @Override // com.tencent.mm.sdk.event.IListener
                    public boolean callback(com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent snsAdWebViewFileResultEvent) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
                        com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent snsAdWebViewFileResultEvent2 = snsAdWebViewFileResultEvent;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
                        try {
                            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0.O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0.this, snsAdWebViewFileResultEvent2);
                        } catch (java.lang.Throwable unused) {
                            com.tencent.mars.xlog.Log.w("AdLandingFloatWebView", "resizing layout has wrong!");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
                        return true;
                    }
                };
                this.f165307x = iListener;
                iListener.alive();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 k0Var, com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent snsAdWebViewFileResultEvent) {
        am.jv jvVar;
        int i17;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEventCall", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        if (snsAdWebViewFileResultEvent != null && (i17 = (jvVar = snsAdWebViewFileResultEvent.f54801g).f7098a) != 0 && i17 == 1) {
            int i18 = jvVar.f7099b;
            int i19 = jvVar.f7100c;
            android.content.Intent intent = jvVar.f7101d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            if (i18 == 2003 && (f0Var = k0Var.f165308y) != null) {
                f0Var.b((android.app.Activity) k0Var.f165049d, i18, i19, intent);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEventCall", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }

    public static void P(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 k0Var, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResizeViewLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        android.view.View view = k0Var.f165304u;
        if (view != null && k0Var.f165303t != null && k0Var.f165302s != null) {
            view.getHeight();
            k0Var.f165303t.getHeight();
            k0Var.f165302s.getHeight();
            android.view.ViewGroup.LayoutParams layoutParams = k0Var.f165304u.getLayoutParams();
            layoutParams.height = i18;
            k0Var.f165304u.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = k0Var.f165302s.getLayoutParams();
            int height = k0Var.f165303t.getHeight();
            android.content.Context context = k0Var.f165049d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeWebViewHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            try {
                int i19 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(context)[1];
                if (height == i19 && com.tencent.mm.ui.bk.u(context, false)) {
                    height = i19 - com.tencent.mm.ui.bk.p(context);
                }
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeWebViewHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            layoutParams2.height = height;
            k0Var.f165302s.setLayoutParams(layoutParams2);
            k0Var.f165303t.setMaxYScrollOffset(i18);
            k0Var.f165303t.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResizeViewLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }

    public static boolean T(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isActivityAlive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        boolean z17 = (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isActivityAlive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        super.L();
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            com.tencent.mars.xlog.Log.i("AdLandingFloatWebView", "the view is going to destroy");
            com.tencent.mm.sdk.event.IListener iListener = this.f165307x;
            if (iListener != null) {
                iListener.dead();
            }
            zg0.q2 q2Var = this.f165305v;
            if (q2Var != null) {
                ((com.tencent.mm.plugin.webview.core.e3) q2Var).D0();
            }
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f165302s;
            if (mMWebView != null) {
                mMWebView.destroy();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("AdLandingFloatWebView", "the destroy method has something wrong");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }

    public final java.lang.String R(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillUrlParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        try {
            ab4.n0 u17 = u();
            if (u17 != null && !android.text.TextUtils.isEmpty(str)) {
                java.lang.String n17 = u17.n();
                if (android.text.TextUtils.isEmpty(n17)) {
                    n17 = u17.o();
                }
                if (!android.text.TextUtils.isEmpty(n17)) {
                    str = ca4.z0.b(str, n17);
                }
                str = f44.a.e(str);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "fill url param occur error!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillUrlParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        return str;
    }

    public boolean S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixWebViewScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_h5_fix_scroll_switch, 1);
            com.tencent.mars.xlog.Log.i("AdLandingFloatWebView", "fixWebViewScroll, exptValue=" + Ni);
            boolean z17 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixWebViewScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixWebViewScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            return true;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        super.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("obtainPlaceViewHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        if (!this.f165309z) {
            this.f165309z = true;
            try {
                android.view.View view = this.f165056n;
                if (view != null) {
                    android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g0(this));
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainPlaceViewHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View j() {
        android.content.Context context = this.f165049d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        try {
            this.f165303t = new com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout(context, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            java.lang.String str = this.f165306w.F;
            java.lang.String[] strArr = hy4.p0.f286185a;
            com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(context);
            a17.F0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            this.f165302s = a17;
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
            androidx.legacy.widget.Space space = new androidx.legacy.widget.Space(context, null);
            this.f165304u = space;
            space.setLayoutParams(layoutParams);
            this.f165303t.addView(this.f165304u);
            this.f165308y = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0();
            this.f165303t.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f165303t.setDescendantScrollStatusHunter(this);
            this.f165303t.setOnScrollStatusListener(this);
            this.f165303t.setChildScrollableListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a0(this));
            if (S()) {
                this.f165302s.setWebViewCallbackClient(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b0(this));
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -1);
            com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout scrollableLayout = this.f165303t;
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f165302s;
            scrollableLayout.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            try {
                scrollableLayout.addView(mMWebView, layoutParams2);
                scrollableLayout.f170941h = mMWebView;
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.w("ScrollLinearLayout", "the addView has something wrong!");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        } catch (java.lang.Throwable unused2) {
            com.tencent.mars.xlog.Log.w("AdLandingFloatWebView", "the customLayout method has something wrong");
        }
        com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout scrollableLayout2 = this.f165303t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        return scrollableLayout2;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        try {
            if (this.f165305v == null) {
                java.lang.String R = R(this.f165306w.F);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateWebViewIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", R);
                intent.putExtra("useJs", true);
                intent.putExtra("type", -255);
                intent.putExtra("geta8key_scene", 69);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateWebViewIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                this.f165305v = ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).wi(this.f165302s, 69);
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e0 e0Var = this.A;
                android.content.Context context = this.f165049d;
                if (e0Var == null) {
                    this.A = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e0(context, this.f165305v);
                }
                ((com.tencent.mm.plugin.webview.core.r0) this.f165305v).D(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z(this));
                this.f165302s.setWebChromeClient(new al5.n2(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j0((android.app.Activity) context, ((com.tencent.mm.plugin.webview.core.r0) this.f165305v).R, this.f165308y)));
                ((com.tencent.mm.plugin.webview.core.r0) this.f165305v).q0();
                this.f165305v.j(intent);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "bind webview callback failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }
}
