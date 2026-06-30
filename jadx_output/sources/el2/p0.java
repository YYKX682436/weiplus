package el2;

/* loaded from: classes3.dex */
public final class p0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f253886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundedCornerFrameLayout f253887e;

    public p0(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f253886d = k0Var;
        this.f253887e = roundedCornerFrameLayout;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f253886d;
        k0Var.o(null);
        k0Var.o(this.f253887e);
    }
}
