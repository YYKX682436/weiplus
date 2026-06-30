package ub3;

/* loaded from: classes5.dex */
public class g0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426104d;

    public g0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426104d = shuffleView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426104d;
        shuffleView.A = false;
        android.view.View view = shuffleView.f145122q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$12", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$12", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.animation.ValueAnimator valueAnimator = shuffleView.f145115g;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f426104d.A = true;
    }
}
