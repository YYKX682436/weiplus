package wv0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f449911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f449912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ex0.a0 a0Var, rv0.n1 n1Var) {
        super(1);
        this.f449911d = a0Var;
        this.f449912e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.maas.base.MJID segmentID = (com.tencent.maas.base.MJID) obj;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        java.util.Iterator it = ((java.util.ArrayList) this.f449911d.f257097g.f257177e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((ex0.r) obj2).f257168b, segmentID)) {
                break;
            }
        }
        ex0.r rVar = (ex0.r) obj2;
        if (rVar != null) {
            rv0.n1 n1Var = this.f449912e;
            gx0.bf.q7(n1Var.p7(), rVar.k(), true, 0L, 4, null);
            n1Var.v7(rVar.k());
        }
        return jz5.f0.f302826a;
    }
}
