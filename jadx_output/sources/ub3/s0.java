package ub3;

/* loaded from: classes15.dex */
public class s0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426137d;

    public s0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426137d = shuffleView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i17 = 0;
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426137d;
        if (floatValue == 0.0f) {
            shuffleView.f145130y.clear();
            shuffleView.f145131z.clear();
            while (i17 < shuffleView.f145127v) {
                shuffleView.f145130y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17)).getTranslationX()));
                shuffleView.f145131z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17)).getTranslationY()));
                i17++;
            }
            return;
        }
        while (i17 < shuffleView.f145127v) {
            android.view.View view = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17);
            if (i17 < shuffleView.f145130y.size()) {
                ub3.v0 v0Var = shuffleView.f145113e;
                int i18 = v0Var.f426141a;
                if (i18 == 1) {
                    v0Var.getClass();
                    float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                    shuffleView.f145113e.getClass();
                    view.setScaleX((1.0f - ((i17 + 1) * 0.01f)) + (floatValue2 * 0.01f));
                    view.setTranslationY((shuffleView.h(i17) * floatValue) + ((1.0f - floatValue) * ((java.lang.Float) shuffleView.f145131z.get(i17)).floatValue()));
                } else if (i18 == 2) {
                    view.setScaleY((1.0f - (v0Var.f426144d * (i17 + 1))) + (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * shuffleView.f145113e.f426144d));
                    view.setTranslationX((shuffleView.g(i17) * floatValue) + ((1.0f - floatValue) * ((java.lang.Float) shuffleView.f145130y.get(i17)).floatValue()));
                }
            }
            i17++;
        }
    }
}
