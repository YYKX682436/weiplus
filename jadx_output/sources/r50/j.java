package r50;

/* loaded from: classes5.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f392583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392584e;

    public j(android.view.ViewGroup.LayoutParams layoutParams, r50.j0 j0Var) {
        this.f392583d = layoutParams;
        this.f392584e = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f392583d;
        layoutParams.height = intValue;
        em.b W6 = this.f392584e.W6();
        if (W6.f254083f == null) {
            W6.f254083f = (android.widget.LinearLayout) W6.f254078a.findViewById(com.tencent.mm.R.id.dfl);
        }
        W6.f254083f.setLayoutParams(layoutParams);
    }
}
