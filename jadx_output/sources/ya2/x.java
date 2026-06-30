package ya2;

/* loaded from: classes10.dex */
public final class x implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f460576d;

    public x(kotlin.jvm.internal.h0 h0Var) {
        this.f460576d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        db2.b1 b1Var = (db2.b1) this.f460576d.f310123d;
        if (b1Var != null) {
            b1Var.j();
        }
    }
}
