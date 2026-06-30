package ml5;

/* loaded from: classes10.dex */
public final class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.CropLayout f328445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f328446e;

    public s(com.tencent.mm.ui.widget.cropview.CropLayout cropLayout, kotlin.jvm.internal.e0 e0Var) {
        this.f328445d = cropLayout;
        this.f328446e = e0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f328446e;
        com.tencent.mm.ui.widget.cropview.CropLayout.k(this.f328445d, floatValue - e0Var.f310115d);
        e0Var.f310115d = floatValue;
    }
}
