package n0;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.k4 f333668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f333669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n0.k4 k4Var, n0.d dVar) {
        super(3);
        this.f333668d = k4Var;
        this.f333669e = dVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        kotlin.jvm.internal.o.g((n0.e) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        int i17 = slots.f333655m;
        slots.f333655m = i17 + 1;
        if (i17 == 0) {
            slots.f333658p.b(((slots.f333644b.length / 5) - slots.f333648f) - slots.f333649g);
        }
        n0.d dVar = this.f333669e;
        dVar.getClass();
        n0.k4 slots2 = this.f333668d;
        kotlin.jvm.internal.o.g(slots2, "slots");
        slots.s(slots2, slots2.e(dVar));
        slots.i();
        return jz5.f0.f302826a;
    }
}
