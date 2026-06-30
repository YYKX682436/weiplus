package lg2;

/* loaded from: classes10.dex */
public abstract class b extends lg2.a implements kg2.a {

    /* renamed from: p, reason: collision with root package name */
    public ig2.n f318565p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f318566q;

    /* renamed from: r, reason: collision with root package name */
    public og2.a f318567r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // kg2.a
    public void a() {
    }

    @Override // kg2.a
    public void b(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        u(onAnimationEndCallback);
    }

    @Override // kg2.a
    public void d(og2.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f318566q = params.f345150b;
        this.f318567r = params;
        l();
    }

    @Override // lg2.a, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        super.onAnimationEnd(p07);
        p();
    }

    public final android.widget.ImageView v() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.f318556d);
        if (w()) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        }
        return imageView;
    }

    public final boolean w() {
        ig2.n nVar = this.f318565p;
        kotlin.jvm.internal.o.d(nVar);
        return nVar.f291408g >= 1.0f;
    }
}
