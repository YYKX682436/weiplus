package df2;

/* loaded from: classes3.dex */
public final class s7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f231295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f231296e;

    public s7(com.tencent.mm.ui.widget.dialog.k0 k0Var, df2.s8 s8Var) {
        this.f231295d = k0Var;
        this.f231296e = s8Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f231295d.o(null);
        g4Var.clear();
        df2.s8 s8Var = this.f231296e;
        g4Var.d(s8Var.f231313x0, s8Var.O6().getResources().getColor(com.tencent.mm.R.color.f478532ac), s8Var.O6().getResources().getString(com.tencent.mm.R.string.dhx));
    }
}
