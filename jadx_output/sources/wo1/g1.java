package wo1;

/* loaded from: classes5.dex */
public final class g1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.i1 f447940d;

    public g1(wo1.i1 i1Var) {
        this.f447940d = i1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        wo1.i1 i1Var = this.f447940d;
        android.widget.FrameLayout frameLayout = i1Var.f447953o;
        int paddingLeft = frameLayout.getPaddingLeft();
        int paddingTop = i1Var.f447953o.getPaddingTop();
        int paddingRight = i1Var.f447953o.getPaddingRight();
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, ((java.lang.Integer) animatedValue).intValue());
        i1Var.f447953o.requestLayout();
    }
}
