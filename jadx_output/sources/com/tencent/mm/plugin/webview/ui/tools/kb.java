package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes12.dex */
public class kb implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.mb f185616a;

    public kb(com.tencent.mm.plugin.webview.ui.tools.mb mbVar) {
        this.f185616a = mbVar;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.webview.ui.tools.mb mbVar = this.f185616a;
        if (com.tencent.mm.ui.fj.b(mbVar.f185700d) || com.tencent.mm.ui.bk.z(mbVar.f185700d.getTaskId())) {
            g4Var.g(1, mbVar.f185700d.getString(com.tencent.mm.R.string.f493412k26), com.tencent.mm.R.raw.icons_outlined_merge);
        } else {
            g4Var.g(1, mbVar.f185700d.getString(com.tencent.mm.R.string.k2b), com.tencent.mm.R.raw.icons_outlined_sperated);
        }
    }
}
