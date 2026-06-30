package ub3;

/* loaded from: classes15.dex */
public class f0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426102e;

    public f0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView, int i17) {
        this.f426102e = shuffleView;
        this.f426101d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i17 = this.f426101d;
        while (true) {
            com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426102e;
            if (i17 >= shuffleView.f145127v - 1) {
                return;
            }
            android.view.View view = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17);
            ub3.v0 v0Var = shuffleView.f145113e;
            int i18 = v0Var.f426141a;
            if (i18 == 1) {
                v0Var.getClass();
                int i19 = i17 + 1;
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                shuffleView.f145113e.getClass();
                view.setScaleX((1.0f - (i19 * 0.01f)) + (floatValue * 0.01f));
                int i27 = shuffleView.f145113e.f426142b;
                if (i27 == 2) {
                    view.setTranslationY(shuffleView.h(i19) - (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * shuffleView.f145129x));
                } else if (i27 == 1) {
                    view.setTranslationY(shuffleView.h(i19) + (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * shuffleView.f145129x));
                }
            } else if (i18 == 2) {
                float f17 = v0Var.f426144d;
                int i28 = i17 + 1;
                view.setScaleY((1.0f - (f17 * i28)) + (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * shuffleView.f145113e.f426144d));
                int i29 = shuffleView.f145113e.f426142b;
                if (i29 == 3) {
                    view.setTranslationX(shuffleView.g(i28) + (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * shuffleView.f145128w));
                } else if (i29 == 4) {
                    view.setTranslationX(shuffleView.g(i28) - (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * shuffleView.f145128w));
                }
            }
            i17++;
        }
    }
}
