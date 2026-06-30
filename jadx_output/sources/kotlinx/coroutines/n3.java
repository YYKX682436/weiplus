package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class n3 extends kotlinx.coroutines.w2 {

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.r f310560h;

    public n3(kotlinx.coroutines.r rVar) {
        this.f310560h = rVar;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        java.lang.Object P = w().P();
        boolean z17 = P instanceof kotlinx.coroutines.e0;
        kotlinx.coroutines.r rVar = this.f310560h;
        if (z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(((kotlinx.coroutines.e0) P).f310172a)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlinx.coroutines.d3.a(P)));
        }
    }
}
