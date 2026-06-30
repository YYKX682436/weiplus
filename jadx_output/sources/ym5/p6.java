package ym5;

/* loaded from: classes2.dex */
public class p6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f463469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f463470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f463471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f463472h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f463473i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463474m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f463475n;

    public p6(android.view.View view, float f17, float f18, float f19, float f27, float f28, android.view.View view2, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f463468d = view;
        this.f463469e = f17;
        this.f463470f = f18;
        this.f463471g = f19;
        this.f463472h = f27;
        this.f463473i = f28;
        this.f463474m = view2;
        this.f463475n = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = 1.0f - floatValue;
        float f18 = (this.f463469e - this.f463470f) * f17;
        android.view.View view = this.f463468d;
        view.setTranslationX(f18);
        view.setTranslationY((this.f463471g - this.f463472h) * f17);
        float f19 = (this.f463473i * f17) + floatValue;
        if (f19 > 0.0f) {
            try {
                view.setScaleX(f19);
                view.setScaleY(f19);
            } catch (java.lang.Throwable unused) {
            }
        }
        android.view.View view2 = this.f463474m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/view/ViewAnimHelper$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/view/ViewAnimHelper$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f463475n;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }
}
