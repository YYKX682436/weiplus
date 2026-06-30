package com.tencent.mm.plugin.sns.ad.widget.adsocial;

/* loaded from: classes4.dex */
public class AdAttitudePlayView extends android.widget.FrameLayout implements k84.p4, androidx.lifecycle.x, xn5.a0 {
    public static final /* synthetic */ int F = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public final android.view.ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f163419d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f163420e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f163421f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163422g;

    /* renamed from: h, reason: collision with root package name */
    public u74.d f163423h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f163424i;

    /* renamed from: m, reason: collision with root package name */
    public int f163425m;

    /* renamed from: n, reason: collision with root package name */
    public k84.f6 f163426n;

    /* renamed from: o, reason: collision with root package name */
    public int f163427o;

    /* renamed from: p, reason: collision with root package name */
    public int f163428p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f163429q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f163430r;

    /* renamed from: s, reason: collision with root package name */
    public final int f163431s;

    /* renamed from: t, reason: collision with root package name */
    public int f163432t;

    /* renamed from: u, reason: collision with root package name */
    public int f163433u;

    /* renamed from: v, reason: collision with root package name */
    public int f163434v;

    /* renamed from: w, reason: collision with root package name */
    public final ym5.w1 f163435w;

    /* renamed from: x, reason: collision with root package name */
    public int f163436x;

    /* renamed from: y, reason: collision with root package name */
    public int f163437y;

    /* renamed from: z, reason: collision with root package name */
    public int f163438z;

    public AdAttitudePlayView(android.content.Context context) {
        this(context, null);
    }

    public static /* synthetic */ k84.f6 b(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        k84.f6 f6Var = adAttitudePlayView.f163426n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        return f6Var;
    }

    private void setLeftMarginOff(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f163423h.T.f425131a == 0) {
            ((android.widget.RelativeLayout.LayoutParams) getLayoutParams()).leftMargin -= i17;
        } else {
            ((android.widget.FrameLayout.LayoutParams) getLayoutParams()).leftMargin -= i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    private void setTopMarginOff(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f163423h.T.f425131a == 0) {
            ((android.widget.RelativeLayout.LayoutParams) getLayoutParams()).topMargin -= i17;
        } else {
            ((android.widget.FrameLayout.LayoutParams) getLayoutParams()).topMargin -= i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @Override // k84.p4
    public void a() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        int i17 = this.f163425m;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1612, 76);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f163422g;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            z17 = false;
        } else {
            java.lang.String str = snsInfo.getAdXml().adSocialInfo.pagAnimationUrl;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (str.equals(this.f163430r) && this.f163429q) {
                com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "checkPAGFileDownload, return true directly");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                z17 = true;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f163422g;
                if (snsInfo2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                } else {
                    java.lang.String str2 = snsInfo2.getAdXml().adSocialInfo.pagAnimationUrl;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String str3 = this.f163422g.getAdXml().adSocialInfo.f325385j;
                    java.lang.String b17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.b(str2, str3 != null ? str3 : "");
                    this.f163430r = str2;
                    this.f163429q = false;
                    if (android.text.TextUtils.isEmpty(b17)) {
                        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(str2);
                        com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "initPagAnimViewData, start download pagFile");
                        g0Var.A(1612, 77);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                    } else {
                        if (this.f163419d.getUseRfx()) {
                            com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.e(b17));
                            this.f163427o = Load.width();
                            this.f163428p = Load.height();
                            this.f163419d.setComposition(Load);
                        } else {
                            org.libpag.PAGFile Load2 = org.libpag.PAGFile.Load(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.e(b17));
                            this.f163427o = Load2.width();
                            this.f163428p = Load2.height();
                            this.f163419d.setComposition(Load2);
                        }
                        this.f163419d.setScaleMode(3);
                        this.f163419d.setRepeatCount(1);
                        this.f163429q = true;
                        com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "initPagAnimViewData, use server file");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                        z17 = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                    }
                }
                z17 = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            }
        }
        if (!z17 || this.f163427o <= 0 || this.f163428p <= 0) {
            com.tencent.mars.xlog.Log.w("AdAttitudePlayView", "pag file width or height <= 0 or may be download pag file");
        } else {
            this.f163419d.setProgress(0.0d);
            setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizePagViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizePagViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            this.f163425m = 1;
            com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "mPagFileWidth is " + this.f163427o + ", mPagFileHeight is " + this.f163428p);
            this.f163419d.post(new k84.h(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public void c() {
        u74.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            dVar = this.f163423h;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AdAttitudePlayView", th6, "calculate error", new java.lang.Object[0]);
        }
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        android.view.View view = dVar.f425163x;
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = dVar.H;
        android.view.View view2 = dVar.f425165z;
        com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView snsAvatarImageView = dVar.A;
        if (view != null && adSocialAttitudeView != null && view2 != null && snsAvatarImageView != null) {
            int width = view2.getWidth();
            int height = view2.getHeight();
            if (width > 0 && height > 0) {
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                this.A = iArr[1];
                this.B = height;
                android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
                this.f163436x = java.lang.Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
                int[] iArr2 = new int[2];
                snsAvatarImageView.getLocationOnScreen(iArr2);
                int i17 = iArr2[0];
                int i18 = i17 - this.f163432t;
                this.C = i18;
                int i19 = i17 + this.f163433u + width + this.f163434v;
                this.D = i19;
                if (dVar.T.f425137g) {
                    this.f163436x = i19 - i18;
                }
                int[] iArr3 = new int[2];
                adSocialAttitudeView.getLocationOnScreen(iArr3);
                int[] iArr4 = new int[2];
                view.getLocationOnScreen(iArr4);
                this.f163438z = iArr4[1];
                int[] iArr5 = new int[2];
                getLocationOnScreen(iArr5);
                setLeftMarginOff(iArr5[0] - this.C);
                setTopMarginOff(iArr5[1] - iArr4[1]);
                this.f163437y = (iArr3[1] + adSocialAttitudeView.getHeight()) - iArr4[1];
                if (this.f163423h.T.f425131a == 0) {
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
                    layoutParams.width = this.f163436x;
                    layoutParams.height = this.f163437y;
                } else {
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) getLayoutParams();
                    layoutParams2.width = this.f163436x;
                    layoutParams2.height = this.f163437y;
                }
                android.view.ViewParent parent = getParent();
                if (parent instanceof android.widget.FrameLayout) {
                    android.view.ViewParent parent2 = parent.getParent();
                    if (parent2 instanceof android.widget.RelativeLayout) {
                        ((android.widget.RelativeLayout) parent2).setClipChildren(false);
                        ((android.widget.RelativeLayout) parent2).setClipToPadding(false);
                    }
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) ((android.widget.FrameLayout) parent).getLayoutParams();
                    if (layoutParams3.width == 0) {
                        layoutParams3.width = -1;
                    }
                    if (layoutParams3.height == 0) {
                        layoutParams3.height = -1;
                    }
                }
                d();
                requestLayout();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f163436x <= 0 || this.f163437y <= 0 || this.B <= 0 || this.f163427o == 0 || this.f163428p == 0) {
            com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "start play pagView, but can not calcPagViewDisplayParams, mWidth or mHeight or mContentContainerHeight <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f163419d.getLayoutParams();
        int i17 = this.f163436x;
        layoutParams.width = i17;
        layoutParams.height = (i17 * this.f163428p) / this.f163427o;
        this.f163419d.setLayoutParams(layoutParams);
        int i18 = ((this.A + (this.B / 2)) - (this.f163438z + (layoutParams.height / 2))) + this.f163431s;
        com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "offsetY is " + i18 + ", showAnimLayoutParams height is " + layoutParams.height + ", mSnsLinearContentRightX is " + this.D + ", mSnsLinearContentLeftX is " + this.C + ", mWidth is " + this.f163436x + ", inLargeWindow is " + this.f163423h.T.f425137g);
        this.f163419d.setTranslationY((float) i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public void e(u74.d dVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        u74.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        java.lang.String snsId = snsInfo.getSnsId();
        if (com.tencent.mm.sdk.platformtools.t8.K0(snsId)) {
            com.tencent.mars.xlog.Log.e("AdAttitudePlayView", "resetUI, snsId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(snsId, this.f163424i)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        this.f163424i = snsId;
        this.f163422g = snsInfo;
        this.f163423h = dVar;
        if (dVar != null && (cVar = dVar.T) != null) {
            int i17 = cVar.f425131a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            if (i17 == 0) {
                this.f163432t = i65.a.b(getContext(), 14);
                this.f163433u = i65.a.b(getContext(), 56);
                this.f163434v = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
            } else {
                android.content.Context context = this.f163421f;
                this.f163432t = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
                this.f163433u = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aa7) + context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
                this.f163434v = this.f163432t;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        }
        h();
        f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            if (!this.f163420e) {
                this.f163420e = true;
                this.f163419d.a(this.f163435w);
                com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "startListenPagView");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            if (this.f163420e) {
                this.f163420e = false;
                this.f163419d.i(this.f163435w);
                com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "stopListenPagView");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public final void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            this.f163425m = 3;
            setVisibility(8);
            this.f163419d.post(new k84.i(this));
            k84.f6 f6Var = this.f163426n;
            if (f6Var != null) {
                ((com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) f6Var).s();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        super.onConfigurationChanged(configuration);
        int i17 = configuration.orientation;
        int i18 = this.f163425m;
        if (i18 == 1 || i18 == 2) {
            h();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        u74.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            super.onDetachedFromWindow();
            com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "onDetachedFromWindow");
            dVar = this.f163423h;
        } catch (java.lang.Throwable unused) {
        }
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        if (dVar.T.f425131a == 0) {
            this.f163424i = "";
            g();
        }
        h();
        getViewTreeObserver().removeOnPreDrawListener(this.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            super.onFinishInflate();
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f486234ko1);
            this.f163419d = mMPAGView;
            boolean z17 = true;
            if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) != 1) {
                z17 = false;
            }
            mMPAGView.o(z17);
            java.lang.Object obj = this.f163421f;
            if (obj instanceof androidx.lifecycle.y) {
                ((androidx.lifecycle.y) obj).mo133getLifecycle().a(this);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onUIPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "onUIPause");
            h();
            g();
            getViewTreeObserver().removeOnPreDrawListener(this.E);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onUIResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "onUIResume");
            f();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public void setOnAnimationStatusListener(k84.f6 f6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnAnimationStatusListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        k84.f6 f6Var2 = this.f163426n;
        if (f6Var2 != null && f6Var2 != f6Var) {
            ((com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) f6Var2).s();
        }
        this.f163426n = f6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnAnimationStatusListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public AdAttitudePlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdAttitudePlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163420e = false;
        this.f163425m = 0;
        this.f163435w = new k84.g(this);
        this.E = new k84.j(this);
        this.f163421f = context;
        this.f163431s = i65.a.b(getContext(), 13);
    }
}
