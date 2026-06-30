package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class l7 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f185640d;

    public l7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f185640d = c6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f185640d;
        c6Var.f184052i.f286174b = 1;
        if (!c6Var.c().j8() || c6Var.c().f183844p0 == null) {
            return;
        }
        c6Var.c().f183844p0.u0(true, false);
    }
}
