package kp3;

/* loaded from: classes14.dex */
public final class j0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f311003d;

    public j0(kp3.p0 p0Var) {
        this.f311003d = p0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[setEnterAnimation] on alphaAnim end, start scaleAnim");
        kp3.p0 p0Var = this.f311003d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(p0Var.Q6(), "scaleX", 1.0f, 2.5f);
        android.animation.ObjectAnimator objectAnimator = null;
        if (ofFloat != null) {
            ofFloat.setDuration(500L);
        } else {
            ofFloat = null;
        }
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(p0Var.Q6(), "scaleY", 1.0f, 2.5f);
        if (ofFloat2 != null) {
            ofFloat2.setDuration(500L);
            objectAnimator = ofFloat2;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, objectAnimator);
        animatorSet.addListener(new kp3.i0(p0Var));
        animatorSet.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f311003d.Q6().setVisibility(0);
    }
}
