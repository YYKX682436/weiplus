package rx3;

/* loaded from: classes.dex */
public final class q implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401049d;

    public q(java.util.List list) {
        this.f401049d = list;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ox3.g gVar = (ox3.g) obj;
        if (gVar != null) {
            this.f401049d.add(gVar);
        }
        return jz5.f0.f302826a;
    }
}
