package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class r5 implements com.tencent.mm.plugin.scanner.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.s5 f186809a;

    public r5(com.tencent.mm.plugin.webview.ui.tools.s5 s5Var) {
        this.f186809a = s5Var;
    }

    @Override // com.tencent.mm.plugin.scanner.b0
    public void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        com.tencent.mm.plugin.webview.ui.tools.s5 s5Var = this.f186809a;
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = s5Var.f186840d;
        byte[] bArr = com.tencent.mm.plugin.webview.ui.tools.b5.f183925r;
        b5Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "showMultiCodeMaskView:" + arrayList2.size());
        com.tencent.mm.plugin.scanner.MultiCodeMaskView d17 = b5Var.f183947o.d();
        if (d17 != null) {
            d17.c(b5Var.i(), arrayList3, arrayList, arrayList2, b5Var.l().getWindow().getDecorView().getMeasuredHeight());
            d17.setMMultiCodeMaskViewListener(new com.tencent.mm.plugin.webview.ui.tools.t5(b5Var));
        }
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        d0Var.d(s5Var.f186840d.f183943k.longValue(), arrayList3.size(), arrayList.size(), 3, s5Var.f186840d.f183947o.getController().f181964y);
        if (arrayList.size() > 1) {
            d0Var.b(s5Var.f186840d.f183943k.longValue(), 11, arrayList3, null, s5Var.f186840d.f183944l.longValue(), 1, s5Var.f186840d.i());
        }
    }

    @Override // com.tencent.mm.plugin.scanner.b0
    public void b(com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.webview.ui.tools.s5 s5Var = this.f186809a;
        com.tencent.mm.plugin.webview.ui.tools.b5.e(s5Var.f186840d, imageQBarDataBean);
        com.tencent.mm.plugin.scanner.d0.f158718a.b(s5Var.f186840d.f183943k.longValue(), 1, arrayList, imageQBarDataBean, s5Var.f186840d.f183944l.longValue(), 1, s5Var.f186840d.i());
        com.tencent.mm.plugin.webview.ui.tools.b5.b(s5Var.f186840d, 4, imageQBarDataBean);
        s5Var.f186840d.f183933a.clear();
    }
}
