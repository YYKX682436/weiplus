package sc2;

/* loaded from: classes2.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f405884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405885f;

    public f3(in5.s0 s0Var, sc2.m3 m3Var, android.view.View view) {
        this.f405883d = s0Var;
        this.f405884e = m3Var;
        this.f405885f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f405883d;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.r2o);
        android.view.View view = this.f405885f;
        sc2.m3 m3Var = this.f405884e;
        if (imageView != null) {
            sc2.m3.G(m3Var, s0Var, imageView, "onConfigurationChanged");
            m3Var.M(s0Var, view, true, "onConfigurationChanged");
        }
        m3Var.f406072x = true;
        view.getViewTreeObserver().addOnPreDrawListener(m3Var);
    }
}
