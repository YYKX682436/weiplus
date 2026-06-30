package i1;

/* loaded from: classes14.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1.o1 f287076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f287077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f287078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f287079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(i1.o1 o1Var, java.util.Map map, int i17, int i18) {
        super(2);
        this.f287076d = o1Var;
        this.f287077e = map;
        this.f287078f = i17;
        this.f287079g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f287078f | 1;
        i1.c2.a(this.f287076d, this.f287077e, (n0.o) obj, i17, this.f287079g);
        return jz5.f0.f302826a;
    }
}
