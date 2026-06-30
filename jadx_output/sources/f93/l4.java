package f93;

/* loaded from: classes11.dex */
public class l4 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public l4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "onAnimationUpdate %s", java.lang.Float.valueOf(((java.lang.Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
    }
}
