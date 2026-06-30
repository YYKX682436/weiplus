package yv4;

/* loaded from: classes4.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv4.k f466209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f466210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f466211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f466212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f466213h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f466214i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f466215m;

    public a(yv4.k kVar, android.graphics.RectF rectF, android.graphics.RectF rectF2, float f17, float f18, float f19, kotlin.jvm.internal.e0 e0Var) {
        this.f466209d = kVar;
        this.f466210e = rectF;
        this.f466211f = rectF2;
        this.f466212g = f17;
        this.f466213h = f18;
        this.f466214i = f19;
        this.f466215m = e0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        yv4.k kVar = this.f466209d;
        com.tencent.mm.ui.base.WxImageView U6 = kVar.U6();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f18 = this.f466213h;
        float f19 = this.f466212g;
        float f27 = f19 + ((f18 - f19) * floatValue);
        float f28 = this.f466215m.f310115d;
        float f29 = this.f466214i;
        matrix.setScale(f27, f27);
        matrix.postTranslate(0.0f, f29 + ((f28 - f29) * floatValue));
        U6.setImageViewMatrix(matrix);
        android.graphics.RectF rect = this.f466211f;
        android.graphics.RectF rectF = this.f466210e;
        if (rectF != null) {
            float f37 = rectF.left;
            float f38 = f37 + ((rect.left - f37) * floatValue);
            float f39 = rectF.top;
            float f47 = f39 + ((rect.top - f39) * floatValue);
            float f48 = rectF.right;
            float f49 = f48 + ((rect.right - f48) * floatValue);
            float f57 = rectF.bottom;
            rect = new android.graphics.RectF(f38, f47, f49, f57 + ((rect.bottom - f57) * floatValue));
        }
        com.tencent.mm.plugin.websearch.view.CircleToSearchCropperView circleToSearchCropperView = (com.tencent.mm.plugin.websearch.view.CircleToSearchCropperView) ((jz5.n) kVar.f466231g).getValue();
        circleToSearchCropperView.getClass();
        kotlin.jvm.internal.o.g(rect, "rect");
        circleToSearchCropperView.f181689g = rect;
        circleToSearchCropperView.postInvalidate();
    }
}
