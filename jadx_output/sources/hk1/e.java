package hk1;

/* loaded from: classes7.dex */
public final class e extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f281873h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f281874d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC f281875e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f281876f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f281877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f281874d = "MicroMsg.AppBrandActivityContainerView";
    }

    private final com.tencent.mm.plugin.appbrand.o6 getRuntime() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = getRuntimeContainer().getActiveRuntime();
        if (activeRuntime instanceof com.tencent.mm.plugin.appbrand.o6) {
            return (com.tencent.mm.plugin.appbrand.o6) activeRuntime;
        }
        return null;
    }

    public final void a(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewGroup viewGroup = this.f281876f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (layoutParams != null) {
            android.view.ViewGroup viewGroup2 = this.f281876f;
            if (viewGroup2 != null) {
                viewGroup2.addView(view, layoutParams);
                return;
            }
            return;
        }
        android.view.ViewGroup viewGroup3 = this.f281876f;
        if (viewGroup3 != null) {
            viewGroup3.addView(view);
        }
    }

    public final void b(android.view.ViewGroup container, android.view.ViewGroup.LayoutParams layoutParams) {
        android.app.Activity r07;
        kotlin.jvm.internal.o.g(container, "container");
        android.view.ViewGroup viewGroup = this.f281876f;
        if (viewGroup != null) {
            removeView(viewGroup);
        }
        this.f281876f = container;
        container.setOnClickListener(hk1.b.f281870d);
        com.tencent.mm.plugin.appbrand.o6 runtime = getRuntime();
        if (runtime != null && (r07 = runtime.r0()) != null && (this.f281876f instanceof mi1.h)) {
            vj5.n b17 = vj5.n.b(r07);
            android.view.ViewGroup viewGroup2 = this.f281876f;
            kotlin.jvm.internal.o.e(viewGroup2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarContainerLayout");
            b17.d((mi1.h) viewGroup2);
        }
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        }
        addView(this.f281876f, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f281875e != null) {
            com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(this);
            if (d17 != null && d17.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        com.tencent.mm.plugin.appbrand.o6 runtime;
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (view != null && (runtime = getRuntime()) != null && (l0Var = runtime.H2) != null) {
            l0Var.j(canvas, view, com.tencent.mm.plugin.appbrand.widget.halfscreen.o.f91209d);
        }
        return super.drawChild(canvas, view, j17);
    }

    public final com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC getRuntimeContainer() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.f281875e;
        if (appBrandRuntimeContainerWC != null) {
            return appBrandRuntimeContainerWC;
        }
        kotlin.jvm.internal.o.o("runtimeContainer");
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (this.f281875e != null) {
            com.tencent.mm.plugin.appbrand.o6 runtime = getRuntime();
            boolean z17 = false;
            if (runtime != null && (l0Var = runtime.H2) != null && (f0Var = l0Var.f91198d) != null && f0Var.a0(ev6)) {
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        try {
            super.onLayout(z17, i17, i18, i19, i27);
            android.view.View view = this.f281877g;
            if (!kotlin.jvm.internal.o.b(view != null ? view.getParent() : null, this) || this.f281876f == null) {
                return;
            }
            android.view.View view2 = this.f281877g;
            kotlin.jvm.internal.o.d(view2);
            int left = view2.getLeft();
            android.view.View view3 = this.f281877g;
            kotlin.jvm.internal.o.d(view3);
            int top = view3.getTop();
            android.view.View view4 = this.f281877g;
            kotlin.jvm.internal.o.d(view4);
            int right = view4.getRight();
            android.view.ViewGroup viewGroup = this.f281876f;
            kotlin.jvm.internal.o.d(viewGroup);
            android.view.ViewGroup viewGroup2 = this.f281876f;
            kotlin.jvm.internal.o.d(viewGroup2);
            viewGroup.layout(left, top - viewGroup2.getMeasuredHeight(), right, top);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f281874d, e17, "", "");
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var;
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f281875e != null) {
            com.tencent.mm.plugin.appbrand.o6 runtime = getRuntime();
            boolean z17 = false;
            if (runtime != null && (l0Var = runtime.H2) != null && (f0Var = l0Var.f91198d) != null && f0Var.U(event)) {
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setExternalHeaderAnchor(android.view.View view) {
        this.f281877g = view;
    }

    public final void setExternalHeaderVisibility(int i17) {
        android.view.ViewGroup viewGroup = this.f281876f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(i17);
    }

    public final void setExternalHeaderVisibilityWithAnimation(int i17) {
        if (i17 != 0) {
            android.view.ViewGroup viewGroup = this.f281876f;
            if (viewGroup != null && viewGroup.getVisibility() == 8) {
                return;
            }
            android.view.ViewGroup viewGroup2 = this.f281876f;
            if (viewGroup2 != null ? kotlin.jvm.internal.o.b(viewGroup2.getTag(), java.lang.Boolean.TRUE) : false) {
                return;
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f281876f, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            ofFloat.addListener(new hk1.d(this));
            ofFloat.start();
            return;
        }
        android.view.ViewGroup viewGroup3 = this.f281876f;
        if (viewGroup3 != null && viewGroup3.getVisibility() == 0) {
            return;
        }
        android.view.ViewGroup viewGroup4 = this.f281876f;
        if (viewGroup4 != null ? kotlin.jvm.internal.o.b(viewGroup4.getTag(), java.lang.Boolean.TRUE) : false) {
            return;
        }
        android.view.ViewGroup viewGroup5 = this.f281876f;
        if (viewGroup5 != null) {
            viewGroup5.setVisibility(0);
        }
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f281876f, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(100L);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat2.addListener(new hk1.c(this));
        ofFloat2.start();
    }

    public final void setRuntimeContainer(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC) {
        kotlin.jvm.internal.o.g(appBrandRuntimeContainerWC, "<set-?>");
        this.f281875e = appBrandRuntimeContainerWC;
    }
}
