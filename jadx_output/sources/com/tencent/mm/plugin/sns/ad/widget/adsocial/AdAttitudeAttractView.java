package com.tencent.mm.plugin.sns.ad.widget.adsocial;

/* loaded from: classes4.dex */
public class AdAttitudeAttractView extends android.widget.FrameLayout implements k84.p4, androidx.lifecycle.x, xn5.a0 {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public java.lang.String B;
    public boolean C;
    public boolean D;
    public final kotlinx.coroutines.flow.j2 E;
    public final ym5.w1 F;
    public final android.view.ViewTreeObserver.OnPreDrawListener G;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163399d;

    /* renamed from: e, reason: collision with root package name */
    public u74.d f163400e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f163401f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f163402g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f163403h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f163404i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f163405m;

    /* renamed from: n, reason: collision with root package name */
    public int f163406n;

    /* renamed from: o, reason: collision with root package name */
    public int f163407o;

    /* renamed from: p, reason: collision with root package name */
    public int f163408p;

    /* renamed from: q, reason: collision with root package name */
    public int f163409q;

    /* renamed from: r, reason: collision with root package name */
    public int f163410r;

    /* renamed from: s, reason: collision with root package name */
    public int f163411s;

    /* renamed from: t, reason: collision with root package name */
    public int f163412t;

    /* renamed from: u, reason: collision with root package name */
    public int f163413u;

    /* renamed from: v, reason: collision with root package name */
    public int f163414v;

    /* renamed from: w, reason: collision with root package name */
    public float f163415w;

    /* renamed from: x, reason: collision with root package name */
    public int f163416x;

    /* renamed from: y, reason: collision with root package name */
    public int f163417y;

    /* renamed from: z, reason: collision with root package name */
    public int f163418z;

    public AdAttitudeAttractView(android.content.Context context) {
        this(context, null);
    }

    public static /* synthetic */ u74.d b(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        u74.d dVar = adAttitudeAttractView.f163400e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        return dVar;
    }

    public static /* synthetic */ com.tencent.mm.view.MMPAGView c(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        com.tencent.mm.view.MMPAGView mMPAGView = adAttitudeAttractView.f163402g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        return mMPAGView;
    }

    public static void d(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView) {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView snsAvatarImageView;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        adAttitudeAttractView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            u74.d dVar = adAttitudeAttractView.f163400e;
            view = dVar.f425163x;
            snsAvatarImageView = dVar.A;
            view2 = dVar.f425165z;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdAttitudeAttractView", th6.toString());
        }
        if (view != null && view2 != null && snsAvatarImageView != null) {
            int width = view2.getWidth();
            int height = view2.getHeight();
            if (width > 0 && height > 0) {
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                adAttitudeAttractView.f163410r = iArr[1];
                adAttitudeAttractView.f163411s = height;
                if (!adAttitudeAttractView.f163399d.isFireworkCheerAd()) {
                    adAttitudeAttractView.f163415w = adAttitudeAttractView.f163411s * adAttitudeAttractView.f163399d.getAdXml().adSocialInfo.attractingAnimationInfo.f325373c;
                }
                int[] iArr2 = new int[2];
                snsAvatarImageView.getLocationOnScreen(iArr2);
                int i17 = iArr2[0];
                adAttitudeAttractView.f163413u = i17 - adAttitudeAttractView.f163416x;
                adAttitudeAttractView.f163414v = i17 + adAttitudeAttractView.f163417y + width + adAttitudeAttractView.f163418z;
                android.view.WindowManager windowManager = (android.view.WindowManager) adAttitudeAttractView.getContext().getSystemService("window");
                adAttitudeAttractView.f163408p = java.lang.Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                adAttitudeAttractView.f163412t = iArr3[1];
                int[] iArr4 = new int[2];
                adAttitudeAttractView.getLocationOnScreen(iArr4);
                adAttitudeAttractView.setLeftMarginOff(iArr4[0]);
                adAttitudeAttractView.setTopMarginOff(iArr4[1] - iArr3[1]);
                if (adAttitudeAttractView.f163400e.T.f425131a == 0) {
                    android.view.View view3 = adAttitudeAttractView.f163405m;
                    if (view3 == null) {
                        adAttitudeAttractView.f163409q = view.getHeight();
                    } else {
                        int[] iArr5 = new int[2];
                        view3.getLocationOnScreen(iArr5);
                        adAttitudeAttractView.f163409q = iArr5[1] - iArr3[1];
                    }
                } else {
                    adAttitudeAttractView.f163409q = view.getHeight();
                }
                if (adAttitudeAttractView.f163400e.T.f425131a == 0) {
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) adAttitudeAttractView.getLayoutParams();
                    layoutParams.width = adAttitudeAttractView.f163408p;
                    layoutParams.height = adAttitudeAttractView.f163409q;
                } else {
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) adAttitudeAttractView.getLayoutParams();
                    layoutParams2.width = adAttitudeAttractView.f163408p;
                    layoutParams2.height = adAttitudeAttractView.f163409q;
                }
                com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "adAttitudeAttractView calcPagPlayViewParams width is " + adAttitudeAttractView.f163408p + ", height is " + adAttitudeAttractView.f163409q);
                android.view.ViewParent parent = adAttitudeAttractView.getParent();
                if (parent instanceof android.widget.FrameLayout) {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) parent;
                    frameLayout.setClipChildren(false);
                    frameLayout.setClipToPadding(false);
                    android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                    if (layoutParams3.width == 0) {
                        layoutParams3.width = -1;
                    }
                    if (layoutParams3.height == 0) {
                        layoutParams3.height = -1;
                    }
                }
                adAttitudeAttractView.e();
                adAttitudeAttractView.requestLayout();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    private void setLeftMarginOff(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (this.f163400e.T.f425131a == 0) {
            ((android.widget.RelativeLayout.LayoutParams) getLayoutParams()).leftMargin -= i17;
        } else {
            ((android.widget.FrameLayout.LayoutParams) getLayoutParams()).leftMargin -= i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    private void setTopMarginOff(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (this.f163400e.T.f425131a == 0) {
            ((android.widget.RelativeLayout.LayoutParams) getLayoutParams()).topMargin -= i17;
        } else {
            ((android.widget.FrameLayout.LayoutParams) getLayoutParams()).topMargin -= i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    @Override // k84.p4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (!this.f163402g.f()) {
            com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "onShowAttitude but mAdAttractShowAnim is not playing so return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new k84.f(this));
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (this.f163408p <= 0 || this.f163409q <= 0 || this.f163411s <= 0) {
            com.tencent.mars.xlog.Log.e("AdAttitudeAttractView", "start play pagView, but can not calcPagViewDisplayParams, mWidth or mHeight or mContentContainerHeight <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f163402g.getLayoutParams();
        int i17 = this.f163408p;
        layoutParams.width = i17;
        layoutParams.height = (i17 * this.f163407o) / this.f163406n;
        this.f163402g.setLayoutParams(layoutParams);
        float f17 = ((this.f163410r + (this.f163411s / 2)) - (this.f163412t + (layoutParams.height / 2))) + this.f163415w;
        int i18 = ((this.f163414v + this.f163413u) - this.f163408p) / 2;
        com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "offsetX is " + i18 + ", offsetY is " + f17 + ", showAnimLayoutParams height is " + layoutParams.height + ", mSnsLinearContentRightX is " + this.f163414v + ", mSnsLinearContentLeftX is " + this.f163413u + ", mWidth is " + this.f163408p);
        this.f163402g.setTranslationX((float) i18);
        this.f163402g.setTranslationY(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public final boolean f() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f163399d;
        boolean z17 = false;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return false;
        }
        java.lang.String a17 = snsInfo.getAdXml().adSocialInfo.a();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (a17 == null) {
            a17 = "";
        }
        if (a17.equals(this.B) && this.A) {
            com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "checkPAGFileDownload, return true directly");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f163399d;
        if (snsInfo2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        } else {
            java.lang.String a18 = snsInfo2.getAdXml().adSocialInfo.a();
            if (a18 == null) {
                a18 = "";
            }
            mb4.c cVar = this.f163399d.getAdXml().adSocialInfo;
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttractPagMd5", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            mb4.r rVar = cVar.f325388m;
            if (rVar == null || rVar.a() == null) {
                mb4.b bVar = cVar.attractingAnimationInfo;
                if (bVar != null) {
                    str = bVar.f325372b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttractPagMd5", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttractPagMd5", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
                    str = null;
                }
            } else {
                mb4.g a19 = cVar.f325388m.a();
                a19.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                str = a19.f325410b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttractPagMd5", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            }
            java.lang.String b17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.b(a18, str != null ? str : "");
            this.B = a18;
            this.A = false;
            if (android.text.TextUtils.isEmpty(b17)) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(a18);
                com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "initPagAnimViewData, start download pagFile");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 101);
                if (!this.D) {
                    k84.k kVar = new k84.k();
                    kVar.c(ca4.z0.T(this.f163399d), this.f163399d.getAdInfo(this.f163400e.T.f425131a).uxInfo, this.f163400e.T.f425131a, 0, 1);
                    a84.t0.a(kVar);
                }
                this.D = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            } else {
                if (this.f163402g.getUseRfx()) {
                    com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.e(b17));
                    this.f163406n = Load.width();
                    this.f163407o = Load.height();
                    this.f163402g.setComposition(Load);
                } else {
                    org.libpag.PAGFile Load2 = org.libpag.PAGFile.Load(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.e(b17));
                    this.f163406n = Load2.width();
                    this.f163407o = Load2.height();
                    this.f163402g.setComposition(Load2);
                }
                this.f163402g.setScaleMode(3);
                this.f163402g.setRepeatCount(1);
                this.A = true;
                com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "initPagAnimViewData, use server file");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        return z17;
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (this.f163399d.isFireworkCheerAd()) {
            com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "mSnsInfo isFireworkCheerAd!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return;
        }
        if (!this.C) {
            this.C = true;
            this.f163402g.a(this.F);
            com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "startListenPagView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public kotlinx.coroutines.flow.j2 getCheerPagIsPlayedFlow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheerPagIsPlayedFlow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        kotlinx.coroutines.flow.j2 j2Var = this.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheerPagIsPlayedFlow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        return j2Var;
    }

    public void h(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return;
        }
        try {
            u74.d dVar = this.f163400e;
            if (dVar.T.f425131a == 0 && this.f163405m == null) {
                this.f163405m = dVar.f425163x.findViewById(com.tencent.mm.R.id.f482875qh);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 100);
            if (!f() || this.f163406n <= 0 || this.f163407o <= 0) {
                com.tencent.mars.xlog.Log.w("AdAttitudeAttractView", "attract pag file width or height <= 0 or may be download attract pag file");
            } else {
                this.f163403h = true;
                ((kotlinx.coroutines.flow.h3) this.E).k(java.lang.Boolean.TRUE);
                this.f163402g.setProgress(0.0d);
                setAlpha(1.0f);
                setVisibility(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizePagViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.G;
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
                getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizePagViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                g();
                com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "mPagFileWidth is " + this.f163406n + ", mPagFileHeight is " + this.f163407o);
                this.f163402g.post(new k84.b(this));
                k84.k kVar = new k84.k();
                kVar.c(ca4.z0.T(snsInfo), snsInfo.getAdInfo(this.f163400e.T.f425131a).uxInfo, this.f163400e.T.f425131a, 1, 0);
                a84.t0.a(kVar);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            if (this.C) {
                this.C = false;
                this.f163402g.i(this.F);
                com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "stopListenPagView");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public final void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            i();
            setVisibility(8);
            this.f163402g.post(new k84.c(this));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        super.onConfigurationChanged(configuration);
        int i17 = configuration.orientation;
        j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        u74.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            super.onDetachedFromWindow();
            com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "onDetachedFromWindow");
            this.f163403h = false;
            ((kotlinx.coroutines.flow.h3) this.E).k(java.lang.Boolean.FALSE);
            this.D = false;
            j();
            getViewTreeObserver().removeOnPreDrawListener(this.G);
            dVar = this.f163400e;
        } catch (java.lang.Throwable unused) {
        }
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return;
        }
        if (dVar.T.f425131a == 0) {
            this.f163404i = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            super.onFinishInflate();
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f486235ko2);
            this.f163402g = mMPAGView;
            boolean z17 = true;
            if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) != 1) {
                z17 = false;
            }
            mMPAGView.o(z17);
            java.lang.Object obj = this.f163401f;
            if (obj instanceof androidx.lifecycle.y) {
                ((androidx.lifecycle.y) obj).mo133getLifecycle().a(this);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onUIPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "onUIPause");
            j();
            getViewTreeObserver().removeOnPreDrawListener(this.G);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public AdAttitudeAttractView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdAttitudeAttractView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163403h = false;
        this.C = false;
        this.D = false;
        this.E = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.F = new k84.a(this);
        this.G = new k84.d(this);
        this.f163401f = context;
    }
}
