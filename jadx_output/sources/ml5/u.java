package ml5;

/* loaded from: classes10.dex */
public final class u implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml5.j f328450d;

    public u(ml5.j jVar) {
        this.f328450d = jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("CropLayout", "onAnimationEnd!!");
        ml5.j jVar = this.f328450d;
        if (jVar != null) {
            com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = ((al5.e4) jVar).f5885a;
            touchMediaPreviewLayout.setInScaleAnimation(false);
            touchMediaPreviewLayout.f211461h = true;
            touchMediaPreviewLayout.f211464n = false;
            al5.z3 doubleTapListener = touchMediaPreviewLayout.getDoubleTapListener();
            if (doubleTapListener != null) {
                doubleTapListener.a();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ml5.j jVar = this.f328450d;
        if (jVar != null) {
            ((al5.e4) jVar).f5885a.setInScaleAnimation(true);
        }
    }
}
