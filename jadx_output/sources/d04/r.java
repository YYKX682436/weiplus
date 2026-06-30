package d04;

/* loaded from: classes10.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f225493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225494e;

    public r(android.animation.Animator.AnimatorListener animatorListener, com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView) {
        this.f225493d = animatorListener;
        this.f225494e = scanCodeMaskView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f225494e.Q.cancel();
        android.animation.Animator.AnimatorListener animatorListener = this.f225493d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeMaskView", "onViewDestroy onAnimationEnd");
        this.f225494e.Q.cancel();
        android.animation.Animator.AnimatorListener animatorListener = this.f225493d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f225493d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f225493d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animation);
        }
    }
}
