package fl1;

/* loaded from: classes4.dex */
public class r0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f263850d;

    public r0(fl1.c1 c1Var, android.widget.ImageView imageView) {
        this.f263850d = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.widget.ImageView imageView = this.f263850d;
        imageView.setScaleX(floatValue);
        imageView.setScaleY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
