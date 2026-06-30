package mi1;

/* loaded from: classes7.dex */
public final class l extends xi1.c implements al1.g, android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f326604d;

    /* renamed from: e, reason: collision with root package name */
    public int f326605e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f326606f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f326607g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f326608h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mi1.v f326609i;

    public l(mi1.v vVar, com.tencent.mm.plugin.appbrand.page.v5 page) {
        kotlin.jvm.internal.o.g(page, "page");
        this.f326609i = vVar;
        this.f326604d = page;
        this.f326605e = -1;
        this.f326607g = jz5.h.b(new mi1.k(this));
        page.w(new mi1.j(vVar, this));
        page.r1().setCapsuleBarInteractionDelegate(this);
    }

    @Override // al1.g
    public void d(android.view.View.OnClickListener onClickListener) {
        this.f326606f = onClickListener;
        if (this.f326608h) {
            mi1.i iVar = this.f326609i.f326704c;
            if (iVar != null) {
                iVar.setHomeButtonOnClickListener(onClickListener);
            } else {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
        }
    }

    @Override // al1.g
    public void e(android.view.View.OnClickListener onClickListener) {
        jz5.g gVar = this.f326607g;
        mi1.l2 l2Var = (mi1.l2) ((jz5.n) gVar).getValue();
        l2Var.f326614d = onClickListener;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = this.f326604d.t3();
        kotlin.jvm.internal.o.f(t37, "getRuntime(...)");
        l2Var.f326615e = t37;
        if (this.f326608h) {
            mi1.i iVar = this.f326609i.f326704c;
            if (iVar != null) {
                iVar.setOptionButtonOnClickListener((mi1.l2) ((jz5.n) gVar).getValue());
            } else {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
        }
    }

    @Override // al1.i0
    public boolean h(boolean z17, al1.h0 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return ((mi1.o) this.f326609i.f326708g.getValue()).h(z17, reason);
    }

    @Override // al1.g
    public void k(int i17) {
        this.f326605e = i17;
        if (this.f326608h) {
            mi1.i iVar = this.f326609i.f326704c;
            if (iVar != null) {
                iVar.setStyleColor(i17);
            } else {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
        }
    }

    @Override // al1.g
    public void n(int i17) {
        q();
    }

    @Override // xi1.c
    public void o() {
        mi1.v vVar = this.f326609i;
        mi1.u0 u0Var = vVar.f326710i;
        if (u0Var == null) {
            kotlin.jvm.internal.o.o("blinkWrapper");
            throw null;
        }
        android.animation.Animator animator = u0Var.f326697f;
        if (animator != null) {
            animator.pause();
        }
        vVar.c().setVisibility(4);
        com.tencent.mars.xlog.Log.i("AppBrandCapsuleBarManager", "onEnterFullscreen");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (this.f326608h) {
            if (i17 == i28 && i18 == i29 && i19 == i37 && i27 == i38) {
                return;
            }
            q();
        }
    }

    @Override // xi1.c
    public void p() {
        mi1.v vVar = this.f326609i;
        mi1.u0 u0Var = vVar.f326710i;
        if (u0Var == null) {
            kotlin.jvm.internal.o.o("blinkWrapper");
            throw null;
        }
        android.animation.Animator animator = u0Var.f326697f;
        if (animator != null) {
            animator.resume();
        }
        vVar.c().setVisibility(0);
        com.tencent.mars.xlog.Log.i("AppBrandCapsuleBarManager", "onExitFullscreen");
    }

    public final void q() {
        int visibility;
        android.view.ViewGroup.LayoutParams layoutParams;
        mi1.v vVar = this.f326609i;
        mi1.i iVar = vVar.f326704c;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("capsuleBarView");
            throw null;
        }
        boolean isLaidOut = iVar.getCapsuleContentAreaView().isLaidOut();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f326604d;
        if (isLaidOut) {
            v5Var.r1().getCapsuleView().setFixedWidth(iVar.getCapsuleContentAreaView().getMeasuredWidth());
            v5Var.r1().getCapsuleView().setFixedHeight(iVar.getCapsuleContentAreaView().getMeasuredHeight());
        }
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView = v5Var.r1().getCapsuleView();
        if (capsuleView != null && (layoutParams = capsuleView.getLayoutParams()) != null) {
            android.view.View capsuleContentAreaView = iVar.getCapsuleContentAreaView();
            vVar.getClass();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new android.widget.FrameLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new android.widget.FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 21;
            layoutParams2.width = -2;
            capsuleContentAreaView.setLayoutParams(layoutParams2);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = v5Var.r1().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i17 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        android.view.ViewGroup.LayoutParams layoutParams4 = iVar.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams5 = (android.widget.FrameLayout.LayoutParams) layoutParams4;
        layoutParams5.topMargin = i17;
        layoutParams5.gravity = 5;
        android.view.ViewGroup.LayoutParams layoutParams6 = iVar.getLayoutParams();
        if (layoutParams6 != null && layoutParams6.height != v5Var.r1().getMeasuredHeight()) {
            al1.b r17 = v5Var.r1();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.c(r17)) {
                layoutParams6.height = v5Var.r1().getMeasuredHeight();
            }
        }
        iVar.requestLayout();
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView2 = v5Var.r1().getCapsuleView();
        if (capsuleView2 == null || iVar.getVisibility() == (visibility = capsuleView2.getVisibility())) {
            return;
        }
        iVar.setVisibility(visibility);
    }

    public final void r() {
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView;
        this.f326608h = false;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f326604d;
        xi1.m C1 = v5Var.C1();
        if (C1 != null) {
            C1.f(this);
        }
        mi1.i iVar = this.f326609i.f326704c;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("capsuleBarView");
            throw null;
        }
        iVar.removeOnLayoutChangeListener(this);
        al1.b r17 = v5Var.r1();
        android.view.ViewParent parent = (r17 == null || (capsuleView = r17.getCapsuleView()) == null) ? null : capsuleView.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
        al1.b r18 = v5Var.r1();
        if (r18 != null) {
            r18.removeOnLayoutChangeListener(this);
        }
    }
}
