package df2;

/* loaded from: classes3.dex */
public final class u0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f231486d;

    public u0(df2.v0 v0Var) {
        this.f231486d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        az2.j jVar = this.f231486d.f231575p;
        if (jVar != null) {
            jVar.j();
        }
    }
}
