package l94;

/* loaded from: classes4.dex */
public final class t extends l94.e implements k94.g {

    /* renamed from: h, reason: collision with root package name */
    public final int f317390h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f317391i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView f317392j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f317393k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f317394l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317395m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.l f317396n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317397o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, int i17) {
        super("WsFoldLeftMaterialRightTextComponent", context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f317390h = i17;
        this.f317394l = "";
        this.f317396n = j94.b.c(context, 0, 0, 6, null);
    }

    public static final /* synthetic */ java.lang.String n(l94.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        java.lang.String str = tVar.f317394l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        return str;
    }

    @Override // k94.g
    public void a(java.lang.String viewId, k94.i status, double d17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(status, "status");
        if (!kotlin.jvm.internal.o.b(viewId, this.f317394l)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
            return;
        }
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i(h(), "feed become visible，video start play");
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = this.f317392j;
            if (adLandingGeneralVideoView != null && this.f317397o) {
                adLandingGeneralVideoView.S(0.0d);
                adLandingGeneralVideoView.play();
                this.f317397o = false;
            }
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i(h(), "feed become invisible，video pause play");
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView2 = this.f317392j;
            if (adLandingGeneralVideoView2 != null && adLandingGeneralVideoView2.isPlaying()) {
                adLandingGeneralVideoView2.pause();
            }
            this.f317397o = true;
            java.lang.String str = this.f317394l;
            if (str != null) {
                k94.f.f305946a.a(str);
            }
        } else if (ordinal == 4) {
            com.tencent.mars.xlog.Log.i(h(), "feed removed，video pause play");
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView3 = this.f317392j;
            if (adLandingGeneralVideoView3 != null && adLandingGeneralVideoView3.isPlaying()) {
                adLandingGeneralVideoView3.pause();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        r45.d96 d96Var;
        int i17;
        int e17;
        r45.fb6 fb6Var;
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i(h(), "the fold sns info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
            return;
        }
        java.util.LinkedList linkedList = b17.f372071d;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i(h(), "the fold sns media info is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
            return;
        }
        int i18 = this.f317390h;
        if (i18 == 10 || i18 == 12) {
            android.widget.ImageView imageView = this.f317391i;
            if (imageView == null) {
                com.tencent.mars.xlog.Log.e(h(), "the image view is null, styleType is " + i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                return;
            }
            r45.i96 i96Var = (r45.i96) linkedList.get(0);
            a84.m.a((i96Var == null || (d96Var = i96Var.f376852d) == null) ? null : d96Var.f372253d, imageView);
        } else {
            this.f317394l = adInfo.d();
            r45.i96 i96Var2 = (r45.i96) linkedList.get(0);
            if (i96Var2 == null || (fb6Var = i96Var2.f376853e) == null) {
                com.tencent.mars.xlog.Log.e(h(), "there is no video info info");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                return;
            }
            java.lang.String str = fb6Var.f374181d;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = fb6Var.f374181d;
                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = this.f317392j;
                a84.m.a(str2, adLandingGeneralVideoView != null ? adLandingGeneralVideoView.getThumbView() : null);
            }
            java.lang.String str3 = fb6Var.f374184g;
            if (!(str3 == null || str3.length() == 0)) {
                if (com.tencent.mm.vfs.w6.j(za4.t0.g() + "WsFoldAdVideo_" + a84.d0.d(l44.c0.j(fb6Var.f374184g, true)) + ".mp4")) {
                    com.tencent.mars.xlog.Log.i(h(), "video resource is exist");
                }
                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView2 = this.f317392j;
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
                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView3 = this.f317392j;
                if (adLandingGeneralVideoView3 != null) {
                    adLandingGeneralVideoView3.setAdMMVideoViewCallback(new l94.r(this));
                }
                com.tencent.mars.xlog.Log.i(h(), "start");
                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView4 = this.f317392j;
                if (adLandingGeneralVideoView4 != null) {
                    adLandingGeneralVideoView4.start();
                }
                if (!this.f317395m) {
                    java.lang.Object f17 = f();
                    androidx.lifecycle.y yVar = f17 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) f17 : null;
                    if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
                        mo133getLifecycle.a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$onBindData$1

                            /* renamed from: d, reason: collision with root package name */
                            public boolean f163970d;

                            @Override // androidx.lifecycle.v
                            public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$onBindData$1");
                                kotlin.jvm.internal.o.g(source, "source");
                                kotlin.jvm.internal.o.g(event, "event");
                                l94.t tVar = l94.t.this;
                                com.tencent.mars.xlog.Log.i(tVar.h(), "lifecycle event changed: " + event + ", traceId: " + l94.t.n(tVar));
                                int i19 = l94.s.f317389a[event.ordinal()];
                                if (i19 == 1) {
                                    source.mo133getLifecycle().c(this);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView5 = tVar.f317392j;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    if (adLandingGeneralVideoView5 != null) {
                                        adLandingGeneralVideoView5.stop();
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    tVar.f317392j = null;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                } else if (i19 == 2) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView6 = tVar.f317392j;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    if (adLandingGeneralVideoView6 != null && adLandingGeneralVideoView6.isPlaying()) {
                                        com.tencent.mars.xlog.Log.i(tVar.h(), "lifecycle ON_PAUSE, pause video, traceId: " + l94.t.n(tVar));
                                        adLandingGeneralVideoView6.pause();
                                    }
                                    this.f163970d = true;
                                } else if (i19 == 3) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView7 = tVar.f317392j;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    if (adLandingGeneralVideoView7 != null && !adLandingGeneralVideoView7.isPlaying() && this.f163970d) {
                                        com.tencent.mars.xlog.Log.i(tVar.h(), "lifecycle ON_RESUME, play video, traceId: " + l94.t.n(tVar));
                                        adLandingGeneralVideoView7.play();
                                    }
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$onBindData$1");
                            }
                        });
                    }
                    this.f317395m = true;
                }
            }
        }
        android.widget.TextView textView = this.f317393k;
        if (textView != null) {
            java.lang.String str4 = b17.f372077m;
            if (str4 == null || str4.length() == 0) {
                i17 = 8;
            } else {
                com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
                f();
                textView.setText(Di.Ri(b17.f372077m, true));
                i17 = 0;
            }
            textView.setVisibility(i17);
            if (com.tencent.mm.ui.bk.C()) {
                r45.c43 c43Var = b17.f372085u;
                e17 = ca4.n0.e(c43Var != null ? c43Var.f371267e : null, 0);
            } else {
                r45.c43 c43Var2 = b17.f372085u;
                e17 = ca4.n0.e(c43Var2 != null ? c43Var2.f371266d : null, 0);
            }
            textView.setTextColor(e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        int intValue = ((java.lang.Number) this.f317396n.f302834e).intValue();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(f());
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -1;
            linearLayout.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.height = -1;
            linearLayout.setLayoutParams(layoutParams2);
        }
        linearLayout.setOrientation(0);
        int i17 = this.f317390h;
        if (i17 == 10) {
            o(linearLayout, intValue, intValue);
        } else if (i17 == 12) {
            o(linearLayout, (intValue * 9) / 16, intValue);
        } else {
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = new com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView(linearLayout.getContext(), null);
            int i18 = (intValue * 9) / 16;
            if (adLandingGeneralVideoView.getLayoutParams() == null) {
                c44.a.o();
                adLandingGeneralVideoView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = adLandingGeneralVideoView.getLayoutParams();
                layoutParams3.width = i18;
                adLandingGeneralVideoView.setLayoutParams(layoutParams3);
            }
            if (adLandingGeneralVideoView.getLayoutParams() == null) {
                c44.a.o();
                adLandingGeneralVideoView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, intValue));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams4 = adLandingGeneralVideoView.getLayoutParams();
                layoutParams4.height = intValue;
                adLandingGeneralVideoView.setLayoutParams(layoutParams4);
            }
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
            this.f317392j = adLandingGeneralVideoView;
            linearLayout.addView(adLandingGeneralVideoView);
        }
        android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
        linearLayout.addView(textView);
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
            layoutParams5.width = 0;
            textView.setLayoutParams(layoutParams5);
        }
        c44.a.l();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
            layoutParams6.height = -1;
            textView.setLayoutParams(layoutParams6);
        }
        android.view.ViewGroup.LayoutParams layoutParams7 = textView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.weight = 1;
        }
        int a17 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams9 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams9 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = a17;
        }
        int a18 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams10 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams10 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams10 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = a18;
        }
        int a19 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams11 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.rightMargin = a19;
        }
        int a27 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams12 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams12 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams12 : null;
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.bottomMargin = a27;
        }
        textView.setTextSize(0, i65.a.j(textView.getContext()) * i65.a.a(textView.getContext(), 14.0f));
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setGravity(c44.a.f());
        textView.setLineSpacing(c44.b.a(8), 1.0f);
        int a28 = (int) (((intValue - c44.b.a(20)) - c44.b.a(20)) / ((textView.getPaint().getFontMetricsInt(null) * textView.getLineSpacingMultiplier()) + textView.getLineSpacingExtra()));
        textView.setMaxLines(a28 >= 1 ? a28 : 1);
        this.f317393k = textView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        return linearLayout;
    }

    public final void o(android.widget.LinearLayout linearLayout, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createImageView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        android.widget.ImageView imageView = new android.widget.ImageView(linearLayout.getContext());
        linearLayout.addView(imageView);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i17;
            imageView.setLayoutParams(layoutParams);
        }
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, i18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = i18;
            imageView.setLayoutParams(layoutParams2);
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f317391i = imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createImageView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
    }
}
