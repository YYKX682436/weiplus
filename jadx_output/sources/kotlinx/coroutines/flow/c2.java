package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class c2 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j[] f310219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.r f310220e;

    public c2(kotlinx.coroutines.flow.j[] jVarArr, yz5.r rVar) {
        this.f310219d = jVarArr;
        this.f310220e = rVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = v26.b0.a(kVar, this.f310219d, kotlinx.coroutines.flow.h2.f310288d, new kotlinx.coroutines.flow.b2(null, this.f310220e), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
