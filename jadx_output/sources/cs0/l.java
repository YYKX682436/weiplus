package cs0;

/* loaded from: classes4.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.camera.view.control.ImproveCameraFocusView f222052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f222053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f222054f;

    public l(com.tencent.mm.media.camera.view.control.ImproveCameraFocusView improveCameraFocusView, float f17, float f18) {
        this.f222052d = improveCameraFocusView;
        this.f222053e = f17;
        this.f222054f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = this.f222053e + (this.f222054f * ((java.lang.Float) animatedValue).floatValue());
        com.tencent.mm.media.camera.view.control.ImproveCameraFocusView improveCameraFocusView = this.f222052d;
        improveCameraFocusView.f68927v = floatValue;
        java.lang.Thread.currentThread().getName();
        improveCameraFocusView.postInvalidate();
    }
}
