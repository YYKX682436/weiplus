package n0;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f333709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f333711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.Object obj, int i17, int i18) {
        super(3);
        this.f333709d = obj;
        this.f333710e = i17;
        this.f333711f = i18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        n0.d4 rememberManager = (n0.d4) obj3;
        kotlin.jvm.internal.o.g((n0.e) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g(rememberManager, "rememberManager");
        int i17 = this.f333710e;
        int i18 = this.f333711f;
        java.lang.Object F = slots.F(i17, i18);
        java.lang.Object obj4 = this.f333709d;
        if (!kotlin.jvm.internal.o.b(obj4, F)) {
            n0.e1.c("Slot table is out of sync".toString());
            throw null;
        }
        ((n0.i1) rememberManager).c((n0.e4) obj4);
        int i19 = n0.o.f333629a;
        slots.C(i18, n0.n.f333620a);
        return jz5.f0.f302826a;
    }
}
