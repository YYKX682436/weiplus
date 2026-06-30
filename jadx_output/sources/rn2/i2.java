package rn2;

/* loaded from: classes3.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(rn2.t2 t2Var) {
        super(2);
        this.f397767d = t2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rn2.b bVar = (rn2.b) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        rn2.t2 t2Var = this.f397767d;
        if (bVar != null) {
            rn2.f fVar = t2Var.f397854f;
            if (fVar != null) {
                ((rn2.c1) fVar).A(bVar);
            }
            t2Var.q(bVar);
            int i17 = bVar.f397646c;
            if (i17 == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327594g, "");
            } else if (i17 == 2) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327596i, "");
            } else if (i17 == 3) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327595h, "");
            } else if (i17 == 5) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327604t, "");
            }
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = t2Var.K;
        if (z2Var != null) {
            z2Var.B();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateViewCallback", "chooserLotteryType " + bVar + ", pos:" + intValue);
        return jz5.f0.f302826a;
    }
}
