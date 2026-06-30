package vv4;

/* loaded from: classes3.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f440475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440476e;

    public l(android.widget.ImageView imageView, com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        this.f440475d = imageView;
        this.f440476e = mMFTSImageRecognitionUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.widget.ImageView imageView = this.f440475d;
        if (floatValue <= 0.1f) {
            imageView.setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            imageView.setAlpha((1.0f - floatValue) * 10);
        }
        imageView.setTranslationY(floatValue * (((java.lang.Number) ((jz5.n) this.f440476e.f181634f).getValue()).intValue() - imageView.getHeight()));
    }
}
