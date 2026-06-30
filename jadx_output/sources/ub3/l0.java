package ub3;

/* loaded from: classes15.dex */
public class l0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426118d;

    public l0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426118d = shuffleView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i17 = 0;
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426118d;
        if (floatValue != 0.0f) {
            while (i17 < shuffleView.f145127v) {
                float f17 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17)).setTranslationX((((java.lang.Float) shuffleView.f145130y.get(i17)).floatValue() * f17) + (shuffleView.g(i17) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i17)).floatValue() * f17) + (shuffleView.h(i17) * floatValue));
                i17++;
            }
            return;
        }
        shuffleView.f145130y.clear();
        shuffleView.f145131z.clear();
        while (i17 < shuffleView.f145127v) {
            shuffleView.f145130y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17)).getTranslationX()));
            shuffleView.f145131z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17)).getTranslationY()));
            i17++;
        }
    }
}
