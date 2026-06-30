package l94;

/* loaded from: classes4.dex */
public final class e0 extends l94.e implements k94.g {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f317347h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView f317348i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f317349j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f317350k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context) {
        super("WsFoldVideoAdComponent", context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f317347h = "";
    }

    public static final /* synthetic */ java.lang.String n(l94.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        java.lang.String str = e0Var.f317347h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        return str;
    }

    @Override // k94.g
    public void a(java.lang.String viewId, k94.i status, double d17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(status, "status");
        if (!kotlin.jvm.internal.o.b(viewId, this.f317347h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
            return;
        }
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i(h(), "feed become visible，video start play");
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = this.f317348i;
            if (adLandingGeneralVideoView != null && this.f317350k) {
                adLandingGeneralVideoView.S(0.0d);
                adLandingGeneralVideoView.play();
                this.f317350k = false;
            }
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i(h(), "feed become invisible，video pause play");
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView2 = this.f317348i;
            if (adLandingGeneralVideoView2 != null && adLandingGeneralVideoView2.isPlaying()) {
                adLandingGeneralVideoView2.pause();
            }
            this.f317350k = true;
            java.lang.String str = this.f317347h;
            if (str != null) {
                k94.f.f305946a.a(str);
            }
        } else if (ordinal == 4) {
            com.tencent.mars.xlog.Log.i(h(), "feed removed，video pause play");
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView3 = this.f317348i;
            if (adLandingGeneralVideoView3 != null && adLandingGeneralVideoView3.isPlaying()) {
                adLandingGeneralVideoView3.pause();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e(h(), "the ad sns info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
            return;
        }
        this.f317347h = adInfo.d();
        java.util.LinkedList linkedList = b17.f372071d;
        if (linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e(h(), "there is no media info");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
            return;
        }
        r45.fb6 fb6Var = ((r45.i96) linkedList.get(0)).f376853e;
        if (fb6Var == null) {
            com.tencent.mars.xlog.Log.e(h(), "there is no video info info");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
            return;
        }
        java.lang.String str = fb6Var.f374181d;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = fb6Var.f374181d;
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = this.f317348i;
            a84.m.a(str2, adLandingGeneralVideoView != null ? adLandingGeneralVideoView.getThumbView() : null);
        }
        java.lang.String str3 = fb6Var.f374184g;
        if (!(str3 == null || str3.length() == 0)) {
            if (com.tencent.mm.vfs.w6.j(za4.t0.g() + "WsFoldAdVideo_" + a84.d0.d(l44.c0.j(fb6Var.f374184g, true)) + ".mp4")) {
                h();
            }
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView2 = this.f317348i;
            if (adLandingGeneralVideoView2 != null) {
                adLandingGeneralVideoView2.h(false, fb6Var.f374184g, 0);
            }
            android.content.Context context = f();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            f94.a aVar = (f94.a) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(f94.a.class);
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibilityManager", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibilityManager", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            aVar.f260532d.a(this);
            k94.f.f305946a.c(adInfo, fb6Var);
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView3 = this.f317348i;
            if (adLandingGeneralVideoView3 != null) {
                adLandingGeneralVideoView3.setAdMMVideoViewCallback(new l94.c0(this));
            }
            h();
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView4 = this.f317348i;
            if (adLandingGeneralVideoView4 != null) {
                adLandingGeneralVideoView4.start();
            }
            if (!this.f317349j) {
                java.lang.Object f17 = f();
                androidx.lifecycle.y yVar = f17 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) f17 : null;
                if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
                    mo133getLifecycle.a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$onBindData$1

                        /* renamed from: d, reason: collision with root package name */
                        public boolean f163974d;

                        @Override // androidx.lifecycle.v
                        public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$onBindData$1");
                            kotlin.jvm.internal.o.g(source, "source");
                            kotlin.jvm.internal.o.g(event, "event");
                            l94.e0 e0Var = l94.e0.this;
                            e0Var.h();
                            event.toString();
                            l94.e0.n(e0Var);
                            int i17 = l94.d0.f317339a[event.ordinal()];
                            if (i17 == 1) {
                                source.mo133getLifecycle().c(this);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView5 = e0Var.f317348i;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                if (adLandingGeneralVideoView5 != null) {
                                    adLandingGeneralVideoView5.stop();
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                e0Var.f317348i = null;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                            } else if (i17 == 2) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView6 = e0Var.f317348i;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                if (adLandingGeneralVideoView6 != null && adLandingGeneralVideoView6.isPlaying()) {
                                    e0Var.h();
                                    l94.e0.n(e0Var);
                                    adLandingGeneralVideoView6.pause();
                                }
                                this.f163974d = true;
                            } else if (i17 == 3) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView7 = e0Var.f317348i;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                if (adLandingGeneralVideoView7 != null && !adLandingGeneralVideoView7.isPlaying() && this.f163974d) {
                                    e0Var.h();
                                    l94.e0.n(e0Var);
                                    adLandingGeneralVideoView7.play();
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$onBindData$1");
                        }
                    });
                }
                this.f317349j = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(f());
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = -1;
            frameLayout.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = new com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView(frameLayout.getContext(), null);
        adLandingGeneralVideoView.setMute(true);
        adLandingGeneralVideoView.setLoop(true);
        java.lang.String g17 = za4.t0.g();
        com.tencent.mm.vfs.w6.u(g17);
        adLandingGeneralVideoView.setRootPath(g17);
        w54.g gVar = new w54.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPreAllocStorage", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        gVar.f443041f = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPreAllocStorage", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        adLandingGeneralVideoView.setIOnlineVideoProxy(gVar);
        adLandingGeneralVideoView.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
        adLandingGeneralVideoView.setAdMMVideoViewCallback(new g54.d());
        adLandingGeneralVideoView.setIsShowBasicControls(false);
        this.f317348i = adLandingGeneralVideoView;
        c44.a.l();
        c44.a.l();
        frameLayout.addView(adLandingGeneralVideoView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        return frameLayout;
    }
}
