package fa;

/* loaded from: classes3.dex */
public class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f260578d;

    public b0(fa.c0 c0Var, android.widget.TextView textView) {
        this.f260578d = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.widget.TextView textView = this.f260578d;
        textView.setScaleX(floatValue);
        textView.setScaleY(floatValue);
    }
}
