package d04;

/* loaded from: classes13.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f225503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f225505f;

    public t(boolean z17, com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f225503d = z17;
        this.f225504e = scanCodeMaskView;
        this.f225505f = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        boolean z17 = this.f225503d;
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225504e;
        if (z17) {
            android.view.View myQrCodeButton = scanCodeMaskView.getMyQrCodeButton();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f - floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(myQrCodeButton, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            myQrCodeButton.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(myQrCodeButton, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView.H1;
        android.widget.TextView scanTips = scanCodeMaskView.getScanTips();
        if (scanTips != null) {
            scanTips.setAlpha(1.0f - floatValue);
        }
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f225505f;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(animation);
        }
        int i18 = 0;
        for (java.lang.Object obj : scanCodeMaskView.getSuccessMarkViewList()) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            if (i18 < scanCodeMaskView.N) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(floatValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
            }
            i18 = i19;
        }
        if (scanCodeMaskView.V) {
            android.widget.TextView textView = scanCodeMaskView.B;
            if (textView == null) {
                kotlin.jvm.internal.o.o("multiCodeTips");
                throw null;
            }
            textView.setAlpha(floatValue);
        }
    }
}
