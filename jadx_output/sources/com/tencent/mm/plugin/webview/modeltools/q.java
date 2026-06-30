package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class q implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.n f183336a;

    public q(com.tencent.mm.plugin.webview.modeltools.n nVar) {
        this.f183336a = nVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        com.tencent.mm.plugin.webview.modeltools.n nVar = this.f183336a;
        nVar.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = nVar.f183328g;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        nVar.f183328g.u();
        nVar.f183328g = null;
    }
}
