package n0;

/* loaded from: classes14.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f333510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0.y0 y0Var, n0.u2 u2Var, n0.u2 u2Var2) {
        super(3);
        this.f333510d = y0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        kotlin.jvm.internal.o.g((n0.e) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        n0.t2 h17 = this.f333510d.f333762c.h(null);
        if (h17 == null) {
            n0.e1.c("Could not resolve state for movable content");
            throw null;
        }
        h17.getClass();
        kotlin.jvm.internal.o.g(null, "table");
        n0.e1.f(slots.f333655m <= 0 && slots.n(slots.f333660r + 1) == 1);
        int i17 = slots.f333660r;
        int i18 = slots.f333650h;
        int i19 = slots.f333651i;
        slots.a(1);
        slots.H();
        int i27 = slots.f333655m;
        slots.f333655m = i27 + 1;
        if (i27 == 0) {
            slots.f333658p.b(((slots.f333644b.length / 5) - slots.f333648f) - slots.f333649g);
        }
        throw null;
    }
}
