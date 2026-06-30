package n0;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f333469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f333470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(kotlin.jvm.internal.f0 f0Var, n0.d dVar) {
        super(3);
        this.f333469d = f0Var;
        this.f333470e = dVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i17;
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        int c17 = slots.c(this.f333470e);
        n0.e1.f(slots.f333660r < c17);
        n0.y0.x(slots, applier, c17);
        int i18 = slots.f333660r;
        int i19 = slots.f333661s;
        while (i19 >= 0 && !slots.r(i19)) {
            i19 = slots.w(i19);
        }
        int i27 = i19 + 1;
        int i28 = 0;
        while (i27 < i18) {
            if (slots.o(i18, i27)) {
                if (slots.r(i27)) {
                    i28 = 0;
                }
                i27++;
            } else {
                i28 += slots.r(i27) ? 1 : n0.l4.h(slots.f333644b, slots.m(i27));
                i27 += slots.n(i27);
            }
        }
        while (true) {
            i17 = slots.f333660r;
            if (i17 >= c17) {
                break;
            }
            if (slots.o(c17, i17)) {
                int i29 = slots.f333660r;
                if (i29 < slots.f333649g && n0.l4.f(slots.f333644b, slots.m(i29))) {
                    applier.h(slots.v(slots.f333660r));
                    i28 = 0;
                }
                slots.H();
            } else {
                i28 += slots.D();
            }
        }
        n0.e1.f(i17 == c17);
        this.f333469d.f310116d = i28;
        return jz5.f0.f302826a;
    }
}
