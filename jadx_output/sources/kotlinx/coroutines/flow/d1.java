package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class d1 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310228e;

    public d1(kotlinx.coroutines.flow.j jVar, yz5.p pVar) {
        this.f310227d = jVar;
        this.f310228e = pVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f310227d.a(new kotlinx.coroutines.flow.c1(kVar, this.f310228e), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
