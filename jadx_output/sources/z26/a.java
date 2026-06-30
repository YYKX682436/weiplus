package z26;

/* loaded from: classes15.dex */
public class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me.imid.swipebacklayout.lib.SwipeBackLayout f469827d;

    public a(me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout) {
        this.f469827d = swipeBackLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f469827d.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
