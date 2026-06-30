package d04;

/* loaded from: classes5.dex */
public final class h0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f225424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f225425f;

    public h0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, boolean z17, boolean z18) {
        this.f225423d = scanCodeProductMergeMaskView;
        this.f225424e = z17;
        this.f225425f = z18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225423d;
        android.view.View view = scanCodeProductMergeMaskView.I1;
        if (view == null) {
            kotlin.jvm.internal.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.5f - (floatValue * 0.5f)));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$animateHideBlurView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$animateHideBlurView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (this.f225424e) {
            android.widget.ImageView imageView = scanCodeProductMergeMaskView.K1;
            if (imageView == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                throw null;
            }
            imageView.setAlpha(1.0f - floatValue);
        }
        if (this.f225425f) {
            android.widget.ImageView imageView2 = scanCodeProductMergeMaskView.J1;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("bottomBlurView");
                throw null;
            }
            imageView2.setAlpha(1.0f - floatValue);
        }
        android.view.View view2 = scanCodeProductMergeMaskView.I1;
        if (view2 != null) {
            view2.getAlpha();
        } else {
            kotlin.jvm.internal.o.o("maskView");
            throw null;
        }
    }
}
