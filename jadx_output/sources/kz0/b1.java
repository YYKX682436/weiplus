package kz0;

/* loaded from: classes5.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f313662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f313663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t0 f313665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313666h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313667i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(boolean z17, ty0.b1 b1Var, yz5.l lVar, com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var, n0.v2 v2Var, n0.v2 v2Var2) {
        super(3);
        this.f313662d = z17;
        this.f313663e = b1Var;
        this.f313664f = lVar;
        this.f313665g = t0Var;
        this.f313666h = v2Var;
        this.f313667i = v2Var2;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        d0.l0 MusicSelectorExpand = (d0.l0) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(MusicSelectorExpand, "$this$MusicSelectorExpand");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(MusicSelectorExpand) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        if (this.f313662d) {
            wy0.o.a(MusicSelectorExpand, new kz0.a1(this.f313663e, this.f313664f, this.f313665g, this.f313666h, this.f313667i), oVar, intValue & 14);
        }
        return jz5.f0.f302826a;
    }
}
