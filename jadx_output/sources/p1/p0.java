package p1;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.o0 f350865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p1.o0 o0Var) {
        super(1);
        this.f350865d = o0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        p1.o0 o0Var = this.f350865d;
        kotlinx.coroutines.q qVar = o0Var.f350861f;
        if (qVar != null) {
            ((kotlinx.coroutines.r) qVar).d(th6);
        }
        o0Var.f350861f = null;
        return jz5.f0.f302826a;
    }
}
