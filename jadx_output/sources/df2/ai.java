package df2;

/* loaded from: classes3.dex */
public final class ai implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.fi f229725d;

    public ai(df2.fi fiVar) {
        this.f229725d = fiVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.n73 n73Var = (r45.n73) obj;
        if (n73Var != null) {
            df2.fi fiVar = this.f229725d;
            fiVar.c7(fiVar.b7(n73Var));
        }
        return jz5.f0.f302826a;
    }
}
