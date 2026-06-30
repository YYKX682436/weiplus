package df2;

/* loaded from: classes10.dex */
public final class rn implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.un f231259d;

    public rn(df2.un unVar) {
        this.f231259d = unVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rf2.o1 o1Var;
        r45.g02 g02Var = (r45.g02) obj;
        df2.un unVar = this.f231259d;
        com.tencent.mars.xlog.Log.i(unVar.f231539m, "updateMetaInfo");
        if (g02Var != null && (o1Var = unVar.f231541o) != null) {
            o1Var.d(g02Var);
        }
        return jz5.f0.f302826a;
    }
}
