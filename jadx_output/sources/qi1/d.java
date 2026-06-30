package qi1;

/* loaded from: classes7.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f363484d;

    /* renamed from: e, reason: collision with root package name */
    public qi1.a f363485e;

    /* renamed from: f, reason: collision with root package name */
    public qi1.b f363486f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.l2 f363487g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f363488h;

    /* renamed from: i, reason: collision with root package name */
    public final qi1.c f363489i;

    /* renamed from: m, reason: collision with root package name */
    public int f363490m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f363485e = qi1.a.f363479d;
        this.f363489i = new qi1.c(this);
        super.setDescendantFocusability(262144);
    }

    public static int a(qi1.d dVar, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        qi1.b bVar = dVar.f363486f;
        int K3 = (bVar == null || (n7Var = (com.tencent.mm.plugin.appbrand.page.n7) ((com.tencent.mm.plugin.appbrand.page.e7$$a) bVar).f86566a.F()) == null) ? 0 : n7Var.K3(dVar);
        return K3 <= 0 ? com.tencent.mm.plugin.appbrand.platform.window.activity.r0.A(q75.a.a(dVar.getContext()), true).heightPixels : K3;
    }

    public static void b(qi1.d dVar, int i17, int i18, boolean z17, boolean z18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = dVar.getMeasuredWidth();
        }
        if ((i19 & 2) != 0) {
            i18 = dVar.getMeasuredHeight();
        }
        if ((i19 & 4) != 0) {
            z17 = false;
        }
        if ((i19 & 8) != 0) {
            z18 = false;
        }
        if (z17) {
            dVar.f363490m = i18;
        }
        if (!dVar.f363484d) {
            boolean z19 = dVar.f363488h;
            if (!z17 || z19) {
                return;
            }
            android.view.KeyEvent.Callback childAt = dVar.getChildAt(0);
            if (childAt instanceof com.tencent.mm.plugin.appbrand.page.fb) {
                com.tencent.mm.plugin.appbrand.page.fb fbVar = (com.tencent.mm.plugin.appbrand.page.fb) childAt;
                if (fbVar.A()) {
                    fbVar.N(i17, i18);
                    return;
                }
                return;
            }
            return;
        }
        android.view.KeyEvent.Callback childAt2 = dVar.getChildAt(0);
        com.tencent.mm.plugin.appbrand.page.fb fbVar2 = childAt2 instanceof com.tencent.mm.plugin.appbrand.page.fb ? (com.tencent.mm.plugin.appbrand.page.fb) childAt2 : null;
        if (fbVar2 == null) {
            return;
        }
        int ordinal = dVar.f363485e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            if (z18) {
                java.lang.String msg = "resetContentSize FitToMax width:" + i17 + " height:" + ((android.view.View) fbVar2).getMeasuredHeight();
                kotlin.jvm.internal.o.g(msg, "msg");
            }
            fbVar2.N(i17, ((android.view.View) fbVar2).getMeasuredHeight());
            return;
        }
        if (z18) {
            java.lang.String msg2 = "resetContentSize FitToLayout width:" + i17 + " height:" + i18 + " lastLayoutHeight:" + dVar.f363490m;
            kotlin.jvm.internal.o.g(msg2, "msg");
        }
        if (!z17) {
            i18 = dVar.f363490m;
        }
        fbVar2.N(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new java.lang.IllegalStateException("can host only one child".toString());
    }

    public final boolean getEnableFixSize() {
        return this.f363484d;
    }

    public final qi1.a getFixedSizeMode() {
        return this.f363485e;
    }

    public final qi1.b getMaxVisibleScreenHeightProvider() {
        return this.f363486f;
    }

    @Override // android.view.ViewGroup
    public void measureChild(android.view.View view, int i17, int i18) {
        if (!this.f363484d) {
            super.measureChild(view, i17, i18);
            return;
        }
        kotlin.jvm.internal.o.d(view);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), android.view.ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), getPaddingTop() + getPaddingBottom(), java.lang.Math.max(kz5.z.F(new int[]{Integer.MIN_VALUE, 1073741824}, android.view.View.MeasureSpec.getMode(i18)) ? android.view.View.MeasureSpec.getSize(i18) : 0, a(this, false, 1, null))));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        if (!this.f363484d) {
            super.measureChildWithMargins(view, i17, i18, i19, i27);
            return;
        }
        kotlin.jvm.internal.o.d(view);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i18, marginLayoutParams.width);
        view.measure(childMeasureSpec, android.view.ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i27, java.lang.Math.max(kz5.z.F(new int[]{Integer.MIN_VALUE, 1073741824}, android.view.View.MeasureSpec.getMode(i19)) ? android.view.View.MeasureSpec.getSize(i19) : 0, a(this, false, 1, null))));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.plugin.appbrand.widget.input.l2 e17 = com.tencent.mm.plugin.appbrand.widget.input.h1.e(this);
        this.f363487g = e17;
        if (e17 != null) {
            e17.a(this.f363489i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f363487g;
        if (l2Var != null) {
            l2Var.g(this.f363489i);
        }
        this.f363487g = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        b(this, i19 - i17, i27 - i18, true, false, 8, null);
    }

    @Override // android.view.ViewGroup
    public void setDescendantFocusability(int i17) {
        if (getChildAt(0) instanceof android.view.ViewGroup) {
            android.view.View childAt = getChildAt(0);
            kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) childAt).setDescendantFocusability(i17);
        }
    }

    public final void setEnableFixSize(boolean z17) {
        this.f363484d = z17;
    }

    public final void setFixedSizeMode(qi1.a value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (this.f363485e != value) {
            java.lang.String msg = "fixedSizeMode.set " + this.f363485e + " -> " + value;
            kotlin.jvm.internal.o.g(msg, "msg");
            this.f363485e = value;
            b(this, 0, 0, false, true, 7, null);
            android.view.KeyEvent.Callback childAt = getChildAt(0);
            com.tencent.mm.plugin.appbrand.page.fb fbVar = childAt instanceof com.tencent.mm.plugin.appbrand.page.fb ? (com.tencent.mm.plugin.appbrand.page.fb) childAt : null;
            if (fbVar != null) {
                fbVar.setAppBrandWebViewContentsSizeLogEnabled(value == qi1.a.f363480e);
            }
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        if (getChildAt(0) instanceof android.view.ViewGroup) {
            android.view.View childAt = getChildAt(0);
            kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) childAt).setFocusable(z17);
        }
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z17) {
        if (getChildAt(0) instanceof android.view.ViewGroup) {
            android.view.View childAt = getChildAt(0);
            kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) childAt).setFocusableInTouchMode(z17);
        }
    }

    public final void setMaxVisibleScreenHeightProvider(qi1.b bVar) {
        this.f363486f = bVar;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (getChildCount() <= 0) {
            super.addView(view, i17);
            return;
        }
        throw new java.lang.IllegalStateException("can host only one  child".toString());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("can host only one child".toString());
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i17, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("can host only one child".toString());
    }
}
