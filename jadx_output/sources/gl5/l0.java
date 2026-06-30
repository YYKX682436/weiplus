package gl5;

/* loaded from: classes3.dex */
public final class l0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f273037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f273038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f273039h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f273040i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f273041m;

    public l0(gl5.d1 d1Var, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18) {
        this.f273035d = d1Var;
        this.f273036e = i17;
        this.f273037f = i18;
        this.f273038g = i19;
        this.f273039h = i27;
        this.f273040i = i28;
        this.f273041m = i29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f273035d.d().setOutlineProvider(new gl5.k0(this.f273036e, it.getAnimatedFraction(), this.f273037f, this.f273038g, this.f273039h, this.f273040i, this.f273041m, 0.0f, 0.5f, this.f273035d));
    }
}
