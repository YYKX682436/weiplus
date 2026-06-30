package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class q3 extends kotlinx.coroutines.w2 {

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.selects.h f310572h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f310573i;

    public q3(kotlinx.coroutines.selects.h hVar, yz5.p pVar) {
        this.f310572h = hVar;
        this.f310573i = pVar;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        kotlinx.coroutines.selects.f fVar = (kotlinx.coroutines.selects.f) this.f310572h;
        if (fVar.B()) {
            kotlinx.coroutines.c3 w17 = w();
            yz5.p pVar = this.f310573i;
            java.lang.Object P = w17.P();
            if (P instanceof kotlinx.coroutines.e0) {
                fVar.A(((kotlinx.coroutines.e0) P).f310172a);
                return;
            }
            java.lang.Object a17 = kotlinx.coroutines.d3.a(P);
            fVar.getClass();
            try {
                kotlin.coroutines.Continuation b17 = pz5.f.b(pz5.f.a(pVar, a17, fVar));
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlinx.coroutines.internal.i.a(b17, kotlin.Result.m521constructorimpl(jz5.f0.f302826a), null);
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                fVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7)));
                throw th7;
            }
        }
    }
}
