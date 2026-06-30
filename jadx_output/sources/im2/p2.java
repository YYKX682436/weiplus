package im2;

/* loaded from: classes3.dex */
public final class p2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d32 f292484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292485e;

    public p2(r45.d32 d32Var, im2.z3 z3Var, int i17, int i18) {
        this.f292484d = d32Var;
        this.f292485e = z3Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        r45.d32 d32Var = this.f292484d;
        im2.z3 z3Var = this.f292485e;
        if (d32Var != null) {
            db5.h4 h4Var = new db5.h4(z3Var.getContext(), 0, 0);
            h4Var.f228376t = com.tencent.mm.R.string.oxv;
            g4Var.v(h4Var);
        }
        db5.h4 h4Var2 = new db5.h4(z3Var.getContext(), 1, 0);
        int color = z3Var.getActivity().getResources().getColor(com.tencent.mm.R.color.Red_100);
        h4Var2.f228376t = com.tencent.mm.R.string.oxw;
        h4Var2.f228370n = color;
        g4Var.v(h4Var2);
    }
}
