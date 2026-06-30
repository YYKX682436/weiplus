package im2;

/* loaded from: classes3.dex */
public final class r2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292516d;

    public r2(im2.z3 z3Var) {
        this.f292516d = z3Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        im2.z3 z3Var = this.f292516d;
        for (r45.d32 d32Var : z3Var.E1) {
            int i17 = d32Var.f372032d;
            java.lang.String str = null;
            java.lang.String string = i17 != 1 ? i17 != 2 ? null : z3Var.getContext().getResources().getString(com.tencent.mm.R.string.oxx) : z3Var.getContext().getResources().getString(com.tencent.mm.R.string.oxs);
            if (d32Var.f372032d == 1) {
                str = z3Var.getContext().getResources().getString(com.tencent.mm.R.string.oxt);
            }
            db5.h4 h4Var = new db5.h4(z3Var.getContext(), d32Var.f372032d, 0);
            h4Var.f228368i = string;
            h4Var.f228373q = str;
            g4Var.v(h4Var);
        }
    }
}
