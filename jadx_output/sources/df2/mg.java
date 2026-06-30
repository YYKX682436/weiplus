package df2;

/* loaded from: classes3.dex */
public final class mg implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f230778d;

    public mg(df2.ug ugVar) {
        this.f230778d = ugVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xs2.u uVar;
        if ((obj instanceof wp.i) && (uVar = this.f230778d.f231526q) != null) {
            uVar.b((wp.i) obj);
        }
        return jz5.f0.f302826a;
    }
}
