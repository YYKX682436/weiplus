package ub3;

/* loaded from: classes15.dex */
public class e0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426099d;

    public e0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426099d = shuffleView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426099d;
        shuffleView.A = false;
        shuffleView.f145125t = null;
        shuffleView.f145126u = -1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f426099d.A = true;
    }
}
