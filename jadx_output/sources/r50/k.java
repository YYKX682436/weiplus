package r50;

/* loaded from: classes5.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout.LayoutParams f392599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392600e;

    public k(android.widget.LinearLayout.LayoutParams layoutParams, r50.j0 j0Var) {
        this.f392599d = layoutParams;
        this.f392600e = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        r50.j0 j0Var = this.f392600e;
        boolean V6 = j0Var.V6();
        jz5.g gVar = j0Var.f392592n;
        int intValue2 = V6 ? ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() + intValue : (intValue * 2) - ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        android.widget.LinearLayout.LayoutParams layoutParams = this.f392599d;
        layoutParams.leftMargin = intValue2;
        layoutParams.rightMargin = intValue;
        j0Var.W6().d().setLayoutParams(layoutParams);
    }
}
