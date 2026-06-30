package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class s9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI f129798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f129799e;

    public s9(com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI, r45.zc4 zc4Var) {
        this.f129798d = finderLiveShareProductUI;
        this.f129799e = zc4Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI = this.f129798d;
        g4Var.j(1, finderLiveShareProductUI.getContext().getResources().getString(com.tencent.mm.R.string.loo), com.tencent.mm.R.raw.icons_outlined_qr_code, finderLiveShareProductUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478712f3), false);
        r45.zc4 zc4Var = this.f129799e;
        if (zc4Var.getBoolean(10)) {
            g4Var.j(2, finderLiveShareProductUI.getContext().getResources().getString(com.tencent.mm.R.string.leg), com.tencent.mm.R.raw.icons_outlined_link, finderLiveShareProductUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478712f3), false);
        }
        if (zc4Var.getBoolean(11)) {
            g4Var.j(3, finderLiveShareProductUI.getContext().getResources().getString(com.tencent.mm.R.string.lon), com.tencent.mm.R.raw.icons_outlined_exclamation_mark_triangle, finderLiveShareProductUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478712f3), false);
        }
    }
}
