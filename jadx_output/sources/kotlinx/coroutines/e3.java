package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class e3 extends kotlinx.coroutines.g1 {

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f310174f;

    public e3(oz5.l lVar, yz5.p pVar) {
        super(lVar, false);
        this.f310174f = pz5.f.a(pVar, this, this);
    }

    @Override // kotlinx.coroutines.c3
    public void a0() {
        try {
            kotlin.coroutines.Continuation b17 = pz5.f.b(this.f310174f);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.internal.i.b(b17, kotlin.Result.m521constructorimpl(jz5.f0.f302826a), null, 2, null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
            throw th6;
        }
    }
}
