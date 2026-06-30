package xt2;

/* loaded from: classes10.dex */
public final class s1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.u1 f457003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f457004e;

    public s1(xt2.u1 u1Var, v65.n nVar) {
        this.f457003d = u1Var;
        this.f457004e = nVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View childAt;
        xt2.u1 u1Var = this.f457003d;
        android.view.ViewGroup viewGroup = u1Var.f457045i;
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            android.view.ViewGroup viewGroup2 = u1Var.f457045i;
            if (viewGroup2 != null) {
                viewGroup2.removeView(childAt);
            }
            android.view.ViewGroup viewGroup3 = u1Var.f457045i;
            if (viewGroup3 != null) {
                viewGroup3.addView(childAt);
            }
        }
        android.widget.ScrollView scrollView = u1Var.f457041e;
        if (scrollView != null) {
            scrollView.setScrollY(0);
        }
        this.f457004e.a(jz5.f0.f302826a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
