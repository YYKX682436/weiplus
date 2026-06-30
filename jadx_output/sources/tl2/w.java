package tl2;

/* loaded from: classes3.dex */
public final class w extends androidx.transition.Transition {
    @Override // androidx.transition.Transition
    public void g(u4.m1 transitionValues) {
        kotlin.jvm.internal.o.g(transitionValues, "transitionValues");
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 transitionValues) {
        kotlin.jvm.internal.o.g(transitionValues, "transitionValues");
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator n(android.view.ViewGroup sceneRoot, u4.m1 m1Var, u4.m1 m1Var2) {
        android.content.res.ColorStateList textColors;
        android.content.res.ColorStateList textColors2;
        kotlin.jvm.internal.o.g(sceneRoot, "sceneRoot");
        java.lang.Integer num = null;
        if ((m1Var != null ? m1Var.f424515b : null) instanceof android.widget.TextView) {
            if ((m1Var2 != null ? m1Var2.f424515b : null) instanceof android.widget.TextView) {
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                android.view.View view = m1Var != null ? m1Var.f424515b : null;
                android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
                java.lang.Integer valueOf = (textView == null || (textColors2 = textView.getTextColors()) == null) ? null : java.lang.Integer.valueOf(textColors2.getDefaultColor());
                android.view.View view2 = m1Var2 != null ? m1Var2.f424515b : null;
                android.widget.TextView textView2 = view2 instanceof android.widget.TextView ? (android.widget.TextView) view2 : null;
                if (textView2 != null && (textColors = textView2.getTextColors()) != null) {
                    num = java.lang.Integer.valueOf(textColors.getDefaultColor());
                }
                ofFloat.addUpdateListener(new tl2.v(m1Var2, new android.animation.ArgbEvaluator(), valueOf, num));
                return ofFloat;
            }
        }
        return null;
    }
}
