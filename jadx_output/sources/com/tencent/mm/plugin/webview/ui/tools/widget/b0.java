package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class b0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.d0 f187108d;

    public b0(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var) {
        this.f187108d = d0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187108d;
        d0Var.f187146d.f286174b = 1;
        com.tencent.mm.ui.widget.dialog.c1 c1Var = d0Var.f187151i;
        if (c1Var != null) {
            c1Var.onDismiss();
        }
    }
}
