package i33;

/* loaded from: classes10.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f288218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i33.t0 t0Var) {
        super(0);
        this.f288218d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.q2 q2Var = com.tencent.mm.ui.q2.NORMAL;
        i33.t0 t0Var = this.f288218d;
        androidx.appcompat.app.AppCompatActivity activity = t0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f353948a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            z0Var.W6(q2Var);
        }
        com.tencent.mars.xlog.Log.i(t0Var.f288247f, "HideScrollBar: notifyModeChanged to normal");
        return jz5.f0.f302826a;
    }
}
