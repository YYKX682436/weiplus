package ml5;

/* loaded from: classes10.dex */
public final class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.CropLayout f328452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f328453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f328454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f328455g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f328456h;

    public w(com.tencent.mm.ui.widget.cropview.CropLayout cropLayout, boolean z17, boolean z18, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2) {
        this.f328452d = cropLayout;
        this.f328453e = z17;
        this.f328454f = z18;
        this.f328455g = e0Var;
        this.f328456h = e0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f328452d;
        ml5.k scaleType = cropLayout.getScaleType();
        ml5.k kVar = ml5.k.f328431e;
        boolean z17 = this.f328454f;
        boolean z18 = this.f328453e;
        if ((scaleType == kVar && !z18 && !z17) || (cropLayout.getScaleType() == ml5.k.f328430d && (!z18 || !z17))) {
            java.lang.Object animatedValue = it.getAnimatedValue("scale");
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            cropLayout.L((((java.lang.Float) animatedValue).floatValue() * 1.0f) / cropLayout.getContentViewScale()[0], cropLayout.getContentRectF().centerX(), cropLayout.getContentRectF().centerY());
        }
        java.lang.Object animatedValue2 = it.getAnimatedValue("transX");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue2).floatValue();
        java.lang.Object animatedValue3 = it.getAnimatedValue("transY");
        kotlin.jvm.internal.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue3).floatValue();
        java.lang.Object animatedValue4 = it.getAnimatedValue("edgeX");
        kotlin.jvm.internal.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((java.lang.Float) animatedValue4).floatValue();
        java.lang.Object animatedValue5 = it.getAnimatedValue("edgeY");
        kotlin.jvm.internal.o.e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
        float floatValue4 = ((java.lang.Float) animatedValue5).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f328455g;
        float f17 = floatValue3 - e0Var.f310115d;
        kotlin.jvm.internal.e0 e0Var2 = this.f328456h;
        float f18 = floatValue4 - e0Var2.f310115d;
        cropLayout.M(z17 ? -f17 : -(floatValue - cropLayout.getContentRectF().centerX()), z18 ? -f18 : -(floatValue2 - cropLayout.getContentRectF().centerY()));
        e0Var.f310115d = floatValue3;
        e0Var2.f310115d = floatValue4;
    }
}
