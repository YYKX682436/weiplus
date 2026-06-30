package ni2;

/* loaded from: classes10.dex */
public final class l2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.p2 f337374d;

    public l2(ni2.p2 p2Var) {
        this.f337374d = p2Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        ni2.p2 p2Var = this.f337374d;
        g4Var.f(1, p2Var.f337415a.getResources().getString(com.tencent.mm.R.string.jz6));
        if (zl2.q4.f473933a.E()) {
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Y1).getValue()).r()).intValue() == 1 && ((mm2.o4) p2Var.f337416b.a(mm2.o4.class)).Z == null) {
                g4Var.f(2, p2Var.f337415a.getResources().getString(com.tencent.mm.R.string.f491595df2));
            }
        }
    }
}
