package n0;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f333721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f333723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.Object obj, int i17, int i18) {
        super(3);
        this.f333721d = obj;
        this.f333722e = i17;
        this.f333723f = i18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        kotlin.jvm.internal.o.g((n0.e) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        int i17 = this.f333722e;
        int i18 = this.f333723f;
        if (!kotlin.jvm.internal.o.b(this.f333721d, slots.F(i17, i18))) {
            n0.e1.c("Slot table is out of sync".toString());
            throw null;
        }
        int i19 = n0.o.f333629a;
        slots.C(i18, n0.n.f333620a);
        return jz5.f0.f302826a;
    }
}
