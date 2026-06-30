package i1;

/* loaded from: classes14.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1.e f286835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(i1.e eVar) {
        super(4);
        this.f286835d = eVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        ((java.lang.Number) obj).floatValue();
        ((java.lang.Number) obj2).floatValue();
        n0.o oVar = (n0.o) obj3;
        if ((((java.lang.Number) obj4).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        i1.c2.a(this.f286835d.f286884f, null, oVar, 0, 2);
        return jz5.f0.f302826a;
    }
}
