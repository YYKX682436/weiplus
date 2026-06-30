package cw2;

/* loaded from: classes2.dex */
public final class e8 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.f8 f223678d;

    public e8(cw2.f8 f8Var) {
        this.f223678d = f8Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        f25.e Vd = ((f25.n0) i95.n0.c(f25.n0.class)).Vd();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f223678d.F0());
        sb6.append(' ');
        sb6.append(activity);
        sb6.append(" onPause: loss focus, session:");
        f25.m0 m0Var = Vd.f259093b;
        sb6.append(m0Var != null ? ((g25.e) m0Var).f267979b : null);
        com.tencent.mars.xlog.Log.i("FinderVideoCore", sb6.toString());
        cw2.f8 f8Var = this.f223678d;
        f25.m0 m0Var2 = Vd.f259093b;
        f8Var.I0(m0Var2 != null ? ((g25.e) m0Var2).f267979b : null);
    }

    @Override // f25.f
    public void onResume() {
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        cw2.f8 f8Var = this.f223678d;
        sb6.append(f8Var.F0());
        sb6.append(' ');
        sb6.append(activity);
        sb6.append(" onResume: gain focus");
        com.tencent.mars.xlog.Log.i("FinderVideoCore", sb6.toString());
        f8Var.G0();
    }

    @Override // f25.f
    public void onStop() {
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        f25.e Vd = ((f25.n0) i95.n0.c(f25.n0.class)).Vd();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f223678d.F0());
        sb6.append(' ');
        sb6.append(activity);
        sb6.append(" onStop: loss focus, session:");
        f25.m0 m0Var = Vd.f259093b;
        sb6.append(m0Var != null ? ((g25.e) m0Var).f267979b : null);
        com.tencent.mars.xlog.Log.i("FinderVideoCore", sb6.toString());
        this.f223678d.I0(null);
    }
}
