package te2;

/* loaded from: classes.dex */
public final class p4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f418301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418302e;

    public p4(com.tencent.mm.ui.widget.dialog.k0 k0Var, te2.p8 p8Var) {
        this.f418301d = k0Var;
        this.f418302e = p8Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f418301d.o(null);
        g4Var.clear();
        te2.p8 p8Var = this.f418302e;
        g4Var.j(0, p8Var.getContext().getResources().getString(com.tencent.mm.R.string.dyd), com.tencent.mm.R.raw.finder_icons_filled_share, p8Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
        g4Var.j(1, p8Var.getContext().getResources().getString(com.tencent.mm.R.string.dye), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, false);
        g4Var.j(2, p8Var.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0, false);
    }
}
