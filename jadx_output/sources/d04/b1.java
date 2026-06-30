package d04;

/* loaded from: classes3.dex */
public final class b1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView f225380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f225381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f225382f;

    public b1(com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView, boolean z17, yz5.a aVar) {
        this.f225380d = scanInfoMaskView;
        this.f225381e = z17;
        this.f225382f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationCancel(animation);
        this.f225380d.f159710q = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.ViewPropertyAnimator animate;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView = this.f225380d;
        android.view.View view = scanInfoMaskView.f159701e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = scanInfoMaskView.f159701e;
        if (view2 != null && (animate = view2.animate()) != null) {
            animate.setListener(null);
        }
        scanInfoMaskView.f159710q = false;
        if (this.f225381e) {
            this.f225382f.invoke();
        }
    }
}
