package gx0;

/* loaded from: classes5.dex */
public final class tc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.k0 f276991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.dd f276992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(ex0.k0 k0Var, gx0.dd ddVar) {
        super(1);
        this.f276991d = k0Var;
        this.f276992e = ddVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.GeographicInfo b17 = by0.h.b((r45.ze2) obj);
        ex0.k0 k0Var = this.f276991d;
        k0Var.A(b17);
        this.f276992e.w7(k0Var.f257167a);
        return jz5.f0.f302826a;
    }
}
