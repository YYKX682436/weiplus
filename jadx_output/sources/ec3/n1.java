package ec3;

/* loaded from: classes2.dex */
public final class n1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f251066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f251067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f251068f;

    public n1(android.view.ViewGroup.LayoutParams layoutParams, android.widget.RelativeLayout relativeLayout, kotlin.jvm.internal.c0 c0Var) {
        this.f251066d = layoutParams;
        this.f251067e = relativeLayout;
        this.f251068f = c0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            int floatValue = (int) f17.floatValue();
            android.view.ViewGroup.LayoutParams layoutParams = this.f251066d;
            layoutParams.height = floatValue;
            android.widget.RelativeLayout relativeLayout = this.f251067e;
            relativeLayout.setLayoutParams(layoutParams);
            if (!this.f251068f.f310112d || relativeLayout.getVisibility() == 0) {
                return;
            }
            relativeLayout.setVisibility(0);
        }
    }
}
