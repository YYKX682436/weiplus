package com.tencent.mm.plugin.sns.ad.landingpage.ui.activity;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/ui/activity/AdHalfScreenPageUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lx54/b;", "Lcom/tencent/mm/ui/tools/c5;", "<init>", "()V", "y54/a", "y54/b", "y54/c", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes15.dex */
public final class AdHalfScreenPageUI extends com.tencent.mm.ui.MMActivity implements x54.b, com.tencent.mm.ui.tools.c5 {
    public static final /* synthetic */ int S = 0;
    public vb4.b A;
    public n44.d B;
    public boolean C;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J */
    public int f163158J;
    public android.view.View K;
    public boolean L;
    public int M;
    public com.tencent.mm.ui.tools.f5 N;
    public com.tencent.mm.ui.widget.dialog.k0 Q;

    /* renamed from: d */
    public android.view.View f163159d;

    /* renamed from: e */
    public android.widget.FrameLayout f163160e;

    /* renamed from: f */
    public android.widget.FrameLayout f163161f;

    /* renamed from: g */
    public android.widget.FrameLayout f163162g;

    /* renamed from: h */
    public com.tencent.mm.ui.base.MMViewPager f163163h;

    /* renamed from: i */
    public com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout f163164i;

    /* renamed from: m */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f163165m;

    /* renamed from: n */
    public android.widget.FrameLayout f163166n;

    /* renamed from: o */
    public android.widget.FrameLayout f163167o;

    /* renamed from: p */
    public android.widget.FrameLayout f163168p;

    /* renamed from: w */
    public boolean f163175w;

    /* renamed from: x */
    public z54.d f163176x;

    /* renamed from: y */
    public z54.g f163177y;

    /* renamed from: z */
    public vb4.b f163178z;

    /* renamed from: q */
    public final n44.m0 f163169q = new n44.m0();

    /* renamed from: r */
    public final i64.z f163170r = new i64.z();

    /* renamed from: s */
    public final n44.q0 f163171s = new n44.q0();

    /* renamed from: t */
    public final y54.b f163172t = new y54.b(0, 0, 0, 0, 0, 0, 0, 0, 255, null);

    /* renamed from: u */
    public final y54.c f163173u = new y54.c(0, 0, 0, 0, 15, null);

    /* renamed from: v */
    public final y54.c f163174v = new y54.c(0, 0, 0, 0, 15, null);
    public n54.o D = n54.o.f335145d;
    public final java.util.Map P = new java.util.LinkedHashMap();
    public final y54.a R = new y54.a(0, 0, 0, 7, null);

    public static final void T6(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doTopMaterialClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        adHalfScreenPageUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTopMaterialClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        if (adHalfScreenPageUI.H) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTopMaterialClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        } else {
            if (adHalfScreenPageUI.f7()) {
                adHalfScreenPageUI.hideVKB();
                adHalfScreenPageUI.i7();
                if (adHalfScreenPageUI.D == n54.o.f335145d && (halfScreenScrollableFrameLayout = adHalfScreenPageUI.f163164i) != null) {
                    halfScreenScrollableFrameLayout.l(adHalfScreenPageUI.f163172t.c());
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTopMaterialClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doTopMaterialClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    public static final void U6(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doTranslationYUILogic", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        adHalfScreenPageUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTranslationYUILogic", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        int c17 = e3.b.c(adHalfScreenPageUI.getContext().getResources().getColor(com.tencent.mm.R.color.a9e), adHalfScreenPageUI.getContext().getResources().getColor(com.tencent.mm.R.color.aaw), f17);
        float f18 = 1 - f17;
        float b17 = adHalfScreenPageUI.f163172t.b() * f18;
        adHalfScreenPageUI.setActionbarColor(c17);
        com.tencent.mm.ui.ga controller = adHalfScreenPageUI.getController();
        if (controller != null) {
            controller.W0(adHalfScreenPageUI.getContext(), c17);
        }
        adHalfScreenPageUI.setTitleAlpha(f17);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = adHalfScreenPageUI.f163165m;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.b(b17, b17, 0.0f, 0.0f);
        }
        n44.d dVar = adHalfScreenPageUI.B;
        if (dVar != null) {
            int i17 = (int) (f18 * 255);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateIconColorAlpha", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
            android.view.View a17 = dVar.a();
            android.graphics.drawable.Drawable background = a17 != null ? a17.getBackground() : null;
            if (background != null) {
                background.setAlpha(i17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateIconColorAlpha", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTranslationYUILogic", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doTranslationYUILogic", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    public static final /* synthetic */ n44.m0 V6(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdHalfScreenPageHelper$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        n44.m0 m0Var = adHalfScreenPageUI.f163169q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdHalfScreenPageHelper$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return m0Var;
    }

    public static final /* synthetic */ android.widget.FrameLayout W6(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAnimContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout = adHalfScreenPageUI.f163167o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAnimContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return frameLayout;
    }

    public static final /* synthetic */ y54.b X6(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContentSizeAttr$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        y54.b bVar = adHalfScreenPageUI.f163172t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContentSizeAttr$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return bVar;
    }

    public static final /* synthetic */ y54.c Y6(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFullScreenMaterialSizeData$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        y54.c cVar = adHalfScreenPageUI.f163174v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFullScreenMaterialSizeData$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return cVar;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout Z6(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHalfScreenContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout = adHalfScreenPageUI.f163164i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHalfScreenContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return halfScreenScrollableFrameLayout;
    }

    public static final /* synthetic */ i64.z a7(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPageParam$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        i64.z zVar = adHalfScreenPageUI.f163170r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPageParam$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return zVar;
    }

    public static final /* synthetic */ android.view.View b7(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRoot$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.view.View view = adHalfScreenPageUI.f163159d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRoot$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return view;
    }

    public static final /* synthetic */ android.widget.FrameLayout c7(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTopContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout = adHalfScreenPageUI.f163160e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTopContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return frameLayout;
    }

    public static final /* synthetic */ y54.c d7(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTopMaterialSizeData$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        y54.c cVar = adHalfScreenPageUI.f163173u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTopMaterialSizeData$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return cVar;
    }

    public static final /* synthetic */ void e7(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayingAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        adHalfScreenPageUI.f163175w = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayingAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // x54.b
    public void K3(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        this.P.remove(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // x54.b
    public void L2(int i17, x54.a observer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.P.put(java.lang.Integer.valueOf(i17), observer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    public final boolean f7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCanDoAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCanDoAnimation, isPlayingHideHalfScreenAnimation is ");
        sb6.append(this.F);
        sb6.append(", isPlayingShowHalfScreenAnimation is ");
        sb6.append(this.E);
        sb6.append(", isPlayingToTopHalfScreenAnimation is ");
        sb6.append(this.G);
        sb6.append(", isPlayingAnimation is ");
        sb6.append(this.f163175w);
        sb6.append(", isBeingDragged is ");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout = this.f163164i;
        sb6.append(halfScreenScrollableFrameLayout != null ? java.lang.Boolean.valueOf(halfScreenScrollableFrameLayout.f()) : null);
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", sb6.toString());
        if (!this.F && !this.E && !this.G && !this.f163175w) {
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout2 = this.f163164i;
            if (!(halfScreenScrollableFrameLayout2 != null && halfScreenScrollableFrameLayout2.f())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanDoAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanDoAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return false;
    }

    public final void g7() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doExitClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        if (f7()) {
            hideVKB();
            if (this.C) {
                i7();
                if (this.D == n54.o.f335145d && (halfScreenScrollableFrameLayout = this.f163164i) != null) {
                    halfScreenScrollableFrameLayout.l(this.f163172t.c());
                }
            } else if (this.H) {
                h7();
                finish();
                overridePendingTransition(0, com.tencent.mm.R.anim.f477877e1);
            } else {
                h7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                this.f163175w = true;
                if (getF65848t() && (swipeBackLayout = getSwipeBackLayout()) != null) {
                    swipeBackLayout.setEnableGesture(false);
                }
                ca4.m0.l(this);
                ku5.u0 u0Var = ku5.t0.f312615d;
                y54.j jVar = new y54.j(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(jVar, 30L, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExitClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        int forceOrientation = com.tencent.mm.ui.bk.A() ? super.getForceOrientation() : 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return forceOrientation;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        return com.tencent.mm.R.layout.f487923vd;
    }

    public final void h7() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideMoreOptionMenu", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.Q;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.Q) != null) {
            k0Var.u();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideMoreOptionMenu", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    public final void i7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPlayExpandOrShrinkAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout = this.f163160e;
        if (frameLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayExpandOrShrinkAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            return;
        }
        i64.z zVar = this.f163170r;
        n44.h1 g17 = zVar.g();
        n44.h1 h1Var = n44.h1.f334945e;
        android.widget.FrameLayout frameLayout2 = g17 == h1Var ? this.f163162g : this.f163161f;
        if (frameLayout2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayExpandOrShrinkAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            return;
        }
        boolean z17 = this.C;
        y54.c cVar = this.f163174v;
        y54.c cVar2 = this.f163173u;
        if (z17) {
            if (this.A == null) {
                if (zVar.g() == h1Var) {
                    this.A = new z54.j(0.0f, 1.0f, 300L, this, frameLayout2, false, 32, null);
                } else {
                    z54.g gVar = new z54.g(this, frameLayout2, false, 4, null);
                    this.A = gVar;
                    gVar.b(cVar2.b(), cVar2.c(), cVar2.d(), cVar2.a(), cVar.b(), cVar.c(), cVar.d(), cVar.a());
                }
                vb4.b bVar = this.A;
                if (bVar != null) {
                    bVar.c(new y54.u(this, frameLayout2, frameLayout));
                }
            }
            vb4.b bVar2 = this.A;
            if (bVar2 != null) {
                bVar2.d(0L);
            }
        } else {
            if (this.f163178z == null) {
                if (zVar.g() == h1Var) {
                    this.f163178z = new z54.j(1.0f, 0.0f, 400L, this, frameLayout2, false, 32, null);
                } else {
                    z54.d dVar = new z54.d(this, frameLayout2, false, 4, null);
                    this.f163178z = dVar;
                    dVar.b(cVar2.b(), cVar2.c(), cVar2.d(), cVar2.a(), cVar.b(), cVar.c(), cVar.d(), cVar.a());
                }
                vb4.b bVar3 = this.f163178z;
                if (bVar3 != null) {
                    bVar3.c(new y54.t(frameLayout2, this));
                }
            }
            this.I++;
            vb4.b bVar4 = this.f163178z;
            if (bVar4 != null) {
                bVar4.d(0L);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayExpandOrShrinkAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        try {
            x54.a aVar = (x54.a) ((java.util.LinkedHashMap) this.P).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                aVar.onActivityResult(i17, i18, intent);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                super.onActivityResult(i17, i18, intent);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdHalfScreenPageUI", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        super.onAttachedToWindow();
        ca4.m0.l(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        hideVKB();
        g7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (r8 != r3) goto L19;
     */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onConfigurationChanged(android.content.res.Configuration r8) {
        /*
            r7 = this;
            java.lang.String r0 = "onConfigurationChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "newConfig"
            kotlin.jvm.internal.o.g(r8, r2)
            super.onConfigurationChanged(r8)
            int r2 = r8.orientation
            y54.a r3 = r7.R
            r3.getClass()
            java.lang.String r4 = "getOrientation"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r6 = r3.f459516a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r2 != r6) goto L48
            int r2 = r8.screenWidthDp
            r3.getClass()
            java.lang.String r4 = "getScreenWidthDp"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r6 = r3.f459517b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r2 != r6) goto L48
            int r8 = r8.screenHeightDp
            r3.getClass()
            java.lang.String r2 = "getScreenHeightDp"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            int r3 = r3.f459518c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            if (r8 == r3) goto L4b
        L48:
            r7.recreate()
        L4b:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.lj4 lj4Var;
        r45.lj4 lj4Var2;
        boolean z17;
        android.view.ViewTreeObserver viewTreeObserver;
        android.content.res.Configuration configuration;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        super.onCreate(bundle);
        if (getIntent() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            return;
        }
        n44.q0 q0Var = this.f163171s;
        q0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateStart", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenTimeStaticBuilder");
        q0Var.f335023a = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateStart", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenTimeStaticBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configStatusBar", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        getWindow().getDecorView().setSystemUiVisibility(5890);
        com.tencent.mm.ui.ga controller = getController();
        if (controller != null) {
            controller.W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configStatusBar", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configActionBar", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        setMMTitle("");
        setTitleAlpha(0.0f);
        setBackBtn(new y54.d(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configActionBar", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        n44.m0 m0Var = this.f163169q;
        m0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        i64.z pageParam = this.f163170r;
        kotlin.jvm.internal.o.g(pageParam, "pageParam");
        java.lang.String stringExtra = intent.getStringExtra("ad_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAid", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289365c = stringExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAid", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        java.lang.String stringExtra2 = intent.getStringExtra("ad_uxInfo");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289366d = stringExtra2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        java.lang.String stringExtra3 = intent.getStringExtra("ad_snsId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289367e = stringExtra3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int intExtra = intent.getIntExtra("ad_source", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289368f = intExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        boolean z18 = intent.getIntExtra("scroll_to_top", 0) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCanScrollToTop", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289374l = z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanScrollToTop", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int intExtra2 = intent.getIntExtra("click_action_type", -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionType", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289376n = intExtra2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionType", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        boolean z19 = intent.getIntExtra("is_half_screen_height_assigned", 0) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenHeightAssigned", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289377o = z19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenHeightAssigned", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int intExtra3 = intent.getIntExtra("half_screen_min_height_percent", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenMinHeightPercent", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289378p = intExtra3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenMinHeightPercent", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        long longExtra = intent.getLongExtra("ad_half_screen_click_time", 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickTimeStamp", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289379q = longExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickTimeStamp", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        java.lang.String stringExtra4 = intent.getStringExtra("h5_url");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setH5Url", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289375m = stringExtra4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setH5Url", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int intExtra4 = intent.getIntExtra("timeline_material_outer_index", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSubClickPos", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289373k = intExtra4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubClickPos", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        android.os.Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("view_position_and_size_list");
        if (!(parcelableArrayExtra instanceof android.os.Parcelable[])) {
            parcelableArrayExtra = null;
        }
        if (parcelableArrayExtra != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewPositionAndSizeList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
            str = "onCreate";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            str3 = "getIntent(...)";
            int length = parcelableArrayExtra.length;
            str2 = "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenTimeStaticBuilder";
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewPositionAndSizeList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
                    break;
                }
                int i18 = length;
                android.os.Parcelable parcelable = parcelableArrayExtra[i17];
                android.os.Parcelable[] parcelableArr = parcelableArrayExtra;
                com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize viewPositionAndSize = parcelable instanceof com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize ? (com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize) parcelable : null;
                if (viewPositionAndSize == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewPositionAndSizeList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
                    break;
                }
                arrayList.add(viewPositionAndSize);
                i17++;
                length = i18;
                parcelableArrayExtra = parcelableArr;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewPositionAndSizeList", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            pageParam.f289363a = arrayList;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewPositionAndSizeList", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            str = "onCreate";
            str2 = "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenTimeStaticBuilder";
            str3 = "getIntent(...)";
        }
        com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList mediaObjectList = (com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList) intent.getParcelableExtra("media_list");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaListToArrayList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
        java.util.ArrayList a17 = mediaObjectList != null ? mediaObjectList.a() : null;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!(a17 == null || a17.isEmpty())) {
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                try {
                    r45.jj4 jj4Var = new r45.jj4();
                    jj4Var.parseFrom(bArr);
                    linkedList.add(jj4Var);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("AdHalfScreenMultipleMaterialParseHelper", "getMediaListToArrayList, e is " + e17);
                    it = it;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaListToArrayList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaObjList", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289364b = linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaObjList", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo) intent.getParcelableExtra("kefu_confirm_info");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setKefuConfirmInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289380r = adJumpKefuConfirmInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setKefuConfirmInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        java.lang.String stringExtra5 = intent.getStringExtra("kefu_url");
        java.lang.String str4 = stringExtra5 == null ? "" : stringExtra5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpKefuUrl", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289381s = str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpKefuUrl", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        boolean booleanExtra = intent.getBooleanExtra("can_show_common_more_btn", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCanShowCommonMoreBtn", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        pageParam.f289382t = booleanExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanShowCommonMoreBtn", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        java.util.LinkedList f17 = pageParam.f();
        if (f17 == null || f17.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        } else {
            java.util.LinkedList f18 = pageParam.f();
            kotlin.jvm.internal.o.d(f18);
            int size = f18.size();
            java.util.LinkedList f19 = pageParam.f();
            r45.jj4 jj4Var2 = f19 != null ? (r45.jj4) f19.get(pageParam.h()) : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaObj", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            pageParam.f289369g = jj4Var2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaObj", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            if (size > 1) {
                r45.jj4 e18 = pageParam.e();
                if (e18 != null && e18.f377856e == 2) {
                    r45.jj4 e19 = pageParam.e();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(e19 != null ? e19.f377860i : null)) {
                        pageParam.j(n44.h1.f334945e);
                    }
                }
                java.util.LinkedList f27 = pageParam.f();
                kotlin.jvm.internal.o.d(f27);
                float f28 = 0.0f;
                float f29 = 0.0f;
                for (java.util.Iterator it6 = f27.iterator(); it6.hasNext(); it6 = it6) {
                    r45.lj4 lj4Var3 = ((r45.jj4) it6.next()).f377865p;
                    f28 += lj4Var3.f379520d;
                    f29 += lj4Var3.f379521e;
                }
                float f37 = size;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaWidth", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                pageParam.f289370h = f28 / f37;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaWidth", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaHeight", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                pageParam.f289371i = f29 / f37;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaHeight", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            } else {
                r45.jj4 e27 = pageParam.e();
                if (e27 != null && e27.f377856e == 2) {
                    r45.jj4 e28 = pageParam.e();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(e28 != null ? e28.f377860i : null)) {
                        pageParam.j(n44.h1.f334944d);
                        r45.jj4 e29 = pageParam.e();
                        float f38 = (e29 != null || (lj4Var2 = e29.f377865p) == null) ? 0.0f : lj4Var2.f379520d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaWidth", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                        pageParam.f289370h = f38;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaWidth", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                        r45.jj4 e37 = pageParam.e();
                        float f39 = (e37 != null || (lj4Var = e37.f377865p) == null) ? 0.0f : lj4Var.f379521e;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaHeight", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                        pageParam.f289371i = f39;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaHeight", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                    }
                }
                r45.jj4 e38 = pageParam.e();
                if (e38 != null && e38.f377856e == 6) {
                    r45.jj4 e39 = pageParam.e();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(e39 != null ? e39.f377858g : null)) {
                        pageParam.j(n44.h1.f334946f);
                    }
                }
                r45.jj4 e292 = pageParam.e();
                if (e292 != null) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaWidth", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                pageParam.f289370h = f38;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaWidth", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                r45.jj4 e372 = pageParam.e();
                if (e372 != null) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaHeight", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
                pageParam.f289371i = f39;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaHeight", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            }
            m0Var.f334983a = pageParam;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        n44.q0 q0Var2 = this.f163171s;
        i64.z zVar = this.f163170r;
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        java.lang.String str5 = zVar.f289367e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        q0Var2.getClass();
        java.lang.String str6 = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", str6);
        if (!(str5 == null || str5.length() == 0)) {
            q0Var2.f335030h = str5;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", str6);
        i64.z zVar2 = this.f163170r;
        zVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        java.lang.String str7 = zVar2.f289365c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdId", str6);
        if (!(str7 == null || str7.length() == 0)) {
            q0Var2.f335031i = str7;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdId", str6);
        i64.z zVar3 = this.f163170r;
        zVar3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int i19 = zVar3.f289368f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SOURCE, str6);
        q0Var2.f335028f = i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SOURCE, str6);
        n44.q0 q0Var3 = this.f163171s;
        i64.z zVar4 = this.f163170r;
        zVar4.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickTimeStamp", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        long j17 = zVar4.f289379q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickTimeStamp", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int b17 = this.f163170r.b();
        q0Var3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", str6);
        q0Var3.f335024b = j17;
        if (b17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 3);
        } else if (b17 == 5) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 4);
        } else if (b17 == 18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 5);
        } else if (b17 == 22) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", str6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findViews", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        this.f163159d = findViewById(com.tencent.mm.R.id.qpe);
        this.f163160e = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.ofg);
        this.f163161f = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.qlw);
        this.f163162g = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.qr_);
        this.f163163h = (com.tencent.mm.ui.base.MMViewPager) findViewById(com.tencent.mm.R.id.p1t);
        this.f163164i = (com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout) findViewById(com.tencent.mm.R.id.f483436au4);
        this.f163165m = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) findViewById(com.tencent.mm.R.id.qh7);
        this.f163166n = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.qh6);
        this.f163167o = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f483046v5);
        this.f163168p = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.qpn);
        this.K = findViewById(com.tencent.mm.R.id.f482435ei);
        android.widget.FrameLayout frameLayout = this.f163160e;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new y54.k(this));
        }
        android.widget.FrameLayout frameLayout2 = this.f163167o;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new y54.l(this));
        }
        android.widget.FrameLayout frameLayout3 = this.f163161f;
        if (frameLayout3 != null) {
            frameLayout3.setOnClickListener(new y54.m(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findViews", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configKeyBoardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportHalfScreenKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportHalfScreenKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            z17 = false;
        } else {
            int Ni = ((h62.d) e0Var).Ni(e42.c0.clicfg_sns_ad_half_screen_ui_support_keyboard_height_provider, 1);
            com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "half screen page keyboard height provider: the switch value is " + Ni);
            z17 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportHalfScreenKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        }
        if (z17) {
            com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
            this.N = f5Var;
            f5Var.f210400e = this;
        } else {
            android.view.Window window = getWindow();
            if (window != null) {
                window.setSoftInputMode(32);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configKeyBoardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.view.View view = this.f163159d;
        android.content.Intent intent2 = getIntent();
        kotlin.jvm.internal.o.f(intent2, str3);
        n44.m0 m0Var2 = this.f163169q;
        m0Var2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createHalfScreen", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        m0Var2.f334984b = view;
        n44.f1 f47 = m0Var2.f();
        if (f47 != null) {
            f47.b(intent2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHalfScreen", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configConfiguration", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.content.res.Resources resources = getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            int i27 = configuration.orientation;
            y54.a aVar = this.R;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOrientation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            aVar.f459516a = i27;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOrientation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            int i28 = configuration.screenWidthDp;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScreenWidthDp", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            aVar.f459517b = i28;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScreenWidthDp", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            int i29 = configuration.screenHeightDp;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScreenHeightDp", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            aVar.f459518c = i29;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScreenHeightDp", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configConfiguration", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.view.View view2 = this.f163159d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/activity/AdHalfScreenPageUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/ui/activity/AdHalfScreenPageUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view3 = this.f163159d;
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new y54.n(this));
        }
        n44.q0 q0Var4 = this.f163171s;
        q0Var4.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateEnd", str6);
        q0Var4.f335025c = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateEnd", str6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x02e8  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.onDestroy():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        super.onPause();
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "onPause");
        n44.m0 m0Var = this.f163169q;
        m0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        m0Var.f335000r += java.lang.System.currentTimeMillis() - m0Var.f334999q;
        m0Var.f334998p = true;
        if (m0Var.f334997o) {
            com.tencent.mars.xlog.Log.i("AdHalfScreenPageHelper", "onPause pausePlay");
            m0Var.o();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.N;
        if (f5Var != null) {
            f5Var.d();
        }
        hideVKB();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        super.onResume();
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "onResume");
        boolean z17 = this.H;
        n44.m0 m0Var = this.f163169q;
        m0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        m0Var.f334999q = java.lang.System.currentTimeMillis();
        m0Var.f334998p = false;
        if (m0Var.f334997o) {
            if (!z17) {
                com.tencent.mars.xlog.Log.i("AdHalfScreenPageHelper", "onResume startPlay");
                m0Var.p();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.N;
        if (f5Var != null) {
            f5Var.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSwipeBack", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        hideVKB();
        super.onSwipeBack();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSwipeBack", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.ui.tools.f5 f5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        super.onWindowFocusChanged(z17);
        ca4.m0.l(this);
        if (z17 && (f5Var = this.N) != null) {
            f5Var.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        i64.z zVar = this.f163170r;
        if (zVar.b() == 0 || zVar.b() == 5) {
            boolean z18 = i17 > 200;
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout = this.f163164i;
            if (halfScreenScrollableFrameLayout == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                return;
            }
            com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "onKeyboardHeightChanged, height is " + i17 + ", isResized is " + z17 + ", isShow is " + z18 + ", isKeyBoardShow is " + this.L + ", currentTranslationY is " + halfScreenScrollableFrameLayout.getTranslationY());
            boolean z19 = this.L;
            n44.m0 m0Var = this.f163169q;
            if (z18 != z19) {
                if (z18) {
                    this.M = i17;
                    com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout2 = this.f163164i;
                    if (halfScreenScrollableFrameLayout2 != null) {
                        halfScreenScrollableFrameLayout2.n();
                    }
                } else {
                    com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout3 = this.f163164i;
                    if (halfScreenScrollableFrameLayout3 != null) {
                        halfScreenScrollableFrameLayout3.setTranslationY(-this.f163172t.f());
                    }
                    this.M = 0;
                    com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "onKeyboardHeightChanged hide, reset height");
                }
                this.L = z18;
                m0Var.n(this.M);
            } else if (!z18) {
                com.tencent.mars.xlog.Log.w("AdHalfScreenPageUI", "onKeyboardHeightChanged size changed, keyBoardHeight is " + this.M + ", height is " + i17 + ", but is not show keyboard");
            } else if (this.M != i17) {
                this.M = i17;
                m0Var.n(i17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
    }
}
