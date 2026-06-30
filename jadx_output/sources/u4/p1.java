package u4;

/* loaded from: classes13.dex */
public abstract class p1 {
    public static android.animation.Animator a(android.view.View view, u4.m1 m1Var, int i17, int i18, float f17, float f18, float f19, float f27, android.animation.TimeInterpolator timeInterpolator) {
        float f28;
        float f29;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) m1Var.f424515b.getTag(com.tencent.mm.R.id.oj7)) != null) {
            f28 = (r4[0] - i17) + translationX;
            f29 = (r4[1] - i18) + translationY;
        } else {
            f28 = f17;
            f29 = f18;
        }
        int round = i17 + java.lang.Math.round(f28 - translationX);
        int round2 = i18 + java.lang.Math.round(f29 - translationY);
        view.setTranslationX(f28);
        view.setTranslationY(f29);
        if (f28 == f19 && f29 == f27) {
            return null;
        }
        android.animation.ObjectAnimator ofPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_X, f28, f19), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, f29, f27));
        u4.o1 o1Var = new u4.o1(view, m1Var.f424515b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(o1Var);
        ofPropertyValuesHolder.addPauseListener(o1Var);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
