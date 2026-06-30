package r2;

/* loaded from: classes14.dex */
public abstract class o extends android.view.ViewGroup implements n3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final o1.e f368731d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f368732e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f368733f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f368734g;

    /* renamed from: h, reason: collision with root package name */
    public z0.t f368735h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f368736i;

    /* renamed from: m, reason: collision with root package name */
    public p2.f f368737m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f368738n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.y f368739o;

    /* renamed from: p, reason: collision with root package name */
    public o4.g f368740p;

    /* renamed from: q, reason: collision with root package name */
    public final x0.r0 f368741q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f368742r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.a f368743s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f368744t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f368745u;

    /* renamed from: v, reason: collision with root package name */
    public int f368746v;

    /* renamed from: w, reason: collision with root package name */
    public int f368747w;

    /* renamed from: x, reason: collision with root package name */
    public final n3.j0 f368748x;

    /* renamed from: y, reason: collision with root package name */
    public final u1.w f368749y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, n0.g1 g1Var, o1.e dispatcher) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        this.f368731d = dispatcher;
        if (g1Var != null) {
            java.util.Map map = androidx.compose.ui.platform.k5.f10620a;
            setTag(com.tencent.mm.R.id.f483038ux, g1Var);
        }
        setSaveFromParentEnabled(false);
        this.f368733f = r2.n.f368730d;
        this.f368735h = z0.p.f468921d;
        this.f368737m = new p2.g(1.0f, 1.0f);
        this.f368741q = new x0.r0(new r2.m(this));
        this.f368742r = new r2.i(this);
        this.f368743s = new r2.l(this);
        this.f368745u = new int[2];
        this.f368746v = Integer.MIN_VALUE;
        this.f368747w = Integer.MIN_VALUE;
        this.f368748x = new n3.j0(this);
        u1.w wVar = new u1.w(false, 1, null);
        p1.g0 g0Var = new p1.g0();
        g0Var.f350820d = new p1.h0(this);
        p1.k0 k0Var = new p1.k0();
        p1.k0 k0Var2 = g0Var.f350821e;
        if (k0Var2 != null) {
            k0Var2.f350841d = null;
        }
        g0Var.f350821e = k0Var;
        k0Var.f350841d = g0Var;
        setOnRequestDisallowInterceptTouchEvent$ui_release(k0Var);
        z0.t a17 = s1.h1.a(b1.j.a(g0Var, new r2.g(wVar, this)), new r2.h(this, wVar));
        wVar.M(this.f368735h.k(a17));
        this.f368736i = new r2.a(wVar, a17);
        wVar.K(this.f368737m);
        this.f368738n = new r2.b(wVar);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        wVar.S = new r2.c(this, wVar, h0Var);
        wVar.T = new r2.d(this, h0Var);
        wVar.L(new r2.f(this, wVar));
        this.f368749y = wVar;
    }

    public static final int a(r2.o oVar, int i17, int i18, int i19) {
        oVar.getClass();
        return (i19 >= 0 || i17 == i18) ? android.view.View.MeasureSpec.makeMeasureSpec(e06.p.f(i19, i17, i18), 1073741824) : (i19 != -2 || i18 == Integer.MAX_VALUE) ? (i19 != -1 || i18 == Integer.MAX_VALUE) ? android.view.View.MeasureSpec.makeMeasureSpec(0, 0) : android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE);
    }

    @Override // n3.g0
    public boolean B(android.view.View child, android.view.View target, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        return ((i17 & 2) == 0 && (i17 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f368745u;
        getLocationInWindow(iArr);
        int i17 = iArr[0];
        region.op(i17, iArr[1], i17 + getWidth(), iArr[1] + getHeight(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    public final p2.f getDensity() {
        return this.f368737m;
    }

    public final u1.w getLayoutNode() {
        return this.f368749y;
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view = this.f368732e;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new android.view.ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.y getLifecycleOwner() {
        return this.f368739o;
    }

    public final z0.t getModifier() {
        return this.f368735h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3.j0 j0Var = this.f368748x;
        return j0Var.f334346b | j0Var.f334345a;
    }

    public final yz5.l getOnDensityChanged$ui_release() {
        return this.f368738n;
    }

    public final yz5.l getOnModifierChanged$ui_release() {
        return this.f368736i;
    }

    public final yz5.l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f368744t;
    }

    public final o4.g getSavedStateRegistryOwner() {
        return this.f368740p;
    }

    public final yz5.a getUpdate() {
        return this.f368733f;
    }

    public final android.view.View getView() {
        return this.f368732e;
    }

    @Override // n3.g0
    public void h(android.view.View child, android.view.View target, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        this.f368748x.a(child, target, i17, i18);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f368749y.u();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        android.view.View view = this.f368732e;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // n3.g0
    public void j(android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(target, "target");
        this.f368748x.b(target, i17);
    }

    @Override // n3.g0
    public void l(android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(target, "target");
        if (isNestedScrollingEnabled()) {
            float f17 = i17;
            float f18 = -1;
            this.f368731d.b(d1.f.a(f17 * f18, i18 * f18), d1.f.a(i19 * f18, i27 * f18), i28 == 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f368741q.c();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View child, android.view.View target) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        super.onDescendantInvalidated(child, target);
        this.f368749y.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x0.r0 r0Var = this.f368741q;
        x0.i iVar = r0Var.f450936e;
        if (iVar != null) {
            ((x0.k) iVar).dispose();
        }
        r0Var.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View view = this.f368732e;
        if (view != null) {
            view.layout(0, 0, i19 - i17, i27 - i18);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View view = this.f368732e;
        if (view != null) {
            view.measure(i17, i18);
        }
        android.view.View view2 = this.f368732e;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        android.view.View view3 = this.f368732e;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.f368746v = i17;
        this.f368747w = i18;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View target, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        kotlinx.coroutines.l.d(this.f368731d.d(), null, null, new r2.j(z17, this, p2.x.a(f17 * (-1.0f), (-1.0f) * f18), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        kotlin.jvm.internal.o.g(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        kotlinx.coroutines.l.d(this.f368731d.d(), null, null, new r2.k(this, p2.x.a(f17 * (-1.0f), f18 * (-1.0f)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        yz5.l lVar = this.f368744t;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
        super.requestDisallowInterceptTouchEvent(z17);
    }

    public final void setDensity(p2.f value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (value != this.f368737m) {
            this.f368737m = value;
            yz5.l lVar = this.f368738n;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.y yVar) {
        if (yVar != this.f368739o) {
            this.f368739o = yVar;
            setTag(com.tencent.mm.R.id.p28, yVar);
        }
    }

    public final void setModifier(z0.t value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (value != this.f368735h) {
            this.f368735h = value;
            yz5.l lVar = this.f368736i;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(yz5.l lVar) {
        this.f368738n = lVar;
    }

    public final void setOnModifierChanged$ui_release(yz5.l lVar) {
        this.f368736i = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(yz5.l lVar) {
        this.f368744t = lVar;
    }

    public final void setSavedStateRegistryOwner(o4.g gVar) {
        if (gVar != this.f368740p) {
            this.f368740p = gVar;
            o4.j.b(this, gVar);
        }
    }

    public final void setUpdate(yz5.a value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f368733f = value;
        this.f368734g = true;
        ((r2.l) this.f368743s).invoke();
    }

    public final void setView$ui_release(android.view.View view) {
        if (view != this.f368732e) {
            this.f368732e = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f368743s.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // n3.g0
    public void t(android.view.View target, int i17, int i18, int[] consumed, int i19) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            float f17 = i17;
            float f18 = -1;
            long a17 = d1.f.a(f17 * f18, i18 * f18);
            int i27 = i19 == 0 ? 1 : 2;
            o1.a aVar = this.f368731d.f342023c;
            long d17 = aVar != null ? aVar.d(a17, i27) : d1.e.f225623b;
            consumed[0] = androidx.compose.ui.platform.p3.a(d1.e.c(d17));
            consumed[1] = androidx.compose.ui.platform.p3.a(d1.e.d(d17));
        }
    }

    @Override // n3.h0
    public void z(android.view.View target, int i17, int i18, int i19, int i27, int i28, int[] consumed) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            float f17 = i17;
            float f18 = -1;
            long b17 = this.f368731d.b(d1.f.a(f17 * f18, i18 * f18), d1.f.a(i19 * f18, i27 * f18), i28 == 0 ? 1 : 2);
            consumed[0] = androidx.compose.ui.platform.p3.a(d1.e.c(b17));
            consumed[1] = androidx.compose.ui.platform.p3.a(d1.e.d(b17));
        }
    }
}
