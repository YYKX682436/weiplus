package ni2;

/* loaded from: classes10.dex */
public final class m1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.r1 f337385d;

    public m1(ni2.r1 r1Var) {
        this.f337385d = r1Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        ni2.r1 r1Var = this.f337385d;
        dk2.u4 u4Var = ((mm2.o4) r1Var.f337452b.a(mm2.o4.class)).Z;
        boolean z17 = false;
        if (u4Var != null && u4Var.f234160g == 2) {
            z17 = true;
        }
        if (!z17) {
            g4Var.f(1, r1Var.f337451a.getResources().getString(com.tencent.mm.R.string.jz6));
        }
        if (((mm2.c1) r1Var.f337452b.a(mm2.c1.class)).L && r1Var.f337459i) {
            g4Var.f(2, r1Var.f337451a.getResources().getString(com.tencent.mm.R.string.lmr));
        }
    }
}
