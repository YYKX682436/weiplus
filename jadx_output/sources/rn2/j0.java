package rn2;

/* loaded from: classes.dex */
public final class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f397771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundCornerConstraintLayout f397772e;

    public j0(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout) {
        this.f397771d = k0Var;
        this.f397772e = roundCornerConstraintLayout;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f397771d;
        k0Var.o(null);
        k0Var.o(this.f397772e);
    }
}
