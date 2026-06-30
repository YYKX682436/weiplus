package ub3;

/* loaded from: classes15.dex */
public class p0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426130f;

    public p0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView, int i17, int i18) {
        this.f426130f = shuffleView;
        this.f426128d = i17;
        this.f426129e = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float touchScaleTranslationX;
        float touchScaleTranslationX2;
        int i17;
        float touchScaleTranslationX3;
        float touchScaleTranslationX4;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i18 = 0;
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426130f;
        if (floatValue == 0.0f) {
            shuffleView.f145130y.clear();
            shuffleView.f145131z.clear();
            while (i18 < shuffleView.f145127v) {
                shuffleView.f145130y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).getTranslationX()));
                shuffleView.f145131z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).getTranslationY()));
                i18++;
            }
            return;
        }
        int i19 = this.f426128d;
        if (i19 > 0) {
            while (true) {
                i17 = shuffleView.f145126u;
                if (i18 >= i17 - 1) {
                    break;
                }
                android.view.View view = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18);
                float f17 = 1.0f - floatValue;
                float floatValue2 = ((java.lang.Float) shuffleView.f145130y.get(i18)).floatValue() * f17;
                float g17 = shuffleView.g(i18);
                int i27 = i18 + 1;
                touchScaleTranslationX4 = shuffleView.getTouchScaleTranslationX();
                view.setTranslationX(floatValue2 + ((g17 - (i27 * touchScaleTranslationX4)) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i18)).floatValue() * f17) + (shuffleView.h(i18) * floatValue));
                i18 = i27;
            }
            android.view.View view2 = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17 - 1);
            float floatValue3 = ((java.lang.Float) shuffleView.f145130y.get(shuffleView.f145126u - 1)).floatValue() * (1.0f - floatValue);
            float g18 = shuffleView.g(shuffleView.f145126u - 1);
            touchScaleTranslationX3 = shuffleView.getTouchScaleTranslationX();
            view2.setTranslationX(floatValue3 + ((g18 - ((touchScaleTranslationX3 * i19) / 2.0f)) * floatValue));
        } else {
            while (i18 < shuffleView.f145126u) {
                float f18 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).setTranslationX((((java.lang.Float) shuffleView.f145130y.get(i18)).floatValue() * f18) + (shuffleView.g(i18) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i18)).floatValue() * f18) + (shuffleView.h(i18) * floatValue));
                i18++;
            }
        }
        int i28 = this.f426129e;
        if (i28 <= 0) {
            for (int i29 = shuffleView.f145126u; i29 < shuffleView.f145127v; i29++) {
                float f19 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i29)).setTranslationX((((java.lang.Float) shuffleView.f145130y.get(i29)).floatValue() * f19) + (shuffleView.g(i29) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i29)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i29)).floatValue() * f19) + (shuffleView.h(i29) * floatValue));
            }
            return;
        }
        android.view.View view3 = shuffleView.f145125t;
        float f27 = 1.0f - floatValue;
        float floatValue4 = ((java.lang.Float) shuffleView.f145130y.get(shuffleView.f145126u)).floatValue() * f27;
        float g19 = shuffleView.g(shuffleView.f145126u);
        touchScaleTranslationX = shuffleView.getTouchScaleTranslationX();
        view3.setTranslationX(floatValue4 + ((g19 + ((touchScaleTranslationX * i28) / 2.0f)) * floatValue));
        shuffleView.f145125t.setTranslationY((((java.lang.Float) shuffleView.f145131z.get(shuffleView.f145126u)).floatValue() * f27) + (shuffleView.h(shuffleView.f145126u) * floatValue));
        int i37 = shuffleView.f145126u;
        while (true) {
            i37++;
            if (i37 >= shuffleView.f145127v) {
                return;
            }
            android.view.View view4 = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i37);
            float floatValue5 = ((java.lang.Float) shuffleView.f145130y.get(i37)).floatValue() * f27;
            float g27 = shuffleView.g(i37);
            float f28 = shuffleView.f145127v - i37;
            touchScaleTranslationX2 = shuffleView.getTouchScaleTranslationX();
            view4.setTranslationX(floatValue5 + ((g27 + (f28 * touchScaleTranslationX2)) * floatValue));
            ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i37)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i37)).floatValue() * f27) + (shuffleView.h(i37) * floatValue));
        }
    }
}
