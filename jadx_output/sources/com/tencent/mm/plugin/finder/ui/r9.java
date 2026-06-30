package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class r9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f129770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI f129771e;

    public r9(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI) {
        this.f129770d = k0Var;
        this.f129771e = finderLiveShareProductUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f129770d.o(null);
        g4Var.clear();
        com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI = this.f129771e;
        g4Var.j(0, finderLiveShareProductUI.getContext().getResources().getString(com.tencent.mm.R.string.lel), com.tencent.mm.R.raw.finder_icons_filled_share, finderLiveShareProductUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
    }
}
