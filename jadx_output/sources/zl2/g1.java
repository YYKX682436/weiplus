package zl2;

/* loaded from: classes3.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f473779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f473780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(gk2.e eVar, yz5.a aVar) {
        super(2);
        this.f473779d = eVar;
        this.f473780e = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.xn1 xn1Var = (r45.xn1) obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            ((mm2.c1) this.f473779d.a(mm2.c1.class)).t8(xn1Var != null ? xn1Var.getList(11) : null);
        }
        yz5.a aVar = this.f473780e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
