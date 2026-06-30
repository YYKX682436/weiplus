package d04;

/* loaded from: classes8.dex */
public final class m2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView f225464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f225465e;

    public m2(com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView scanProductDetectRectView, float f17) {
        this.f225464d = scanProductDetectRectView;
        this.f225465e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView scanProductDetectRectView = this.f225464d;
        if (animatedFraction <= 0.3f) {
            scanProductDetectRectView.setAlpha(animatedFraction / 0.3f);
            scanProductDetectRectView.setScaleX(1.0f);
            scanProductDetectRectView.setScaleY(1.0f);
        } else {
            float f17 = this.f225465e;
            if (animatedFraction <= 0.5f) {
                float f18 = 1 + (((animatedFraction - 0.3f) / 0.2f) * f17);
                scanProductDetectRectView.setAlpha(1.0f);
                scanProductDetectRectView.setScaleX(f18);
                scanProductDetectRectView.setScaleY(f18);
            } else if (animatedFraction <= 0.7f) {
                float f19 = 1 + (((0.7f - animatedFraction) / 0.2f) * f17);
                scanProductDetectRectView.setAlpha(1.0f);
                scanProductDetectRectView.setScaleX(f19);
                scanProductDetectRectView.setScaleY(f19);
            } else {
                scanProductDetectRectView.setAlpha(1.0f);
                scanProductDetectRectView.setScaleX(1.0f);
                scanProductDetectRectView.setScaleY(1.0f);
            }
        }
        scanProductDetectRectView.getAlpha();
        scanProductDetectRectView.getScaleY();
    }
}
