package xf2;

/* loaded from: classes8.dex */
public final class i implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f454279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454280e;

    public i(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView) {
        this.f454279d = k0Var;
        this.f454280e = shellView;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f454279d.o(null);
        g4Var.clear();
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView = this.f454280e;
        g4Var.j(0, shellView.getContext().getResources().getString(com.tencent.mm.R.string.dyd), com.tencent.mm.R.raw.finder_icons_filled_share, shellView.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
        g4Var.j(1, shellView.getContext().getResources().getString(com.tencent.mm.R.string.dye), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, false);
    }
}
