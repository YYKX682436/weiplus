package k0;

/* loaded from: classes14.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f302863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l2.e f302864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f302865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f302866g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(boolean z17, l2.e eVar, k0.y0 y0Var, int i17) {
        super(2);
        this.f302863d = z17;
        this.f302864e = eVar;
        this.f302865f = y0Var;
        this.f302866g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f302866g | 1;
        l2.e eVar = this.f302864e;
        k0.y0 y0Var = this.f302865f;
        k0.c1.a(this.f302863d, eVar, y0Var, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
