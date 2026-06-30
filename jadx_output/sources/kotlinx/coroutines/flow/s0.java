package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class s0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310396e;

    public s0(kotlinx.coroutines.flow.j jVar, yz5.p pVar) {
        this.f310395d = jVar;
        this.f310396e = pVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f310395d.a(new kotlinx.coroutines.flow.u0(new kotlin.jvm.internal.c0(), kVar, this.f310396e), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
