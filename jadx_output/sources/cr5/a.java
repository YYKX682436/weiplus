package cr5;

/* loaded from: classes11.dex */
public final class a implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr5.f f222006d;

    public a(cr5.f fVar) {
        this.f222006d = fVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f222006d.f222027b.invalidate();
        return jz5.f0.f302826a;
    }
}
