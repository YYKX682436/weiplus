package d04;

/* loaded from: classes3.dex */
public final class c1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView f225389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f225390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f225391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f225392g;

    public c1(com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView, boolean z17, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2) {
        this.f225389d = scanInfoMaskView;
        this.f225390e = z17;
        this.f225391f = e0Var;
        this.f225392g = e0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView = this.f225389d;
        android.view.View view = scanInfoMaskView.f159702f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = scanInfoMaskView.f159701e;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f225390e) {
            scanInfoMaskView.f159710q = true;
            float f17 = this.f225391f.f310115d;
            float f18 = 0;
            float f19 = f17 + ((f18 - f17) * floatValue);
            float f27 = this.f225392g.f310115d;
            float f28 = f27 + ((f18 - f27) * floatValue);
            android.view.View view3 = scanInfoMaskView.f159703g;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("loadingIcon");
                throw null;
            }
            view3.setTranslationX(f19);
            android.view.View view4 = scanInfoMaskView.f159703g;
            if (view4 != null) {
                view4.setTranslationY(f28);
            } else {
                kotlin.jvm.internal.o.o("loadingIcon");
                throw null;
            }
        }
    }
}
