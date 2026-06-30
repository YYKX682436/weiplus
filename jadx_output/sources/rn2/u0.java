package rn2;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f397882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ek2.t0 f397883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f397884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f397885g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.ui.widget.dialog.u3 u3Var, ek2.t0 t0Var, com.tencent.mm.modelbase.f fVar, rn2.c1 c1Var) {
        super(0);
        this.f397882d = u3Var;
        this.f397883e = t0Var;
        this.f397884f = fVar;
        this.f397885g = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.j0 j0Var;
        this.f397882d.dismiss();
        int i17 = this.f397883e.f253536d;
        int i18 = i17 > 0 ? i17 / 60 : 0;
        com.tencent.mm.modelbase.f fVar = this.f397884f;
        int i19 = fVar.f70615a;
        rn2.c1 c1Var = this.f397885g;
        if (i19 == 0 && fVar.f70616b == 0) {
            gk2.e eVar = gk2.e.f272471n;
            if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).qj(3);
            } else {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327598n, c1Var.f397668h + '@' + c1Var.f397670m + ';' + i18 + ';' + c1Var.f397671n + ';' + c1Var.f397672o);
            }
            gk2.e eVar2 = gk2.e.f272471n;
            if (eVar2 != null) {
                pm0.v.X(new on2.m2((on2.z2) eVar2.a(on2.z2.class)));
            }
            r45.cz1 cz1Var = (r45.cz1) ((r45.go1) fVar.f70618d).getCustom(1);
            if (cz1Var != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(cz1Var);
                gk2.e eVar3 = gk2.e.f272471n;
                if (eVar3 != null) {
                    ((on2.z2) eVar3.a(on2.z2.class)).b7(linkedList, false);
                }
                gk2.e eVar4 = gk2.e.f272471n;
                if (eVar4 != null && (j0Var = ((on2.z2) eVar4.a(on2.z2.class)).f347095p) != null) {
                    j0Var.postValue(java.lang.Boolean.TRUE);
                }
            }
            rn2.g gVar = c1Var.f397667g;
            if (gVar != null) {
                ((rn2.t2) gVar).destroy();
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = c1Var.f397664d;
            appCompatActivity.setResult(-1, appCompatActivity.getIntent());
            appCompatActivity.finish();
        } else {
            rn2.g gVar2 = c1Var.f397667g;
            if (gVar2 != null) {
                ((rn2.t2) gVar2).s(i19, fVar.f70616b, fVar.f70617c, (r45.go1) fVar.f70618d);
            }
        }
        return jz5.f0.f302826a;
    }
}
