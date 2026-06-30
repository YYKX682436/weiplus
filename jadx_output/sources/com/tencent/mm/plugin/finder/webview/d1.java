package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class d1 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136860d;

    public d1(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136860d = n1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136860d;
        n1Var.b(5, null);
        if (n1Var.f136901e == null || n1Var.f().getInvoke() == null) {
            return;
        }
        try {
            n1Var.f136897a.clear();
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) n1Var.f136903g).n();
            com.tencent.mm.plugin.finder.webview.n1.a(n1Var, n1Var.f136901e.f286196c);
            n1Var.f136901e.b();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "cancel capture failed");
        }
    }
}
