package k23;

/* loaded from: classes12.dex */
public final class x extends k23.q {

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f303743o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f303744p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f303745q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k23.d0 params, com.tencent.mm.ui.MMActivity activity) {
        super(params, activity);
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(activity, "activity");
        android.widget.RelativeLayout b17 = getVb().b();
        b17.setPadding(b17.getPaddingLeft(), (int) b17.getResources().getDimension(com.tencent.mm.R.dimen.ajr), b17.getPaddingRight(), b17.getPaddingBottom());
        com.tencent.mm.ui.widget.MMTextView c17 = getVb().c();
        int dimension = (int) c17.getResources().getDimension(com.tencent.mm.R.dimen.ajw);
        c17.setPadding(dimension, c17.getPaddingTop(), dimension, c17.getPaddingBottom());
        g();
        float dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        android.view.View a17 = getVb().a();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(i65.a.d(a17.getContext(), com.tencent.mm.R.color.f478494f));
        gradientDrawable.setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f});
        a17.setBackground(gradientDrawable);
        getVb().f().setTextSize(0, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479850gz) * z50.i.f470166a.b());
        com.tencent.mm.ui.widget.MMTextView c18 = getVb().c();
        kotlin.jvm.internal.o.f(c18, "getRecognizedText(...)");
        c18.setTextSize(0, i65.a.f(c18.getContext(), com.tencent.mm.R.dimen.f479854h3) * i65.a.m(c18.getContext()));
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        getVb().c().setHint((java.lang.String) ((jz5.n) new k23.c(context).f303535c).getValue());
        this.f303743o = jz5.h.b(new k23.s(this));
        this.f303744p = jz5.h.b(new k23.w(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tyr);
        this.f303745q = findViewById;
        findViewById.setOnClickListener(k23.r.f303676d);
    }

    private final int getNavigationBarColorInPanel() {
        return ((java.lang.Number) ((jz5.n) this.f303743o).getValue()).intValue();
    }

    private final int getStatusBarColorInPanel() {
        return ((java.lang.Number) ((jz5.n) this.f303744p).getValue()).intValue();
    }

    @Override // k23.q
    public void b(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        k23.d0 params = getParams();
        params.getClass();
        k23.w0 w0Var = k23.w0.f303736f;
        k23.w0 w0Var2 = params.f303548e;
        if ((w0Var2 == w0Var || w0Var2 == k23.w0.f303735e) ? false : true) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            kotlin.jvm.internal.o.d(ofFloat);
            ofFloat.addListener(new k23.u(this));
            ofFloat.addUpdateListener(new k23.t(this, ofFloat));
            ofFloat.setDuration(300L);
            list.add(ofFloat);
        }
    }

    @Override // k23.q
    public void c() {
        em.i0 i0Var = this.f303657f;
        android.view.View[] viewArr = {i0Var.a(), i0Var.b()};
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            android.view.View view = viewArr[i17];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "resetUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "resetUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationY(0.0f);
            i17++;
        }
        setTips(false);
        f();
        setRecognizedText("");
        setTips(false);
        i0Var.e().d();
        android.view.View view2 = this.f303745q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelViewHalfScreen", "resetUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelViewHalfScreen", "resetUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f303745q;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelViewHalfScreen", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelViewHalfScreen", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void g() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.tys);
        if (constraintLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = (int) (getScreenHeight() * getParams().f303555l);
            constraintLayout.setLayoutParams(layoutParams2);
        }
    }

    @Override // k23.q
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ef_;
    }

    public final java.lang.Integer[] getTargetActivityBarColor() {
        return getParams().f303548e == k23.w0.f303736f ? new java.lang.Integer[]{null, java.lang.Integer.valueOf(getNavigationBarColorInPanel())} : new java.lang.Integer[]{java.lang.Integer.valueOf(getStatusBarColorInPanel()), java.lang.Integer.valueOf(getNavigationBarColorInPanel())};
    }
}
