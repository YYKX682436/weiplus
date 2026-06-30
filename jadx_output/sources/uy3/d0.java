package uy3;

/* loaded from: classes8.dex */
public final class d0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f431933d;

    public d0(uy3.j0 j0Var) {
        this.f431933d = j0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        uy3.j0 j0Var = this.f431933d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialog", "dismiss dialog exitType: %s", java.lang.Integer.valueOf(j0Var.f431958s));
        uy3.k0 k0Var = j0Var.f431955p;
        if (k0Var != null) {
            ((uy3.m0) k0Var).a(dialogInterface, j0Var.f431958s);
        }
        ((jz5.n) j0Var.F).getValue();
    }
}
