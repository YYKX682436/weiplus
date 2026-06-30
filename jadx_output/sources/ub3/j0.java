package ub3;

/* loaded from: classes15.dex */
public class j0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426114d;

    public j0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426114d = shuffleView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426114d;
        ub3.t0 t0Var = shuffleView.f145119n;
        if (t0Var != null) {
            ((ub3.e) t0Var).a(valueAnimator, shuffleView.f145122q);
        }
    }
}
