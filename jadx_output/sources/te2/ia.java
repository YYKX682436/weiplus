package te2;

/* loaded from: classes.dex */
public final class ia implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f418119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418120e;

    public ia(com.tencent.mm.ui.widget.dialog.k0 k0Var, te2.hc hcVar) {
        this.f418119d = k0Var;
        this.f418120e = hcVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f418119d.o(null);
        g4Var.clear();
        te2.hc hcVar = this.f418120e;
        g4Var.j(0, hcVar.getContext().getResources().getString(com.tencent.mm.R.string.dyd), com.tencent.mm.R.raw.finder_icons_filled_share, hcVar.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
        g4Var.j(1, hcVar.getContext().getResources().getString(com.tencent.mm.R.string.dye), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, false);
        g4Var.j(2, hcVar.getString(com.tencent.mm.R.string.dat), com.tencent.mm.R.raw.icons_filled_download, hcVar.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
        g4Var.j(3, hcVar.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0, false);
    }
}
