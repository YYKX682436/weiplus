package ey2;

/* loaded from: classes2.dex */
public final class i1 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ey2.k1 f257393g;

    public i1(ey2.k1 k1Var) {
        this.f257393g = k1Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        ec2.f fVar;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar2 = (ec2.f) ev6;
            long j17 = fVar2.f250965j;
            ey2.k1 k1Var = this.f257393g;
            ey2.j1 j1Var = (ey2.j1) k1Var.f257417d.get(java.lang.Long.valueOf(j17));
            if (j1Var == null) {
                j1Var = new ey2.j1(0, 0L, 0, 0L, null, null, 63, null);
            }
            int i17 = fVar2.f250959d;
            if (i17 == 3) {
                if (j1Var.f257406e == null && (fVar = j1Var.f257407f) != null) {
                    j1Var.f257403b += ev6.f260935b - fVar.f260935b;
                }
                j1Var.f257402a = fVar2.f250964i;
                j1Var.f257404c = fVar2.f250963h;
                j1Var.f257407f = fVar2;
            } else if (i17 == 10) {
                j1Var.f257405d = ev6.f260934a;
            }
            if (i17 == 10 || i17 == 11 || i17 == 6 || i17 == 9) {
                j1Var.f257406e = fVar2;
            } else {
                j1Var.f257406e = null;
            }
            k1Var.f257417d.put(java.lang.Long.valueOf(j17), j1Var);
            yz5.l lVar = (yz5.l) k1Var.f257418e.get(java.lang.Long.valueOf(j17));
            if (lVar != null) {
                lVar.invoke(j1Var);
            }
        }
    }
}
