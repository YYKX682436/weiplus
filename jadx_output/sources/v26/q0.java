package v26;

/* loaded from: classes5.dex */
public final class q0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final u26.y0 f433048d;

    public q0(u26.y0 y0Var) {
        this.f433048d = y0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object t17 = this.f433048d.t(obj, continuation);
        return t17 == pz5.a.f359186d ? t17 : jz5.f0.f302826a;
    }
}
