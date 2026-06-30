package fm3;

/* loaded from: classes2.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm3.w f264147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f264148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f264149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f264150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f264151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f264152i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f264153m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f264154n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f264155o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f264156p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f264157q;

    public v(fm3.w wVar, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, android.widget.ImageView imageView, boolean z17) {
        this.f264147d = wVar;
        this.f264148e = f17;
        this.f264149f = f18;
        this.f264150g = f19;
        this.f264151h = f27;
        this.f264152i = f28;
        this.f264153m = f29;
        this.f264154n = f37;
        this.f264155o = f38;
        this.f264156p = imageView;
        this.f264157q = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        this.f264147d.getClass();
        float f17 = this.f264149f;
        float f18 = this.f264148e;
        float f19 = f18 + ((f17 - f18) * floatValue);
        float f27 = this.f264151h;
        float f28 = this.f264150g;
        float f29 = f28 + ((f27 - f28) * floatValue);
        float f37 = this.f264153m;
        float f38 = this.f264152i;
        float f39 = f38 + ((f37 - f38) * floatValue);
        float f47 = this.f264155o;
        float f48 = this.f264154n;
        float f49 = f48 + ((f47 - f48) * floatValue);
        float f57 = 1.0f - floatValue;
        android.widget.ImageView imageView = this.f264156p;
        imageView.setX(f19);
        imageView.setY(f29);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = (int) f39;
        layoutParams.height = (int) f49;
        imageView.setLayoutParams(layoutParams);
        if (this.f264157q) {
            imageView.setAlpha(f57);
        }
    }
}
