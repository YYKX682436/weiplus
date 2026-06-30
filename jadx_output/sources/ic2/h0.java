package ic2;

/* loaded from: classes8.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic2.l0 f290330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ic2.l0 l0Var) {
        super(3);
        this.f290330d = l0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        r45.zy2 req = (r45.zy2) obj2;
        r45.az2 resp = (r45.az2) obj3;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f290330d.i(true, intValue, req, resp);
        return jz5.f0.f302826a;
    }
}
