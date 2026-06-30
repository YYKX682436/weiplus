package y;

/* loaded from: classes3.dex */
public final class j implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f458370d;

    public j(n0.v2 v2Var) {
        this.f458370d = v2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f458370d.setValue(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
        return jz5.f0.f302826a;
    }
}
