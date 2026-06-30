package ub3;

/* loaded from: classes15.dex */
public class n0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426124d;

    public n0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426124d = shuffleView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426124d;
        if (floatValue == 0.0f) {
            shuffleView.f145130y.clear();
            shuffleView.f145131z.clear();
            for (int i17 = 0; i17 < shuffleView.f145127v; i17++) {
                shuffleView.f145130y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17)).getTranslationX()));
                shuffleView.f145131z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17)).getTranslationY()));
            }
            return;
        }
        android.view.View view = shuffleView.f145123r;
        if (view != null) {
            view.setTranslationY((((java.lang.Float) shuffleView.f145131z.get(0)).floatValue() * (1.0f - floatValue)) - ((shuffleView.f145123r.getHeight() * floatValue) / 7.0f));
        }
        for (int i18 = 1; i18 < shuffleView.f145127v; i18++) {
            java.util.List list = shuffleView.f145112d;
            if (list != null && ((java.util.ArrayList) list).get(i18) != null) {
                float f17 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).setTranslationX((((java.lang.Float) shuffleView.f145130y.get(i18)).floatValue() * f17) + (shuffleView.g(i18) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i18)).floatValue() * f17) + (shuffleView.h(i18) * floatValue));
            }
        }
    }
}
