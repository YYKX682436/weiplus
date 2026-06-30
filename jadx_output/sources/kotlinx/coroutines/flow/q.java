package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class q implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f310367d;

    public q(java.lang.Object obj) {
        this.f310367d = obj;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = kVar.emit(this.f310367d, continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }
}
