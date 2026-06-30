package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public final class a extends kotlinx.coroutines.n {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.sync.q f310644d;

    /* renamed from: e, reason: collision with root package name */
    public final int f310645e;

    public a(kotlinx.coroutines.sync.q qVar, int i17) {
        this.f310644d = qVar;
        this.f310645e = i17;
    }

    @Override // kotlinx.coroutines.o
    public void a(java.lang.Throwable th6) {
        kotlinx.coroutines.sync.q qVar = this.f310644d;
        qVar.getClass();
        qVar.f310676e.set(this.f310645e, kotlinx.coroutines.sync.p.f310674e);
        if (kotlinx.coroutines.internal.i0.f310500d.incrementAndGet(qVar) != kotlinx.coroutines.sync.p.f310675f || qVar.c()) {
            return;
        }
        qVar.d();
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    public java.lang.String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f310644d + ", " + this.f310645e + ']';
    }
}
