package g4;

/* loaded from: classes5.dex */
public final class y1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f268628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.a1 f268629e;

    public y1(g4.y2 y2Var, g4.a1 a1Var) {
        this.f268628d = y2Var;
        this.f268629e = a1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object e17 = this.f268628d.e(this.f268629e, (g4.t0) obj, continuation);
        return e17 == pz5.a.f359186d ? e17 : jz5.f0.f302826a;
    }
}
