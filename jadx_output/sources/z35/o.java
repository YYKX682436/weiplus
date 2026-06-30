package z35;

/* loaded from: classes4.dex */
public final class o implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView f470031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f470032e;

    public o(com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView, android.animation.ObjectAnimator objectAnimator) {
        this.f470031d = expandableHeroSeekBarView;
        this.f470032e = objectAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.animation.ObjectAnimator objectAnimator;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f470031d.f191112n;
        do {
            objectAnimator = this.f470032e;
            if (atomicReference.compareAndSet(objectAnimator, null)) {
                return;
            }
        } while (atomicReference.get() == objectAnimator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
