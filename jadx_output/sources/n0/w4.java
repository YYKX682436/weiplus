package n0;

/* loaded from: classes11.dex */
public final class w4 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.f3 f333741d;

    public w4(n0.f3 f3Var) {
        this.f333741d = f3Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ((n0.g3) this.f333741d).setValue(obj);
        return jz5.f0.f302826a;
    }
}
