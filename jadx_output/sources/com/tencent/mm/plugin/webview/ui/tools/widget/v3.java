package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class v3 extends com.tencent.mm.plugin.webview.ui.tools.widget.x3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.w3 f187581e;

    public v3(com.tencent.mm.plugin.webview.ui.tools.widget.w3 w3Var) {
        this.f187581e = w3Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.ui.tools.widget.x1 x1Var = this.f187581e.C;
        if (x1Var instanceof com.tencent.mm.plugin.webview.ui.tools.widget.y1) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.y1) x1Var).b(bundle);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.ui.tools.widget.x1 x1Var = this.f187581e.C;
        if (x1Var != null) {
            return x1Var.callback(i17, bundle);
        }
        return false;
    }
}
