package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class e2 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j[] f310241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.t f310242e;

    public e2(kotlinx.coroutines.flow.j[] jVarArr, yz5.t tVar) {
        this.f310241d = jVarArr;
        this.f310242e = tVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = v26.b0.a(kVar, this.f310241d, kotlinx.coroutines.flow.h2.f310288d, new kotlinx.coroutines.flow.d2(null, this.f310242e), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
