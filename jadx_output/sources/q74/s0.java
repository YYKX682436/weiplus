package q74;

/* loaded from: classes4.dex */
public final class s0 {
    public int A;
    public android.animation.AnimatorSet B;
    public final q74.l0 C;
    public final q74.m0 D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f360492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f360493b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f360494c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f360495d;

    /* renamed from: e, reason: collision with root package name */
    public final w64.n f360496e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView f360497f;

    /* renamed from: g, reason: collision with root package name */
    public final z84.h f360498g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f360499h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f360500i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.FrameLayout f360501j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f360502k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f360503l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f360504m;

    /* renamed from: n, reason: collision with root package name */
    public s34.z0 f360505n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f360506o;

    /* renamed from: p, reason: collision with root package name */
    public int f360507p;

    /* renamed from: q, reason: collision with root package name */
    public int f360508q;

    /* renamed from: r, reason: collision with root package name */
    public float f360509r;

    /* renamed from: s, reason: collision with root package name */
    public float f360510s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.y0 f360511t;

    /* renamed from: u, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f360512u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f360513v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f360514w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f360515x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f360516y;

    /* renamed from: z, reason: collision with root package name */
    public q74.t f360517z;

    public s0(android.content.Context mContext, int i17, android.view.ViewGroup mRecycleViewContainer, android.view.View mItemRootView, w64.n nVar, com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView, z84.h hVar) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mRecycleViewContainer, "mRecycleViewContainer");
        kotlin.jvm.internal.o.g(mItemRootView, "mItemRootView");
        this.f360492a = mContext;
        this.f360493b = i17;
        this.f360494c = mRecycleViewContainer;
        this.f360495d = mItemRootView;
        this.f360496e = nVar;
        this.f360497f = adSlideRecyclerView;
        this.f360498g = hVar;
        this.f360512u = kotlinx.coroutines.flow.i3.a(0);
        this.A = -1;
        this.C = new q74.l0(this);
        this.D = new q74.m0(this);
    }

    public static final void a(q74.s0 s0Var, int i17) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.a1 a1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        try {
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameUICtrlbindCurrentProductViewDataAndDoAnimation", th6);
        }
        if (s0Var.A == i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        } else {
            s0Var.A = i17;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = s0Var.f360504m;
            s34.z0 z0Var = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (a1Var = adXml.adSliderFullCardInfo) == null) ? null : a1Var.f402569f;
            if (z0Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            } else {
                q74.t tVar = s0Var.f360517z;
                if (tVar != null) {
                    tVar.m();
                }
                q74.t tVar2 = s0Var.f360517z;
                if (tVar2 != null) {
                    tVar2.l(i17);
                }
                if (i17 == 0) {
                    if (z0Var.a()) {
                        if (s0Var.f360514w) {
                            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is 0, has pag and finish, doEnterOrExitAnim");
                            android.widget.FrameLayout frameLayout = s0Var.f360500i;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            q74.t tVar3 = s0Var.f360517z;
                            if (tVar3 != null) {
                                tVar3.y(1.0f);
                            }
                            q74.t tVar4 = s0Var.f360517z;
                            if (tVar4 != null) {
                                tVar4.o(true);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is 0, has pag but pag is not finish, hide product comp");
                            q74.t tVar5 = s0Var.f360517z;
                            if (tVar5 != null) {
                                tVar5.y(0.0f);
                            }
                        }
                    } else if (s0Var.f360515x) {
                        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is 0, no pag, doEnterOrExitAnim");
                        q74.t tVar6 = s0Var.f360517z;
                        if (tVar6 != null) {
                            tVar6.y(1.0f);
                        }
                        q74.t tVar7 = s0Var.f360517z;
                        if (tVar7 != null) {
                            tVar7.o(true);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is 0, no pag, initNoPAGStatus");
                        s0Var.f360515x = true;
                        q74.t tVar8 = s0Var.f360517z;
                        if (tVar8 != null) {
                            tVar8.y(1.0f);
                        }
                        q74.t tVar9 = s0Var.f360517z;
                        if (tVar9 != null) {
                            tVar9.x(0);
                        }
                    }
                } else if (!z0Var.a()) {
                    com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is " + i17 + ", no pag, doEnterOrExitAnim");
                    q74.t tVar10 = s0Var.f360517z;
                    if (tVar10 != null) {
                        tVar10.y(1.0f);
                    }
                    q74.t tVar11 = s0Var.f360517z;
                    if (tVar11 != null) {
                        tVar11.o(true);
                    }
                } else if (s0Var.f360514w) {
                    com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is " + i17 + ", has pag and finish, doEnterOrExitAnim");
                    android.widget.FrameLayout frameLayout2 = s0Var.f360500i;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                    q74.t tVar12 = s0Var.f360517z;
                    if (tVar12 != null) {
                        tVar12.y(1.0f);
                    }
                    q74.t tVar13 = s0Var.f360517z;
                    if (tVar13 != null) {
                        tVar13.o(true);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is " + i17 + ", has pag but pag is not finish, doPAGInterruptAnim");
                    s0Var.f360514w = true;
                    s0Var.i();
                    com.tencent.mm.view.MMPAGView mMPAGView = s0Var.f360506o;
                    if (mMPAGView != null) {
                        mMPAGView.post(new q74.e0(mMPAGView));
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }

    public static final void b(q74.s0 s0Var, int i17) {
        java.lang.Long c17;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.a1 a1Var;
        s34.z0 z0Var;
        java.util.List c18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doStatusTwoAnimNoPAGExt", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doStatusTwoAnimNoPAGExt", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "doStatusTwoAnimNoPAGExt, index is " + i17 + ", mNoPAGStatusTwoAnimReset is " + s0Var.f360516y);
        if (!s0Var.f360516y) {
            s0Var.f360516y = true;
            q74.t tVar = s0Var.f360517z;
            if (tVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doStatusTwoAnimNoPAG", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = tVar.f360534p;
                s34.o1 o1Var = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (a1Var = adXml.adSliderFullCardInfo) == null || (z0Var = a1Var.f402569f) == null || (c18 = z0Var.c()) == null) ? null : (s34.o1) c18.get(i17);
                com.tencent.mm.sdk.platformtools.n3 n3Var = tVar.C;
                n3Var.removeCallbacksAndMessages(null);
                n3Var.postDelayed(new q74.n(tVar), (o1Var == null || (c17 = o1Var.c()) == null) ? 1500L : c17.longValue());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doStatusTwoAnimNoPAG", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doStatusTwoAnimNoPAGExt", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doStatusTwoAnimNoPAGExt", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }

    public static final /* synthetic */ q74.t c(q74.s0 s0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdSlideProductItemViewLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        q74.t tVar = s0Var.f360517z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdSlideProductItemViewLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return tVar;
    }

    public static final /* synthetic */ android.widget.ImageView d(q74.s0 s0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagThumb$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        android.widget.ImageView imageView = s0Var.f360502k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagThumb$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return imageView;
    }

    public static final /* synthetic */ android.widget.FrameLayout e(q74.s0 s0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagWholeContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        android.widget.FrameLayout frameLayout = s0Var.f360500i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagWholeContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return frameLayout;
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.j2 f(q74.s0 s0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPreDrawFinishFlow$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        kotlinx.coroutines.flow.j2 j2Var = s0Var.f360512u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPreDrawFinishFlow$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return j2Var;
    }

    public static final boolean g(q74.s0 s0Var) {
        boolean z17;
        org.libpag.PAGFile pAGFile;
        com.tencent.mm.rfx.RfxPagFile rfxPagFile;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        boolean z18 = false;
        try {
            z17 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1;
            pAGFile = null;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameUICtrl_pagPlaying", th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        }
        if (z17) {
            rfxPagFile = s0Var.m();
            if (rfxPagFile == null) {
                com.tencent.mars.xlog.Log.e("SlideFullCardBreakFrameUICtrl", "PAGFile Load failed");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                return z18;
            }
        } else {
            org.libpag.PAGFile l17 = s0Var.l();
            if (l17 == null) {
                com.tencent.mars.xlog.Log.e("SlideFullCardBreakFrameUICtrl", "PAGFile Load failed");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                return z18;
            }
            rfxPagFile = null;
            pAGFile = l17;
        }
        if (s0Var.f360507p > 0 && s0Var.f360508q > 0) {
            if (s0Var.f360506o == null) {
                android.widget.FrameLayout frameLayout = s0Var.f360501j;
                if (frameLayout != null && frameLayout.getChildCount() == 0) {
                    com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "pagPlaying");
                    com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(s0Var.f360492a);
                    mMPAGView.o(z17);
                    mMPAGView.setRepeatCount(1);
                    mMPAGView.setScaleMode(3);
                    if (z17) {
                        mMPAGView.setComposition(rfxPagFile);
                    } else {
                        mMPAGView.setComposition(pAGFile);
                    }
                    mMPAGView.a(s0Var.D);
                    android.widget.FrameLayout frameLayout2 = s0Var.f360501j;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(mMPAGView, new android.view.ViewGroup.LayoutParams(s0Var.f360507p, s0Var.f360508q));
                    }
                    mMPAGView.setTranslationX(s0Var.f360509r);
                    mMPAGView.setTranslationY(s0Var.f360510s);
                    s0Var.f360506o = mMPAGView;
                    mMPAGView.post(new q74.p0(mMPAGView));
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            z18 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            return z18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return z18;
    }

    public final void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcProductCompBreakFrameLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        if (!this.f360503l) {
            this.f360503l = true;
            android.view.ViewTreeObserver viewTreeObserver = this.f360494c.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new q74.f0(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcProductCompBreakFrameLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPAGInterruptAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        android.widget.FrameLayout frameLayout = this.f360500i;
        if (frameLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGInterruptAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            return;
        }
        kotlin.jvm.internal.o.d(frameLayout);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f, 0.0f);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.52f, 0.0f, 0.74f, 0.04f));
        ofFloat.setDuration(150L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.B = animatorSet;
        animatorSet.addListener(new q74.g0(this));
        android.animation.AnimatorSet animatorSet2 = this.B;
        if (animatorSet2 != null) {
            animatorSet2.play(ofFloat);
        }
        android.animation.AnimatorSet animatorSet3 = this.B;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGInterruptAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }

    public final android.content.Context j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return this.f360492a;
    }

    public final android.view.ViewGroup k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRecycleViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRecycleViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return this.f360494c;
    }

    public final org.libpag.PAGFile l() {
        s34.m1 b17;
        java.lang.String b18;
        s34.m1 b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s34.z0 z0Var = this.f360505n;
        if (z0Var == null || (b17 = z0Var.b()) == null || (b18 = b17.b()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            return null;
        }
        s34.z0 z0Var2 = this.f360505n;
        if (z0Var2 != null && (b19 = z0Var2.b()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            java.lang.String str = b19.f402713b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            if (str != null) {
                java.lang.String b27 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.b(b18, str);
                if (!(b27 == null || b27.length() == 0)) {
                    org.libpag.PAGFile Load = org.libpag.PAGFile.Load(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.e(b27));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                    return Load;
                }
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(b18);
                this.f360514w = true;
                i();
                com.tencent.mars.xlog.Log.e("SlideFullCardBreakFrameUICtrl", "getValidPAGFile, pagFilePath is isNullOrEmpty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                return null;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return null;
    }

    public final com.tencent.mm.rfx.RfxPagFile m() {
        s34.m1 b17;
        java.lang.String b18;
        s34.m1 b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s34.z0 z0Var = this.f360505n;
        if (z0Var == null || (b17 = z0Var.b()) == null || (b18 = b17.b()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            return null;
        }
        s34.z0 z0Var2 = this.f360505n;
        if (z0Var2 != null && (b19 = z0Var2.b()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            java.lang.String str = b19.f402713b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            if (str != null) {
                java.lang.String b27 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.b(b18, str);
                if (!(b27 == null || b27.length() == 0)) {
                    com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.e(b27));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                    return Load;
                }
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(b18);
                this.f360514w = true;
                i();
                com.tencent.mars.xlog.Log.e("SlideFullCardBreakFrameUICtrl", "getValidPAGFile, pagFilePath is isNullOrEmpty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                return null;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return null;
    }

    public final void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        kotlinx.coroutines.y0 y0Var = this.f360511t;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.A = -1;
        this.f360513v = false;
        this.f360514w = false;
        this.f360515x = false;
        this.f360516y = false;
        this.f360503l = false;
        android.widget.FrameLayout frameLayout = this.f360501j;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        q74.t tVar = this.f360517z;
        if (tVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            tVar.m();
            tVar.C.removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView = tVar.f360521c;
            androidx.recyclerview.widget.f2 adapter = adSlideRecyclerView != null ? adSlideRecyclerView.getAdapter() : null;
            q74.x0 x0Var = adapter instanceof q74.x0 ? (q74.x0) adapter : null;
            if (x0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                x0Var.f360569q = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            }
            tVar.B = false;
            tVar.f360518J = false;
            android.view.View view = tVar.f360533o;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.ViewGroup viewGroup = tVar.f360530l;
            if (viewGroup != null) {
                viewGroup.setAlpha(0.0f);
            }
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = tVar.f360529k;
            if (adAppCompatTextView != null) {
                adAppCompatTextView.setTranslationX(0.0f);
            }
            if (adAppCompatTextView != null) {
                adAppCompatTextView.setAlpha(1.0f);
            }
            android.widget.ImageView imageView = tVar.f360527i;
            if (imageView != null) {
                imageView.setTranslationX(0.0f);
            }
            android.widget.ImageView imageView2 = tVar.f360528j;
            if (imageView2 != null) {
                imageView2.setTranslationX(0.0f);
            }
            android.widget.ImageView imageView3 = tVar.f360527i;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
            }
            android.widget.ImageView imageView4 = tVar.f360528j;
            if (imageView4 != null) {
                imageView4.setAlpha(1.0f);
            }
            android.widget.ImageView imageView5 = tVar.f360527i;
            if (imageView5 != null) {
                imageView5.setImageDrawable(null);
            }
            android.widget.ImageView imageView6 = tVar.f360528j;
            if (imageView6 != null) {
                imageView6.setImageDrawable(null);
            }
            android.widget.ImageView imageView7 = tVar.f360527i;
            if (imageView7 != null) {
                imageView7.setTag(com.tencent.mm.R.id.n1z, "");
            }
            android.widget.ImageView imageView8 = tVar.f360528j;
            if (imageView8 != null) {
                imageView8.setTag(com.tencent.mm.R.id.n1z, "");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        }
        android.animation.AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f360506o;
        this.f360506o = null;
        if (mMPAGView != null) {
            mMPAGView.j(this.C);
        }
        if (mMPAGView != null) {
            mMPAGView.i(this.D);
        }
        if (mMPAGView != null) {
            mMPAGView.post(new q74.r0(mMPAGView));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }
}
