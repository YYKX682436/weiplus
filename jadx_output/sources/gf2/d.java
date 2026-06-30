package gf2;

/* loaded from: classes.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f271270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271271e;

    public d(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView) {
        this.f271270d = k0Var;
        this.f271271e = anchorMilestoneShareView;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f271270d.o(null);
        g4Var.clear();
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271271e;
        g4Var.j(0, anchorMilestoneShareView.getContext().getResources().getString(com.tencent.mm.R.string.dyd), com.tencent.mm.R.raw.finder_icons_filled_share, anchorMilestoneShareView.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m, null), false);
        g4Var.j(1, anchorMilestoneShareView.getContext().getResources().getString(com.tencent.mm.R.string.dye), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, false);
        g4Var.j(2, anchorMilestoneShareView.getContext().getResources().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0, false);
    }
}
