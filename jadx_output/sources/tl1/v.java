package tl1;

/* loaded from: classes15.dex */
public abstract class v extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.picker.f f420218d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f420219e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f420220f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f420221g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f420222h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f420223i;

    /* renamed from: m, reason: collision with root package name */
    public tl1.t f420224m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f420225n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f420226o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f420227p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f420228q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f420229r;

    /* renamed from: s, reason: collision with root package name */
    public int f420230s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f420231t;

    /* renamed from: u, reason: collision with root package name */
    public tl1.u f420232u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.p2 f420233v;

    public v(android.content.Context context) {
        super(context);
        this.f420233v = null;
        this.f420230s = getResources().getConfiguration().uiMode;
        setClickable(true);
        setLongClickable(true);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488065fw, (android.view.ViewGroup) this, false);
        this.f420226o = inflate;
        this.f420219e = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.f483190z3);
        this.f420227p = this.f420226o.findViewById(com.tencent.mm.R.id.f483188z1);
        android.view.View findViewById = this.f420226o.findViewById(com.tencent.mm.R.id.kvt);
        this.f420222h = findViewById;
        this.f420223i = findViewById.findViewById(com.tencent.mm.R.id.f487568p14);
        b();
        this.f420222h.findViewById(com.tencent.mm.R.id.azh).setOnClickListener(new tl1.o(this));
        this.f420222h.findViewById(com.tencent.mm.R.id.azg).setOnClickListener(new tl1.p(this));
        this.f420222h.setOnClickListener(new tl1.q(this));
        android.view.View findViewById2 = this.f420226o.findViewById(com.tencent.mm.R.id.f483190z3);
        findViewById2.setOnClickListener(new tl1.r(this));
        findViewById2.setBackgroundColor(b3.l.getColor(findViewById2.getContext(), com.tencent.mm.R.color.f478494f));
        addView(this.f420226o, layoutParams);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483187z0);
        this.f420220f = textView;
        textView.setClickable(true);
        this.f420221g = findViewById(com.tencent.mm.R.id.f483186yz);
        addOnLayoutChangeListener(new tl1.n(this));
    }

    public final void a() {
        int dimensionPixelSize = e() ? 0 : getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f420227p.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        this.f420227p.setLayoutParams(layoutParams);
    }

    public final void b() {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        if (e()) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
            dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
            dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7e);
        } else {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db);
            dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
            dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7f);
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.f420223i.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize2;
        this.f420223i.setLayoutParams(layoutParams);
        this.f420222h.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, dimensionPixelSize3));
    }

    public final void c(boolean z17, java.lang.Object obj) {
        tl1.t tVar;
        if (this.f420225n || (tVar = this.f420224m) == null) {
            return;
        }
        this.f420225n = true;
        tVar.a(z17, obj);
        this.f420225n = false;
    }

    public void d(boolean z17) {
        if (this.f420228q) {
            clearAnimation();
            this.f420228q = false;
        }
        if (this.f420229r || getVisibility() != 0) {
            return;
        }
        c(false, null);
        com.tencent.mm.plugin.appbrand.jsapi.picker.f fVar = this.f420218d;
        if (fVar != null) {
            fVar.onHide(this);
            if (!z17) {
                f();
                return;
            }
            this.f420229r = true;
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477830co);
            this.f420226o.startAnimation(loadAnimation);
            startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477739a0));
            loadAnimation.setAnimationListener(new tl1.m(this));
        }
    }

    public final boolean e() {
        com.tencent.mm.plugin.appbrand.utils.e4 e4Var = com.tencent.mm.plugin.appbrand.utils.e4.f90423f;
        if (this.f420233v == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPickerBottomPanelBase", "requireOrientationGetter, orientationGetter is null, use AndroidOrientationGetter as fallback");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.d(context);
            this.f420233v = new com.tencent.mm.plugin.appbrand.utils.o(context);
        }
        return e4Var == this.f420233v.a();
    }

    public final void f() {
        setBackgroundResource(com.tencent.mm.R.color.a9e);
        clearAnimation();
        super.setVisibility(8);
        requestLayout();
        this.f420229r = false;
    }

    public final void g(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public com.tencent.mm.plugin.appbrand.jsapi.picker.f getPicker() {
        return this.f420218d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = configuration.uiMode;
        if (i17 != this.f420230s && this.f420231t == null) {
            this.f420231t = new tl1.s(this);
        }
        this.f420230s = i17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f420224m = null;
        this.f420232u = null;
        removeAllViews();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (isShown()) {
            return;
        }
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
    }

    public void setHeader(java.lang.String str) {
        java.lang.String str2 = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            a();
            android.view.View view = this.f420227p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showNoTitlePlaceHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showNoTitlePlaceHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f420220f.setText("");
            android.view.View view2 = this.f420221g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "hideHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "hideHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f420220f.setVisibility(8);
            return;
        }
        if ("设置时间".equals(str2)) {
            str2 = getContext().getString(com.tencent.mm.R.string.f490245p5);
        } else if ("设置地区".equals(str2)) {
            str2 = getContext().getString(com.tencent.mm.R.string.f490244p4);
        } else if ("设置日期".equals(str2)) {
            str2 = getContext().getString(com.tencent.mm.R.string.f490243p3);
        } else if (str2 == null) {
            str2 = "";
        }
        android.view.View view3 = this.f420227p;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f420221g;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f420220f.setVisibility(0);
        this.f420220f.setText(str2);
    }

    public void setOnResultListener(tl1.t tVar) {
        this.f420224m = tVar;
    }

    public void setOnValueUpdateListener(tl1.u uVar) {
        this.f420232u = uVar;
    }

    public void setOrientationGetter(com.tencent.mm.plugin.appbrand.utils.p2 p2Var) {
        p2Var.getName();
        this.f420233v = p2Var;
    }

    public void setPickerImpl(com.tencent.mm.plugin.appbrand.jsapi.picker.f fVar) {
        com.tencent.mm.plugin.appbrand.jsapi.picker.f fVar2;
        com.tencent.mm.plugin.appbrand.jsapi.picker.f fVar3 = this.f420218d;
        if (fVar3 != null) {
            fVar3.onDetach(this);
        }
        this.f420218d = fVar;
        if (fVar != null) {
            fVar.onAttach(this);
        }
        if (this.f420219e == null || (fVar2 = this.f420218d) == null || fVar2.getView() == null) {
            return;
        }
        this.f420219e.removeAllViews();
        this.f420224m = null;
        this.f420232u = null;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f420219e.addView(this.f420218d.getView(), layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 != 0) {
            d(false);
        } else {
            super.setVisibility(i17);
        }
    }
}
