package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class q5 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f186770d;

    public q5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var) {
        this.f186770d = b5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f186770d;
        com.tencent.mm.plugin.webview.ui.tools.b5.b(b5Var, 5, null);
        if (b5Var.f183937e != null) {
            try {
                b5Var.f183933a.clear();
                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) b5Var.f183939g).n();
                com.tencent.mm.plugin.webview.ui.tools.b5.d(b5Var, b5Var.f183937e.f286196c);
                b5Var.f183937e.b();
                if (com.tencent.mm.plugin.webview.ui.tools.b5.f183927t) {
                    return;
                }
                com.tencent.mm.plugin.webview.ui.tools.b5.f183925r = null;
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "cancel capture failed");
            }
        }
    }
}
