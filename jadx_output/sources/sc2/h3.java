package sc2;

/* loaded from: classes2.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f405943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405945f;

    public h3(sc2.m3 m3Var, android.view.View view, in5.s0 s0Var) {
        this.f405943d = m3Var;
        this.f405944e = view;
        this.f405945f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f405945f.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sc2.m3 m3Var = this.f405943d;
        m3Var.K(this.f405944e, m3Var.I(context));
        com.tencent.mars.xlog.Log.i(m3Var.f406071w, "showSubtitleRunnable succ");
    }
}
