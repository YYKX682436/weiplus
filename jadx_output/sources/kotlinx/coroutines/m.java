package kotlinx.coroutines;

/* loaded from: classes13.dex */
public final class m extends kotlinx.coroutines.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Future f310553d;

    public m(java.util.concurrent.Future future) {
        this.f310553d = future;
    }

    @Override // kotlinx.coroutines.o
    public void a(java.lang.Throwable th6) {
        if (th6 != null) {
            this.f310553d.cancel(false);
        }
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    public java.lang.String toString() {
        return "CancelFutureOnCancel[" + this.f310553d + ']';
    }
}
