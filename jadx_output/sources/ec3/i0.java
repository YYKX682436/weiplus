package ec3;

/* loaded from: classes2.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251037d;

    public i0(ec3.g1 g1Var) {
        this.f251037d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec3.r1 r1Var = ec3.r1.f251087a;
        ec3.g1 g1Var = this.f251037d;
        r1Var.b((android.widget.RelativeLayout) g1Var.findViewById(com.tencent.mm.R.id.udo), i65.a.b(g1Var.getContext(), 64), new ec3.h0(g1Var));
    }
}
