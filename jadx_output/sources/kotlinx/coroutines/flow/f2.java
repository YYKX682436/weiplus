package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class f2 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f310256f;

    public f2(kotlinx.coroutines.flow.j jVar, kotlinx.coroutines.flow.j jVar2, yz5.q qVar) {
        this.f310254d = jVar;
        this.f310255e = jVar2;
        this.f310256f = qVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = v26.b0.a(kVar, new kotlinx.coroutines.flow.j[]{this.f310254d, this.f310255e}, kotlinx.coroutines.flow.h2.f310288d, new kotlinx.coroutines.flow.g2(this.f310256f, null), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
