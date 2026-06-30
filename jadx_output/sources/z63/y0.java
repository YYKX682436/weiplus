package z63;

/* loaded from: classes5.dex */
public class y0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.z0 f470451d;

    public y0(z63.z0 z0Var) {
        this.f470451d = z0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        z63.f1 f1Var = this.f470451d.f470453d.f470365d;
        f1Var.f470384e.update(f1Var.f470393n, intValue, -1, -1);
    }
}
