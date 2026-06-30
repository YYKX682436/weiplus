package ml5;

/* loaded from: classes10.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.CropLayout f328447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f328448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f328449f;

    public t(com.tencent.mm.ui.widget.cropview.CropLayout cropLayout, float f17, float f18) {
        this.f328447d = cropLayout;
        this.f328448e = f17;
        this.f328449f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("scale");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f328447d;
        cropLayout.B(floatValue / cropLayout.getContentViewScale()[0], this.f328448e, this.f328449f);
    }
}
