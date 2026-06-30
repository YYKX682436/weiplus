package id2;

/* loaded from: classes.dex */
public final class r1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f290778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundCornerConstraintLayout f290779e;

    public r1(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout) {
        this.f290778d = k0Var;
        this.f290779e = roundCornerConstraintLayout;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f290778d;
        k0Var.o(null);
        k0Var.o(this.f290779e);
    }
}
