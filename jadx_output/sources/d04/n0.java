package d04;

/* loaded from: classes2.dex */
public final class n0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f225469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225470e;

    public n0(boolean z17, com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f225469d = z17;
        this.f225470e = scanCodeProductMergeMaskView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        if (this.f225469d) {
            java.lang.Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((java.lang.Float) animatedValue).floatValue();
            java.lang.Object obj = this.f225470e.N1;
            if (obj == null) {
                kotlin.jvm.internal.o.o("scanProductListView");
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            float f17 = 1.0f - floatValue;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onScanProductSuccess$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onScanProductSuccess$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
