package n0;

/* loaded from: classes14.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final n0.b1 f333439d = new n0.b1();

    public b1() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        kotlin.jvm.internal.o.g((n0.e) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        if (!(slots.f333655m == 0)) {
            n0.e1.c("Cannot reset when inserting".toString());
            throw null;
        }
        slots.y();
        slots.f333660r = 0;
        slots.f333649g = (slots.f333644b.length / 5) - slots.f333648f;
        slots.f333650h = 0;
        slots.f333651i = 0;
        slots.f333656n = 0;
        return jz5.f0.f302826a;
    }
}
