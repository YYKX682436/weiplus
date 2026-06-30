package n0;

/* loaded from: classes14.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.d f333700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n0.d dVar, int i17) {
        super(3);
        this.f333700d = dVar;
        this.f333701e = i17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        n0.d anchor = this.f333700d;
        kotlin.jvm.internal.o.g(anchor, "anchor");
        java.lang.Object v17 = slots.v(slots.c(anchor));
        applier.i();
        applier.g(this.f333701e, v17);
        return jz5.f0.f302826a;
    }
}
