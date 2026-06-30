package hr3;

/* loaded from: classes9.dex */
public final class f8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.g8 f283547d;

    public f8(hr3.g8 g8Var) {
        this.f283547d = g8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.g8 g8Var = this.f283547d;
        com.tencent.mm.storage.z3 z3Var = g8Var.f283579e;
        qk.o b17 = r01.z.b(z3Var != null ? z3Var.d1() : null);
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = g8Var.f283578d;
        com.tencent.mm.storage.z3 z3Var2 = g8Var.f283579e;
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.a(b17, activity, z3Var2, true, 0);
    }
}
