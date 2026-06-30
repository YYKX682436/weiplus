package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class p0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f310358e;

    public p0(kotlinx.coroutines.flow.j jVar, int i17) {
        this.f310357d = jVar;
        this.f310358e = i17;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f310357d.a(new kotlinx.coroutines.flow.r0(new kotlin.jvm.internal.f0(), this.f310358e, kVar), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
