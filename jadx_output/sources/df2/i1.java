package df2;

/* loaded from: classes3.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k1 f230375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f230376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f230377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(df2.k1 k1Var, yl2.g1 g1Var, r45.tm1 tm1Var) {
        super(0);
        this.f230375d = k1Var;
        this.f230376e = g1Var;
        this.f230377f = tm1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        df2.k1 k1Var = this.f230375d;
        k1Var.o7(2);
        yl2.g1 g1Var = this.f230376e;
        k1Var.n7(2, k1Var.f230537p, java.lang.Long.valueOf(g1Var.f463010c));
        r45.tm1 tm1Var = this.f230377f;
        long integer = tm1Var.getInteger(2);
        kotlinx.coroutines.r2 r2Var = k1Var.f230540s;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (integer > 0) {
            df2.k1 k1Var2 = this.f230375d;
            k1Var2.f230540s = com.tencent.mm.plugin.finder.live.util.y.o(k1Var2, null, null, new df2.h1(integer, k1Var2, null), 3, null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(k1Var.O6()))) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_router_to_profile", false);
            intent.putExtra("key_create_scene", 3);
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.content.Context O6 = k1Var.O6();
            com.tencent.mm.ui.MMActivity N6 = k1Var.N6();
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).qj(O6, N6 != null ? N6.getIntent() : null);
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
            if (I1 != null && I1.v0()) {
                zl2.q4.f473933a.Q();
            } else {
                r45.sm1 sm1Var = (r45.sm1) tm1Var.getCustom(8);
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                com.tencent.mm.plugin.finder.live.util.y.o(k1Var, kotlinx.coroutines.internal.b0.f310484a, null, new df2.e1(sm1Var, g1Var, k1Var, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
