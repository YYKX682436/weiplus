package gr2;

/* loaded from: classes2.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView f274771d;

    public h(com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView frameworkCircleAnimView) {
        this.f274771d = frameworkCircleAnimView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView frameworkCircleAnimView = this.f274771d;
        if (frameworkCircleAnimView.f122127r) {
            frameworkCircleAnimView.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
