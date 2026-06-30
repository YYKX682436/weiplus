package pe3;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f353679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f353680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(pe3.g0 g0Var, java.util.List list, int i17) {
        super(2);
        this.f353678d = g0Var;
        this.f353679e = list;
        this.f353680f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f353680f | 1;
        pe3.g0.O6(this.f353678d, this.f353679e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
