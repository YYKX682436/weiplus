package g4;

/* loaded from: classes5.dex */
public final class u2 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f268584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.v2 f268585e;

    public u2(kotlinx.coroutines.flow.j jVar, g4.v2 v2Var) {
        this.f268584d = jVar;
        this.f268585e = v2Var;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f268584d.a(new g4.t2(kVar, this), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
