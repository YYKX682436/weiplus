package n22;

/* loaded from: classes2.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f334301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f334302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f334303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f334304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f334305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f334306i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f334307m;

    public o(android.graphics.Rect rect, android.graphics.Rect rect2, int i17, int i18, int i19, int i27, yz5.a aVar) {
        this.f334301d = rect;
        this.f334302e = rect2;
        this.f334303f = i17;
        this.f334304g = i18;
        this.f334305h = i19;
        this.f334306i = i27;
        this.f334307m = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.graphics.Rect rect = this.f334302e;
        this.f334301d.set((int) (rect.left + (this.f334303f * floatValue)), (int) (rect.top + (this.f334304g * floatValue)), (int) (rect.right + (this.f334305h * floatValue)), (int) (rect.bottom + (this.f334306i * floatValue)));
        this.f334307m.invoke();
    }
}
