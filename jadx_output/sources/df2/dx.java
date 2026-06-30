package df2;

/* loaded from: classes10.dex */
public final class dx implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jx f230005d;

    public dx(df2.jx jxVar) {
        this.f230005d = jxVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.q12 q12Var = (r45.q12) obj;
        df2.jx jxVar = this.f230005d;
        if (jxVar.f230505n == null) {
            jxVar.f230505n = jxVar.S6(com.tencent.mm.R.id.qs9);
            df2.jx.Z6(jxVar, q12Var);
        } else {
            df2.jx.Z6(jxVar, q12Var);
        }
        return jz5.f0.f302826a;
    }
}
