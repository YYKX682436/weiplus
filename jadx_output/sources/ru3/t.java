package ru3;

/* loaded from: classes3.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout f399772d;

    public t(com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout) {
        this.f399772d = wxCropOperationLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout = this.f399772d;
        wxCropOperationLayout.setBgColor(intValue);
        wxCropOperationLayout.invalidate();
    }
}
