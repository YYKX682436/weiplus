package ww1;

/* loaded from: classes14.dex */
public class r2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f450277d;

    public r2(ww1.b3 b3Var) {
        this.f450277d = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f450277d.f450137i.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
