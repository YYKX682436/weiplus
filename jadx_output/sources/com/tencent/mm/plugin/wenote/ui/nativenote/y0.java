package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class y0 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.l1 f188313a;

    public y0(com.tencent.mm.plugin.wenote.ui.nativenote.l1 l1Var) {
        this.f188313a = l1Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.wenote.ui.nativenote.l1 l1Var = this.f188313a;
        if (com.tencent.mm.ui.fj.b(l1Var.f188234d) || com.tencent.mm.ui.bk.z(l1Var.f188234d.getTaskId())) {
            g4Var.g(1, l1Var.f188234d.getString(com.tencent.mm.R.string.f493412k26), com.tencent.mm.R.raw.icons_outlined_merge);
        } else {
            g4Var.g(1, l1Var.f188234d.getString(com.tencent.mm.R.string.k2b), com.tencent.mm.R.raw.icons_outlined_sperated);
        }
    }
}
