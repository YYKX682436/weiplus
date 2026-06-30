package tg2;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f419173b = new android.view.animation.PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f419174a;

    public g(android.view.ViewGroup rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f419174a = rootView;
    }

    public static final void a(tg2.g gVar, android.widget.ImageView imageView, long j17, android.animation.ObjectAnimator... objectAnimatorArr) {
        gVar.getClass();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0(2);
        l0Var.b(objectAnimatorArr);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.SCALE_X, 0.0f, 1.0f);
        ofFloat.setDuration(gVar.c(j17, 500L));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.SCALE_Y, 0.0f, 1.0f);
        ofFloat2.setDuration(gVar.c(j17, 500L));
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ROTATION, 0.0f, 20.0f);
        ofFloat3.setStartDelay(0L);
        ofFloat3.setDuration(gVar.c(j17, 500L));
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ROTATION, 20.0f, 45.0f);
        ofFloat4.setStartDelay(gVar.c(j17, 1150L));
        ofFloat4.setDuration(gVar.c(j17, 500L));
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
        ofFloat5.setStartDelay(gVar.c(j17, 1150L));
        ofFloat5.setDuration(gVar.c(j17, 500L));
        l0Var.b(kz5.c0.i(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5).toArray(new android.animation.Animator[0]));
        animatorSet.playTogether((android.animation.Animator[]) l0Var.d(new android.animation.Animator[l0Var.c()]));
        animatorSet.start();
        animatorSet.addListener(new tg2.d(gVar, imageView));
    }

    public final void b(android.widget.ImageView imageView, android.graphics.PointF pointF, yz5.a aVar) {
        imageView.setVisibility(4);
        android.view.ViewParent parent = imageView.getParent();
        android.view.ViewGroup viewGroup = this.f419174a;
        if (!kotlin.jvm.internal.o.b(parent, viewGroup)) {
            viewGroup.addView(imageView, 0);
        }
        imageView.post(new tg2.c(imageView, pointF, aVar));
    }

    public final long c(long j17, long j18) {
        return (j17 * 500) / 1650;
    }

    public final void d(android.widget.ImageView imageView, android.graphics.PointF start, android.graphics.PointF end, long j17) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(end, "end");
        b(imageView, start, new tg2.f(imageView, start, end, this, j17));
    }
}
