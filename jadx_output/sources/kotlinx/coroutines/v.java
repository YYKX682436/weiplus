package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class v extends kotlinx.coroutines.t2 {

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.r f310682h;

    public v(kotlinx.coroutines.r rVar) {
        this.f310682h = rVar;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        kotlinx.coroutines.c3 w17 = w();
        kotlinx.coroutines.r rVar = this.f310682h;
        java.lang.Throwable i17 = rVar.i(w17);
        if (!rVar.isReusable() ? false : ((kotlinx.coroutines.internal.DispatchedContinuation) rVar.f310576d).postponeCancellation(i17)) {
            return;
        }
        rVar.d(i17);
        rVar.g();
    }
}
