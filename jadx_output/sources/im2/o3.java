package im2;

/* loaded from: classes3.dex */
public final class o3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292464d;

    public o3(im2.z3 z3Var) {
        this.f292464d = z3Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        im2.z3 z3Var = this.f292464d;
        z3Var.getClass();
        boolean z17 = false;
        g4Var.f(0, z3Var.getString(com.tencent.mm.R.string.e0u));
        zl2.q4 q4Var = zl2.q4.f473933a;
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var != null && c1Var.f328778a5) {
            z17 = true;
        }
        if (q4Var.F(z17) && !z3Var.G1) {
            g4Var.f(z3Var.W1, z3Var.getString(com.tencent.mm.R.string.e0w));
        }
        if (z3Var.S6()) {
            g4Var.f(z3Var.X1, z3Var.getString(com.tencent.mm.R.string.e0v));
        }
    }
}
