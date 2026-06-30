package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class i implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f310290d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f310291e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f310292f;

    public i(kotlinx.coroutines.flow.j jVar, yz5.l lVar, yz5.p pVar) {
        this.f310290d = jVar;
        this.f310291e = lVar;
        this.f310292f = pVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = v26.k0.f433020a;
        java.lang.Object a17 = this.f310290d.a(new kotlinx.coroutines.flow.h(this, h0Var, kVar), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
