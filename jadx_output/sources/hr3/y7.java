package hr3;

/* loaded from: classes9.dex */
public class y7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.a8 f284205d;

    public y7(hr3.a8 a8Var) {
        this.f284205d = a8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.q6 q6Var = (qk.q6) i95.n0.c(qk.q6.class);
        hr3.a8 a8Var = this.f284205d;
        java.lang.String d17 = a8Var.f283387e.d1();
        ((c01.p0) q6Var).getClass();
        qk.o b17 = r01.z.b(d17);
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = (android.app.Activity) a8Var.f283386d;
        com.tencent.mm.storage.z3 z3Var = a8Var.f283387e;
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.a(b17, activity, z3Var, false, 0);
        a8Var.b();
    }
}
