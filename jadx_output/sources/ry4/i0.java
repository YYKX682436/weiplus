package ry4;

/* loaded from: classes3.dex */
public final class i0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.j0 f401637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.a f401638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f401640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f401641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f401642i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f401643m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f401644n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f401645o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f401646p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f401647q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f401648r;

    public i0(ry4.j0 j0Var, ry4.a aVar, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        this.f401637d = j0Var;
        this.f401638e = aVar;
        this.f401639f = i17;
        this.f401640g = i18;
        this.f401641h = i19;
        this.f401642i = i27;
        this.f401643m = i28;
        this.f401644n = i29;
        this.f401645o = i37;
        this.f401646p = i38;
        this.f401647q = i39;
        this.f401648r = i47;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator va6) {
        boolean z17;
        kotlin.jvm.internal.o.g(va6, "va");
        java.lang.Object animatedValue = va6.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ry4.a aVar = this.f401638e;
        android.widget.CheckBox checkBox = aVar.f401568f;
        ry4.j0 j0Var = this.f401637d;
        int i17 = this.f401639f;
        int i18 = this.f401640g;
        ry4.j0.I(j0Var, checkBox, ry4.j0.J(j0Var, i17, i18, floatValue));
        ry4.j0.I(j0Var, aVar.f401569g, ry4.j0.J(j0Var, i17, i18, floatValue));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = aVar.f401570h;
        int J2 = ry4.j0.J(j0Var, i17, i18, floatValue);
        int J3 = ry4.j0.J(j0Var, this.f401641h, this.f401642i, floatValue);
        j0Var.getClass();
        boolean z18 = false;
        boolean z19 = true;
        if (weImageView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                if (layoutParams2.width != J2) {
                    layoutParams2.width = J2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (layoutParams2.getMarginStart() != J3) {
                    layoutParams2.setMarginStart(J3);
                    z17 = true;
                }
                if (z17) {
                    weImageView.setLayoutParams(layoutParams2);
                }
            }
        }
        android.view.View view = aVar.f401572m;
        int J4 = ry4.j0.J(j0Var, this.f401643m, this.f401644n, floatValue);
        int J5 = ry4.j0.J(j0Var, this.f401645o, this.f401646p, floatValue);
        j0Var.getClass();
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                if (layoutParams4.getMarginStart() != J4) {
                    layoutParams4.setMarginStart(J4);
                    z18 = true;
                }
                if (layoutParams4.getMarginEnd() != J5) {
                    layoutParams4.setMarginEnd(J5);
                } else {
                    z19 = z18;
                }
                if (z19) {
                    view.setLayoutParams(layoutParams4);
                }
            }
        }
        android.view.View view2 = aVar.f401571i;
        int J6 = ry4.j0.J(j0Var, this.f401647q, this.f401648r, floatValue);
        j0Var.getClass();
        if (view2 == null || view2.getPaddingEnd() == J6) {
            return;
        }
        view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), J6, view2.getPaddingBottom());
    }
}
