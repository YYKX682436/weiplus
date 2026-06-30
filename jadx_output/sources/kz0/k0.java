package kz0;

/* loaded from: classes14.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f313761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313764g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f313765h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f313766i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(boolean z17, n0.v2 v2Var, yz5.a aVar, yz5.a aVar2, ty0.b1 b1Var, com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var) {
        super(2);
        this.f313761d = z17;
        this.f313762e = v2Var;
        this.f313763f = aVar;
        this.f313764g = aVar2;
        this.f313765h = b1Var;
        this.f313766i = m7Var;
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
        y.q.c(!kz0.k1.c(this.f313762e) && this.f313761d, null, y.x0.b(null, 0.0f, 3, null), y.x0.c(null, 0.0f, 3, null), null, u0.j.b(oVar, 1738943129, true, new kz0.z(this.f313763f, this.f313764g, this.f313765h, this.f313766i)), oVar, 200064, 18);
        return jz5.f0.f302826a;
    }
}
