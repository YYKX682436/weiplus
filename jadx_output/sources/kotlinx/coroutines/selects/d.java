package kotlinx.coroutines.selects;

/* loaded from: classes14.dex */
public final class d extends kotlinx.coroutines.t2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.selects.f f310632h;

    public d(kotlinx.coroutines.selects.f fVar) {
        this.f310632h = fVar;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        kotlinx.coroutines.selects.f fVar = this.f310632h;
        if (fVar.B()) {
            fVar.A(w().x());
        }
    }
}
