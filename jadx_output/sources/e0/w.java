package e0;

/* loaded from: classes14.dex */
public final class w implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f245715d;

    public w(n0.v2 v2Var) {
        this.f245715d = v2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f245715d.setValue((e06.k) obj);
        return jz5.f0.f302826a;
    }
}
