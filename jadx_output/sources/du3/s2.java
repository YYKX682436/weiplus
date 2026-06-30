package du3;

/* loaded from: classes3.dex */
public final class s2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243697f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243698g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243699h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243700i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f243701m;

    /* renamed from: n, reason: collision with root package name */
    public hk0.z0 f243702n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f243703o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f243697f = parent;
        this.f243698g = jz5.h.b(new du3.n2(this));
        this.f243699h = jz5.h.b(new du3.h2(this));
        this.f243700i = jz5.h.b(new du3.m2(this));
        this.f243701m = jz5.h.b(new du3.i2(this));
        this.f243702n = hk0.z0.f281863e;
        this.f243703o = jz5.h.b(new du3.r2(this));
    }

    public final android.widget.FrameLayout A() {
        java.lang.Object value = ((jz5.n) this.f243699h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.FrameLayout) value;
    }

    public final android.widget.FrameLayout B() {
        java.lang.Object value = ((jz5.n) this.f243701m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.FrameLayout) value;
    }

    public final android.widget.FrameLayout C() {
        java.lang.Object value = ((jz5.n) this.f243700i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.FrameLayout) value;
    }

    public final hk0.u0 D() {
        return (hk0.u0) ((jz5.n) this.f243703o).getValue();
    }

    @Override // yt3.r2
    public void onAttach() {
        D().Z6(5, new du3.o2(this));
        hk0.u0 D = D();
        du3.p2 p2Var = new du3.p2(this);
        D.getClass();
        D.f281817h.observe(D.f281813d, p2Var);
        D().a7(1, new du3.q2(this));
    }

    @Override // yt3.r2
    public void onDetach() {
        B().setBackground(null);
        hk0.z0 z0Var = this.f243702n;
        if (z0Var == hk0.z0.f281864f) {
            A().setScaleX(1.0f);
            A().setScaleY(1.0f);
        } else if (z0Var == hk0.z0.f281863e) {
            C().setScaleX(1.0f);
            C().setScaleY(1.0f);
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        A().setOnClickListener(new du3.j2(this));
        C().setOnClickListener(new du3.k2(this));
        B().setOnClickListener(new du3.l2(this));
        C().setScaleX(1.4f);
        C().setScaleY(1.4f);
    }

    public final void z(android.view.View view, float f17) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
