package ep1;

/* loaded from: classes14.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f255602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep1.k f255603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f255605g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pv.y f255606h;

    public b(boolean z17, ep1.k kVar, int i17, android.animation.AnimatorListenerAdapter animatorListenerAdapter, pv.y yVar) {
        this.f255602d = z17;
        this.f255603e = kVar;
        this.f255604f = i17;
        this.f255605g = animatorListenerAdapter;
        this.f255606h = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        gp1.v h17;
        gp1.v h18;
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean z17 = this.f255602d;
        ep1.k kVar = this.f255603e;
        if (!z17 && (h18 = kVar.h()) != null) {
            h18.j0(false);
        }
        if (this.f255604f != 1 && (h17 = kVar.h()) != null) {
            h17.W(1.0f);
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255605g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        gp1.v h17;
        gp1.v h18;
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean z17 = this.f255602d;
        ep1.k kVar = this.f255603e;
        if (!z17 && (h18 = kVar.h()) != null) {
            h18.j0(false);
        }
        if (this.f255604f != 1 && (h17 = kVar.h()) != null) {
            h17.W(1.0f);
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255605g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255605g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255605g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255605g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        gp1.v h17;
        gp1.v h18;
        kotlin.jvm.internal.o.g(animation, "animation");
        ep1.k kVar = this.f255603e;
        boolean z17 = this.f255602d;
        if (!z17) {
            int i17 = this.f255604f;
            pv.y yVar = this.f255606h;
            if (i17 != 1) {
                gp1.v h19 = kVar.h();
                if (h19 != null) {
                    h19.q(true);
                }
                gp1.v h27 = kVar.h();
                if (h27 != null) {
                    h27.W(0.0f);
                }
                if (yVar.f358515l && (h18 = kVar.h()) != null) {
                    h18.I(true);
                }
            } else if (yVar.f358515l) {
                gp1.v h28 = kVar.h();
                if (h28 != null) {
                    h28.I(false);
                }
            } else {
                gp1.v h29 = kVar.h();
                if (h29 != null) {
                    h29.W(1.0f);
                }
                gp1.v h37 = kVar.h();
                if (h37 != null) {
                    h37.q(false);
                }
            }
        }
        if (!z17 && (h17 = kVar.h()) != null) {
            h17.j0(true);
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255605g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animation);
        }
    }
}
