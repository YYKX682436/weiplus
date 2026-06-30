package d04;

/* loaded from: classes3.dex */
public final class z0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView f225569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f225570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f225571f;

    public z0(com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView, float f17, float f18) {
        this.f225569d = scanInfoMaskView;
        this.f225570e = f17;
        this.f225571f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView = this.f225569d;
        android.view.View view = scanInfoMaskView.f159704h;
        if (view == null) {
            kotlin.jvm.internal.o.o("infoLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showInfoViewWithAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showInfoViewWithAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.TextView textView = scanInfoMaskView.f159706m;
        if (textView == null) {
            kotlin.jvm.internal.o.o("opButton");
            throw null;
        }
        textView.setAlpha(floatValue);
        float f17 = 0;
        float f18 = this.f225570e;
        float f19 = f18 + ((f17 - f18) * floatValue);
        float f27 = this.f225571f;
        float f28 = f27 + ((f17 - f27) * floatValue);
        android.widget.ImageView imageView = scanInfoMaskView.f159705i;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("infoIcon");
            throw null;
        }
        imageView.setTranslationX(f19);
        android.widget.ImageView imageView2 = scanInfoMaskView.f159705i;
        if (imageView2 != null) {
            imageView2.setTranslationY(f28);
        } else {
            kotlin.jvm.internal.o.o("infoIcon");
            throw null;
        }
    }
}
