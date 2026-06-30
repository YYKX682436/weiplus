package j0;

/* loaded from: classes14.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f296630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(g2.g0 g0Var, j0.c5 c5Var, k0.y0 y0Var) {
        super(1);
        this.f296630d = g0Var;
        this.f296631e = c5Var;
        this.f296632f = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.z it = (s1.z) obj;
        kotlin.jvm.internal.o.g(it, "it");
        g2.g0 g0Var = this.f296630d;
        j0.c5 c5Var = this.f296631e;
        if (g0Var != null) {
            c5Var.f296238f = it;
            j0.v1 a17 = c5Var.a();
            j0.v1 v1Var = j0.v1.Selection;
            k0.y0 y0Var = this.f296632f;
            if (a17 == v1Var) {
                if (c5Var.f296241i) {
                    y0Var.n();
                } else {
                    y0Var.k();
                }
                boolean b17 = k0.c1.b(y0Var, true);
                ((n0.q4) c5Var.f296242j).setValue(java.lang.Boolean.valueOf(b17));
                boolean b18 = k0.c1.b(y0Var, false);
                ((n0.q4) c5Var.f296243k).setValue(java.lang.Boolean.valueOf(b18));
            } else if (c5Var.a() == j0.v1.Cursor) {
                boolean b19 = k0.c1.b(y0Var, true);
                ((n0.q4) c5Var.f296244l).setValue(java.lang.Boolean.valueOf(b19));
            }
        }
        j0.d5 d5Var = c5Var.f296239g;
        if (d5Var != null) {
            d5Var.f296266b = it;
        }
        return jz5.f0.f302826a;
    }
}
