package ub3;

/* loaded from: classes15.dex */
public class m0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426122f;

    public m0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView, int i17, int i18) {
        this.f426122f = shuffleView;
        this.f426120d = i17;
        this.f426121e = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float selectScaleTranslationX;
        float selectScaleTranslationX2;
        int i17;
        float selectScaleTranslationX3;
        float selectScaleTranslationX4;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i18 = 0;
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426122f;
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
        int i19 = this.f426120d;
        if (i19 > 0) {
            while (true) {
                i17 = shuffleView.f145124s;
                if (i18 >= i17 - 1) {
                    break;
                }
                android.view.View view = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18);
                float f17 = 1.0f - floatValue;
                float floatValue2 = ((java.lang.Float) shuffleView.f145130y.get(i18)).floatValue() * f17;
                float g17 = shuffleView.g(i18);
                int i27 = i18 + 1;
                selectScaleTranslationX4 = shuffleView.getSelectScaleTranslationX();
                view.setTranslationX(floatValue2 + ((g17 - (i27 * selectScaleTranslationX4)) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i18)).floatValue() * f17) + (shuffleView.h(i18) * floatValue));
                i18 = i27;
            }
            android.view.View view2 = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17 - 1);
            float floatValue3 = ((java.lang.Float) shuffleView.f145130y.get(shuffleView.f145124s - 1)).floatValue();
            float f18 = 1.0f - floatValue;
            float g18 = shuffleView.g(shuffleView.f145124s - 1);
            selectScaleTranslationX3 = shuffleView.getSelectScaleTranslationX();
            view2.setTranslationX((floatValue3 * f18) + ((g18 - ((selectScaleTranslationX3 * i19) / 2.0f)) * floatValue));
            ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(shuffleView.f145124s - 1)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(shuffleView.f145124s - 1)).floatValue() * f18) + (shuffleView.h(shuffleView.f145124s - 1) * floatValue));
        } else {
            while (i18 < shuffleView.f145124s) {
                float f19 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).setTranslationX((((java.lang.Float) shuffleView.f145130y.get(i18)).floatValue() * f19) + (shuffleView.g(i18) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i18)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i18)).floatValue() * f19) + (shuffleView.h(i18) * floatValue));
                i18++;
            }
        }
        int i28 = this.f426121e;
        if (i28 > 0) {
            android.view.View view3 = shuffleView.f145123r;
            float floatValue4 = ((java.lang.Float) shuffleView.f145130y.get(shuffleView.f145124s)).floatValue();
            float f27 = 1.0f - floatValue;
            float g19 = shuffleView.g(shuffleView.f145124s);
            selectScaleTranslationX = shuffleView.getSelectScaleTranslationX();
            view3.setTranslationX((floatValue4 * f27) + ((g19 + ((selectScaleTranslationX * i28) / 2.0f)) * floatValue));
            int i29 = shuffleView.f145124s;
            while (true) {
                i29++;
                if (i29 >= shuffleView.f145127v) {
                    break;
                }
                android.view.View view4 = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i29);
                float floatValue5 = ((java.lang.Float) shuffleView.f145130y.get(i29)).floatValue() * f27;
                float g27 = shuffleView.g(i29);
                float f28 = shuffleView.f145127v - i29;
                selectScaleTranslationX2 = shuffleView.getSelectScaleTranslationX();
                view4.setTranslationX(floatValue5 + ((g27 + (f28 * selectScaleTranslationX2)) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i29)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i29)).floatValue() * f27) + (shuffleView.h(i29) * floatValue));
            }
        } else {
            for (int i37 = shuffleView.f145124s; i37 < shuffleView.f145127v; i37++) {
                float f29 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i37)).setTranslationX((((java.lang.Float) shuffleView.f145130y.get(i37)).floatValue() * f29) + (shuffleView.g(i37) * floatValue));
                ((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i37)).setTranslationY((((java.lang.Float) shuffleView.f145131z.get(i37)).floatValue() * f29) + (shuffleView.h(i37) * floatValue));
            }
        }
        shuffleView.f145123r.setTranslationY(((1.0f - floatValue) * ((java.lang.Float) shuffleView.f145131z.get(shuffleView.f145124s)).floatValue()) - ((floatValue * shuffleView.f145123r.getHeight()) / 7.0f));
    }
}
