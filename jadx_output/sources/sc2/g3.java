package sc2;

/* loaded from: classes2.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f405908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405909f;

    public g3(in5.s0 s0Var, sc2.m3 m3Var, android.view.View view) {
        this.f405907d = s0Var;
        this.f405908e = m3Var;
        this.f405909f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f405907d;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.r2o);
        if (imageView != null) {
            sc2.m3 m3Var = this.f405908e;
            sc2.m3.G(m3Var, s0Var, imageView, "onPreDraw");
            m3Var.M(s0Var, this.f405909f, true, "onPreDraw");
        }
    }
}
