package ef0;

/* loaded from: classes2.dex */
public final class d2 implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.aa f252191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f252192b;

    public d2(qk.aa aaVar, android.app.Activity activity) {
        this.f252191a = aaVar;
        this.f252192b = activity;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        qk.aa aaVar = this.f252191a;
        android.view.View.OnClickListener onClickListener = aaVar.f364016e;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
        il4.e eVar = new il4.e(null, 0, aaVar.f364013b.f27733q, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        bw5.o50 o50Var = new bw5.o50();
        o50Var.i("1010");
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.app.Activity activity = this.f252192b;
        bw5.ar0 i17 = bw5.ar0.i(aaVar.f364013b.f27733q);
        kotlin.jvm.internal.o.f(i17, "forNumber(...)");
        qk.f9.c(aj6, activity, o50Var, i17, eVar, null, 16, null);
        qk.a8 a8Var = (qk.a8) i95.n0.c(qk.a8.class);
        ((ef0.q1) a8Var).Ai(this.f252192b, bw5.ar0.TingScene_FinderListenLaterSnakeBarJump);
    }
}
