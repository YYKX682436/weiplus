package j0;

/* loaded from: classes14.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f296620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.x1 f296621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f296622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(s1.x0 x0Var, j0.x1 x1Var, s1.o1 o1Var, int i17) {
        super(1);
        this.f296620d = x0Var;
        this.f296621e = x1Var;
        this.f296622f = o1Var;
        this.f296623g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        s1.x0 x0Var = this.f296620d;
        j0.x1 x1Var = this.f296621e;
        int i17 = x1Var.f296634e;
        g2.r0 r0Var = x1Var.f296635f;
        j0.d5 d5Var = (j0.d5) x1Var.f296636g.invoke();
        a2.k1 k1Var = d5Var != null ? d5Var.f296265a : null;
        boolean z17 = this.f296620d.getLayoutDirection() == p2.s.Rtl;
        s1.o1 o1Var = this.f296622f;
        d1.g a17 = j0.r4.a(x0Var, i17, r0Var, k1Var, z17, o1Var.f402050d);
        b0.y1 y1Var = b0.y1.Horizontal;
        int i18 = o1Var.f402050d;
        int i19 = this.f296623g;
        j0.u4 u4Var = x1Var.f296633d;
        u4Var.b(y1Var, a17, i19, i18);
        s1.n1.e(layout, this.f296622f, a06.d.b(-u4Var.a()), 0, 0.0f, 4, null);
        return jz5.f0.f302826a;
    }
}
