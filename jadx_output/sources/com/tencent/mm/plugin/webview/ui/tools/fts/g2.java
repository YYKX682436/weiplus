package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184419d;

    public g2(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f184419d = fTSSOSHomeWebViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.R5;
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184419d;
        if (fTSSOSHomeWebViewUI.f183853r3 == -3) {
            fTSSOSHomeWebViewUI.hideVKB();
            fTSSOSHomeWebViewUI.f184297l5.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.f2(this), 300L);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.xa(fTSSOSHomeWebViewUI);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
