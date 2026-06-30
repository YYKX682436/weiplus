package i1;

/* loaded from: classes14.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.r f287049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1.w1 f287050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(yz5.r rVar, i1.w1 w1Var) {
        super(2);
        this.f287049d = rVar;
        this.f287050e = w1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        i1.w1 w1Var = this.f287050e;
        this.f287049d.C(java.lang.Float.valueOf(w1Var.f287064n.f286933g), java.lang.Float.valueOf(w1Var.f287064n.f286934h), oVar, 0);
        return jz5.f0.f302826a;
    }
}
