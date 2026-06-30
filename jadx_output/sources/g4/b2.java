package g4;

/* loaded from: classes5.dex */
public final class b2 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f268210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268211e;

    public b2(kotlinx.coroutines.flow.j jVar, int i17) {
        this.f268210d = jVar;
        this.f268211e = i17;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f268210d.a(new g4.a2(kVar, this), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
