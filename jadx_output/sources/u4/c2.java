package u4;

/* loaded from: classes13.dex */
public class c2 extends android.animation.AnimatorListenerAdapter implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f424451d;

    /* renamed from: e, reason: collision with root package name */
    public final int f424452e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f424453f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f424454g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f424455h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f424456i = false;

    public c2(android.view.View view, int i17, boolean z17) {
        this.f424451d = view;
        this.f424452e = i17;
        this.f424453f = (android.view.ViewGroup) view.getParent();
        this.f424454g = z17;
        e(true);
    }

    @Override // u4.b1
    public void a(androidx.transition.Transition transition) {
        e(true);
    }

    @Override // u4.b1
    public void b(androidx.transition.Transition transition) {
    }

    @Override // u4.b1
    public void c(androidx.transition.Transition transition) {
        e(false);
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        if (!this.f424456i) {
            u4.w1.d(this.f424451d, this.f424452e);
            android.view.ViewGroup viewGroup = this.f424453f;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        e(false);
        transition.E(this);
    }

    public final void e(boolean z17) {
        android.view.ViewGroup viewGroup;
        if (!this.f424454g || this.f424455h == z17 || (viewGroup = this.f424453f) == null) {
            return;
        }
        this.f424455h = z17;
        u4.s1.a(viewGroup, z17);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f424456i = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (!this.f424456i) {
            u4.w1.d(this.f424451d, this.f424452e);
            android.view.ViewGroup viewGroup = this.f424453f;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        e(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animator) {
        if (this.f424456i) {
            return;
        }
        u4.w1.d(this.f424451d, this.f424452e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animator) {
        if (this.f424456i) {
            return;
        }
        u4.w1.d(this.f424451d, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
