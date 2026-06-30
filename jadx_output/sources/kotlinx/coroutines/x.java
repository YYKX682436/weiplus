package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class x extends kotlinx.coroutines.t2 implements kotlinx.coroutines.w {

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y f310694h;

    public x(kotlinx.coroutines.y yVar) {
        this.f310694h = yVar;
    }

    @Override // kotlinx.coroutines.w
    public boolean e(java.lang.Throwable th6) {
        return w().F(th6);
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        ((kotlinx.coroutines.c3) this.f310694h).y(w());
    }
}
