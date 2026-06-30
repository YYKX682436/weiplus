package e22;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f246663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f246664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f246665f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f246666g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e22.d1 d1Var, yz5.l lVar, int i17, int i18) {
        super(2);
        this.f246663d = d1Var;
        this.f246664e = lVar;
        this.f246665f = i17;
        this.f246666g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f246665f | 1;
        e22.a1.c(this.f246663d, this.f246664e, (n0.o) obj, i17, this.f246666g);
        return jz5.f0.f302826a;
    }
}
