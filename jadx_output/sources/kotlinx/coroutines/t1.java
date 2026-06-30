package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class t1 extends kotlinx.coroutines.n {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.s1 f310678d;

    public t1(kotlinx.coroutines.s1 s1Var) {
        this.f310678d = s1Var;
    }

    @Override // kotlinx.coroutines.o
    public void a(java.lang.Throwable th6) {
        this.f310678d.dispose();
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    public java.lang.String toString() {
        return "DisposeOnCancel[" + this.f310678d + ']';
    }
}
