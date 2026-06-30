package kotlinx.coroutines.flow;

/* loaded from: classes11.dex */
public final class y1 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310460e;

    public y1(kotlinx.coroutines.flow.j jVar, yz5.p pVar) {
        this.f310459d = jVar;
        this.f310460e = pVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f310459d.a(new kotlinx.coroutines.flow.x1(kVar, this.f310460e), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
