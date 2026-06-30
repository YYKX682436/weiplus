package ml5;

/* loaded from: classes10.dex */
public final class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.CropLayout f328412d;

    public b0(com.tencent.mm.ui.widget.cropview.CropLayout cropLayout) {
        this.f328412d = cropLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("scale");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = it.getAnimatedValue("transX");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        java.lang.Object animatedValue3 = it.getAnimatedValue("transY");
        kotlin.jvm.internal.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((java.lang.Float) animatedValue3).floatValue();
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f328412d;
        cropLayout.getMatrixValues();
        float f17 = (floatValue * 1.0f) / cropLayout.getContentViewScale()[0];
        cropLayout.mainMatrix.postScale(f17, f17, 0.0f, 0.0f);
        cropLayout.y();
        float centerX = floatValue2 - cropLayout.getContentRectF().centerX();
        float centerY = floatValue3 - cropLayout.getContentRectF().centerY();
        if (!cropLayout.getOnlyNotifyCallbackWhenUserTouch()) {
            cropLayout.M(-centerX, -centerY);
            return;
        }
        cropLayout.mainMatrix.postTranslate(-(-centerX), -(-centerY));
        cropLayout.y();
    }
}
