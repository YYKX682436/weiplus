package g4;

/* loaded from: classes5.dex */
public final class k2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.l2 f268405d;

    public k2(g4.l2 l2Var) {
        this.f268405d = l2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f268405d.f268419f.offer((jz5.f0) obj);
        return jz5.f0.f302826a;
    }
}
