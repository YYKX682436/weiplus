package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class m3 extends kotlinx.coroutines.i {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.internal.t f310556d;

    public m3(kotlinx.coroutines.internal.t tVar) {
        this.f310556d = tVar;
    }

    @Override // kotlinx.coroutines.o
    public void a(java.lang.Throwable th6) {
        this.f310556d.q();
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    public java.lang.String toString() {
        return "RemoveOnCancel[" + this.f310556d + ']';
    }
}
