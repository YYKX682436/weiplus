package fh1;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f262571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fh1.z zVar, kotlinx.coroutines.q qVar) {
        super(0);
        this.f262570d = zVar;
        this.f262571e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh1.x0 a17 = this.f262570d.a();
        fh1.n nVar = new fh1.n(this.f262571e);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = a17.D;
        atomicBoolean.get();
        if (atomicBoolean.get()) {
            nVar.invoke();
        } else {
            a17.E.add(nVar);
        }
        return jz5.f0.f302826a;
    }
}
