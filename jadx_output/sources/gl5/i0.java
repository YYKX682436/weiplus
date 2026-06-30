package gl5;

/* loaded from: classes3.dex */
public final class i0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f273014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f273015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f273016h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f273017i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f273018m;

    public i0(gl5.d1 d1Var, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18) {
        this.f273012d = d1Var;
        this.f273013e = i17;
        this.f273014f = i18;
        this.f273015g = i19;
        this.f273016h = i27;
        this.f273017i = i28;
        this.f273018m = i29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f273012d.d().setOutlineProvider(new gl5.h0(this.f273013e, it.getAnimatedFraction(), this.f273014f, this.f273015g, this.f273016h, this.f273017i, this.f273018m, 0.5f, 0.0f, this.f273012d));
    }
}
