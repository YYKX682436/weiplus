package ww1;

/* loaded from: classes14.dex */
public class o2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f450263d;

    public o2(ww1.b3 b3Var) {
        this.f450263d = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        ww1.b3 b3Var = this.f450263d;
        android.view.ViewGroup.LayoutParams layoutParams = b3Var.f450137i.getLayoutParams();
        layoutParams.height = (int) floatValue;
        b3Var.f450137i.setLayoutParams(layoutParams);
    }
}
