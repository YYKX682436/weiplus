package hr3;

/* loaded from: classes9.dex */
public class y5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f284203d;

    public y5(hr3.t6 t6Var) {
        this.f284203d = t6Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        hr3.t6 t6Var = this.f284203d;
        qk.o oVar = t6Var.f284005g;
        if (oVar != null && oVar.I0()) {
            g4Var.a(1, com.tencent.mm.R.string.bgy);
            g4Var.a(4, com.tencent.mm.R.string.bcm);
            g4Var.a(5, com.tencent.mm.R.string.bbi);
            return;
        }
        qk.o oVar2 = t6Var.f284005g;
        if (oVar2 != null && oVar2.G0()) {
            g4Var.a(5, com.tencent.mm.R.string.bbi);
            return;
        }
        g4Var.a(1, com.tencent.mm.R.string.bgy);
        g4Var.a(2, com.tencent.mm.R.string.bbv);
        if (!c01.e2.c0(t6Var.f284004f.d1())) {
            g4Var.a(3, com.tencent.mm.R.string.ak6);
            g4Var.a(4, com.tencent.mm.R.string.bcm);
        }
        g4Var.a(5, com.tencent.mm.R.string.bbi);
    }
}
