package uy3;

/* loaded from: classes8.dex */
public final class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f431935d;

    public e0(uy3.j0 j0Var) {
        this.f431935d = j0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        uy3.k0 k0Var = this.f431935d.f431955p;
        if (k0Var != null) {
            ((uy3.m0) k0Var).onCancel(dialogInterface);
        }
    }
}
