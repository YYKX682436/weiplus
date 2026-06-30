package ml5;

/* loaded from: classes10.dex */
public final class z implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f328461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.CropLayout f328462e;

    public z(android.animation.Animator.AnimatorListener animatorListener, com.tencent.mm.ui.widget.cropview.CropLayout cropLayout) {
        this.f328461d = animatorListener;
        this.f328462e = cropLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f328461d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f328461d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
        ml5.h onChangeListener = this.f328462e.getOnChangeListener();
        ml5.i iVar = onChangeListener instanceof ml5.i ? (ml5.i) onChangeListener : null;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f328461d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f328461d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animation);
        }
    }
}
