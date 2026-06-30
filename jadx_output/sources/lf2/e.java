package lf2;

/* loaded from: classes10.dex */
public final class e implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f318282d;

    public e(lf2.s sVar) {
        this.f318282d = sVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        int intValue = ((java.lang.Number) obj).intValue();
        lf2.s sVar = this.f318282d;
        boolean S6 = ((om2.g) sVar.H.a(om2.g.class)).S6();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!S6) {
            return f0Var;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new lf2.d(sVar, intValue, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : f0Var;
    }
}
