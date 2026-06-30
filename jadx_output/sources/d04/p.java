package d04;

/* loaded from: classes13.dex */
public final class p implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225482d;

    public p(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView) {
        this.f225482d = scanCodeMaskView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225482d;
        android.widget.ImageView imageView = scanCodeMaskView.f159690x;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("scanLineImageView");
            throw null;
        }
        imageView.setTranslationY(floatValue);
        float height = scanCodeMaskView.T.height() * scanCodeMaskView.R;
        android.graphics.Rect rect = scanCodeMaskView.T;
        float f17 = floatValue - rect.top;
        if (f17 <= height) {
            float f18 = 1.0f - ((height - f17) / height);
            android.widget.ImageView imageView2 = scanCodeMaskView.f159690x;
            if (imageView2 != null) {
                imageView2.setAlpha(f18);
                return;
            } else {
                kotlin.jvm.internal.o.o("scanLineImageView");
                throw null;
            }
        }
        float f19 = 1;
        if (f17 < rect.height() * (f19 - scanCodeMaskView.R)) {
            android.widget.ImageView imageView3 = scanCodeMaskView.f159690x;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
                return;
            } else {
                kotlin.jvm.internal.o.o("scanLineImageView");
                throw null;
            }
        }
        float height2 = 1.0f - ((f17 - (scanCodeMaskView.T.height() * (f19 - scanCodeMaskView.R))) / height);
        android.widget.ImageView imageView4 = scanCodeMaskView.f159690x;
        if (imageView4 != null) {
            imageView4.setAlpha(height2);
        } else {
            kotlin.jvm.internal.o.o("scanLineImageView");
            throw null;
        }
    }
}
