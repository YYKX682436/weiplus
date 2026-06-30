package qn2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f365076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.n f365077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.modelbase.f fVar, qn2.n nVar) {
        super(0);
        this.f365076d = fVar;
        this.f365077e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        com.tencent.mm.modelbase.f fVar = this.f365076d;
        int i17 = fVar.f70615a;
        qn2.n nVar = this.f365077e;
        if (i17 == 0 && fVar.f70616b == 0) {
            if (((r45.cz1) ((r45.go1) fVar.f70618d).getCustom(1)) == null) {
                pm0.v.X(new on2.l2((on2.z2) nVar.P0(on2.z2.class)));
            } else {
                ((on2.z2) nVar.P0(on2.z2.class)).g7((r45.cz1) ((r45.go1) fVar.f70618d).getCustom(1));
            }
            qo0.c.a(nVar.A, qo0.b.f365378l3, null, 2, null);
            string = nVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.doy);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (nVar.A.getLiveRole() == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327603s, "");
            }
        } else {
            string = nVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.dox);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        db5.t7.makeText(nVar.f365323d.getContext(), string, 0).show();
        return jz5.f0.f302826a;
    }
}
