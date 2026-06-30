package kotlinx.coroutines;

/* loaded from: classes13.dex */
public final class m2 extends kotlinx.coroutines.n {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f310555d;

    public m2(yz5.l lVar) {
        this.f310555d = lVar;
    }

    @Override // kotlinx.coroutines.o
    public void a(java.lang.Throwable th6) {
        this.f310555d.invoke(th6);
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    public java.lang.String toString() {
        return "InvokeOnCancel[" + this.f310555d.getClass().getSimpleName() + '@' + kotlinx.coroutines.c1.a(this) + ']';
    }
}
