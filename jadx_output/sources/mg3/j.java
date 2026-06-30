package mg3;

/* loaded from: classes10.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public float f326237d;

    /* renamed from: e, reason: collision with root package name */
    public float f326238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer f326239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f326240g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f326241h;

    public j(com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer, android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        this.f326239f = previewGestureContainer;
        this.f326240g = motionEvent;
        this.f326241h = motionEvent2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("transX");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = it.getAnimatedValue("transY");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        float f17 = this.f326237d - floatValue;
        float f18 = this.f326238e - floatValue2;
        int i17 = com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer.E1;
        this.f326239f.Q(this.f326240g, this.f326241h, f17, f18);
        this.f326237d = floatValue;
        this.f326238e = floatValue2;
    }
}
