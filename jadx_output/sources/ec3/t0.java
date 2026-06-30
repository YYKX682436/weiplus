package ec3;

/* loaded from: classes9.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251091d;

    public t0(ec3.g1 g1Var) {
        this.f251091d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec3.g1 g1Var = this.f251091d;
        g1Var.getClass();
        ec3.g1.d7(g1Var, false, 1, null);
        g1Var.S6();
        androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.luckymoney.ui.jd) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.jd.class)).O6(true);
    }
}
