package n0;

/* loaded from: classes14.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.n2 f333618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f333619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(n0.n2 n2Var, kotlinx.coroutines.q qVar) {
        super(1);
        this.f333618d = n2Var;
        this.f333619e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.n2 n2Var = this.f333618d;
        java.lang.Object obj2 = n2Var.f333622a;
        kotlinx.coroutines.q qVar = this.f333619e;
        synchronized (obj2) {
            n2Var.f333623b.remove(qVar);
        }
        return jz5.f0.f302826a;
    }
}
