package ub3;

/* loaded from: classes15.dex */
public class h0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426106d;

    public h0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426106d = shuffleView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426106d;
        ((java.util.ArrayList) shuffleView.f145112d).remove(shuffleView.f145121p);
        android.animation.ValueAnimator valueAnimator = shuffleView.f145114f;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        shuffleView.i(shuffleView.f145124s);
        if (shuffleView.f145127v <= 0) {
            shuffleView.f145123r = null;
            shuffleView.f145124s = 0;
        } else {
            int random = (int) (java.lang.Math.random() * shuffleView.f145127v);
            shuffleView.f145124s = random;
            shuffleView.f145123r = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(random);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
