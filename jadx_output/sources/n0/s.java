package n0;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f333694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f333695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f333696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yz5.a aVar, n0.d dVar, int i17) {
        super(3);
        this.f333694d = aVar;
        this.f333695e = dVar;
        this.f333696f = i17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        java.lang.Object invoke = this.f333694d.invoke();
        n0.d anchor = this.f333695e;
        kotlin.jvm.internal.o.g(anchor, "anchor");
        slots.L(slots.c(anchor), invoke);
        applier.f(this.f333696f, invoke);
        applier.h(invoke);
        return jz5.f0.f302826a;
    }
}
