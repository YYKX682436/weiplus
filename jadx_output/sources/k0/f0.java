package k0;

/* loaded from: classes14.dex */
public final class f0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f302903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f302904e;

    public f0(z.e eVar, kotlinx.coroutines.y0 y0Var) {
        this.f302903d = eVar;
        this.f302904e = y0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object f17;
        long j17 = ((d1.e) obj).f225627a;
        z.e eVar = this.f302903d;
        boolean c17 = d1.f.c(((d1.e) eVar.d()).f225627a);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (c17 && d1.f.c(j17)) {
            if (!(d1.e.d(((d1.e) eVar.d()).f225627a) == d1.e.d(j17))) {
                f17 = kotlinx.coroutines.l.d(this.f302904e, null, null, new k0.e0(eVar, j17, null), 3, null);
                if (f17 != pz5.a.f359186d) {
                    return f0Var;
                }
                return f17;
            }
        }
        f17 = eVar.f(new d1.e(j17), continuation);
        if (f17 != pz5.a.f359186d) {
            return f0Var;
        }
        return f17;
    }
}
