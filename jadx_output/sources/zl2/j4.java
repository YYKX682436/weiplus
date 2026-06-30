package zl2;

/* loaded from: classes2.dex */
public final class j4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f473843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f473844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f473845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f473846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f473848i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f473849m;

    public j4(int i17, android.view.View view, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2, yz5.l lVar, int i18, int i19) {
        this.f473843d = i17;
        this.f473844e = view;
        this.f473845f = e0Var;
        this.f473846g = e0Var2;
        this.f473847h = lVar;
        this.f473848i = i18;
        this.f473849m = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        int i17 = this.f473843d;
        boolean b17 = kotlin.jvm.internal.o.b(animatedValue, java.lang.Integer.valueOf(i17));
        yz5.l lVar = this.f473847h;
        kotlin.jvm.internal.e0 e0Var = this.f473846g;
        kotlin.jvm.internal.e0 e0Var2 = this.f473845f;
        android.view.View view = this.f473844e;
        if (b17) {
            view.getLayoutParams().width = i17;
            view.requestLayout();
            e0Var2.f310115d = 1.0f;
            if (!(1.0f == e0Var.f310115d) && lVar != null) {
                lVar.invoke(java.lang.Float.valueOf(1.0f));
            }
            e0Var.f310115d = e0Var2.f310115d;
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        java.lang.Object animatedValue2 = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((java.lang.Integer) animatedValue2).intValue();
        view.requestLayout();
        e0Var2.f310115d = (view.getLayoutParams().width - this.f473848i) / this.f473849m;
        float f17 = e0Var2.f310115d;
        if (!(f17 == e0Var.f310115d) && lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(f17));
        }
        e0Var.f310115d = e0Var2.f310115d;
    }
}
