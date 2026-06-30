package kz0;

/* loaded from: classes14.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.y f313733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.mj_template.sns.compose.widget.y yVar, yz5.a aVar, yz5.l lVar) {
        super(2);
        this.f313733d = yVar;
        this.f313734e = aVar;
        this.f313735f = lVar;
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
        com.tencent.mm.mj_template.sns.compose.widget.x4.a(this.f313733d, this.f313734e, this.f313735f, oVar, 8);
        return jz5.f0.f302826a;
    }
}
