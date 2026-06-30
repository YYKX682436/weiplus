package i06;

/* loaded from: classes16.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.n3 f286696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(i06.n3 n3Var) {
        super(0);
        this.f286696d = n3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i06.n3 n3Var = this.f286696d;
        o06.q1 b17 = n3Var.q().l().b();
        if (b17 != null) {
            return b17;
        }
        o06.o1 l17 = n3Var.q().l();
        int i17 = p06.k.Z0;
        p06.k kVar = p06.i.f350765a;
        return r16.h.d(l17, kVar, kVar);
    }
}
