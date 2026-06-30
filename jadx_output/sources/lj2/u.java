package lj2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(lj2.c0 c0Var) {
        super(2);
        this.f318953d = c0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        lj2.c0 c0Var = this.f318953d;
        if (intValue != 2) {
            qo0.c cVar = c0Var.f318836g;
            if (cVar != null) {
                qo0.c.a(cVar, qo0.b.f365441y4, null, 2, null);
            }
        } else if (intValue2 == 3) {
            qo0.c cVar2 = c0Var.f318836g;
            if (cVar2 != null) {
                qo0.c.a(cVar2, qo0.b.I3, null, 2, null);
            }
        } else {
            qo0.c cVar3 = c0Var.f318836g;
            if (cVar3 != null) {
                qo0.c.a(cVar3, qo0.b.H3, null, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
