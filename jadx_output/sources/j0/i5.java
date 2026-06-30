package j0;

/* loaded from: classes14.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f296350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.j5 f296351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f296352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296353g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(s1.x0 x0Var, j0.j5 j5Var, s1.o1 o1Var, int i17) {
        super(1);
        this.f296350d = x0Var;
        this.f296351e = j5Var;
        this.f296352f = o1Var;
        this.f296353g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        s1.x0 x0Var = this.f296350d;
        j0.j5 j5Var = this.f296351e;
        int i17 = j5Var.f296394e;
        g2.r0 r0Var = j5Var.f296395f;
        j0.d5 d5Var = (j0.d5) j5Var.f296396g.invoke();
        a2.k1 k1Var = d5Var != null ? d5Var.f296265a : null;
        s1.o1 o1Var = this.f296352f;
        d1.g a17 = j0.r4.a(x0Var, i17, r0Var, k1Var, false, o1Var.f402050d);
        b0.y1 y1Var = b0.y1.Vertical;
        int i18 = o1Var.f402051e;
        int i19 = this.f296353g;
        j0.u4 u4Var = j5Var.f296393d;
        u4Var.b(y1Var, a17, i19, i18);
        s1.n1.e(layout, this.f296352f, 0, a06.d.b(-u4Var.a()), 0.0f, 4, null);
        return jz5.f0.f302826a;
    }
}
