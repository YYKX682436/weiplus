package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mj implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135175a;

    public mj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135175a = blVar;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135175a;
        if (com.tencent.mm.ui.fj.b(blVar.getActivity()) || com.tencent.mm.ui.bk.z(blVar.getActivity().getTaskId())) {
            g4Var.g(1, blVar.getString(com.tencent.mm.R.string.f493412k26), com.tencent.mm.R.raw.icons_outlined_merge);
        } else {
            g4Var.g(1, blVar.getString(com.tencent.mm.R.string.k2b), com.tencent.mm.R.raw.icons_outlined_sperated);
        }
        g4Var.g(2, blVar.getString(com.tencent.mm.R.string.k27), com.tencent.mm.R.raw.finder_icon_outlined_mini_window_2);
    }
}
