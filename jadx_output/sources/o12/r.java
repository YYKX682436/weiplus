package o12;

/* loaded from: classes10.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f342172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f342173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f342174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f342175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f342176h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o12.u f342177i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f342178m;

    public r(android.widget.FrameLayout.LayoutParams layoutParams, int i17, int i18, int i19, int i27, o12.u uVar, android.view.View view) {
        this.f342172d = layoutParams;
        this.f342173e = i17;
        this.f342174f = i18;
        this.f342175g = i19;
        this.f342176h = i27;
        this.f342177i = uVar;
        this.f342178m = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = (int) (this.f342173e + ((this.f342174f - r0) * floatValue));
        android.widget.FrameLayout.LayoutParams layoutParams = this.f342172d;
        layoutParams.leftMargin = i17;
        int i18 = (int) (this.f342175g + ((this.f342176h - r2) * floatValue));
        layoutParams.topMargin = i18;
        this.f342177i.f342186d.offsetTo(i17, i18);
        this.f342178m.requestLayout();
    }
}
