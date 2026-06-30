package fl1;

/* loaded from: classes14.dex */
public class t1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.u1 f263870d;

    public t1(fl1.u1 u1Var) {
        this.f263870d = u1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.view.View view = this.f263870d.f263875a;
        if (view != null) {
            view.setBackgroundColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
