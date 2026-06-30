package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class x0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI f187637a;

    public x0(com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI) {
        this.f187637a = qRCodeIntroductionWebViewUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI = this.f187637a;
        if (i17 == 0) {
            qRCodeIntroductionWebViewUI.f183844p0.j0(null, 0);
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(qRCodeIntroductionWebViewUI.F7()));
        com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI2 = this.f187637a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(qRCodeIntroductionWebViewUI2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/QRCodeIntroductionWebViewUI$3", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        qRCodeIntroductionWebViewUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(qRCodeIntroductionWebViewUI2, "com/tencent/mm/plugin/webview/ui/tools/QRCodeIntroductionWebViewUI$3", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
