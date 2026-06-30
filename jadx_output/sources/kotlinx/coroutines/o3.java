package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class o3 extends kotlinx.coroutines.w2 {

    /* renamed from: h, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f310562h;

    public o3(kotlin.coroutines.Continuation continuation) {
        this.f310562h = continuation;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f310562h.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
