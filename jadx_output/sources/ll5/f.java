package ll5;

/* loaded from: classes2.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f319280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f319281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f319282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f319283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f319284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f319285i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f319286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f319287n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f319288o;

    public f(int i17, int i18, android.view.View view, android.view.View view2, boolean z17, boolean z18, kotlin.jvm.internal.f0 f0Var, android.widget.LinearLayout linearLayout, kotlin.jvm.internal.f0 f0Var2) {
        this.f319280d = i17;
        this.f319281e = i18;
        this.f319282f = view;
        this.f319283g = view2;
        this.f319284h = z17;
        this.f319285i = z18;
        this.f319286m = f0Var;
        this.f319287n = linearLayout;
        this.f319288o = f0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        float e17;
        float f17;
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = this.f319280d;
        int i18 = this.f319281e;
        if (i17 > i18) {
            f17 = e06.p.e(2 * floatValue, 0.0f, 1.0f);
            e17 = floatValue;
        } else {
            e17 = e06.p.e(2 * floatValue, 0.0f, 1.0f);
            f17 = floatValue;
        }
        int i19 = (int) (i17 * e17);
        android.view.View view = this.f319282f;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i19 <= 0) {
            i19 = 0;
        }
        layoutParams.height = i19;
        android.view.View view2 = this.f319282f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(e17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f18 = 1.0f - f17;
        int i27 = (int) (i18 * f18);
        android.view.View view3 = this.f319283g;
        android.view.ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        if (i27 <= 0) {
            i27 = 0;
        }
        layoutParams2.height = i27;
        android.view.View view4 = this.f319283g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.requestLayout();
        view3.requestLayout();
        if (this.f319284h) {
            boolean z17 = this.f319285i;
            android.widget.LinearLayout linearLayout = this.f319287n;
            if (z17) {
                int i28 = (int) (this.f319286m.f310116d * floatValue);
                linearLayout.getLayoutParams().height = i28 > 0 ? i28 : 0;
                linearLayout.setAlpha(floatValue);
            } else {
                float f19 = 1.0f - floatValue;
                int i29 = (int) (this.f319288o.f310116d * f19);
                linearLayout.getLayoutParams().height = i29 > 0 ? i29 : 0;
                linearLayout.setAlpha(f19);
            }
            linearLayout.requestLayout();
        }
    }
}
