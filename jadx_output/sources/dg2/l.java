package dg2;

/* loaded from: classes2.dex */
public final class l implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg2.m f232304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundedCornerFrameLayout f232305e;

    public l(dg2.m mVar, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f232304d = mVar;
        this.f232305e = roundedCornerFrameLayout;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        dg2.m mVar = this.f232304d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = mVar.f232313h;
        if (k0Var != null) {
            k0Var.o(null);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = mVar.f232313h;
        if (k0Var2 != null) {
            k0Var2.o(this.f232305e);
        }
    }
}
