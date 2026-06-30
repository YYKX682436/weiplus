package qy0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f367633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f367634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f367635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qy0.d0 d0Var, int i17, dz0.l lVar, java.util.List list) {
        super(2);
        this.f367632d = d0Var;
        this.f367633e = i17;
        this.f367634f = lVar;
        this.f367635g = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        tz0.a0.a(u0.j.b(oVar, -1465541417, true, new qy0.o(this.f367632d, this.f367633e, this.f367634f, this.f367635g)), oVar, 6);
        return jz5.f0.f302826a;
    }
}
