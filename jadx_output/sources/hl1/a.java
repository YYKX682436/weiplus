package hl1;

/* loaded from: classes7.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl1.b f282076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f282077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f282079g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f282080h;

    public a(hl1.b bVar, int i17, int i18, long j17, android.view.View view) {
        this.f282076d = bVar;
        this.f282077e = i17;
        this.f282078f = i18;
        this.f282079g = j17;
        this.f282080h = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f282076d.i(this.f282077e, this.f282078f, this.f282079g, animation);
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f282076d.f282083d = ((java.lang.Integer) animatedValue).intValue();
        android.view.View view = this.f282080h;
        if (view != null) {
            view.invalidate();
        }
    }
}
