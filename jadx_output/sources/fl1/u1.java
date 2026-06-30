package fl1;

/* loaded from: classes14.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f263875a;

    /* renamed from: b, reason: collision with root package name */
    public int f263876b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.ValueAnimator f263877c;

    public u1(android.view.View view) {
        this.f263875a = view;
    }

    public void a(int i17, java.lang.Runnable runnable) {
        android.view.View view = this.f263875a;
        if (view == null) {
            return;
        }
        android.animation.ValueAnimator valueAnimator = this.f263877c;
        if ((valueAnimator != null && valueAnimator.isRunning()) && this.f263876b == i17) {
            return;
        }
        this.f263876b = i17;
        if ((view.getBackground() instanceof android.graphics.drawable.ColorDrawable) && ((android.graphics.drawable.ColorDrawable) view.getBackground()).getColor() == i17) {
            if (runnable != null) {
                runnable.run();
            }
            android.animation.ValueAnimator valueAnimator2 = this.f263877c;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                return;
            }
            return;
        }
        fl1.s1 s1Var = new fl1.s1(this, runnable);
        android.animation.ValueAnimator valueAnimator3 = this.f263877c;
        if (valueAnimator3 != null && valueAnimator3.isStarted() && this.f263877c.isRunning() && this.f263876b == i17) {
            this.f263877c.addListener(s1Var);
            return;
        }
        android.animation.ValueAnimator valueAnimator4 = this.f263877c;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(view.getBackground() instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) view.getBackground()).getColor() : 0), java.lang.Integer.valueOf(this.f263876b));
        this.f263877c = ofObject;
        ofObject.addListener(s1Var);
        this.f263877c.addUpdateListener(new fl1.t1(this));
        this.f263877c.start();
    }
}
