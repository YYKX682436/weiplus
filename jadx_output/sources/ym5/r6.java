package ym5;

/* loaded from: classes2.dex */
public class r6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f463501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f463502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f463503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f463504h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f463505i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f463506m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f463507n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f463508o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f463509p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463510q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f463511r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f463512s;

    public r6(android.view.View view, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, android.view.View view2, float f47, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f463500d = view;
        this.f463501e = f17;
        this.f463502f = f18;
        this.f463503g = f19;
        this.f463504h = f27;
        this.f463505i = f28;
        this.f463506m = f29;
        this.f463507n = f37;
        this.f463508o = f38;
        this.f463509p = f39;
        this.f463510q = view2;
        this.f463511r = f47;
        this.f463512s = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f463501e + ((this.f463502f - this.f463503g) * floatValue);
        android.view.View view = this.f463500d;
        view.setTranslationX(f17);
        view.setTranslationY(this.f463504h + ((this.f463505i - this.f463506m) * floatValue));
        float f18 = this.f463508o;
        float f19 = this.f463507n;
        view.setScaleX(f19 + (((f18 * f19) - f19) * floatValue));
        float f27 = this.f463509p;
        view.setScaleY(f27 + (((f18 * f27) - f27) * floatValue));
        android.view.View view2 = this.f463510q;
        float f28 = (1.0f - floatValue) * this.f463511r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f28));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/view/ViewAnimHelper$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/view/ViewAnimHelper$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f463512s;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }
}
