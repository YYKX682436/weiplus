package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class t5 implements com.tencent.mm.plugin.scanner.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f186889a;

    public t5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var) {
        this.f186889a = b5Var;
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void a(java.util.ArrayList arrayList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f186889a;
        com.tencent.mm.plugin.webview.ui.tools.b5.e(b5Var, imageQBarDataBean);
        com.tencent.mm.plugin.scanner.d0.f158718a.b(b5Var.f183943k.longValue(), z17 ? 1 : 2, arrayList, imageQBarDataBean, b5Var.f183944l.longValue(), 1, b5Var.i());
        com.tencent.mm.plugin.webview.ui.tools.b5.b(b5Var, 4, imageQBarDataBean);
        b5Var.f183933a.clear();
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void b(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f186889a;
        d0Var.b(b5Var.f183943k.longValue(), 3, arrayList, null, b5Var.f183944l.longValue(), 1, b5Var.i());
        b5Var.f183933a.clear();
        com.tencent.mm.plugin.webview.ui.tools.b5.f183927t = false;
    }
}
