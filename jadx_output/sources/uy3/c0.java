package uy3;

/* loaded from: classes8.dex */
public final class c0 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f431931d;

    public c0(uy3.j0 j0Var) {
        this.f431931d = j0Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        uy3.j0 j0Var = this.f431931d;
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = j0Var.f431956q;
        if (baseBoxDialogView != null) {
            baseBoxDialogView.j();
        }
        uy3.k0 k0Var = j0Var.f431955p;
        if (k0Var != null) {
            ((uy3.m0) k0Var).onShow(dialogInterface);
        }
    }
}
