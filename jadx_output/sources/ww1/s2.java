package ww1;

/* loaded from: classes14.dex */
public class s2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f450280d;

    public s2(ww1.b3 b3Var) {
        this.f450280d = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f450280d.f450129e.setRotation(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
