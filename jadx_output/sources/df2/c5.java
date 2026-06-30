package df2;

/* loaded from: classes3.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d5 f229858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f229859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(df2.d5 d5Var, r45.tm1 tm1Var) {
        super(0);
        this.f229858d = d5Var;
        this.f229859e = tm1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.d5 d5Var = this.f229858d;
        kotlinx.coroutines.r2 r2Var = d5Var.f229943q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f327338f);
        df2.o oVar = (df2.o) d5Var.controller(df2.o.class);
        if (oVar != null) {
            com.tencent.mm.plugin.finder.live.widget.q50 q50Var = oVar.f230900q;
            if (q50Var == null) {
                q50Var = new com.tencent.mm.plugin.finder.live.widget.q50(oVar.O6(), oVar.getStore());
                oVar.f230900q = q50Var;
            }
            q50Var.f119501x1 = true;
            q50Var.V(null, false, 0);
        }
        long integer = this.f229859e.getInteger(2);
        if (integer > 0) {
            df2.d5 d5Var2 = this.f229858d;
            d5Var2.f229943q = com.tencent.mm.plugin.finder.live.util.y.o(d5Var2, null, null, new df2.b5(integer, d5Var2, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
