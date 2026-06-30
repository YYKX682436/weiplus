package v26;

/* loaded from: classes14.dex */
public final class u0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f433066d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f433067e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f433068f;

    public u0(kotlinx.coroutines.flow.k kVar, oz5.l lVar) {
        this.f433066d = lVar;
        this.f433067e = kotlinx.coroutines.internal.r0.b(lVar);
        this.f433068f = new v26.t0(kVar, null);
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = v26.h.a(this.f433066d, obj, this.f433067e, this.f433068f, continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
