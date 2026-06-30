package x;

/* loaded from: classes16.dex */
public final class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f450854d;

    public r(kotlin.jvm.internal.h0 h0Var) {
        this.f450854d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        az2.j jVar = (az2.j) this.f450854d.f310123d;
        if (jVar != null) {
            jVar.j();
        }
    }
}
