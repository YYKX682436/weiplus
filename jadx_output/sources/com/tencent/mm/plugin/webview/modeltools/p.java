package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class p implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.n f183334d;

    public p(com.tencent.mm.plugin.webview.modeltools.n nVar) {
        this.f183334d = nVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.webview.modeltools.n nVar = this.f183334d;
        nVar.a(null);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = nVar.f183328g;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        nVar.f183328g.u();
        nVar.f183328g = null;
    }
}
