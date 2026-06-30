package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class e1 implements com.tencent.mm.plugin.scanner.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.f1 f136864a;

    public e1(com.tencent.mm.plugin.finder.webview.f1 f1Var) {
        this.f136864a = f1Var;
    }

    @Override // com.tencent.mm.plugin.scanner.b0
    public void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        com.tencent.mm.plugin.finder.webview.f1 f1Var = this.f136864a;
        com.tencent.mm.plugin.finder.webview.n1 n1Var = f1Var.f136867d;
        com.tencent.mm.sdk.event.IListener iListener = com.tencent.mm.plugin.finder.webview.n1.f136896q;
        n1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "showMultiCodeMaskView:" + arrayList2.size());
        com.tencent.mm.plugin.scanner.MultiCodeMaskView maskView = n1Var.f().getMaskView();
        if (maskView != null) {
            maskView.c(n1Var.d(), arrayList3, arrayList, arrayList2, n1Var.f().getWindow().getDecorView().getMeasuredHeight());
            maskView.setMMultiCodeMaskViewListener(new com.tencent.mm.plugin.finder.webview.r0(n1Var));
        }
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        d0Var.d(f1Var.f136867d.f136907k.longValue(), arrayList3.size(), arrayList.size(), 3, ((com.tencent.mm.plugin.webview.core.r0) f1Var.f136867d.f().getWebViewController()).f181964y);
        if (arrayList.size() > 1) {
            d0Var.b(f1Var.f136867d.f136907k.longValue(), 11, arrayList3, null, f1Var.f136867d.f136908l.longValue(), 1, f1Var.f136867d.d());
        }
    }

    @Override // com.tencent.mm.plugin.scanner.b0
    public void b(com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, java.util.ArrayList arrayList) {
    }
}
